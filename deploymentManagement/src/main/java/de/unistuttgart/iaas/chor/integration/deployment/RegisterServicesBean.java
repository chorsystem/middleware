package de.unistuttgart.iaas.chor.integration.deployment;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.unistuttgart.iaas.chor.commons.util.DOMUtils;
import de.unistuttgart.iaas.chor.commons.util.IOUtils;
import de.unistuttgart.iaas.chor.commons.util.QNameTriple;
import de.unistuttgart.iaas.chor.commons.util.ZipUtils;
import de.unistuttgart.iaas.chor.integration.service.registry.ServiceRegistry;
import de.unistuttgart.iaas.chor.messages.ProcessBundleType;
import de.unistuttgart.iaas.chor.messages.ServiceType;
import de.unistuttgart.iaas.marshalling.MarshallingUtils;

public class RegisterServicesBean {

	ServiceRegistry serviceRegistry;

	public ServiceRegistry getServiceRegistry() {
		return serviceRegistry;
	}

	public void setServiceRegistry(ServiceRegistry serviceRegistry) {
		this.serviceRegistry = serviceRegistry;
	}

	public String registerProcessInterfaces(@Headers Map<String, Object> headers, @Body String input) {

		ProcessBundleType processBundleType = (ProcessBundleType) MarshallingUtils.unmarshalNonRootElements(input);

		byte[] zip = processBundleType.getProcessFolderZip();

		Map<String, byte[]> unpackedFiles = ZipUtils.unzipArchive(zip);

		List<QNameTriple> triples = readFiles(unpackedFiles, processBundleType.getProcessArtifactWSDL());

		for (QNameTriple triple : triples) {

			ServiceType serviceType = new ServiceType();
			serviceType.setService(triple.getService());
			serviceType.setPort(triple.getPort());
			serviceType.setPortType(triple.getPortType());
			processBundleType.getInboundServices().add(serviceType);
			serviceRegistry.registerService(triple.getService(), triple.getPort(), triple.getPortType(), processBundleType.getProcessModelID());

		}

		String message = MarshallingUtils.marshalNonRootElements(processBundleType);
		return message;
	}

