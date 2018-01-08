package de.unistuttgart.iaas.chor.integration.events;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.namespace.QName;

import org.apache.ode.bpel.extensions.comm.messages.engineIn.RegisterRequestMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.InstanceEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.ProcessEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Process_Active;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Process_Deployed;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Process_Disabled;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Process_Retired;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Process_Undeployed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.unistuttgart.iaas.chor.commons.messaging.EventMessageProducer;
import de.unistuttgart.iaas.chor.commons.messaging.MessageProducer;
import de.unistuttgart.iaas.chor.event.messages.ChorRegisterRequestMessage;
import de.unistuttgart.iaas.chor.event.messages.RegisterDeploymentSCEInstanceIDs;
import de.unistuttgart.iaas.chor.event.messages.RegisterUndeploymentSCEInstanceIDs;
import de.unistuttgart.iaas.chor.integration.artifact.registry.ArtifactRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.SCEInstanceRef;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;
import de.unistuttgart.iaas.chor.integration.service.registry.ServiceRegistry;
import de.unistuttgart.iaas.chor.messages.ChorBreakpointsRegisteredEventMessage;
import de.unistuttgart.iaas.chor.messages.ChorDeploymentEventMessage;
import de.unistuttgart.iaas.chor.messages.ChorUndeploymentEventMessage;

/**
 * @author hahnml
 * @author weissas
 * 
 */
public class EventManager {

	private static EventManager _instance = null;

	private EventRegistry eventRegistry;

	private ServiceRegistry serviceRegistry;

	private ManagementRegistry managementRegistry;
	
	private ArtifactRegistry artifactRegistry;
	
	private EventMessageProducer eventMessageProducer;
	
	private MessageProducer messageProducer;

	private Logger logger = null;
	
	private Map<String, List<String>> deployedModelsSCEInstanceIDs= new HashMap<String, List<String>>();
	private Map<String, List<String>> undeployedModelsSCEInstanceIDs= new HashMap<String, List<String>>();

	private Map<Class<? extends ProcessEventMessage>, List<EventObserver>> eventObservers;

	private EventManager() {
		eventObservers = new HashMap<Class<? extends ProcessEventMessage>, List<EventObserver>>();
	}

	public static EventManager getInstance() {
		if (_instance == null) {
			_instance = new EventManager();
		}

		return _instance;
	}

	public void startup(EventRegistry eventRegistry, ServiceRegistry serviceRegistry, ManagementRegistry managementRegistry, ArtifactRegistry artifactRegistry, EventMessageProducer eventMessageProducer, MessageProducer messageProducer) {
		this.eventRegistry = eventRegistry;
		this.serviceRegistry = serviceRegistry;
		this.managementRegistry = managementRegistry;
		this.artifactRegistry = artifactRegistry;
		this.eventMessageProducer = eventMessageProducer;
		this.messageProducer = messageProducer;
		this.logger = LoggerFactory.getLogger(EventManager.class);
		
		//Register Observers for the events.
		InstanceEventStorer.attach(this, eventRegistry);
		BpelActivityStateObserver.attach(this, eventRegistry, eventMessageProducer, messageProducer);
		ProcessInstanceStateObserver.attach(this, eventRegistry);
		ChoreographyInstanceStateObserver.attach(this, eventRegistry, eventMessageProducer);
		RepetitionEventObserver.attach(_instance, artifactRegistry, eventRegistry, eventMessageProducer);
	}

	public void shutdown() {
		this.eventRegistry = null;
		this.serviceRegistry = null;
		this.managementRegistry = null;

		_instance = null;
	}

