package de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstanceEvent;

@Entity
public class IterationEvent extends ProcessInstanceEvent {

	private Iteration iteration;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ 
		@JoinColumn(name="iterationID", referencedColumnName = "iterationID")
				})
	public Iteration getIteration() {
		return iteration;
	}

	public void setIteration(Iteration iteration) {
		this.iteration = iteration;
	}
	
}
