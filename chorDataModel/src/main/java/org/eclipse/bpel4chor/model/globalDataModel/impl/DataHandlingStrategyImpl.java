/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel.impl;

import org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage;
import org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType;
import org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Handling Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategyImpl#getTransferStrategy <em>Transfer Strategy</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataHandlingStrategyImpl#getTransformationStrategy <em>Transformation Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataHandlingStrategyImpl extends EObjectImpl implements DataHandlingStrategy {
	/**
	 * The default value of the '{@link #getTransferStrategy() <em>Transfer Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final TransferStrategyType TRANSFER_STRATEGY_EDEFAULT = TransferStrategyType.ON_DEMAND;

	/**
	 * The cached value of the '{@link #getTransferStrategy() <em>Transfer Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferStrategy()
	 * @generated
	 * @ordered
	 */
	protected TransferStrategyType transferStrategy = TRANSFER_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformationStrategy() <em>Transformation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final TransformationStrategyType TRANSFORMATION_STRATEGY_EDEFAULT = TransformationStrategyType.ON_DEMAND;

	/**
	 * The cached value of the '{@link #getTransformationStrategy() <em>Transformation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationStrategy()
	 * @generated
	 * @ordered
	 */
	protected TransformationStrategyType transformationStrategy = TRANSFORMATION_STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataHandlingStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalDataModelPackage.Literals.DATA_HANDLING_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferStrategyType getTransferStrategy() {
		return transferStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferStrategy(TransferStrategyType newTransferStrategy) {
		TransferStrategyType oldTransferStrategy = transferStrategy;
		transferStrategy = newTransferStrategy == null ? TRANSFER_STRATEGY_EDEFAULT : newTransferStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_HANDLING_STRATEGY__TRANSFER_STRATEGY, oldTransferStrategy, transferStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationStrategyType getTransformationStrategy() {
		return transformationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationStrategy(TransformationStrategyType newTransformationStrategy) {
		TransformationStrategyType oldTransformationStrategy = transformationStrategy;
		transformationStrategy = newTransformationStrategy == null ? TRANSFORMATION_STRATEGY_EDEFAULT : newTransformationStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_HANDLING_STRATEGY__TRANSFORMATION_STRATEGY, oldTransformationStrategy, transformationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGY__TRANSFER_STRATEGY:
				return getTransferStrategy();
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGY__TRANSFORMATION_STRATEGY:
				return getTransformationStrategy();
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
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGY__TRANSFER_STRATEGY:
				setTransferStrategy((TransferStrategyType)newValue);
				return;
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGY__TRANSFORMATION_STRATEGY:
				setTransformationStrategy((TransformationStrategyType)newValue);
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
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGY__TRANSFER_STRATEGY:
				setTransferStrategy(TRANSFER_STRATEGY_EDEFAULT);
				return;
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGY__TRANSFORMATION_STRATEGY:
				setTransformationStrategy(TRANSFORMATION_STRATEGY_EDEFAULT);
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
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGY__TRANSFER_STRATEGY:
				return transferStrategy != TRANSFER_STRATEGY_EDEFAULT;
			case GlobalDataModelPackage.DATA_HANDLING_STRATEGY__TRANSFORMATION_STRATEGY:
				return transformationStrategy != TRANSFORMATION_STRATEGY_EDEFAULT;
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
		result.append(" (transferStrategy: ");
		result.append(transferStrategy);
		result.append(", transformationStrategy: ");
		result.append(transformationStrategy);
		result.append(')');
		return result.toString();
	}

} //DataHandlingStrategyImpl
