package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import java.util.ArrayList;
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

@Entity
public class MessageLink {

	private String messageLinkID;
	
	private String name;
	
	private ProcessModel sender;
	
	private ProcessModel receiver;
	
	private String sendingActivityModelID;
	private ActivityTypeEnum sendingActivityType;
	
	private String receivingActivityModelID;
	private ActivityTypeEnum receivingActivityType;
	
	private ChoreographyModel choreographyModel;
	
	private List<MessageLinkInstance> messageLinkInstances = new ArrayList<MessageLinkInstance>();
	

	@Id
	public String getMessageLinkID() {
		return messageLinkID;
	}

	public void setMessageLinkID(String messageLinkID) {
		this.messageLinkID = messageLinkID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToOne
	@JoinColumns({ @JoinColumn(name = "sender", referencedColumnName = "modelId") })
	public ProcessModel getSender() {
		return sender;
	}

	public void setSender(ProcessModel sender) {
		this.sender = sender;
	}

	@OneToOne
	@JoinColumns({ @JoinColumn(name = "receiver", referencedColumnName = "modelId") })
	public ProcessModel getReceiver() {
		return receiver;
	}

	public void setReceiver(ProcessModel receiver) {
		this.receiver = receiver;
	}
	
	public String getSendingActivityModelID() {
		return sendingActivityModelID;
	}

	public void setSendingActivityModelID(String sendingActivityModelID) {
		this.sendingActivityModelID = sendingActivityModelID;
	}

	public String getReceivingActivityModelID() {
		return receivingActivityModelID;
	}

	public void setReceivingActivityModelID(String receivingActivityModelID) {
		this.receivingActivityModelID = receivingActivityModelID;
	}

	public ActivityTypeEnum getSendingActivityType() {
		return sendingActivityType;
	}

	public void setSendingActivityType(ActivityTypeEnum sendingActivityType) {
		this.sendingActivityType = sendingActivityType;
	}

	public ActivityTypeEnum getReceivingActivityType() {
		return receivingActivityType;
	}

	public void setReceivingActivityType(ActivityTypeEnum receivingActivityType) {
		this.receivingActivityType = receivingActivityType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "choreographyModelId", referencedColumnName = "choreographyModelId") })
	public ChoreographyModel getChoreographyModel() {
		return choreographyModel;
	}

	public void setChoreographyModel(ChoreographyModel choreographyModel) {
		this.choreographyModel = choreographyModel;
	}
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "messageLink")
	public List<MessageLinkInstance> getMessageLinkInstances() {
		return messageLinkInstances;
	}

	public void setMessageLinkInstances(List<MessageLinkInstance> messageLinkInstances) {
		this.messageLinkInstances = messageLinkInstances;
	}
	
}
