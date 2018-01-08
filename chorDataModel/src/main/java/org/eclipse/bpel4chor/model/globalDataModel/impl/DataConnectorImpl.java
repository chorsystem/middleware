/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel.impl;

import org.eclipse.bpel4chor.model.globalDataModel.DataConnector;
import org.eclipse.bpel4chor.model.globalDataModel.DataMappings;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorImpl#getSourceMappings <em>Source Mappings</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.globalDataModel.impl.DataConnectorImpl#getTargetMappings <em>Target Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataConnectorImpl extends EObjectImpl implements DataConnector {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EObject source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject target;

	/**
	 * The cached value of the '{@link #getSourceMappings() <em>Source Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMappings()
	 * @generated
	 * @ordered
	 */
	protected DataMappings sourceMappings;

	/**
	 * The cached value of the '{@link #getTargetMappings() <em>Target Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMappings()
	 * @generated
	 * @ordered
	 */
	protected DataMappings targetMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalDataModelPackage.Literals.DATA_CONNECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalDataModelPackage.DATA_CONNECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EObject newSource) {
		EObject oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_CONNECTOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalDataModelPackage.DATA_CONNECTOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EObject newTarget) {
		EObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_CONNECTOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMappings getSourceMappings() {
		return sourceMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMappings(DataMappings newSourceMappings, NotificationChain msgs) {
		DataMappings oldSourceMappings = sourceMappings;
		sourceMappings = newSourceMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_CONNECTOR__SOURCE_MAPPINGS, oldSourceMappings, newSourceMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMappings(DataMappings newSourceMappings) {
		if (newSourceMappings != sourceMappings) {
			NotificationChain msgs = null;
			if (sourceMappings != null)
				msgs = ((InternalEObject)sourceMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalDataModelPackage.DATA_CONNECTOR__SOURCE_MAPPINGS, null, msgs);
			if (newSourceMappings != null)
				msgs = ((InternalEObject)newSourceMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalDataModelPackage.DATA_CONNECTOR__SOURCE_MAPPINGS, null, msgs);
			msgs = basicSetSourceMappings(newSourceMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_CONNECTOR__SOURCE_MAPPINGS, newSourceMappings, newSourceMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMappings getTargetMappings() {
		return targetMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetMappings(DataMappings newTargetMappings, NotificationChain msgs) {
		DataMappings oldTargetMappings = targetMappings;
		targetMappings = newTargetMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_CONNECTOR__TARGET_MAPPINGS, oldTargetMappings, newTargetMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMappings(DataMappings newTargetMappings) {
		if (newTargetMappings != targetMappings) {
			NotificationChain msgs = null;
			if (targetMappings != null)
				msgs = ((InternalEObject)targetMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalDataModelPackage.DATA_CONNECTOR__TARGET_MAPPINGS, null, msgs);
			if (newTargetMappings != null)
				msgs = ((InternalEObject)newTargetMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalDataModelPackage.DATA_CONNECTOR__TARGET_MAPPINGS, null, msgs);
			msgs = basicSetTargetMappings(newTargetMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalDataModelPackage.DATA_CONNECTOR__TARGET_MAPPINGS, newTargetMappings, newTargetMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalDataModelPackage.DATA_CONNECTOR__SOURCE_MAPPINGS:
				return basicSetSourceMappings(null, msgs);
			case GlobalDataModelPackage.DATA_CONNECTOR__TARGET_MAPPINGS:
				return basicSetTargetMappings(null, msgs);
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
			case GlobalDataModelPackage.DATA_CONNECTOR__NAME:
				return getName();
			case GlobalDataModelPackage.DATA_CONNECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case GlobalDataModelPackage.DATA_CONNECTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case GlobalDataModelPackage.DATA_CONNECTOR__SOURCE_MAPPINGS:
				return getSourceMappings();
			case GlobalDataModelPackage.DATA_CONNECTOR__TARGET_MAPPINGS:
				return getTargetMappings();
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
			case GlobalDataModelPackage.DATA_CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case GlobalDataModelPackage.DATA_CONNECTOR__SOURCE:
				setSource((EObject)newValue);
				return;
			case GlobalDataModelPackage.DATA_CONNECTOR__TARGET:
				setTarget((EObject)newValue);
				return;
			case GlobalDataModelPackage.DATA_CONNECTOR__SOURCE_MAPPINGS:
				setSourceMappings((DataMappings)newValue);
				return;
			case GlobalDataModelPackage.DATA_CONNECTOR__TARGET_MAPPINGS:
				setTargetMappings((DataMappings)newValue);
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
			case GlobalDataModelPackage.DATA_CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GlobalDataModelPackage.DATA_CONNECTOR__SOURCE:
				setSource((EObject)null);
				return;
			case GlobalDataModelPackage.DATA_CONNECTOR__TARGET:
				setTarget((EObject)null);
				return;
			case GlobalDataModelPackage.DATA_CONNECTOR__SOURCE_MAPPINGS:
				setSourceMappings((DataMappings)null);
				return;
			case GlobalDataModelPackage.DATA_CONNECTOR__TARGET_MAPPINGS:
				setTargetMappings((DataMappings)null);
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
			case GlobalDataModelPackage.DATA_CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GlobalDataModelPackage.DATA_CONNECTOR__SOURCE:
				return source != null;
			case GlobalDataModelPackage.DATA_CONNECTOR__TARGET:
				return target != null;
			case GlobalDataModelPackage.DATA_CONNECTOR__SOURCE_MAPPINGS:
				return sourceMappings != null;
			case GlobalDataModelPackage.DATA_CONNECTOR__TARGET_MAPPINGS:
				return targetMappings != null;
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
		result.append(')');
		return result.toString();
	}

} //DataConnectorImpl
