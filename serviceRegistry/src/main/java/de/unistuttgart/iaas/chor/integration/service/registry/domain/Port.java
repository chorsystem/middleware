package de.unistuttgart.iaas.chor.integration.service.registry.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Port {

	private PortPK compositePrimaryKey;
	
	
	private Service service;
	
	
	private PortType portType;
	

	@EmbeddedId
	public PortPK getCompositePrimaryKey() {
		return compositePrimaryKey;
	}

	public void setCompositePrimaryKey(PortPK compositePrimaryKey) {
		this.compositePrimaryKey = compositePrimaryKey;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name ="SERVICE_NAME"),
		@JoinColumn(name ="SERVICE_NAMESPACE")
	})
	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name ="PORTTYPE_NAME"),
		@JoinColumn(name ="PORTTYPE_NAMESPACE")
	})
	public PortType getPortType() {
		return portType;
	}

	public void setPortType(PortType portType) {
		this.portType = portType;
	}

	
	
	
}
