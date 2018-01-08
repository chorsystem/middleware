package de.unistuttgart.iaas.chor.instance.services;

import org.apache.camel.builder.RouteBuilder;

public class ServiceRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("cxf:bean:genericInboundSoapEndpoint").routeId("ServiceRoute")
		.processRef("serviceLookupProcessor")
		.to("cxf:bean:genericOutboundSoapEndpoint")
		;
		
		

	
	}

}
