/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.impl;

import org.eclipse.bpel4chor.model.topology.MessageLinks;
import org.eclipse.bpel4chor.model.topology.ParticipantTypes;
import org.eclipse.bpel4chor.model.topology.Participants;
import org.eclipse.bpel4chor.model.topology.Topology;
import org.eclipse.bpel4chor.model.topology.TopologyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.TopologyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.TopologyImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.TopologyImpl#getParticipantTypes <em>Participant Types</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.TopologyImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.TopologyImpl#getMessageLinks <em>Message Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopologyImpl extends EObjectImpl implements Topology
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
         * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTargetNamespace()
         * @generated
         * @ordered
         */
        protected static final String TARGET_NAMESPACE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTargetNamespace()
         * @generated
         * @ordered
         */
        protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

        /**
         * The cached value of the '{@link #getParticipantTypes() <em>Participant Types</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipantTypes()
         * @generated
         * @ordered
         */
        protected ParticipantTypes participantTypes;

        /**
         * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipants()
         * @generated
         * @ordered
         */
        protected Participants participants;

        /**
         * The cached value of the '{@link #getMessageLinks() <em>Message Links</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMessageLinks()
         * @generated
         * @ordered
         */
        protected MessageLinks messageLinks;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TopologyImpl()
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
                return TopologyPackage.Literals.TOPOLOGY;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGY__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getTargetNamespace()
        {
                return targetNamespace;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTargetNamespace(String newTargetNamespace)
        {
                String oldTargetNamespace = targetNamespace;
                targetNamespace = newTargetNamespace;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGY__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParticipantTypes getParticipantTypes()
        {
                return participantTypes;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetParticipantTypes(ParticipantTypes newParticipantTypes, NotificationChain msgs)
        {
                ParticipantTypes oldParticipantTypes = participantTypes;
                participantTypes = newParticipantTypes;
                if (eNotificationRequired())
                {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGY__PARTICIPANT_TYPES, oldParticipantTypes, newParticipantTypes);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setParticipantTypes(ParticipantTypes newParticipantTypes)
        {
                if (newParticipantTypes != participantTypes)
                {
                        NotificationChain msgs = null;
                        if (participantTypes != null)
                                msgs = ((InternalEObject)participantTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.TOPOLOGY__PARTICIPANT_TYPES, null, msgs);
                        if (newParticipantTypes != null)
                                msgs = ((InternalEObject)newParticipantTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.TOPOLOGY__PARTICIPANT_TYPES, null, msgs);
                        msgs = basicSetParticipantTypes(newParticipantTypes, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGY__PARTICIPANT_TYPES, newParticipantTypes, newParticipantTypes));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Participants getParticipants()
        {
                return participants;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetParticipants(Participants newParticipants, NotificationChain msgs)
        {
                Participants oldParticipants = participants;
                participants = newParticipants;
                if (eNotificationRequired())
                {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGY__PARTICIPANTS, oldParticipants, newParticipants);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setParticipants(Participants newParticipants)
        {
                if (newParticipants != participants)
                {
                        NotificationChain msgs = null;
                        if (participants != null)
                                msgs = ((InternalEObject)participants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.TOPOLOGY__PARTICIPANTS, null, msgs);
                        if (newParticipants != null)
                                msgs = ((InternalEObject)newParticipants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.TOPOLOGY__PARTICIPANTS, null, msgs);
                        msgs = basicSetParticipants(newParticipants, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGY__PARTICIPANTS, newParticipants, newParticipants));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MessageLinks getMessageLinks()
        {
                return messageLinks;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetMessageLinks(MessageLinks newMessageLinks, NotificationChain msgs)
        {
                MessageLinks oldMessageLinks = messageLinks;
                messageLinks = newMessageLinks;
                if (eNotificationRequired())
                {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGY__MESSAGE_LINKS, oldMessageLinks, newMessageLinks);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMessageLinks(MessageLinks newMessageLinks)
        {
                if (newMessageLinks != messageLinks)
                {
                        NotificationChain msgs = null;
                        if (messageLinks != null)
                                msgs = ((InternalEObject)messageLinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.TOPOLOGY__MESSAGE_LINKS, null, msgs);
                        if (newMessageLinks != null)
                                msgs = ((InternalEObject)newMessageLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.TOPOLOGY__MESSAGE_LINKS, null, msgs);
                        msgs = basicSetMessageLinks(newMessageLinks, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGY__MESSAGE_LINKS, newMessageLinks, newMessageLinks));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
        {
                switch (featureID)
                {
                        case TopologyPackage.TOPOLOGY__PARTICIPANT_TYPES:
                                return basicSetParticipantTypes(null, msgs);
                        case TopologyPackage.TOPOLOGY__PARTICIPANTS:
                                return basicSetParticipants(null, msgs);
                        case TopologyPackage.TOPOLOGY__MESSAGE_LINKS:
                                return basicSetMessageLinks(null, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
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
                        case TopologyPackage.TOPOLOGY__NAME:
                                return getName();
                        case TopologyPackage.TOPOLOGY__TARGET_NAMESPACE:
                                return getTargetNamespace();
                        case TopologyPackage.TOPOLOGY__PARTICIPANT_TYPES:
                                return getParticipantTypes();
                        case TopologyPackage.TOPOLOGY__PARTICIPANTS:
                                return getParticipants();
                        case TopologyPackage.TOPOLOGY__MESSAGE_LINKS:
                                return getMessageLinks();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eSet(int featureID, Object newValue)
        {
                switch (featureID)
                {
                        case TopologyPackage.TOPOLOGY__NAME:
                                setName((String)newValue);
                                return;
                        case TopologyPackage.TOPOLOGY__TARGET_NAMESPACE:
                                setTargetNamespace((String)newValue);
                                return;
                        case TopologyPackage.TOPOLOGY__PARTICIPANT_TYPES:
                                setParticipantTypes((ParticipantTypes)newValue);
                                return;
                        case TopologyPackage.TOPOLOGY__PARTICIPANTS:
                                setParticipants((Participants)newValue);
                                return;
                        case TopologyPackage.TOPOLOGY__MESSAGE_LINKS:
                                setMessageLinks((MessageLinks)newValue);
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
                        case TopologyPackage.TOPOLOGY__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case TopologyPackage.TOPOLOGY__TARGET_NAMESPACE:
                                setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
                                return;
                        case TopologyPackage.TOPOLOGY__PARTICIPANT_TYPES:
                                setParticipantTypes((ParticipantTypes)null);
                                return;
                        case TopologyPackage.TOPOLOGY__PARTICIPANTS:
                                setParticipants((Participants)null);
                                return;
                        case TopologyPackage.TOPOLOGY__MESSAGE_LINKS:
                                setMessageLinks((MessageLinks)null);
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
                        case TopologyPackage.TOPOLOGY__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case TopologyPackage.TOPOLOGY__TARGET_NAMESPACE:
                                return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
                        case TopologyPackage.TOPOLOGY__PARTICIPANT_TYPES:
                                return participantTypes != null;
                        case TopologyPackage.TOPOLOGY__PARTICIPANTS:
                                return participants != null;
                        case TopologyPackage.TOPOLOGY__MESSAGE_LINKS:
                                return messageLinks != null;
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
                result.append(", targetNamespace: ");
                result.append(targetNamespace);
                result.append(')');
                return result.toString();
        }

} //TopologyImpl
