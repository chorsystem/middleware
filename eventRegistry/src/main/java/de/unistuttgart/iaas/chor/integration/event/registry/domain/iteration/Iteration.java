package de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;

@Entity
public class Iteration {

	private String iterationID;

	private ActivityInstance initialRewindingPoint;
	private ProcessInstance initialStartParticipant;
	private String view;
	
	private RewindingPoints rewindingPoints;

	private List<MessageLinkInstance> messageLinkInstances = new ArrayList<MessageLinkInstance>();

	private ChoreographyInstance choreographyInstance;

	private Long timestamp;
	
	private RepetitionMethodEnum repetitionMethod;

	private List<IterationEvent> iterationEvents = new ArrayList<IterationEvent>();

	@Id
	public String getIterationID() {
		return iterationID;
	}

	public void setIterationID(String iterationID) {
		this.iterationID = iterationID;
	}

	@OneToOne
	@JoinColumns({ @JoinColumn(name = "initialRewindingPoint", referencedColumnName = "activityInstanceID") })
	public ActivityInstance getInitialRewindingPoint() {
		return initialRewindingPoint;
	}

	public void setInitialRewindingPoint(ActivityInstance initialRewindingPoint) {
		this.initialRewindingPoint = initialRewindingPoint;
	}

	@OneToOne
	@JoinColumns({ @JoinColumn(name = "initialStartParticipant", referencedColumnName = "processInstanceID") })
	public ProcessInstance getInitialStartParticipant() {
		return initialStartParticipant;
	}

	public void setInitialStartParticipant(ProcessInstance initialStartParticipant) {
		this.initialStartParticipant = initialStartParticipant;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "MESSAGELINKINSTANCE_BELONGS_TO_ITERATION", joinColumns = { @JoinColumn(name = "iterationID", referencedColumnName = "iterationID") }, inverseJoinColumns = { @JoinColumn(name = "instanceID", referencedColumnName = "instanceID") })
	public List<MessageLinkInstance> getMessageLinkInstances() {
		return messageLinkInstances;
	}

	public void setMessageLinkInstances(List<MessageLinkInstance> messageLinkInstances) {
		this.messageLinkInstances = messageLinkInstances;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "choreographyInstanceID", referencedColumnName = "choreographyInstanceID") })
	public ChoreographyInstance getChoreographyInstance() {
		return choreographyInstance;
	}

	public void setChoreographyInstance(ChoreographyInstance choreographyInstance) {
		this.choreographyInstance = choreographyInstance;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getView() {
		return view;
	}

	public void setView(String v) {
		this.view = v;
	}
	
	public RepetitionMethodEnum getRepetitionMethod() {
		return repetitionMethod;
	}

	public void setRepetitionMethod(RepetitionMethodEnum repetitionMethod) {
		this.repetitionMethod = repetitionMethod;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "iteration")
	public List<IterationEvent> getIterationEvents() {
		return iterationEvents;
	}

	public void setIterationEvents(List<IterationEvent> iterationEvents) {
		this.iterationEvents = iterationEvents;
	}

	@OneToOne
	@JoinColumns({ @JoinColumn(name = "rewindingPoints", referencedColumnName = "rewindingPointsID") })
	public RewindingPoints getRewindingPoints() {
		return rewindingPoints;
	}

	public void setRewindingPoints(RewindingPoints rewindingPoints) {
		this.rewindingPoints = rewindingPoints;
	}

}
