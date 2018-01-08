package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import javax.persistence.Entity;

@Entity
public class LoopActivityInstance extends ActivityInstance {

	private int numberOfIterations;

	public int getNumberOfIterations() {
		return numberOfIterations;
	}

	public void setNumberOfIterations(int numberOfIterations) {
		this.numberOfIterations = numberOfIterations;
	}
	
	

}
