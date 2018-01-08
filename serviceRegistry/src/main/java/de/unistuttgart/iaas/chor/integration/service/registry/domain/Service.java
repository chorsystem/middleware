package de.unistuttgart.iaas.chor.integration.service.registry.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Service {

	private ServicePK compositePrimaryKey;
	private Collection<Port> ports = new ArrayList<Port>();
	private String endpointURL;
	private String modelId;
	private String sceInstanceID;

	@EmbeddedId
	public ServicePK getCompositePrimaryKey() {
		return compositePrimaryKey;
	}

	public void setCompositePrimaryKey(ServicePK compositePrimaryKey) {
		this.compositePrimaryKey = compositePrimaryKey;
	}

	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "service")
	public Collection<Port> getPorts() {
		return ports;
	}

	public void setPorts(Collection<Port> ports) {
		this.ports = ports;
	}

	public String getEndpointURL() {
		return endpointURL;
	}

	public void setEndpointURL(String endpointURL) {
		this.endpointURL = endpointURL;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getSceInstanceID() {
		return sceInstanceID;
	}

	public void setSceInstanceID(String sceInstanceID) {
		this.sceInstanceID = sceInstanceID;
	}
}
