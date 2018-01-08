package de.unistuttgart.iaas.chor.sce.management;

import org.apache.camel.Body;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.unistuttgart.iaas.chor.integration.artifact.registry.ArtifactRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.management.registry.ManagementRegistry;
import de.unistuttgart.iaas.chor.integration.service.registry.ServiceRegistry;
import de.unistuttgart.iaas.scemanager.messages.sce.events.EngineInstance_Active;
import de.unistuttgart.iaas.scemanager.messages.sce.events.EngineInstance_Inactive;
import de.unistuttgart.iaas.scemanager.messages.sce.events.Register_SCEInstance;

public class ManagementMessageConsumer {

	private Logger logger = null;

	private ManagementRegistry managementRegistry;
	private EventRegistry eventRegistry;
	
	public ManagementMessageConsumer() {
		
		
	}

	public void init(){
		this.logger = LoggerFactory.getLogger(ManagementMessageConsumer.class);
		SCEManager.getInstance().startup(managementRegistry, eventRegistry);
	}
	
	public void onMessage(@Body Object obj) {
		
		// Consume SCE management messages send by a SCE instance
		if (obj instanceof Register_SCEInstance) {
			Register_SCEInstance message = (Register_SCEInstance) obj;
			SCEManager.getInstance().registerSCEInstance(message);
		} 
		else if (obj instanceof EngineInstance_Active) {
			EngineInstance_Active message = (EngineInstance_Active) obj;
			SCEManager.getInstance().setSCEInstanceStatus(message);
		} 
		else if (obj instanceof EngineInstance_Inactive) {
			EngineInstance_Inactive message = (EngineInstance_Inactive) obj;
			SCEManager.getInstance().setSCEInstanceStatus(message);
		}

	}

	public ManagementRegistry getManagementRegistry() {
		return managementRegistry;
	}

	public void setManagementRegistry(ManagementRegistry managementRegistry) {
		this.managementRegistry = managementRegistry;
	}

	public EventRegistry getEventRegistry() {
		return eventRegistry;
	}

	public void setEventRegistry(EventRegistry eventRegistry) {
		this.eventRegistry = eventRegistry;
	}
	

}
