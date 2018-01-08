package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class MessageLinkInstance {

	private String instanceID;
	
	private MessageLink messageLink;
	
	private ProcessInstance sendingProcessInstance;
	
	private ProcessInstance receivingProcessInstance;
	
	private ActivityInstance sendingActivityInstance;
	
	private ActivityInstance receivingActivityInstance;
	
	private ChoreographyInstance choreographyInstance;
	
	private MessageLinkInstanceStateEnum state;
	
	private String messageID;
	
	private long timestamp;
	
	@Id
	public String getInstanceID() {
		return instanceID;
	}

	public void setInstanceID(String instanceID) {
		this.instanceID = instanceID;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({
			@JoinColumn(name = "messageLinkID", referencedColumnName = "messageLinkID") })
	public MessageLink getMessageLink() {
		return messageLink;
	}

	public void setMessageLink(MessageLink messageLink) {
		this.messageLink = messageLink;
	}
	
	@OneToOne
	@JoinColumns({ @JoinColumn(name = "sendingProcessInstanceID", referencedColumnName = "processInstanceID") })
	public ProcessInstance getSendingProcessInstance() {
		return sendingProcessInstance;
	}

	public void setSendingProcessInstance(ProcessInstance sendingProcessInstance) {
		this.sendingProcessInstance = sendingProcessInstance;
	}

	@OneToOne
	@JoinColumns({ @JoinColumn(name = "receivingProcessInstanceID", referencedColumnName = "processInstanceID") })
	public ProcessInstance getReceivingProcessInstance() {
		return receivingProcessInstance;
	}

	public void setReceivingProcessInstance(ProcessInstance receivingProcessInstance) {
		this.receivingProcessInstance = receivingProcessInstance;
	}
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumns({ 
		@JoinColumn(name="sendingActivityInstanceID", referencedColumnName = "activityInstanceID")
				})
	public ActivityInstance getSendingActivityInstance() {
		return sendingActivityInstance;
	}

	public void setSendingActivityInstance(ActivityInstance sendingActivityInstance) {
		this.sendingActivityInstance = sendingActivityInstance;
	}

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumns({ 
		@JoinColumn(name="receivingActivityInstanceID", referencedColumnName = "activityInstanceID")
				})
	public ActivityInstance getReceivingActivityInstance() {
		return receivingActivityInstance;
	}

	public void setReceivingActivityInstance(ActivityInstance receivingActivityInstance) {
		this.receivingActivityInstance = receivingActivityInstance;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "choreographyInstanceID", referencedColumnName = "choreographyInstanceID") })
	public ChoreographyInstance getChoreographyInstance() {
		return choreographyInstance;
	}

	public void setChoreographyInstance(ChoreographyInstance choreographyInstance) {
		this.choreographyInstance = choreographyInstance;
	}

	public MessageLinkInstanceStateEnum getState() {
		return state;
	}

	public void setState(MessageLinkInstanceStateEnum state) {
		this.state = state;
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
