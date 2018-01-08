package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * Entity class which references a {@link SCEInstance} by its sceInstanceId.
 * 
 * @author hahnml
 * 
 */
@Entity
public class SCEInstanceRef {

	private String sceInstanceId;

	private List<ProcessModelSCEInstanceRef> processModelSCEInstanceRefs = new ArrayList<ProcessModelSCEInstanceRef>();

	private Collection<ProcessInstance> processInstances = new ArrayList<ProcessInstance>();
	
	private Collection<SCEEvent> sceEvents = new ArrayList<SCEEvent>();

	public void setSceInstanceId(String sceInstanceId) {
		this.sceInstanceId = sceInstanceId;
	}

	@Id
	public String getSceInstanceId() {
		return sceInstanceId;
	}

	

//	public void setProcessModels(Collection<ProcessModel> processModels) {
//		this.processModels = processModels;
//	}
//
//	
//	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "sceInstanceRefs")
//	public Collection<ProcessModel> getProcessModels() {
//		return processModels;
//	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "sceInstanceRef")
	public List<ProcessModelSCEInstanceRef> getProcessModelSCEInstanceRefs() {
		return processModelSCEInstanceRefs;
	}

	public void setProcessModelSCEInstanceRefs(List<ProcessModelSCEInstanceRef> processModelSCEInstanceRefs) {
		this.processModelSCEInstanceRefs = processModelSCEInstanceRefs;
	}

	public void setProcessInstances(Collection<ProcessInstance> processInstances) {
		this.processInstances = processInstances;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "sceInstanceRef")
	public Collection<ProcessInstance> getProcessInstances() {
		return processInstances;
	}

	public void setSceEvents(Collection<SCEEvent> sceEvents) {
		this.sceEvents = sceEvents;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "sceInstanceRef")
	public Collection<SCEEvent> getSceEvents() {
		return sceEvents;
	}
}
