/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantSet;
import org.eclipse.bpel4chor.model.chor.ChorPackage;
import org.eclipse.bpel4chor.model.chor.ForEachIterationSpec;

import org.eclipse.bpel4chor.model.pbd.ForEach;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each Iteration Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ForEachIterationSpecImpl#getIteratorSet <em>Iterator Set</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ForEachIterationSpecImpl#getIteratorValue <em>Iterator Value</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ForEachIterationSpecImpl#getForEach <em>For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachIterationSpecImpl extends EObjectImpl implements ForEachIterationSpec
{
        /**
	 * The cached value of the '{@link #getIteratorSet() <em>Iterator Set</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getIteratorSet()
	 * @generated
	 * @ordered
	 */
        protected CParticipantSet iteratorSet;

        /**
	 * The cached value of the '{@link #getIteratorValue() <em>Iterator Value</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getIteratorValue()
	 * @generated
	 * @ordered
	 */
        protected CParticipant iteratorValue;

        /**
	 * The cached value of the '{@link #getForEach() <em>For Each</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getForEach()
	 * @generated
	 * @ordered
	 */
        protected ForEach forEach;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected ForEachIterationSpecImpl()
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
		return ChorPackage.Literals.FOR_EACH_ITERATION_SPEC;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipantSet getIteratorSet()
        {
		if (iteratorSet != null && iteratorSet.eIsProxy()) {
			InternalEObject oldIteratorSet = (InternalEObject)iteratorSet;
			iteratorSet = (CParticipantSet)eResolveProxy(oldIteratorSet);
			if (iteratorSet != oldIteratorSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_SET, oldIteratorSet, iteratorSet));
			}
		}
		return iteratorSet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipantSet basicGetIteratorSet()
        {
		return iteratorSet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setIteratorSet(CParticipantSet newIteratorSet)
        {
		CParticipantSet oldIteratorSet = iteratorSet;
		iteratorSet = newIteratorSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_SET, oldIteratorSet, iteratorSet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipant getIteratorValue()
        {
		if (iteratorValue != null && iteratorValue.eIsProxy()) {
			InternalEObject oldIteratorValue = (InternalEObject)iteratorValue;
			iteratorValue = (CParticipant)eResolveProxy(oldIteratorValue);
			if (iteratorValue != oldIteratorValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_VALUE, oldIteratorValue, iteratorValue));
			}
		}
		return iteratorValue;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipant basicGetIteratorValue()
        {
		return iteratorValue;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setIteratorValue(CParticipant newIteratorValue)
        {
		CParticipant oldIteratorValue = iteratorValue;
		iteratorValue = newIteratorValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_VALUE, oldIteratorValue, iteratorValue));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ForEach getForEach()
        {
		if (forEach != null && forEach.eIsProxy()) {
			InternalEObject oldForEach = (InternalEObject)forEach;
			forEach = (ForEach)eResolveProxy(oldForEach);
			if (forEach != oldForEach) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.FOR_EACH_ITERATION_SPEC__FOR_EACH, oldForEach, forEach));
			}
		}
		return forEach;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ForEach basicGetForEach()
        {
		return forEach;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setForEach(ForEach newForEach)
        {
		ForEach oldForEach = forEach;
		forEach = newForEach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FOR_EACH_ITERATION_SPEC__FOR_EACH, oldForEach, forEach));
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
			case ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_SET:
				if (resolve) return getIteratorSet();
				return basicGetIteratorSet();
			case ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_VALUE:
				if (resolve) return getIteratorValue();
				return basicGetIteratorValue();
			case ChorPackage.FOR_EACH_ITERATION_SPEC__FOR_EACH:
				if (resolve) return getForEach();
				return basicGetForEach();
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
		switch (featureID) {
			case ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_SET:
				setIteratorSet((CParticipantSet)newValue);
				return;
			case ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_VALUE:
				setIteratorValue((CParticipant)newValue);
				return;
			case ChorPackage.FOR_EACH_ITERATION_SPEC__FOR_EACH:
				setForEach((ForEach)newValue);
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
			case ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_SET:
				setIteratorSet((CParticipantSet)null);
				return;
			case ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_VALUE:
				setIteratorValue((CParticipant)null);
				return;
			case ChorPackage.FOR_EACH_ITERATION_SPEC__FOR_EACH:
				setForEach((ForEach)null);
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
			case ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_SET:
				return iteratorSet != null;
			case ChorPackage.FOR_EACH_ITERATION_SPEC__ITERATOR_VALUE:
				return iteratorValue != null;
			case ChorPackage.FOR_EACH_ITERATION_SPEC__FOR_EACH:
				return forEach != null;
		}
		return super.eIsSet(featureID);
	}

} //ForEachIterationSpecImpl
