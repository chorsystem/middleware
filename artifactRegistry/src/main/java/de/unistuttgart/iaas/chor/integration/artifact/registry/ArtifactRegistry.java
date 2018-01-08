package de.unistuttgart.iaas.chor.integration.artifact.registry;

import javax.xml.namespace.QName;

import de.unistuttgart.iaas.chor.integration.artifact.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.artifact.registry.domain.ProcessModel;



public interface ArtifactRegistry {

	public ChoreographyModel createChoreographyModel(String choreographyModelID, QName modelQName, byte[] choreographyModelFile);
	
	public byte[] getChoreographyModelGraph(String choreographyModelID);

	public ProcessModel createProcessModel(String processModelID, QName modelQName, byte[] processModelFile);
	
	public void assignProcessModelToChoreographyModel(ChoreographyModel choreographyModel, ProcessModel processModel);
	
	public ChoreographyModel getChoreographyModel(String choreographyModelID);
	
	public ChoreographyModel getOrCreateChoreographyModel(String choreographyModelID, QName modelQName, byte[] choreographyModelFile);
	
	public ProcessModel getProcessModel(String processModelID);
	
	public ProcessModel getOrCreateProcessModel(String processModelID, QName modelQName, byte[] processModelFile);
	
	public void updateChoreographyModel(ChoreographyModel choreographyModel);
}
