package de.unistuttgart.iaas.chor.commons.messaging;

import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;

public class EventMessageProducer {

	@EndpointInject(uri = "activemq:topic:de.unistuttgart.chor.events?disableReplyTo=true&jmsMessageType=Text")
	ProducerTemplate producer;

	public void sendMessage(Object message, String jmsMessageType) {

		producer.setDefaultEndpointUri("activemq:topic:de.unistuttgart.chor.events?disableReplyTo=true&jmsMessageType=" + jmsMessageType);
		producer.sendBody(message);

	}

	public void sendMessage(Object message, String jmsMessageType, String destination) {

		producer.setDefaultEndpointUri("activemq:queue:" + destination + "?jmsMessageType=" + jmsMessageType+"&replyTo=queue//:de.unistuttgart.chor.designer.return");
		producer.sendBody(message);

	}

}
