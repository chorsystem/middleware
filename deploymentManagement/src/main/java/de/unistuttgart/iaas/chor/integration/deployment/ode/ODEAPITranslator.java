package de.unistuttgart.iaas.chor.integration.deployment.ode;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Headers;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.impl.DefaultMessage;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.cxf.binding.soap.SoapHeader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.unistuttgart.iaas.chor.commons.constants.Constants;
import de.unistuttgart.iaas.chor.commons.util.DOMUtils;
import de.unistuttgart.iaas.chor.commons.util.ZipUtils;
import de.unistuttgart.iaas.chor.integration.deployment.management.XMLFactory;
import de.unistuttgart.iaas.chor.messages.ProcessBundleResultType;
import de.unistuttgart.iaas.chor.messages.ProcessBundleType;
import de.unistuttgart.iaas.chor.messages.ServiceType;
import de.unistuttgart.iaas.marshalling.MarshallingUtils;

public class ODEAPITranslator {

	public  Object translate(@Headers Map<String, Object> headers, @Body String input) {

		String endpointHeader = (String) headers.get(Constants.ENGINE_ENDPOINTS_HEADER);

		List<String> endpoints = new ArrayList<String>();

		StringTokenizer st = new StringTokenizer(endpointHeader, ",");

		while (st.hasMoreElements()) {

			String element = (String) st.nextElement();

			if (element.startsWith(Constants.ENGINE_APACHE_ODE + "=")) {

				int index = element.indexOf("=");

				endpoints.add(element.substring(index + 1));
			}

		}

		
		
		ProcessBundleType processBundle = (ProcessBundleType)MarshallingUtils.unmarshalNonRootElements(input);
		
		

		return buildODEDeploymentMessage(endpoints, processBundle, (String) headers.get(Constants.CHOR_MODEL_ID_HEADER));
		
	}
	
	
	public  Object translateForUndeployment(@Headers Map<String, Object> headers, @Body String input) {

		String endpointHeader = (String) headers.get(Constants.ENGINE_ENDPOINTS_HEADER);

		List<String> endpoints = new ArrayList<String>();

		StringTokenizer st = new StringTokenizer(endpointHeader, ",");

		while (st.hasMoreElements()) {

			String element = (String) st.nextElement();

			if (element.startsWith(Constants.ENGINE_APACHE_ODE + "=")) {

				int index = element.indexOf("=");

				endpoints.add(element.substring(index + 1));
			}

		}

	ProcessBundleResultType processBundleResultType = (ProcessBundleResultType)MarshallingUtils.unmarshalNonRootElements(input);

	return buildODEUndeploymentMessage(endpoints, processBundleResultType);
		
	}
	

	private List<DefaultMessage> buildODEDeploymentMessage(List<String> endpoints, ProcessBundleType processBundleType, String choreographyModelID) {

		List<DefaultMessage> messages = new ArrayList<DefaultMessage>();

		for (String endpoint : endpoints) {

			byte[] zip = adaptWSDLs(processBundleType, endpoint);
			processBundleType.setProcessFolderZip(zip);
			
			DefaultMessage message = new DefaultMessage();

			message = configureMessageHeader(message, endpoint, choreographyModelID, processBundleType.getProcessModelID() );
			message = configureMessagePayload(message, processBundleType);
			messages.add(message);
			
			
		}

		return messages;

	}
	
	private List<DefaultMessage> buildODEUndeploymentMessage(List<String> endpoints, ProcessBundleResultType processBundleResultType) {

		List<DefaultMessage> messages = new ArrayList<DefaultMessage>();

		for (String endpoint : endpoints) {

			DefaultMessage message = new DefaultMessage();

			message = configureMessageHeader(message, endpoint, "http://www.apache.org/ode/deployapi/undeploy");
			message = configureMessagePayload(message, processBundleResultType);
			messages.add(message);
			
			
		}

		return messages;

	}

	private DefaultMessage configureMessageHeader(DefaultMessage message, String endpoint, String choroegraphyModelID, String processModelID) {

		message.setHeader(Exchange.DESTINATION_OVERRIDE_URL, endpoint);
		message.setHeader(CxfConstants.OPERATION_NAME, "Invoke");
		message.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://camel.apache.org/cxf/jaxws/dispatch");
		message.setHeader("SOAPAction", "http://www.apache.org/ode/deployapi/deploy");
		message.setHeader(Constants.CHOR_MODEL_ID_HEADER, choroegraphyModelID);
		message.setHeader(Constants.PROCESS_MODEL_ID_HEADER, processModelID);
		return message;
	}
	
	private DefaultMessage configureMessageHeader(DefaultMessage message, String endpoint, String soapAction) {

		message.setHeader(Exchange.DESTINATION_OVERRIDE_URL, endpoint);
		message.setHeader(CxfConstants.OPERATION_NAME, "Invoke");
		message.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://camel.apache.org/cxf/jaxws/dispatch");
		message.setHeader("SOAPAction", soapAction);
		return message;
	}
	

	
	private DefaultMessage configureMessagePayload(DefaultMessage message, ProcessBundleType processBundleType) {

		List<Element> elements = XMLFactory.instance().createXMLElementsList(processBundleType);

		CxfPayload<SoapHeader> cxfPayload = new CxfPayload<SoapHeader>(new ArrayList<SoapHeader>(), elements);
		message.setBody(cxfPayload, CxfPayload.class);

		return message;

	}
	
