package de.unistuttgart.iaas.chor.instance.repetition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.ExtensibleElements;
import org.eclipse.bpel4chor.model.pbd.Process;
import org.eclipse.emf.ecore.EObject;

import de.unistuttgart.iaas.chor.instance.repetition.util.Helper;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLink;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;

public class ChorInstanceGraphEventMapperV2 {

	private Helper helper = new Helper();
	
	private EventRegistry eventRegistry;
	
	private String initialStartParticipantInstanceID;
	private String initialRewindingPointInstanceID;
	
	private Choreography choreographyInstance;
	private Process initialParticipant;
	private Activity initialRewindingPoint;
	
	private Map<Process, ProcessInstance> processInstances = new HashMap<Process, ProcessInstance>();
	private Map<String, ActivityInstance> activityInstances = new HashMap<String, ActivityInstance>();
	private Map<CMessageLink, MessageLinkInstance> messagelinkInstances = new HashMap<CMessageLink, MessageLinkInstance>();
	
	
	public ChorInstanceGraphEventMapperV2(EventRegistry eventRegistry){
		this.eventRegistry = eventRegistry;
	}
	
	public Choreography getChoreographyInstance(){
		return choreographyInstance;
	}
	
	public ProcessInstance getProcessInstance(Process process){
		return processInstances.get(process);
	}
	
	public ActivityInstance getActivityInstance(String elementModelID){
		return activityInstances.get(elementModelID);
	}
	
	public MessageLinkInstance getMessageLinkInstance(CMessageLink messageLink){
		return messagelinkInstances.get(messageLink);
	}
	
	public Process getInitialParticipant() {
		return initialParticipant;
	}

	public Activity getInitialRewindingPoint() {
		return initialRewindingPoint;
	}

	public Choreography fillChoreographyInstanceGraph(Choreography choreography, String choreographyInstanceID, String initialStartParticipantInstanceID, String initialRewindingPointInstanceID){
		
		
		this.initialStartParticipantInstanceID = initialStartParticipantInstanceID;
		this.initialRewindingPointInstanceID = initialRewindingPointInstanceID;
		ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(Long.valueOf(choreographyInstanceID));
		
		List<ProcessInstance> processInstances = eventRegistry.getParticipantsFromChoreographyInstance(choreographyInstance);
		
		for(ProcessInstance processInstance: processInstances){
			fillProcessInstanceGraph(choreography, processInstance);
		}
		
		List<MessageLinkInstance> messageLinkInstances = eventRegistry.getMessageLinkInstancesOfChoreographyModel(choreographyInstance);
		
		for(MessageLinkInstance messageLinkInstance: messageLinkInstances){
			
			fillMessageLinkInstance(choreography, messageLinkInstance);
			
		}
	
		return choreography;
	}
	
	
	private void fillProcessInstanceGraph(Choreography choreography, ProcessInstance processInstance){
		
		List<ActivityInstance> activityInstanceList = eventRegistry.getActivityInstancesOfProcessInstance(processInstance);
		buildMap(activityInstanceList, activityInstances);
		
		ProcessModel processModel = eventRegistry.getProcessModelOfProcessInstance(processInstance);
		Process process = helper.getProcessByModelID(choreography, processModel.getModelId());
		
		processInstances.put(process, processInstance);
		
		
		if(processInstance.getCompositePrimaryKey().getProcessInstanceID().equals(initialStartParticipantInstanceID)){
			initialParticipant = process;
		}
		
		traverseGraph(process.getActivity(), activityInstances);
		
		
	}
	
	private void fillMessageLinkInstance(Choreography choreography, MessageLinkInstance messageLinkInstance){
	
		MessageLink messageLink = eventRegistry.getMessageLinkOfMessageLinkInstance(messageLinkInstance);
		CMessageLink cMessageLink = helper.getMessageLinkByModelID(choreography, messageLink.getMessageLinkID());
		cMessageLink.setState(messageLinkInstance.getState().toString());
		
		messagelinkInstances.put(cMessageLink, messageLinkInstance);
		
		
	}
	
	
	private Map<String, ActivityInstance> buildMap(List<ActivityInstance> activityInstances, Map<String, ActivityInstance> instanceByIDMap){
		
		for(ActivityInstance activityInstance: activityInstances){
			instanceByIDMap.put(activityInstance.getElementModelID(), activityInstance);
			
		}
		
		return instanceByIDMap;
	}
	
	
	
	private void traverseGraph(ExtensibleElements element, Map<String, ActivityInstance> instanceByIDMap){
		
		ActivityInstance activityInstance = instanceByIDMap.get(element.getId());
		
		if(activityInstance.getCompositePrimaryKey().getActivityInstanceID().equals(initialRewindingPointInstanceID)){
			initialRewindingPoint = (Activity)element;
		}
		
		if(activityInstance != null){
			element.setState(activityInstance.getActivityState().toString());
		}
	
		
		if(element.eContents() != null && !element.eContents().isEmpty()){
			
			for (EObject child : element.eContents()) {
				if (child instanceof ExtensibleElements) {
					traverseGraph((ExtensibleElements)child, instanceByIDMap);
				}
			}
		}
	
	}
}
