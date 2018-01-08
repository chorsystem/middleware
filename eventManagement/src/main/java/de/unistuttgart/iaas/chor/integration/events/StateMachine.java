/**
 * 
 */
package de.unistuttgart.iaas.chor.integration.events;

import org.apache.ode.bpel.extensions.comm.messages.engineOut.ActivityEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Complete;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Dead_Path;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Executed;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Executing;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Faulted;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Ready;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Activity_Terminated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.InstanceEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Completed;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Faulted;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Running;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Suspended;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Instance_Terminated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.LinkEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Link_Evaluated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Link_Ready;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Link_Set_False;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Link_Set_True;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Loop_Condition_False;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Loop_Condition_True;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Loop_Iteration_Complete;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.ProcessEventMessage;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Process_Deployed;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Process_Instantiated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Compensated;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Compensating;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Complete_With_Fault;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Event_Handling_Ended;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Handling_Event;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Handling_Fault;
import org.apache.ode.bpel.extensions.comm.messages.engineOut.Scope_Handling_Termination;




/**
 * 
 * @author hahnml
 * @author weissas
 * 
 */
public class StateMachine {

	public static BPELStates computeNewActivityState(ActivityEventMessage message) {
		BPELStates result = BPELStates.Inactive;

		if (message instanceof Activity_Ready) {
			// @hahnml: Potentially blocking event
			if (((Activity_Ready) message).getBlocking()) {
				result = BPELStates.Blocking;
			} else {
				result = BPELStates.Ready;
			}
		} else if (message instanceof Activity_Executing) {
			result = BPELStates.Executing;
		} else if (message instanceof Activity_Executed) {
			// @hahnml: Potentially blocking event
			if (((Activity_Executed) message).getBlocking()) {
				result = BPELStates.Blocking;
			} else {
				result = BPELStates.Waiting;
			}
		} else if (message instanceof Activity_Complete) {
			result = BPELStates.Completed;
		} else if (message instanceof Activity_Terminated) {
			result = BPELStates.Terminated;
		} else if (message instanceof Activity_Faulted) {
			// @hahnml: Potentially blocking event
			if (((Activity_Faulted) message).getBlocking()) {
				result = BPELStates.Blocking;
			} else {
				result = BPELStates.Faulted;
			}
		} else if (message instanceof Activity_Dead_Path) {
			result = BPELStates.DeadPath;
		} else if (message instanceof Scope_Handling_Termination) {
			// @hahnml: Potentially blocking event
			if (((Scope_Handling_Termination) message).getBlocking()) {
				result = BPELStates.Blocking;
			} else {
				result = BPELStates.TerminationHandling;
			}
		} else if (message instanceof Scope_Handling_Event) {
			result = BPELStates.EventHandling;
		} else if (message instanceof Scope_Event_Handling_Ended) {
			result = BPELStates.Executing;
		} else if (message instanceof Scope_Handling_Fault) {
			// @hahnml: Potentially blocking event
			if (((Scope_Handling_Fault) message).getBlocking()) {
				result = BPELStates.Blocking;
			} else {
				result = BPELStates.FaultHandling;
			}
		} else if (message instanceof Scope_Compensating) {
			// @hahnml: Potentially blocking event
			if (((Scope_Compensating) message).getBlocking()) {
				result = BPELStates.Blocking;
			} else {
				result = BPELStates.CompensationExecuting;
			}
		} else if (message instanceof Scope_Compensated) {
			result = BPELStates.Compensated;
		} else if (message instanceof Scope_Complete_With_Fault) {
			// @hahnml: Potentially blocking event
			if (((Scope_Complete_With_Fault) message).getBlocking()) {
				result = BPELStates.Blocking;
			} else {
				result = BPELStates.CompletedWithFault;
			}
		} else if (message instanceof Loop_Condition_False) {
			// @hahnml: Potentially blocking event
			if (((Loop_Condition_False) message).getBlocking()) {
				result = BPELStates.Blocking;
			} else {
				result = BPELStates.Executing;
			}
		} else if (message instanceof Loop_Condition_True) {
			// @hahnml: Potentially blocking event
			if (((Loop_Condition_True) message).getBlocking()) {
				result = BPELStates.Blocking;
			} else {
				result = BPELStates.Executing;
			}
		} else if (message instanceof Loop_Iteration_Complete) {
			// @hahnml: Potentially blocking event
			if (((Loop_Iteration_Complete) message).getBlocking()) {
				result = BPELStates.Blocking;
			} else {
				result = BPELStates.Executing;
			}
		}
		return result;
	}

