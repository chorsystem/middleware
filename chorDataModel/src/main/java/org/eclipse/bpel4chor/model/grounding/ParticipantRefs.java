/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Refs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.ParticipantRefs#getParticipantRef <em>Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getParticipantRefs()
 * @model
 * @generated
 */
public interface ParticipantRefs extends EObject
{
        /**
         * Returns the value of the '<em><b>Participant Ref</b></em>' containment reference list.
         * The list contents are of type {@link org.eclipse.bpel4chor.model.grounding.ParticipantRef}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Ref</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participant Ref</em>' containment reference list.
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getParticipantRefs_ParticipantRef()
         * @model containment="true"
         *        extendedMetaData="name='participantRef' kind='element' namespace='##targetNamespace'"
         * @generated
         */
        EList<ParticipantRef> getParticipantRef();

} // ParticipantRefs
