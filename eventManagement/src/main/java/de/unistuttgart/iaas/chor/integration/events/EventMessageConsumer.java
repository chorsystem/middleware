package de.unistuttgart.iaas.chor.integration.events;

import org.apache.camel.Body;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.InstanceEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.ProcessEventMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.unistuttgart.iaas.chor.commons.messaging.EventMessageProducer;
import de.unistuttgart.iaas.chor.commons.messaging.MessageProducer;
import de.unistuttgart.iaas.chor.event.messages.ChangeVariableValueMessage;
import de.unistuttgart.iaas.chor.event.messages.ChorRegisterRequestMessage;
import de.unistuttgart.iaas.chor.event.messages.RegisterDeploymentSCEInstanceIDs;
import de.unistuttgart.iaas.chor.event.messages.RegisterUndeploymentSCEInstanceIDs;
import de.unistuttgart.iaas.chor.integration.artifact.registry.ArtifactRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.service.registry.ServiceRegistry;

public class EventMessageConsumer {

	private Logger logger = null;
	
	private EventRegistry eventRegistry;
	private ServiceRegistry serviceRegistry;
	private ManagementRegistry managementRegistry;
	private ArtifactRegistry artifactRegistry;
	
	private EventMessageProducer eventMessageProducer;
	
	private MessageProducer messageProducer;
	
	public EventMessageConsumer() {
	
	}

	public void init(){
		this.logger = LoggerFactory.getLogger(EventMessageConsumer.class);
		EventManager.getInstance().startup(eventRegistry, serviceRegistry, managementRegistry, artifactRegistry, eventMessageProducer, messageProducer);
	}
	
	public void onMessage(@Body Object obj) {
		
		if (obj instanceof InstanceEventMessage) {
			InstanceEventMessage message = (InstanceEventMessage) obj;

			EventManager.getInstance().handleInstanceEventMessage(message);
		} else if (obj instanceof ProcessEventMessage) {
			ProcessEventMessage message = (ProcessEventMessage) obj;

			EventManager.getInstance().handleProcessEventMessage(message);

		}
		else if(obj instanceof ChorRegisterRequestMessage){
			
			ChorRegisterRequestMessage message = (ChorRegisterRequestMessage) obj;

			EventManager.getInstance().registerBreakpointInformation(message);
			
		}
		
		else if (obj instanceof RegisterDeploymentSCEInstanceIDs){
			
			RegisterDeploymentSCEInstanceIDs ids = (RegisterDeploymentSCEInstanceIDs) obj;
			EventManager.getInstance().registerDeploymentSCEInstanceIDs(ids);
			
		}
			else if (obj instanceof RegisterUndeploymentSCEInstanceIDs){
			
			RegisterUndeploymentSCEInstanceIDs ids = (RegisterUndeploymentSCEInstanceIDs) obj;
			EventManager.getInstance().registerUndeploymentSCEInstanceIDs(ids);
			
		}
		
		
	}

	public EventRegistry getEventRegistry() {
		return eventRegistry;
	}

	public void setEventRegistry(EventRegistry eventRegistry) {
		this.eventRegistry = eventRegistry;
	}

	public ServiceRegistry getServiceRegistry() {
		return serviceRegistry;
	}

	public void setServiceRegistry(ServiceRegistry serviceRegistry) {
		this.serviceRegistry = serviceRegistry;
	}

	public ManagementRegistry getManagementRegistry() {
		return managementRegistry;
	}

	public void setManagementRegistry(ManagementRegistry managementRegistry) {
		this.managementRegistry = managementRegistry;
	}

	public EventMessageProducer getEventMessageProducer() {
		return eventMessageProducer;
	}

	public void setEventMessageProducer(EventMessageProducer eventMessageProducer) {
		this.eventMessageProducer = eventMessageProducer;
	}

	public ArtifactRegistry getArtifactRegistry() {
		return artifactRegistry;
	}

	public void setArtifactRegistry(ArtifactRegistry artifactRegistry) {
		this.artifactRegistry = artifactRegistry;
	}

	public MessageProducer getMessageProducer() {
		return messageProducer;
	}

	public void setMessageProducer(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}
	
	
	
}
