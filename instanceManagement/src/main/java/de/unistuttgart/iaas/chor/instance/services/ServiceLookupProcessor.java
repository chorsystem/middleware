package de.unistuttgart.iaas.chor.instance.services;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.sax.SAXSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.PollingConsumer;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.camel.converter.jaxp.XmlConverter;
import org.apache.camel.spi.BrowsableEndpoint;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.headers.Header.Direction;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.RegistrationInformationMessage.DeployedProcess;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.commons.messaging.JMSCommunication;
import de.unistuttgart.iaas.chor.commons.util.DOMUtils;
import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ChoreographyInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageExchangeEvent;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLink;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.SCEInstanceRef;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation.Correlation;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation.CorrelationSet;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation.CorrelationSetInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.iteration.Iteration;
import de.unistuttgart.iaas.chor.integration.headers.Routing;
import de.unistuttgart.iaas.chor.integration.service.registry.ServiceRegistry;
import de.unistuttgart.iaas.chor.integration.service.registry.domain.Service;
import de.unistuttgart.iaas.chor.messages.ChorControlMessage;

public class ServiceLookupProcessor implements Processor {

	private final static String ChorNS = "http://de.unistuttgart.iaas.chor.integration";
	private final static String ChorHeaderName = "routing";
	private final static String ServiceElementName = "service";
	private final static String PortElementName = "port";
	private final static String PortTypeElementName = "portType";
	private final static String ModelIdElementName = "modelId";
	private final static String IterationHeaderName = "iteration";

	private ServiceRegistry serviceRegistry;

	private EventRegistry eventRegistry;

	public ServiceRegistry getServiceRegistry() {
		return serviceRegistry;
	}

	public void setServiceRegistry(ServiceRegistry serviceRegistry) {
		this.serviceRegistry = serviceRegistry;
	}

	public EventRegistry getEventRegistry() {
		return eventRegistry;
	}

	public void setEventRegistry(EventRegistry eventRegistry) {
		this.eventRegistry = eventRegistry;
	}

	@Override
	public void process(Exchange exchange) throws Exception {

		CxfPayload<SoapHeader> payload = exchange.getIn().getBody(CxfPayload.class);

		List<SoapHeader> headers = payload.getHeaders();

		SoapHeader routingHeader = getRoutingHeader(headers);

		if (routingHeader == null) {
			throw new IllegalStateException("Routing header could not be found!");

		}

		process2(exchange, payload, headers, routingHeader);

	}

