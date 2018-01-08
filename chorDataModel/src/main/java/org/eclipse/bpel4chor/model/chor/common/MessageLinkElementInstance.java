/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Link Element Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getSendingActivityInstanceID <em>Sending Activity Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getReceivingActivityInstanceID <em>Receiving Activity Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getSendingProcessInstanceID <em>Sending Process Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getReceivingProcessInstanceID <em>Receiving Process Instance ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getMessageLinkElementInstance()
 * @model
 * @generated
 */
public interface MessageLinkElementInstance extends ElementInstance {
	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message ID</em>' attribute.
	 * @see #setMessageID(String)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getMessageLinkElementInstance_MessageID()
	 * @model
	 * @generated
	 */
	String getMessageID();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getMessageID <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID</em>' attribute.
	 * @see #getMessageID()
	 * @generated
	 */
	void setMessageID(String value);

	/**
	 * Returns the value of the '<em><b>Sending Activity Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending Activity Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending Activity Instance ID</em>' attribute.
	 * @see #setSendingActivityInstanceID(String)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getMessageLinkElementInstance_SendingActivityInstanceID()
	 * @model
	 * @generated
	 */
	String getSendingActivityInstanceID();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getSendingActivityInstanceID <em>Sending Activity Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending Activity Instance ID</em>' attribute.
	 * @see #getSendingActivityInstanceID()
	 * @generated
	 */
	void setSendingActivityInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Receiving Activity Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Activity Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Activity Instance ID</em>' attribute.
	 * @see #setReceivingActivityInstanceID(String)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getMessageLinkElementInstance_ReceivingActivityInstanceID()
	 * @model
	 * @generated
	 */
	String getReceivingActivityInstanceID();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getReceivingActivityInstanceID <em>Receiving Activity Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Activity Instance ID</em>' attribute.
	 * @see #getReceivingActivityInstanceID()
	 * @generated
	 */
	void setReceivingActivityInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Sending Process Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending Process Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending Process Instance ID</em>' attribute.
	 * @see #setSendingProcessInstanceID(String)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getMessageLinkElementInstance_SendingProcessInstanceID()
	 * @model
	 * @generated
	 */
	String getSendingProcessInstanceID();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getSendingProcessInstanceID <em>Sending Process Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending Process Instance ID</em>' attribute.
	 * @see #getSendingProcessInstanceID()
	 * @generated
	 */
	void setSendingProcessInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Receiving Process Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Process Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Process Instance ID</em>' attribute.
	 * @see #setReceivingProcessInstanceID(String)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getMessageLinkElementInstance_ReceivingProcessInstanceID()
	 * @model
	 * @generated
	 */
	String getReceivingProcessInstanceID();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance#getReceivingProcessInstanceID <em>Receiving Process Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Process Instance ID</em>' attribute.
	 * @see #getReceivingProcessInstanceID()
	 * @generated
	 */
	void setReceivingProcessInstanceID(String value);

} // MessageLinkElementInstance
