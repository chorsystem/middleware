package de.unistuttgart.iaas.chor.integration.deployment.information;

import java.util.Collection;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;

import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.messages.ChorModelType;
import de.unistuttgart.iaas.chor.messages.ChorProcessModelType;
import de.unistuttgart.iaas.chor.messages.ChorProcessModelsInformationType;
import de.unistuttgart.iaas.chor.messages.ChoreographyModelStatesType;
import de.unistuttgart.iaas.chor.messages.GetChorModelsMessage;
import de.unistuttgart.iaas.chor.messages.GetChorModelsReturnMessage;
import de.unistuttgart.iaas.chor.messages.ProcessModelStatesType;

//@yussupvr: bean for querying the choreography models

public class ChoreographyModelsBean {
	
	EventRegistry eventRegistry;

	public EventRegistry getEventRegistry() {
		return eventRegistry;
	}

	public void setEventRegistry(EventRegistry eventRegistry) {
		this.eventRegistry = eventRegistry;
	}
	
	public GetChorModelsReturnMessage queryChoreographyModels(@Headers Map<String, Object> headers, @Body GetChorModelsMessage input) {
		
		GetChorModelsReturnMessage result = new GetChorModelsReturnMessage();
		
		Collection<ChoreographyModel> chorModels = eventRegistry.getChoreographyModels();
		
		// form a ChorModelType for every retrieved ChoreographyModel
		for (ChoreographyModel cm : chorModels) {
			ChorModelType current = new ChorModelType();
			
			String cmID = cm.getChoreographyModelId();
			String cmName = cm.getModelQName().getLocalPart();
			String cmState = cm.getChoreographyState().toString();
			
			current.setChoreographyModelID(cmID);
			current.setChoreographyModelName(cmName);
			current.setChoreographyModelState(ChoreographyModelStatesType.fromValue(cmState));
			
			ChorProcessModelsInformationType pmInfoType = new ChorProcessModelsInformationType();
			Collection<ProcessModel> processModels = eventRegistry.getProcessModelsOfChoreographyModel(cmID);
			
			//add process models related to the current choreography model
			for (ProcessModel pm : processModels) {
				ChorProcessModelType chorProcessModel = new ChorProcessModelType();
				
				String pmID = pm.getModelId();
				String pmName = pm.getModelQName().getLocalPart();
				String pmState = pm.getProcessState().toString();
				
				chorProcessModel.setProcessModelID(pmID);
				chorProcessModel.setProcessModelName(pmName);
				chorProcessModel.setProcessModelState(ProcessModelStatesType.fromValue(pmState));
				
				pmInfoType.getProcessModel().add(chorProcessModel);
				
			}
			
			current.setProcessModels(pmInfoType);
			
			result.getChoreographyModel().add(current);
		}
		
		return result;
	}
	
	
}
