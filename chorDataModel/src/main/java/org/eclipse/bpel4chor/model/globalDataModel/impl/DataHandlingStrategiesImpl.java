/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategies;
import org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy;
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
 * An implementation of the model object '<em><b>Data Handling Strategies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategiesImpl#getDataHandlingStrategy <em>Data Handling Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataHandlingStrategiesImpl extends EObjectImpl implements DataHandlingStrategies {
	/**
	 * The cached value of the '{@link #getDataHandlingStrategy() <em>Data Handling Strategy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataHandlingStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<DataHandlingStrategy> dataHandlingStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataHandlingStrategiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalDataModelPackage.Literals.DATA_HANDLING_STRATEGIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataHandlingStrategy> getDataHandlingStrategy() {
		if (dataHandlingStrategy == null) {
			dataHandlingStrategy = new EObjectContainmentEList<DataHandlingStrategy>(DataHandlingStrategy.class, this, GlobalDataModelPackage.DATA_HANDLING_STRATEGIES__DATA_HANDLING_STRATEGY);
		}
		return dataHandlingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGIES__DATA_HANDLING_STRATEGY:
				return ((InternalEList<?>)getDataHandlingStrategy()).basicRemove(otherEnd, msgs);
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
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGIES__DATA_HANDLING_STRATEGY:
				return getDataHandlingStrategy();
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
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGIES__DATA_HANDLING_STRATEGY:
				getDataHandlingStrategy().clear();
				getDataHandlingStrategy().addAll((Collection<? extends DataHandlingStrategy>)newValue);
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
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGIES__DATA_HANDLING_STRATEGY:
				getDataHandlingStrategy().clear();
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
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGIES__DATA_HANDLING_STRATEGY:
				return dataHandlingStrategy != null && !dataHandlingStrategy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataHandlingStrategiesImpl
