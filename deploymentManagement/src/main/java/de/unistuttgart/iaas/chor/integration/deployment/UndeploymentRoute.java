package de.unistuttgart.iaas.chor.integration.deployment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;

import de.unistuttgart.iaas.chor.commons.constants.Constants;

public class UndeploymentRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		
		
		
		JaxbDataFormat processBundleJaxb = new JaxbDataFormat();
		processBundleJaxb.setContextPath("de.unistuttgart.iaas.chor.messages");
		processBundleJaxb.setPartClass("de.unistuttgart.iaas.chor.messages.ProcessBundleType");
		processBundleJaxb.setPartNamespace("http://www.example.org/choreography_deployment_message");
		processBundleJaxb.setFragment(true);
		
		JaxbDataFormat chorBundleJaxb = new JaxbDataFormat();
		chorBundleJaxb.setContextPath("de.unistuttgart.iaas.chor.messages");
		
		ExecutorService executor = Executors.newFixedThreadPool(20);
	
		// Deployment Route
		
		from("activemq:queue:de.unistuttgart.chor.undeployment?disableReplyTo=true").routeId("UndeploymentRoute1")
		
		.unmarshal(chorBundleJaxb)
	
		.beanRef("deploymentMessageConsumer","prepareUndeployment")
		.split().method("undeploymentSplitter", "prepareUndeployment").parallelProcessing()
		.beanRef("endpointLocatorBean", "determineEndpoints")
		.recipientList(header(Constants.TRANSLATOR_ENDPOINTS_HEADER)).parallelProcessing();
		
		
		
		from(Constants.TRANSLATOR_ODE_UNDEPLOYMENT_QUEUE+"?concurrentConsumers=8").routeId("UndeploymentRoute2")
		.split().method("odeAPITranslator", "translateForUndeployment").parallelProcessing().executorService(executor)
		.to("cxf:bean:genericOutboundSoapEndpoint");
		
		
	
	
		
	}

}
