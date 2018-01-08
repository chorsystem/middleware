/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.util;

import java.util.List;

import java.util.Map;
import org.eclipse.bpel4chor.model.chor.*;

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
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage
 * @generated
 */
public class ChorSwitch<T>
{
        /**
	 * The cached model package
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected static ChorPackage modelPackage;

        /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ChorSwitch()
        {
		if (modelPackage == null) {
			modelPackage = ChorPackage.eINSTANCE;
		}
	}

        /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
        public T doSwitch(EObject theEObject)
        {
		return doSwitch(theEObject.eClass(), theEObject);
	}

        /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
        protected T doSwitch(EClass theEClass, EObject theEObject)
        {
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
        protected T doSwitch(int classifierID, EObject theEObject)
        {
		switch (classifierID) {
			case ChorPackage.CHOREOGRAPHY: {
				Choreography choreography = (Choreography)theEObject;
				T result = caseChoreography(choreography);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.CMESSAGE_LINK: {
				CMessageLink cMessageLink = (CMessageLink)theEObject;
				T result = caseCMessageLink(cMessageLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.CPARTICIPANT_REF: {
				CParticipantRef cParticipantRef = (CParticipantRef)theEObject;
				T result = caseCParticipantRef(cParticipantRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.FLOW_ACTIVITY_LINK: {
				FlowActivityLink flowActivityLink = (FlowActivityLink)theEObject;
				T result = caseFlowActivityLink(flowActivityLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.CPARTICIPANT_COMMON: {
				CParticipantCommon cParticipantCommon = (CParticipantCommon)theEObject;
				T result = caseCParticipantCommon(cParticipantCommon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.CPARTICIPANT: {
				CParticipant cParticipant = (CParticipant)theEObject;
				T result = caseCParticipant(cParticipant);
				if (result == null) result = caseCParticipantCommon(cParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.CPARTICIPANT_SET: {
				CParticipantSet cParticipantSet = (CParticipantSet)theEObject;
				T result = caseCParticipantSet(cParticipantSet);
				if (result == null) result = caseCParticipantCommon(cParticipantSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.CGROUNDING: {
				CGrounding cGrounding = (CGrounding)theEObject;
				T result = caseCGrounding(cGrounding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.CORRELATION_SET_GROUNDING: {
				CorrelationSetGrounding correlationSetGrounding = (CorrelationSetGrounding)theEObject;
				T result = caseCorrelationSetGrounding(correlationSetGrounding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.PROPERTY_GROUNDING: {
				PropertyGrounding propertyGrounding = (PropertyGrounding)theEObject;
				T result = casePropertyGrounding(propertyGrounding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.CMESSAGE_LINK_GROUNDING: {
				CMessageLinkGrounding cMessageLinkGrounding = (CMessageLinkGrounding)theEObject;
				T result = caseCMessageLinkGrounding(cMessageLinkGrounding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.CPARTICIPANT_REF_GROUNDING: {
				CParticipantRefGrounding cParticipantRefGrounding = (CParticipantRefGrounding)theEObject;
				T result = caseCParticipantRefGrounding(cParticipantRefGrounding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.CQ_NAME: {
				CQName cqName = (CQName)theEObject;
				T result = caseCQName(cqName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.FOR_EACH_ITERATION_SPEC: {
				ForEachIterationSpec forEachIterationSpec = (ForEachIterationSpec)theEObject;
				T result = caseForEachIterationSpec(forEachIterationSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.ABSTRACT_CONNECTOR_LINK: {
				AbstractConnectorLink abstractConnectorLink = (AbstractConnectorLink)theEObject;
				T result = caseAbstractConnectorLink(abstractConnectorLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorPackage.PROCESS_INSTANCE: {
				ProcessInstance processInstance = (ProcessInstance)theEObject;
				T result = caseProcessInstance(processInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseChoreography(Choreography object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>CMessage Link</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMessage Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseCMessageLink(CMessageLink object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>CParticipant Ref</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CParticipant Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseCParticipantRef(CParticipantRef object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Activity Link</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Activity Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseFlowActivityLink(FlowActivityLink object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>CParticipant Common</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CParticipant Common</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseCParticipantCommon(CParticipantCommon object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>CParticipant</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CParticipant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseCParticipant(CParticipant object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>CParticipant Set</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CParticipant Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseCParticipantSet(CParticipantSet object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>CGrounding</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CGrounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseCGrounding(CGrounding object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation Set Grounding</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation Set Grounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseCorrelationSetGrounding(CorrelationSetGrounding object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Property Grounding</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Grounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T casePropertyGrounding(PropertyGrounding object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>CMessage Link Grounding</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMessage Link Grounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseCMessageLinkGrounding(CMessageLinkGrounding object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>CParticipant Ref Grounding</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CParticipant Ref Grounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseCParticipantRefGrounding(CParticipantRefGrounding object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>CQ Name</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CQ Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseCQName(CQName object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Iteration Spec</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Iteration Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseForEachIterationSpec(ForEachIterationSpec object)
        {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Connector Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Connector Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConnectorLink(AbstractConnectorLink object) {
		return null;
	}

								/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessInstance(ProcessInstance object) {
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
        public T defaultCase(EObject object)
        {
		return null;
	}

} //ChorSwitch
