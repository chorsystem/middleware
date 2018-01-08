/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.globalDataModel.DataMapping;
import org.eclipse.bpel4chor.model.globalDataModel.DataMappings;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataMappingsImpl#getDataMapping <em>Data Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataMappingsImpl extends EObjectImpl implements DataMappings {
	/**
	 * The cached value of the '{@link #getDataMapping() <em>Data Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<DataMapping> dataMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalDataModelPackage.Literals.DATA_MAPPINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataMapping> getDataMapping() {
		if (dataMapping == null) {
			dataMapping = new EObjectContainmentEList<DataMapping>(DataMapping.class, this, GlobalDataModelPackage.DATA_MAPPINGS__DATA_MAPPING);
		}
		return dataMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalDataModelPackage.DATA_MAPPINGS__DATA_MAPPING:
				return ((InternalEList<?>)getDataMapping()).basicRemove(otherEnd, msgs);
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
			case GlobalDataModelPackage.DATA_MAPPINGS__DATA_MAPPING:
				return getDataMapping();
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
			case GlobalDataModelPackage.DATA_MAPPINGS__DATA_MAPPING:
				getDataMapping().clear();
				getDataMapping().addAll((Collection<? extends DataMapping>)newValue);
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
			case GlobalDataModelPackage.DATA_MAPPINGS__DATA_MAPPING:
				getDataMapping().clear();
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
			case GlobalDataModelPackage.DATA_MAPPINGS__DATA_MAPPING:
				return dataMapping != null && !dataMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataMappingsImpl
