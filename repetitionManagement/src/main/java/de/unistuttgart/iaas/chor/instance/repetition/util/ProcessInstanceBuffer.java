package de.unistuttgart.iaas.chor.instance.repetition.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.pbd.ExtensibleElements;

public class ProcessInstanceBuffer {

	private Map<ExtensibleElements, ElementInstance> currentElementInstanceBuffer = new HashMap<ExtensibleElements, ElementInstance>();

	public Map<ExtensibleElements, ElementInstance> getCurrentElementInstanceBuffer() {
		return currentElementInstanceBuffer;
	}
	
	public void resetElements(){
		
		for(Entry<ExtensibleElements, ElementInstance> entry: currentElementInstanceBuffer.entrySet()){
			
			entry.getKey().setInstanceID(null);
			entry.getKey().setState(null);
		}
		
		
	}
	
	public void loadcurrentElementInstance(){
		
		for(Entry<ExtensibleElements, ElementInstance> entry: currentElementInstanceBuffer.entrySet()){
			
			entry.getKey().setInstanceID(entry.getValue().getInstanceID());
			entry.getKey().setState(entry.getValue().getState());
		}
		
		
	}
	
	
}
