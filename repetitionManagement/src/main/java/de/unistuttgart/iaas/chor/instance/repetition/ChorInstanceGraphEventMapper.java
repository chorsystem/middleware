package de.unistuttgart.iaas.chor.instance.repetition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.chor.common.CommonFactory;
import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance;
import org.eclipse.bpel4chor.model.chor.common.LoopElementInstance;
import org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance;
import org.eclipse.bpel4chor.model.chor.common.impl.EStringToProcessInstanceMapImpl;
import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.Correlations;
import org.eclipse.bpel4chor.model.pbd.ExtensibleElements;
import org.eclipse.bpel4chor.model.pbd.ForEach;
import org.eclipse.bpel4chor.model.pbd.Process;
import org.eclipse.bpel4chor.model.pbd.While;
import org.eclipse.emf.ecore.EObject;


import de.unistuttgart.iaas.chor.instance.repetition.util.Helper;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstanceEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLink;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;

public class ChorInstanceGraphEventMapper {

	private Helper helper = new Helper();

	private EventRegistry eventRegistry;

	private String initialStartParticipantInstanceID;
	private String initialRewindingPointInstanceID;

	private Choreography choreographyInstance;
	private Process initialParticipant;
	private Activity initialRewindingPoint;

	private Map<Process, List<ProcessInstance>> processInstances = new HashMap<Process, List<ProcessInstance>>();
	// private Map<String, List<ActivityInstance>>
	// activityInstancesByElementModelID = new HashMap<String,
	// List<ActivityInstance>>();
	private Map<String, Map<String, List<ActivityInstance>>> activityInstancesByElementModelID = new HashMap<String, Map<String, List<ActivityInstance>>>();

	private Map<CMessageLink, List<MessageLinkInstance>> messagelinkInstances = new HashMap<CMessageLink, List<MessageLinkInstance>>();

	public ChorInstanceGraphEventMapper(EventRegistry eventRegistry) {
		this.eventRegistry = eventRegistry;
	}

	public Choreography getChoreographyInstance() {
		return choreographyInstance;
	}

	public ProcessInstance getProcessInstance(Process process, String instanceID) {

		List<ProcessInstance> list = processInstances.get(process);

		for (ProcessInstance processInstance : list) {

			if (processInstance.getCompositePrimaryKey().getProcessInstanceID().equals(instanceID)) {
				return processInstance;
			}
		}

		return null;
	}

	public ActivityInstance getActivityInstance(String elementModelID, String processInstanceID, String elementInstanceID) {

		Map<String, List<ActivityInstance>> activityInstancesOfProcessInstances = activityInstancesByElementModelID.get(elementModelID);

		if (activityInstancesOfProcessInstances != null) {

			for (ActivityInstance activityInstance : activityInstancesOfProcessInstances.get(processInstanceID)) {
				if (activityInstance.getCompositePrimaryKey().getActivityInstanceID().equals(elementInstanceID)) {
					return activityInstance;
				}
			}
		}

		return null;
	}

	public MessageLinkInstance getMessageLinkInstance(CMessageLink messageLink, String instanceID) {

		for (MessageLinkInstance messageLinkInstance : messagelinkInstances.get(messageLink)) {

			if (messageLinkInstance.getInstanceID().equals(instanceID)) {
				return messageLinkInstance;
			}

		}

		return null;
	}

	public Process getInitialParticipant() {
		return initialParticipant;
	}

	public Activity getInitialRewindingPoint() {
		return initialRewindingPoint;
	}

