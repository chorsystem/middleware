/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.bpel4chor.model.pbd.Scope;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CParticipant Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantCommon()
 * @model abstract="true"
 * @generated
 */
public interface CParticipantCommon extends EObject
{
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantCommon_Name()
	 * @model required="true"
	 * @generated
	 */
        String getName();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
        void setName(String value);

        /**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Scope</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(Scope)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantCommon_Scope()
	 * @model
	 * @generated
	 */
        Scope getScope();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
        void setScope(Scope value);

        /**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Process</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(org.eclipse.bpel4chor.model.pbd.Process)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantCommon_Process()
	 * @model containment="true"
	 * @generated
	 */
        org.eclipse.bpel4chor.model.pbd.Process getProcess();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
        void setProcess(org.eclipse.bpel4chor.model.pbd.Process value);

} // CParticipantCommon
