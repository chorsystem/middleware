package de.unistuttgart.iaas.chor.commons.util;

public class Utils {

	public static String createProcessInstanceKey(String sceInstanceID, String processModelID, Long odeActivityInstanceID){
		
		return sceInstanceID + "::" + processModelID + "::" + odeActivityInstanceID.toString() ;	
	}
	
}