	public void handleProcessEventMessage(ProcessEventMessage message) {
		if (message instanceof Process_Active) {
			Process_Active msg = (Process_Active) message;
			String modelId = msg.getProcessModelId();
			String sceInstanceID = msg.getSceInstanceId();

			
			ProcessModel processModel = eventRegistry.getProcessModel(modelId);
		

			if(checkSCEInstanceIDs(processModel.getModelId(), sceInstanceID, deployedModelsSCEInstanceIDs)){
				
				// Update the status of the process
				eventRegistry.changeProcessModelStatus(modelId, ProcessStateEnum.Process_Active);
			
				processModel.setProcessState( ProcessStateEnum.Process_Active);
				checkChoreographyModelState(processModel);
			}

			
		} else if (message instanceof Process_Deployed) {
			Process_Deployed msg = (Process_Deployed) message;

			String modelId = msg.getProcessModelId();
			QName modelQName = msg.getProcessName();
			String sceInstanceId = msg.getSceInstanceId();

			// Persist the process model in the event registry
			ProcessModel processModel = eventRegistry.getOrCreateProcessModel(modelId, modelQName);

			// Get the SCE instance reference
			SCEInstanceRef sceInstanceRef = eventRegistry.getSCEInstanceRef(sceInstanceId);

			// Assign the process model to the SCE it is deployed on
			eventRegistry.assignProcessModel(sceInstanceRef, processModel, ((Process_Deployed) message).getDeploymentUnit());

			SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceId);

			serviceRegistry.assignEndpointURL(modelId, sceInstanceId, sceInstance.getEndpointBaseUrl());
			
			
		} else if (message instanceof Process_Disabled) {
			Process_Disabled msg = (Process_Disabled) message;

			String modelId = msg.getProcessModelId();

			// Update the status of the process
			eventRegistry.changeProcessModelStatus(modelId, ProcessStateEnum.Process_Disabled);
		} else if (message instanceof Process_Retired) {
			Process_Retired msg = (Process_Retired) message;
			String modelId = msg.getProcessModelId();

			// Update the status of the process
			eventRegistry.changeProcessModelStatus(modelId, ProcessStateEnum.Process_Retired);
		} else if (message instanceof Process_Undeployed) {
			Process_Undeployed msg = (Process_Undeployed) message;

			String sceInstanceId = msg.getSceInstanceId();
			String modelId = msg.getProcessModelId();

		
			if(checkSCEInstanceIDs(modelId, sceInstanceId, undeployedModelsSCEInstanceIDs)){
				
				ProcessModel processModel = eventRegistry.getProcessModel(modelId);
				processModel.setProcessState(ProcessStateEnum.Process_Undeployed);
				
				// Update the status of the process
				eventRegistry.changeProcessModelStatus(modelId, ProcessStateEnum.Process_Undeployed);

				// Unassign the process model from the SCE instance
				//eventRegistry.unassignProcessModel(sceInstanceId, modelId);
				
				checkChoreographyModelStateAfterUndeployment(processModel);
				
			}
			
			
			
			
		}
	}

	public void handleInstanceEventMessage(InstanceEventMessage message) {
		//Dynamically dispatch the event to the observers that are interested in it
		List<EventObserver> observers = eventObservers.get(message.getClass());
		if (observers != null) {
			for (EventObserver observer : observers) {
				observer.onEvent(message);
			}
		}
	}
	
	public void registerObserverForEvent(EventObserver observer, Class<? extends ProcessEventMessage> evt) {
		if (eventObservers.get(evt) == null) {
			eventObservers.put(evt, new ArrayList<EventObserver>());
		}
		eventObservers.get(evt).add(observer);
	}
	
	public void unregisterObserverForEvent(EventObserver observer, Class<? extends ProcessEventMessage> evt) {
		if (eventObservers.get(evt) != null) {
			eventObservers.get(evt).remove(observer);
		}
	}

	private void checkChoreographyModelState(ProcessModel processModel) {

		Collection<ChoreographyModel> choreographyModels = eventRegistry.getChoreographyModelsOfProcessModel(processModel);
		
		if (processModel.getProcessState().equals(ProcessStateEnum.Process_Deployed)) {

		

			for (ChoreographyModel choreographyModel : choreographyModels) {

				Collection<ProcessModel> processModels = eventRegistry.getProcessModelsOfChoreographyModel(choreographyModel.getChoreographyModelId());

				boolean allDeployed = true;

				for (ProcessModel processModel2 : processModels) {

					if (processModel2.getProcessState() == null || !processModel2.getProcessState().equals(ProcessStateEnum.Process_Deployed) || !processModel2.getProcessState().equals(ProcessStateEnum.Process_Active)) {
						allDeployed = false;
					}
				}
				if (allDeployed) {

					eventRegistry.changeChoreographyModelStatus(choreographyModel.getChoreographyModelId(), ChoreographyStateEnum.Choreography_Deployed);
					eventMessageProducer.sendMessage(choreographyModel.getChoreographyModelId() + " Deployed", "Text");

				}

			}
		} else if (processModel.getProcessState().equals(ProcessStateEnum.Process_Active)) {
		

			for (ChoreographyModel choreographyModel : choreographyModels) {

				Collection<ProcessModel> processModels = eventRegistry.getProcessModelsOfChoreographyModel(choreographyModel.getChoreographyModelId());

				boolean allActive = true;

				for (ProcessModel processModel2 : processModels) {

					if (processModel2.getProcessState() == null || !processModel2.getProcessState().equals(ProcessStateEnum.Process_Active)) {
						allActive = false;
					}
				}
				if (allActive) {

					eventRegistry.changeChoreographyModelStatus(choreographyModel.getChoreographyModelId(), ChoreographyStateEnum.Choreography_Active);
//					
//					ChorDeploymentResultMessage message = new ChorDeploymentResultMessage();
//					ChoreographyBundleResultType resultType = new ChoreographyBundleResultType();
//					resultType.setChoreographyModelID(choreographyModel.getChoreographyModelId());
//					message.setChoreographyBundle(resultType);
					
					ChorDeploymentEventMessage message = new ChorDeploymentEventMessage();
					message.setChoreographyModelID(choreographyModel.getChoreographyModelId());
					
					eventMessageProducer.sendMessage(message,"Text");

				}

			}
		}

	}
	
	
	private void checkChoreographyModelStateAfterUndeployment(ProcessModel processModel) {

		Collection<ChoreographyModel> choreographyModels = eventRegistry.getChoreographyModelsOfProcessModel(processModel);
		
		if (processModel.getProcessState().equals(ProcessStateEnum.Process_Undeployed)) {

			for (ChoreographyModel choreographyModel : choreographyModels) {

				Collection<ProcessModel> processModels = eventRegistry.getProcessModelsOfChoreographyModel(choreographyModel.getChoreographyModelId());

				boolean allUndeployed = true;

				for (ProcessModel processModel2 : processModels) {

					if (processModel2.getProcessState() == null || !processModel2.getProcessState().equals(ProcessStateEnum.Process_Undeployed)) {
						allUndeployed = false;
					}
				}
				if (allUndeployed) {

					eventRegistry.changeChoreographyModelStatus(choreographyModel.getChoreographyModelId(), ChoreographyStateEnum.Choreography_Undeployed);
					
					
					ChorUndeploymentEventMessage message = new ChorUndeploymentEventMessage();
					message.setChoreographyModelID(choreographyModel.getChoreographyModelId());
					
					eventMessageProducer.sendMessage(message,"Text");

				}

			}
		} 
	}
	
	
	
	public void registerBreakpointInformation(ChorRegisterRequestMessage chorRegisterRequestMessage){
		
		
		for(Entry<String, RegisterRequestMessage> entry: chorRegisterRequestMessage.getMessages().entrySet()){
		
			eventRegistry.updateBreakpointInformation(entry.getKey(), entry.getValue());
			
			
		}
		ChorBreakpointsRegisteredEventMessage message = new ChorBreakpointsRegisteredEventMessage();
		message.setChoreographyModelID(chorRegisterRequestMessage.getChoreographyModelID());
		
		eventMessageProducer.sendMessage(message, "Text");
		
	}
	
	public void notifyViaTextMessage(Object message){
		eventMessageProducer.sendMessage(message,"Text");
	}
	
	public void notifyViaObjectMessage(Object message, ProcessInstance processInstance){
		
		String sceInstanceID = eventRegistry.getSCEInstanceOfProcessInstance(processInstance.getCompositePrimaryKey().getProcessInstanceID());
		
		SCEInstance sceInstance = managementRegistry.getSceInstance(sceInstanceID);
		String managementQueueURL = sceInstance.getManagementQueueEndpoint();
		
		eventMessageProducer.sendMessage(message, "Object", managementQueueURL);

	}
	
	public void registerDeploymentSCEInstanceIDs(RegisterDeploymentSCEInstanceIDs ids){
		
		if(deployedModelsSCEInstanceIDs.containsKey(ids.getProcessModelID())){
			
			deployedModelsSCEInstanceIDs.get(ids.getProcessModelID()).addAll(ids.getSceInstanceIDs());
		}
		else{
			
			deployedModelsSCEInstanceIDs.put(ids.getProcessModelID(), ids.getSceInstanceIDs());
		}

	}
	
	public void registerUndeploymentSCEInstanceIDs(RegisterUndeploymentSCEInstanceIDs ids){
		
		if(undeployedModelsSCEInstanceIDs.containsKey(ids.getProcessModelID())){
			
			undeployedModelsSCEInstanceIDs.get(ids.getProcessModelID()).addAll(ids.getSceInstanceIDs());
		}
		else{
			
			undeployedModelsSCEInstanceIDs.put(ids.getProcessModelID(), ids.getSceInstanceIDs());
		}

	}
	
	
	private boolean checkSCEInstanceIDs(String processModelID, String sceInstanceID, Map<String, List<String>> sceInstanceIDMap){
		
		
			if(sceInstanceIDMap.containsKey(processModelID)){
				
				List<String> sceInstanceIDs = sceInstanceIDMap.get(processModelID);
				
				if(sceInstanceIDs.contains(sceInstanceID)){
					sceInstanceIDs.remove(sceInstanceID);
				}
				
				return sceInstanceIDs.isEmpty();
			}
			
			
		
		return false;
	}
		
}
