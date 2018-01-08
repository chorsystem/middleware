package de.unistuttgart.iaas.chor.integration.artifact.registry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.namespace.QName;

import org.springframework.transaction.annotation.Transactional;

import de.unistuttgart.iaas.chor.integration.artifact.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.artifact.registry.domain.ProcessModel;

@Transactional
public class ArtifactRegistryService implements ArtifactRegistry {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	

	@Override
	public byte[] getChoreographyModelGraph(String choreographyModelID) {
		
		ChoreographyModel choreographyModel = em.find(ChoreographyModel.class, choreographyModelID);
		
		return choreographyModel.getChoreographyModelFile();
	}

	@Override
	public ChoreographyModel createChoreographyModel(String choreographyModelID, QName modelQName, byte[] choreographyModelFile) {
	
		
		ChoreographyModel choreographyModel = new ChoreographyModel();
		choreographyModel.setChoreographyModelId(choreographyModelID);
		choreographyModel.setModelQName(modelQName);
		choreographyModel.setChoreographyModelFile(choreographyModelFile);
		
		em.persist(choreographyModel);
		
		return choreographyModel;
	}

	@Override
	public ProcessModel createProcessModel(String processModelID, QName modelQName, byte[] processModelFile) {
	
		ProcessModel processModel = new ProcessModel();
		processModel.setModelId(processModelID);
		processModel.setModelQName(modelQName);
		processModel.setProcessModelFile(processModelFile);
		
		em.persist(processModel);
		return processModel;
		
	}

	@Override
	public void assignProcessModelToChoreographyModel(ChoreographyModel choreographyModel, ProcessModel processModel) {
	
		choreographyModel = em.find(ChoreographyModel.class, choreographyModel.getChoreographyModelId());
		processModel = em.find(ProcessModel.class, processModel.getModelId());
		choreographyModel.getProcessModels().add(processModel);
		processModel.getChoreographyModels().add(choreographyModel);
		
		em.persist(choreographyModel);
		em.persist(processModel);
		
		
	}

	@Override
	public ChoreographyModel getChoreographyModel(String choreographyModelID) {
		
		ChoreographyModel choreographyModel = em.find(ChoreographyModel.class, choreographyModelID);
		
		return choreographyModel;
	}

	@Override
	public ProcessModel getProcessModel(String processModelID) {
		
		ProcessModel processModel = em.find(ProcessModel.class, processModelID);
		
		return processModel;
	}

	@Override
	public void updateChoreographyModel(ChoreographyModel choreographyModel) {
		
		em.merge(choreographyModel);
		
		//em.persist(choreographyModel);
		
	}

	@Override
	public ChoreographyModel getOrCreateChoreographyModel(String choreographyModelID, QName modelQName, byte[] choreographyModelFile) {
		ChoreographyModel choreographyModel = em.find(ChoreographyModel.class, choreographyModelID);
		
		if(choreographyModel == null){
			choreographyModel = createChoreographyModel(choreographyModelID, modelQName, choreographyModelFile);
		}
		
		
		return choreographyModel;
	}

	@Override
	public ProcessModel getOrCreateProcessModel(String processModelID, QName modelQName, byte[] processModelFile) {
		
		ProcessModel processModel = em.find(ProcessModel.class, processModelID);
		
		if(processModel == null){
			processModel = createProcessModel(processModelID, modelQName, processModelFile);
		}
		
		return processModel;
	}

	

}
