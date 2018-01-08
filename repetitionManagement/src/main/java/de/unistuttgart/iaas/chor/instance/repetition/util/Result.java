package de.unistuttgart.iaas.chor.instance.repetition.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.bpel4chor.model.chor.CMessageLink;

public class Result {

	private Map<String, ResultEntry> rewindingPointMap = new HashMap<String, ResultEntry>();
	private Map<CMessageLink, List<String>> messageLinkInstances = new HashMap<CMessageLink, List<String>>();
	
	public Map<String, ResultEntry> getRewindingPointMap() {
		return rewindingPointMap;
	}
	
	public Map<CMessageLink, List<String>> getMessageLinkInstances() {		
		return messageLinkInstances;
	}
	
	
	
	
	public void addMessageLinkInstance(CMessageLink cMessageLink){
		
		if(!messageLinkInstances.containsKey(cMessageLink)){
			
			List<String> instanceIDs = new ArrayList<String>();
			instanceIDs.add(cMessageLink.getInstanceID());
			messageLinkInstances.put(cMessageLink, instanceIDs);
		}
		else{
			
			List<String> instanceIDs = messageLinkInstances.get(cMessageLink);
			instanceIDs.add(cMessageLink.getInstanceID());
			
		}
	}
	
	
	
	
}
