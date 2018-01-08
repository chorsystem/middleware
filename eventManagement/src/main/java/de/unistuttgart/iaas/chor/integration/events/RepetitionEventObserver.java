package de.unistuttgart.iaas.chor.integration.events;

import org.apache.ode.bpel.extensions.comm.messages.engineOut.InstanceEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Context_Migrated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Iteration_Prepared;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Reexecution_Prepared;
import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantSet;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.CLinkable;
import org.eclipse.bpel4chor.model.pbd.Process;
import org.eclipse.bpel4chor.model.pbd.impl.SequenceImpl;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.commons.messaging.EventMessageProducer;
import de.unistuttgart.iaas.chor.commons.util.EMFUtils;
import de.unistuttgart.iaas.chor.commons.util.Utils;
import de.unistuttgart.iaas.chor.event.messages.ChorInstanceResetEvent;
import de.unistuttgart.iaas.chor.instance.repetition.ChorInstanceGraphEventMapper;
import de.unistuttgart.iaas.chor.instance.repetition.IterationBodyResetter;
import de.unistuttgart.iaas.chor.integration.artifact.registry.ArtifactRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.SCEInstanceRef;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.Iteration;

public class RepetitionEventObserver implements EventObserver{

	private final EventRegistry eventRegistry;
	private final ArtifactRegistry artifactRegistry;
	private final EventMessageProducer eventMessageProducer;
	
	private RepetitionEventObserver(EventRegistry eventRegistry, ArtifactRegistry artifactRegistry, EventMessageProducer eventMessageProducer) {
		this.eventRegistry = eventRegistry;		
		this.eventMessageProducer = eventMessageProducer;
		this.artifactRegistry = artifactRegistry;
	}
	
	public static void attach(EventManager manager, ArtifactRegistry artifactRegistry, EventRegistry eventRegistry, EventMessageProducer eventMessageProducer) {
		RepetitionEventObserver observer = new RepetitionEventObserver(eventRegistry, artifactRegistry, eventMessageProducer);
		observer.init(manager);
	}
	
	public void init(EventManager manager) {		
		manager.registerObserverForEvent(this, Instance_Iteration_Prepared.class);
		manager.registerObserverForEvent(this, Instance_Context_Migrated.class);
		manager.registerObserverForEvent(this, Instance_Reexecution_Prepared.class);

	}
	
	@Override
	public void onEvent(InstanceEventMessage evt) {
	
		if(evt instanceof Instance_Iteration_Prepared){
			
			ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(evt.getChorId());
			Iteration iteration = eventRegistry.getLastestIteration(choreographyInstance);	
			calculateIterationBody(choreographyInstance, iteration, (Instance_Iteration_Prepared) evt);
		}
		if(evt instanceof Instance_Context_Migrated){
			ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(evt.getChorId());
			
			String processInstanceID = Utils.createProcessInstanceKey(evt.getSceInstanceId(), evt.getProcessModelId(), evt.getProcessID());
			ProcessInstance processInstance = eventRegistry.getProcessInstance(processInstanceID);
			Iteration iteration = eventRegistry.getLastestIteration(choreographyInstance);
			eventRegistry.updateIteration(iteration, processInstance);
		}
		if(evt instanceof Instance_Reexecution_Prepared){
			
			ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(evt.getChorId());
			Iteration iteration = eventRegistry.getLastestIteration(choreographyInstance);	
			calculateIterationBody(choreographyInstance, iteration, (Instance_Reexecution_Prepared) evt);
		
		}
	}
	
	private void calculateIterationBody(ChoreographyInstance choreographyInstance, Iteration iteration, InstanceEventMessage evt){
		

		boolean prepared = eventRegistry.allParticipantInstancesPreparedForIteration(choreographyInstance);
		
		if(prepared){
			
			ChoreographyModel choreographyModel = eventRegistry.getChoreographyModelOfChoreographyInstance(choreographyInstance);			
			byte[] choreographyModelFile = artifactRegistry.getChoreographyModelGraph(choreographyModel.getChoreographyModelId());
			Choreography choreography = EMFUtils.getChoreographyModel(choreographyModelFile);
			ChorInstanceGraphEventMapper mapper = new ChorInstanceGraphEventMapper(eventRegistry);
			IterationBodyResetter iterationBodyResetter = new IterationBodyResetter(eventRegistry, eventMessageProducer);
			
			// @yussupvr: check the view (choreography level or process level)
			String view = iteration.getView();
			
			// @yussupvr: update the process model to the refined version within the choreography
			// in case the iteration was triggered from the process level of view
			//if (view.equals(Constants.VIEW_LEVEL_PROCESS)) {
				
				String startParticipant = iteration.getInitialStartParticipant().getCompositePrimaryKey().getProcessInstanceID();
				ProcessInstance processInstance = eventRegistry.getProcessInstance(startParticipant);
				ProcessModel processMId = eventRegistry.getProcessModelOfProcessInstance(processInstance);
				de.unistuttgart.iaas.chor.integration.artifact.registry.domain.ProcessModel refinedProcessModel = artifactRegistry.getProcessModel(processMId.getModelId());
				byte[] refinedProcessModelFile = refinedProcessModel.getProcessModelFile();
				Process refinedProcess = EMFUtils.getRefinedProcess(refinedProcessModelFile);
				SequenceImpl main = null;
				if (refinedProcess.getActivity() instanceof SequenceImpl) {
					main = (SequenceImpl) refinedProcess.getActivity();
				}
				
				for (CParticipant participant : choreography.getParticipants()) {
					Process p = participant.getProcess();				
					if (p.getId().equals(refinedProcess.getId())) {
						participant.setProcess(refinedProcess);
						for (CMessageLink ml : choreography.getMessageLinks()) {
							Activity sendActivity = (Activity) ml.getSendActivity();
							Activity receiveActivity = (Activity) ml.getReceiveActivity();
							if (main != null) {
								for (Activity a : main.getActivity()) {
									String currentID = a.getId(); 
									if (currentID != null) {
										if (currentID.equals(sendActivity.getId())) {
											ml.setSendActivity((CLinkable) a);
										}
										if (currentID.equals(receiveActivity.getId())) {
											ml.setReceiveActivity((CLinkable) a);
										}									
									}								
								}
							}
						}
					}
				}
				
				for (CParticipantSet participantSet : choreography.getParticipantSets()) {
					if (participantSet.getProcess().getId().equals(refinedProcess.getId())) {
						participantSet.setProcess(refinedProcess);
					}
				}
			//}
			
			choreography = mapper.fillChoreographyInstanceGraph(choreography, choreographyInstance.getChoreographyInstanceID().toString(), iteration.getInitialStartParticipant().getCompositePrimaryKey().getProcessInstanceID(), iteration.getInitialRewindingPoint().getCompositePrimaryKey().getActivityInstanceID());
			iterationBodyResetter.resetIterationBody(choreographyInstance, choreography, iteration);
			
			ChorInstanceResetEvent chorInstanceResetEvent = new ChorInstanceResetEvent();
			chorInstanceResetEvent.setIterationID(iteration.getIterationID());
			chorInstanceResetEvent.setChoreographyInstanceID(choreographyInstance.getChoreographyInstanceID().toString());
			chorInstanceResetEvent.setTimestamp(System.currentTimeMillis());
			
			
			eventMessageProducer.sendMessage(chorInstanceResetEvent, "Object");
			
		}
		
		
	}
	
	
	
}
