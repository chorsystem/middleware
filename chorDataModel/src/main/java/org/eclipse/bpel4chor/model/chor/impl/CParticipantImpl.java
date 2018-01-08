/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantCommon;
import org.eclipse.bpel4chor.model.chor.ChorPackage;
import org.eclipse.bpel4chor.model.chor.PContainment;

import org.eclipse.bpel4chor.model.chor.ProcessInstance;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CParticipant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantImpl#getSelects <em>Selects</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CParticipantImpl extends CParticipantCommonImpl implements CParticipant
{
        /**
	 * The default value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
        protected static final PContainment CONTAINMENT_EDEFAULT = PContainment.ADDIFNOTEXISTS;

        /**
	 * The cached value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
        protected PContainment containment = CONTAINMENT_EDEFAULT;

        /**
	 * The cached value of the '{@link #getSelects() <em>Selects</em>}' reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getSelects()
	 * @generated
	 * @ordered
	 */
        protected EList<CParticipantCommon> selects;

        /**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessInstance> instances;

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected CParticipantImpl()
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
		return ChorPackage.Literals.CPARTICIPANT;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public PContainment getContainment()
        {
		return containment;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setContainment(PContainment newContainment)
        {
		PContainment oldContainment = containment;
		containment = newContainment == null ? CONTAINMENT_EDEFAULT : newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CPARTICIPANT__CONTAINMENT, oldContainment, containment));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CParticipantCommon> getSelects()
        {
		if (selects == null) {
			selects = new EObjectResolvingEList<CParticipantCommon>(CParticipantCommon.class, this, ChorPackage.CPARTICIPANT__SELECTS);
		}
		return selects;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectResolvingEList<ProcessInstance>(ProcessInstance.class, this, ChorPackage.CPARTICIPANT__INSTANCES);
		}
		return instances;
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
			case ChorPackage.CPARTICIPANT__CONTAINMENT:
				return getContainment();
			case ChorPackage.CPARTICIPANT__SELECTS:
				return getSelects();
			case ChorPackage.CPARTICIPANT__INSTANCES:
				return getInstances();
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
			case ChorPackage.CPARTICIPANT__CONTAINMENT:
				setContainment((PContainment)newValue);
				return;
			case ChorPackage.CPARTICIPANT__SELECTS:
				getSelects().clear();
				getSelects().addAll((Collection<? extends CParticipantCommon>)newValue);
				return;
			case ChorPackage.CPARTICIPANT__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ProcessInstance>)newValue);
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
			case ChorPackage.CPARTICIPANT__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case ChorPackage.CPARTICIPANT__SELECTS:
				getSelects().clear();
				return;
			case ChorPackage.CPARTICIPANT__INSTANCES:
				getInstances().clear();
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
			case ChorPackage.CPARTICIPANT__CONTAINMENT:
				return containment != CONTAINMENT_EDEFAULT;
			case ChorPackage.CPARTICIPANT__SELECTS:
				return selects != null && !selects.isEmpty();
			case ChorPackage.CPARTICIPANT__INSTANCES:
				return instances != null && !instances.isEmpty();
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
		result.append(" (containment: ");
		result.append(containment);
		result.append(')');
		return result.toString();
	}

} //CParticipantImpl
