package de.unistuttgart.iaas.chor.integration.management.registry.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



/**
 * Class that is used to represent the endpoint data of a management service of
 * a service composition engine, like process or instance management services.
 * 
 * @author hahnml
 * 
 */
@Entity
public class ServiceEndpointData {

	private SCEInstance sceInstance;

	private String namespace;
	private String serviceName;
	private String endpointName;

	private String endpointURL;

	private int id;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getEndpointName() {
		return endpointName;
	}

	public void setEndpointName(String endpointName) {
		this.endpointName = endpointName;
	}

	public String getEndpointURL() {
		return endpointURL;
	}

	public void setEndpointURL(String endpointURL) {
		this.endpointURL = endpointURL;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sceInstanceId")
	public SCEInstance getSceInstance() {
		return sceInstance;
	}

	public void setSceInstance(SCEInstance sceInstance) {
		this.sceInstance = sceInstance;
	}
}
