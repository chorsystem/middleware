/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common.impl;

import org.eclipse.bpel4chor.model.chor.common.CommonPackage;
import org.eclipse.bpel4chor.model.chor.common.MessageLinkElementInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Link Element Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.MessageLinkElementInstanceImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.MessageLinkElementInstanceImpl#getSendingActivityInstanceID <em>Sending Activity Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.MessageLinkElementInstanceImpl#getReceivingActivityInstanceID <em>Receiving Activity Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.MessageLinkElementInstanceImpl#getSendingProcessInstanceID <em>Sending Process Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.MessageLinkElementInstanceImpl#getReceivingProcessInstanceID <em>Receiving Process Instance ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageLinkElementInstanceImpl extends ElementInstanceImpl implements MessageLinkElementInstance {
	/**
	 * The default value of the '{@link #getMessageID() <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageID()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageID() <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageID()
	 * @generated
	 * @ordered
	 */
	protected String messageID = MESSAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendingActivityInstanceID() <em>Sending Activity Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingActivityInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDING_ACTIVITY_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendingActivityInstanceID() <em>Sending Activity Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingActivityInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String sendingActivityInstanceID = SENDING_ACTIVITY_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivingActivityInstanceID() <em>Receiving Activity Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingActivityInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVING_ACTIVITY_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivingActivityInstanceID() <em>Receiving Activity Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingActivityInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String receivingActivityInstanceID = RECEIVING_ACTIVITY_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendingProcessInstanceID() <em>Sending Process Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingProcessInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDING_PROCESS_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendingProcessInstanceID() <em>Sending Process Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingProcessInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String sendingProcessInstanceID = SENDING_PROCESS_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivingProcessInstanceID() <em>Receiving Process Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingProcessInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVING_PROCESS_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivingProcessInstanceID() <em>Receiving Process Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingProcessInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String receivingProcessInstanceID = RECEIVING_PROCESS_INSTANCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageLinkElementInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.MESSAGE_LINK_ELEMENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageID() {
		return messageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageID(String newMessageID) {
		String oldMessageID = messageID;
		messageID = newMessageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__MESSAGE_ID, oldMessageID, messageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendingActivityInstanceID() {
		return sendingActivityInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendingActivityInstanceID(String newSendingActivityInstanceID) {
		String oldSendingActivityInstanceID = sendingActivityInstanceID;
		sendingActivityInstanceID = newSendingActivityInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_ACTIVITY_INSTANCE_ID, oldSendingActivityInstanceID, sendingActivityInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceivingActivityInstanceID() {
		return receivingActivityInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingActivityInstanceID(String newReceivingActivityInstanceID) {
		String oldReceivingActivityInstanceID = receivingActivityInstanceID;
		receivingActivityInstanceID = newReceivingActivityInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_ACTIVITY_INSTANCE_ID, oldReceivingActivityInstanceID, receivingActivityInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendingProcessInstanceID() {
		return sendingProcessInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendingProcessInstanceID(String newSendingProcessInstanceID) {
		String oldSendingProcessInstanceID = sendingProcessInstanceID;
		sendingProcessInstanceID = newSendingProcessInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_PROCESS_INSTANCE_ID, oldSendingProcessInstanceID, sendingProcessInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceivingProcessInstanceID() {
		return receivingProcessInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingProcessInstanceID(String newReceivingProcessInstanceID) {
		String oldReceivingProcessInstanceID = receivingProcessInstanceID;
		receivingProcessInstanceID = newReceivingProcessInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_PROCESS_INSTANCE_ID, oldReceivingProcessInstanceID, receivingProcessInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__MESSAGE_ID:
				return getMessageID();
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_ACTIVITY_INSTANCE_ID:
				return getSendingActivityInstanceID();
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_ACTIVITY_INSTANCE_ID:
				return getReceivingActivityInstanceID();
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_PROCESS_INSTANCE_ID:
				return getSendingProcessInstanceID();
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_PROCESS_INSTANCE_ID:
				return getReceivingProcessInstanceID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__MESSAGE_ID:
				setMessageID((String)newValue);
				return;
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_ACTIVITY_INSTANCE_ID:
				setSendingActivityInstanceID((String)newValue);
				return;
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_ACTIVITY_INSTANCE_ID:
				setReceivingActivityInstanceID((String)newValue);
				return;
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_PROCESS_INSTANCE_ID:
				setSendingProcessInstanceID((String)newValue);
				return;
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_PROCESS_INSTANCE_ID:
				setReceivingProcessInstanceID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__MESSAGE_ID:
				setMessageID(MESSAGE_ID_EDEFAULT);
				return;
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_ACTIVITY_INSTANCE_ID:
				setSendingActivityInstanceID(SENDING_ACTIVITY_INSTANCE_ID_EDEFAULT);
				return;
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_ACTIVITY_INSTANCE_ID:
				setReceivingActivityInstanceID(RECEIVING_ACTIVITY_INSTANCE_ID_EDEFAULT);
				return;
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_PROCESS_INSTANCE_ID:
				setSendingProcessInstanceID(SENDING_PROCESS_INSTANCE_ID_EDEFAULT);
				return;
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_PROCESS_INSTANCE_ID:
				setReceivingProcessInstanceID(RECEIVING_PROCESS_INSTANCE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageID != null : !MESSAGE_ID_EDEFAULT.equals(messageID);
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_ACTIVITY_INSTANCE_ID:
				return SENDING_ACTIVITY_INSTANCE_ID_EDEFAULT == null ? sendingActivityInstanceID != null : !SENDING_ACTIVITY_INSTANCE_ID_EDEFAULT.equals(sendingActivityInstanceID);
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_ACTIVITY_INSTANCE_ID:
				return RECEIVING_ACTIVITY_INSTANCE_ID_EDEFAULT == null ? receivingActivityInstanceID != null : !RECEIVING_ACTIVITY_INSTANCE_ID_EDEFAULT.equals(receivingActivityInstanceID);
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__SENDING_PROCESS_INSTANCE_ID:
				return SENDING_PROCESS_INSTANCE_ID_EDEFAULT == null ? sendingProcessInstanceID != null : !SENDING_PROCESS_INSTANCE_ID_EDEFAULT.equals(sendingProcessInstanceID);
			case CommonPackage.MESSAGE_LINK_ELEMENT_INSTANCE__RECEIVING_PROCESS_INSTANCE_ID:
				return RECEIVING_PROCESS_INSTANCE_ID_EDEFAULT == null ? receivingProcessInstanceID != null : !RECEIVING_PROCESS_INSTANCE_ID_EDEFAULT.equals(receivingProcessInstanceID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (messageID: ");
		result.append(messageID);
		result.append(", sendingActivityInstanceID: ");
		result.append(sendingActivityInstanceID);
		result.append(", receivingActivityInstanceID: ");
		result.append(receivingActivityInstanceID);
		result.append(", sendingProcessInstanceID: ");
		result.append(sendingProcessInstanceID);
		result.append(", receivingProcessInstanceID: ");
		result.append(receivingProcessInstanceID);
		result.append(')');
		return result.toString();
	}

} //MessageLinkElementInstanceImpl
