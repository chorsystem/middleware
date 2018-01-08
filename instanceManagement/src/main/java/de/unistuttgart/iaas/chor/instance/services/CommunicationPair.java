package de.unistuttgart.iaas.chor.instance.services;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;

public class CommunicationPair {

	private ProcessInstance sendingProcessInstance;
	private ProcessInstance receivingProcessInstance;
	
	public ProcessInstance getSendingProcessInstance() {
		return sendingProcessInstance;
	}
	public void setSendingProcessInstance(ProcessInstance sendingProcessInstance) {
		this.sendingProcessInstance = sendingProcessInstance;
	}
	public ProcessInstance getReceivingProcessInstance() {
		return receivingProcessInstance;
	}
	public void setReceivingProcessInstance(ProcessInstance receivingProcessInstance) {
		this.receivingProcessInstance = receivingProcessInstance;
	}
	
	
}
