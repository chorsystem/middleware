/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.topology.MessageLink;
import org.eclipse.bpel4chor.model.topology.TopologyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl#getSenders <em>Senders</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl#getSendActivity <em>Send Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl#getBindSenderTo <em>Bind Sender To</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl#getReceiveActivity <em>Receive Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl#getMessageName <em>Message Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinkImpl#getCopyParticipantRefsTo <em>Copy Participant Refs To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageLinkImpl extends EObjectImpl implements MessageLink
{
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
         * The default value of the '{@link #getSender() <em>Sender</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSender()
         * @generated
         * @ordered
         */
        protected static final String SENDER_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getSender() <em>Sender</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSender()
         * @generated
         * @ordered
         */
        protected String sender = SENDER_EDEFAULT;

        /**
         * The cached value of the '{@link #getSenders() <em>Senders</em>}' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSenders()
         * @generated
         * @ordered
         */
        protected EList<String> senders;

        /**
         * The default value of the '{@link #getSendActivity() <em>Send Activity</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSendActivity()
         * @generated
         * @ordered
         */
        protected static final String SEND_ACTIVITY_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getSendActivity() <em>Send Activity</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSendActivity()
         * @generated
         * @ordered
         */
        protected String sendActivity = SEND_ACTIVITY_EDEFAULT;

        /**
         * The default value of the '{@link #getBindSenderTo() <em>Bind Sender To</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBindSenderTo()
         * @generated
         * @ordered
         */
        protected static final String BIND_SENDER_TO_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getBindSenderTo() <em>Bind Sender To</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBindSenderTo()
         * @generated
         * @ordered
         */
        protected String bindSenderTo = BIND_SENDER_TO_EDEFAULT;

        /**
         * The default value of the '{@link #getReceiver() <em>Receiver</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getReceiver()
         * @generated
         * @ordered
         */
        protected static final String RECEIVER_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getReceiver()
         * @generated
         * @ordered
         */
        protected String receiver = RECEIVER_EDEFAULT;

        /**
         * The default value of the '{@link #getReceiveActivity() <em>Receive Activity</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getReceiveActivity()
         * @generated
         * @ordered
         */
        protected static final String RECEIVE_ACTIVITY_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getReceiveActivity() <em>Receive Activity</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getReceiveActivity()
         * @generated
         * @ordered
         */
        protected String receiveActivity = RECEIVE_ACTIVITY_EDEFAULT;

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
         * The cached value of the '{@link #getParticipantRefs() <em>Participant Refs</em>}' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipantRefs()
         * @generated
         * @ordered
         */
        protected EList<String> participantRefs;

        /**
         * The cached value of the '{@link #getCopyParticipantRefsTo() <em>Copy Participant Refs To</em>}' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCopyParticipantRefsTo()
         * @generated
         * @ordered
         */
        protected EList<String> copyParticipantRefsTo;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MessageLinkImpl()
        {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass()
        {
                return TopologyPackage.Literals.MESSAGE_LINK;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getName()
        {
                return name;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setName(String newName)
        {
                String oldName = name;
                name = newName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.MESSAGE_LINK__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getSender()
        {
                return sender;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setSender(String newSender)
        {
                String oldSender = sender;
                sender = newSender;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.MESSAGE_LINK__SENDER, oldSender, sender));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<String> getSenders()
        {
                if (senders == null)
                {
                        senders = new EDataTypeUniqueEList<String>(String.class, this, TopologyPackage.MESSAGE_LINK__SENDERS);
                }
                return senders;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getSendActivity()
        {
                return sendActivity;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setSendActivity(String newSendActivity)
        {
                String oldSendActivity = sendActivity;
                sendActivity = newSendActivity;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.MESSAGE_LINK__SEND_ACTIVITY, oldSendActivity, sendActivity));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getBindSenderTo()
        {
                return bindSenderTo;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setBindSenderTo(String newBindSenderTo)
        {
                String oldBindSenderTo = bindSenderTo;
                bindSenderTo = newBindSenderTo;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.MESSAGE_LINK__BIND_SENDER_TO, oldBindSenderTo, bindSenderTo));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getReceiver()
        {
                return receiver;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setReceiver(String newReceiver)
        {
                String oldReceiver = receiver;
                receiver = newReceiver;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.MESSAGE_LINK__RECEIVER, oldReceiver, receiver));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getReceiveActivity()
        {
                return receiveActivity;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setReceiveActivity(String newReceiveActivity)
        {
                String oldReceiveActivity = receiveActivity;
                receiveActivity = newReceiveActivity;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.MESSAGE_LINK__RECEIVE_ACTIVITY, oldReceiveActivity, receiveActivity));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getMessageName()
        {
                return messageName;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMessageName(String newMessageName)
        {
                String oldMessageName = messageName;
                messageName = newMessageName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.MESSAGE_LINK__MESSAGE_NAME, oldMessageName, messageName));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<String> getParticipantRefs()
        {
                if (participantRefs == null)
                {
                        participantRefs = new EDataTypeUniqueEList<String>(String.class, this, TopologyPackage.MESSAGE_LINK__PARTICIPANT_REFS);
                }
                return participantRefs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<String> getCopyParticipantRefsTo()
        {
                if (copyParticipantRefsTo == null)
                {
                        copyParticipantRefsTo = new EDataTypeUniqueEList<String>(String.class, this, TopologyPackage.MESSAGE_LINK__COPY_PARTICIPANT_REFS_TO);
                }
                return copyParticipantRefsTo;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType)
        {
                switch (featureID)
                {
                        case TopologyPackage.MESSAGE_LINK__NAME:
                                return getName();
                        case TopologyPackage.MESSAGE_LINK__SENDER:
                                return getSender();
                        case TopologyPackage.MESSAGE_LINK__SENDERS:
                                return getSenders();
                        case TopologyPackage.MESSAGE_LINK__SEND_ACTIVITY:
                                return getSendActivity();
                        case TopologyPackage.MESSAGE_LINK__BIND_SENDER_TO:
                                return getBindSenderTo();
                        case TopologyPackage.MESSAGE_LINK__RECEIVER:
                                return getReceiver();
                        case TopologyPackage.MESSAGE_LINK__RECEIVE_ACTIVITY:
                                return getReceiveActivity();
                        case TopologyPackage.MESSAGE_LINK__MESSAGE_NAME:
                                return getMessageName();
                        case TopologyPackage.MESSAGE_LINK__PARTICIPANT_REFS:
                                return getParticipantRefs();
                        case TopologyPackage.MESSAGE_LINK__COPY_PARTICIPANT_REFS_TO:
                                return getCopyParticipantRefsTo();
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
        public void eSet(int featureID, Object newValue)
        {
                switch (featureID)
                {
                        case TopologyPackage.MESSAGE_LINK__NAME:
                                setName((String)newValue);
                                return;
                        case TopologyPackage.MESSAGE_LINK__SENDER:
                                setSender((String)newValue);
                                return;
                        case TopologyPackage.MESSAGE_LINK__SENDERS:
                                getSenders().clear();
                                getSenders().addAll((Collection<? extends String>)newValue);
                                return;
                        case TopologyPackage.MESSAGE_LINK__SEND_ACTIVITY:
                                setSendActivity((String)newValue);
                                return;
                        case TopologyPackage.MESSAGE_LINK__BIND_SENDER_TO:
                                setBindSenderTo((String)newValue);
                                return;
                        case TopologyPackage.MESSAGE_LINK__RECEIVER:
                                setReceiver((String)newValue);
                                return;
                        case TopologyPackage.MESSAGE_LINK__RECEIVE_ACTIVITY:
                                setReceiveActivity((String)newValue);
                                return;
                        case TopologyPackage.MESSAGE_LINK__MESSAGE_NAME:
                                setMessageName((String)newValue);
                                return;
                        case TopologyPackage.MESSAGE_LINK__PARTICIPANT_REFS:
                                getParticipantRefs().clear();
                                getParticipantRefs().addAll((Collection<? extends String>)newValue);
                                return;
                        case TopologyPackage.MESSAGE_LINK__COPY_PARTICIPANT_REFS_TO:
                                getCopyParticipantRefsTo().clear();
                                getCopyParticipantRefsTo().addAll((Collection<? extends String>)newValue);
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
        public void eUnset(int featureID)
        {
                switch (featureID)
                {
                        case TopologyPackage.MESSAGE_LINK__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case TopologyPackage.MESSAGE_LINK__SENDER:
                                setSender(SENDER_EDEFAULT);
                                return;
                        case TopologyPackage.MESSAGE_LINK__SENDERS:
                                getSenders().clear();
                                return;
                        case TopologyPackage.MESSAGE_LINK__SEND_ACTIVITY:
                                setSendActivity(SEND_ACTIVITY_EDEFAULT);
                                return;
                        case TopologyPackage.MESSAGE_LINK__BIND_SENDER_TO:
                                setBindSenderTo(BIND_SENDER_TO_EDEFAULT);
                                return;
                        case TopologyPackage.MESSAGE_LINK__RECEIVER:
                                setReceiver(RECEIVER_EDEFAULT);
                                return;
                        case TopologyPackage.MESSAGE_LINK__RECEIVE_ACTIVITY:
                                setReceiveActivity(RECEIVE_ACTIVITY_EDEFAULT);
                                return;
                        case TopologyPackage.MESSAGE_LINK__MESSAGE_NAME:
                                setMessageName(MESSAGE_NAME_EDEFAULT);
                                return;
                        case TopologyPackage.MESSAGE_LINK__PARTICIPANT_REFS:
                                getParticipantRefs().clear();
                                return;
                        case TopologyPackage.MESSAGE_LINK__COPY_PARTICIPANT_REFS_TO:
                                getCopyParticipantRefsTo().clear();
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
        public boolean eIsSet(int featureID)
        {
                switch (featureID)
                {
                        case TopologyPackage.MESSAGE_LINK__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case TopologyPackage.MESSAGE_LINK__SENDER:
                                return SENDER_EDEFAULT == null ? sender != null : !SENDER_EDEFAULT.equals(sender);
                        case TopologyPackage.MESSAGE_LINK__SENDERS:
                                return senders != null && !senders.isEmpty();
                        case TopologyPackage.MESSAGE_LINK__SEND_ACTIVITY:
                                return SEND_ACTIVITY_EDEFAULT == null ? sendActivity != null : !SEND_ACTIVITY_EDEFAULT.equals(sendActivity);
                        case TopologyPackage.MESSAGE_LINK__BIND_SENDER_TO:
                                return BIND_SENDER_TO_EDEFAULT == null ? bindSenderTo != null : !BIND_SENDER_TO_EDEFAULT.equals(bindSenderTo);
                        case TopologyPackage.MESSAGE_LINK__RECEIVER:
                                return RECEIVER_EDEFAULT == null ? receiver != null : !RECEIVER_EDEFAULT.equals(receiver);
                        case TopologyPackage.MESSAGE_LINK__RECEIVE_ACTIVITY:
                                return RECEIVE_ACTIVITY_EDEFAULT == null ? receiveActivity != null : !RECEIVE_ACTIVITY_EDEFAULT.equals(receiveActivity);
                        case TopologyPackage.MESSAGE_LINK__MESSAGE_NAME:
                                return MESSAGE_NAME_EDEFAULT == null ? messageName != null : !MESSAGE_NAME_EDEFAULT.equals(messageName);
                        case TopologyPackage.MESSAGE_LINK__PARTICIPANT_REFS:
                                return participantRefs != null && !participantRefs.isEmpty();
                        case TopologyPackage.MESSAGE_LINK__COPY_PARTICIPANT_REFS_TO:
                                return copyParticipantRefsTo != null && !copyParticipantRefsTo.isEmpty();
                }
                return super.eIsSet(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString()
        {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (name: ");
                result.append(name);
                result.append(", sender: ");
                result.append(sender);
                result.append(", senders: ");
                result.append(senders);
                result.append(", sendActivity: ");
                result.append(sendActivity);
                result.append(", bindSenderTo: ");
                result.append(bindSenderTo);
                result.append(", receiver: ");
                result.append(receiver);
                result.append(", receiveActivity: ");
                result.append(receiveActivity);
                result.append(", messageName: ");
                result.append(messageName);
                result.append(", participantRefs: ");
                result.append(participantRefs);
                result.append(", copyParticipantRefsTo: ");
                result.append(copyParticipantRefsTo);
                result.append(')');
                return result.toString();
        }

} //MessageLinkImpl
