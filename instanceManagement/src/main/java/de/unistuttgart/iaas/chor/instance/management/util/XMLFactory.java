package de.unistuttgart.iaas.chor.instance.management.util;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.sax.SAXSource;

import org.apache.camel.converter.jaxp.XmlConverter;
import org.apache.ode.pmapi.types._2006._08._02.TVariableRef;
import org.apache.ode.pmapi.types._2006._08._02.TVariableRefList;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import de.unistuttgart.iaas.chor.commons.constants.Constants;

public class XMLFactory {

	private static XMLFactory instance;

	public static XMLFactory instance() {

		if (instance == null) {
			instance = new XMLFactory();
		}
		return instance;
	}

	public List<Element> createXMLElementsList(String method, String content) {

		List<Element> elements = new ArrayList<Element>();

		try {

			XmlConverter converter = new XmlConverter();
			String xml = getXML(method, content);

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
	

	
	
	public List<Element> createXMLElementsList(String method, long iid, String parameter ) {

		List<Element> elements = new ArrayList<Element>();

		try {

			XmlConverter converter = new XmlConverter();
			String xml = getXML(method, iid, parameter);
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
	
	public List<Element> createXMLElementsList(String content) {

		List<Element> elements = new ArrayList<Element>();

		try {

			XmlConverter converter = new XmlConverter();
		
			Element element = converter.toDOMElement(new SAXSource(new InputSource(new StringReader(content))));
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

	private String getXML(String method, String content) {

		if (method.equals(Constants.METHOD_SUSPEND)) {

			return "<suspend xmlns=\"http://www.apache.org/ode/pmapi\"><iid>" + content + "</iid></suspend>";

		} else if (method.equals(Constants.METHOD_TERMINATE)) {
			return "<terminate xmlns=\"http://www.apache.org/ode/pmapi\"><iid>" + content + "</iid></terminate>";
		}
		else if (method.equals(Constants.METHOD_FINISH)) {
			return "<finish xmlns=\"http://www.apache.org/ode/pmapi\"><iid>" + content + "</iid></finish>";
		}
		else if (method.equals(Constants.METHOD_RESUME)) {
			return "<resume xmlns=\"http://www.apache.org/ode/pmapi\"><iid>" + content + "</iid></resume>";
		}
		

		return "";
	}
	
	
	private String getXML(String method, long iid, String parameter) {

		if (method.equals(Constants.METHOD_GET_SNAPSHOTS)) {

			return "<getSnapshots xmlns=\"http://www.apache.org/ode/pmapi\"><iid>" + iid + "</iid><activityXPath>"+ parameter + "</activityXPath></getSnapshots>";

		}
		else if (method.equals(Constants.METHOD_GET_SNAPSHOT_VARIABLES)) {
			return "<getSnapshotVariables xmlns=\"http://www.apache.org/ode/pmapi\"><iid>" + iid + "</iid><snapshotId>"+ parameter + "</snapshotId></getSnapshotVariables>";
		}
		

		return "";
	}

	public List<Element> createXMLElementsListForRepetition(long iid, String xpath, String snapshotXPath, long version, TVariableRefList list, String method) {

		List<Element> elements = new ArrayList<Element>();

		
		try {

			XmlConverter converter = new XmlConverter();
			
			StringBuffer sb = new StringBuffer();
			
			
			if(method.equals(Constants.METHOD_PREPARE_ITERATE)){
				sb.append("<iterate xmlns=\"http://www.apache.org/ode/pmapi\">");
				sb.append(createIterationContent(iid, xpath));
				sb.append("</iterate>");
			}
			else if(method.equals(Constants.METHOD_PREPARE_ITERATE_EXT)){
				sb.append("<iterateExt xmlns=\"http://www.apache.org/ode/pmapi\">");
				sb.append(createIterationExtContent(iid, xpath,snapshotXPath,version, list));
				sb.append("</iterateExt>");
			}
			else if(method.equals(Constants.METHOD_RESET_AND_TERMINATE)){
				sb.append("<resetAndTerminate xmlns=\"http://www.apache.org/ode/pmapi\">");
				sb.append(createIterationContent(iid, xpath));
				sb.append("</resetAndTerminate>");
			}
			
			// TODO: implement a changed version of the reexecute method that does not need the snapshot xpath
			// but will select them automatically. This has also to be changed in the workflow engine.
			else if(method.equals(Constants.METHOD_PREPARE_REEXECUTE)){
				sb.append("<reexecute xmlns=\"http://www.apache.org/ode/pmapi\">");
				sb.append(createReexecutionContent(iid, xpath,snapshotXPath,version));
				sb.append("</reexecute>");
			}
			else if(method.equals(Constants.METHOD_PREPARE_REEXECUTE_EXT)){
				sb.append("<reexecuteExt xmlns=\"http://www.apache.org/ode/pmapi\">");
				sb.append(createReexecutionExtContent(iid,xpath,snapshotXPath,version,list));
				sb.append("</reexecuteExt>");
			}
			
			
			
			Element element = converter.toDOMElement(new SAXSource(new InputSource(new StringReader(sb.toString()))));
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
	
		
	private String createIterationContent(long iid, String xpath){
		
		StringBuffer sb = new StringBuffer();
		sb.append("<iid>");
		sb.append(iid);
		sb.append("</iid>");
		sb.append("<xpath>");
		sb.append(xpath);
		sb.append("</xpath>");
		
		return sb.toString();
	}
	
	private String createIterationExtContent(long iid, String xpath, String snapshotXPath, long version, TVariableRefList list){
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("<iid>");
		sb.append(iid);
		sb.append("</iid>");
		sb.append("<xpath>");
		sb.append(xpath);
		sb.append("</xpath>");
		sb.append("<snapshotXPath>");
		sb.append(snapshotXPath);
		sb.append("</snapshotXPath>");
		sb.append("<version>");
		sb.append(version);
		sb.append("</version>");
		
		sb.append("<variables>");
		for(TVariableRef variable: list.getVariable()){
			
			sb.append("<variable iid=\"" + variable.getIid()+ "\" siid=\"" + variable.getSiid() + "\" name=\"" + variable.getName() +  "\"/>");
				
		}
		sb.append("</variables>");
		
		
		return sb.toString();
		
		
	}
	
	private String createReexecutionContent(long iid, String xpath, String snapshotXPath, long version){
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("<iid>");
		sb.append(iid);
		sb.append("</iid>");
		sb.append("<xpath>");
		sb.append(xpath);
		sb.append("</xpath>");
		sb.append("<snapshotXPath>");
		sb.append(snapshotXPath);
		sb.append("</snapshotXPath>");
		sb.append("<version>");
		sb.append(version);
		sb.append("</version>");
		
		
		return sb.toString();
		
		
	}
	
	
	private String createReexecutionExtContent(long iid, String xpath, String snapshotXPath, long version, TVariableRefList list){
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("<iid>");
		sb.append(iid);
		sb.append("</iid>");
		sb.append("<xpath>");
		sb.append(xpath);
		sb.append("</xpath>");
		sb.append("<snapshotXPath>");
		sb.append(snapshotXPath);
		sb.append("</snapshotXPath>");
		sb.append("<version>");
		sb.append(version);
		sb.append("</version>");
		
		sb.append("<variables>");
		for(TVariableRef variable: list.getVariable()){
			
			sb.append("<variable iid=\"" + variable.getIid()+ "\" siid=\"" + variable.getSiid() + "\" name=\"" + variable.getName() +  "\"/>");
				
		}
		sb.append("</variables>");
		
		
		return sb.toString();
		
		
	}
	

	
}
