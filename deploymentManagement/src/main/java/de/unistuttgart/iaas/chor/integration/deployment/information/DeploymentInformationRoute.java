package de.unistuttgart.iaas.chor.integration.deployment.information;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;

import de.unistuttgart.iaas.chor.commons.constants.Constants;

// @yussupvr: route for retrieving the currently deployed choreography models

public class DeploymentInformationRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		JaxbDataFormat format = new JaxbDataFormat();
		format.setContextPath("de.unistuttgart.iaas.chor.messages");
		
		from("activemq:queue:de.unistuttgart.chor.deploymentinfo?concurrentConsumers=5").routeId("DeploymentInformationRoute1")
		.unmarshal(format)
		.log("Unmarshalled")
		.choice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_CHOR_MODELS))	
				.beanRef("ChoreographyModelsBean", "queryChoreographyModels")
				.to("activemq:de.unistuttgart.chor.designer.return?jmsMessageType=Text");
	}

}
