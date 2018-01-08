package de.unistuttgart.iaas.chor.instance.repetition.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantSet;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.chor.FlowActivityLink;
import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance;
import org.eclipse.bpel4chor.model.chor.common.LoopElementInstance;
import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.Boolean;
import org.eclipse.bpel4chor.model.pbd.Correlations;
import org.eclipse.bpel4chor.model.pbd.Else;
import org.eclipse.bpel4chor.model.pbd.Elseif;
import org.eclipse.bpel4chor.model.pbd.ExtensibleElements;
import org.eclipse.bpel4chor.model.pbd.Flow;
import org.eclipse.bpel4chor.model.pbd.ForEach;
import org.eclipse.bpel4chor.model.pbd.If;
import org.eclipse.bpel4chor.model.pbd.Invoke;
import org.eclipse.bpel4chor.model.pbd.LoopIteration;
import org.eclipse.bpel4chor.model.pbd.OnMessage;
import org.eclipse.bpel4chor.model.pbd.Pick;
import org.eclipse.bpel4chor.model.pbd.Process;
import org.eclipse.bpel4chor.model.pbd.Receive;
import org.eclipse.bpel4chor.model.pbd.Scope;
import org.eclipse.bpel4chor.model.pbd.Sequence;
import org.eclipse.bpel4chor.model.pbd.While;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

public class Helper {

	private Map<String, ProcessInstanceBuffer> currentInstanceBuffer = new HashMap<String, ProcessInstanceBuffer>();

	public ProcessInstanceBuffer getCurrentProcessInstanceBuffer(String processInstanceID) {
		return currentInstanceBuffer.get(processInstanceID);
	}

	public Process getParentProcess(ExtensibleElements element) {

		if (element.eContainer() != null) {

			EObject parent = element.eContainer();

			if (parent instanceof Process) {
				return (Process) parent;
			} else {
				return getParentProcess((ExtensibleElements) parent);
			}

		}
		return null;
	}

	public Process getParentProcessInstance(ExtensibleElements element, String processInstanceID) {

		if (element.eContainer() != null) {

			EObject parent = element.eContainer();

			if (parent instanceof Process) {

				Process process = (Process) parent;
				ElementInstance elementInstance = process.getInstanceBuffer().get(processInstanceID).get(processInstanceID);
				process.setInstanceID(elementInstance.getInstanceID());
				process.setState(elementInstance.getState());

				return process;
			} else {
				return getParentProcessInstance((ExtensibleElements) parent, processInstanceID);
			}

		}
		return null;
	}

	public Activity loopParentOf(String processInstanceID, ExtensibleElements element) {

		EObject container = element.eContainer();

		while (container != null && !(container instanceof Process)) {

			if (container instanceof While || container instanceof ForEach) {

				ExtElementsElementInstance extElementsElementInstance = (ExtElementsElementInstance) element.getInstanceBuffer().get(processInstanceID).get(element.getInstanceID());
				if (extElementsElementInstance != null) {

					LoopElementInstance loopElementInstance = extElementsElementInstance.getParentLoopInstance();
					Activity loopActivity = (Activity) container;
					loopActivity.setInstanceID(loopElementInstance.getInstanceID());
					loopActivity.setState(loopElementInstance.getState());
					return loopActivity;
				}
				return null;

			} else {
				container = (EObject) container.eContainer();
			}

		}

		return null;
	}

	public Activity loopParentOf(ExtensibleElements element) {

		EObject container = element.eContainer();

		while (container != null && !(container instanceof Process)) {

			if (container instanceof While || container instanceof ForEach) {

				Activity loopActivity = (Activity) container;

				return loopActivity;

			} else {
				container = (EObject) container.eContainer();
			}

		}

		return null;
	}

	public List<ExtensibleElements> getTargetActivities(List<FlowActivityLink> links, ExtensibleElements sourceActivity) {

		List<ExtensibleElements> targetActivities = new ArrayList<ExtensibleElements>();

		for (FlowActivityLink link : links) {

			if (link.getSourceActivity().equals(sourceActivity)) {
				targetActivities.add(link.getTargetActivity());
			}

		}

		return targetActivities;

	}

