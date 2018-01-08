package de.unistuttgart.iaas.chor.integration.management.registry.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * New entity which represents a SCE instance.
 * 
 * @author hahnml
 * @author weissas
 * 
 */
@Entity
public class SCEInstance {

	private String sceInstanceId;

	private Collection<ServiceEndpointData> managementServiceEndpoints = new ArrayList<ServiceEndpointData>();
	private SCEInstanceTypeEnum sceInstanceType;
	private SCEInstanceStatusEnum status;
	
	private String managementQueueEndpoint;
	private String eventQueueEndpoint;
	
	private String endpointBaseUrl; 

	
	@Id
	public String getSceInstanceId() {
		return sceInstanceId;
	}

	public void setSceInstanceId(String sceInstanceId) {
		this.sceInstanceId = sceInstanceId;
	}
	
	public SCEInstanceTypeEnum getSceInstanceType() {
		return sceInstanceType;
	}

	public void setSceInstanceType(SCEInstanceTypeEnum sceInstanceType) {
		this.sceInstanceType = sceInstanceType;
	}

	public void setManagementServiceEndpoints(
			Collection<ServiceEndpointData> managementServiceEndpoints) {
		this.managementServiceEndpoints = managementServiceEndpoints;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "sceInstance")
	public Collection<ServiceEndpointData> getManagementServiceEndpoints() {
		return managementServiceEndpoints;
	}

	public void setStatus(SCEInstanceStatusEnum status) {
		this.status = status;
	}

	@Enumerated(EnumType.STRING)
	public SCEInstanceStatusEnum getStatus() {
		return status;
	}

	public String getEndpointBaseUrl() {
		return endpointBaseUrl;
	}

	public void setEndpointBaseUrl(String endpointBaseUrl) {
		this.endpointBaseUrl = endpointBaseUrl;
	}
	
	public void setManagementQueueEndpoint(String managementQueueEndpoint) {
		this.managementQueueEndpoint = managementQueueEndpoint;
	}

	public String getManagementQueueEndpoint() {
		return managementQueueEndpoint;
	}

	public void setEventQueueEndpoint(String eventQueueEndpoint) {
		this.eventQueueEndpoint = eventQueueEndpoint;
	}

	public String getEventQueueEndpoint() {
		return eventQueueEndpoint;
	}
	
}
