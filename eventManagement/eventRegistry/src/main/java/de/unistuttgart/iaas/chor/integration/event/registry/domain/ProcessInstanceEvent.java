package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * Entity class to persist all emitted process instance events of a service
 * composition engine.
 * 
 * @author hahnml
 * 
 */
@Entity
public class ProcessInstanceEvent extends SCEEvent {

	private ProcessInstance processInstance;

	private String details;
	private String elementState;
	private String elementXPath;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "processInstanceID", referencedColumnName = "processInstanceID") })
	public ProcessInstance getProcessInstance() {
		return processInstance;
	}
	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getDetails() {
		return details;
	}

	public void setElementState(String elementState) {
		this.elementState = elementState;
	}

	public String getElementState() {
		return elementState;
	}

	public void setElementXPath(String elementXPath) {
		this.elementXPath = elementXPath;
	}

	public String getElementXPath() {
		return elementXPath;
	}
}
