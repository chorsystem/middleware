package de.unistuttgart.iaas.marshalling;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;

public class SnapshotNamespaceFilter extends XMLFilterImpl{
	
	public SnapshotNamespaceFilter(XMLReader arg0){
		super(arg0);
	}
	
	  @Override
	    public void startElement(String uri, String localName,
	                             String qName, Attributes attributes)
	                             throws SAXException {
	       super.startElement("http://www.apache.org/ode/pmapi/types/2006/08/02/", localName, qName, 
	                          attributes);
	    }

}
