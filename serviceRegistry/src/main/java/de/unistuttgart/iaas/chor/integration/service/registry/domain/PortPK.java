package de.unistuttgart.iaas.chor.integration.service.registry.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class PortPK implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String namespace;

	public PortPK() {
	}

	public PortPK(String name, String namespace) {
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
		if (obj instanceof PortPK) {
			PortPK pk = (PortPK) obj;
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
