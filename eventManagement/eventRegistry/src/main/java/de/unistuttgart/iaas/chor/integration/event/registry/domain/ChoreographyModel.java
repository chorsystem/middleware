package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.xml.namespace.QName;


/**
 * 
 * @author weissas
 *
 */

@Entity
public class ChoreographyModel {

	private String choreographyModelId;

	private String modelQName;
	
	private ChoreographyStateEnum choreographyState;
	
	private Collection<ProcessModel> processModels = new ArrayList<ProcessModel>();
	
	private Collection<ChoreographyInstance> choreographyInstances = new ArrayList<ChoreographyInstance>();
	
	private List<MessageLink> messageLinks = new ArrayList<MessageLink>();
	
	
	@Id
	public String getChoreographyModelId() {
		return choreographyModelId;
	}

	public void setChoreographyModelId(String choreographyModelId) {
		this.choreographyModelId = choreographyModelId;
	}

	public void setModelQName(QName modelQName) {
		this.modelQName = modelQName.toString();
	}

	public QName getModelQName() {
		return QName.valueOf(modelQName);
	}
	
	public ChoreographyStateEnum getChoreographyState() {
		return choreographyState;
	}

	@Enumerated(EnumType.STRING)
	public void setChoreographyState(ChoreographyStateEnum choreographyState) {
		this.choreographyState = choreographyState;
	}

	@ManyToMany
	@JoinTable(name = "BELONGS_TO", joinColumns = { @JoinColumn(name = "choreographyModelId", referencedColumnName = "choreographyModelId") }, inverseJoinColumns = { @JoinColumn(name = "processModelId", referencedColumnName = "modelid") })
	public Collection<ProcessModel> getProcessModels() {
		return processModels;
	}

	public void setProcessModels(Collection<ProcessModel> processModels) {
		this.processModels = processModels;
	}

	public void setChoreographyInstances(Collection<ChoreographyInstance> choreographyInstances) {
		this.choreographyInstances = choreographyInstances;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "choreographyModel")
	public Collection<ChoreographyInstance> getChoreographyInstances() {
		return choreographyInstances;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "choreographyModel")
	public List<MessageLink> getMessageLinks() {
		return messageLinks;
	}

	public void setMessageLinks(List<MessageLink> messageLinks) {
		this.messageLinks = messageLinks;
	}
	
}
