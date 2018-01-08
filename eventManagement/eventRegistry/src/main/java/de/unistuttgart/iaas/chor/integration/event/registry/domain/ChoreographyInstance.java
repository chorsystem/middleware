package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ChoreographyInstance {
	
	private Long choreographyInstanceID;
	
	private List<ProcessInstance> participants = new ArrayList<ProcessInstance>();
	
	private List<ChoreographyInstanceEvent> choreographyEvents = new ArrayList<ChoreographyInstanceEvent>();
	
	private ChoreographyInstanceStateEnum state;
	
	private ChoreographyModel choreographyModel;
	
	private Long creationTime;
	
	private List<MessageLinkInstance> messageLinkInstances = new ArrayList<MessageLinkInstance>();
	
	@Id
	public Long getChoreographyInstanceID() {
		return choreographyInstanceID;
	}

	public void setChoreographyInstanceID(Long choreographyInstanceID) {
		this.choreographyInstanceID = choreographyInstanceID;
	}
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "choreographyInstance")
	public List<ProcessInstance> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ProcessInstance> participants) {
		this.participants = participants;
	}
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "chorInstance")
	public List<ChoreographyInstanceEvent> getChoreographyEvents() {
		return choreographyEvents;
	}

	public void setChoreographyEvents(
			List<ChoreographyInstanceEvent> choreographyEvents) {
		this.choreographyEvents = choreographyEvents;
	}
	
	@Enumerated(EnumType.STRING)
	public ChoreographyInstanceStateEnum getState() {
		return state;
	}

	public void setState(ChoreographyInstanceStateEnum state) {
		this.state = state;
	}
	
	public void setChoreographyModel(ChoreographyModel choreographyModel) {
		this.choreographyModel = choreographyModel;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({
			@JoinColumn(name = "choreographyModelId", referencedColumnName = "choreographyModelId") })
	public ChoreographyModel getChoreographyModel() {
		return choreographyModel;
	}

	public Long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "choreographyInstance")
	public List<MessageLinkInstance> getMessageLinkInstances() {
		return messageLinkInstances;
	}

	public void setMessageLinkInstances(List<MessageLinkInstance> messageLinkInstances) {
		this.messageLinkInstances = messageLinkInstances;
	}

	
	
}
