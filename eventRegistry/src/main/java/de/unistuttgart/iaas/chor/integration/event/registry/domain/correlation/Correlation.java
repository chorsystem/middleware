package de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.xml.namespace.QName;

@Entity
public class Correlation {

	private Long correlationID;
	private String activityModelID;
	private String pattern;
	private String initiate;
	
	private QName messageType;
	private String part;
	private String query;
	
	private CorrelationSet correlationSet;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(Long correlationID) {
		this.correlationID = correlationID;
	}

	public String getActivityModelID() {
		return activityModelID;
	}

	public void setActivityModelID(String activityModelID) {
		this.activityModelID = activityModelID;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getInitiate() {
		return initiate;
	}

	public void setInitiate(String initiate) {
		this.initiate = initiate;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({
			@JoinColumn(name = "correlationSet", referencedColumnName = "correlationSetID") })
	public CorrelationSet getCorrelationSet() {
		return correlationSet;
	}

	public void setCorrelationSet(CorrelationSet correlationSet) {
		this.correlationSet = correlationSet;
	}

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

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
}
