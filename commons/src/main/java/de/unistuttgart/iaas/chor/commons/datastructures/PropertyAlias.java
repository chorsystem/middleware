package de.unistuttgart.iaas.chor.commons.datastructures;

import javax.xml.namespace.QName;

public class PropertyAlias {

	private QName messageType;
	private String part;
	private QName property;
	private String query;
	public QName getMessageType() {
		return messageType;
	}
	public void setMessageType(QName messageType) {
		this.messageType = messageType;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public QName getProperty() {
		return property;
	}
	public void setProperty(QName property) {
		this.property = property;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	
	
}
