package de.unistuttgart.iaas.chor.instance.management;

import java.util.UUID;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPFactory;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.camel.converter.jaxp.XmlConverter;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.headers.Header.Direction;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SOAPHeaderProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		CxfPayload<SoapHeader> payload = exchange.getIn().getBody(CxfPayload.class);

		
//		Message in = exchange.getIn();
//		if (in.getHeader(Header.HEADER_LIST) == null) {
//			in.setHeader(Header.HEADER_LIST, new ArrayList<SoapHeader>());
//		}
//		List<SoapHeader> headers = CastUtils.cast((List<?>) in.getHeader(Header.HEADER_LIST));
//		
		SoapHeader choreographyHeader = createChoreographyHeader(exchange);
		SoapHeader metaDataHeader = createMetaDataHeader(exchange);
		
		SoapHeader instanceWaitingTimeHeader = createInstanceWaitingTimeHeader(exchange);
		payload.getHeaders().add(choreographyHeader);
		payload.getHeaders().add(metaDataHeader);
		
		if(instanceWaitingTimeHeader != null){
			payload.getHeaders().add(instanceWaitingTimeHeader);
		}
		
		exchange.getIn().setBody(payload, CxfPayload.class);

	}

	private SoapHeader createChoreographyHeader(Exchange exchange) throws Exception {

		Long choreographyInstanceID = (Long) exchange.getIn().getHeader("choreographyInstanceID");
		String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?> " + "<choreographyHeader><choreographyInstanceID>" + choreographyInstanceID.toString()
				+ "</choreographyInstanceID><chorMessageID>" + UUID.randomUUID().toString()+  "</chorMessageID></choreographyHeader>";

		XmlConverter converter = new XmlConverter();
		Document outDocument = converter.toDOMDocument(xml, exchange);
		
		
		NodeList list = outDocument.getDocumentElement().getChildNodes();
		
		for(int i = 0; i< list.getLength(); i++){
			
			Node node = list.item(i);
			System.out.println(node.getLocalName() +"::" + node.getNodeValue() );
			
			NodeList list2 = node.getChildNodes();
			
			for(int j = 0; i< list2.getLength(); i++){
				
				Node node2 = list2.item(j);
				
				System.out.println(node2.getLocalName() + "::" + node.getNodeValue());
				
				
			}
		}
		
		
		SoapHeader soapHeader = new SoapHeader(new QName("http://iaas/chorsystem", "choreographyHeader"), outDocument.getDocumentElement());
		soapHeader.setDirection(Direction.DIRECTION_OUT);

		return soapHeader;
	}

	private SoapHeader createMetaDataHeader(Exchange exchange) throws Exception {
//
//		String xml = "<metaData xmlns=\"http://simtech.uni-stuttgart.de\" xmlns:simTech=\"http://simtech.uni-stuttgart.de\">"
//				+ "<mdProperty xmlns:NS1=\"http://simtech.uni-stuttgart.de\" NS1:name=\"version\" NS1:value=\"1\"/>" + "</metaData>";

		String xml = exchange.getIn().getHeader("metaData", String.class);
	
		XmlConverter converter = new XmlConverter();
		Document outDocument = converter.toDOMDocument(xml, exchange);
		
	

		SoapHeader soapHeader = new SoapHeader(new QName("http://iaas/chorsystem", "choreographyHeader"), outDocument.getDocumentElement());
		soapHeader.setDirection(Direction.DIRECTION_OUT);
		
		return soapHeader;

	}
	
	
	private SoapHeader createInstanceWaitingTimeHeader(Exchange exchange) throws Exception{
		
		Long instanceWaitingTime = exchange.getIn().getHeader("instanceWatingTime", Long.class);
		
		if(instanceWaitingTime != null && instanceWaitingTime > 0){
			
			
			String xml = "<invokeWaitingTime xmlns=\"http://simtech.uni-stuttgart.de\" xmlns:simTech=\"http://simtech.uni-stuttgart.de\">"
					+ instanceWaitingTime.toString() + "</invokeWaitingTime>";

			
			XmlConverter converter = new XmlConverter();
			Document outDocument = converter.toDOMDocument(xml, exchange);
			
			SoapHeader soapHeader = new SoapHeader(new QName("http://simtech.uni-stuttgart.de", "invokeWaitingTime", "simTech"), outDocument.getDocumentElement());
			soapHeader.setDirection(Direction.DIRECTION_OUT);
			return soapHeader;
		}
		
		return null;
	
	}

}
