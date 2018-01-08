/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel.impl;

import org.eclipse.bpel4chor.model.globalDataModel.DataConnectors;
import org.eclipse.bpel4chor.model.globalDataModel.DataObjects;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelImpl#getDataObjects <em>Data Objects</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.GlobalDataModelImpl#getDataConnectors <em>Data Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalDataModelImpl extends EObjectImpl implements GlobalDataModel {
	/**
	 * The cached value of the '{@link #getDataObjects() <em>Data Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjects()
	 * @generated
	 * @ordered
	 */
	protected DataObjects dataObjects;

	/**
	 * The cached value of the '{@link #getDataConnectors() <em>Data Connectors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataConnectors()
	 * @generated
	 * @ordered
	 */
	protected DataConnectors dataConnectors;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalDataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalDataModelPackage.Literals.GLOBAL_DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjects getDataObjects() {
		return dataObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataObjects(DataObjects newDataObjects, NotificationChain msgs) {
		DataObjects oldDataObjects = dataObjects;
		dataObjects = newDataObjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_OBJECTS, oldDataObjects, newDataObjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataObjects(DataObjects newDataObjects) {
		if (newDataObjects != dataObjects) {
			NotificationChain msgs = null;
			if (dataObjects != null)
				msgs = ((InternalEObject)dataObjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_OBJECTS, null, msgs);
			if (newDataObjects != null)
				msgs = ((InternalEObject)newDataObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_OBJECTS, null, msgs);
			msgs = basicSetDataObjects(newDataObjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_OBJECTS, newDataObjects, newDataObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnectors getDataConnectors() {
		return dataConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataConnectors(DataConnectors newDataConnectors, NotificationChain msgs) {
		DataConnectors oldDataConnectors = dataConnectors;
		dataConnectors = newDataConnectors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_CONNECTORS, oldDataConnectors, newDataConnectors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataConnectors(DataConnectors newDataConnectors) {
		if (newDataConnectors != dataConnectors) {
			NotificationChain msgs = null;
			if (dataConnectors != null)
				msgs = ((InternalEObject)dataConnectors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_CONNECTORS, null, msgs);
			if (newDataConnectors != null)
				msgs = ((InternalEObject)newDataConnectors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_CONNECTORS, null, msgs);
			msgs = basicSetDataConnectors(newDataConnectors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_CONNECTORS, newDataConnectors, newDataConnectors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_OBJECTS:
				return basicSetDataObjects(null, msgs);
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_CONNECTORS:
				return basicSetDataConnectors(null, msgs);
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
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_OBJECTS:
				return getDataObjects();
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_CONNECTORS:
				return getDataConnectors();
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
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_OBJECTS:
				setDataObjects((DataObjects)newValue);
				return;
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_CONNECTORS:
				setDataConnectors((DataConnectors)newValue);
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
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_OBJECTS:
				setDataObjects((DataObjects)null);
				return;
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_CONNECTORS:
				setDataConnectors((DataConnectors)null);
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
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_OBJECTS:
				return dataObjects != null;
			case GlobalDataModelPackage.GLOBAL_DATA_MODEL__DATA_CONNECTORS:
				return dataConnectors != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalDataModelImpl
