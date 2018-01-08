/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.util;

import java.util.List;

import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.ActivityContainer;
import org.eclipse.bpel4chor.model.pbd.Assign;
import org.eclipse.bpel4chor.model.pbd.Branches;
import org.eclipse.bpel4chor.model.pbd.CLinkable;
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
import org.eclipse.bpel4chor.model.pbd.OpaqueFrom;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.Pick;
import org.eclipse.bpel4chor.model.pbd.Query;
import org.eclipse.bpel4chor.model.pbd.Receive;
import org.eclipse.bpel4chor.model.pbd.RepeatEvery;
import org.eclipse.bpel4chor.model.pbd.RepeatUntil;
import org.eclipse.bpel4chor.model.pbd.Reply;
import org.eclipse.bpel4chor.model.pbd.Rethrow;
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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage
 * @generated
 */
public class PbdSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PbdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PbdSwitch() {
		if (modelPackage == null) {
			modelPackage = PbdPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PbdPackage.EXTENSIBLE_ELEMENTS: {
				ExtensibleElements extensibleElements = (ExtensibleElements)theEObject;
				T result = caseExtensibleElements(extensibleElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.PROCESS: {
				org.eclipse.bpel4chor.model.pbd.Process process = (org.eclipse.bpel4chor.model.pbd.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseExtensibleElements(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.EXTENSIONS: {
				Extensions extensions = (Extensions)theEObject;
				T result = caseExtensions(extensions);
				if (result == null) result = caseExtensibleElements(extensions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseExtensibleElements(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseExtensibleElements(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.MESSAGE_EXCHANGES: {
				MessageExchanges messageExchanges = (MessageExchanges)theEObject;
				T result = caseMessageExchanges(messageExchanges);
				if (result == null) result = caseExtensibleElements(messageExchanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.MESSAGE_EXCHANGE: {
				MessageExchange messageExchange = (MessageExchange)theEObject;
				T result = caseMessageExchange(messageExchange);
				if (result == null) result = caseExtensibleElements(messageExchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.VARIABLES: {
				Variables variables = (Variables)theEObject;
				T result = caseVariables(variables);
				if (result == null) result = caseExtensibleElements(variables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseExtensibleElements(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.CORRELATION_SETS: {
				CorrelationSets correlationSets = (CorrelationSets)theEObject;
				T result = caseCorrelationSets(correlationSets);
				if (result == null) result = caseExtensibleElements(correlationSets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.CORRELATION_SET: {
				CorrelationSet correlationSet = (CorrelationSet)theEObject;
				T result = caseCorrelationSet(correlationSet);
				if (result == null) result = caseExtensibleElements(correlationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.FAULT_HANDLERS: {
				FaultHandlers faultHandlers = (FaultHandlers)theEObject;
				T result = caseFaultHandlers(faultHandlers);
				if (result == null) result = caseExtensibleElements(faultHandlers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.CATCH: {
				Catch catch_ = (Catch)theEObject;
				T result = caseCatch(catch_);
				if (result == null) result = caseActivityContainer(catch_);
				if (result == null) result = caseExtensibleElements(catch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.CATCH_ALL: {
				CatchAll catchAll = (CatchAll)theEObject;
				T result = caseCatchAll(catchAll);
				if (result == null) result = caseActivityContainer(catchAll);
				if (result == null) result = caseExtensibleElements(catchAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.ACTIVITY_CONTAINER: {
				ActivityContainer activityContainer = (ActivityContainer)theEObject;
				T result = caseActivityContainer(activityContainer);
				if (result == null) result = caseExtensibleElements(activityContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.EVENT_HANDLERS: {
				EventHandlers eventHandlers = (EventHandlers)theEObject;
				T result = caseEventHandlers(eventHandlers);
				if (result == null) result = caseExtensibleElements(eventHandlers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.ON_EVENT: {
				OnEvent onEvent = (OnEvent)theEObject;
				T result = caseOnEvent(onEvent);
				if (result == null) result = caseOnMsgCommon(onEvent);
				if (result == null) result = caseExtensibleElements(onEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.ON_MSG_COMMON: {
				OnMsgCommon onMsgCommon = (OnMsgCommon)theEObject;
				T result = caseOnMsgCommon(onMsgCommon);
				if (result == null) result = caseExtensibleElements(onMsgCommon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.CORRELATIONS: {
				Correlations correlations = (Correlations)theEObject;
				T result = caseCorrelations(correlations);
				if (result == null) result = caseExtensibleElements(correlations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.CORRELATION: {
				Correlation correlation = (Correlation)theEObject;
				T result = caseCorrelation(correlation);
				if (result == null) result = caseExtensibleElements(correlation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.ON_ALARM: {
				OnAlarm onAlarm = (OnAlarm)theEObject;
				T result = caseOnAlarm(onAlarm);
				if (result == null) result = caseExtensibleElements(onAlarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseExtensibleElements(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.TARGETS: {
				Targets targets = (Targets)theEObject;
				T result = caseTargets(targets);
				if (result == null) result = caseExtensibleElements(targets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.TARGET: {
				Target target = (Target)theEObject;
				T result = caseTarget(target);
				if (result == null) result = caseExtensibleElements(target);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.SOURCES: {
				Sources sources = (Sources)theEObject;
				T result = caseSources(sources);
				if (result == null) result = caseExtensibleElements(sources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = caseExtensibleElements(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = caseActivity(assign);
				if (result == null) result = caseExtensibleElements(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.COPY: {
				Copy copy = (Copy)theEObject;
				T result = caseCopy(copy);
				if (result == null) result = caseExtensibleElements(copy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.OPAQUE_FROM: {
				OpaqueFrom opaqueFrom = (OpaqueFrom)theEObject;
				T result = caseOpaqueFrom(opaqueFrom);
				if (result == null) result = caseFrom(opaqueFrom);
				if (result == null) result = caseExtensibleElements(opaqueFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.FROM: {
				From from = (From)theEObject;
				T result = caseFrom(from);
				if (result == null) result = caseExtensibleElements(from);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseExtensibleElements(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.TO: {
				To to = (To)theEObject;
				T result = caseTo(to);
				if (result == null) result = caseExtensibleElements(to);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.EXTENSION_ASSIGN_OPERATION: {
				ExtensionAssignOperation extensionAssignOperation = (ExtensionAssignOperation)theEObject;
				T result = caseExtensionAssignOperation(extensionAssignOperation);
				if (result == null) result = caseExtensibleElements(extensionAssignOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.COMPENSATE: {
				Compensate compensate = (Compensate)theEObject;
				T result = caseCompensate(compensate);
				if (result == null) result = caseActivity(compensate);
				if (result == null) result = caseExtensibleElements(compensate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.COMPENSATE_SCOPE: {
				CompensateScope compensateScope = (CompensateScope)theEObject;
				T result = caseCompensateScope(compensateScope);
				if (result == null) result = caseActivity(compensateScope);
				if (result == null) result = caseExtensibleElements(compensateScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.EMPTY: {
				Empty empty = (Empty)theEObject;
				T result = caseEmpty(empty);
				if (result == null) result = caseActivity(empty);
				if (result == null) result = caseExtensibleElements(empty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.EXTENSION_ACTIVITY: {
				ExtensionActivity extensionActivity = (ExtensionActivity)theEObject;
				T result = caseExtensionActivity(extensionActivity);
				if (result == null) result = caseActivity(extensionActivity);
				if (result == null) result = caseExtensibleElements(extensionActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = caseActivity(flow);
				if (result == null) result = caseExtensibleElements(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.LINKS: {
				Links links = (Links)theEObject;
				T result = caseLinks(links);
				if (result == null) result = caseExtensibleElements(links);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseExtensibleElements(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.FOR_EACH: {
				ForEach forEach = (ForEach)theEObject;
				T result = caseForEach(forEach);
				if (result == null) result = caseActivity(forEach);
				if (result == null) result = caseExtensibleElements(forEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.COMPLETION_CONDITION: {
				CompletionCondition completionCondition = (CompletionCondition)theEObject;
				T result = caseCompletionCondition(completionCondition);
				if (result == null) result = caseExtensibleElements(completionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.BRANCHES: {
				Branches branches = (Branches)theEObject;
				T result = caseBranches(branches);
				if (result == null) result = caseExpression(branches);
				if (result == null) result = caseExtensibleElements(branches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseActivity(if_);
				if (result == null) result = caseExtensibleElements(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.ELSEIF: {
				Elseif elseif = (Elseif)theEObject;
				T result = caseElseif(elseif);
				if (result == null) result = caseExtensibleElements(elseif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.ELSE: {
				Else else_ = (Else)theEObject;
				T result = caseElse(else_);
				if (result == null) result = caseActivityContainer(else_);
				if (result == null) result = caseExtensibleElements(else_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.INVOKE: {
				Invoke invoke = (Invoke)theEObject;
				T result = caseInvoke(invoke);
				if (result == null) result = caseActivity(invoke);
				if (result == null) result = caseCLinkable(invoke);
				if (result == null) result = caseExtensibleElements(invoke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.FROM_PARTS: {
				FromParts fromParts = (FromParts)theEObject;
				T result = caseFromParts(fromParts);
				if (result == null) result = caseExtensibleElements(fromParts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.FROM_PART: {
				FromPart fromPart = (FromPart)theEObject;
				T result = caseFromPart(fromPart);
				if (result == null) result = caseExtensibleElements(fromPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.TO_PARTS: {
				ToParts toParts = (ToParts)theEObject;
				T result = caseToParts(toParts);
				if (result == null) result = caseExtensibleElements(toParts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.TO_PART: {
				ToPart toPart = (ToPart)theEObject;
				T result = caseToPart(toPart);
				if (result == null) result = caseExtensibleElements(toPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.PICK: {
				Pick pick = (Pick)theEObject;
				T result = casePick(pick);
				if (result == null) result = caseActivity(pick);
				if (result == null) result = caseExtensibleElements(pick);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.ON_MESSAGE: {
				OnMessage onMessage = (OnMessage)theEObject;
				T result = caseOnMessage(onMessage);
				if (result == null) result = caseOnMsgCommon(onMessage);
				if (result == null) result = caseCLinkable(onMessage);
				if (result == null) result = caseExtensibleElements(onMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.RECEIVE: {
				Receive receive = (Receive)theEObject;
				T result = caseReceive(receive);
				if (result == null) result = caseActivity(receive);
				if (result == null) result = caseCLinkable(receive);
				if (result == null) result = caseExtensibleElements(receive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.REPEAT_UNTIL: {
				RepeatUntil repeatUntil = (RepeatUntil)theEObject;
				T result = caseRepeatUntil(repeatUntil);
				if (result == null) result = caseActivity(repeatUntil);
				if (result == null) result = caseExtensibleElements(repeatUntil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.REPLY: {
				Reply reply = (Reply)theEObject;
				T result = caseReply(reply);
				if (result == null) result = caseActivity(reply);
				if (result == null) result = caseCLinkable(reply);
				if (result == null) result = caseExtensibleElements(reply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.RETHROW: {
				Rethrow rethrow = (Rethrow)theEObject;
				T result = caseRethrow(rethrow);
				if (result == null) result = caseActivity(rethrow);
				if (result == null) result = caseExtensibleElements(rethrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.SCOPE: {
				Scope scope = (Scope)theEObject;
				T result = caseScope(scope);
				if (result == null) result = caseActivity(scope);
				if (result == null) result = caseExtensibleElements(scope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseActivity(sequence);
				if (result == null) result = caseExtensibleElements(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.THROW: {
				Throw throw_ = (Throw)theEObject;
				T result = caseThrow(throw_);
				if (result == null) result = caseActivity(throw_);
				if (result == null) result = caseExtensibleElements(throw_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.VALIDATE: {
				Validate validate = (Validate)theEObject;
				T result = caseValidate(validate);
				if (result == null) result = caseActivity(validate);
				if (result == null) result = caseExtensibleElements(validate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.WAIT: {
				Wait wait = (Wait)theEObject;
				T result = caseWait(wait);
				if (result == null) result = caseActivity(wait);
				if (result == null) result = caseExtensibleElements(wait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.WHILE: {
				While while_ = (While)theEObject;
				T result = caseWhile(while_);
				if (result == null) result = caseActivity(while_);
				if (result == null) result = caseExtensibleElements(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseExtensibleElements(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.FOR: {
				For for_ = (For)theEObject;
				T result = caseFor(for_);
				if (result == null) result = caseExpression(for_);
				if (result == null) result = caseExtensibleElements(for_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.UNTIL: {
				Until until = (Until)theEObject;
				T result = caseUntil(until);
				if (result == null) result = caseExpression(until);
				if (result == null) result = caseExtensibleElements(until);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseExpression(condition);
				if (result == null) result = caseExtensibleElements(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.TRANSITION_CONDITION: {
				TransitionCondition transitionCondition = (TransitionCondition)theEObject;
				T result = caseTransitionCondition(transitionCondition);
				if (result == null) result = caseCondition(transitionCondition);
				if (result == null) result = caseExpression(transitionCondition);
				if (result == null) result = caseExtensibleElements(transitionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.JOIN_CONDITION: {
				JoinCondition joinCondition = (JoinCondition)theEObject;
				T result = caseJoinCondition(joinCondition);
				if (result == null) result = caseCondition(joinCondition);
				if (result == null) result = caseExpression(joinCondition);
				if (result == null) result = caseExtensibleElements(joinCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.REPEAT_EVERY: {
				RepeatEvery repeatEvery = (RepeatEvery)theEObject;
				T result = caseRepeatEvery(repeatEvery);
				if (result == null) result = caseExpression(repeatEvery);
				if (result == null) result = caseExtensibleElements(repeatEvery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.START_COUNTER_VALUE: {
				StartCounterValue startCounterValue = (StartCounterValue)theEObject;
				T result = caseStartCounterValue(startCounterValue);
				if (result == null) result = caseExpression(startCounterValue);
				if (result == null) result = caseExtensibleElements(startCounterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.FINAL_COUNTER_VALUE: {
				FinalCounterValue finalCounterValue = (FinalCounterValue)theEObject;
				T result = caseFinalCounterValue(finalCounterValue);
				if (result == null) result = caseExpression(finalCounterValue);
				if (result == null) result = caseExtensibleElements(finalCounterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.OPAQUE_ACTIVITY: {
				OpaqueActivity opaqueActivity = (OpaqueActivity)theEObject;
				T result = caseOpaqueActivity(opaqueActivity);
				if (result == null) result = caseActivity(opaqueActivity);
				if (result == null) result = caseExtensibleElements(opaqueActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.CLINKABLE: {
				CLinkable cLinkable = (CLinkable)theEObject;
				T result = caseCLinkable(cLinkable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.DANGLING_MESSAGE_LINK: {
				DanglingMessageLink danglingMessageLink = (DanglingMessageLink)theEObject;
				T result = caseDanglingMessageLink(danglingMessageLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.DANGLING_FLOW_ACTIVITY_LINK: {
				DanglingFlowActivityLink danglingFlowActivityLink = (DanglingFlowActivityLink)theEObject;
				T result = caseDanglingFlowActivityLink(danglingFlowActivityLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PbdPackage.LOOP_ITERATION: {
				LoopIteration loopIteration = (LoopIteration)theEObject;
				T result = caseLoopIteration(loopIteration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleElements(ExtensibleElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(org.eclipse.bpel4chor.model.pbd.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensions(Extensions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Exchanges</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Exchanges</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageExchanges(MessageExchanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageExchange(MessageExchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariables(Variables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation Sets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation Sets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelationSets(CorrelationSets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelationSet(CorrelationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Handlers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Handlers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultHandlers(FaultHandlers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatch(Catch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchAll(CatchAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityContainer(ActivityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handlers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handlers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventHandlers(EventHandlers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnEvent(OnEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Msg Common</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Msg Common</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnMsgCommon(OnMsgCommon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelations(Correlations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelation(Correlation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnAlarm(OnAlarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Targets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Targets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargets(Targets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarget(Target object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSources(Sources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopy(Copy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueFrom(OpaqueFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrom(From object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTo(To object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Assign Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Assign Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionAssignOperation(ExtensionAssignOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compensate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compensate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompensate(Compensate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compensate Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compensate Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompensateScope(CompensateScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmpty(Empty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionActivity(ExtensionActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinks(Links object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEach(ForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completion Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletionCondition(CompletionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranches(Branches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elseif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elseif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseif(Elseif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElse(Else object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoke(Invoke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Parts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Parts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromParts(FromParts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromPart(FromPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Parts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Parts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToParts(ToParts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToPart(ToPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePick(Pick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnMessage(OnMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceive(Receive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Until</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatUntil(RepeatUntil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReply(Reply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rethrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rethrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRethrow(Rethrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrow(Throw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidate(Validate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWait(Wait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFor(For object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Until</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntil(Until object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionCondition(TransitionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinCondition(JoinCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Every</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Every</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatEvery(RepeatEvery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Counter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Counter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartCounterValue(StartCounterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Counter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Counter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalCounterValue(FinalCounterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueActivity(OpaqueActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLinkable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLinkable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLinkable(CLinkable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dangling Message Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dangling Message Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDanglingMessageLink(DanglingMessageLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dangling Flow Activity Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dangling Flow Activity Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDanglingFlowActivityLink(DanglingFlowActivityLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Iteration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopIteration(LoopIteration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //PbdSwitch
