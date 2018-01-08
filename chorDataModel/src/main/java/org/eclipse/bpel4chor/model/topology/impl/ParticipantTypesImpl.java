/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.topology.ParticipantType;
import org.eclipse.bpel4chor.model.topology.ParticipantTypes;
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
 * An implementation of the model object '<em><b>Participant Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantTypesImpl#getParticipantType <em>Participant Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantTypesImpl extends EObjectImpl implements ParticipantTypes
{
        /**
         * The cached value of the '{@link #getParticipantType() <em>Participant Type</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipantType()
         * @generated
         * @ordered
         */
        protected EList<ParticipantType> participantType;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ParticipantTypesImpl()
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
                return TopologyPackage.Literals.PARTICIPANT_TYPES;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<ParticipantType> getParticipantType()
        {
                if (participantType == null)
                {
                        participantType = new EObjectContainmentEList<ParticipantType>(ParticipantType.class, this, TopologyPackage.PARTICIPANT_TYPES__PARTICIPANT_TYPE);
                }
                return participantType;
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
                        case TopologyPackage.PARTICIPANT_TYPES__PARTICIPANT_TYPE:
                                return ((InternalEList<?>)getParticipantType()).basicRemove(otherEnd, msgs);
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
                        case TopologyPackage.PARTICIPANT_TYPES__PARTICIPANT_TYPE:
                                return getParticipantType();
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
                        case TopologyPackage.PARTICIPANT_TYPES__PARTICIPANT_TYPE:
                                getParticipantType().clear();
                                getParticipantType().addAll((Collection<? extends ParticipantType>)newValue);
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
                        case TopologyPackage.PARTICIPANT_TYPES__PARTICIPANT_TYPE:
                                getParticipantType().clear();
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
                        case TopologyPackage.PARTICIPANT_TYPES__PARTICIPANT_TYPE:
                                return participantType != null && !participantType.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //ParticipantTypesImpl
