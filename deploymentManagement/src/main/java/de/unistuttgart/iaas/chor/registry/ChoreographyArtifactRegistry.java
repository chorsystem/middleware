package de.unistuttgart.iaas.chor.registry;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantSet;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.pbd.Process;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.commons.messaging.MessageProducer;
import de.unistuttgart.iaas.chor.commons.util.EMFUtils;
import de.unistuttgart.iaas.chor.commons.util.IOUtils;
import de.unistuttgart.iaas.chor.integration.artifact.registry.ArtifactRegistry;
import de.unistuttgart.iaas.chor.integration.artifact.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.artifact.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.messages.ChorDeploymentMessage;
import de.unistuttgart.iaas.chor.messages.ChorDeploymentResultMessage;
import de.unistuttgart.iaas.chor.messages.ChoreographyBundleResultType;
import de.unistuttgart.iaas.chor.messages.ChoreographyBundleType;
import de.unistuttgart.iaas.chor.messages.ProcessBundleResultType;
import de.unistuttgart.iaas.chor.messages.ProcessBundleType;

public class ChoreographyArtifactRegistry {

	private MessageProducer messageProducer;
	private ArtifactRegistry artifactRegistry;

	public MessageProducer getMessageProducer() {
		return messageProducer;
	}

	public void setMessageProducer(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}
	
	public ArtifactRegistry getArtifactRegistry() {
		return artifactRegistry;
	}

	public void setArtifactRegistry(ArtifactRegistry artifactRegistry) {
		this.artifactRegistry = artifactRegistry;
	}

	public void registerChorArtifacts(@Headers Map<String, Object> headers, @Body ChorDeploymentMessage chorDeploymentMessage) {

		
		ChoreographyModel choreographyModel = checkChoreographyModel(chorDeploymentMessage.getChoreographyBundle());

		ChoreographyBundleResultType choreographyBundleResultType = new ChoreographyBundleResultType();
		choreographyBundleResultType.setChoreographyModelID(choreographyModel.getChoreographyModelId());
		
		
		ChorDeploymentResultMessage resultMessage = new ChorDeploymentResultMessage();
		resultMessage.setChoreographyBundle(choreographyBundleResultType);
		
		
		Choreography choreography = EMFUtils.getChoreographyModel(choreographyModel.getChoreographyModelFile());
		
		
	
		
		List<ProcessBundleType> processBundleTypes = chorDeploymentMessage.getChoreographyBundle().getProcessBundles();

		for (ProcessBundleType processBundle : processBundleTypes) {

			//loadProcessTest(processBundle);
			
			
			ProcessModel processModel = checkProcessModel(choreography, processBundle);
			
			ProcessBundleResultType processBundleResultType = new ProcessBundleResultType();
			processBundleResultType.setProcessModelID(processModel.getModelId());
			processBundleResultType.setName(processBundle.getName());
			
			resultMessage.getChoreographyBundle().getProcessBundleResult().add(processBundleResultType);
		}
		
		
		byte[] choreographyModelFile = EMFUtils.choreographyModelToByteArray(choreography);
		choreographyModel.setChoreographyModelFile(choreographyModelFile);
		artifactRegistry.updateChoreographyModel(choreographyModel);
		
		setChoreographyModelIDHeader(headers, choreographyBundleResultType.getChoreographyModelID());

		String dest = (String) headers.get("returnQueue");

		if(dest !=null){
			messageProducer.sendMessage(resultMessage, (String) headers.get("JMSCorrelationID"), dest);
		}

	}

	private void compareChorArtifacts(ChorDeploymentMessage chorDeploymentMessage) {

		// Temporary Solution:
		// If the model to be deployed already has a id
		// it is not deployed again

		if (chorDeploymentMessage.getChoreographyBundle().getChoreographyModelID() != null) {

		}

	}

	private ProcessModel checkProcessModel(Choreography choreography, ProcessBundleType processBundle) {

		String processModelID = processBundle.getProcessModelID();
		ProcessModel processModel = null;
		
		if (processModelID == null) {
			processModelID = generateModelUniqueID();
			
			
			byte[] processModelFile = IOUtils.loadProcessModelFile(processBundle);
			//Process process = EMFUtils.getProcessModel(processModelFile);
			//process.setId(processModelID);
			//processModelFile = EMFUtils.processModelToByteArray(process);
			processModel = artifactRegistry.createProcessModel(processModelID, processBundle.getName(), processModelFile);
			
//			Process process2 = findProcessInChoreography(choreography, processBundle.getName().getLocalPart(), processBundle.getName().getNamespaceURI());
//			process2.setId(processModelID);

		} else {
			byte[] processModelFile = IOUtils.loadProcessModelFile(processBundle);
			
			processModel = artifactRegistry.getOrCreateProcessModel(processModelID, processBundle.getName(), processModelFile);
			
			if(compareProcessModel(processBundle)){
				processModelID = generateModelUniqueID();
			
			}	
		}
		
		Process process2 = findProcessInChoreography(choreography, processBundle.getName().getLocalPart(), processBundle.getName().getNamespaceURI());
		process2.setId(processModelID);

		processBundle.setProcessModelID(processModelID);
		
		return processModel;

	}

	private ChoreographyModel checkChoreographyModel(ChoreographyBundleType choreographyBundle) {

		String choreographyModelID = choreographyBundle.getChoreographyModelID();
		ChoreographyModel choreographyModel= null;

		byte[] choreographyModelFile = IOUtils.loadChoreographyModelFile(choreographyBundle);
		
		if (choreographyModelID == null) {
			choreographyModelID = generateModelUniqueID();
			
			choreographyModel = artifactRegistry.createChoreographyModel(choreographyModelID, choreographyBundle.getName(), choreographyModelFile);
			
		}
		else{
			
			choreographyModel = artifactRegistry.getOrCreateChoreographyModel(choreographyModelID, choreographyBundle.getName(), choreographyModelFile);
			
			if(compareChoreographyModel(choreographyBundle)){
				choreographyModelID = generateModelUniqueID();
			}
		}

		choreographyBundle.setChoreographyModelID(choreographyModelID);
	
		return choreographyModel;
	}

	private boolean compareProcessModel(ProcessBundleType processBundle) {
		// TODO: implement comparison logic from editor

		return false;
		
	}
	
	private boolean compareChoreographyModel(ChoreographyBundleType choreographyBundle){
		
		return false;
		
	}
	

	private void setChoreographyModelIDHeader(Map<String, Object> headers, String uuid) {

		headers.put(Constants.CHOR_MODEL_ID_HEADER, String.valueOf(uuid));

	}

	private String generateModelUniqueID() {
		return UUID.randomUUID().toString();
	}
	
	private Process findProcessInChoreography(Choreography choreography, String name, String targetNameSpace){
		
		for(CParticipant cParticipant: choreography.getParticipants()){
			
			if(cParticipant.getProcess().getTargetNamespace().equals(targetNameSpace) && cParticipant.getProcess().getName().equals(name)){
				return cParticipant.getProcess();
			}
		}
		
		for(CParticipantSet cParticipantSet: choreography.getParticipantSets()){
			
			if(cParticipantSet.getProcess().getTargetNamespace().equals(targetNameSpace) && cParticipantSet.getProcess().getName().equals(name)){
				return cParticipantSet.getProcess();
			}
			
		}
		
		return null;
	}
	
	private void loadProcessTest(ProcessBundleType processBundle){
			
		byte[] processModelFile = IOUtils.fileToByteArray(new File("C://Users//weissas//Desktop//Participant1.bpel"));
		
		Process refined = EMFUtils.getRefinedProcess(processModelFile);
		
		System.out.println();
		
		
	}
	
	
}
