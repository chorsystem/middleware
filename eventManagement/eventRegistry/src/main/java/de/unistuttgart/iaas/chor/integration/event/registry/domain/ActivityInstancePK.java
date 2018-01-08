package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import java.io.Serializable;
import java.util.Random;

import javax.persistence.Embeddable;

@Embeddable
public class ActivityInstancePK implements Serializable {

	private static final long serialVersionUID = 1L;

	private String activityInstanceID;

	public ActivityInstancePK(String sceInstanceID, String processModelID, String processInstanceID, Long odeActivityInstanceID) {

		if (odeActivityInstanceID != null) {
			this.activityInstanceID = sceInstanceID + "::" + processModelID + "::" + processInstanceID + "::" + odeActivityInstanceID.toString();
		} else {
			System.out.println("ODE activity id was empty!");

			this.activityInstanceID = sceInstanceID + "::" + processModelID + "::" + processInstanceID + "::" + new Random().nextLong() + "Test";
		}
	}

	public ActivityInstancePK() {

	}

	public String getActivityInstanceID() {
		return activityInstanceID;
	}

	public void setActivityInstanceID(String activityInstanceID) {
		this.activityInstanceID = activityInstanceID;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ActivityInstancePK) {
			ActivityInstancePK pk = (ActivityInstancePK) obj;
			return this.activityInstanceID.equals(pk.activityInstanceID);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.activityInstanceID.hashCode();
	}

}
