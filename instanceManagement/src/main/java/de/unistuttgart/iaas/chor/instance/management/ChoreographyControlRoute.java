package de.unistuttgart.iaas.chor.instance.management;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;

import de.unistuttgart.iaas.chor.commons.constants.Constants;

public class ChoreographyControlRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
			
		JaxbDataFormat format = new JaxbDataFormat();
		format.setContextPath("de.unistuttgart.iaas.chor.messages");
	
		
		from("activemq:de.unistuttgart.chor.control?concurrentConsumers=5").routeId("ChoreographyControlRoute1")
		.unmarshal(format)
		.log("Unmarshalled")
		.choice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_START))	
				.split().method("instanceManager", "startChoreographyInstance")
				.process(new SOAPHeaderProcessor())	
				.to("direct:generic")
				.endChoice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_SUSPEND))	
				.split().method("instanceManager", "controlChoreographyInstance")
				.to("direct:generic")
			.endChoice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_TERMINATE))	
				.split().method("instanceManager", "controlChoreographyInstance")
				.to("direct:generic")
				.endChoice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_RESUME))	
				.split().method("instanceManager", "controlChoreographyInstance")
				.to("direct:generic")
				.endChoice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_FINISH))	
				.split().method("instanceManager", "controlChoreographyInstance")
				.to("direct:generic")
				.endChoice()	
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_CHOR_INSTANCES))	
				.beanRef("instanceManager", "getChoreographyInstances")
				//.marshal(format)
				.to("activemq:de.unistuttgart.chor.designer.return?jmsMessageType=Text")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_CHOR_INSTANCE_HISTORY))	
				.beanRef("instanceManager", "getChoreographyInstanceHistory")
				//.marshal(format)
				.to("activemq:de.unistuttgart.chor.designer.return?jmsMessageType=Text")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_PROCESS_INSTANCES))	
				.beanRef("instanceManager", "getProcessInstances")
				//.marshal(format)
				.to("activemq:de.unistuttgart.chor.process.designer.return?jmsMessageType=Text")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_PROCESS_INSTANCE_HISTORY))	
				.beanRef("instanceManager", "getProcessInstanceHistory")
				//.marshal(format)
				.to("activemq:de.unistuttgart.chor.process.designer.return?jmsMessageType=Text")	
			.endChoice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_PREPARE_ITERATE))	
				.split().method("instanceManager", "prepareChoreographyInstanceForIteration")
				.to("direct:generic")
				.endChoice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_PREPARE_ITERATE_EXT))	
				.split().method("instanceManager", "prepareChoreographyInstanceForIteration")
				.to("direct:generic")
				.endChoice()	
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_RESUME_ITERATE))	
				.beanRef("instanceManager", "resumeChoreographyInstanceForIteration")
				.to("direct:generic")
				.endChoice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_PREPARE_REEXECUTE))	
				.split().method("instanceManager", "prepareChoreographyInstanceForIteration")
				.to("direct:generic")
				.endChoice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_PREPARE_REEXECUTE_EXT))	
				.split().method("instanceManager", "prepareChoreographyInstanceForIteration")
				.to("direct:generic")
				.endChoice()	
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_RESUME_REEXECUTE))	
				.beanRef("instanceManager", "resumeChoreographyInstanceForIteration")
				.to("direct:generic")
				.endChoice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_SNAPSHOTS))	
				.beanRef("instanceManager", "getSnapshots")
				//.marshal(format)
				.to("cxf:bean:genericOutboundSoapEndpoint")
				//.to("activemq:de.unistuttgart.chor.process.designer.return?jmsMessageType=Text")	
				.to("activemq:de.unistuttgart.chor.designer.return?jmsMessageType=Text")
			.endChoice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_SNAPSHOT_VARIABLES))	
				.beanRef("instanceManager", "getSnapshotVariables")
				//.marshal(format)
				.to("cxf:bean:genericOutboundSoapEndpoint")
				//.to("activemq:de.unistuttgart.chor.process.designer.return?jmsMessageType=Text")	
				.to("activemq:de.unistuttgart.chor.designer.return?jmsMessageType=Text")
			.endChoice()
		.endChoice();
		
		//.to("cxf:bean:genericOutboundSoapEndpoint?loggingFeatureEnabled=true")
		
		from(("direct:generic")).routeId("ChoreographyControlRoute2")
		.to("cxf:bean:genericOutboundSoapEndpoint")
		//.to("activemq:de.unistuttgart.chor.control.return")
		;
		
		
		from("activemq:de.unistuttgart.chor.start?concurrentConsumers=5").routeId("ChoreographyStartRoute")
		//.wireTap("file:C:\\Users\\weissas\\workspaces\\deployment_evaluation?fileName=startmessage.txt")	
		.unmarshal(format)
			.choice()
				.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_START))	
					.split().method("instanceManager", "startChoreographyInstance")
					.process(new SOAPHeaderProcessor())	
					.to("direct:generic")
			.endChoice();	
			
					
			
		}
		
	

}
