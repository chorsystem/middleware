/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common.impl;

import org.eclipse.bpel4chor.model.chor.common.CommonPackage;
import org.eclipse.bpel4chor.model.chor.common.LoopElementInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Element Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.LoopElementInstanceImpl#getLoopCounter <em>Loop Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopElementInstanceImpl extends ExtElementsElementInstanceImpl implements LoopElementInstance {
	/**
	 * The default value of the '{@link #getLoopCounter() <em>Loop Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCounter()
	 * @generated
	 * @ordered
	 */
	protected static final long LOOP_COUNTER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLoopCounter() <em>Loop Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCounter()
	 * @generated
	 * @ordered
	 */
	protected long loopCounter = LOOP_COUNTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopElementInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.LOOP_ELEMENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLoopCounter() {
		return loopCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCounter(long newLoopCounter) {
		long oldLoopCounter = loopCounter;
		loopCounter = newLoopCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOOP_ELEMENT_INSTANCE__LOOP_COUNTER, oldLoopCounter, loopCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.LOOP_ELEMENT_INSTANCE__LOOP_COUNTER:
				return getLoopCounter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.LOOP_ELEMENT_INSTANCE__LOOP_COUNTER:
				setLoopCounter((Long)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommonPackage.LOOP_ELEMENT_INSTANCE__LOOP_COUNTER:
				setLoopCounter(LOOP_COUNTER_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommonPackage.LOOP_ELEMENT_INSTANCE__LOOP_COUNTER:
				return loopCounter != LOOP_COUNTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (loopCounter: ");
		result.append(loopCounter);
		result.append(')');
		return result.toString();
	}

} //LoopElementInstanceImpl
