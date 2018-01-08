package de.unistuttgart.iaas.marshalling;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;

import org.apache.ode.pmapi.GetSnapshotVariablesResponse;
import org.apache.ode.pmapi.GetSnapshotsResponse;
import org.apache.ode.pmapi.types._2006._08._02.ResponseType;
import org.apache.ode.pmapi.types._2006._08._02.TSnapshotInfoList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;

import de.unistuttgart.iaas.chor.messages.ChorBreakpointsRegisteredEventMessage;
import de.unistuttgart.iaas.chor.messages.ChorControlMessage;
import de.unistuttgart.iaas.chor.messages.ChorDeploymentEventMessage;
import de.unistuttgart.iaas.chor.messages.ChorDeploymentMessage;
import de.unistuttgart.iaas.chor.messages.ChorDeploymentResultMessage;
import de.unistuttgart.iaas.chor.messages.ChorIterationControlMessage;
import de.unistuttgart.iaas.chor.messages.ChorStartMessage;
import de.unistuttgart.iaas.chor.messages.ChorStartReturnMessage;
import de.unistuttgart.iaas.chor.messages.ChorUndeploymentEventMessage;
import de.unistuttgart.iaas.chor.messages.ChorUndeploymentMessage;
import de.unistuttgart.iaas.chor.messages.GetChorInstanceHistoryMessage;
import de.unistuttgart.iaas.chor.messages.GetChorInstanceHistoryReturnMessage;
import de.unistuttgart.iaas.chor.messages.GetChorInstancesMessage;
import de.unistuttgart.iaas.chor.messages.GetChorInstancesReturnMessage;
import de.unistuttgart.iaas.chor.messages.GetChorModelsMessage;
import de.unistuttgart.iaas.chor.messages.GetChorModelsReturnMessage;
import de.unistuttgart.iaas.chor.messages.GetProcessInstanceHistoryMessage;
import de.unistuttgart.iaas.chor.messages.GetProcessInstanceHistoryReturnMessage;
import de.unistuttgart.iaas.chor.messages.GetProcessInstancesMessage;
import de.unistuttgart.iaas.chor.messages.GetProcessInstancesReturnMessage;
import de.unistuttgart.iaas.chor.messages.GetSnapshotVariablesMessage;
import de.unistuttgart.iaas.chor.messages.GetSnapshotsMessage;
import de.unistuttgart.iaas.chor.messages.IterateChorInstanceMessage;
import de.unistuttgart.iaas.chor.messages.ProcessBundleResultType;
import de.unistuttgart.iaas.chor.messages.ProcessBundleType;

public class MarshallingUtils {

	private final static String CHORDEPLOYMENT_RESULT_MESSSAGE = "ChorDeploymentResultMessage";
	private final static String CHORDEPLOYMENT_MESSSAGE = "ChorDeploymentMessage";
	private final static String CHORUNDEPLOYMENT_MESSSAGE = "ChorUndeploymentMessage";
	private final static String CHORDEPLOYMENT_EVENT_MESSSAGE = "ChorDeploymentEventMessage";
	private final static String CHORUNDEPLOYMENT_EVENT_MESSSAGE = "ChorUndeploymentEventMessage";
	private final static String CHORSTART_RETURN_MESSAGE = "ChorStartReturnMessage";
	private final static String GETCHORINSTANCES_RETURN_MESSAGE = "GetChorInstancesReturnMessage";
	private final static String GETCHORINSTANCE_HISTORY_RETURN_MESSAGE = "GetChorInstanceHistoryReturnMessage";
	private final static String GETCHORMODELS_RETURN_MESSAGE = "GetChorModelsReturnMessage";
	private final static String GETPROCESSINSTANCES_RETURN_MESSAGE = "GetProcessInstancesReturnMessage";
	private final static String GETPROCESSINSTANCEHISTORY_RETURN_MESSAGE = "GetProcessInstanceHistoryReturnMessage";
	private final static String GETSNAPSHOTSRESPONSE = "getSnapshotsResponse";
	private final static String GETSNAPSHOTVARIABLESRESPONSE = "getSnapshotVariablesResponse";
	private final static String PROCESSBUNDLES = "processBundles";
	private final static String PROCESSBUNDLETYPE = "processBundleType";
	private final static String PROCESSMODELS = "processModels";
	private final static String PROCESSBUNDLERESULTTYPE = "processBundleResultType";
	private final static String CHORBREAKPOINTSREGISTERED_EVENT_MESSAGE = "ChorBreakpointsRegisteredEventMessage";

