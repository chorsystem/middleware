package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * Entity class to persist all emitted process events of a service composition engine.
 * 
 * @author hahnml
 * 
 */
@Entity
public class ProcessEvent extends SCEEvent {

	private ProcessModel processModel;
	
	private Long version;

	public void setProcessModel(ProcessModel processModel) {
		this.processModel = processModel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "processModelID", referencedColumnName = "modelId") })
	public ProcessModel getProcessModel() {
		return processModel;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getVersion() {
		return version;
	}
}
