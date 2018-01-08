package de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class RewindingPoints {

	private String rewindingPointsID;

	private List<RewindingPointsEntry> entries = new ArrayList<RewindingPointsEntry>();

	private Iteration iteration;

	@Id
	public String getRewindingPointsID() {
		return rewindingPointsID;
	}

	public void setRewindingPointsID(String rewindingPointsID) {
		this.rewindingPointsID = rewindingPointsID;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "rewindingPoints")
	public List<RewindingPointsEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<RewindingPointsEntry> entries) {
		this.entries = entries;
	}

	@OneToOne
	@JoinColumns({ @JoinColumn(name = "iteration", referencedColumnName = "iterationID") })
	public Iteration getIteration() {
		return iteration;
	}

	public void setIteration(Iteration iteration) {
		this.iteration = iteration;
	}

}
