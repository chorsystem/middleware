/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.topology.Participant;
import org.eclipse.bpel4chor.model.topology.ParticipantSet;
import org.eclipse.bpel4chor.model.topology.Participants;
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
 * An implementation of the model object '<em><b>Participants</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantsImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantsImpl#getParticipantSet <em>Participant Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantsImpl extends EObjectImpl implements Participants
{
        /**
         * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipant()
         * @generated
         * @ordered
         */
        protected EList<Participant> participant;

        /**
         * The cached value of the '{@link #getParticipantSet() <em>Participant Set</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipantSet()
         * @generated
         * @ordered
         */
        protected EList<ParticipantSet> participantSet;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ParticipantsImpl()
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
                return TopologyPackage.Literals.PARTICIPANTS;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Participant> getParticipant()
        {
                if (participant == null)
                {
                        participant = new EObjectContainmentEList<Participant>(Participant.class, this, TopologyPackage.PARTICIPANTS__PARTICIPANT);
                }
                return participant;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<ParticipantSet> getParticipantSet()
        {
                if (participantSet == null)
                {
                        participantSet = new EObjectContainmentEList<ParticipantSet>(ParticipantSet.class, this, TopologyPackage.PARTICIPANTS__PARTICIPANT_SET);
                }
                return participantSet;
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
                        case TopologyPackage.PARTICIPANTS__PARTICIPANT:
                                return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
                        case TopologyPackage.PARTICIPANTS__PARTICIPANT_SET:
                                return ((InternalEList<?>)getParticipantSet()).basicRemove(otherEnd, msgs);
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
                        case TopologyPackage.PARTICIPANTS__PARTICIPANT:
                                return getParticipant();
                        case TopologyPackage.PARTICIPANTS__PARTICIPANT_SET:
                                return getParticipantSet();
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
                        case TopologyPackage.PARTICIPANTS__PARTICIPANT:
                                getParticipant().clear();
                                getParticipant().addAll((Collection<? extends Participant>)newValue);
                                return;
                        case TopologyPackage.PARTICIPANTS__PARTICIPANT_SET:
                                getParticipantSet().clear();
                                getParticipantSet().addAll((Collection<? extends ParticipantSet>)newValue);
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
                        case TopologyPackage.PARTICIPANTS__PARTICIPANT:
                                getParticipant().clear();
                                return;
                        case TopologyPackage.PARTICIPANTS__PARTICIPANT_SET:
                                getParticipantSet().clear();
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
                        case TopologyPackage.PARTICIPANTS__PARTICIPANT:
                                return participant != null && !participant.isEmpty();
                        case TopologyPackage.PARTICIPANTS__PARTICIPANT_SET:
                                return participantSet != null && !participantSet.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //ParticipantsImpl
