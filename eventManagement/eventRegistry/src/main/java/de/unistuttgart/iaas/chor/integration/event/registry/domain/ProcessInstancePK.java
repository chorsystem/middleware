package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class ProcessInstancePK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String processInstanceID;
	

	public ProcessInstancePK(){
		
	}
	
	public ProcessInstancePK(String sceInstanceID, String processModelID, Long processInstanceID){
		
		this.processInstanceID = sceInstanceID + "::" + processModelID + "::" + processInstanceID.toString();
	
	}

	

	
//	public String getProcessModelID() {
//		return processModelID;
//	}
//
//
//	public void setProcessModelID(String processModelID) {
//		this.processModelID = processModelID;
//	}



	
	
public String getProcessInstanceID() {
		return processInstanceID;
	}

	public void setProcessInstanceID(String processInstanceID) {
		this.processInstanceID = processInstanceID;
	}

	//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof ProcessInstancePK) {
//			ProcessInstancePK pk = (ProcessInstancePK) obj;
//			return this.sceInstanceID.equals(pk.sceInstanceID) && this.processModelID.equals(pk.processModelID) && this.processInstanceID.equals(pk.processInstanceID);
//		} else {
//			return false;
//		}
//	}
//
//	@Override
//	public int hashCode() {
//		return this.sceInstanceID.hashCode() + this.processModelID.hashCode() + this.processInstanceID.hashCode();
//	}
//	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ProcessInstancePK) {
			ProcessInstancePK pk = (ProcessInstancePK) obj;
			return this.processInstanceID.equals(pk.processInstanceID) ;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.processInstanceID.hashCode() ;
	}
}
