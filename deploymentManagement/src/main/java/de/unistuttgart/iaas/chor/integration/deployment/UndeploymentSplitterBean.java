package de.unistuttgart.iaas.chor.integration.deployment;

import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;

import de.unistuttgart.iaas.chor.messages.ChorUndeploymentMessage;

public class UndeploymentSplitterBean {

	public Object prepareUndeployment(@Headers Map<String, Object> headers, @Body ChorUndeploymentMessage chorUndeploymentMessage) {

//		List<ProcessBundleResultType> bundleResultTypes = new ArrayList<ProcessBundleResultType>();
//
//		List<DefaultMessage> answer = new ArrayList<DefaultMessage>();
//		for (ProcessBundleResultType processBundleResultType: chorUndeploymentMessage.getProcessModels()) {
//
//			
//			
//			
//			
//		}

		return chorUndeploymentMessage.getProcessModels();
	}

}
