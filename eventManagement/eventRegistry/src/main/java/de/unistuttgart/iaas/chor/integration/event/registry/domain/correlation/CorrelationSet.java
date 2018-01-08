package de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.ProcessModel;

@Entity
public class CorrelationSet {

	private Long correlationSetID;
	private String name;
	private String properties;
	
	private List<Correlation> correlations = new ArrayList<Correlation>();
	
	private List<CorrelationSetInstance> correlationSetInstances = new ArrayList<CorrelationSetInstance>();
	
	private ProcessModel processModel;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getCorrelationSetID() {
		return correlationSetID;
	}
	public void setCorrelationSetID(Long correlationSetID) {
		this.correlationSetID = correlationSetID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "correlationSet")
	public List<Correlation> getCorrelations() {
		return correlations;
	}
	public void setCorrelations(List<Correlation> correlations) {
		this.correlations = correlations;
	}
	
	
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "processModelID", referencedColumnName = "modelId") })
	public ProcessModel getProcessModel() {
		return processModel;
	}
	
	public void setProcessModel(ProcessModel processModel) {
		this.processModel = processModel;
	}
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "correlationSet")
	public List<CorrelationSetInstance> getCorrelationSetInstances() {
		return correlationSetInstances;
	}
	
	public void setCorrelationSetInstances(List<CorrelationSetInstance> correlationSetInstances) {
		this.correlationSetInstances = correlationSetInstances;
	}	
	
	
}
