/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;

import org.eclipse.wst.wsdl.Message;

import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Variable#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Variable#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Variable#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Variable#getXsdElement <em>Xsd Element</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Variable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(From)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getVariable_From()
	 * @model containment="true"
	 * @generated
	 */
	From getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Variable#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(From value);

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
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' containment reference.
	 * @see #setMessageType(Message)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getVariable_MessageType()
	 * @model containment="true"
	 * @generated
	 */
	Message getMessageType();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Variable#getMessageType <em>Message Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' containment reference.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(Message value);

	/**
	 * Returns the value of the '<em><b>Xsd Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsd Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd Element</em>' containment reference.
	 * @see #setXsdElement(XSDElementDeclaration)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getVariable_XsdElement()
	 * @model containment="true"
	 * @generated
	 */
	XSDElementDeclaration getXsdElement();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Variable#getXsdElement <em>Xsd Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd Element</em>' containment reference.
	 * @see #getXsdElement()
	 * @generated
	 */
	void setXsdElement(XSDElementDeclaration value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(XSDTypeDefinition)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getVariable_Type()
	 * @model containment="true"
	 * @generated
	 */
	XSDTypeDefinition getType();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Variable#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(XSDTypeDefinition value);

} // Variable
