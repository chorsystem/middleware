package de.unistuttgart.iaas.chor.instance.services;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.support.SynchronizationAdapter;

public class CallbackTest implements Processor {

	@EndpointInject
	ProducerTemplate producer;

	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		
		MyCallback callback = new MyCallback();
		Object obj = exchange.getContext().getRegistry().lookupByName("cxf:bean:genericOutboundSoapEndpoint");
		
		System.out.println(exchange.getIn().getHeader(Exchange.DESTINATION_OVERRIDE_URL));
		//producer.asyncCallbackRequestBody("activemq:queue:de.unistuttgart.iaas.service", exchange.getIn().getBody(), callback);
		//producer.asyncCallback("activemq:queue:de.unistuttgart.iaas.service", exchange, callback);
		producer.asyncCallback("activemq:queue:de.unistuttgart.iaas.service", new ServiceLookupProcessor(), callback);
	}

	private static class MyCallback extends SynchronizationAdapter {

		@Override
		public void onComplete(Exchange exchange) {
			// this method is invoked when the exchange was a success and we can
			// get the response
			System.out.println("Im Future");
			System.out.println();
		}
		
		@Override
		public void onFailure(Exchange exchange){
			System.out.println("Fail");
			System.out.println();
		}

	}

}
