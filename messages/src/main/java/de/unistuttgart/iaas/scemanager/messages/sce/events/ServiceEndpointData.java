package de.unistuttgart.iaas.scemanager.messages.sce.events;

import java.io.Serializable;

/**
 * Class that is used to represent the endpoint data of a management service of
 * a service composition engine, like process or instance management services.
 * 
 * @author hahnml
 * 
 */
public class ServiceEndpointData implements Serializable {

	private static final long serialVersionUID = 6574693750088986368L;

	private String namespace;
	private String serviceName;
	private String endpointName;

	private String endpointURL;

	public ServiceEndpointData(String namespace, String serviceName,
			String endpointName, String endpointURL) {
		super();
		this.namespace = namespace;
		this.serviceName = serviceName;
		this.endpointName = endpointName;
		this.endpointURL = endpointURL;
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
}
