package de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;

@Entity
public class RewindingPointsEntry {

	private String rewindingPointsEntryID;

	private ProcessInstance processInstance;

	private List<ActivityInstance> activityInstances;

	private RewindingPoints rewindingPoints;
	
	private boolean completeRewind;
	
	private boolean repeated;

	@Id
	public String getRewindingPointsEntryID() {
		return rewindingPointsEntryID;
	}

	public void setRewindingPointsEntryID(String rewindingPointsEntryID) {
		this.rewindingPointsEntryID = rewindingPointsEntryID;
	}

	@OneToOne
	@JoinColumns({ @JoinColumn(name = "processInstanceID", referencedColumnName = "processInstanceID") })
	public ProcessInstance getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.REFRESH }, mappedBy = "rewindingPointsEntry")
	public List<ActivityInstance> getActivityInstances() {
		return activityInstances;
	}

	public void setActivityInstances(List<ActivityInstance> activityInstances) {
		this.activityInstances = activityInstances;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "rewindingPointsID", referencedColumnName = "rewindingPointsID") })
	public RewindingPoints getRewindingPoints() {
		return rewindingPoints;
	}

	public void setRewindingPoints(RewindingPoints rewindingPoints) {
		this.rewindingPoints = rewindingPoints;
	}

	public boolean isCompleteRewind() {
		return completeRewind;
	}

	public void setCompleteRewind(boolean completeRewind) {
		this.completeRewind = completeRewind;
	}

	public boolean isRepeated() {
		return repeated;
	}

	public void setRepeated(boolean repeated) {
		this.repeated = repeated;
	}
	
}
