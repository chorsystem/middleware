/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participants</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Participants#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Participants#getParticipantSet <em>Participant Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipants()
 * @model
 * @generated
 */
public interface Participants extends EObject
{
        /**
         * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
         * The list contents are of type {@link org.eclipse.bpel4chor.model.topology.Participant}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participant</em>' containment reference list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipants_Participant()
         * @model containment="true"
         * @generated
         */
        EList<Participant> getParticipant();

        /**
         * Returns the value of the '<em><b>Participant Set</b></em>' containment reference list.
         * The list contents are of type {@link org.eclipse.bpel4chor.model.topology.ParticipantSet}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Set</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participant Set</em>' containment reference list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipants_ParticipantSet()
         * @model containment="true"
         * @generated
         */
        EList<ParticipantSet> getParticipantSet();

} // Participants
