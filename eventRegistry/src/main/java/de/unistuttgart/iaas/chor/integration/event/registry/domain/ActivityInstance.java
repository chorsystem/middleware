package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import java.util.ArrayList;
import java.util.Collection;

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

import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.RewindingPointsEntry;

@Entity
public class ActivityInstance {

	private ActivityInstancePK compositePrimaryKey;
	
	private SCEInstanceRef sceInstanceRef;
	
	//private ProcessModel processModel;
	
	private ProcessInstance processInstance;
	
	private Long odeActivityInstanceID;
	
	private Long timestamp;
	

	//The following four attributes are also a key candidate
	private Long scopeID;
	private String scopeXPath;
	//private Long activityID;
	private String activityXPath;
	//private String activityName;
	
	//This uuid is only set activities that are mentioned in a choreography model
	private String elementModelID;

	private ActivityInstanceStateEnum activityState;
	
	private Collection<ActivityInstanceEvent> activityInstanceEvents = new ArrayList<ActivityInstanceEvent>();

	private RewindingPointsEntry rewindingPointsEntry;
	
	@EmbeddedId
	public ActivityInstancePK getCompositePrimaryKey() {
		return compositePrimaryKey;
	}

	public void setCompositePrimaryKey(ActivityInstancePK compositePrimaryKey) {
		this.compositePrimaryKey = compositePrimaryKey;
	}

	public Long getScopeID() {
		return scopeID;
	}

	public void setScopeID(Long scopeID) {
		this.scopeID = scopeID;
	}

	public String getScopeXPath() {
		return scopeXPath;
	}

	public void setScopeXPath(String scopeXPath) {
		this.scopeXPath = scopeXPath;
	}

	public String getActivityXPath() {
		return activityXPath;
	}

	public void setActivityXPath(String activityXPath) {
		this.activityXPath = activityXPath;
	}

	@Enumerated(EnumType.STRING)
	public ActivityInstanceStateEnum getActivityState() {
		return activityState;
	}

	public void setActivityState(ActivityInstanceStateEnum activityState) {
		this.activityState = activityState;
	}
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "activityInstance")
	public Collection<ActivityInstanceEvent> getActivityInstanceEvents() {
		return activityInstanceEvents;
	}

	public void setActivityInstanceEvents(
			Collection<ActivityInstanceEvent> activityInstanceEvents) {
		this.activityInstanceEvents = activityInstanceEvents;
	}

	public void setSceInstanceRef(SCEInstanceRef sceInstanceRef) {
		this.sceInstanceRef = sceInstanceRef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sceInstanceID", referencedColumnName = "sceInstanceId")
	public SCEInstanceRef getSceInstanceRef() {
		return sceInstanceRef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="processInstanceID", referencedColumnName = "processInstanceID")})
	public ProcessInstance getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}

	public Long getOdeActivityInstanceID() {
		return odeActivityInstanceID;
	}

	public void setOdeActivityInstanceID(Long odeActivityInstanceID) {
		this.odeActivityInstanceID = odeActivityInstanceID;
	}

	public String getElementModelID() {
		return elementModelID;
	}

	public void setElementModelID(String elementModelID) {
		this.elementModelID = elementModelID;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rewindingPointsEntryID", referencedColumnName = "rewindingPointsEntryID")
	public RewindingPointsEntry getRewindingPointsEntry() {
		return rewindingPointsEntry;
	}
	
	public void setRewindingPointsEntry(RewindingPointsEntry rewindingPointsEntry) {
		this.rewindingPointsEntry = rewindingPointsEntry;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

}
