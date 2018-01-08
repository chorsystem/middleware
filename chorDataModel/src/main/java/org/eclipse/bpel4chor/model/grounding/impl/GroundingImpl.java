/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding.impl;

import javax.xml.namespace.QName;

import org.eclipse.bpel4chor.model.grounding.Grounding;
import org.eclipse.bpel4chor.model.grounding.GroundingPackage;
import org.eclipse.bpel4chor.model.grounding.MessageLinks;
import org.eclipse.bpel4chor.model.grounding.ParticipantRefs;
import org.eclipse.bpel4chor.model.grounding.Properties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.GroundingImpl#getTopology <em>Topology</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.GroundingImpl#getMessageLinks <em>Message Links</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.GroundingImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.GroundingImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroundingImpl extends EObjectImpl implements Grounding
{
        /**
         * The default value of the '{@link #getTopology() <em>Topology</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTopology()
         * @generated
         * @ordered
         */
        protected static final QName TOPOLOGY_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getTopology() <em>Topology</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTopology()
         * @generated
         * @ordered
         */
        protected QName topology = TOPOLOGY_EDEFAULT;

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
         * The cached value of the '{@link #getParticipantRefs() <em>Participant Refs</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipantRefs()
         * @generated
         * @ordered
         */
        protected ParticipantRefs participantRefs;

        /**
         * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getProperties()
         * @generated
         * @ordered
         */
        protected Properties properties;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected GroundingImpl()
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
                return GroundingPackage.Literals.GROUNDING;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QName getTopology()
        {
                return topology;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTopology(QName newTopology)
        {
                QName oldTopology = topology;
                topology = newTopology;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.GROUNDING__TOPOLOGY, oldTopology, topology));
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
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroundingPackage.GROUNDING__MESSAGE_LINKS, oldMessageLinks, newMessageLinks);
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
                                msgs = ((InternalEObject)messageLinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.GROUNDING__MESSAGE_LINKS, null, msgs);
                        if (newMessageLinks != null)
                                msgs = ((InternalEObject)newMessageLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.GROUNDING__MESSAGE_LINKS, null, msgs);
                        msgs = basicSetMessageLinks(newMessageLinks, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.GROUNDING__MESSAGE_LINKS, newMessageLinks, newMessageLinks));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParticipantRefs getParticipantRefs()
        {
                return participantRefs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetParticipantRefs(ParticipantRefs newParticipantRefs, NotificationChain msgs)
        {
                ParticipantRefs oldParticipantRefs = participantRefs;
                participantRefs = newParticipantRefs;
                if (eNotificationRequired())
                {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroundingPackage.GROUNDING__PARTICIPANT_REFS, oldParticipantRefs, newParticipantRefs);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setParticipantRefs(ParticipantRefs newParticipantRefs)
        {
                if (newParticipantRefs != participantRefs)
                {
                        NotificationChain msgs = null;
                        if (participantRefs != null)
                                msgs = ((InternalEObject)participantRefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.GROUNDING__PARTICIPANT_REFS, null, msgs);
                        if (newParticipantRefs != null)
                                msgs = ((InternalEObject)newParticipantRefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.GROUNDING__PARTICIPANT_REFS, null, msgs);
                        msgs = basicSetParticipantRefs(newParticipantRefs, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.GROUNDING__PARTICIPANT_REFS, newParticipantRefs, newParticipantRefs));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Properties getProperties()
        {
                return properties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetProperties(Properties newProperties, NotificationChain msgs)
        {
                Properties oldProperties = properties;
                properties = newProperties;
                if (eNotificationRequired())
                {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroundingPackage.GROUNDING__PROPERTIES, oldProperties, newProperties);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setProperties(Properties newProperties)
        {
                if (newProperties != properties)
                {
                        NotificationChain msgs = null;
                        if (properties != null)
                                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.GROUNDING__PROPERTIES, null, msgs);
                        if (newProperties != null)
                                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroundingPackage.GROUNDING__PROPERTIES, null, msgs);
                        msgs = basicSetProperties(newProperties, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.GROUNDING__PROPERTIES, newProperties, newProperties));
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
                        case GroundingPackage.GROUNDING__MESSAGE_LINKS:
                                return basicSetMessageLinks(null, msgs);
                        case GroundingPackage.GROUNDING__PARTICIPANT_REFS:
                                return basicSetParticipantRefs(null, msgs);
                        case GroundingPackage.GROUNDING__PROPERTIES:
                                return basicSetProperties(null, msgs);
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
                        case GroundingPackage.GROUNDING__TOPOLOGY:
                                return getTopology();
                        case GroundingPackage.GROUNDING__MESSAGE_LINKS:
                                return getMessageLinks();
                        case GroundingPackage.GROUNDING__PARTICIPANT_REFS:
                                return getParticipantRefs();
                        case GroundingPackage.GROUNDING__PROPERTIES:
                                return getProperties();
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
                        case GroundingPackage.GROUNDING__TOPOLOGY:
                                setTopology((QName)newValue);
                                return;
                        case GroundingPackage.GROUNDING__MESSAGE_LINKS:
                                setMessageLinks((MessageLinks)newValue);
                                return;
                        case GroundingPackage.GROUNDING__PARTICIPANT_REFS:
                                setParticipantRefs((ParticipantRefs)newValue);
                                return;
                        case GroundingPackage.GROUNDING__PROPERTIES:
                                setProperties((Properties)newValue);
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
                        case GroundingPackage.GROUNDING__TOPOLOGY:
                                setTopology(TOPOLOGY_EDEFAULT);
                                return;
                        case GroundingPackage.GROUNDING__MESSAGE_LINKS:
                                setMessageLinks((MessageLinks)null);
                                return;
                        case GroundingPackage.GROUNDING__PARTICIPANT_REFS:
                                setParticipantRefs((ParticipantRefs)null);
                                return;
                        case GroundingPackage.GROUNDING__PROPERTIES:
                                setProperties((Properties)null);
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
                        case GroundingPackage.GROUNDING__TOPOLOGY:
                                return TOPOLOGY_EDEFAULT == null ? topology != null : !TOPOLOGY_EDEFAULT.equals(topology);
                        case GroundingPackage.GROUNDING__MESSAGE_LINKS:
                                return messageLinks != null;
                        case GroundingPackage.GROUNDING__PARTICIPANT_REFS:
                                return participantRefs != null;
                        case GroundingPackage.GROUNDING__PROPERTIES:
                                return properties != null;
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
                result.append(" (topology: ");
                result.append(topology);
                result.append(')');
                return result.toString();
        }

} //GroundingImpl
