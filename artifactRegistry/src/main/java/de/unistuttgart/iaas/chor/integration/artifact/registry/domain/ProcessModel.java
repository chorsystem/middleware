package de.unistuttgart.iaas.chor.integration.artifact.registry.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.xml.namespace.QName;


@Entity
public class ProcessModel {

	private String modelId;
	
	private String modelQName;
	
	private Collection<ChoreographyModel> choreographyModels = new ArrayList<ChoreographyModel>();

	@Lob
	private byte[] processModelFile; 
	
	//TODO: also store wsdl files, deploy.xml etc
	
	
	@Id
	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	


	public void setModelQName(QName modelQName) {
		this.modelQName = modelQName.toString();
	}

	public QName getModelQName() {
		return QName.valueOf(modelQName);
	}

	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "processModels")
	public Collection<ChoreographyModel> getChoreographyModels() {
		return choreographyModels;
	}

	public void setChoreographyModels(Collection<ChoreographyModel> choreographyModels) {
		this.choreographyModels = choreographyModels;
	}

	public byte[] getProcessModelFile() {
		return processModelFile;
	}

	public void setProcessModelFile(byte[] processModelFile) {
		this.processModelFile = processModelFile;
	}
	
	
}
