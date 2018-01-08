package de.unistuttgart.iaas.chor.integration.events;

import org.apache.ode.bpel.extensions.comm.messages.engineOut.ActivityEventMessage;

import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.ActivityInstanceStateEnum;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstance;
import de.unistuttgart.iaas.chor.integration.event.registry.domain.MessageLinkInstanceStateEnum;

public class MessageLinkInstanceStateMachine {

	public static MessageLinkInstanceStateEnum calculateMessageLinkInstanceState(MessageLinkInstance messageLinkInstance, ActivityEventMessage evt) {

		// if (messageLinkInstance.getSendingActivityInstance() == null ||
		// messageLinkInstance.getReceivingActivityInstance() == null) {
		// return MessageLinkInstanceStateEnum.Unknown;
		// }

		MessageLinkInstanceStateEnum state = null;

		ActivityInstance sendingActivityInstance = messageLinkInstance.getSendingActivityInstance();
		ActivityInstance receivingActivityInstance = messageLinkInstance.getReceivingActivityInstance();

		ActivityInstanceStateEnum sendingActivityState = null;
		ActivityInstanceStateEnum receivingActivityState = null;

		if (sendingActivityInstance != null) {
			sendingActivityState = sendingActivityInstance.getActivityState();
		}

		if (receivingActivityInstance != null) {
			receivingActivityState = receivingActivityInstance.getActivityState();
		}

		if (sendingActivityState == null && receivingActivityState != null) {
			return MessageLinkInstanceStateEnum.Unknown;
		}

		if (sendingActivityState != null && receivingActivityState == null) {

			switch (sendingActivityState) {
			case Activity_Ready:
			case Activity_Executing:
			case Activity_Executed:
			case Activity_Complete:
				state = MessageLinkInstanceStateEnum.Evaluating;
				break;
			case Activity_Faulted:
			case Activity_Terminated:
			case Activity_Dead_Path:
				state = MessageLinkInstanceStateEnum.False;
			default:
				break;
			}

		} else if (sendingActivityState != null && receivingActivityState != null) {

			if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready)) {
				return MessageLinkInstanceStateEnum.Unknown;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted)) {
				return MessageLinkInstanceStateEnum.Unknown;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated)) {
				return MessageLinkInstanceStateEnum.Unknown;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete)) {
				return MessageLinkInstanceStateEnum.True;
			}

			else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready)) {
				return MessageLinkInstanceStateEnum.Unknown;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete)) {
				return MessageLinkInstanceStateEnum.True;
			}

			else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete)) {
				return MessageLinkInstanceStateEnum.True;
			}

			else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready)) {
				return MessageLinkInstanceStateEnum.Unknown;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing)) {
				return MessageLinkInstanceStateEnum.Unknown;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed)) {
				return MessageLinkInstanceStateEnum.Unknown;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing)) {
				return MessageLinkInstanceStateEnum.Unknown;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete)) {
				return MessageLinkInstanceStateEnum.Unknown;
			}

			else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete)) {
				return MessageLinkInstanceStateEnum.False;
			}

			else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Ready)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executed)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Executing)) {
				return MessageLinkInstanceStateEnum.Evaluating;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Faulted)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Terminated)) {
				return MessageLinkInstanceStateEnum.False;
			} else if (sendingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete) && receivingActivityState.equals(ActivityInstanceStateEnum.Activity_Complete)) {
				return MessageLinkInstanceStateEnum.True;
			}

		}

		return state;
	}
	
}