	public Choreography fillChoreographyInstanceGraph(Choreography choreography, String choreographyInstanceID, String initialStartParticipantInstanceID, String initialRewindingPointInstanceID) {

		this.initialStartParticipantInstanceID = initialStartParticipantInstanceID;
		this.initialRewindingPointInstanceID = initialRewindingPointInstanceID;
		ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(Long.valueOf(choreographyInstanceID));

		List<ProcessInstance> processInstances = eventRegistry.getParticipantsFromChoreographyInstance(choreographyInstance);

		for (ProcessInstance processInstance : processInstances) {
			fillProcessInstanceGraph(choreography, processInstance);
		}

		List<MessageLinkInstance> messageLinkInstances = eventRegistry.getMessageLinkInstancesOfChoreographyModel(choreographyInstance);

		for (MessageLinkInstance messageLinkInstance : messageLinkInstances) {

			fillMessageLinkInstance(choreography, messageLinkInstance);

		}

		return choreography;
	}

	private void fillProcessInstanceGraph(Choreography choreography, ProcessInstance processInstance) {

		List<ActivityInstance> activityInstanceList = eventRegistry.getActivityInstancesOfProcessInstance(processInstance);
		buildMap(processInstance.getCompositePrimaryKey().getProcessInstanceID(), activityInstanceList, activityInstancesByElementModelID);

		ProcessModel processModel = eventRegistry.getProcessModelOfProcessInstance(processInstance);
		Process process = helper.getProcessByModelID(choreography, processModel.getModelId());
		
		if (processInstances.get(process) == null) {
			List<ProcessInstance> list = new ArrayList<ProcessInstance>();
			list.add(processInstance);
			processInstances.put(process, list);
		} else {
			processInstances.get(process).add(processInstance);
		}

		ExtElementsElementInstance elementInstance = CommonFactory.eINSTANCE.createExtElementsElementInstance();
		elementInstance.setInstanceID(processInstance.getCompositePrimaryKey().getProcessInstanceID());
		elementInstance.setTimestamp(processInstance.getCreationTimestamp());
		elementInstance.setState(processInstance.getInstanceState().name());

		EStringToProcessInstanceMapImpl entry = new EStringToProcessInstanceMapImpl();
		entry.setTypedKey(processInstance.getCompositePrimaryKey().getProcessInstanceID());
		entry.getValue().put(processInstance.getCompositePrimaryKey().getProcessInstanceID(), elementInstance);

		process.getInstanceBuffer().add(entry);

		if (processInstance.getCompositePrimaryKey().getProcessInstanceID().equals(initialStartParticipantInstanceID)) {
			initialParticipant = process;
			initialParticipant.setInstanceID(initialStartParticipantInstanceID);

		}

		traverseProcessGraph(processInstance.getCompositePrimaryKey().getProcessInstanceID(), process.getActivity(), activityInstancesByElementModelID);

	}

	private void fillMessageLinkInstance(Choreography choreography, MessageLinkInstance messageLinkInstance) {

		MessageLink messageLink = eventRegistry.getMessageLinkOfMessageLinkInstance(messageLinkInstance);
		CMessageLink cMessageLink = helper.getMessageLinkByModelID(choreography, messageLink.getMessageLinkID());
		// cMessageLink.setState(messageLinkInstance.getState().toString());

		if (messagelinkInstances.get(cMessageLink) == null) {
			List<MessageLinkInstance> list = new ArrayList<MessageLinkInstance>();
			list.add(messageLinkInstance);
			messagelinkInstances.put(cMessageLink, list);
		} else {
			messagelinkInstances.get(cMessageLink).add(messageLinkInstance);
		}

		MessageLinkElementInstance elementInstance = CommonFactory.eINSTANCE.createMessageLinkElementInstance();
		elementInstance.setInstanceID(messageLinkInstance.getInstanceID());
		elementInstance.setTimestamp(messageLinkInstance.getTimestamp());
		elementInstance.setState(messageLinkInstance.getState().name());
		elementInstance.setMessageID(messageLinkInstance.getMessageID());

		elementInstance.setSendingActivityInstanceID(messageLinkInstance.getSendingActivityInstance().getCompositePrimaryKey().getActivityInstanceID());
		elementInstance.setReceivingActivityInstanceID(messageLinkInstance.getReceivingActivityInstance().getCompositePrimaryKey().getActivityInstanceID());

		elementInstance.setSendingProcessInstanceID(messageLinkInstance.getSendingProcessInstance().getCompositePrimaryKey().getProcessInstanceID());
		elementInstance.setReceivingProcessInstanceID(messageLinkInstance.getReceivingProcessInstance().getCompositePrimaryKey().getProcessInstanceID());

		cMessageLink.getInstanceBuffer().put(messageLinkInstance.getInstanceID(), elementInstance);
	}

	private void buildMap(String processInstanceID, List<ActivityInstance> activityInstances, Map<String, Map<String, List<ActivityInstance>>> instancesByIDMap) {

		for (ActivityInstance activityInstance : activityInstances) {

			if (instancesByIDMap.get(activityInstance.getElementModelID()) == null) {

				Map<String, List<ActivityInstance>> map = new HashMap<String, List<ActivityInstance>>();

				List<ActivityInstance> list = new ArrayList<ActivityInstance>();
				list.add(activityInstance);
				map.put(processInstanceID, list);

				instancesByIDMap.put(activityInstance.getElementModelID(), map);
			} else {
				Map<String, List<ActivityInstance>> map = instancesByIDMap.get(activityInstance.getElementModelID());

				if (map.get(processInstanceID) == null) {

					List<ActivityInstance> list = new ArrayList<ActivityInstance>();
					list.add(activityInstance);
					map.put(processInstanceID, list);

				} else {
					instancesByIDMap.get(activityInstance.getElementModelID()).get(processInstanceID).add(activityInstance);

				}
			}

		}
	}

	private void traverseProcessGraph(String processInstanceID, ExtensibleElements element, Map<String, Map<String, List<ActivityInstance>>> instancesByIDMap) {

		List<ActivityInstance> activityInstances = instancesByIDMap.get(element.getId()).get(processInstanceID);

		Activity loopActivity = helper.loopParentOf(element);

		for (ActivityInstance activityInstance : activityInstances) {

			if (activityInstance.getCompositePrimaryKey().getActivityInstanceID().equals(initialRewindingPointInstanceID)) {
				initialRewindingPoint = (Activity) element;
				initialRewindingPoint.setInstanceID(initialRewindingPointInstanceID);
				initialRewindingPoint.setState(activityInstance.getActivityState().name());
				// yussupvr: add XPath
				initialRewindingPoint.setXpath(activityInstance.getActivityXPath());
			}

			ExtElementsElementInstance elementInstance = null;

			if (element instanceof While || element instanceof ForEach) {

				LoopElementInstance loopElementInstance = CommonFactory.eINSTANCE.createLoopElementInstance();
				elementInstance = loopElementInstance;
				loopElementInstance.setInstanceID(activityInstance.getCompositePrimaryKey().getActivityInstanceID());
				loopElementInstance.setTimestamp(activityInstance.getTimestamp());
				loopElementInstance.setState(activityInstance.getActivityState().name());
				loopElementInstance.setXpath(activityInstance.getActivityXPath());

				long numberofLoopIterations = eventRegistry.countLoopIterationCompleteEvents(activityInstance.getCompositePrimaryKey().getActivityInstanceID());
				loopElementInstance.setLoopCounter(numberofLoopIterations);

				if (element.getInstanceBuffer().get(processInstanceID) == null) {

					EStringToProcessInstanceMapImpl entry = new EStringToProcessInstanceMapImpl();
					entry.setTypedKey(processInstanceID);
					entry.getValue().put(activityInstance.getCompositePrimaryKey().getActivityInstanceID(), loopElementInstance);
					element.getInstanceBuffer().add(entry);

				} else {
					element.getInstanceBuffer().get(processInstanceID).put(activityInstance.getCompositePrimaryKey().getActivityInstanceID(), loopElementInstance);
				}

			} else {

				ExtElementsElementInstance extElementsElementInstance = CommonFactory.eINSTANCE.createExtElementsElementInstance();
				elementInstance = extElementsElementInstance;
				extElementsElementInstance.setInstanceID(activityInstance.getCompositePrimaryKey().getActivityInstanceID());
				extElementsElementInstance.setTimestamp(activityInstance.getTimestamp());
				extElementsElementInstance.setState(activityInstance.getActivityState().name());
				extElementsElementInstance.setXpath(activityInstance.getActivityXPath());

				if (element.getInstanceBuffer().get(processInstanceID) == null) {
					EStringToProcessInstanceMapImpl entry = new EStringToProcessInstanceMapImpl();
					entry.setTypedKey(processInstanceID);
					entry.getValue().put(activityInstance.getCompositePrimaryKey().getActivityInstanceID(), extElementsElementInstance);
					element.getInstanceBuffer().add(entry);

				} else {

					element.getInstanceBuffer().get(processInstanceID).put(activityInstance.getCompositePrimaryKey().getActivityInstanceID(), extElementsElementInstance);
				}
			}

			if (loopActivity != null) {
				Collection<ElementInstance> loopElementInstances = loopActivity.getInstanceBuffer().get(processInstanceID).values();
				fillParentLoopElementInstance(elementInstance, loopElementInstances);
			}

		}

		if (element.eContents() != null && !element.eContents().isEmpty()) {

			for (EObject child : element.eContents()) {
				if (child instanceof ExtensibleElements && !(child instanceof Correlations)) {
					traverseProcessGraph(processInstanceID, (ExtensibleElements) child, instancesByIDMap);
				}
			}
		}

	}

	private void fillParentLoopElementInstance(ExtElementsElementInstance elementInstance, Collection<ElementInstance> loopElementInstances) {

		// get loop instance which is the nearest to elementInstance

		LoopElementInstance currentParent = null;

		for (ElementInstance currentElementInstance : loopElementInstances) {

			if (currentElementInstance instanceof LoopElementInstance) {

				LoopElementInstance loopElementInstance = (LoopElementInstance) currentElementInstance;

				if (currentParent == null) {
					currentParent = loopElementInstance;
				} else {

					long diff1 = elementInstance.getTimestamp() - loopElementInstance.getTimestamp();
					long diff2 = elementInstance.getTimestamp() - currentParent.getTimestamp();

					// Timestamp of current loop element instance must be
					// smaller in
					// order to be a parent loop activity instance of element
					// instance.
					// Furthermore, the difference of the element instance and
					// the
					// loop element instance must be smaller than the difference
					// between the previously found
					// loop element instance and the element instance, i.e., we
					// have
					// to find the loop element instance which has been executed
					// more timely to the element instance
					if (loopElementInstance.getTimestamp() < elementInstance.getTimestamp() && diff1 < diff2) {
						currentParent = loopElementInstance;
					}

				}
			}

		}

		elementInstance.setParentLoopInstance(currentParent);
		fillLoopIteration(currentParent, elementInstance);

	}

	private void fillLoopIteration(LoopElementInstance parent, ExtElementsElementInstance elementInstance) {

		List<ActivityInstanceEvent> orderedEvents = eventRegistry.getLoopIterationCompleteEvents(parent.getInstanceID(), true);

		ActivityInstanceEvent previousEvent = null;
		int loopIterationCounter = -1;

		for (ActivityInstanceEvent event : orderedEvents) {

			loopIterationCounter++;

			if (elementInstance.getTimestamp() < event.getTimestamp()) {

				if (previousEvent == null) {
					previousEvent = event;
					elementInstance.setLoopIteration(loopIterationCounter);
				} else {

					long diff1 = event.getTimestamp() - elementInstance.getTimestamp();
					long diff2 = previousEvent.getTimestamp() - elementInstance.getTimestamp();

					if (elementInstance.getTimestamp() < event.getTimestamp() && diff1 < diff2) {

						previousEvent = event;
						elementInstance.setLoopIteration(loopIterationCounter);

					}

				}

			}

		}

	}

}
