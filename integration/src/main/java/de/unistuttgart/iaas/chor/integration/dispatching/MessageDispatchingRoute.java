package de.unistuttgart.iaas.chor.integration.dispatching;

import org.apache.camel.builder.RouteBuilder;

import de.unistuttgart.iaas.chor.commons.constants.Constants;

public class MessageDispatchingRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		
		from("activemq:queue:de.unistuttgart.iaas.chor.middleware?disableReplyTo=true").routeId("MessageDispatchingRoute")
		.choice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_DEPLOY))
				.to("activemq:queue:de.unistuttgart.chor.deployment")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_UNDEPLOY))
				.to("activemq:queue:de.unistuttgart.chor.undeployment")	
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_START))	
				.to("activemq:queue:de.unistuttgart.chor.start")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_SUSPEND))	
				.to("activemq:queue:de.unistuttgart.chor.control")	
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_RESUME))	
				.to("activemq:queue:de.unistuttgart.chor.control")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_TERMINATE))	
				.to("activemq:queue:de.unistuttgart.chor.control")	
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_FINISH))	
				.to("activemq:queue:de.unistuttgart.chor.control")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_CHOR_INSTANCES))	
				.to("activemq:queue:de.unistuttgart.chor.control")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_CHOR_INSTANCE_HISTORY))	
				.to("activemq:queue:de.unistuttgart.chor.control")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_CHOR_MODELS))	
				.to("activemq:queue:de.unistuttgart.chor.deploymentinfo")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_PROCESS_INSTANCES))	
				.to("activemq:queue:de.unistuttgart.chor.control")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_PROCESS_INSTANCE_HISTORY))	
				.to("activemq:queue:de.unistuttgart.chor.control")		
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_PREPARE_ITERATE))	
				.to("activemq:queue:de.unistuttgart.chor.control")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_PREPARE_ITERATE_EXT))	
				.to("activemq:queue:de.unistuttgart.chor.control")	
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_RESUME_ITERATE))	
				.to("activemq:queue:de.unistuttgart.chor.control")	
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_PREPARE_REEXECUTE))	
				.to("activemq:queue:de.unistuttgart.chor.control")	
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_PREPARE_REEXECUTE_EXT))	
				.to("activemq:queue:de.unistuttgart.chor.control")		
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_RESUME_REEXECUTE))	
				.to("activemq:queue:de.unistuttgart.chor.control")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_SNAPSHOTS))	
				.to("activemq:queue:de.unistuttgart.chor.control")	
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_GET_SNAPSHOT_VARIABLES))	
				.to("activemq:queue:de.unistuttgart.chor.control")		
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_REGISTER_BREAKPOINTS))	
				.to("activemq:queue:de.unistuttgart.iaas.chor.middleware.engines.in")
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_SEND_EVENT))	
				.to("activemq:queue:de.unistuttgart.iaas.chor.middleware.engines.in")		
//			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_REGISTER_BREAKPOINTS))	
//				.to("activemq:queue:de.unistuttgart.chor.event.object")		
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_CHANGE_VARIABLE_VALUE))	
				.to("activemq:queue:de.unistuttgart.iaas.chor.middleware.engines.in")			
			.otherwise()
				.to("activemq:queue:de.unistuttgart.chor.dead")
		.endChoice()
		;
		
	
	}

	
	
	
	
}
