/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.util;

import java.util.List;

import org.eclipse.bpel4chor.model.topology.*;

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
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage
 * @generated
 */
public class TopologySwitch<T>
{
        /**
         * The cached model package
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static TopologyPackage modelPackage;

        /**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TopologySwitch()
        {
                if (modelPackage == null)
                {
                        modelPackage = TopologyPackage.eINSTANCE;
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
                        case TopologyPackage.TOPOLOGY:
                        {
                                Topology topology = (Topology)theEObject;
                                T result = caseTopology(topology);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case TopologyPackage.PARTICIPANT_TYPE:
                        {
                                ParticipantType participantType = (ParticipantType)theEObject;
                                T result = caseParticipantType(participantType);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case TopologyPackage.PARTICIPANT:
                        {
                                Participant participant = (Participant)theEObject;
                                T result = caseParticipant(participant);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case TopologyPackage.PARTICIPANT_SET:
                        {
                                ParticipantSet participantSet = (ParticipantSet)theEObject;
                                T result = caseParticipantSet(participantSet);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case TopologyPackage.PARTICIPANTS:
                        {
                                Participants participants = (Participants)theEObject;
                                T result = caseParticipants(participants);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case TopologyPackage.MESSAGE_LINK:
                        {
                                MessageLink messageLink = (MessageLink)theEObject;
                                T result = caseMessageLink(messageLink);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case TopologyPackage.PARTICIPANT_TYPES:
                        {
                                ParticipantTypes participantTypes = (ParticipantTypes)theEObject;
                                T result = caseParticipantTypes(participantTypes);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case TopologyPackage.MESSAGE_LINKS:
                        {
                                MessageLinks messageLinks = (MessageLinks)theEObject;
                                T result = caseMessageLinks(messageLinks);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Topology</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Topology</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTopology(Topology object)
        {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Participant Type</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Participant Type</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseParticipantType(ParticipantType object)
        {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseParticipant(Participant object)
        {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Participant Set</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Participant Set</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseParticipantSet(ParticipantSet object)
        {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Participants</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Participants</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseParticipants(Participants object)
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
         * Returns the result of interpreting the object as an instance of '<em>Participant Types</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Participant Types</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseParticipantTypes(ParticipantTypes object)
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

} //TopologySwitch
