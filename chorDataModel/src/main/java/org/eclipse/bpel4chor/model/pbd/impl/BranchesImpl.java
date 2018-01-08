/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import org.eclipse.bpel4chor.model.pbd.Branches;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branches</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.BranchesImpl#getSuccessfulBranchesOnly <em>Successful Branches Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchesImpl extends ExpressionImpl implements Branches {
	/**
	 * The default value of the '{@link #getSuccessfulBranchesOnly() <em>Successful Branches Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessfulBranchesOnly()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.bpel4chor.model.pbd.Boolean SUCCESSFUL_BRANCHES_ONLY_EDEFAULT = org.eclipse.bpel4chor.model.pbd.Boolean.NO;

	/**
	 * The cached value of the '{@link #getSuccessfulBranchesOnly() <em>Successful Branches Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessfulBranchesOnly()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel4chor.model.pbd.Boolean successfulBranchesOnly = SUCCESSFUL_BRANCHES_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.BRANCHES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean getSuccessfulBranchesOnly() {
		return successfulBranchesOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessfulBranchesOnly(org.eclipse.bpel4chor.model.pbd.Boolean newSuccessfulBranchesOnly) {
		org.eclipse.bpel4chor.model.pbd.Boolean oldSuccessfulBranchesOnly = successfulBranchesOnly;
		successfulBranchesOnly = newSuccessfulBranchesOnly == null ? SUCCESSFUL_BRANCHES_ONLY_EDEFAULT : newSuccessfulBranchesOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY, oldSuccessfulBranchesOnly, successfulBranchesOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PbdPackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY:
				return getSuccessfulBranchesOnly();
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
			case PbdPackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY:
				setSuccessfulBranchesOnly((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
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
			case PbdPackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY:
				setSuccessfulBranchesOnly(SUCCESSFUL_BRANCHES_ONLY_EDEFAULT);
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
			case PbdPackage.BRANCHES__SUCCESSFUL_BRANCHES_ONLY:
				return successfulBranchesOnly != SUCCESSFUL_BRANCHES_ONLY_EDEFAULT;
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
		result.append(" (successfulBranchesOnly: ");
		result.append(successfulBranchesOnly);
		result.append(')');
		return result.toString();
	}

} //BranchesImpl
