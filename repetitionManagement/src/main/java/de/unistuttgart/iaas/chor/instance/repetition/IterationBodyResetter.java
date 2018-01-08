package de.unistuttgart.iaas.chor.instance.repetition;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.chor.FlowActivityLink;
import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance;
import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.Correlation;
import org.eclipse.bpel4chor.model.pbd.Correlations;
import org.eclipse.bpel4chor.model.pbd.ExtensibleElements;
import org.eclipse.bpel4chor.model.pbd.Flow;
import org.eclipse.bpel4chor.model.pbd.ForEach;
import org.eclipse.bpel4chor.model.pbd.Invoke;
import org.eclipse.bpel4chor.model.pbd.Process;
import org.eclipse.bpel4chor.model.pbd.Receive;
import org.eclipse.bpel4chor.model.pbd.Reply;
import org.eclipse.emf.ecore.EObject;

import de.unistuttgart.iaas.chor.commons.messaging.EventMessageProducer;
import de.unistuttgart.iaas.chor.event.messages.ResetElementEvent;
import de.unistuttgart.iaas.chor.event.messages.ResetToExecutingElementEvent;
import de.unistuttgart.iaas.chor.instance.repetition.util.Helper;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLink;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.Iteration;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.RewindingPointsEntry;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;

public class IterationBodyResetter {

	private EventRegistry eventRegistry;
	private EventMessageProducer producer;
	private Helper helper = new Helper();

	public IterationBodyResetter(EventRegistry eventRegistry, EventMessageProducer producer) {
		this.eventRegistry = eventRegistry;
		this.producer = producer;
	}

	public void resetIterationBody(ChoreographyInstance choreographyInstance, Choreography choreography, Iteration iteration) {

		List<RewindingPointsEntry> entries = eventRegistry.getRewindingPointEntries(iteration.getRewindingPoints());

		for (RewindingPointsEntry entry : entries) {

			ProcessInstance processInstance = entry.getProcessInstance();
			ProcessModel processModel = eventRegistry.getProcessModelOfProcessInstance(processInstance);

			Process process = helper.getProcessByModelID(choreography, processModel.getModelId());

			ActivityInstance activityInstance = entry.getActivityInstances().get(0);
			Activity startActivity = helper.getActivtiyByModelID(process.getActivity(), activityInstance.getElementModelID());

			if (entry.isCompleteRewind()) {
				resetProcessInstanceCompletely(choreography, process, process.getActivity(), choreographyInstance.getChoreographyInstanceID().toString());

				ResetElementEvent evt = new ResetElementEvent();
				evt.setChoreographyInstanceID(choreographyInstance.getChoreographyInstanceID().toString());
				evt.setTimestamp(System.currentTimeMillis());
				// evt.setElementInstanceID();
				evt.setElementModelID(processModel.getModelId());
			
				
				producer.sendMessage(evt, "Object");
				
				eventRegistry.registerProcessInstanceEvent(processInstance.getSceInstanceRef(), "ResetElementEvent", 0L, evt, evt.getTimestamp(), processInstance, "");
				
			} else {
				resetProcessInstance(choreography, processInstance, process, startActivity, choreographyInstance.getChoreographyInstanceID().toString());
			}

		}

		for (MessageLinkInstance messageLinkInstance : iteration.getMessageLinkInstances()) {

			MessageLink messageLink = eventRegistry.getMessageLinkOfMessageLinkInstance(messageLinkInstance);

			CMessageLink cMessageLink = helper.getMessageLinkByModelID(choreography, messageLink.getMessageLinkID());

			resetMessageLinkInstance(cMessageLink, choreographyInstance.getChoreographyInstanceID().toString());
		}

	}

	// TODO: what about resetting the instance itself?
	// is a new instance generated when a message comes again ? --> probably no,
	// but what
	// happens if the instance is never called again because it is now on the
	// dead path?
	private void resetProcessInstance(Choreography choreography, ProcessInstance processInstance, Process process, Activity startActivity, String choreographyInstanceID) {

		List<ExtensibleElements> visitedList = new ArrayList<ExtensibleElements>();

		// Activity loopActivity = helper.loopParentOf(initialStartActivity);

		// if (loopActivity != null) {
		// handleLoopActivities(choreography, loopActivity,
		// initialStartActivity, visitedList, result);
		//
		// } else {
		Stack<ExtensibleElements> s = new Stack<ExtensibleElements>();
		s.push(startActivity);
		
		while (!s.isEmpty()) {

			ExtensibleElements current = s.pop();


			if (!visitedList.contains(current)) {
				visitedList.add(current);

				ResetElementEvent evt = new ResetElementEvent();
				evt.setChoreographyInstanceID(choreographyInstanceID);
				evt.setTimestamp(System.currentTimeMillis());
				// evt.setElementInstanceID();
				evt.setProcessInstanceID(process.getInstanceID());
				evt.setElementModelID(current.getId()); 
				
				ExtElementsElementInstance e = (ExtElementsElementInstance) current.getInstanceBuffer().get(process.getInstanceID()).get(0).getValue();
				
				evt.setElementModelXPath(e.getXpath());
				
				producer.sendMessage(evt, "Object");
				eventRegistry.registerProcessInstanceEvent(processInstance.getSceInstanceRef(), "ResetElementEvent", 0L, evt, evt.getTimestamp(), processInstance, "");
				
				resetParentActivity(processInstance, visitedList, current, choreographyInstanceID);
				
				List<ExtensibleElements> successors = determineSuccessorActivities(choreography.getFlowActivityLinks(), current);

				for (ExtensibleElements element : successors) {
					s.push(element);
				}

			}
		}
	}

