package de.unistuttgart.iaas.chor.instance.repetition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.chor.FlowActivityLink;
import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance;
import org.eclipse.bpel4chor.model.chor.common.LoopElementInstance;
import org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance;
import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.CLinkable;
import org.eclipse.bpel4chor.model.pbd.ExtensibleElements;
import org.eclipse.bpel4chor.model.pbd.Flow;
import org.eclipse.bpel4chor.model.pbd.ForEach;
import org.eclipse.bpel4chor.model.pbd.Invoke;
import org.eclipse.bpel4chor.model.pbd.LoopIteration;
import org.eclipse.bpel4chor.model.pbd.OnMessage;
import org.eclipse.bpel4chor.model.pbd.Pick;
import org.eclipse.bpel4chor.model.pbd.Process;
import org.eclipse.bpel4chor.model.pbd.Receive;
import org.eclipse.bpel4chor.model.pbd.Reply;
import org.eclipse.bpel4chor.model.pbd.Scope;
import org.eclipse.bpel4chor.model.pbd.Sequence;
import org.eclipse.bpel4chor.model.pbd.While;
import org.eclipse.emf.ecore.EObject;

import de.unistuttgart.iaas.chor.instance.repetition.util.Helper;
import de.unistuttgart.iaas.chor.instance.repetition.util.ProcessInstanceBuffer;
import de.unistuttgart.iaas.chor.instance.repetition.util.Result;
import de.unistuttgart.iaas.chor.instance.repetition.util.ResultEntry;

/**
 * In this class the process graph is traversed to find the start activities for
 * iteration. The assumption is that we annotate a choreography model with
 * instance information The implemented algorithm recursively traverses all
 * interconnected process models following the message links.
 * 
 * @author weissas
 * 
 */
public class RepetitionManager {

	private Map<String, Map<ExtensibleElements, List<String>>> visitedActivityInstancesPerProcess = new HashMap<String, Map<ExtensibleElements, List<String>>>();
	
	
	private Helper helper = new Helper();

	public Result determineRewindingPoints(Choreography choreography, Process startProcess, Activity initialStartActivity, Result result) {

		Map<ExtensibleElements, List<String>> visitedMap;

		if (visitedActivityInstancesPerProcess.containsKey(startProcess.getInstanceID())) {

			visitedMap = visitedActivityInstancesPerProcess.get(startProcess.getInstanceID());
			
		} else {

			visitedMap = new HashMap<ExtensibleElements, List<String>>();
			visitedActivityInstancesPerProcess.put(startProcess.getInstanceID(), visitedMap);
		}

		if (result.getRewindingPointMap().isEmpty()) {

			ArrayList<Activity> rewindingPoints = new ArrayList<Activity>();
			rewindingPoints.add(initialStartActivity);

			ResultEntry entry = new ResultEntry();
			entry.setProcessInstance(startProcess);
			entry.getActivityInstances().put(initialStartActivity, initialStartActivity.getInstanceID());
			result.getRewindingPointMap().put(startProcess.getInstanceID(), entry);

			// Initialize helper and current instance buffer
			//helper.getInstanceData(startProcess, startProcess.getId(), startProcess.getInstanceID(), true);
			helper.getInstanceData(initialStartActivity, initialStartActivity.getInstanceID(), startProcess.getInstanceID(), true);

		}

	
		Activity loopActivity = helper.loopParentOf(startProcess.getInstanceID(), initialStartActivity);

		if (loopActivity != null) {
			handleLoopActivities(choreography, startProcess.getInstanceID(), loopActivity, initialStartActivity, visitedMap, result);

		} else {
			traverseInstanceGraph(choreography, startProcess.getInstanceID(), startProcess.getActivity(), initialStartActivity, false, visitedMap, result);
		}

		return result;

	}