	public boolean findActivityInstance(Activity current, ExtensibleElements element) {

		if (current.getXpath() != null && current.getXpath().equals(element.getXpath())) {
			return true;
		}

		if (current instanceof Scope) {
			Scope scope = (Scope) current;
			return findActivityInstance(scope, element);

		} else if (current instanceof ForEach) {
			ForEach forEach = (ForEach) current;

			return findActivityInstance(forEach.getScope(), element);

		} else if (current instanceof If) {
			If ifElement = (If) current;

			return findActivityInstance(ifElement.getActivity(), element);

		} else if (current instanceof Elseif) {

			Elseif elseifElement = (Elseif) current;
			return findActivityInstance(elseifElement.getActivity(), element);
		} else if (current instanceof Else) {

			Else elseElement = (Else) current;
			return findActivityInstance(elseElement.getActivity(), element);
		}

		else if (current instanceof While) {
			While whileElement = (While) current;
			return findActivityInstance(whileElement.getActivity(), element);

		} else if (current instanceof Pick) {

			Pick pick = (Pick) current;

			for (OnMessage onMessage : pick.getOnMessage()) {

				boolean found = findActivityInstance(onMessage.getActivity(), element);

				if (found) {
					return found;
				}
			}
		}

		else if (current instanceof Sequence) {
			Sequence sequence = (Sequence) current;

			for (Activity activity : sequence.getActivity()) {

				boolean found = findActivityInstance(activity, element);

				if (found) {
					return found;
				}
			}

		} else if (current instanceof Flow) {
			Flow flow = (Flow) current;
			for (Activity activity : flow.getActivity()) {
				boolean found = findActivityInstance(activity, element);

				if (found) {
					return found;
				}
			}

		}
		return false;
	}

	private Activity findSendingActivity(ExtensibleElements current, Activity sendingActivity) {

		if (current instanceof Invoke) {

			Invoke invoke = (Invoke) current;

			// TODO: Does the engine send this?
			if (invoke.getId().equals(sendingActivity.getId())) {
				return invoke;
			}
		}

		if (current instanceof Scope) {
			Scope scope = (Scope) current;
			return findSendingActivity(scope, sendingActivity);

		} else if (current instanceof ForEach) {
			ForEach forEach = (ForEach) current;

			return findSendingActivity(forEach.getScope(), sendingActivity);

		} else if (current instanceof If) {
			If ifElement = (If) current;

			return findSendingActivity(ifElement.getActivity(), sendingActivity);

		} else if (current instanceof Elseif) {

			Elseif elseifElement = (Elseif) current;
			return findSendingActivity(elseifElement.getActivity(), sendingActivity);
		} else if (current instanceof Else) {

			Else elseElement = (Else) current;
			return findSendingActivity(elseElement.getActivity(), sendingActivity);
		}

		else if (current instanceof While) {
			While whileElement = (While) current;
			return findSendingActivity(whileElement.getActivity(), sendingActivity);

		} else if (current instanceof Pick) {

			Pick pick = (Pick) current;

			for (OnMessage onMessage : pick.getOnMessage()) {

				Activity activity = findSendingActivity(onMessage.getActivity(), sendingActivity);

				if (activity != null) {
					return activity;
				}
			}
		}

		else if (current instanceof Sequence) {
			Sequence sequence = (Sequence) current;

			for (Activity activity : sequence.getActivity()) {

				Activity activity2 = findSendingActivity(activity, sendingActivity);

				if (activity2 != null) {
					return activity2;
				}
			}

		} else if (current instanceof Flow) {
			Flow flow = (Flow) current;
			for (Activity activity : flow.getActivity()) {
				Activity activity2 = findSendingActivity(activity, sendingActivity);

				if (activity2 != null) {
					return activity2;
				}
			}

		}
		return null;
	}

