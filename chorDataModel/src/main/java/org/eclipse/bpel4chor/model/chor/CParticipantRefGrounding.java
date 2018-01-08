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
 * A representation of the model object '<em><b>CParticipant Ref Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding#getCParticipantRef <em>CParticipant Ref</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding#getWSDLProperty <em>WSDL Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantRefGrounding()
 * @model
 * @generated
 */
public interface CParticipantRefGrounding extends EObject
{
        /**
	 * Returns the value of the '<em><b>CParticipant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>CParticipant Ref</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>CParticipant Ref</em>' reference.
	 * @see #setCParticipantRef(CParticipantRef)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantRefGrounding_CParticipantRef()
	 * @model
	 * @generated
	 */
        CParticipantRef getCParticipantRef();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding#getCParticipantRef <em>CParticipant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CParticipant Ref</em>' reference.
	 * @see #getCParticipantRef()
	 * @generated
	 */
        void setCParticipantRef(CParticipantRef value);

        /**
	 * Returns the value of the '<em><b>WSDL Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>WSDL Property</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>WSDL Property</em>' containment reference.
	 * @see #setWSDLProperty(CQName)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipantRefGrounding_WSDLProperty()
	 * @model containment="true"
	 * @generated
	 */
        CQName getWSDLProperty();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding#getWSDLProperty <em>WSDL Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WSDL Property</em>' containment reference.
	 * @see #getWSDLProperty()
	 * @generated
	 */
        void setWSDLProperty(CQName value);

} // CParticipantRefGrounding
