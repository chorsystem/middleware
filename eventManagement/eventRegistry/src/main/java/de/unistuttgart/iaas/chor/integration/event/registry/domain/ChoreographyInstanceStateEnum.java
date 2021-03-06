package de.unistuttgart.iaas.chor.integration.event.registry.domain;

public enum ChoreographyInstanceStateEnum {
	ChoreographyInstance_Initializing, 
	ChoreographyInstance_Running, 
	ChoreographyInstance_Running_with_Completed, 
	ChoreographyInstance_Running_with_Faulted, 
	ChoreographyInstance_Running_with_Terminated, 
	ChoreographyInstance_Running_with_Completed_and_Faulted, 
	ChoreographyInstance_Running_with_Completed_and_Terminated, 
	ChoreographyInstance_Running_with_Faulted_and_Terminated,
	ChoreographyInstance_Running_with_Completed_and_Faulted_and_Terminated,
	ChoreographyInstance_Suspended, 
	ChoreographyInstance_Suspended_with_Completed, 
	ChoreographyInstance_Suspended_with_Faulted, 
	ChoreographyInstance_Suspended_with_Terminated, 
	ChoreographyInstance_Suspended_with_Completed_and_Faulted, 
	ChoreographyInstance_Suspended_with_Completed_and_Terminated, 
	ChoreographyInstance_Suspended_with_Faulted_and_Terminated,
	ChoreographyInstance_Suspended_with_Completed_and_Faulted_and_Terminated,
	ChoreographyInstance_Completed,
	ChoreographyInstance_Completed_with_Faulted, 
	ChoreographyInstance_Completed_with_Terminated,  
	ChoreographyInstance_Faulted_with_Terminated, 
	ChoreographyInstance_Completed_with_Faulted_and_Terminated,
	ChoreographyInstance_Faulted, 
	ChoreographyInstance_Terminated
}