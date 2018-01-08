package de.unistuttgart.iaas.chor.sce.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.unistuttgart.iaas.chor.integration.artifact.registry.ArtifactRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstanceStatusEnum;
import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstanceTypeEnum;
import de.unistuttgart.iaas.chor.integration.service.registry.ServiceRegistry;
import de.unistuttgart.iaas.scemanager.messages.SceMessageBase;
import de.unistuttgart.iaas.scemanager.messages.sce.events.EngineInstance_Active;
import de.unistuttgart.iaas.scemanager.messages.sce.events.EngineInstance_Inactive;
import de.unistuttgart.iaas.scemanager.messages.sce.events.Register_SCEInstance;

/**
 * 
 * @author weissas
 * 
 */
public class SCEManager {

	private static SCEManager _instance = null;

	private Logger logger = null;

	private ManagementRegistry managementRegistry;

	private EventRegistry eventRegistry;

	private SCEManager() {
		logger = LoggerFactory.getLogger(SCEManager.class);

	}

	public static SCEManager getInstance() {
		if (_instance == null) {
			_instance = new SCEManager();
		}

		return _instance;
	}

	public void startup(ManagementRegistry managementRegistry, EventRegistry eventRegistry) {
		this.managementRegistry = managementRegistry;
		this.eventRegistry = eventRegistry;
	
	}

	public void shutdown() {
		this.eventRegistry = null;
		this.managementRegistry = null;
		_instance = null;
	}

	public void registerSCEInstance(Register_SCEInstance message) {

		//TODO: change message with type
		SCEInstance instance = managementRegistry.registerSceInstance(message.getSceInstanceId(), SCEInstanceTypeEnum.APACHE_ODE, message.getEndpointBaseUrl(), message.getManagementQueueURL());

		for (de.unistuttgart.iaas.scemanager.messages.sce.events.ServiceEndpointData data : message.getManagementServiceEndpoints()) {
			// Register the service data for the SCE instance
			managementRegistry.registerSceServiceEndpoint(instance, data.getNamespace(), data.getServiceName(), data.getEndpointName(), data.getEndpointURL());
		}

		if (logger.isDebugEnabled()) {
			logger.debug("Register_SCEInstance: sceInstanceId=" + message.getSceInstanceId() + ", endpointBaseUrl=" + message.getEndpointBaseUrl());
		}

		// Persist a SCE instance reference in the event registry
		eventRegistry.getOrCreateSCEInstanceRef(message.getSceInstanceId());

	}

	public void setSCEInstanceStatus(SceMessageBase message) {
		if (message instanceof EngineInstance_Active) {
			SCEInstance instance = managementRegistry.getSceInstance(message.getSceInstanceId());

			if (instance != null) {
				managementRegistry.updateSCEInstanceStatus(message.getSceInstanceId(), SCEInstanceStatusEnum.ACTIVE);
			} else {
				this.logger.error("No SCE instance with instance id=" + message.getSceInstanceId() + " is registered in the database.");
			}
		} else if (message instanceof EngineInstance_Inactive) {
			SCEInstance instance = managementRegistry.getSceInstance(message.getSceInstanceId());

			if (instance != null) {
				managementRegistry.updateSCEInstanceStatus(message.getSceInstanceId(), SCEInstanceStatusEnum.INACTIVE);
			} else {
				this.logger.error("No SCE instance with instance id=" + message.getSceInstanceId() + " is registered in the database.");
			}
		}
	}

}	