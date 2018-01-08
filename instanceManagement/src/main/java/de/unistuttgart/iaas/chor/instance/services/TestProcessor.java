package de.unistuttgart.iaas.chor.instance.services;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.cxf.binding.soap.SoapHeader;
import org.w3c.dom.Element;

public class TestProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {

		System.out.println("In Testprocessor");
		
		CxfPayload<SoapHeader> payload = exchange.getIn().getBody(CxfPayload.class);
		
		List<Element> elements = payload.getBody();
		
		System.out.println();
	}

}
