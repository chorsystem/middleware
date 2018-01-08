package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class ProcessModelSCEInstanceRef {

	private Long id;
	
	private ProcessModel processModel;
	private SCEInstanceRef sceInstanceRef;
	private String odePackageName;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "sceInstanceID", referencedColumnName = "sceInstanceId") })
	public SCEInstanceRef getSceInstanceRef() {
		return sceInstanceRef;
	}

	public void setSceInstanceRef(SCEInstanceRef sceInstanceRef) {
		this.sceInstanceRef = sceInstanceRef;
	}

	public String getOdePackageName() {
		return odePackageName;
	}

	public void setOdePackageName(String odePackageName) {
		this.odePackageName = odePackageName;
	}

}
