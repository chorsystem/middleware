package de.unistuttgart.iaas.chor.commons.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import de.unistuttgart.iaas.chor.commons.datastructures.PropertyAlias;

public class DOMUtils {

	public static String getPrefix(String s) {

		int index = s.indexOf(":");
		return s.substring(0, index);

	}

	public static String getName(String s) {

		int index = s.indexOf(":");
		return s.substring(index + 1);

	}

	public static String getNamespaceForPrefix(NamedNodeMap namespacesMap, String prefix) {

		return namespacesMap.getNamedItem("xmlns:" + prefix).getNodeValue();

	}

	public static Node getElementNodeByAttributeValue(Node parent, String elementName, String attributeName, String attributeValue) {

		NodeList list = parent.getChildNodes();

		for (int i = 0; i < list.getLength(); i++) {

			Node node = list.item(i);

			if (node.getNodeName() != null && node.getNodeName().endsWith(elementName)) {

				Node attribute = node.getAttributes().getNamedItem(attributeName);

				if (attribute.getTextContent() != null && attribute.getTextContent().equals(attributeValue)) {

					return node;

				}

			}

		}

		return null;
	}
	
	public static List<Node> getElementNode(Node parent, String elementName) {

		NodeList list = parent.getChildNodes();
		
		List<Node> nodes = new ArrayList<Node>();

		for (int i = 0; i < list.getLength(); i++) {

			Node node = list.item(i);

			if (node.getNodeName() != null && node.getNodeName().endsWith(elementName)) {

				nodes.add(node);

			}

		}

		return nodes;
	}

	public static Node getElementNodeByAttributeValue(Document doc, String elementName, String attributeName, String attributeValue) {

		NodeList list = doc.getElementsByTagName(elementName);

		for (int i = 0; i < list.getLength(); i++) {

			Node node = list.item(i);

			Node attribute = node.getAttributes().getNamedItem(attributeName);

			if (attribute.getTextContent() != null && attribute.getTextContent().contains(attributeValue)) {

				return node;

			}
		}

		return null;
	}


