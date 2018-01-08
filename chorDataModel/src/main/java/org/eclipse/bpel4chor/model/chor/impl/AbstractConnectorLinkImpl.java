/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector;
import org.eclipse.bpel4chor.model.chor.AbstractConnectorLink;
import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantRef;
import org.eclipse.bpel4chor.model.chor.CParticipantSet;
import org.eclipse.bpel4chor.model.chor.ChorPackage;

import org.eclipse.bpel4chor.model.pbd.CLinkable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Connector Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl#getSendActivity <em>Send Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl#getReceiveActivity <em>Receive Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl#getBindSenderTo <em>Bind Sender To</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl#getSenders <em>Senders</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl#getMessageName <em>Message Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.AbstractConnectorLinkImpl#getAbstractConnector <em>Abstract Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractConnectorLinkImpl extends EObjectImpl implements AbstractConnectorLink {
	/**
	 * The cached value of the '{@link #getSendActivity() <em>Send Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendActivity()
	 * @generated
	 * @ordered
	 */
	protected CLinkable sendActivity;

	/**
	 * The cached value of the '{@link #getReceiveActivity() <em>Receive Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveActivity()
	 * @generated
	 * @ordered
	 */
	protected CLinkable receiveActivity;

	/**
	 * The cached value of the '{@link #getParticipantRefs() <em>Participant Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<CParticipantRef> participantRefs;

	/**
	 * The cached value of the '{@link #getBindSenderTo() <em>Bind Sender To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindSenderTo()
	 * @generated
	 * @ordered
	 */
	protected CParticipant bindSenderTo;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected CParticipant sender;

	/**
	 * The cached value of the '{@link #getSenders() <em>Senders</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenders()
	 * @generated
	 * @ordered
	 */
	protected CParticipantSet senders;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected CParticipant receiver;

	/**
	 * The default value of the '{@link #getMessageName() <em>Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageName()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageName() <em>Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageName()
	 * @generated
	 * @ordered
	 */
	protected String messageName = MESSAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractConnector() <em>Abstract Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractConnector()
	 * @generated
	 * @ordered
	 */
	protected AbstractConnector abstractConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConnectorLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChorPackage.Literals.ABSTRACT_CONNECTOR_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLinkable getSendActivity() {
		if (sendActivity != null && sendActivity.eIsProxy()) {
			InternalEObject oldSendActivity = (InternalEObject)sendActivity;
			sendActivity = (CLinkable)eResolveProxy(oldSendActivity);
			if (sendActivity != oldSendActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.ABSTRACT_CONNECTOR_LINK__SEND_ACTIVITY, oldSendActivity, sendActivity));
			}
		}
		return sendActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLinkable basicGetSendActivity() {
		return sendActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendActivity(CLinkable newSendActivity) {
		CLinkable oldSendActivity = sendActivity;
		sendActivity = newSendActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.ABSTRACT_CONNECTOR_LINK__SEND_ACTIVITY, oldSendActivity, sendActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLinkable getReceiveActivity() {
		if (receiveActivity != null && receiveActivity.eIsProxy()) {
			InternalEObject oldReceiveActivity = (InternalEObject)receiveActivity;
			receiveActivity = (CLinkable)eResolveProxy(oldReceiveActivity);
			if (receiveActivity != oldReceiveActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVE_ACTIVITY, oldReceiveActivity, receiveActivity));
			}
		}
		return receiveActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLinkable basicGetReceiveActivity() {
		return receiveActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveActivity(CLinkable newReceiveActivity) {
		CLinkable oldReceiveActivity = receiveActivity;
		receiveActivity = newReceiveActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVE_ACTIVITY, oldReceiveActivity, receiveActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CParticipantRef> getParticipantRefs() {
		if (participantRefs == null) {
			participantRefs = new EObjectResolvingEList<CParticipantRef>(CParticipantRef.class, this, ChorPackage.ABSTRACT_CONNECTOR_LINK__PARTICIPANT_REFS);
		}
		return participantRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CParticipant getBindSenderTo() {
		if (bindSenderTo != null && bindSenderTo.eIsProxy()) {
			InternalEObject oldBindSenderTo = (InternalEObject)bindSenderTo;
			bindSenderTo = (CParticipant)eResolveProxy(oldBindSenderTo);
			if (bindSenderTo != oldBindSenderTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.ABSTRACT_CONNECTOR_LINK__BIND_SENDER_TO, oldBindSenderTo, bindSenderTo));
			}
		}
		return bindSenderTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CParticipant basicGetBindSenderTo() {
		return bindSenderTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindSenderTo(CParticipant newBindSenderTo) {
		CParticipant oldBindSenderTo = bindSenderTo;
		bindSenderTo = newBindSenderTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.ABSTRACT_CONNECTOR_LINK__BIND_SENDER_TO, oldBindSenderTo, bindSenderTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CParticipant getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (CParticipant)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CParticipant basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(CParticipant newSender) {
		CParticipant oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CParticipantSet getSenders() {
		if (senders != null && senders.eIsProxy()) {
			InternalEObject oldSenders = (InternalEObject)senders;
			senders = (CParticipantSet)eResolveProxy(oldSenders);
			if (senders != oldSenders) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDERS, oldSenders, senders));
			}
		}
		return senders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CParticipantSet basicGetSenders() {
		return senders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenders(CParticipantSet newSenders) {
		CParticipantSet oldSenders = senders;
		senders = newSenders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDERS, oldSenders, senders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CParticipant getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (CParticipant)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CParticipant basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(CParticipant newReceiver) {
		CParticipant oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageName() {
		return messageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageName(String newMessageName) {
		String oldMessageName = messageName;
		messageName = newMessageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.ABSTRACT_CONNECTOR_LINK__MESSAGE_NAME, oldMessageName, messageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.ABSTRACT_CONNECTOR_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnector getAbstractConnector() {
		if (abstractConnector != null && abstractConnector.eIsProxy()) {
			InternalEObject oldAbstractConnector = (InternalEObject)abstractConnector;
			abstractConnector = (AbstractConnector)eResolveProxy(oldAbstractConnector);
			if (abstractConnector != oldAbstractConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.ABSTRACT_CONNECTOR_LINK__ABSTRACT_CONNECTOR, oldAbstractConnector, abstractConnector));
			}
		}
		return abstractConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnector basicGetAbstractConnector() {
		return abstractConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractConnector(AbstractConnector newAbstractConnector) {
		AbstractConnector oldAbstractConnector = abstractConnector;
		abstractConnector = newAbstractConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.ABSTRACT_CONNECTOR_LINK__ABSTRACT_CONNECTOR, oldAbstractConnector, abstractConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SEND_ACTIVITY:
				if (resolve) return getSendActivity();
				return basicGetSendActivity();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVE_ACTIVITY:
				if (resolve) return getReceiveActivity();
				return basicGetReceiveActivity();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__PARTICIPANT_REFS:
				return getParticipantRefs();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__BIND_SENDER_TO:
				if (resolve) return getBindSenderTo();
				return basicGetBindSenderTo();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDERS:
				if (resolve) return getSenders();
				return basicGetSenders();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__MESSAGE_NAME:
				return getMessageName();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__NAME:
				return getName();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__ABSTRACT_CONNECTOR:
				if (resolve) return getAbstractConnector();
				return basicGetAbstractConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SEND_ACTIVITY:
				setSendActivity((CLinkable)newValue);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVE_ACTIVITY:
				setReceiveActivity((CLinkable)newValue);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__PARTICIPANT_REFS:
				getParticipantRefs().clear();
				getParticipantRefs().addAll((Collection<? extends CParticipantRef>)newValue);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__BIND_SENDER_TO:
				setBindSenderTo((CParticipant)newValue);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDER:
				setSender((CParticipant)newValue);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDERS:
				setSenders((CParticipantSet)newValue);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVER:
				setReceiver((CParticipant)newValue);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__MESSAGE_NAME:
				setMessageName((String)newValue);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__NAME:
				setName((String)newValue);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__ABSTRACT_CONNECTOR:
				setAbstractConnector((AbstractConnector)newValue);
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
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SEND_ACTIVITY:
				setSendActivity((CLinkable)null);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVE_ACTIVITY:
				setReceiveActivity((CLinkable)null);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__PARTICIPANT_REFS:
				getParticipantRefs().clear();
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__BIND_SENDER_TO:
				setBindSenderTo((CParticipant)null);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDER:
				setSender((CParticipant)null);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDERS:
				setSenders((CParticipantSet)null);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVER:
				setReceiver((CParticipant)null);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__MESSAGE_NAME:
				setMessageName(MESSAGE_NAME_EDEFAULT);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__ABSTRACT_CONNECTOR:
				setAbstractConnector((AbstractConnector)null);
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
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SEND_ACTIVITY:
				return sendActivity != null;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVE_ACTIVITY:
				return receiveActivity != null;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__PARTICIPANT_REFS:
				return participantRefs != null && !participantRefs.isEmpty();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__BIND_SENDER_TO:
				return bindSenderTo != null;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDER:
				return sender != null;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__SENDERS:
				return senders != null;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__RECEIVER:
				return receiver != null;
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__MESSAGE_NAME:
				return MESSAGE_NAME_EDEFAULT == null ? messageName != null : !MESSAGE_NAME_EDEFAULT.equals(messageName);
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChorPackage.ABSTRACT_CONNECTOR_LINK__ABSTRACT_CONNECTOR:
				return abstractConnector != null;
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
		result.append(" (messageName: ");
		result.append(messageName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractConnectorLinkImpl
