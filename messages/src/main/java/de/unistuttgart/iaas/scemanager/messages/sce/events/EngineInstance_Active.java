package de.unistuttgart.iaas.scemanager.messages.sce.events;

import de.unistuttgart.iaas.scemanager.messages.SceMessageBase;

/**
 * Event message that is send to a SCE-MT Manager if a service composition engine is active (after startup).
 * 
 * @author hahnml
 * 
 */
public class EngineInstance_Active extends SceMessageBase {

	private static final long serialVersionUID = -1321450812393478556L;

	private String sceInstanceId;

	public EngineInstance_Active(String sceInstanceId) {
		super();
		this.sceInstanceId = sceInstanceId;
	}

	public String getSceInstanceId() {
		return sceInstanceId;
	}

	public void setSceInstanceId(String sceInstanceId) {
		this.sceInstanceId = sceInstanceId;
	}
}