	private void resetParentActivity(ProcessInstance processInstance, List<ExtensibleElements> visitedList, ExtensibleElements current, String choreographyInstanceID){
		
		
		
		
		if(!(current.eContainer() instanceof Process) ){
		
			ExtensibleElements parent = (ExtensibleElements)current.eContainer();
			
			if(!visitedList.contains(parent)){
				
				ResetToExecutingElementEvent evt = new ResetToExecutingElementEvent();
				evt.setChoreographyInstanceID(choreographyInstanceID);
				evt.setTimestamp(System.currentTimeMillis());
				evt.setElementModelID(parent.getId());
				evt.setElementModelXPath(parent.getXpath());
				producer.sendMessage(evt, "Object");
				eventRegistry.registerProcessInstanceEvent(processInstance.getSceInstanceRef(), "ResetElementEvent", 0L, evt, evt.getTimestamp(), processInstance, "");
				
				
			}
			resetParentActivity(processInstance, visitedList, parent, choreographyInstanceID);
		}
		
		
	
		
		
		
		
		
	}
	
	
	
	private void resetProcessInstanceCompletely(Choreography choreography, Process process, ExtensibleElements element, String choreographyInstanceID) {

		ResetElementEvent evt = new ResetElementEvent();
		evt.setChoreographyInstanceID(choreographyInstanceID);
		evt.setTimestamp(System.currentTimeMillis());
		// evt.setElementInstanceID();
		evt.setElementModelID(element.getId());
		producer.sendMessage(evt, "Object");

		if (element.eContents() != null && !element.eContents().isEmpty()) {

			for (EObject eObject : element.eContents()) {

				if (eObject instanceof ExtensibleElements) {

					resetProcessInstanceCompletely(choreography, process, (ExtensibleElements) eObject, choreographyInstanceID);

				}
			}

		}

	}

	private void resetMessageLinkInstance(CMessageLink cMessageLink, String choreographyInstanceID) {

		ResetElementEvent evt = new ResetElementEvent();
		evt.setChoreographyInstanceID(choreographyInstanceID);
		evt.setTimestamp(System.currentTimeMillis());
		// evt.setElementInstanceID();
		evt.setElementModelID(cMessageLink.getId());
		producer.sendMessage(evt, "Object");

	}


	private List<ExtensibleElements> determineSuccessorActivities(List<FlowActivityLink> links, EObject source) {

		List<ExtensibleElements> successors = new ArrayList<ExtensibleElements>();

		EObject element = source;
		EObject container = element.eContainer();

		// While there is a container the container is not a process
		if (container != null && !(container instanceof Process)) {

			if (container instanceof Flow) {

				if (element.eContents() != null && !element.eContents().isEmpty() && !(element instanceof Invoke) && !(element instanceof Receive) && !(element instanceof Reply)) {

					if (element.eContents().get(0) instanceof ExtensibleElements) {
						ExtensibleElements ext = (ExtensibleElements) element.eContents().get(0);

						if (!(ext instanceof Correlations) && !(ext instanceof Correlation)) {
							successors.add(ext);
						}

					} else {
						return determineSuccessorActivities(links, element.eContents().get(0));
					}

				} else {
					successors.addAll(helper.getTargetActivities(links, (ExtensibleElements) element));

				}

				if (!successors.isEmpty()) {
					return successors;

				}

			}

			if (!(container instanceof Flow)) {

				// Get the index of the element in the container
				int elementIndex = container.eContents().indexOf(element);

				// TODO: onmessage
				if (!element.eContents().isEmpty() && !(element instanceof Invoke) && !(element instanceof Receive) && !(element instanceof Reply)) {

					if (element.eContents().get(0) instanceof ExtensibleElements) {

						ExtensibleElements ext = (ExtensibleElements) element.eContents().get(0);

						if (!(ext instanceof Correlations) && !(ext instanceof Correlation)) {
							successors.add(ext);
						}
					}

					else {
						return determineSuccessorActivities(links, element.eContents().get(0));
					}

					return successors;

				}

				else if (container.eContents().size() > elementIndex + 1) {

					if (container.eContents().get(elementIndex + 1) instanceof ExtensibleElements) {

						ExtensibleElements ext = (ExtensibleElements) container.eContents().get(elementIndex + 1);
						if (!(ext instanceof Correlations) && !(ext instanceof Correlation)) {
							successors.add(ext);
						}
					}

					else {
						return determineSuccessorActivities(links, container.eContents().get(elementIndex + 1));
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

					if (eobj instanceof ExtensibleElements && !(eobj instanceof Correlations) && !(eobj instanceof Correlation)) {
						successors.add((ExtensibleElements) eobj);
					} else {
						return determineSuccessorActivities(links, eobj);
					}

					return successors;

				}

			}

		}
		successors.clear();
		return successors;
	}

}
