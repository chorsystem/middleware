package de.unistuttgart.iaas.chor.sce.management;

import org.apache.camel.builder.RouteBuilder;

import de.unistuttgart.iaas.scemanager.messages.sce.events.EngineInstance_Active;

public class ManagementRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		//ManagementMessageConsumer managementMessageConsumer = new ManagementMessageConsumer();
		
		from("activemq:queue:de.unistuttgart.iaas.sce.manager.in").routeId("ManagementRoute")
		
		.choice()
		.when(body(EngineInstance_Active.class))
			.multicast()
			.to("activemq:queue:de.unistuttgart.iaas.sce.manager.in.test", "direct:management")
		.endChoice()
		.otherwise()
		.to("direct:management");
		
		from("direct:management")
		.beanRef("managementMessageConsumer", "onMessage");
		
		
		
		
	}

}
