package de.unistuttgart.iaas.chor.integration.service.registry.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ServicePK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="SERVICE_NAME")
	private String name;
	@Column(name="SERVICE_NAMESPACE")
	private String namespace;

	public ServicePK() {
	}

	public ServicePK(String name, String namespace) {
		this.name = name;
		this.namespace = namespace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ServicePK) {
			ServicePK pk = (ServicePK) obj;
			return this.name.equals(pk.name) && this.namespace.equals(pk.namespace);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.namespace.hashCode();
	}

}
