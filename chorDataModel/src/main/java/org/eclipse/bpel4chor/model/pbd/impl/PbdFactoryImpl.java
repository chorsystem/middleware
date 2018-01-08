/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.ActivityContainer;
import org.eclipse.bpel4chor.model.pbd.Assign;
import org.eclipse.bpel4chor.model.pbd.Branches;
import org.eclipse.bpel4chor.model.pbd.Catch;
import org.eclipse.bpel4chor.model.pbd.CatchAll;
import org.eclipse.bpel4chor.model.pbd.Compensate;
import org.eclipse.bpel4chor.model.pbd.CompensateScope;
import org.eclipse.bpel4chor.model.pbd.CompletionCondition;
import org.eclipse.bpel4chor.model.pbd.Condition;
import org.eclipse.bpel4chor.model.pbd.Copy;
import org.eclipse.bpel4chor.model.pbd.Correlation;
import org.eclipse.bpel4chor.model.pbd.CorrelationSet;
import org.eclipse.bpel4chor.model.pbd.CorrelationSets;
import org.eclipse.bpel4chor.model.pbd.Correlations;
import org.eclipse.bpel4chor.model.pbd.DanglingFlowActivityLink;
import org.eclipse.bpel4chor.model.pbd.DanglingMessageLink;
import org.eclipse.bpel4chor.model.pbd.Documentation;
import org.eclipse.bpel4chor.model.pbd.Else;
import org.eclipse.bpel4chor.model.pbd.Elseif;
import org.eclipse.bpel4chor.model.pbd.Empty;
import org.eclipse.bpel4chor.model.pbd.EventHandlers;
import org.eclipse.bpel4chor.model.pbd.Expression;
import org.eclipse.bpel4chor.model.pbd.ExtensibleElements;
import org.eclipse.bpel4chor.model.pbd.Extension;
import org.eclipse.bpel4chor.model.pbd.ExtensionActivity;
import org.eclipse.bpel4chor.model.pbd.ExtensionAssignOperation;
import org.eclipse.bpel4chor.model.pbd.Extensions;
import org.eclipse.bpel4chor.model.pbd.FaultHandlers;
import org.eclipse.bpel4chor.model.pbd.FinalCounterValue;
import org.eclipse.bpel4chor.model.pbd.Flow;
import org.eclipse.bpel4chor.model.pbd.For;
import org.eclipse.bpel4chor.model.pbd.ForEach;
import org.eclipse.bpel4chor.model.pbd.From;
import org.eclipse.bpel4chor.model.pbd.FromPart;
import org.eclipse.bpel4chor.model.pbd.FromParts;
import org.eclipse.bpel4chor.model.pbd.If;
import org.eclipse.bpel4chor.model.pbd.Import;
import org.eclipse.bpel4chor.model.pbd.Initiate;
import org.eclipse.bpel4chor.model.pbd.Invoke;
import org.eclipse.bpel4chor.model.pbd.JoinCondition;
import org.eclipse.bpel4chor.model.pbd.Link;
import org.eclipse.bpel4chor.model.pbd.Links;
import org.eclipse.bpel4chor.model.pbd.Literal;
import org.eclipse.bpel4chor.model.pbd.LoopIteration;
import org.eclipse.bpel4chor.model.pbd.MessageExchange;
import org.eclipse.bpel4chor.model.pbd.MessageExchanges;
import org.eclipse.bpel4chor.model.pbd.OnAlarm;
import org.eclipse.bpel4chor.model.pbd.OnEvent;
import org.eclipse.bpel4chor.model.pbd.OnMessage;
import org.eclipse.bpel4chor.model.pbd.OnMsgCommon;
import org.eclipse.bpel4chor.model.pbd.OpaqueActivity;
import org.eclipse.bpel4chor.model.pbd.OpaqueBoolean;
import org.eclipse.bpel4chor.model.pbd.OpaqueFrom;
import org.eclipse.bpel4chor.model.pbd.OpaqueStr;
import org.eclipse.bpel4chor.model.pbd.Pattern;
import org.eclipse.bpel4chor.model.pbd.PbdFactory;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.Pick;
import org.eclipse.bpel4chor.model.pbd.Query;
import org.eclipse.bpel4chor.model.pbd.Receive;
import org.eclipse.bpel4chor.model.pbd.RepeatEvery;
import org.eclipse.bpel4chor.model.pbd.RepeatUntil;
import org.eclipse.bpel4chor.model.pbd.Reply;
import org.eclipse.bpel4chor.model.pbd.Rethrow;
import org.eclipse.bpel4chor.model.pbd.Roles;
import org.eclipse.bpel4chor.model.pbd.Scope;
import org.eclipse.bpel4chor.model.pbd.Sequence;
import org.eclipse.bpel4chor.model.pbd.Source;
import org.eclipse.bpel4chor.model.pbd.Sources;
import org.eclipse.bpel4chor.model.pbd.StartCounterValue;
import org.eclipse.bpel4chor.model.pbd.Target;
import org.eclipse.bpel4chor.model.pbd.Targets;
import org.eclipse.bpel4chor.model.pbd.Throw;
import org.eclipse.bpel4chor.model.pbd.To;
import org.eclipse.bpel4chor.model.pbd.ToPart;
import org.eclipse.bpel4chor.model.pbd.ToParts;
import org.eclipse.bpel4chor.model.pbd.TransitionCondition;
import org.eclipse.bpel4chor.model.pbd.Until;
import org.eclipse.bpel4chor.model.pbd.Validate;
import org.eclipse.bpel4chor.model.pbd.Variable;
import org.eclipse.bpel4chor.model.pbd.Variables;
import org.eclipse.bpel4chor.model.pbd.Wait;
import org.eclipse.bpel4chor.model.pbd.While;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PbdFactoryImpl extends EFactoryImpl implements PbdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PbdFactory init() {
		try {
			PbdFactory thePbdFactory = (PbdFactory)EPackage.Registry.INSTANCE.getEFactory("http://docs.oasis-open.org/wsbpel/2.0/process/abstract"); 
			if (thePbdFactory != null) {
				return thePbdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PbdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PbdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PbdPackage.EXTENSIBLE_ELEMENTS: return createExtensibleElements();
			case PbdPackage.DOCUMENTATION: return createDocumentation();
			case PbdPackage.PROCESS: return createProcess();
			case PbdPackage.EXTENSIONS: return createExtensions();
			case PbdPackage.EXTENSION: return createExtension();
			case PbdPackage.IMPORT: return createImport();
			case PbdPackage.MESSAGE_EXCHANGES: return createMessageExchanges();
			case PbdPackage.MESSAGE_EXCHANGE: return createMessageExchange();
			case PbdPackage.VARIABLES: return createVariables();
			case PbdPackage.VARIABLE: return createVariable();
			case PbdPackage.CORRELATION_SETS: return createCorrelationSets();
			case PbdPackage.CORRELATION_SET: return createCorrelationSet();
			case PbdPackage.FAULT_HANDLERS: return createFaultHandlers();
			case PbdPackage.CATCH: return createCatch();
			case PbdPackage.CATCH_ALL: return createCatchAll();
			case PbdPackage.ACTIVITY_CONTAINER: return createActivityContainer();
			case PbdPackage.EVENT_HANDLERS: return createEventHandlers();
			case PbdPackage.ON_EVENT: return createOnEvent();
			case PbdPackage.ON_MSG_COMMON: return createOnMsgCommon();
			case PbdPackage.CORRELATIONS: return createCorrelations();
			case PbdPackage.CORRELATION: return createCorrelation();
			case PbdPackage.ON_ALARM: return createOnAlarm();
			case PbdPackage.ACTIVITY: return createActivity();
			case PbdPackage.TARGETS: return createTargets();
			case PbdPackage.TARGET: return createTarget();
			case PbdPackage.SOURCES: return createSources();
			case PbdPackage.SOURCE: return createSource();
			case PbdPackage.ASSIGN: return createAssign();
			case PbdPackage.COPY: return createCopy();
			case PbdPackage.OPAQUE_FROM: return createOpaqueFrom();
			case PbdPackage.FROM: return createFrom();
			case PbdPackage.LITERAL: return createLiteral();
			case PbdPackage.QUERY: return createQuery();
			case PbdPackage.TO: return createTo();
			case PbdPackage.EXTENSION_ASSIGN_OPERATION: return createExtensionAssignOperation();
			case PbdPackage.COMPENSATE: return createCompensate();
			case PbdPackage.COMPENSATE_SCOPE: return createCompensateScope();
			case PbdPackage.EMPTY: return createEmpty();
			case PbdPackage.EXTENSION_ACTIVITY: return createExtensionActivity();
			case PbdPackage.FLOW: return createFlow();
			case PbdPackage.LINKS: return createLinks();
			case PbdPackage.LINK: return createLink();
			case PbdPackage.FOR_EACH: return createForEach();
			case PbdPackage.COMPLETION_CONDITION: return createCompletionCondition();
			case PbdPackage.BRANCHES: return createBranches();
			case PbdPackage.IF: return createIf();
			case PbdPackage.ELSEIF: return createElseif();
			case PbdPackage.ELSE: return createElse();
			case PbdPackage.INVOKE: return createInvoke();
			case PbdPackage.FROM_PARTS: return createFromParts();
			case PbdPackage.FROM_PART: return createFromPart();
			case PbdPackage.TO_PARTS: return createToParts();
			case PbdPackage.TO_PART: return createToPart();
			case PbdPackage.PICK: return createPick();
			case PbdPackage.ON_MESSAGE: return createOnMessage();
			case PbdPackage.RECEIVE: return createReceive();
			case PbdPackage.REPEAT_UNTIL: return createRepeatUntil();
			case PbdPackage.REPLY: return createReply();
			case PbdPackage.RETHROW: return createRethrow();
			case PbdPackage.SCOPE: return createScope();
			case PbdPackage.SEQUENCE: return createSequence();
			case PbdPackage.THROW: return createThrow();
			case PbdPackage.VALIDATE: return createValidate();
			case PbdPackage.WAIT: return createWait();
			case PbdPackage.WHILE: return createWhile();
			case PbdPackage.EXPRESSION: return createExpression();
			case PbdPackage.FOR: return createFor();
			case PbdPackage.UNTIL: return createUntil();
			case PbdPackage.CONDITION: return createCondition();
			case PbdPackage.TRANSITION_CONDITION: return createTransitionCondition();
			case PbdPackage.JOIN_CONDITION: return createJoinCondition();
			case PbdPackage.REPEAT_EVERY: return createRepeatEvery();
			case PbdPackage.START_COUNTER_VALUE: return createStartCounterValue();
			case PbdPackage.FINAL_COUNTER_VALUE: return createFinalCounterValue();
			case PbdPackage.OPAQUE_ACTIVITY: return createOpaqueActivity();
			case PbdPackage.DANGLING_MESSAGE_LINK: return createDanglingMessageLink();
			case PbdPackage.DANGLING_FLOW_ACTIVITY_LINK: return createDanglingFlowActivityLink();
			case PbdPackage.LOOP_ITERATION: return createLoopIteration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PbdPackage.INITIATE:
				return createInitiateFromString(eDataType, initialValue);
			case PbdPackage.ROLES:
				return createRolesFromString(eDataType, initialValue);
			case PbdPackage.PATTERN:
				return createPatternFromString(eDataType, initialValue);
			case PbdPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case PbdPackage.OPAQUE_STR:
				return createOpaqueStrFromString(eDataType, initialValue);
			case PbdPackage.OPAQUE_BOOLEAN:
				return createOpaqueBooleanFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PbdPackage.INITIATE:
				return convertInitiateToString(eDataType, instanceValue);
			case PbdPackage.ROLES:
				return convertRolesToString(eDataType, instanceValue);
			case PbdPackage.PATTERN:
				return convertPatternToString(eDataType, instanceValue);
			case PbdPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case PbdPackage.OPAQUE_STR:
				return convertOpaqueStrToString(eDataType, instanceValue);
			case PbdPackage.OPAQUE_BOOLEAN:
				return convertOpaqueBooleanToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensibleElements createExtensibleElements() {
		ExtensibleElementsImpl extensibleElements = new ExtensibleElementsImpl();
		return extensibleElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extensions createExtensions() {
		ExtensionsImpl extensions = new ExtensionsImpl();
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchanges createMessageExchanges() {
		MessageExchangesImpl messageExchanges = new MessageExchangesImpl();
		return messageExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchange createMessageExchange() {
		MessageExchangeImpl messageExchange = new MessageExchangeImpl();
		return messageExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variables createVariables() {
		VariablesImpl variables = new VariablesImpl();
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSets createCorrelationSets() {
		CorrelationSetsImpl correlationSets = new CorrelationSetsImpl();
		return correlationSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSet createCorrelationSet() {
		CorrelationSetImpl correlationSet = new CorrelationSetImpl();
		return correlationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultHandlers createFaultHandlers() {
		FaultHandlersImpl faultHandlers = new FaultHandlersImpl();
		return faultHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catch createCatch() {
		CatchImpl catch_ = new CatchImpl();
		return catch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchAll createCatchAll() {
		CatchAllImpl catchAll = new CatchAllImpl();
		return catchAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer createActivityContainer() {
		ActivityContainerImpl activityContainer = new ActivityContainerImpl();
		return activityContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandlers createEventHandlers() {
		EventHandlersImpl eventHandlers = new EventHandlersImpl();
		return eventHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnEvent createOnEvent() {
		OnEventImpl onEvent = new OnEventImpl();
		return onEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMsgCommon createOnMsgCommon() {
		OnMsgCommonImpl onMsgCommon = new OnMsgCommonImpl();
		return onMsgCommon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlations createCorrelations() {
		CorrelationsImpl correlations = new CorrelationsImpl();
		return correlations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlation createCorrelation() {
		CorrelationImpl correlation = new CorrelationImpl();
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnAlarm createOnAlarm() {
		OnAlarmImpl onAlarm = new OnAlarmImpl();
		return onAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Targets createTargets() {
		TargetsImpl targets = new TargetsImpl();
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sources createSources() {
		SourcesImpl sources = new SourcesImpl();
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copy createCopy() {
		CopyImpl copy = new CopyImpl();
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueFrom createOpaqueFrom() {
		OpaqueFromImpl opaqueFrom = new OpaqueFromImpl();
		return opaqueFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public From createFrom() {
		FromImpl from = new FromImpl();
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public To createTo() {
		ToImpl to = new ToImpl();
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAssignOperation createExtensionAssignOperation() {
		ExtensionAssignOperationImpl extensionAssignOperation = new ExtensionAssignOperationImpl();
		return extensionAssignOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compensate createCompensate() {
		CompensateImpl compensate = new CompensateImpl();
		return compensate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateScope createCompensateScope() {
		CompensateScopeImpl compensateScope = new CompensateScopeImpl();
		return compensateScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty createEmpty() {
		EmptyImpl empty = new EmptyImpl();
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionActivity createExtensionActivity() {
		ExtensionActivityImpl extensionActivity = new ExtensionActivityImpl();
		return extensionActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Links createLinks() {
		LinksImpl links = new LinksImpl();
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach createForEach() {
		ForEachImpl forEach = new ForEachImpl();
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionCondition createCompletionCondition() {
		CompletionConditionImpl completionCondition = new CompletionConditionImpl();
		return completionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branches createBranches() {
		BranchesImpl branches = new BranchesImpl();
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elseif createElseif() {
		ElseifImpl elseif = new ElseifImpl();
		return elseif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else createElse() {
		ElseImpl else_ = new ElseImpl();
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoke createInvoke() {
		InvokeImpl invoke = new InvokeImpl();
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromParts createFromParts() {
		FromPartsImpl fromParts = new FromPartsImpl();
		return fromParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromPart createFromPart() {
		FromPartImpl fromPart = new FromPartImpl();
		return fromPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToParts createToParts() {
		ToPartsImpl toParts = new ToPartsImpl();
		return toParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToPart createToPart() {
		ToPartImpl toPart = new ToPartImpl();
		return toPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pick createPick() {
		PickImpl pick = new PickImpl();
		return pick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMessage createOnMessage() {
		OnMessageImpl onMessage = new OnMessageImpl();
		return onMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receive createReceive() {
		ReceiveImpl receive = new ReceiveImpl();
		return receive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatUntil createRepeatUntil() {
		RepeatUntilImpl repeatUntil = new RepeatUntilImpl();
		return repeatUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reply createReply() {
		ReplyImpl reply = new ReplyImpl();
		return reply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rethrow createRethrow() {
		RethrowImpl rethrow = new RethrowImpl();
		return rethrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throw createThrow() {
		ThrowImpl throw_ = new ThrowImpl();
		return throw_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validate createValidate() {
		ValidateImpl validate = new ValidateImpl();
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public For createFor() {
		ForImpl for_ = new ForImpl();
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Until createUntil() {
		UntilImpl until = new UntilImpl();
		return until;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionCondition createTransitionCondition() {
		TransitionConditionImpl transitionCondition = new TransitionConditionImpl();
		return transitionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinCondition createJoinCondition() {
		JoinConditionImpl joinCondition = new JoinConditionImpl();
		return joinCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatEvery createRepeatEvery() {
		RepeatEveryImpl repeatEvery = new RepeatEveryImpl();
		return repeatEvery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartCounterValue createStartCounterValue() {
		StartCounterValueImpl startCounterValue = new StartCounterValueImpl();
		return startCounterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalCounterValue createFinalCounterValue() {
		FinalCounterValueImpl finalCounterValue = new FinalCounterValueImpl();
		return finalCounterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActivity createOpaqueActivity() {
		OpaqueActivityImpl opaqueActivity = new OpaqueActivityImpl();
		return opaqueActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DanglingMessageLink createDanglingMessageLink() {
		DanglingMessageLinkImpl danglingMessageLink = new DanglingMessageLinkImpl();
		return danglingMessageLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DanglingFlowActivityLink createDanglingFlowActivityLink() {
		DanglingFlowActivityLinkImpl danglingFlowActivityLink = new DanglingFlowActivityLinkImpl();
		return danglingFlowActivityLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopIteration createLoopIteration() {
		LoopIterationImpl loopIteration = new LoopIterationImpl();
		return loopIteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiate createInitiateFromString(EDataType eDataType, String initialValue) {
		Initiate result = Initiate.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roles createRolesFromString(EDataType eDataType, String initialValue) {
		Roles result = Roles.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRolesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPatternFromString(EDataType eDataType, String initialValue) {
		Pattern result = Pattern.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		org.eclipse.bpel4chor.model.pbd.Boolean result = org.eclipse.bpel4chor.model.pbd.Boolean.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueStr createOpaqueStrFromString(EDataType eDataType, String initialValue) {
		OpaqueStr result = OpaqueStr.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpaqueStrToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueBoolean createOpaqueBooleanFromString(EDataType eDataType, String initialValue) {
		OpaqueBoolean result = OpaqueBoolean.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpaqueBooleanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PbdPackage getPbdPackage() {
		return (PbdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PbdPackage getPackage() {
		return PbdPackage.eINSTANCE;
	}

} //PbdFactoryImpl