	private List<QNameTriple> readFiles(Map<String, byte[]> unpackedFiles, String processArtifactsWSDL) {

		List<QNameTriple> triples = new ArrayList<QNameTriple>();

		DocumentBuilder dBuilder;
		Document deployDoc = null;
		Document wsdlDoc = null;
		try {
			dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

			byte[] deployFile = unpackedFiles.get("deploy.xml");

			deployDoc = dBuilder.parse(new ByteArrayInputStream(deployFile));

			NodeList deploys = deployDoc.getElementsByTagName("deploy");

			Node deploy = deploys.item(0);
			NamedNodeMap namespacesMap = deploy.getAttributes();

			// NodeList processes = deployDoc.getElementsByTagName("process");
			// Node process = processes.item(0);

			// String processName =
			// DOMUtils.getName(process.getAttributes().getNamedItem("name").getTextContent());

			byte[] wsdlFile = unpackedFiles.get(processArtifactsWSDL);

			wsdlDoc = dBuilder.parse(new ByteArrayInputStream(wsdlFile));

			NodeList providelist = deployDoc.getElementsByTagName("provide");

			for (int i = 0; i < providelist.getLength(); i++) {

				QNameTriple triple = new QNameTriple();

				Node provide = providelist.item(i);

				setService(triple, provide, namespacesMap);
				setPortType(triple, wsdlDoc, processArtifactsWSDL, unpackedFiles);

				triples.add(triple);
			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return triples;
	}

//	private List<QNameTriple> readFiles(File folder) {
//
//		List<QNameTriple> triples = new ArrayList<QNameTriple>();
//
//		DocumentBuilder dBuilder;
//		Document deployDoc = null;
//		Document wsdlDoc = null;
//		try {
//			dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//			deployDoc = dBuilder.parse(folder.getPath() + "/deploy.xml");
//
//			NodeList deploys = deployDoc.getElementsByTagName("deploy");
//
//			Node deploy = deploys.item(0);
//			NamedNodeMap namespacesMap = deploy.getAttributes();
//
//			NodeList processes = deployDoc.getElementsByTagName("process");
//			Node process = processes.item(0);
//
//			String processName = DOMUtils.getName(process.getAttributes().getNamedItem("name").getTextContent());
//
//			String wsdlFileName = IOUtils.determineWSDLFileName(folder, processName);
//
//			wsdlDoc = dBuilder.parse(folder.getPath() + "/" + wsdlFileName);
//
//			NodeList providelist = deployDoc.getElementsByTagName("provide");
//
//			for (int i = 0; i < providelist.getLength(); i++) {
//
//				QNameTriple triple = new QNameTriple();
//
//				Node provide = providelist.item(i);
//
//				setService(triple, provide, namespacesMap);
//				setPortType(triple, wsdlDoc);
//
//				triples.add(triple);
//			}
//
//		} catch (ParserConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SAXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return triples;
//	}

	private void setPortType(QNameTriple triple, Document doc, String processArtifactsWSDL, Map<String, byte[]> unpackedFiles) {

		NodeList list = doc.getChildNodes();
		Node definitions = null;

		for (int i = 0; i < list.getLength(); i++) {

			if (list.item(i).getNodeName() != null && list.item(i).getNodeName().endsWith("definitions")) {
				definitions = list.item(i);
				break;
			}

		}

		Node service = DOMUtils.getElementNodeByAttributeValue(definitions, "service", "name", triple.getService().getLocalPart());

		// External WSDL seems to define provides,
		// we have to check all other WSDL files, too.
		if (service == null) {
			doc = checkOtherWSDLsForService(processArtifactsWSDL, unpackedFiles, triple);
			
			list = doc.getChildNodes();
			for (int i = 0; i < list.getLength(); i++) {

				if (list.item(i).getNodeName() != null && list.item(i).getNodeName().endsWith("definitions")) {
					definitions = list.item(i);
					break;
				}

			}
			
			service = DOMUtils.getElementNodeByAttributeValue(definitions, "service", "name", triple.getService().getLocalPart());
		}

		Node port = DOMUtils.getElementNodeByAttributeValue(service, "port", "name", triple.getPort().getLocalPart());

		Node bindingAttribute = port.getAttributes().getNamedItem("binding");
		String bindingName = DOMUtils.getName(bindingAttribute.getTextContent());

		Node binding = DOMUtils.getElementNodeByAttributeValue(definitions, "binding", "name", bindingName);
		Node typeAttribute = binding.getAttributes().getNamedItem("type");
		String typeName = DOMUtils.getName(typeAttribute.getTextContent());

		triple.setPortType(new QName(triple.getService().getNamespaceURI(), typeName));

	}

	private void setService(QNameTriple triple, Node provide, NamedNodeMap namespacesMap) {

		NodeList services = provide.getChildNodes();

		for (int i = 0; i < services.getLength(); i++) {
			Node node = services.item(i);

			if (node.getNodeName() != null && node.getNodeName().equals("service")) {
				Node service = node;
				NamedNodeMap map = service.getAttributes();
				Node name = map.getNamedItem("name");
				Node port = map.getNamedItem("port");

				String servicePrefix = DOMUtils.getPrefix(name.getTextContent());
				String serviceName = DOMUtils.getName(name.getTextContent());
				String serviceNamespace = DOMUtils.getNamespaceForPrefix(namespacesMap, servicePrefix);

				triple.setService(new QName(serviceNamespace, serviceName));
				triple.setPort(new QName(serviceNamespace, port.getTextContent()));

			}

		}

	}

	private Document checkOtherWSDLsForService(String processArtifactsWSDL, Map<String, byte[]> unpackedFiles, QNameTriple triple) {

		DocumentBuilder dBuilder;
		Document wsdlDoc = null;

		try {
			dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

			for (Entry<String, byte[]> entry : unpackedFiles.entrySet()) {

				if (entry.getKey().endsWith(".wsdl") && !entry.getKey().equals(processArtifactsWSDL)) {

					byte[] wsdlFile = unpackedFiles.get(entry.getKey());
					wsdlDoc = dBuilder.parse(new ByteArrayInputStream(wsdlFile));

					NodeList list = wsdlDoc.getChildNodes();
					Node definitions = null;

					for (int i = 0; i < list.getLength(); i++) {

						if (list.item(i).getNodeName() != null && list.item(i).getNodeName().endsWith("definitions")) {
							definitions = list.item(i);
							break;
						}

					}

					Node service = DOMUtils.getElementNodeByAttributeValue(definitions, "service", "name", triple.getService().getLocalPart());

					if (service != null) {

						return wsdlDoc;

					}
				}

			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
