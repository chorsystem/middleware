/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.pbd.Assign;
import org.eclipse.bpel4chor.model.pbd.Copy;
import org.eclipse.bpel4chor.model.pbd.ExtensionAssignOperation;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.AssignImpl#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.AssignImpl#getExtensionAssignOperation <em>Extension Assign Operation</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.AssignImpl#getValidate <em>Validate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignImpl extends ActivityImpl implements Assign {
	/**
	 * The cached value of the '{@link #getCopy() <em>Copy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopy()
	 * @generated
	 * @ordered
	 */
	protected EList<Copy> copy;

	/**
	 * The cached value of the '{@link #getExtensionAssignOperation() <em>Extension Assign Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionAssignOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionAssignOperation> extensionAssignOperation;

	/**
	 * The default value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.bpel4chor.model.pbd.Boolean VALIDATE_EDEFAULT = org.eclipse.bpel4chor.model.pbd.Boolean.NO;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel4chor.model.pbd.Boolean validate = VALIDATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Copy> getCopy() {
		if (copy == null) {
			copy = new EObjectContainmentEList<Copy>(Copy.class, this, PbdPackage.ASSIGN__COPY);
		}
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionAssignOperation> getExtensionAssignOperation() {
		if (extensionAssignOperation == null) {
			extensionAssignOperation = new EObjectContainmentEList<ExtensionAssignOperation>(ExtensionAssignOperation.class, this, PbdPackage.ASSIGN__EXTENSION_ASSIGN_OPERATION);
		}
		return extensionAssignOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean getValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidate(org.eclipse.bpel4chor.model.pbd.Boolean newValidate) {
		org.eclipse.bpel4chor.model.pbd.Boolean oldValidate = validate;
		validate = newValidate == null ? VALIDATE_EDEFAULT : newValidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.ASSIGN__VALIDATE, oldValidate, validate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.ASSIGN__COPY:
				return ((InternalEList<?>)getCopy()).basicRemove(otherEnd, msgs);
			case PbdPackage.ASSIGN__EXTENSION_ASSIGN_OPERATION:
				return ((InternalEList<?>)getExtensionAssignOperation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PbdPackage.ASSIGN__COPY:
				return getCopy();
			case PbdPackage.ASSIGN__EXTENSION_ASSIGN_OPERATION:
				return getExtensionAssignOperation();
			case PbdPackage.ASSIGN__VALIDATE:
				return getValidate();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PbdPackage.ASSIGN__COPY:
				getCopy().clear();
				getCopy().addAll((Collection<? extends Copy>)newValue);
				return;
			case PbdPackage.ASSIGN__EXTENSION_ASSIGN_OPERATION:
				getExtensionAssignOperation().clear();
				getExtensionAssignOperation().addAll((Collection<? extends ExtensionAssignOperation>)newValue);
				return;
			case PbdPackage.ASSIGN__VALIDATE:
				setValidate((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
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
			case PbdPackage.ASSIGN__COPY:
				getCopy().clear();
				return;
			case PbdPackage.ASSIGN__EXTENSION_ASSIGN_OPERATION:
				getExtensionAssignOperation().clear();
				return;
			case PbdPackage.ASSIGN__VALIDATE:
				setValidate(VALIDATE_EDEFAULT);
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
			case PbdPackage.ASSIGN__COPY:
				return copy != null && !copy.isEmpty();
			case PbdPackage.ASSIGN__EXTENSION_ASSIGN_OPERATION:
				return extensionAssignOperation != null && !extensionAssignOperation.isEmpty();
			case PbdPackage.ASSIGN__VALIDATE:
				return validate != VALIDATE_EDEFAULT;
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
		result.append(" (validate: ");
		result.append(validate);
		result.append(')');
		return result.toString();
	}

} //AssignImpl
