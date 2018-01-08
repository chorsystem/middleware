/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import org.eclipse.bpel4chor.model.pbd.FromPart;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.FromPartImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.FromPartImpl#getToVariable <em>To Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FromPartImpl extends ExtensibleElementsImpl implements FromPart {
	/**
	 * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected String part = PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getToVariable() <em>To Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToVariable() <em>To Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToVariable()
	 * @generated
	 * @ordered
	 */
	protected String toVariable = TO_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.FROM_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPart() {
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPart(String newPart) {
		String oldPart = part;
		part = newPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.FROM_PART__PART, oldPart, part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToVariable() {
		return toVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToVariable(String newToVariable) {
		String oldToVariable = toVariable;
		toVariable = newToVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.FROM_PART__TO_VARIABLE, oldToVariable, toVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PbdPackage.FROM_PART__PART:
				return getPart();
			case PbdPackage.FROM_PART__TO_VARIABLE:
				return getToVariable();
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
			case PbdPackage.FROM_PART__PART:
				setPart((String)newValue);
				return;
			case PbdPackage.FROM_PART__TO_VARIABLE:
				setToVariable((String)newValue);
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
			case PbdPackage.FROM_PART__PART:
				setPart(PART_EDEFAULT);
				return;
			case PbdPackage.FROM_PART__TO_VARIABLE:
				setToVariable(TO_VARIABLE_EDEFAULT);
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
			case PbdPackage.FROM_PART__PART:
				return PART_EDEFAULT == null ? part != null : !PART_EDEFAULT.equals(part);
			case PbdPackage.FROM_PART__TO_VARIABLE:
				return TO_VARIABLE_EDEFAULT == null ? toVariable != null : !TO_VARIABLE_EDEFAULT.equals(toVariable);
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
		result.append(" (part: ");
		result.append(part);
		result.append(", toVariable: ");
		result.append(toVariable);
		result.append(')');
		return result.toString();
	}

} //FromPartImpl
