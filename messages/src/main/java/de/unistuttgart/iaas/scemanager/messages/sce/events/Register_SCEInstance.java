package de.unistuttgart.iaas.scemanager.messages.sce.events;

import java.util.List;

import de.unistuttgart.iaas.scemanager.messages.SceMessageBase;

/**
 * Message that is send to a SCE Manager to register a service composition engine.
 * 
 * @author hahnml
 * @author weissas
 * 
 */
public class Register_SCEInstance extends SceMessageBase {

	private static final long serialVersionUID = -1321450812393478556L;

	private List<ServiceEndpointData> managementServiceEndpoints;
	private String sceInstanceId;
	private String managementQueueURL;
	private String eventQueueURL;
	private String endpointBaseUrl;
	
	public Register_SCEInstance(String sceInstanceId, List<ServiceEndpointData> managementServiceEndpoints,
			String endpointBaseUrl, String managementQueueURL, String eventQueueURL) {
		super();
		this.sceInstanceId = sceInstanceId;
		this.managementServiceEndpoints = managementServiceEndpoints;
		this.endpointBaseUrl = endpointBaseUrl;
		this.managementQueueURL = managementQueueURL;
	}

	public List<ServiceEndpointData> getManagementServiceEndpoints() {
		return managementServiceEndpoints;
	}

	public void setManagementServiceEndpoints(List<ServiceEndpointData> managementServiceEndpoints) {
		this.managementServiceEndpoints = managementServiceEndpoints;
	}

	public String getSceInstanceId() {
		return sceInstanceId;
	}

	public void setSceInstanceId(String sceInstanceId) {
		this.sceInstanceId = sceInstanceId;
	}

	public String getEndpointBaseUrl() {
		return endpointBaseUrl;
	}

	public void setEndpointBaseUrl(String endpointBaseUrl) {
		this.endpointBaseUrl = endpointBaseUrl;
	}
	
	public String getManagementQueueURL() {
		return managementQueueURL;
	}

	public void setManagementQueueURL(String managementQueueURL) {
		this.managementQueueURL = managementQueueURL;
	}

	public String getEventQueueURL() {
		return eventQueueURL;
	}

	public void setEventQueueURL(String eventQueueURL) {
		this.eventQueueURL = eventQueueURL;
	}

}
