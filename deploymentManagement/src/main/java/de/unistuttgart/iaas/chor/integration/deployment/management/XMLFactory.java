package de.unistuttgart.iaas.chor.integration.deployment.management;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.sax.SAXSource;

import org.apache.camel.converter.jaxp.XmlConverter;
import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import de.unistuttgart.iaas.chor.messages.ProcessBundleResultType;
import de.unistuttgart.iaas.chor.messages.ProcessBundleType;

public class XMLFactory {

	private static XMLFactory instance;

	public static XMLFactory instance() {

		if (instance == null) {
			instance = new XMLFactory();
		}
		return instance;
	}

	public List<Element> createXMLElementsList(ProcessBundleType processBundleType) {

		List<Element> elements = new ArrayList<Element>();

		try {

			XmlConverter converter = new XmlConverter();
			String xml = getXML(processBundleType);

			Element element = converter.toDOMElement(new SAXSource(new InputSource(new StringReader(xml))));
			elements.add(element);

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

		return elements;

	}
	
	public List<Element> createXMLElementsList(ProcessBundleResultType processBundleResultType) {

		List<Element> elements = new ArrayList<Element>();

		try {

			XmlConverter converter = new XmlConverter();
			String xml = getXML(processBundleResultType);

			Element element = converter.toDOMElement(new SAXSource(new InputSource(new StringReader(xml))));
			elements.add(element);

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

		return elements;

	}


	private String getXML(ProcessBundleType processBundleType) {

		StringBuffer sb = new StringBuffer();

		sb.append("<pmap:deploy xmlns:pmap=\"http://www.apache.org/ode/pmapi\">");
		sb.append("<name>");
		sb.append(processBundleType.getProcessFileName());
		sb.append("</name>");
		sb.append("<modelId>");
		sb.append(processBundleType.getProcessModelID());
		sb.append("</modelId>");
		sb.append("<package>");
		sb.append("<zip xmlns=\"http://www.apache.org/ode/deployapi\">");
		
		byte[] encoded = Base64.encodeBase64(processBundleType.getProcessFolderZip());
		sb.append(new String(encoded));
		
		
		sb.append("</zip>");
		sb.append("</package>");
		sb.append("</pmap:deploy>");

		return sb.toString();
	}

	private String getXML(ProcessBundleResultType processBundleResultType) {

		StringBuffer sb = new StringBuffer();

		sb.append("<pmap:undeploy xmlns:pmap=\"http://www.apache.org/ode/pmapi\">");
		sb.append("<packageName>");
		sb.append(processBundleResultType.getPackageName());
		sb.append("</packageName>");
		
		sb.append("</pmap:undeploy>");

		return sb.toString();
	}
	
	
}