	// private final static String GETPROCESSINSTANCEHISTORY_RETURN_MESSAGE =
	// "GetProcessInstanceHistoryReturnMessage";

	public static String marshal(Object obj) {

		StringWriter sw = new StringWriter();

		JAXBContext jaxbContext = null;
		try {

			if (obj instanceof ChorDeploymentMessage) {
				jaxbContext = JAXBContext.newInstance(ChorDeploymentMessage.class);
			} else if (obj instanceof ChorUndeploymentMessage) {
				jaxbContext = JAXBContext.newInstance(ChorUndeploymentMessage.class);
			} else if (obj instanceof ChorStartMessage) {
				jaxbContext = JAXBContext.newInstance(ChorStartMessage.class);
			} else if (obj instanceof ChorControlMessage) {
				jaxbContext = JAXBContext.newInstance(ChorControlMessage.class);
			} else if (obj instanceof GetChorInstancesMessage) {
				jaxbContext = JAXBContext.newInstance(GetChorInstancesMessage.class);
			} else if (obj instanceof IterateChorInstanceMessage) {
				jaxbContext = JAXBContext.newInstance(IterateChorInstanceMessage.class);
			} else if (obj instanceof ChorIterationControlMessage) {
				jaxbContext = JAXBContext.newInstance(ChorIterationControlMessage.class);
			} else if (obj instanceof GetProcessInstancesMessage) {
				jaxbContext = JAXBContext.newInstance(GetProcessInstancesMessage.class);
			} else if (obj instanceof GetProcessInstanceHistoryMessage) {
				jaxbContext = JAXBContext.newInstance(GetProcessInstanceHistoryMessage.class);
			} else if (obj instanceof GetSnapshotsMessage) {
				jaxbContext = JAXBContext.newInstance(GetSnapshotsMessage.class);
			} else if (obj instanceof GetSnapshotVariablesMessage) {
				jaxbContext = JAXBContext.newInstance(GetSnapshotVariablesMessage.class);
			} else if (obj instanceof ProcessBundleType) {
				jaxbContext = JAXBContext.newInstance(ProcessBundleType.class);
			} else if (obj instanceof GetChorModelsMessage) {
				jaxbContext = JAXBContext.newInstance(GetChorModelsMessage.class);
			} else if (obj instanceof GetChorInstanceHistoryMessage) {
				jaxbContext = JAXBContext.newInstance(GetChorInstanceHistoryMessage.class);
			}

			if (jaxbContext == null) {
				return null;
			}

			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(obj, sw);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sw.toString();
	}

	public static Object unmarshal(String message) {

		Object result = null;
		try {
			JAXBContext jaxbContext = null;

			if (message.contains(CHORDEPLOYMENT_RESULT_MESSSAGE)) {
				jaxbContext = JAXBContext.newInstance(ChorDeploymentResultMessage.class);
			} else if (message.contains(CHORDEPLOYMENT_EVENT_MESSSAGE)) {
				jaxbContext = JAXBContext.newInstance(ChorDeploymentEventMessage.class);
			} else if (message.contains(CHORUNDEPLOYMENT_EVENT_MESSSAGE)) {
				jaxbContext = JAXBContext.newInstance(ChorUndeploymentEventMessage.class);
			} else if (message.contains(CHORDEPLOYMENT_EVENT_MESSSAGE)) {
				jaxbContext = JAXBContext.newInstance(ChorDeploymentEventMessage.class);
			} else if (message.contains(CHORSTART_RETURN_MESSAGE)) {
				jaxbContext = JAXBContext.newInstance(ChorStartReturnMessage.class);
			} else if (message.contains(GETCHORINSTANCES_RETURN_MESSAGE)) {
				jaxbContext = JAXBContext.newInstance(GetChorInstancesReturnMessage.class);
			} else if (message.contains(GETPROCESSINSTANCES_RETURN_MESSAGE)) {
				jaxbContext = JAXBContext.newInstance(GetProcessInstancesReturnMessage.class);
			} else if (message.contains(GETPROCESSINSTANCEHISTORY_RETURN_MESSAGE)) {
				jaxbContext = JAXBContext.newInstance(GetProcessInstanceHistoryReturnMessage.class);
			} else if (message.contains(GETSNAPSHOTSRESPONSE)) {
				jaxbContext = JAXBContext.newInstance(GetSnapshotsResponse.class);
			}else if (message.contains(GETSNAPSHOTVARIABLESRESPONSE)) {
				jaxbContext = JAXBContext.newInstance(GetSnapshotVariablesResponse.class);
				// message.indexOf(arg0)
			} else if (message.contains(CHORDEPLOYMENT_MESSSAGE)) {
				jaxbContext = JAXBContext.newInstance(ChorDeploymentMessage.class);
			} else if (message.contains(PROCESSBUNDLETYPE)) {
				jaxbContext = JAXBContext.newInstance(ProcessBundleType.class);
			} else if (message.contains(CHORBREAKPOINTSREGISTERED_EVENT_MESSAGE)) {
				jaxbContext = JAXBContext.newInstance(ChorBreakpointsRegisteredEventMessage.class);
			} else if (message.contains(GETCHORMODELS_RETURN_MESSAGE)) {
				jaxbContext = JAXBContext.newInstance(GetChorModelsReturnMessage.class);
			} else if (message.contains(GETCHORINSTANCE_HISTORY_RETURN_MESSAGE)) {
				jaxbContext = JAXBContext.newInstance(GetChorInstanceHistoryReturnMessage.class);
			}

			if (jaxbContext == null) {
				return null;
			}

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(message);

			result = jaxbUnmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;

	}

	public static Object unmarshalNonRootElements(String input) {

		JAXBContext jaxbContext = null;
		Object obj = null;
		JAXBElement root= null;
		XMLFilterImpl xmlFilter =  null;

		try {

			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			XMLReader reader = factory.newSAXParser().getXMLReader();
			
			if (input.contains(PROCESSBUNDLES)) {
				jaxbContext = JAXBContext.newInstance(ProcessBundleType.class);
				// The filter class to set the correct namespace
				xmlFilter = new DeploymentNamespaceFilter(reader);
			} else if (input.contains(PROCESSMODELS)) {
				jaxbContext = JAXBContext.newInstance(ProcessBundleResultType.class);
				xmlFilter = new DeploymentNamespaceFilter(reader);
			}
			

			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();			
			reader.setContentHandler(unmarshaller.getUnmarshallerHandler());
			InputStream inStream = new ByteArrayInputStream(input.getBytes());
			SAXSource source = new SAXSource(xmlFilter, new InputSource(inStream));

			
			if (input.contains(PROCESSBUNDLES)) {
				
				 root = unmarshaller.unmarshal(source, ProcessBundleType.class);
			} 
			else if (input.contains(PROCESSMODELS)) {
				
				 root = unmarshaller.unmarshal(source, ProcessBundleResultType.class);
			}
			
		
			obj = root.getValue();

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}

	public static String marshalNonRootElements(Object obj) {

		JAXBContext jaxbContext = null;;
		QName qName = null;
		JAXBElement root = null;

		StringWriter stringWriter = new StringWriter();

		try {

			if (obj instanceof ProcessBundleType) {
				jaxbContext = JAXBContext.newInstance(ProcessBundleType.class);
				qName = new QName("http://www.example.org/choreography_deployment_message", "processBundles");
				root = new JAXBElement(qName, ProcessBundleType.class, obj);

			} else if (obj instanceof ProcessBundleResultType) {
				jaxbContext = JAXBContext.newInstance(ProcessBundleResultType.class);
				qName = new QName("http://www.example.org/choreography_deployment_message", "processModels");
				root = new JAXBElement(qName, ProcessBundleResultType.class, obj);
			}

			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// format the XML output
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		

			jaxbMarshaller.marshal(root, stringWriter);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return stringWriter.toString();
	}

}
