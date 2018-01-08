package de.unistuttgart.iaas.chor.commons.messaging;

import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;

public class MessageProducer {

	@EndpointInject
	ProducerTemplate producer;

	public void sendMessage(Object message, String correlationID, String endpointURL) {

		endpointURL = endpointURL.replace("queue://", "activemq:");
		endpointURL = endpointURL + "?jmsMessageType=Text";
		
		producer.sendBodyAndHeader(endpointURL, message, "JMSCorrelationID", correlationID);

	}
	
	
	public void sendObject(Object message, String correlationID, String endpointURL) {

		endpointURL = endpointURL.replace("queue://", "activemq:");
		endpointURL = endpointURL + "?jmsMessageType=Object";
		
		producer.sendBodyAndHeader(endpointURL, message, "JMSCorrelationID", correlationID);

	}
	
}
