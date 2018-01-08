package de.unistuttgart.iaas.chor.instance.management;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

import de.unistuttgart.iaas.chor.commons.constants.Constants;

public class EngineEventInRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("activemq:queue:de.unistuttgart.iaas.chor.middleware.engines.in").routeId("EngineEventInRoute")
		.choice()
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_CHANGE_VARIABLE_VALUE))	
				.transform().method("instanceManager", "transformChangeVariableValueMessage")
				.dynamicRouter().method("instanceManager", "getEventQueue")
			.endChoice()
		
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_REGISTER_BREAKPOINTS))	
				.split().method("instanceManager", "splitChorRegisterRequestMessage")
				.dynamicRouter().method("instanceManager", "getEventQueue2").end().end()
			.endChoice()
		
			.when(header(Constants.METHOD_HEADER).isEqualTo(Constants.METHOD_SEND_EVENT))	
				.split().method("instanceManager", "transformIncomingEvent")
				.dynamicRouter().method("instanceManager", "getEventQueue").end().end()
				.endChoice()
		.endChoice();
		
		
		
		
		
		
		
	}

}
