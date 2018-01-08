package de.unistuttgart.iaas.chor.integration.deployment;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.ode.deployapi.DeployUnit;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.messages.ChorDeploymentResultMessage;
import de.unistuttgart.iaas.chor.messages.ChoreographyBundleResultType;
import de.unistuttgart.iaas.chor.messages.ProcessBundleResultType;

public class DeploymentMessageResultAggregationStrategy implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

		DeployUnit deployUnit = newExchange.getIn().getBody(DeployUnit.class);
		ChorDeploymentResultMessage resultMessage = null;
		ChoreographyBundleResultType choreographyBundleResultType = null;

		if (oldExchange == null) {

			resultMessage = new ChorDeploymentResultMessage();
			choreographyBundleResultType = new ChoreographyBundleResultType();
			resultMessage.setChoreographyBundle(choreographyBundleResultType);
			choreographyBundleResultType.setChoreographyModelID(newExchange.getIn().getHeader(Constants.CHOR_MODEL_ID_HEADER, String.class));

			ProcessBundleResultType processBundleResultType = new ProcessBundleResultType();

			//processBundleResultType.setEndpoint(newExchange.getIn().getHeader(Exchange.DESTINATION_OVERRIDE_URL, String.class));
			processBundleResultType.setPackageName(deployUnit.getName());
			processBundleResultType.setProcessModelID("");

			choreographyBundleResultType.getProcessBundleResult().add(processBundleResultType);
			
			newExchange.getIn().setBody(resultMessage);
			newExchange.getIn().setHeader(Constants.METHOD_HEADER, Constants.METHOD_REGISTER_DEPLOYED_ARTIFACTS);
			
			return newExchange;

		} else {

			resultMessage = oldExchange.getIn().getBody(ChorDeploymentResultMessage.class);
			choreographyBundleResultType = resultMessage.getChoreographyBundle();

			ProcessBundleResultType processBundleResultType = new ProcessBundleResultType();

			//processBundleResultType.setEndpoint(newExchange.getIn().getHeader(Exchange.DESTINATION_OVERRIDE_URL, String.class));
			processBundleResultType.setPackageName(deployUnit.getName());
			processBundleResultType.setProcessModelID("");

			choreographyBundleResultType.getProcessBundleResult().add(processBundleResultType);
			
			oldExchange.getOut().setBody(resultMessage);
			return oldExchange;
		}

		

	
	}
}
