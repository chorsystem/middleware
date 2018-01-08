package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation.CorrelationSetInstance;

/**
 * Entity class which represents an executed process instance.
 * 
 * @author hahnml
 * 
 */
@Entity
public class ProcessInstance {

	private ProcessInstancePK compositePrimaryKey;

	private Long odeProcessInstanceID;
	
	private SCEInstanceRef sceInstanceRef;

	private ProcessModel processModel;
	
	private InstanceStateEnum instanceState;

	private Long creationTimestamp;
	
	private Collection<ProcessInstanceEvent> processInstanceEvents = new ArrayList<ProcessInstanceEvent>();
	
	private Collection<ActivityInstance> activityInstances = new ArrayList<ActivityInstance>();
	
	private ChoreographyInstance choreographyInstance;
	
	private List<CorrelationSetInstance> correlationSetInstances = new ArrayList<CorrelationSetInstance>();

	@EmbeddedId
	public ProcessInstancePK getCompositePrimaryKey() {
		return compositePrimaryKey;
	}

	public void setCompositePrimaryKey(ProcessInstancePK compositePrimaryKey) {
		this.compositePrimaryKey = compositePrimaryKey;
	}
	

	public void setInstanceState(InstanceStateEnum instanceState) {
		this.instanceState = instanceState;
	}

	@Enumerated(EnumType.STRING)
	public InstanceStateEnum getInstanceState() {
		return instanceState;
	}

	public void setCreationTimestamp(Long timestamp) {
		this.creationTimestamp = timestamp;
	}

	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setProcessInstanceEvents(Collection<ProcessInstanceEvent> processInstanceEvents) {
		this.processInstanceEvents = processInstanceEvents;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "processInstance")
	public Collection<ProcessInstanceEvent> getProcessInstanceEvents() {
		return processInstanceEvents;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "choreographyInstanceId", referencedColumnName = "choreographyInstanceID") })
	public ChoreographyInstance getChoreographyInstance() {
		return choreographyInstance;
	}

	public void setChoreographyInstance(ChoreographyInstance choreographyInstance) {
		this.choreographyInstance = choreographyInstance;
	}
	
	public void setSceInstanceRef(SCEInstanceRef sceInstanceRef) {
		this.sceInstanceRef = sceInstanceRef;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sceInstanceID", referencedColumnName = "sceInstanceId")
	public SCEInstanceRef getSceInstanceRef() {
		return sceInstanceRef;
	}

	public void setProcessModel(ProcessModel processModel) {
		this.processModel = processModel;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({
			@JoinColumn(name = "processModelID", referencedColumnName = "modelId") })
	public ProcessModel getProcessModel() {
		return processModel;
	}

	public Long getOdeProcessInstanceID() {
		return odeProcessInstanceID;
	}

	public void setOdeProcessInstanceID(Long odeProcessInstanceID) {
		this.odeProcessInstanceID = odeProcessInstanceID;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "processInstance")
	public Collection<ActivityInstance> getActivityInstances() {
		return activityInstances;
	}

	public void setActivityInstances(Collection<ActivityInstance> activityInstances) {
		this.activityInstances = activityInstances;
	}
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "processInstance")
	public List<CorrelationSetInstance> getCorrelationSetInstances() {
		return correlationSetInstances;
	}

	public void setCorrelationSetInstances(List<CorrelationSetInstance> correlationSetInstances) {
		this.correlationSetInstances = correlationSetInstances;
	}
	
	

}
