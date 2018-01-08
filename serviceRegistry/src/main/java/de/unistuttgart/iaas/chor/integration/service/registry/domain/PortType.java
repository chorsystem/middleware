package de.unistuttgart.iaas.chor.integration.service.registry.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class PortType {


    private PortTypePK compositePrimaryKey;
    private Collection<Port> ports = new ArrayList<Port>();
    
    
    @EmbeddedId
    public PortTypePK getCompositePrimaryKey() {
        return compositePrimaryKey;
    }

    public void setCompositePrimaryKey(PortTypePK compositePrimaryKey) {
        this.compositePrimaryKey = compositePrimaryKey;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "portType")
	public Collection<Port> getPorts() {
		return ports;
	}

	public void setPorts(Collection<Port> ports) {
		this.ports = ports;
	}
	
	
	
}