	private void process2(Exchange exchange, CxfPayload<SoapHeader> payload, List<SoapHeader> headers, SoapHeader routingHeader) {

		SoapHeader choreographySoapHeader = getChoreographyHeader(headers);
		Routing routing = unmarshalRoutingHeader(routingHeader);

		if (routing.getService() == null || routing.getPort() == null || routing.getPortType() == null) {
			throw new IllegalStateException("Routing header elements are empty !");

		}

		// ===============================================================================
		// Async
		// ===============================================================================

		SoapHeader messageHeader = getMessageHeaderHeader(headers);
		String messageID = getMessageID(messageHeader);
		Service service = null;

		// Different kings of correlation

		// CommunicationPair pair = null;
		// ProcessInstance receivingProcessInstance = null;

		// if(messageID != null){
		// List<Element> body = payload.getBody();
		// receivingProcessInstance = checkCorrelation(choreographyInstance,
		// messageID, body);
		//
		// }
		// // non-process services
		// else{
		// if(routing.getTo() != null){
		//
		// receivingProcessInstance =
		// eventRegistry.getProcessInstance(routing.getTo());
		//
		// }
		//
		// }

		// ===============================================================================
		// Iteration
		// ===============================================================================

		ChoreographyInstance choreographyInstance = getChoreographyInstance(choreographySoapHeader);
		Iteration iteration = eventRegistry.getLastestIteration(choreographyInstance);

		if (iteration != null) {

			// TODO: Implement logic to recognize the loop counter this request
			// originates from and sent to the corresponding instance

			// TODO: check this whole block if it's really implementing
			// everything correctly

			MessageLinkInstance messageLinkInstance = eventRegistry.getMessageLinkInstanceByMessageID(choreographyInstance, messageID);

			if (messageLinkInstance != null) {
				MessageLink messageLink = messageLinkInstance.getMessageLink();

				ProcessModel processModel = messageLink.getReceiver();

				ProcessInstance processInstance = eventRegistry.getOldestUnRepeatedProcessInstance(processModel, iteration.getRewindingPoints());

				SCEInstanceRef sceInstanceRef = processInstance.getSceInstanceRef();

				service = serviceRegistry.getService(routing.getService(), routing.getPortType(), routing.getPort(), routing.getModelId(), sceInstanceRef.getSceInstanceId());

				SoapHeader iterationHeader = buildIterationHeader(processInstance.getOdeProcessInstanceID().toString());
				headers.add(iterationHeader);

				exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL, service.getEndpointURL());

			}
			// Calling a non-process web service again due to iteration
			else {

				service = serviceRegistry.getService(routing.getService(), routing.getPortType(), routing.getPort());
				exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL, service.getEndpointURL());

			}

		}

		// initiating call of a participant or non-process service
		// else if (receivingProcessInstance!= null) {
		//
		// service = serviceRegistry.getService(routing.getService(),
		// routing.getPortType(), routing.getPort(), routing.getModelId(),
		// receivingProcessInstance.getSceInstanceRef().getSceInstanceId());
		// exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL,
		// service.getEndpointURL());
		//
		// routing.setFrom(receivingProcessInstance.getCompositePrimaryKey().getProcessInstanceID());
		// marshalRoutingHeader(routing, routingHeader);
		//
		// }

		else {

			if (routing.getModelId() != null) {

				service = serviceRegistry.getService(routing.getService(), routing.getPortType(), routing.getPort(), routing.getModelId());
			} else {
				service = serviceRegistry.getService(routing.getService(), routing.getPortType(), routing.getPort());

			}
			exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL, service.getEndpointURL());

		}

		if (service == null) {
			throw new IllegalStateException("No Service could be found for " + routing.getService().toString() + "::" + routing.getPortType().toString() + "::" + routing.getPort().toString()
					+ "::modelId:" + routing.getModelId());
		}
		//
		// int index = myRandom(0, services.size() - 1);
		// Object[] servicesArray = services.toArray();
		// Service service = (Service) servicesArray[index];

		// exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL,
		// "http://localhost:9081/ode/processes/Participant2-Participant2PortType-Service");

		// ==========================================
		// Configure instance waiting time
		// ==========================================

		if (choreographyInstance.getInstanceWaitingTime() != null) {

			SoapHeader instanceWaitingTimeHeader = createInstanceWaitingTimeHeader(choreographyInstance.getInstanceWaitingTime(), exchange);
			payload.getHeaders().add(instanceWaitingTimeHeader);
		}
	
		exchange.getIn().setHeader("operationName", "Invoke");
		exchange.getIn().setHeader("operationNamespace", "http://camel.apache.org/cxf/jaxws/dispatch");

	}

	private void process(Exchange exchange, CxfPayload<SoapHeader> payload, List<SoapHeader> headers, SoapHeader routingHeader) {

		SoapHeader choreographySoapHeader = getChoreographyHeader(headers);
		Routing routing = unmarshalRoutingHeader(routingHeader);

		if (routing.getService() == null || routing.getPort() == null || routing.getPortType() == null) {
			throw new IllegalStateException("Routing header elements are empty !");

		}

		// ===============================================================================
		// Async
		// ===============================================================================

		SoapHeader messageHeader = getMessageHeaderHeader(headers);
		String messageID = getMessageID(messageHeader);

		// Different kings of correlation
		ChoreographyInstance choreographyInstance = getChoreographyInstance(choreographySoapHeader);

		// CommunicationPair pair = null;
		ProcessInstance receivingProcessInstance = null;

		if (messageID != null) {
			List<Element> body = payload.getBody();
			receivingProcessInstance = checkCorrelation(choreographyInstance, messageID, body);

		}
		// non-process services
		else {
			if (routing.getTo() != null) {

				receivingProcessInstance = eventRegistry.getProcessInstance(routing.getTo());

			}

		}

		// ===============================================================================
		// Iteration
		// ===============================================================================

		Iteration iteration = eventRegistry.getLastestIteration(choreographyInstance);
		Service service = null;

		if (iteration != null && receivingProcessInstance == null) {

			// TODO: Implement logic to recognize the loop counter this request
			// originates from and sent to the corresponding instance

			MessageLinkInstance messageLinkInstance = eventRegistry.getMessageLinkInstanceByMessageID(choreographyInstance, messageID);

			if (messageLinkInstance != null) {
				MessageLink messageLink = messageLinkInstance.getMessageLink();

				ProcessModel processModel = messageLink.getReceiver();

				ProcessInstance processInstance = eventRegistry.getOldestUnRepeatedProcessInstance(processModel, iteration.getRewindingPoints());

				SCEInstanceRef sceInstanceRef = processInstance.getSceInstanceRef();

				service = serviceRegistry.getService(routing.getService(), routing.getPortType(), routing.getPort(), routing.getModelId(), sceInstanceRef.getSceInstanceId());

				SoapHeader iterationHeader = buildIterationHeader(processInstance.getOdeProcessInstanceID().toString());
				headers.add(iterationHeader);

				exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL, service.getEndpointURL());

			}
			// Calling a non-process web service again due to iteration
			else {

				service = serviceRegistry.getService(routing.getService(), routing.getPortType(), routing.getPort());
				exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL, service.getEndpointURL());

			}

		}

		// initiating call of a participant or non-process service
		else if (receivingProcessInstance != null) {

			service = serviceRegistry.getService(routing.getService(), routing.getPortType(), routing.getPort(), routing.getModelId(), receivingProcessInstance.getSceInstanceRef().getSceInstanceId());
			exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL, service.getEndpointURL());

			routing.setFrom(receivingProcessInstance.getCompositePrimaryKey().getProcessInstanceID());
			marshalRoutingHeader(routing, routingHeader);

		}

		else {

			if (routing.getModelId() != null) {

				service = serviceRegistry.getService(routing.getService(), routing.getPortType(), routing.getPort(), routing.getModelId());
			} else {
				service = serviceRegistry.getService(routing.getService(), routing.getPortType(), routing.getPort());

			}
			exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL, service.getEndpointURL());

		}

		if (service == null) {
			throw new IllegalStateException("No Service could be found for " + routing.getService().toString() + "::" + routing.getPortType().toString() + "::" + routing.getPort().toString()
					+ "::modelId:" + routing.getModelId());
		}
		//
		// int index = myRandom(0, services.size() - 1);
		// Object[] servicesArray = services.toArray();
		// Service service = (Service) servicesArray[index];

		// exchange.getIn().setHeader(Exchange.DESTINATION_OVERRIDE_URL,
		// "http://localhost:9081/ode/processes/Participant2-Participant2PortType-Service");

		

		exchange.getIn().setHeader("operationName", "Invoke");
		exchange.getIn().setHeader("operationNamespace", "http://camel.apache.org/cxf/jaxws/dispatch");

	}

	private SoapHeader getRoutingHeader(List<SoapHeader> headers) {

		for (SoapHeader soapHeader : headers) {

			if (soapHeader.getName().equals(new QName(ChorNS, ChorHeaderName)))
				return soapHeader;
		}

		return null;
	}

	private SoapHeader getChoreographyHeader(List<SoapHeader> headers) {

		for (SoapHeader soapHeader : headers) {

			if (soapHeader.getName().equals(new QName("choreographyInstanceID"))) {
				return soapHeader;
			}

		}

		return null;
	}

	private SoapHeader getMessageHeaderHeader(List<SoapHeader> headers) {

		for (SoapHeader soapHeader : headers) {

			if (soapHeader.getName().equals(new QName(ChorNS, "choreographyHeader"))) {
				return soapHeader;
			}

		}

		return null;
	}

	private ChoreographyInstance getChoreographyInstance(SoapHeader choreographySoapHeader) {

		Element headerElement = (Element) choreographySoapHeader.getObject();
		NodeList nodeList = headerElement.getChildNodes();

		String choreographyInstanceID = null;

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);

			if (node.getParentNode().getLocalName() != null && node.getParentNode().getLocalName().equals("choreographyInstanceID") && node.getNodeType() == Node.TEXT_NODE) {
				choreographyInstanceID = node.getTextContent();
			}

		}

		ChoreographyInstance choreographyInstance = eventRegistry.getChoreographyInstance(Long.valueOf(choreographyInstanceID));

		return choreographyInstance;
	}

	private String getMessageID(SoapHeader messageHeader) {

		if (messageHeader == null) {
			return null;
		}

		Element headerElement = (Element) messageHeader.getObject();
		NodeList nodeList = headerElement.getElementsByTagName("chorMessageID");

		Node node = nodeList.item(0);

		if (node.getFirstChild() != null && node.getFirstChild().getNodeType() == Node.TEXT_NODE) {
			return node.getFirstChild().getNodeValue();
		}

		return null;
	}

	private SoapHeader buildIterationHeader(String odeProcessInstanceID) {

		String xml = "<processInstanceID>" + odeProcessInstanceID + "</processInstanceID>";

		XmlConverter converter = new XmlConverter();
		Element element = null;
		try {
			element = converter.toDOMElement(new SAXSource(new InputSource(new StringReader(xml))));
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SoapHeader soapHeader = new SoapHeader(new QName(ChorNS, IterationHeaderName), element);
		// make sure direction is OUT since it is a response message.
		soapHeader.setDirection(Direction.DIRECTION_OUT);
		// newHeader.setMustUnderstand(false);

		return soapHeader;

	}

	private ProcessInstance checkCorrelation(ChoreographyInstance choreographyInstance, String messageID, List<Element> body) {

		// CommunicationPair pair = new CommunicationPair();

		JMSCommunication.getSync(messageID);

		MessageExchangeEvent sentEvent = eventRegistry.getMessageExchangeEvent(messageID, "sent");

		// ===============
		// sending part
		// ===============
		ActivityInstance sendingActivityInstance = sentEvent.getActivityInstance();
		ProcessInstance sendingProcessInstance = sendingActivityInstance.getProcessInstance();
		// pair.setSendingProcessInstance(sendingProcessInstance);

		Correlation sendingCorrelation = eventRegistry.getCorrelation(sendingActivityInstance.getElementModelID());

		CorrelationSet sendingCorrelationSet = null;

		if (sendingCorrelation != null) {
			sendingCorrelationSet = sendingCorrelation.getCorrelationSet();
		}

		// ===============
		// receiving part
		// ===============

		MessageLinkInstance messageLinkInstance = eventRegistry.getMessageLinkInstanceByMessageID(choreographyInstance, messageID);
		Correlation receivingCorrelation = null;

		if (messageLinkInstance != null) {

			MessageLink messageLink = messageLinkInstance.getMessageLink();

			String receivingActivityModelID = messageLink.getReceivingActivityModelID();
			receivingCorrelation = eventRegistry.getCorrelation(receivingActivityModelID);
		}

		if (sendingCorrelationSet != null) {

			String propertyValue = DOMUtils.getPropertyValue(body, sendingCorrelation.getQuery());
			eventRegistry.getOrCreateCorrelationSetInstance(sendingCorrelationSet, propertyValue, sendingProcessInstance);
		}

		if (receivingCorrelation != null && receivingCorrelation.getCorrelationSet() != null) {
			String propertyValue = DOMUtils.getPropertyValue(body, receivingCorrelation.getQuery());
			CorrelationSetInstance correlationSetInstance = eventRegistry.getCorrelationSetInstance(receivingCorrelation.getCorrelationSet(), propertyValue);

			if (correlationSetInstance != null) {

				return correlationSetInstance.getProcessInstance();
			}
		}

		return null;
	}

	private ProcessInstance checkCorrelation(List<Element> body) {

		Element message = body.get(0);

		if (message != null) {

			String messageName = message.getNodeName();
			String namespace = message.getNamespaceURI();
			Correlation correlation = eventRegistry.getCorrelation(new QName(namespace, messageName));

			if (correlation.getPattern().equals("response")) {

				CorrelationSet correlationSet = correlation.getCorrelationSet();

				String propertyValue = DOMUtils.getPropertyValue(body, correlation.getQuery());
				CorrelationSetInstance correlationSetInstance = eventRegistry.getCorrelationSetInstance(correlationSet, propertyValue);

				if (correlationSetInstance != null) {

					return correlationSetInstance.getProcessInstance();
				}

			}

		}

		return null;
	}

	private JAXBContext getJaxbContext() {

		JAXBContext jaxbContext = null;

		try {
			jaxbContext = JAXBContext.newInstance(Routing.class);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jaxbContext;
	}

	private void marshalRoutingHeader(Routing routing, SoapHeader soapHeader) {

		try {

			StringWriter sw = new StringWriter();

			getJaxbContext().createMarshaller().marshal(routing, sw);

			Node node = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(sw.toString().getBytes())).getDocumentElement();

			soapHeader.setObject(node);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Routing unmarshalRoutingHeader(SoapHeader soapHeader) {

		Object o = soapHeader.getObject();

		if (o instanceof Node) {

			try {
				o = getJaxbContext().createUnmarshaller().unmarshal((Node) o);
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (o instanceof Routing) {
			return (Routing) o;
		}

		return null;
	}

	private int myRandom(int low, int high) {
		return (int) (Math.random() * (high - low) + low);
	}

	private SoapHeader createInstanceWaitingTimeHeader(Long instanceWaitingTime, Exchange exchange) {

		if (instanceWaitingTime != null && instanceWaitingTime > 0) {

			String xml = "<invokeWaitingTime xmlns=\"http://simtech.uni-stuttgart.de\" xmlns:simTech=\"http://simtech.uni-stuttgart.de\">" + instanceWaitingTime.toString() + "</invokeWaitingTime>";

			XmlConverter converter = new XmlConverter();

			try {
				Document outDocument = converter.toDOMDocument(xml, exchange);

				SoapHeader soapHeader = new SoapHeader(new QName("http://simtech.uni-stuttgart.de", "invokeWaitingTime", "simTech"), outDocument.getDocumentElement());
				soapHeader.setDirection(Direction.DIRECTION_OUT);
				return soapHeader;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return null;

	}

//	private SoapHeader createTokenHeader(Exchange exchange) {
//
//		String xml = "<token>s!mT3chCrashS!m2016</token>";
//
//		XmlConverter converter = new XmlConverter();
//
//		try {
//			Document outDocument = converter.toDOMDocument(xml, exchange);
//
//			SoapHeader soapHeader = new SoapHeader(new QName("token"), outDocument.getDocumentElement());
//			soapHeader.setDirection(Direction.DIRECTION_OUT);
//			return soapHeader;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SAXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParserConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return null;
//
//	}

}