	private List<ExtensibleElements> determineSuccessorActivities2(List<FlowActivityLink> links, ExtensibleElements source) {

		List<ExtensibleElements> successors = new ArrayList<ExtensibleElements>();

		EObject element = source;
		EObject container = element.eContainer();

		// While there is a container the container is not a process
		if (container != null && !(container instanceof Process)) {

			if (container instanceof Flow && element instanceof ExtensibleElements) {

				if (element.eContents() != null && !element.eContents().isEmpty() && !(element instanceof Invoke) && !(element instanceof Receive) && !(element instanceof Reply)) {

					ExtensibleElements ext = (ExtensibleElements) element.eContents().get(0);

					if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
						successors.add(ext);
					} else {
						return determineSuccessorActivities2(links, ext);
					}

				} else {
					successors.addAll(helper.getTargetActivities(links, (ExtensibleElements) element));

				}

				if (!successors.isEmpty()) {
					return successors;

				}

			}

			if (container instanceof ForEach && element instanceof ExtensibleElements) {

			}

			if (!(container instanceof Flow) && element instanceof ExtensibleElements) {

				// Get the index of the element in the container
				int elementIndex = container.eContents().indexOf(element);

				// TODO: onmessage
				if (!element.eContents().isEmpty() && !(element instanceof Invoke) && !(element instanceof Receive) && !(element instanceof Reply)) {

					ExtensibleElements ext = (ExtensibleElements) element.eContents().get(0);

					if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
						successors.add(ext);
					} else {
						return determineSuccessorActivities2(links, ext);
					}

					return successors;

				}

				else if (container.eContents().size() > elementIndex + 1) {

					ExtensibleElements ext = (ExtensibleElements) container.eContents().get(elementIndex + 1);

					if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
						successors.add(ext);
					} else {
						return determineSuccessorActivities2(links, ext);
					}

					return successors;

				}

			}

			while (container != null && !(container instanceof Process)) {

				element = container;
				container = container.eContainer();
				int elementIndex = container.eContents().indexOf(element);

				if (container.eContents().size() > elementIndex + 1) {

					EObject eobj = container.eContents().get(elementIndex + 1);

					if (eobj instanceof LoopIteration) {

						Activity activity = ((LoopIteration) eobj).getActivity();

						if (activity.getState() != null && !activity.getState().equals("Activity_Dead")) {
							successors.add(activity);
						}

					} else {
						ExtensibleElements ext = (ExtensibleElements) eobj;

						if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
							successors.add((ExtensibleElements) eobj);
						} else {
							return determineSuccessorActivities2(links, (ExtensibleElements) eobj);
						}

					}
					return successors;

				}

			}

		}
		successors.clear();
		return successors;
	}

	private List<ExtensibleElements> determineSuccessorActivities(List<FlowActivityLink> links, EObject source, String processInstanceID, boolean buffer) {

		List<ExtensibleElements> successors = new ArrayList<ExtensibleElements>();

		EObject element = source;
		EObject container = element.eContainer();

		// While there is a container the container is not a process
		if (container != null && !(container instanceof Process)) {

			// TODO: handle flow
			if (container instanceof Flow && element instanceof ExtensibleElements) {

				if (element.eContents() != null && !element.eContents().isEmpty() && !(element instanceof Invoke) && !(element instanceof Receive) && !(element instanceof Reply)) {

					ExtensibleElements ext = (ExtensibleElements) element.eContents().get(0);
					ext = helper.nextInstanceData(ext, processInstanceID, buffer);

					if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
						successors.add(ext);
					} else {
						return determineSuccessorActivities(links, ext, processInstanceID, buffer);
					}

				} else {
					successors.addAll(helper.getTargetActivities(links, (ExtensibleElements) element));

				}

				if (!successors.isEmpty()) {
					return successors;

				}

			}

			if (!(container instanceof Flow) && element instanceof ExtensibleElements) {

				// Get the index of the element in the container
				int elementIndex = container.eContents().indexOf(element);

				// TODO: onmessage
				// if element is a structured element
				if (!element.eContents().isEmpty() && !(element instanceof Invoke) && !(element instanceof Receive) && !(element instanceof Reply)) {

					if (element.eContents().get(0) instanceof ExtensibleElements) {

						ExtensibleElements ext = (ExtensibleElements) element.eContents().get(0);
						ext = helper.nextInstanceData(ext, processInstanceID, buffer);

						if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
							successors.add(ext);
						}

					}

					else {
						return determineSuccessorActivities(links, element.eContents().get(0), processInstanceID, buffer);
					}

					return successors;

				}

				else if (container.eContents().size() > elementIndex + 1) {

					if (container.eContents().get(elementIndex + 1) instanceof ExtensibleElements) {

						ExtensibleElements ext = (ExtensibleElements) container.eContents().get(elementIndex + 1);
						ext = helper.nextInstanceData(ext, processInstanceID, buffer);

						if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
							successors.add(ext);
						}
					}

					else {
						return determineSuccessorActivities(links, container.eContents().get(elementIndex + 1), processInstanceID, buffer);
					}

					return successors;

				}

			}

			while (container != null && !(container instanceof Process)) {

				element = container;
				container = container.eContainer();
				int elementIndex = container.eContents().indexOf(element);

				if (container.eContents().size() > elementIndex + 1) {

					if (container.eContents().get(elementIndex + 1) instanceof ExtensibleElements) {
						ExtensibleElements ext = (ExtensibleElements) container.eContents().get(elementIndex + 1);
						ext = helper.nextInstanceData(ext, processInstanceID, buffer);

						if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
							successors.add(ext);
						}
					}

					else {
						return determineSuccessorActivities(links, container.eContents().get(elementIndex + 1), processInstanceID, buffer);
					}

					return successors;
				}

			}

		}
		successors.clear();
		return successors;
	}

	private List<ExtensibleElements> determineSuccessorActivitiesInLoop(List<FlowActivityLink> links, EObject source, String processInstanceID, boolean buffer) {

		List<ExtensibleElements> successors = new ArrayList<ExtensibleElements>();

		EObject element = source;
		EObject container = element.eContainer();

		// While there is a container the container is not a process
		if (container != null && !(container instanceof Process)) {

			// TODO: handle flow

			if (!(container instanceof Flow)) {

				// Get the index of the element in the container
				int elementIndex = container.eContents().indexOf(element);

				// TODO: onmessage
				// if element is a structured element
				if (!element.eContents().isEmpty() && !(element instanceof Invoke) && !(element instanceof Receive) && !(element instanceof Reply)) {

					if (element.eContents().get(0) instanceof ExtensibleElements) {
						ExtensibleElements ext = (ExtensibleElements) element.eContents().get(0);

						if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
							successors.add(ext);
						}
					} else {
						return determineSuccessorActivitiesInLoop(links, element.eContents().get(0), processInstanceID, buffer);
					}

					return successors;

				}

				else if (container.eContents().size() > elementIndex + 1) {

					if (container.eContents().get(elementIndex + 1) instanceof ExtensibleElements) {
						ExtensibleElements ext = (ExtensibleElements) container.eContents().get(elementIndex + 1);

						if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
							successors.add(ext);
						}
					}

					else {
						return determineSuccessorActivitiesInLoop(links, container.eContents().get(elementIndex + 1), processInstanceID, buffer);
					}

					return successors;

				}

			}

			while (container != null && !(container instanceof Process)) {

				element = container;
				container = container.eContainer();
				int elementIndex = container.eContents().indexOf(element);

				if (container.eContents().size() > elementIndex + 1) {

					if (container.eContents().get(elementIndex + 1) instanceof ExtensibleElements) {
						ExtensibleElements ext = (ExtensibleElements) container.eContents().get(elementIndex + 1);

						if (ext.getState() != null && !ext.getState().equals("Activity_Dead")) {
							successors.add(ext);
						}
					}

					else {
						return determineSuccessorActivitiesInLoop(links, container.eContents().get(elementIndex + 1), processInstanceID, buffer);
					}

					return successors;
				}

			}

		}
		successors.clear();
		return successors;
	}

	/**
	 * Method to handle the invoke activity
	 * 
	 * 
	 * @param current
	 * @param successorActivity
	 * @param choreography
	 * @param startActivityMap
	 */
	private void handleSendingActivity(String processInstanceID, ExtensibleElements current, Choreography choreography, Result result) {

		// Retrieve the message link the current element is using. The
		// invocation returns null if there is no message link defined in the
		// model
		CMessageLink cMessageLink = getMessageLinkInstance(choreography, (Activity) current);

		// if a message link was found
		if (cMessageLink != null) {

			result.addMessageLinkInstance(cMessageLink);
			Process process = determineReceivingParticipantInstance(choreography, cMessageLink, cMessageLink.getReceiveActivity());

			// Retrieve and store the receiving activity from the message link
			Activity receivingActivity = (Activity) cMessageLink.getReceiveActivity();
			MessageLinkElementInstance messageLinkElementInstance = (MessageLinkElementInstance) cMessageLink.getInstanceBuffer().get(cMessageLink.getInstanceID());
			//receivingActivity = (Activity) helper.getInstanceData(receivingActivity, messageLinkElementInstance.getReceivingActivityInstanceID(), process.getInstanceID(), true);

			boolean completeRewind = helper.isInstanceCreatingActivity(receivingActivity);

			if (!result.getRewindingPointMap().containsKey(process.getInstanceID())) {

				receivingActivity = (Activity) helper.getInstanceData(receivingActivity, messageLinkElementInstance.getReceivingActivityInstanceID(), process.getInstanceID(), true);
				
				ResultEntry entry = new ResultEntry();
				entry.setProcessInstance(process);
				entry.getActivityInstances().put(receivingActivity, receivingActivity.getInstanceID());
				entry.setCompleteRewind(completeRewind);

				result.getRewindingPointMap().put(process.getInstanceID(), entry);

				determineRewindingPoints(choreography, process, receivingActivity, result);

			} else if (result.getRewindingPointMap().containsKey(process.getInstanceID())) {

				ResultEntry resultEntry = result.getRewindingPointMap().get(process.getInstanceID());
				Map<Activity, String> activityInstancesToRemove = new HashMap<Activity, String>();
				ProcessInstanceBuffer processInstanceBuffer = helper.getCurrentProcessInstanceBuffer(process.getInstanceID());
				processInstanceBuffer.resetElements();

				boolean recursion = false;

				for (Entry<Activity, String> activityInstanceEntry : resultEntry.getActivityInstances().entrySet()) {

					receivingActivity = (Activity) helper.getInstanceData(receivingActivity, messageLinkElementInstance.getReceivingActivityInstanceID(), process.getInstanceID(), true);
					Activity currentStartActivity = activityInstanceEntry.getKey();
					currentStartActivity = (Activity) helper.getInstanceData(currentStartActivity, activityInstanceEntry.getValue(), process.getInstanceID(), true);

					if (currentStartActivity.equals(receivingActivity) && currentStartActivity.getInstanceID().equals(receivingActivity.getInstanceID())) {
						return;
					}

					boolean b = successor(receivingActivity, currentStartActivity, currentStartActivity.getInstanceID(), choreography.getFlowActivityLinks(), process.getInstanceID());

					processInstanceBuffer.resetElements();
					receivingActivity = (Activity) helper.getInstanceData(receivingActivity, messageLinkElementInstance.getReceivingActivityInstanceID(), process.getInstanceID(), true);
					currentStartActivity = (Activity) helper.getInstanceData(currentStartActivity, activityInstanceEntry.getValue(), process.getInstanceID(), true);
					
					if (b) {

						activityInstancesToRemove.put(currentStartActivity, currentStartActivity.getInstanceID());
						recursion = true;

					} else if (!successor(currentStartActivity, receivingActivity, receivingActivity.getInstanceID(), choreography.getFlowActivityLinks(), process.getInstanceID()) & !b) {
						recursion = true;

					}

				}
				processInstanceBuffer.loadcurrentElementInstance();

				if (recursion) {
					if (!activityInstancesToRemove.isEmpty()) {

						for (Entry<Activity, String> entry : activityInstancesToRemove.entrySet()) {
							resultEntry.getActivityInstances().remove(entry.getKey());
						}
					}

					resultEntry.getActivityInstances().put(receivingActivity, receivingActivity.getInstanceID());
					resultEntry.setCompleteRewind(completeRewind);

					determineRewindingPoints(choreography, process, receivingActivity, result);
				}

			}
		}

	}

	private Result handleLoopActivities(Choreography choreography, String processInstanceID, Activity loopActivity, Activity startActivity, Map<ExtensibleElements, List<String>> visitedMap,
			Result result) {

		long iterCurrent = 0;
		long iterActivity = 0;

		if (startActivity != null) {
			iterActivity = ((ExtElementsElementInstance) startActivity.getInstanceBuffer().get(processInstanceID).get(startActivity.getInstanceID())).getLoopIteration();
			iterCurrent = iterActivity;
		}

		LoopElementInstance loopElementInstance = (LoopElementInstance) loopActivity.getInstanceBuffer().get(processInstanceID).get(loopActivity.getInstanceID());

		while (iterCurrent < loopElementInstance.getLoopCounter()) {

			Activity loopInstanceGraph = getLoopInstanceGraph(processInstanceID, loopActivity, iterCurrent);

			if (startActivity != null && iterActivity == iterCurrent) {

				traverseInstanceGraph(choreography, processInstanceID, loopInstanceGraph, startActivity, true, visitedMap, result);
			} else {

				if (!(loopInstanceGraph instanceof Flow)) {

					traverseInstanceGraph(choreography, processInstanceID, loopInstanceGraph, loopInstanceGraph, true, visitedMap, result);
				} else if (loopInstanceGraph instanceof Flow) {

					// TODO
				}

			}

			iterCurrent++;

		}

		return result;
	}

	private Activity getLoopInstanceGraph(String processInstanceID, Activity loopActivity, long iterCurrent) {

		if (loopActivity instanceof While) {
			While whileActivity = (While) loopActivity;
			helper.traverse(processInstanceID, whileActivity.getActivity(), iterCurrent);
			return whileActivity.getActivity();
		} else if (loopActivity instanceof ForEach) {
			ForEach forEach = (ForEach) loopActivity;
			helper.traverse(processInstanceID, forEach.getScope(), iterCurrent);
			return forEach.getScope();
		}

		return null;
	}

	private Result traverseInstanceGraph(Choreography choreography, String processInstanceID, Activity instanceGraph, Activity startActivity, boolean loop,
			Map<ExtensibleElements, List<String>> visitedMap, Result result) {

		Stack<ExtensibleElements> s = new Stack<ExtensibleElements>();
		s.push(startActivity);

		while (!s.isEmpty()) {

			ExtensibleElements current = s.pop();

			// if (current instanceof Activity) {
			// System.out.println("Sub Graph Loop :" + ((Activity)
			// current).getName() + "::ModelID: " + ((Activity) current).getId()
			// + "::Iteration: " + helper.getIteration(current));
			// }

			if (!helper.isVisited(visitedMap, current)) {
				helper.addElementInstanceToMap(visitedMap, current);

				if (current.getState() != null && current.getState().equals("Activity_Complete") && (current instanceof Invoke || current instanceof Reply)) {

					handleSendingActivity(processInstanceID, current, choreography, result);
				} else if (current.getState() != null && (current instanceof While || current instanceof ForEach)) {

					handleLoopActivities(choreography, processInstanceID, (Activity) current, null, visitedMap, result);
				}

				List<ExtensibleElements> successors;

				if (loop) {
					successors = determineSuccessorActivitiesInLoop(choreography.getFlowActivityLinks(), current, processInstanceID, true);
				} else {
					successors = determineSuccessorActivities(choreography.getFlowActivityLinks(), current, processInstanceID, true);
				}

				for (ExtensibleElements element : successors) {
					s.push(element);
				}

			}
		}

		return result;
	}

	private CMessageLink getMessageLinkInstance(Choreography choreography, Activity sendingActivity) {

		CMessageLink messageLink = null;

		// iterate over all message links of a choreography (instance)
		for (CMessageLink cMessageLink : choreography.getMessageLinks()) {

			if (cMessageLink.getSendActivity().equals(sendingActivity)) {

				ExtensibleElements receivingElement = (ExtensibleElements) cMessageLink.getReceiveActivity();

				for (Entry<String, ElementInstance> entry : cMessageLink.getInstanceBuffer()) {

					MessageLinkElementInstance messageLinkElementInstance = (MessageLinkElementInstance) entry.getValue();

					ElementInstance receivingElementInstance = receivingElement.getInstanceBuffer().get(messageLinkElementInstance.getReceivingProcessInstanceID()).get(messageLinkElementInstance.getReceivingActivityInstanceID());

					if (sendingActivity.getInstanceID().equals(messageLinkElementInstance.getSendingActivityInstanceID()) && messageLinkElementInstance.getState().equals("True")
							&& receivingElementInstance != null && receivingElementInstance.getState() != null) {

						messageLink = cMessageLink;
						messageLink.setInstanceID(messageLinkElementInstance.getInstanceID());
						messageLink.setState(messageLinkElementInstance.getState());

						return messageLink;
					}
				}
			}
		}
		return messageLink;
	}

	/**
	 * Method for determining the process instance, which is on the receiving
	 * side of a message link instance
	 * 
	 * 
	 * @param choreography
	 * @param cMessageLink
	 * @param receivingActivity
	 * @return
	 */
	private Process determineReceivingParticipantInstance(Choreography choreography, CMessageLink cMessageLink, CLinkable receivingActivity) {
		Activity receiveActivity = (Activity) cMessageLink.getReceiveActivity();

		MessageLinkElementInstance messageLinkElementInstance = (MessageLinkElementInstance) cMessageLink.getInstanceBuffer().get(cMessageLink.getInstanceID());

		return helper.getParentProcessInstance(receiveActivity, messageLinkElementInstance.getReceivingProcessInstanceID());

	}

	private boolean successor2(Activity activity1, Activity activity2, List<FlowActivityLink> links, String processInstanceID, boolean buffer) {

		EObject element = activity1;

		EObject container = element.eContainer();
		while (container != null && !(container instanceof Process)) {

			// Special handling for flows: The index of the elements can not be
			// used because the layout of flow activities in the designer
			// doesn't have to correspond to the modeled
			// control flow of the process like in a sequence.
			// TODO: implement flow handling

			if (container instanceof Flow) {

				return successor((Flow) container, activity1, activity2, links, processInstanceID, buffer);
			}

			else {
				// Get the index of the element in the container
				int elementIndex = container.eContents().indexOf(element);

				ExtensibleElements current = null;
				for (int i = elementIndex + 1; i < container.eContents().size(); i++) {

					if (container.eContents().get(i) instanceof ExtensibleElements) {

						current = (ExtensibleElements) container.eContents().get(i);
						current = helper.nextInstanceData(current, processInstanceID, buffer);

						// Only if the current element has an annotated state
						// attribute
						if (current.getState() != null) {

							if (current instanceof Sequence || current instanceof Flow || current instanceof Scope || current instanceof While || current instanceof ForEach || current instanceof Pick
									|| current instanceof OnMessage) {

								boolean traverse = true;
								while (traverse) {

									boolean found = false;
									found = traverseSuccessorChildren(current, activity1, activity2, links, processInstanceID, buffer);

									if (found) {
										return true;
									} else {
										current = helper.nextInstanceData(current, processInstanceID, buffer);
										if (current.getState() == null) {
											traverse = false;
										}
									}
								}
							}

							// if the current activity equals the potential
							// successor activity,
							// activity2 is indeed the successor of activity1

							if (current instanceof Activity) {
								Activity currentActivity = (Activity) current;

								// TODO: handle loops, maybe already done?

								if (currentActivity.getId().equals(activity2.getId()) && currentActivity.getInstanceID().equals(activity2.getInstanceID())) {
									return true;
								}

							}

						}
						// If there is no annotated state attribute
						// there is no relevant successor
						else {
							return false;
						}
					}
				}
			}

			// Move one layer up the hierarchy
			element = container;
			container = container.eContainer();

		}
		// if no sucessor has been found
		return false;
	}

	private boolean successor(Activity activity1, Activity activity2, String activity2InstanceID, List<FlowActivityLink> links, String processInstanceID) {

		Map<ExtensibleElements, List<String>> visitedActivityInstances = new HashMap<ExtensibleElements, List<String>>();
		
		activity2.setInstanceID(null);
		activity2.setState(null);
		
		
		Activity loopActivity = helper.loopParentOf(processInstanceID, activity1);
		
		
		
		
		boolean successor = false;
		
		if (loopActivity != null) {
			successor =  successor(links, processInstanceID, loopActivity, activity1, activity2, activity2InstanceID, visitedActivityInstances);
			
			if(!successor){
				List<ExtensibleElements>  list = determineSuccessorActivities(links, loopActivity, processInstanceID, false);
				//successor = traverseInstanceGraph(activity1, activity2, activity2InstanceID, links, processInstanceID, false, visitedActivityInstances);
			
				for(ExtensibleElements ext: list){
					successor = traverseInstanceGraph((Activity)ext, activity2, activity2InstanceID, links, processInstanceID, false, visitedActivityInstances);
					if(successor){
						break;
					}
				}
				
			}
			
		} else {

			successor =  traverseInstanceGraph(activity1, activity2, activity2InstanceID, links, processInstanceID, false, visitedActivityInstances);
		}
		
		for(ExtensibleElements ext: visitedActivityInstances.keySet()){
			ext.setInstanceID(null);
			ext.setState(null);
		}
		
		if(loopActivity != null){
			loopActivity.setInstanceID(null);
			loopActivity.setState(null);
		}
		
		return successor;
	}
	
	
	private boolean successor(List<FlowActivityLink> links, String processInstanceID, Activity loopActivity, Activity startActivity, Activity activity2, String activity2InstanceID, Map<ExtensibleElements, List<String>> visitedMap) {

		long iterCurrent = 0;
		long iterActivity = 0;

		if (startActivity != null) {
			iterActivity = ((ExtElementsElementInstance) startActivity.getInstanceBuffer().get(processInstanceID).get(startActivity.getInstanceID())).getLoopIteration();
			iterCurrent = iterActivity;
		}

		LoopElementInstance loopElementInstance = (LoopElementInstance) loopActivity.getInstanceBuffer().get(processInstanceID).get(loopActivity.getInstanceID());

		while (iterCurrent < loopElementInstance.getLoopCounter()) {

			Activity loopInstanceGraph = getLoopInstanceGraph(processInstanceID, loopActivity, iterCurrent);

			
			boolean found;
			if (startActivity != null && iterActivity == iterCurrent) {

				found = traverseInstanceGraph(startActivity, activity2, activity2InstanceID, links, processInstanceID, true, visitedMap);
				if(found){
					return true;
				}
				
			} else {

				if (!(loopInstanceGraph instanceof Flow)) {

					found = traverseInstanceGraph(loopInstanceGraph, activity2, activity2InstanceID, links, processInstanceID, true, visitedMap);
					if(found){
						return true;
					}
					
				} else if (loopInstanceGraph instanceof Flow) {

					// TODO
				}

			}

			iterCurrent++;

		}

		return false;
	}
	
	private boolean traverseInstanceGraph(Activity activity1, Activity activity2, String activity2InstanceID, List<FlowActivityLink> links, String processInstanceID, boolean loop,
			Map<ExtensibleElements, List<String>> visitedMap) {

		Stack<ExtensibleElements> s = new Stack<ExtensibleElements>();
		s.push(activity1);

		while (!s.isEmpty()) {

			ExtensibleElements current = s.pop();


			if (!helper.isVisited(visitedMap, current)) {
				helper.addElementInstanceToMap(visitedMap, current);

				if (current.getState() != null && current.getState().equals("Activity_Complete")) {

					if(current.getInstanceID() != null && current.getInstanceID().equals(activity2InstanceID)){
						return true;
					}
					
				}  
				if (current.getState() != null && (current instanceof While || current instanceof ForEach)) {

					boolean found;
					found = successor(links, processInstanceID, (Activity)current, null, activity2, activity2InstanceID,  visitedMap);
					
					if(found){
						return true;
					}
				}

				List<ExtensibleElements> successors;

				if (loop) {
					successors = determineSuccessorActivitiesInLoop(links, current, processInstanceID, false);
				} else {
					successors = determineSuccessorActivities(links, current, processInstanceID, false);
				}

				for (ExtensibleElements element : successors) {
					s.push(element);
				}

			}
		}

		return false;
	}
	
	
	
	
	
	
	private boolean traverseSuccessorChildren(ExtensibleElements element, Activity activity1, Activity activity2, List<FlowActivityLink> links, String processInstanceID, boolean buffer) {

		boolean found = false;

		if (element != null) {

			for (EObject eObject : element.eContents()) {
				if (eObject != null && eObject instanceof ExtensibleElements) {
					ExtensibleElements current = (ExtensibleElements) eObject;
					current = helper.nextInstanceData(current, processInstanceID, buffer);

					// Only if the current element has an annotated state
					// attribute
					if (current.getState() != null) {

						// if the current activity equals the potential
						// successor activity,
						// activity2 is indeed the successor of activity1

						if (current instanceof Activity) {
							Activity currentActivity = (Activity) current;

							if (currentActivity.getId().equals(activity2.getId()) && currentActivity.getInstanceID().equals(activity2.getInstanceID())) {

								return true;
							}

						}

						if (current.eContents() != null && !current.eContents().isEmpty()) {

							// TODO: implement correctly
							if (current instanceof Flow) {

								List<Activity> startActivities = helper.getStartActivities((Flow) current, links);

								// TODO: iterate over complete list
								found = successor((Flow) current, startActivities.get(0), activity2, links, processInstanceID, buffer);

							} else {

								boolean traverse = true;
								while (traverse) {

									found = traverseSuccessorChildren(current, activity1, activity2, links, processInstanceID, buffer);

									if (found) {
										return true;
									} else {
										current = helper.nextInstanceData(current, processInstanceID, buffer);
										if (current.getState() == null) {
											traverse = false;
										}
									}
								}

							}

						}
					} else {
						// If there is no annotated state attribute
						// there is no relevant successor
						return false;
					}

				}
			}

		}
		return found;
	}

	private boolean successor(Flow flow, Activity startActivity, Activity successor, List<FlowActivityLink> links, String processInstanceID, boolean buffer) {

		List<ExtensibleElements> visitedList = new ArrayList<ExtensibleElements>();
		Stack<ExtensibleElements> stack = new Stack<ExtensibleElements>();
		stack.push(startActivity);

		while (!stack.isEmpty()) {

			ExtensibleElements current = stack.pop();

			if (!visitedList.contains(current)) {
				visitedList.add(current);

				if (current.eContents() != null && !current.eContents().isEmpty()) {
					return traverseSuccessorChildren(current, startActivity, successor, links, processInstanceID, buffer);
				}

				if (current instanceof Activity) {

					int currentI = helper.getIteration(current);
					int successorI = helper.getIteration(successor);

					Activity currentActivity = (Activity) current;

					if (currentActivity.getId().equals(successor.getId()) && currentI == successorI) {
						return true;
					} else {

						List<ExtensibleElements> targetElements = determineSuccessorActivities(links, currentActivity, processInstanceID, buffer);

						for (ExtensibleElements target : targetElements) {
							stack.push(target);
						}
					}

				}

			}

		}

		return false;
	}

}
