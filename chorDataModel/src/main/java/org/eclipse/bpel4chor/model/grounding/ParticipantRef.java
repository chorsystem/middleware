/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.ParticipantRef#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.ParticipantRef#getWSDLproperty <em>WSD Lproperty</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getParticipantRef()
 * @model
 * @generated
 */
public interface ParticipantRef extends EObject
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
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getParticipantRef_Name()
         * @model required="true"
         * @generated
         */
        String getName();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.ParticipantRef#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);

        /**
         * Returns the value of the '<em><b>WSD Lproperty</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>WSD Lproperty</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>WSD Lproperty</em>' attribute.
         * @see #setWSDLproperty(QName)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getParticipantRef_WSDLproperty()
         * @model dataType="org.eclipse.wst.wsdl.QName" required="true"
         * @generated
         */
        QName getWSDLproperty();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.ParticipantRef#getWSDLproperty <em>WSD Lproperty</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>WSD Lproperty</em>' attribute.
         * @see #getWSDLproperty()
         * @generated
         */
        void setWSDLproperty(QName value);

} // ParticipantRef
