package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.namespace.QName;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.correlation.CorrelationSet;

/**
 * Entity class which represents a deployed process model.
 * 
 * @author hahnml
 * @author weissas
 * 
 */
@Entity
public class ProcessModel {

	private String modelId;
	
	private String modelQName;

	private ProcessStateEnum processState;
	
	
	private List<ProcessModelSCEInstanceRef> processModelSCEInstanceRefs = new ArrayList<ProcessModelSCEInstanceRef>();

	private Collection<ProcessInstance> processInstances = new ArrayList<ProcessInstance>();

	private Collection<ProcessEvent> processEvents = new ArrayList<ProcessEvent>();

	private Collection<ChoreographyModel> choreographyModels = new ArrayList<ChoreographyModel>();
	
	private List<CorrelationSet> correlationSets = new ArrayList<CorrelationSet>();
	
	private byte[] breakpointInformationByteArray;

	@Id
	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	
//	public void setSceInstanceRefs(Collection<SCEInstanceRef> sceInstanceRefs) {
//		this.sceInstanceRefs = sceInstanceRefs;
//	}
//
//	@ManyToMany
//	@JoinTable(name = "PROCESS_MODEL_DEPLOYED_TO", joinColumns = { @JoinColumn(name = "processModelId", referencedColumnName = "modelId") }, inverseJoinColumns = { @JoinColumn(name = "sceInstanceId", referencedColumnName = "sceInstanceId") })
//	public Collection<SCEInstanceRef> getSceInstanceRefs() {
//		return sceInstanceRefs;
//	}


	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "processModel")
	public List<ProcessModelSCEInstanceRef> getProcessModelSCEInstanceRefs() {
		return processModelSCEInstanceRefs;
	}

	public void setProcessModelSCEInstanceRefs(List<ProcessModelSCEInstanceRef> processModelSCEInstanceRefs) {
		this.processModelSCEInstanceRefs = processModelSCEInstanceRefs;
	}

	public void setModelQName(QName modelQName) {
		this.modelQName = modelQName.toString();
	}

	public QName getModelQName() {
		return QName.valueOf(modelQName);
	}

	public void setProcessInstances(Collection<ProcessInstance> processInstances) {
		this.processInstances = processInstances;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "processModel")
	public Collection<ProcessInstance> getProcessInstances() {
		return processInstances;
	}

	public void setProcessEvents(Collection<ProcessEvent> processEvents) {
		this.processEvents = processEvents;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "processModel")
	public Collection<ProcessEvent> getProcessEvents() {
		return processEvents;
	}

	public void setProcessState(ProcessStateEnum processState) {
		this.processState = processState;
	}

	@Enumerated(EnumType.STRING)
	public ProcessStateEnum getProcessState() {
		return processState;
	}

	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "processModels")
	public Collection<ChoreographyModel> getChoreographyModels() {
		return choreographyModels;
	}

	public void setChoreographyModels(Collection<ChoreographyModel> choreographyModels) {
		this.choreographyModels = choreographyModels;
	}
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST }, mappedBy = "processModel")
	public List<CorrelationSet> getCorrelationSets() {
		return correlationSets;
	}

	public void setCorrelationSets(List<CorrelationSet> correlationSets) {
		this.correlationSets = correlationSets;
	}

	
	public byte[] getBreakpointInformationByteArray() {
		return breakpointInformationByteArray;
	}

	public void setBreakpointInformationByteArray(byte[] breakpointInformationByteArray) {
		this.breakpointInformationByteArray = breakpointInformationByteArray;
	}

	public void setBreakpointInformation(Object breakpointInformation) {
		//Convert to ByteArray which can be mapped to database
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = null;
		try {
			out = new ObjectOutputStream(bos);
			out.writeObject(breakpointInformation);
			setBreakpointInformationByteArray(bos.toByteArray());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
			    bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Transient
	public Object getBreakpointInformation() {
		ByteArrayInputStream bis = new ByteArrayInputStream(breakpointInformationByteArray);
		ObjectInput in = null;

		Object breakpointInformation = null;
		try {
			in = new ObjectInputStream(bis);
			breakpointInformation = in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return breakpointInformation;
	}
	
}
