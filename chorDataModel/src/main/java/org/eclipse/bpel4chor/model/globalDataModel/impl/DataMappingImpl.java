/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel.impl;

import org.eclipse.bpel4chor.model.globalDataModel.DataMapping;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingImpl#getSourceSelector <em>Source Selector</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingImpl#getTargetSelector <em>Target Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataMappingImpl extends EObjectImpl implements DataMapping {
	/**
	 * The default value of the '{@link #getSourceSelector() <em>Source Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceSelector() <em>Source Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSelector()
	 * @generated
	 * @ordered
	 */
	protected String sourceSelector = SOURCE_SELECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetSelector() <em>Target Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetSelector() <em>Target Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSelector()
	 * @generated
	 * @ordered
	 */
	protected String targetSelector = TARGET_SELECTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalDataModelPackage.Literals.DATA_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceSelector() {
		return sourceSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSelector(String newSourceSelector) {
		String oldSourceSelector = sourceSelector;
		sourceSelector = newSourceSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_MAPPING__SOURCE_SELECTOR, oldSourceSelector, sourceSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetSelector() {
		return targetSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSelector(String newTargetSelector) {
		String oldTargetSelector = targetSelector;
		targetSelector = newTargetSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_MAPPING__TARGET_SELECTOR, oldTargetSelector, targetSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlobalDataModelPackage.DATA_MAPPING__SOURCE_SELECTOR:
				return getSourceSelector();
			case GlobalDataModelPackage.DATA_MAPPING__TARGET_SELECTOR:
				return getTargetSelector();
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
			case GlobalDataModelPackage.DATA_MAPPING__SOURCE_SELECTOR:
				setSourceSelector((String)newValue);
				return;
			case GlobalDataModelPackage.DATA_MAPPING__TARGET_SELECTOR:
				setTargetSelector((String)newValue);
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
			case GlobalDataModelPackage.DATA_MAPPING__SOURCE_SELECTOR:
				setSourceSelector(SOURCE_SELECTOR_EDEFAULT);
				return;
			case GlobalDataModelPackage.DATA_MAPPING__TARGET_SELECTOR:
				setTargetSelector(TARGET_SELECTOR_EDEFAULT);
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
			case GlobalDataModelPackage.DATA_MAPPING__SOURCE_SELECTOR:
				return SOURCE_SELECTOR_EDEFAULT == null ? sourceSelector != null : !SOURCE_SELECTOR_EDEFAULT.equals(sourceSelector);
			case GlobalDataModelPackage.DATA_MAPPING__TARGET_SELECTOR:
				return TARGET_SELECTOR_EDEFAULT == null ? targetSelector != null : !TARGET_SELECTOR_EDEFAULT.equals(targetSelector);
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
		result.append(" (sourceSelector: ");
		result.append(sourceSelector);
		result.append(", targetSelector: ");
		result.append(targetSelector);
		result.append(')');
		return result.toString();
	}

} //DataMappingImpl
