package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class ActivityInstanceEvent extends ProcessInstanceEvent {

	private ActivityInstance activityInstance;

	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ 
		@JoinColumn(name="activityInstanceID", referencedColumnName = "activityInstanceID")
				})
	public ActivityInstance getActivityInstance() {
		return activityInstance;
	}

	public void setActivityInstance(ActivityInstance activityInstance) {
		this.activityInstance = activityInstance;
	}
}
