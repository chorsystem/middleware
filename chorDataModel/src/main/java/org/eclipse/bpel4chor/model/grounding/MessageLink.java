/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getSenders <em>Senders</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getExpectedPortType <em>Expected Port Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getExpectedOperation <em>Expected Operation</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getMediator <em>Mediator</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getOfferedPortType <em>Offered Port Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getOfferedOperation <em>Offered Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getMessageLink()
 * @model
 * @generated
 */
public interface MessageLink extends EObject
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
         * @see #setName(QName)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getMessageLink_Name()
         * @model dataType="org.eclipse.wst.wsdl.QName" required="true"
         * @generated
         */
        QName getName();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(QName value);

        /**
         * Returns the value of the '<em><b>Port Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Port Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Port Type</em>' attribute.
         * @see #setPortType(QName)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getMessageLink_PortType()
         * @model dataType="org.eclipse.wst.wsdl.QName"
         * @generated
         */
        QName getPortType();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getPortType <em>Port Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Port Type</em>' attribute.
         * @see #getPortType()
         * @generated
         */
        void setPortType(QName value);

        /**
         * Returns the value of the '<em><b>Operation</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Operation</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Operation</em>' attribute.
         * @see #setOperation(String)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getMessageLink_Operation()
         * @model
         * @generated
         */
        String getOperation();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getOperation <em>Operation</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Operation</em>' attribute.
         * @see #getOperation()
         * @generated
         */
        void setOperation(String value);

        /**
         * Returns the value of the '<em><b>Senders</b></em>' attribute list.
         * The list contents are of type {@link javax.xml.namespace.QName}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Senders</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Senders</em>' attribute list.
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getMessageLink_Senders()
         * @model dataType="org.eclipse.wst.wsdl.QName"
         * @generated
         */
        EList<QName> getSenders();

        /**
         * Returns the value of the '<em><b>Expected Port Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Expected Port Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Expected Port Type</em>' attribute.
         * @see #setExpectedPortType(QName)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getMessageLink_ExpectedPortType()
         * @model dataType="org.eclipse.wst.wsdl.QName"
         * @generated
         */
        QName getExpectedPortType();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getExpectedPortType <em>Expected Port Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Expected Port Type</em>' attribute.
         * @see #getExpectedPortType()
         * @generated
         */
        void setExpectedPortType(QName value);

        /**
         * Returns the value of the '<em><b>Expected Operation</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Expected Operation</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Expected Operation</em>' attribute.
         * @see #setExpectedOperation(String)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getMessageLink_ExpectedOperation()
         * @model
         * @generated
         */
        String getExpectedOperation();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getExpectedOperation <em>Expected Operation</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Expected Operation</em>' attribute.
         * @see #getExpectedOperation()
         * @generated
         */
        void setExpectedOperation(String value);

        /**
         * Returns the value of the '<em><b>Mediator</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Mediator</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Mediator</em>' attribute.
         * @see #setMediator(String)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getMessageLink_Mediator()
         * @model
         * @generated
         */
        String getMediator();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getMediator <em>Mediator</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Mediator</em>' attribute.
         * @see #getMediator()
         * @generated
         */
        void setMediator(String value);

        /**
         * Returns the value of the '<em><b>Offered Port Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Offered Port Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Offered Port Type</em>' attribute.
         * @see #setOfferedPortType(QName)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getMessageLink_OfferedPortType()
         * @model dataType="org.eclipse.wst.wsdl.QName"
         * @generated
         */
        QName getOfferedPortType();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getOfferedPortType <em>Offered Port Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Offered Port Type</em>' attribute.
         * @see #getOfferedPortType()
         * @generated
         */
        void setOfferedPortType(QName value);

        /**
         * Returns the value of the '<em><b>Offered Operation</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Offered Operation</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Offered Operation</em>' attribute.
         * @see #setOfferedOperation(String)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getMessageLink_OfferedOperation()
         * @model
         * @generated
         */
        String getOfferedOperation();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.MessageLink#getOfferedOperation <em>Offered Operation</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Offered Operation</em>' attribute.
         * @see #getOfferedOperation()
         * @generated
         */
        void setOfferedOperation(String value);

} // MessageLink
