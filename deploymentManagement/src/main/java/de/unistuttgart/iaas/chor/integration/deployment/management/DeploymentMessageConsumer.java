package de.unistuttgart.iaas.chor.integration.deployment.management;

import java.util.Map;

import javax.print.attribute.standard.Chromaticity;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.ode.deployapi.DeployUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.unistuttgart.iaas.chor.integration.artifact.registry.ArtifactRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.service.registry.ServiceRegistry;
import de.unistuttgart.iaas.chor.messages.ChorDeploymentMessage;
import de.unistuttgart.iaas.chor.messages.ChorUndeploymentMessage;

public class DeploymentMessageConsumer {

	private Logger logger = null;

	private EventRegistry eventRegistry;
	private ArtifactRegistry artifactRegistry;
	private ServiceRegistry serviceRegistry;

	public DeploymentMessageConsumer() {

	}

	public void init() {
		this.logger = LoggerFactory.getLogger(DeploymentMessageConsumer.class);
		DeploymentManager.getInstance().startup(eventRegistry, artifactRegistry, serviceRegistry);
	}

	public void onMessage(@Headers Map<String, Object> headers, @Body ChorDeploymentMessage chorDeploymentMessage) {

		    chorDeploymentMessage = DeploymentManager.getInstance().checkDeployment(headers, chorDeploymentMessage);

	}
	
	public ChorUndeploymentMessage prepareUndeployment(@Headers Map<String, Object> headers, @Body ChorUndeploymentMessage chorUndeploymentMessage){
		
		return DeploymentManager.getInstance().prepareUndeployment(chorUndeploymentMessage);
	}
	
	public void finishDeployment(@Headers Map<String, Object> headers, @Body CxfPayload payload){
	
		DeploymentManager.getInstance().finishDeployment(headers, payload);
	}
	
	
	public void notifyEditor(@Headers Map<String, Object> headers, @Body ChorDeploymentMessage chorDeploymentMessage){
		DeploymentManager.getInstance().notifyEditor(chorDeploymentMessage);
	}
	
	public EventRegistry getEventRegistry() {
		return eventRegistry;
	}

	public void setEventRegistry(EventRegistry eventRegistry) {
		this.eventRegistry = eventRegistry;
	}

	public ArtifactRegistry getArtifactRegistry() {
		return artifactRegistry;
	}

	public void setArtifactRegistry(ArtifactRegistry artifactRegistry) {
		this.artifactRegistry = artifactRegistry;
	}

	public ServiceRegistry getServiceRegistry() {
		return serviceRegistry;
	}

	public void setServiceRegistry(ServiceRegistry serviceRegistry) {
		this.serviceRegistry = serviceRegistry;
	}
	
	

}
