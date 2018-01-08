package de.unistuttgart.iaas.chor.integration.events;

import org.apache.camel.builder.RouteBuilder;

public class EventRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		
		from("activemq:topic:org.apache.ode.events?disableReplyTo=true")
		.multicast().
		to("activemq:topic:de.unistuttgart.chor.events", "direct:events");
		//.beanRef("eventMessageConsumer", "onMessage");
		
		

		from("direct:events").routeId("EventRoute2")
		.beanRef("eventMessageConsumer", "onMessage");
		

//		from("activemq:topic:org.apache.ode.events?disableReplyTo=true").routeId("EventRoute1")
//		.to("activemq:topic:de.unistuttgart.chor.events");
//		
//
//		from("activemq:topic:org.apache.ode.events?disableReplyTo=true").routeId("EventRoute2")
//		.beanRef("eventMessageConsumer", "onMessage");
		
	
		from("activemq:de.unistuttgart.chor.event.object").routeId("ObjectMessagesRoute")
		.beanRef("eventMessageConsumer", "onMessage");
		
		;
		
	}

}
