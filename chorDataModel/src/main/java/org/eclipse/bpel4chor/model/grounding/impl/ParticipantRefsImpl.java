/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.grounding.GroundingPackage;
import org.eclipse.bpel4chor.model.grounding.ParticipantRef;
import org.eclipse.bpel4chor.model.grounding.ParticipantRefs;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Refs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.ParticipantRefsImpl#getParticipantRef <em>Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantRefsImpl extends EObjectImpl implements ParticipantRefs
{
        /**
         * The cached value of the '{@link #getParticipantRef() <em>Participant Ref</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipantRef()
         * @generated
         * @ordered
         */
        protected EList<ParticipantRef> participantRef;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ParticipantRefsImpl()
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
                return GroundingPackage.Literals.PARTICIPANT_REFS;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<ParticipantRef> getParticipantRef()
        {
                if (participantRef == null)
                {
                        participantRef = new EObjectContainmentEList<ParticipantRef>(ParticipantRef.class, this, GroundingPackage.PARTICIPANT_REFS__PARTICIPANT_REF);
                }
                return participantRef;
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
                        case GroundingPackage.PARTICIPANT_REFS__PARTICIPANT_REF:
                                return ((InternalEList<?>)getParticipantRef()).basicRemove(otherEnd, msgs);
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
                        case GroundingPackage.PARTICIPANT_REFS__PARTICIPANT_REF:
                                return getParticipantRef();
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
                        case GroundingPackage.PARTICIPANT_REFS__PARTICIPANT_REF:
                                getParticipantRef().clear();
                                getParticipantRef().addAll((Collection<? extends ParticipantRef>)newValue);
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
                        case GroundingPackage.PARTICIPANT_REFS__PARTICIPANT_REF:
                                getParticipantRef().clear();
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
                        case GroundingPackage.PARTICIPANT_REFS__PARTICIPANT_REF:
                                return participantRef != null && !participantRef.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //ParticipantRefsImpl
