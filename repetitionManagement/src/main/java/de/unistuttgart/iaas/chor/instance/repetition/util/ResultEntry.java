package de.unistuttgart.iaas.chor.instance.repetition.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.Process;

public class ResultEntry {

	
	private Process processInstance;
	private Map<Activity, String> activityInstances = new HashMap<Activity, String>();
	private boolean completeRewind = false;
	
	public boolean isCompleteRewind() {
		return completeRewind;
	}
	
	public void setCompleteRewind(boolean completeRewind) {
		this.completeRewind = completeRewind;
	}

	public Map<Activity, String> getActivityInstances() {
		return activityInstances;
	}

	public Process getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(Process processInstance) {
		this.processInstance = processInstance;
	}
	
	
	
	
}
