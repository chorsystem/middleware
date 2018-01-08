/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding.util;

import java.util.List;

import org.eclipse.bpel4chor.model.grounding.*;

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
 * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage
 * @generated
 */
public class GroundingSwitch<T>
{
        /**
         * The cached model package
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static GroundingPackage modelPackage;

        /**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public GroundingSwitch()
        {
                if (modelPackage == null)
                {
                        modelPackage = GroundingPackage.eINSTANCE;
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
                if (theEClass.eContainer() == modelPackage)
                {
                        return doSwitch(theEClass.getClassifierID(), theEObject);
                }
                else
                {
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
                switch (classifierID)
                {
                        case GroundingPackage.GROUNDING:
                        {
                                Grounding grounding = (Grounding)theEObject;
                                T result = caseGrounding(grounding);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case GroundingPackage.MESSAGE_LINKS:
                        {
                                MessageLinks messageLinks = (MessageLinks)theEObject;
                                T result = caseMessageLinks(messageLinks);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case GroundingPackage.PARTICIPANT_REFS:
                        {
                                ParticipantRefs participantRefs = (ParticipantRefs)theEObject;
                                T result = caseParticipantRefs(participantRefs);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case GroundingPackage.PROPERTIES:
                        {
                                Properties properties = (Properties)theEObject;
                                T result = caseProperties(properties);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case GroundingPackage.MESSAGE_LINK:
                        {
                                MessageLink messageLink = (MessageLink)theEObject;
                                T result = caseMessageLink(messageLink);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case GroundingPackage.PARTICIPANT_REF:
                        {
                                ParticipantRef participantRef = (ParticipantRef)theEObject;
                                T result = caseParticipantRef(participantRef);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case GroundingPackage.PROPERTY:
                        {
                                Property property = (Property)theEObject;
                                T result = caseProperty(property);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Grounding</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Grounding</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseGrounding(Grounding object)
        {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Message Links</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Message Links</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMessageLinks(MessageLinks object)
        {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Participant Refs</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Participant Refs</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseParticipantRefs(ParticipantRefs object)
        {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseProperties(Properties object)
        {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Message Link</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Message Link</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMessageLink(MessageLink object)
        {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Participant Ref</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Participant Ref</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseParticipantRef(ParticipantRef object)
        {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Property</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseProperty(Property object)
        {
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

} //GroundingSwitch
