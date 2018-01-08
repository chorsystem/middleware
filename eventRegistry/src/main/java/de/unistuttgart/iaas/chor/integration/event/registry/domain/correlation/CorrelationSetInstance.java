package de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;

@Entity
public class CorrelationSetInstance {

	private Long correlationSetInstanceID;
	
	private String propertyValue;
	
	private ProcessInstance processInstance;
	
	private CorrelationSet correlationSet;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getCorrelationSetInstanceID() {
		return correlationSetInstanceID;
	}

	public void setCorrelationSetInstanceID(Long correlationSetInstanceID) {
		this.correlationSetInstanceID = correlationSetInstanceID;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({
			@JoinColumn(name = "processInstance", referencedColumnName = "processInstanceID") })
	public ProcessInstance getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "correlationSet", referencedColumnName = "correlationSetID") })
	public CorrelationSet getCorrelationSet() {
		return correlationSet;
	}

	public void setCorrelationSet(CorrelationSet correlationSet) {
		this.correlationSet = correlationSet;
	}
	
	
	
	
}