	private DefaultMessage configureMessagePayload(DefaultMessage message, ProcessBundleResultType processBundleType) {

		List<Element> elements = XMLFactory.instance().createXMLElementsList(processBundleType);

		CxfPayload<SoapHeader> cxfPayload = new CxfPayload<SoapHeader>(new ArrayList<SoapHeader>(), elements);
		message.setBody(cxfPayload, CxfPayload.class);

		return message;

	}
	
	
	private byte[] adaptWSDLs(ProcessBundleType processBundleType, String endpoint){
		
		
		Map<String, byte[]> unpackedFiles = ZipUtils.unzipArchive(processBundleType.getProcessFolderZip());
		
		int colonIndex = endpoint.lastIndexOf(":");
		int hostIndex = endpoint.indexOf("/", colonIndex);
		
		String hostURL = endpoint.substring(0, hostIndex+1);
		
		// get environment variable HOST_IP
		String chorSystemHostIP = System.getenv("CHORSYSTEM_HOST_IP");
		
		if(chorSystemHostIP == null){
			chorSystemHostIP = "localhost";
		}
		
		String chorSystemURL = "http://" + chorSystemHostIP + ":9000/odeHttpEndpoint";
		
		
		return adaptWSDLs(unpackedFiles, processBundleType, hostURL, chorSystemURL);
		
	}
	
	private byte[] adaptWSDLs(Map<String, byte[]> unpackedFiles, ProcessBundleType processBundleType, String hostURL, String chorSystemURL) {

		DocumentBuilder dBuilder;
		Document wsdlDoc = null;
		Transformer transformer = null; 
		
		try {
		
			dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			transformer = TransformerFactory.newInstance().newTransformer();

			for(Entry<String, byte[]> entry: unpackedFiles.entrySet()){
				
				if(entry.getKey().endsWith(".wsdl")){
				
					byte[] wsdlFile = entry.getValue();
						
					wsdlDoc = dBuilder.parse(new ByteArrayInputStream(wsdlFile));
					
					NodeList list = wsdlDoc.getChildNodes();
					Node definitions = null;

					for (int j = 0; j < list.getLength(); j++) {

						if (list.item(j).getNodeName() != null && list.item(j).getNodeName().endsWith("definitions")) {
							definitions = list.item(j);
							break;
						}

					}
					Node targetNamespace = definitions.getAttributes().getNamedItem("targetNamespace");
					
					
					List<Node> services = DOMUtils.getElementNode(definitions, "service");
					
					for(Node service: services){
						
						Node name = service.getAttributes().getNamedItem("name");
						
						QName serviceName = new QName(targetNamespace.getTextContent(), name.getTextContent());
						
						if(containsService(processBundleType.getInboundServices(), serviceName)){
							
							List<Node> addresses = retrieveServiceAdresses(service);
						
							for(Node address :addresses){
								
								Node location = address.getAttributes().getNamedItem("location");
								
								String oldLocation = location.getNodeValue();
								
								int colonIndex = oldLocation.lastIndexOf(":");
								int hostIndex = oldLocation.indexOf("/", colonIndex);
								
								String url = oldLocation.substring(hostIndex+1);
								
								location.setNodeValue(hostURL+url);	
							}	
							
						}
						else {
							List<Node> addresses = retrieveServiceAdresses(service);
							
							for(Node address :addresses){
								
								Node location = address.getAttributes().getNamedItem("location");
						
								location.setNodeValue(chorSystemURL);		
							}	
							
						}
					}
					
				
					ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
					Result output = new StreamResult(outputStream);
					Source input = new DOMSource(wsdlDoc);

					transformer.transform(input, output);
					
					entry.setValue(outputStream.toByteArray());
					outputStream.close();
					
				}
				
			}
		
			return ZipUtils.zipArchive(unpackedFiles);
			

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

//	private List<Node> retrieveServiceAdresses(Node definitions){
//		
//		List<Node> allAddresses = new ArrayList<Node>();
//		List<Node> services = DOMUtils.getElementNode(definitions, "service");
//		
//		for(Node service: services){
//			
//			List<Node> ports =  DOMUtils.getElementNode(service, "port");
//			
//			for(Node port :ports){
//				
//				List<Node> addresses = DOMUtils.getElementNode(port, "address");
//				
//				allAddresses.addAll(addresses);
//			}
//		}
//		
//		return allAddresses;
//	}
	
	private List<Node> retrieveServiceAdresses(Node service){
		
		List<Node> allAddresses = new ArrayList<Node>();
	
	
		List<Node> ports =  DOMUtils.getElementNode(service, "port");
			
		for(Node port :ports){
				
			List<Node> addresses = DOMUtils.getElementNode(port, "address");
				
			allAddresses.addAll(addresses);
		}
	
		
		return allAddresses;
	}
	
	private boolean containsService(List<ServiceType> serviceTypes, QName serviceName){
		
		for(ServiceType serviceType: serviceTypes){
			
			
			if(serviceType.getService().equals(serviceName)){
				return true;
			}
			
			
			
		}
		
		
		return false;
	}
}
