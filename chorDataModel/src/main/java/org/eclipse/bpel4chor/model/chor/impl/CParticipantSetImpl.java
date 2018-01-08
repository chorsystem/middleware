/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantSet;
import org.eclipse.bpel4chor.model.chor.ChorPackage;

import org.eclipse.bpel4chor.model.chor.ProcessInstance;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CParticipant Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantSetImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantSetImpl#getParticipantSets <em>Participant Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CParticipantSetImpl extends CParticipantCommonImpl implements CParticipantSet
{
        /**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
        protected EList<CParticipant> participants;

        /**
	 * The cached value of the '{@link #getParticipantSets() <em>Participant Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getParticipantSets()
	 * @generated
	 * @ordered
	 */
        protected EList<CParticipantSet> participantSets;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected CParticipantSetImpl()
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
		return ChorPackage.Literals.CPARTICIPANT_SET;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CParticipant> getParticipants()
        {
		if (participants == null) {
			participants = new EObjectContainmentEList<CParticipant>(CParticipant.class, this, ChorPackage.CPARTICIPANT_SET__PARTICIPANTS);
		}
		return participants;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CParticipantSet> getParticipantSets()
        {
		if (participantSets == null) {
			participantSets = new EObjectContainmentEList<CParticipantSet>(CParticipantSet.class, this, ChorPackage.CPARTICIPANT_SET__PARTICIPANT_SETS);
		}
		return participantSets;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
        {
		switch (featureID) {
			case ChorPackage.CPARTICIPANT_SET__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case ChorPackage.CPARTICIPANT_SET__PARTICIPANT_SETS:
				return ((InternalEList<?>)getParticipantSets()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case ChorPackage.CPARTICIPANT_SET__PARTICIPANTS:
				return getParticipants();
			case ChorPackage.CPARTICIPANT_SET__PARTICIPANT_SETS:
				return getParticipantSets();
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
		switch (featureID) {
			case ChorPackage.CPARTICIPANT_SET__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends CParticipant>)newValue);
				return;
			case ChorPackage.CPARTICIPANT_SET__PARTICIPANT_SETS:
				getParticipantSets().clear();
				getParticipantSets().addAll((Collection<? extends CParticipantSet>)newValue);
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
		switch (featureID) {
			case ChorPackage.CPARTICIPANT_SET__PARTICIPANTS:
				getParticipants().clear();
				return;
			case ChorPackage.CPARTICIPANT_SET__PARTICIPANT_SETS:
				getParticipantSets().clear();
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
		switch (featureID) {
			case ChorPackage.CPARTICIPANT_SET__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case ChorPackage.CPARTICIPANT_SET__PARTICIPANT_SETS:
				return participantSets != null && !participantSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CParticipantSetImpl