	public static BPELStates computeNewInstanceState(BPELStates oldState,
			ProcessEventMessage message) {
		BPELStates result = oldState;

		if (message instanceof Process_Deployed) {
			result = BPELStates.Deployed;
		} else if (message instanceof Process_Instantiated) {
			result = BPELStates.Instantiated;
		} else if (message instanceof Instance_Running) {
			result = BPELStates.Running;
		} else if (message instanceof Instance_Suspended) {
			result = BPELStates.Suspended;
		} else if (message instanceof Instance_Terminated) {
			result = BPELStates.Terminated;
		} else if (message instanceof Instance_Completed) {
			result = BPELStates.Completed;
		} else if (message instanceof Instance_Faulted) {
			result = BPELStates.Faulted;
		}
		return result;
	}

	/**
	 * @author hahnml
	 * 
	 *         Restores the state of the activity after the blocking is
	 *         released.
	 * 
	 * @param message
	 * @return
	 */
	public static BPELStates computeActivityStateAfterBlocking(
			InstanceEventMessage message) {

		BPELStates result = BPELStates.Blocking;

		if (message instanceof Activity_Ready) {
			result = BPELStates.Ready;
		} else if (message instanceof Activity_Executing) {
			result = BPELStates.Executing;
		} else if (message instanceof Activity_Executed) {
			result = BPELStates.Waiting;
		} else if (message instanceof Activity_Complete) {
			result = BPELStates.Completed;
		} else if (message instanceof Activity_Terminated) {
			result = BPELStates.Terminated;
		} else if (message instanceof Activity_Faulted) {
			result = BPELStates.Faulted;
		} else if (message instanceof Activity_Dead_Path) {
			result = BPELStates.DeadPath;
		} else if (message instanceof Scope_Handling_Termination) {
			result = BPELStates.TerminationHandling;
		} else if (message instanceof Scope_Handling_Event) {
			result = BPELStates.EventHandling;
		} else if (message instanceof Scope_Event_Handling_Ended) {
			result = BPELStates.Executing;
		} else if (message instanceof Scope_Handling_Fault) {
			result = BPELStates.FaultHandling;
		} else if (message instanceof Scope_Compensating) {
			result = BPELStates.CompensationExecuting;
		} else if (message instanceof Scope_Compensated) {
			result = BPELStates.Compensated;
		} else if (message instanceof Scope_Complete_With_Fault) {
			result = BPELStates.CompletedWithFault;
		} else if (message instanceof Loop_Condition_False) {
			result = BPELStates.Executing;
		} else if (message instanceof Loop_Condition_True) {
			result = BPELStates.Executing;
		} else if (message instanceof Loop_Iteration_Complete) {
			result = BPELStates.Executing;
		}
		return result;
	}
	
	//@hahnml
	public static BPELStates computeNewLinkState(LinkEventMessage message) {
		BPELStates state = BPELStates.Inactive;
		
		if (message instanceof Link_Ready) {
			state = BPELStates.Link_Ready;
		} else if (message instanceof Link_Evaluated) {
			// @hahnml: Potentially blocking event
			if (((Link_Evaluated) message).getBlocking()) {
				state = BPELStates.Link_Blocking;
			} else {
				state = BPELStates.Link_Evaluated;
			}
		} else if (message instanceof Link_Set_False) {
			state = BPELStates.Link_Set_False;
		} else if (message instanceof Link_Set_True) {
			state = BPELStates.Link_Set_True;
		}
		
		return state;
	}
	
	public static BPELStates computeLinkStateAfterBlocking(
			LinkEventMessage message) {
		BPELStates result = BPELStates.Blocking;

		if (message instanceof Link_Evaluated) {
			result = BPELStates.Link_Evaluated;
		}
		
		return result;
	}
}
