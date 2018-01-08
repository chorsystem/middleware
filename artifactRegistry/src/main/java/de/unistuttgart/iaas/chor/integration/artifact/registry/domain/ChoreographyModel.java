package de.unistuttgart.iaas.chor.integration.artifact.registry.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.xml.namespace.QName;


/**
 *
 * @author weissas
 *
 * TODO: add versioning concept for choreography models
 *
 *
 */

@Entity
public class ChoreographyModel {

	private String choreographyModelId;

	private String modelQName;
	
	private Collection<ProcessModel> processModels = new ArrayList<ProcessModel>();
	
	@Lob
	private byte[] choreographyModelFile; 
	
	
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
	
	@ManyToMany
	@JoinTable(name = "BELONGS_TO", joinColumns = { @JoinColumn(name = "choreographyModelId", referencedColumnName = "choreographyModelId") }, inverseJoinColumns = { @JoinColumn(name = "processModelId", referencedColumnName = "modelid") })
	public Collection<ProcessModel> getProcessModels() {
		return processModels;
	}

	public void setProcessModels(Collection<ProcessModel> processModels) {
		this.processModels = processModels;
	}

	public byte[] getChoreographyModelFile() {
		return choreographyModelFile;
	}

	public void setChoreographyModelFile(byte[] choreographyModelFile) {
		this.choreographyModelFile = choreographyModelFile;
	}

}
