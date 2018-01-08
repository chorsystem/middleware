package de.unistuttgart.iaas.chor.integration.deployment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;

import de.unistuttgart.iaas.chor.commons.constants.Constants;

public class DeploymentRoute extends RouteBuilder{

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
		
		from("activemq:queue:de.unistuttgart.chor.deployment?disableReplyTo=true").routeId("DeploymentRoute1")
		//.wireTap("file:C:\\Users\\weissas\\workspaces\\deployment_evaluation?fileName=deploymentmessage.txt")
		.unmarshal(chorBundleJaxb)
		
		.beanRef("choreographyArtifactRegistry", "registerChorArtifacts")
		
		.beanRef("deploymentMessageConsumer","onMessage")
			.choice()
				.when(header(Constants.DEPLOYED_HEADER).isEqualTo("true"))
					//.to("activemq:queue:de.unistuttgart.chor.deployment.return")
					.beanRef("deploymentMessageConsumer","notifyEditor")
					
				.otherwise()
				
				
				.split().tokenizeXML("processBundles").parallelProcessing()
					//.setHeader(Constants.PROCESS_BUNDLE_NO_HEADER, property("CamelSplitIndex"))
					//.setHeader(Constants.PROCESS_BUNDLE_SIZE_HEADER, property("CamelSplitSize"))
					
					.filter().xpath("/processBundles/deployed/text()=\"false\"")
					
					
					.beanRef("registerServicesBean", "registerProcessInterfaces")
					.beanRef("endpointLocatorBean", "determineEndpoints")
					//.recipientList().method("dynamicTranslatorRecipientList", "route");
					.recipientList(header(Constants.TRANSLATOR_ENDPOINTS_HEADER)).parallelProcessing();
		
//					.to("cxf:bean:odeDeploymentEndpoint");
			
		
		
		//TODO: add more consumers here
		from(Constants.TRANSLATOR_ODE_QUEUE+"?concurrentConsumers=8").routeId("DeploymentRoute2")
		.split().method("odeAPITranslator", "translate").parallelProcessing().executorService(executor)
		//.to(Constants.DEPLOYMENT_OUTBOUND_QUEUE);
		.to("cxf:bean:genericOutboundSoapEndpoint");
		//.beanRef("deploymentMessageConsumer", "finishDeployment");
		
		//.to("cxf:bean:genericOutboundSoapEndpoint");
		//.recipientList().method("endpointRecipientListBean", "getEndpoints");
		
		
//		from(Constants.DEPLOYMENT_OUTBOUND_QUEUE+"?concurrentConsumers=5")
//		.to("cxf:bean:genericOutboundSoapEndpoint");
//		
	}

}