	public List<Activity> findActivityInstancesByActivityModel(ExtensibleElements current, Activity activityModel, List<Activity> activityInstances) {

		if (current instanceof Invoke) {

			Invoke invoke = (Invoke) current;

			// TODO: Does the engine send this?
			if (invoke.getId().equals(activityModel.getId()) && invoke.getState() != null && !invoke.getState().equals("dead")) {
				activityInstances.add(invoke);
			}
		} else if (current instanceof Receive) {

			Receive receive = (Receive) current;
			if (receive.getId().equals(activityModel.getId()) && receive.getState() != null && !receive.getState().equals("dead")) {
				activityInstances.add(receive);
			}
		}

		else if (current instanceof Scope) {
			Scope scope = (Scope) current;

			if (scope.getId().equals(activityModel.getId()) && scope.getState() != null && !scope.getState().equals("dead")) {
				activityInstances.add(scope);
			}
			findActivityInstancesByActivityModel(scope, activityModel, activityInstances);

		} else if (current instanceof ForEach) {
			ForEach forEach = (ForEach) current;

			// TODO: consider iteration element
			if (forEach.getId().equals(activityModel.getId()) && forEach.getState() != null && !forEach.getState().equals("dead")) {
				activityInstances.add(forEach);
			}

			findActivityInstancesByActivityModel(forEach.getScope(), activityModel, activityInstances);

		} else if (current instanceof If) {
			If ifElement = (If) current;

			if (ifElement.getId().equals(activityModel) && ifElement.getState() != null && !ifElement.getState().equals("dead")) {
				activityInstances.add(ifElement);
			}

			findActivityInstancesByActivityModel(ifElement.getActivity(), activityModel, activityInstances);

			for (Elseif elseif : ifElement.getElseif()) {

				findActivityInstancesByActivityModel(elseif, activityModel, activityInstances);
			}

			findActivityInstancesByActivityModel(ifElement.getElse(), activityModel, activityInstances);

		} else if (current instanceof Elseif) {
			Elseif elseifElement = (Elseif) current;

			// TODO: Add id to extensible elements ?
			findActivityInstancesByActivityModel(elseifElement.getActivity(), activityModel, activityInstances);
		} else if (current instanceof Else) {

			Else elseElement = (Else) current;
			findActivityInstancesByActivityModel(elseElement.getActivity(), activityModel, activityInstances);
		}

		else if (current instanceof While) {
			While whileElement = (While) current;

			if (whileElement.getId().equals(activityModel.getId()) && whileElement.getState() != null && !whileElement.getState().equals("dead")) {

				activityInstances.add(whileElement);

			} else {
				for (LoopIteration iteration : whileElement.getStateBuffer()) {

					findActivityInstancesByActivityModel(iteration.getActivity(), activityModel, activityInstances);
				}
			}

		} else if (current instanceof Pick) {

			// TODO: also consider instances
			Pick pick = (Pick) current;

			for (OnMessage onMessage : pick.getOnMessage()) {

				findActivityInstancesByActivityModel(onMessage.getActivity(), activityModel, activityInstances);

			}
		}

		else if (current instanceof Sequence) {
			Sequence sequence = (Sequence) current;

			if (sequence.getId().equals(activityModel.getId()) && sequence.getState() != null && !sequence.getState().equals("dead")) {
				activityInstances.add(sequence);
			}

			for (Activity activity : sequence.getActivity()) {

				findActivityInstancesByActivityModel(activity, activityModel, activityInstances);

			}

		} else if (current instanceof Flow) {
			Flow flow = (Flow) current;

			if (flow.getId().equals(activityModel.getId()) && flow.getState() != null && !flow.getState().equals("dead")) {
				activityInstances.add(flow);
			}

			for (Activity activity : flow.getActivity()) {
				findActivityInstancesByActivityModel(activity, activityModel, activityInstances);

			}

		}
		return activityInstances;
	}

	public int getIteration(EObject activity) {

		if (activity.eContainer() instanceof Process) {
			return -1;
		}

		else if (activity.eContainer() instanceof LoopIteration) {

			return ((LoopIteration) activity.eContainer()).getLoopIterationCounter();

		} else {
			return getIteration(activity.eContainer());
		}

	}

	public int getIteration(ExtensibleElements loopActivityInstance, ExtensibleElements activityInstance) {

		if (loopActivityInstance.getInstanceID() != null) {

			loopActivityInstance.getInstanceBuffer().get(loopActivityInstance.getInstanceID());

		}

		return -1;

	}

	public List<Activity> getStartActivities(Flow flow, List<FlowActivityLink> links) {

		List<Activity> startActivities = new ArrayList<Activity>();

		for (Activity activity : flow.getActivity()) {

			boolean found = false;

			for (FlowActivityLink link : links) {

				if (link.getTargetActivity().equals(activity)) {

					found = true;
					break;
				}

			}
			if (!found) {
				startActivities.add(activity);
			}

		}
		return startActivities;
	}

	public Process getProcessOfReceivingActivity(Activity receivingActivity) {

		EObject parent = receivingActivity.eContainer();

		return null;
	}

	public Process getProcessByModelID(Choreography choreography, String processModelID) {

		for (CParticipant cParticipant : choreography.getParticipants()) {

			if (cParticipant.getProcess().getId().equals(processModelID)) {
				return cParticipant.getProcess();
			}

		}
		for (CParticipantSet cParticipantSet : choreography.getParticipantSets()) {

			if (cParticipantSet.getProcess().getId().equals(processModelID)) {
				return cParticipantSet.getProcess();
			}
		}

		return null;
	}

	public CMessageLink getMessageLinkByModelID(Choreography choreography, String modelID) {

		for (CMessageLink messageLink : choreography.getMessageLinks()) {
			if (messageLink.getId() != null && messageLink.getId().equals(modelID)) {
				return messageLink;
			}
		}
		return null;
	}

	public Activity getActivtiyByModelID(ExtensibleElements extensibleElements, String elementModelID) {

		if (extensibleElements.getId() != null && extensibleElements.getId().equals(elementModelID)) {

			if (extensibleElements instanceof Activity) {
				return (Activity) extensibleElements;
			}
		} else {

			if (extensibleElements.eContents() != null && !extensibleElements.eContents().isEmpty()) {

				for (EObject eObject : extensibleElements.eContents()) {

					if (eObject instanceof ExtensibleElements) {

						Activity activity = getActivtiyByModelID((ExtensibleElements) eObject, elementModelID);

						if (activity != null) {
							return activity;
						}
					}

				}

			}

		}

		return null;
	}

	public boolean isInstanceCreatingActivity(Activity activity) {

		if (activity instanceof Receive) {

			Receive receive = (Receive) activity;

			if (receive.getCreateInstance() != null && receive.getCreateInstance().equals(Boolean.YES)) {
				return true;
			}

		} else if (activity instanceof OnMessage) {

			OnMessage onMessage = (OnMessage) activity;
			EObject eObject = onMessage.eContainer();

			if (eObject instanceof Pick) {
				Pick pick = (Pick) eObject;
				if (pick.getCreateInstance() != null && pick.getCreateInstance().equals(Boolean.YES)) {
					return true;
				}
			}

		}

		return false;
	}

	public ExtensibleElements nextInstanceData(ExtensibleElements element, String processInstanceID, boolean buffer) {

		ElementInstance nextElementInstance = null;

		if (element.getInstanceBuffer().isEmpty()) {
			return element;
		}

		ElementInstance currentElementInstance = element.getInstanceBuffer().get(processInstanceID).get(element.getInstanceID());

		if (currentElementInstance == null) {
			nextElementInstance = nextElementInstanceByTimestamp(0, element.getInstanceBuffer().get(processInstanceID));

			if (nextElementInstance != null) {

				element.setInstanceID(nextElementInstance.getInstanceID());
				element.setState(nextElementInstance.getState());

			}
		} else {

			nextElementInstance = nextElementInstanceByTimestamp(currentElementInstance.getTimestamp(), element.getInstanceBuffer().get(processInstanceID));

			if (nextElementInstance != null) {

				element.setInstanceID(nextElementInstance.getInstanceID());
				element.setState(nextElementInstance.getState());

			} else {
				element.setState(null);
				element.setInstanceID(null);
			}
		}

		if (buffer && processInstanceID != null) {

			currentInstanceBuffer.get(processInstanceID);
			if (!currentInstanceBuffer.containsKey(processInstanceID)) {

				ProcessInstanceBuffer processInstanceBuffer = new ProcessInstanceBuffer();
				processInstanceBuffer.getCurrentElementInstanceBuffer().put(element, nextElementInstance);
				currentInstanceBuffer.put(processInstanceID, processInstanceBuffer);
			} else {

				currentInstanceBuffer.get(processInstanceID).getCurrentElementInstanceBuffer().put(element, nextElementInstance);
			}
		}

		return element;
	}