	public static PropertyAlias readPropertyAliasesFromWSDL(byte[] wsdlFile, String messageName) {

		PropertyAlias propertyAlias = new PropertyAlias();

		DocumentBuilder dBuilder;
		Document wsdlDoc = null;
		try {

			File file = IOUtils.writeFileFromByteArray(wsdlFile, "test.wsdl");

			dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			ByteArrayInputStream in = new ByteArrayInputStream(wsdlFile);
			FileInputStream fis = new FileInputStream(file);

			wsdlDoc = dBuilder.parse(fis);

			Node node = getElementNodeByAttributeValue(wsdlDoc, "propertyAlias", "messageType", "tns:" + messageName);

			System.out.println();

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

		return propertyAlias;
	}

	public static PropertyAlias readPropertyAliasesFromWSDL(File folder, String messageName, String property) {

		PropertyAlias propertyAlias = null;

		DocumentBuilder dBuilder = null;
		Document deployDoc = null;
		Document wsdlDoc = null;
		try {

			dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			deployDoc = dBuilder.parse(folder.getPath() + "/deploy.xml");

			NodeList processes = deployDoc.getElementsByTagName("process");
			Node process = processes.item(0);

			String processName = DOMUtils.getName(process.getAttributes().getNamedItem("name").getTextContent());

			String wsdlFileName = IOUtils.determineWSDLFileName(folder, processName);

			wsdlDoc = dBuilder.parse(folder.getPath() + "/" + wsdlFileName);
			NamedNodeMap namespacesMap = wsdlDoc.getElementsByTagName("wsdl:definitions").item(0).getAttributes();

			Node node = getElementNodeByAttributeValue(wsdlDoc, "vprop:propertyAlias", "messageType", messageName);

			propertyAlias = readPropertyAlias(node, messageName, namespacesMap);

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

		return propertyAlias;
	}
	
	
	public static List<PropertyAlias> readPropertyAliasesFromWSDL(File folder, String property) {

		
		List<PropertyAlias> propertyAliases = new ArrayList<PropertyAlias>();
		
		DocumentBuilder dBuilder = null;
		Document deployDoc = null;
		Document wsdlDoc = null;
		try {

			dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			deployDoc = dBuilder.parse(folder.getPath() + "/deploy.xml");

			NodeList processes = deployDoc.getElementsByTagName("process");
			Node process = processes.item(0);

			String processName = DOMUtils.getName(process.getAttributes().getNamedItem("name").getTextContent());

			String wsdlFileName = IOUtils.determineWSDLFileName(folder, processName);

			wsdlDoc = dBuilder.parse(folder.getPath() + "/" + wsdlFileName);
			NamedNodeMap namespacesMap = wsdlDoc.getElementsByTagName("wsdl:definitions").item(0).getAttributes();

			
			NodeList propertyAliasNodeList = wsdlDoc.getElementsByTagName("propertyAlias");
			
			for(int i=0; i < propertyAliasNodeList.getLength(); i++){
				Node node = propertyAliasNodeList.item(i);
				
				Node propertyName = node.getAttributes().getNamedItem("propertyName");
				
				if(propertyName.getNodeValue() != null && propertyName.equals(property)){

					PropertyAlias propertyAlias = readPropertyAlias(propertyAliasNodeList.item(i), namespacesMap);
					propertyAliases.add(propertyAlias);	
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

		return propertyAliases;
	}
	
	public static String readMessageName(File folder, String activityModelID, String property) {

		String messageName = null;

		DocumentBuilder dBuilder = null;
		Document processDoc = null;
		Document wsdlDoc = null;
		try {

			dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			processDoc = dBuilder.parse(folder.getPath() + "/bpel");

			NodeList processes = processDoc.getElementsByTagName("process");
			Node process = processes.item(0);

			String processName = DOMUtils.getName(process.getAttributes().getNamedItem("name").getTextContent());

			
			Node receive = getElementNodeByAttributeValue(processDoc, "bpel:receive", "id", activityModelID);
			String portType = receive.getAttributes().getNamedItem("portType").getTextContent();
			
			String wsdlFileName = IOUtils.determineWSDLFileName(folder, processName);

			wsdlDoc = dBuilder.parse(folder.getPath() + "/" + wsdlFileName);
			NamedNodeMap namespacesMap = wsdlDoc.getElementsByTagName("wsdl:definitions").item(0).getAttributes();

			Node portTypeElement = getElementNodeByAttributeValue(wsdlDoc, "wsdl:portType", "name", getName(portType));
			portTypeElement.getChildNodes();
			
			
			

			
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

		return messageName;
	}
	

	//TODO: could be improved by reading actual part element and building query accordingly
	private static PropertyAlias readPropertyAlias(Node node, NamedNodeMap namespacesMap) {

		PropertyAlias propertyAlias = new PropertyAlias();

		Node part = node.getAttributes().getNamedItem("part");
		Node propertyName = node.getAttributes().getNamedItem("propertyName");
		String propertyNameString = getName(propertyName.getNodeValue());

		Node query = node.getFirstChild().getNextSibling();


		propertyAlias.setPart(part.getNodeValue());
		//propertyAlias.setMessageType(new QName(messageName));
		propertyAlias.setProperty(new QName(propertyNameString));
		// propertyAlias.setQuery(query.getFirstChild().getNodeValue());
		propertyAlias.setQuery("*/" + getName(query.getFirstChild().getNodeValue()));

		return propertyAlias;
	}
	
	private static PropertyAlias readPropertyAlias(Node node, String messageName, NamedNodeMap namespacesMap) {

		PropertyAlias propertyAlias = new PropertyAlias();

		Node part = node.getAttributes().getNamedItem("part");
		Node propertyName = node.getAttributes().getNamedItem("propertyName");
		String propertyNameString = getName(propertyName.getNodeValue());

		Node query = node.getFirstChild().getNextSibling();


		propertyAlias.setPart(part.getNodeValue());
		propertyAlias.setMessageType(new QName(messageName));
		propertyAlias.setProperty(new QName(propertyNameString));
		// propertyAlias.setQuery(query.getFirstChild().getNodeValue());
		propertyAlias.setQuery("*/" + getName(query.getFirstChild().getNodeValue()));

		return propertyAlias;
	}
	

	public static String getPropertyValue(List<Element> body, String query) {

		String propertyValue = null;
		Document doc = null;

		Element element = body.get(0);
	
		try {

			DOMSource domSource = new DOMSource(element);
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			StringWriter sw = new StringWriter();
			StreamResult sr = new StreamResult(sw);
			transformer.transform(domSource, sr);
			String message = sw.toString();
			
			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			doc = dBuilder.parse(new InputSource(new StringReader(message)));
		

			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();

			XPathExpression expr = xpath.compile(query);

			propertyValue = expr.evaluate(doc);

		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return propertyValue;
	}

}
