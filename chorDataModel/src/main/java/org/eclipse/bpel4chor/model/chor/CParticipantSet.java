/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CParticipant Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipantSet#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipantSet#getParticipantSets <em>Participant Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantSet()
 * @model
 * @generated
 */
public interface CParticipantSet extends CParticipantCommon
{
        /**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CParticipant}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantSet_Participants()
	 * @model containment="true"
	 * @generated
	 */
        EList<CParticipant> getParticipants();

        /**
	 * Returns the value of the '<em><b>Participant Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CParticipantSet}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Sets</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Sets</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantSet_ParticipantSets()
	 * @model containment="true"
	 * @generated
	 */
        EList<CParticipantSet> getParticipantSets();

} // CParticipantSet
