/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel.impl;

import org.eclipse.bpel4chor.model.globalDataModel.DataConnectors;
import org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategies;
import org.eclipse.bpel4chor.model.globalDataModel.DataObject;
import org.eclipse.bpel4chor.model.globalDataModel.DataObjectMetadata;
import org.eclipse.bpel4chor.model.globalDataModel.DataObjectType;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.xsd.XSDTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl#getStructuralDefinition <em>Structural Definition</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataObjectImpl#getDataHandlingStrategies <em>Data Handling Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataObjectImpl extends EObjectImpl implements DataObject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DataObjectType TYPE_EDEFAULT = DataObjectType.DEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataObjectType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructuralDefinition() <em>Structural Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDTypeDefinition structuralDefinition;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected DataObjectMetadata metaData;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected DataConnectors incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected DataConnectors outgoing;

	/**
	 * The cached value of the '{@link #getDataHandlingStrategies() <em>Data Handling Strategies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataHandlingStrategies()
	 * @generated
	 * @ordered
	 */
	protected DataHandlingStrategies dataHandlingStrategies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalDataModelPackage.Literals.DATA_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataObjectType newType) {
		DataObjectType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition getStructuralDefinition() {
		if (structuralDefinition != null && structuralDefinition.eIsProxy()) {
			InternalEObject oldStructuralDefinition = (InternalEObject)structuralDefinition;
			structuralDefinition = (XSDTypeDefinition)eResolveProxy(oldStructuralDefinition);
			if (structuralDefinition != oldStructuralDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalDataModelPackage.DATA_OBJECT__STRUCTURAL_DEFINITION, oldStructuralDefinition, structuralDefinition));
			}
		}
		return structuralDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition basicGetStructuralDefinition() {
		return structuralDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralDefinition(XSDTypeDefinition newStructuralDefinition) {
		XSDTypeDefinition oldStructuralDefinition = structuralDefinition;
		structuralDefinition = newStructuralDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_OBJECT__STRUCTURAL_DEFINITION, oldStructuralDefinition, structuralDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectMetadata getMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaData(DataObjectMetadata newMetaData, NotificationChain msgs) {
		DataObjectMetadata oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_OBJECT__META_DATA, oldMetaData, newMetaData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(DataObjectMetadata newMetaData) {
		if (newMetaData != metaData) {
			NotificationChain msgs = null;
			if (metaData != null)
				msgs = ((InternalEObject)metaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalDataModelPackage.DATA_OBJECT__META_DATA, null, msgs);
			if (newMetaData != null)
				msgs = ((InternalEObject)newMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalDataModelPackage.DATA_OBJECT__META_DATA, null, msgs);
			msgs = basicSetMetaData(newMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_OBJECT__META_DATA, newMetaData, newMetaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnectors getIncoming() {
		if (incoming != null && incoming.eIsProxy()) {
			InternalEObject oldIncoming = (InternalEObject)incoming;
			incoming = (DataConnectors)eResolveProxy(oldIncoming);
			if (incoming != oldIncoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalDataModelPackage.DATA_OBJECT__INCOMING, oldIncoming, incoming));
			}
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnectors basicGetIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(DataConnectors newIncoming) {
		DataConnectors oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_OBJECT__INCOMING, oldIncoming, incoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnectors getOutgoing() {
		if (outgoing != null && outgoing.eIsProxy()) {
			InternalEObject oldOutgoing = (InternalEObject)outgoing;
			outgoing = (DataConnectors)eResolveProxy(oldOutgoing);
			if (outgoing != oldOutgoing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalDataModelPackage.DATA_OBJECT__OUTGOING, oldOutgoing, outgoing));
			}
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnectors basicGetOutgoing() {
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoing(DataConnectors newOutgoing) {
		DataConnectors oldOutgoing = outgoing;
		outgoing = newOutgoing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_OBJECT__OUTGOING, oldOutgoing, outgoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataHandlingStrategies getDataHandlingStrategies() {
		if (dataHandlingStrategies != null && dataHandlingStrategies.eIsProxy()) {
			InternalEObject oldDataHandlingStrategies = (InternalEObject)dataHandlingStrategies;
			dataHandlingStrategies = (DataHandlingStrategies)eResolveProxy(oldDataHandlingStrategies);
			if (dataHandlingStrategies != oldDataHandlingStrategies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalDataModelPackage.DATA_OBJECT__DATA_HANDLING_STRATEGIES, oldDataHandlingStrategies, dataHandlingStrategies));
			}
		}
		return dataHandlingStrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataHandlingStrategies basicGetDataHandlingStrategies() {
		return dataHandlingStrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataHandlingStrategies(DataHandlingStrategies newDataHandlingStrategies) {
		DataHandlingStrategies oldDataHandlingStrategies = dataHandlingStrategies;
		dataHandlingStrategies = newDataHandlingStrategies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_OBJECT__DATA_HANDLING_STRATEGIES, oldDataHandlingStrategies, dataHandlingStrategies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalDataModelPackage.DATA_OBJECT__META_DATA:
				return basicSetMetaData(null, msgs);
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
			case GlobalDataModelPackage.DATA_OBJECT__NAME:
				return getName();
			case GlobalDataModelPackage.DATA_OBJECT__TYPE:
				return getType();
			case GlobalDataModelPackage.DATA_OBJECT__STRUCTURAL_DEFINITION:
				if (resolve) return getStructuralDefinition();
				return basicGetStructuralDefinition();
			case GlobalDataModelPackage.DATA_OBJECT__META_DATA:
				return getMetaData();
			case GlobalDataModelPackage.DATA_OBJECT__INCOMING:
				if (resolve) return getIncoming();
				return basicGetIncoming();
			case GlobalDataModelPackage.DATA_OBJECT__OUTGOING:
				if (resolve) return getOutgoing();
				return basicGetOutgoing();
			case GlobalDataModelPackage.DATA_OBJECT__DATA_HANDLING_STRATEGIES:
				if (resolve) return getDataHandlingStrategies();
				return basicGetDataHandlingStrategies();
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
			case GlobalDataModelPackage.DATA_OBJECT__NAME:
				setName((String)newValue);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__TYPE:
				setType((DataObjectType)newValue);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__STRUCTURAL_DEFINITION:
				setStructuralDefinition((XSDTypeDefinition)newValue);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__META_DATA:
				setMetaData((DataObjectMetadata)newValue);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__INCOMING:
				setIncoming((DataConnectors)newValue);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__OUTGOING:
				setOutgoing((DataConnectors)newValue);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__DATA_HANDLING_STRATEGIES:
				setDataHandlingStrategies((DataHandlingStrategies)newValue);
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
			case GlobalDataModelPackage.DATA_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__STRUCTURAL_DEFINITION:
				setStructuralDefinition((XSDTypeDefinition)null);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__META_DATA:
				setMetaData((DataObjectMetadata)null);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__INCOMING:
				setIncoming((DataConnectors)null);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__OUTGOING:
				setOutgoing((DataConnectors)null);
				return;
			case GlobalDataModelPackage.DATA_OBJECT__DATA_HANDLING_STRATEGIES:
				setDataHandlingStrategies((DataHandlingStrategies)null);
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
			case GlobalDataModelPackage.DATA_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GlobalDataModelPackage.DATA_OBJECT__TYPE:
				return type != TYPE_EDEFAULT;
			case GlobalDataModelPackage.DATA_OBJECT__STRUCTURAL_DEFINITION:
				return structuralDefinition != null;
			case GlobalDataModelPackage.DATA_OBJECT__META_DATA:
				return metaData != null;
			case GlobalDataModelPackage.DATA_OBJECT__INCOMING:
				return incoming != null;
			case GlobalDataModelPackage.DATA_OBJECT__OUTGOING:
				return outgoing != null;
			case GlobalDataModelPackage.DATA_OBJECT__DATA_HANDLING_STRATEGIES:
				return dataHandlingStrategies != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DataObjectImpl