	public ExtensibleElements getInstanceData(ExtensibleElements element, String elementInstanceID, String processInstanceID, boolean buffer) {

		ElementInstance elementInstance = element.getInstanceBuffer().get(processInstanceID).get(elementInstanceID);

		if (elementInstance != null) {
			element.setInstanceID(elementInstance.getInstanceID());
			element.setState(elementInstance.getState());

			if (buffer && processInstanceID != null) {

				currentInstanceBuffer.get(processInstanceID);
				if (!currentInstanceBuffer.containsKey(processInstanceID)) {

					ProcessInstanceBuffer processInstanceBuffer = new ProcessInstanceBuffer();
					processInstanceBuffer.getCurrentElementInstanceBuffer().put(element, elementInstance);
					currentInstanceBuffer.put(processInstanceID, processInstanceBuffer);
				} else {

					currentInstanceBuffer.get(processInstanceID).getCurrentElementInstanceBuffer().put(element, elementInstance);
				}
			}

		}

		return element;
	}

	public ElementInstance nextElementInstanceByTimestamp(long previousTimestamp, EMap<String, ElementInstance> buffer) {

		ElementInstance selectedElementInstance = null;

		for (Entry<String, ElementInstance> entry : buffer.entrySet()) {

			ElementInstance current = entry.getValue();

			if (current.getTimestamp() > previousTimestamp) {

				if (selectedElementInstance == null) {
					selectedElementInstance = current;
				} else if (selectedElementInstance != null && current.getTimestamp() < selectedElementInstance.getTimestamp() && current.getTimestamp() > previousTimestamp) {
					selectedElementInstance = current;
				}
			}

		}

		return selectedElementInstance;
	}

	public boolean isVisited(Map<ExtensibleElements, List<String>> visitedMap, ExtensibleElements elementInstance) {

		if (!visitedMap.containsKey(elementInstance)) {
			return false;
		} else {
			if (visitedMap.get(elementInstance).contains(elementInstance.getInstanceID())) {
				return true;
			} else {
				return false;
			}
		}
	}

	public void addElementInstanceToMap(Map<ExtensibleElements, List<String>> visitedMap, ExtensibleElements elementInstance) {

		if (!visitedMap.containsKey(elementInstance)) {

			List<String> instanceIDs = new ArrayList<String>();
			instanceIDs.add(elementInstance.getInstanceID());
			visitedMap.put(elementInstance, instanceIDs);
		} else {
			visitedMap.get(elementInstance).add(elementInstance.getInstanceID());
		}

	}

	public void traverse(String processInstanceID, ExtensibleElements element, long loopIteration) {
		ExtElementsElementInstance elementInstance = null;

		try {

			if (element.getInstanceBuffer().get(processInstanceID) != null) {
				elementInstance = getElementInstance(element.getInstanceBuffer().get(processInstanceID).values(), loopIteration);
			}

		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		if (elementInstance != null) {

			element.setInstanceID(elementInstance.getInstanceID());
			element.setState(elementInstance.getState());

			for (EObject eObject : element.eContents()) {

				if (eObject instanceof ExtensibleElements) {
					if (!(eObject instanceof While) && !(eObject instanceof ForEach) && !(eObject instanceof Correlations)) {
						traverse(processInstanceID, (ExtensibleElements) eObject, loopIteration);
					}
				}
			}

		}

	}

	public ExtElementsElementInstance getElementInstance(Collection<ElementInstance> elementInstances, long loopIteration) {

		for (ElementInstance elementInstance : elementInstances) {

			if (elementInstance instanceof ExtElementsElementInstance) {

				ExtElementsElementInstance extElementsElementInstance = (ExtElementsElementInstance) elementInstance;

				if (extElementsElementInstance.getLoopIteration() == loopIteration) {
					return extElementsElementInstance;
				}
			}

		}

		return null;
	}

}
