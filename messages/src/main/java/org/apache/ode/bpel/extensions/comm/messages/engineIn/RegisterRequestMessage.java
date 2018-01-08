package org.apache.ode.bpel.extensions.comm.messages.engineIn;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.xml.namespace.QName;

import org.w3c.dom.Element;

public class RegisterRequestMessage extends IncomingMessageBase {

	private static final long serialVersionUID = 454551L;

	private Requested_Blocking_Events globalEventBlockings;

	private List processModelEventBlockings;

	private List processInstanceEventBlockings;

	public RegisterRequestMessage() {
		super();
		globalEventBlockings = new Requested_Blocking_Events();
		processModelEventBlockings = new LinkedList<ModelEventBlocking>();
		processInstanceEventBlockings = new LinkedList<InstanceEventBlocking>();
	}

	public void addModelBlockingEvent(QName pName, Long vers,
			Requested_Blocking_Events evts) {
		ModelEventBlocking tmp = new ModelEventBlocking();
		tmp.processName = pName;
		tmp.version = vers;
		tmp.events = evts;
		processModelEventBlockings.add(tmp);
	}

	public void addInstanceBlockingEvent(Long procID,
			Requested_Blocking_Events evts) {
		InstanceEventBlocking tmp = new InstanceEventBlocking();
		tmp.processID = procID;
		tmp.events = evts;
		processInstanceEventBlockings.add(tmp);
	}
	
	public void addInstanceBlockingEvent(Long procID,
			Requested_Blocking_Events instanceEvts,
			HashMap<String, Requested_Blocking_Events> activityEvents) {
		InstanceEventBlocking tmp = new InstanceEventBlocking();
		tmp.processID = procID;
		tmp.events = instanceEvts;
		tmp.activityEvents = activityEvents;
		processInstanceEventBlockings.add(tmp);
	}

	public void addInstanceBlockingEvent(QName processName, Long procID,
			Requested_Blocking_Events instanceEvts,
			HashMap<String, Requested_Blocking_Events> activityEvents, HashMap<String, Element> activityEventConditions) {
		InstanceEventBlocking tmp = new InstanceEventBlocking();
		tmp.processName = processName;
		tmp.processID = procID;
		tmp.events = instanceEvts;
		tmp.activityEvents = activityEvents;
		tmp.activityEventConditions = activityEventConditions;
		processInstanceEventBlockings.add(tmp);
	}

	public Requested_Blocking_Events getNewWanted_Blocking_Events(
			Boolean Activity_Ready, Boolean Activity_Executed,
			Boolean Activity_Faulted, Boolean Activity_Join_Failure,
			Boolean Evaluating_TransitionCondition_Faulted,
			Boolean Scope_Compensating, Boolean Scope_Handling_Termination,
			Boolean Scope_Complete_With_Fault, Boolean Scope_Handling_Fault,
			Boolean FaultHandling_NoHandler, Boolean Loop_Condition_True,
			Boolean Loop_Condition_False, Boolean Loop_Iteration_Complete,
			Boolean Link_Evaluated) {
		Requested_Blocking_Events tmp = new Requested_Blocking_Events();
		tmp.Activity_Ready = Activity_Ready;
		tmp.Activity_Faulted = Activity_Faulted;
		tmp.Activity_Executed = Activity_Executed;
		tmp.Evaluating_TransitionCondition_Faulted = Evaluating_TransitionCondition_Faulted;
		tmp.Link_Evaluated = Link_Evaluated;
		tmp.Loop_Condition_False = Loop_Condition_False;
		tmp.Loop_Condition_True = Loop_Condition_True;
		tmp.Loop_Iteration_Complete = Loop_Iteration_Complete;
		tmp.Scope_Compensating = Scope_Compensating;
		tmp.Scope_Complete_With_Fault = Scope_Complete_With_Fault;
		tmp.Scope_Handling_Fault = Scope_Handling_Fault;
		tmp.Scope_Handling_Termination = Scope_Handling_Termination;
		return tmp;
	}

	public Requested_Blocking_Events getGlobalEventBlockings() {
		return globalEventBlockings;
	}

	public List getProcessModelEventBlockings() {
		return processModelEventBlockings;
	}

	public List getProcessInstanceEventBlockings() {
		return processInstanceEventBlockings;
	}

	public void setGlobalEventBlockings(
			Requested_Blocking_Events globalEventBlockings) {
		this.globalEventBlockings = globalEventBlockings;
	}

	public class ModelEventBlocking implements Serializable {
		private static final long serialVersionUID = 565656661L;

		private QName processName;
		private Long version;
		private Requested_Blocking_Events events;

		public QName getProcessName() {
			return processName;
		}

		public Long getVersion() {
			return version;
		}

		public Requested_Blocking_Events getEvents() {
			return events;
		}

		public void setProcessName(QName processName) {
			this.processName = processName;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public void setEvents(Requested_Blocking_Events events) {
			this.events = events;
		}

	}

	// @hahnml: We also want to register blocking events direct to a set of
	// activities
	public class InstanceEventBlocking implements Serializable {
		private static final long serialVersionUID = 85676777771L;

		private Long processID;
		
		private QName processName;

		private Requested_Blocking_Events events;

		// @hahnml: Connect a set of Blocking_Events with an activity XPath
		private HashMap<String, Requested_Blocking_Events> activityEvents = new HashMap<String, Requested_Blocking_Events>();

		public HashMap<String, Requested_Blocking_Events> getActivityEvents() {
			return activityEvents;
		}

		public void setActivityEvents(
				HashMap<String, Requested_Blocking_Events> activityEvents) {
			this.activityEvents = activityEvents;
		}

		// @hahnml: Connect a condition with an activity XPath
		private HashMap<String, Element> activityEventConditions = new HashMap<String, Element>();

		public HashMap<String, Element> getActivityEventConditions() {
			return activityEventConditions;
		}

		public void setActivityEventConditions(
				HashMap<String, Element> activityEventConditions) {
			this.activityEventConditions = activityEventConditions;
		}

		public Long getProcessID() {
			return processID;
		}

		public Requested_Blocking_Events getEvents() {
			return events;
		}

		public void setProcessID(Long processID) {
			this.processID = processID;
		}

		public void setEvents(Requested_Blocking_Events events) {
			this.events = events;
		}

		public QName getProcessName() {
			return this.processName;
		}
		
		public void setProcessName(QName processName) {
			this.processName = processName;
		}
	}

	public class Requested_Blocking_Events implements Serializable {
		private static final long serialVersionUID = 6461L;

		public Boolean Activity_Ready;
		public Boolean Activity_Executed;
		public Boolean Activity_Faulted;
		public Boolean Evaluating_TransitionCondition_Faulted;
		public Boolean Scope_Compensating;
		public Boolean Scope_Handling_Termination;
		public Boolean Scope_Complete_With_Fault;
		public Boolean Scope_Handling_Fault;
		public Boolean Loop_Condition_True;
		public Boolean Loop_Condition_False;
		public Boolean Loop_Iteration_Complete;
		public Boolean Link_Evaluated;

		public Requested_Blocking_Events() {
			Activity_Ready = false;
			Activity_Executed = false;
			Activity_Faulted = false;
			Evaluating_TransitionCondition_Faulted = false;
			Scope_Compensating = false;
			Scope_Handling_Termination = false;
			Scope_Complete_With_Fault = false;
			Scope_Handling_Fault = false;
			Loop_Condition_True = false;
			Loop_Condition_False = false;
			Loop_Iteration_Complete = false;
			Link_Evaluated = false;
		}
	}
}
