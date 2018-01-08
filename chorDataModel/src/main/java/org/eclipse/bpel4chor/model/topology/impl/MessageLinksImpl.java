/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.topology.MessageLink;
import org.eclipse.bpel4chor.model.topology.MessageLinks;
import org.eclipse.bpel4chor.model.topology.TopologyPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.MessageLinksImpl#getMessageLink <em>Message Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageLinksImpl extends EObjectImpl implements MessageLinks
{
        /**
         * The cached value of the '{@link #getMessageLink() <em>Message Link</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMessageLink()
         * @generated
         * @ordered
         */
        protected EList<MessageLink> messageLink;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MessageLinksImpl()
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
                return TopologyPackage.Literals.MESSAGE_LINKS;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<MessageLink> getMessageLink()
        {
                if (messageLink == null)
                {
                        messageLink = new EObjectContainmentEList<MessageLink>(MessageLink.class, this, TopologyPackage.MESSAGE_LINKS__MESSAGE_LINK);
                }
                return messageLink;
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
                        case TopologyPackage.MESSAGE_LINKS__MESSAGE_LINK:
                                return ((InternalEList<?>)getMessageLink()).basicRemove(otherEnd, msgs);
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
                        case TopologyPackage.MESSAGE_LINKS__MESSAGE_LINK:
                                return getMessageLink();
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
                        case TopologyPackage.MESSAGE_LINKS__MESSAGE_LINK:
                                getMessageLink().clear();
                                getMessageLink().addAll((Collection<? extends MessageLink>)newValue);
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
                        case TopologyPackage.MESSAGE_LINKS__MESSAGE_LINK:
                                getMessageLink().clear();
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
                        case TopologyPackage.MESSAGE_LINKS__MESSAGE_LINK:
                                return messageLink != null && !messageLink.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //MessageLinksImpl
