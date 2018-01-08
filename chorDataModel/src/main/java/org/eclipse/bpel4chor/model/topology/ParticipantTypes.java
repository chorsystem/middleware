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
 * A representation of the model object '<em><b>Participant Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.ParticipantTypes#getParticipantType <em>Participant Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantTypes()
 * @model
 * @generated
 */
public interface ParticipantTypes extends EObject
{
        /**
         * Returns the value of the '<em><b>Participant Type</b></em>' containment reference list.
         * The list contents are of type {@link org.eclipse.bpel4chor.model.topology.ParticipantType}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Type</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participant Type</em>' containment reference list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipantTypes_ParticipantType()
         * @model containment="true"
         * @generated
         */
        EList<ParticipantType> getParticipantType();

} // ParticipantTypes
