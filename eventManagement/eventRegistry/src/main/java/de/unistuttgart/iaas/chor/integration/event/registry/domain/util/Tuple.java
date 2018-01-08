package de.unistuttgart.iaas.chor.integration.event.registry.domain.util;

import java.util.List;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;

public class Tuple {

	private List<ActivityInstance> activityInstances;
	private boolean completeRewind;

	public List<ActivityInstance> getActivityInstances() {
		return activityInstances;
	}

	public void setActivityInstances(List<ActivityInstance> activityInstances) {
		this.activityInstances = activityInstances;
	}

	public boolean isCompleteRewind() {
		return completeRewind;
	}

	public void setCompleteRewind(boolean completeRewind) {
		this.completeRewind = completeRewind;
	}

}
