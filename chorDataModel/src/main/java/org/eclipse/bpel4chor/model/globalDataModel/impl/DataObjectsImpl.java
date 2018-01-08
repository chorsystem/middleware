/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.globalDataModel.DataObject;
import org.eclipse.bpel4chor.model.globalDataModel.DataObjects;
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
 * An implementation of the model object '<em><b>Data Objects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectsImpl#getDataObject <em>Data Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataObjectsImpl extends EObjectImpl implements DataObjects {
	/**
	 * The cached value of the '{@link #getDataObject() <em>Data Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObject()
	 * @generated
	 * @ordered
	 */
	protected EList<DataObject> dataObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataObjectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalDataModelPackage.Literals.DATA_OBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObject> getDataObject() {
		if (dataObject == null) {
			dataObject = new EObjectContainmentEList<DataObject>(DataObject.class, this, GlobalDataModelPackage.DATA_OBJECTS__DATA_OBJECT);
		}
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalDataModelPackage.DATA_OBJECTS__DATA_OBJECT:
				return ((InternalEList<?>)getDataObject()).basicRemove(otherEnd, msgs);
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
			case GlobalDataModelPackage.DATA_OBJECTS__DATA_OBJECT:
				return getDataObject();
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
			case GlobalDataModelPackage.DATA_OBJECTS__DATA_OBJECT:
				getDataObject().clear();
				getDataObject().addAll((Collection<? extends DataObject>)newValue);
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
			case GlobalDataModelPackage.DATA_OBJECTS__DATA_OBJECT:
				getDataObject().clear();
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
			case GlobalDataModelPackage.DATA_OBJECTS__DATA_OBJECT:
				return dataObject != null && !dataObject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataObjectsImpl
