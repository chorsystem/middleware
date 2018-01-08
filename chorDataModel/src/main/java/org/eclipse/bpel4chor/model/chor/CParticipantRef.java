/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CParticipant Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipantRef#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipantRef#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantRef()
 * @model
 * @generated
 */
public interface CParticipantRef extends EObject
{
        /**
	 * Returns the value of the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference.
	 * @see #setParticipant(CParticipant)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantRef_Participant()
	 * @model
	 * @generated
	 */
        CParticipant getParticipant();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CParticipantRef#getParticipant <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' reference.
	 * @see #getParticipant()
	 * @generated
	 */
        void setParticipant(CParticipant value);

        /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Name</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantRef_Name()
	 * @model required="true"
	 * @generated
	 */
        String getName();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CParticipantRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
        void setName(String value);

} // CParticipantRef
