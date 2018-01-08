package de.unistuttgart.iaas.chor.integration.event.registry.domain;

public enum ActivityInstanceStateEnum {
	Activity_Complete, Activity_Dead_Path, Activity_Executed, Activity_Executing, Activity_Faulted, Activity_Join_Failure, Activity_Ready, Activity_Terminated,
	Scope_Compensated, Scope_Compensating, Scope_Complete_With_Fault, Scope_Event_Handling_Ended, Scope_Handling_Event, Scope_Handling_Fault, Scope_Handling_Termination
}