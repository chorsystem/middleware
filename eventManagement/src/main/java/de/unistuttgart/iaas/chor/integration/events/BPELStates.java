/**
 * 
 */
package de.unistuttgart.iaas.chor.integration.events;

/**
 * @author aeichel
 * @author hahnml
 * @author weissas
 *
 */
public enum BPELStates {
	
	Initial,
	Inactive,
	Ready,
	Deployed,
	Instantiated,
	Suspended,
	Running,
	Executing,
	Waiting,
	Completed,
	EventHandling,
	FaultHandling,
	TerminationHandling,
	CompensationExecuting,
	Terminated,
	Finished,
	Compensated,
	Faulted,
	CompletedWithFault,
	DeadPath,
	Blocking,
	Link_Ready,
	Link_Evaluated,
	Link_Set_True,
	Link_Set_False,
	Link_Blocking,
	MessageLink_Set_True,
	MessageLink_Set_False,
	MessageLink_Set_Evalutating,
	MessageLink_Unknown
	
}
