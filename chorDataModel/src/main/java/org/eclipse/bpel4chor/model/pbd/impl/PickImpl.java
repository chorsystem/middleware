/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.pbd.OnAlarm;
import org.eclipse.bpel4chor.model.pbd.OnMessage;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.Pick;

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
 * An implementation of the model object '<em><b>Pick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.PickImpl#getOnMessage <em>On Message</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.PickImpl#getOnAlarm <em>On Alarm</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.PickImpl#getCreateInstance <em>Create Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PickImpl extends ActivityImpl implements Pick {
	/**
	 * The cached value of the '{@link #getOnMessage() <em>On Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<OnMessage> onMessage;

	/**
	 * The cached value of the '{@link #getOnAlarm() <em>On Alarm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAlarm()
	 * @generated
	 * @ordered
	 */
	protected EList<OnAlarm> onAlarm;

	/**
	 * The default value of the '{@link #getCreateInstance() <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateInstance()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.bpel4chor.model.pbd.Boolean CREATE_INSTANCE_EDEFAULT = org.eclipse.bpel4chor.model.pbd.Boolean.NO;

	/**
	 * The cached value of the '{@link #getCreateInstance() <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateInstance()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel4chor.model.pbd.Boolean createInstance = CREATE_INSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PickImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.PICK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnMessage> getOnMessage() {
		if (onMessage == null) {
			onMessage = new EObjectContainmentEList<OnMessage>(OnMessage.class, this, PbdPackage.PICK__ON_MESSAGE);
		}
		return onMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnAlarm> getOnAlarm() {
		if (onAlarm == null) {
			onAlarm = new EObjectContainmentEList<OnAlarm>(OnAlarm.class, this, PbdPackage.PICK__ON_ALARM);
		}
		return onAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean getCreateInstance() {
		return createInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateInstance(org.eclipse.bpel4chor.model.pbd.Boolean newCreateInstance) {
		org.eclipse.bpel4chor.model.pbd.Boolean oldCreateInstance = createInstance;
		createInstance = newCreateInstance == null ? CREATE_INSTANCE_EDEFAULT : newCreateInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PICK__CREATE_INSTANCE, oldCreateInstance, createInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.PICK__ON_MESSAGE:
				return ((InternalEList<?>)getOnMessage()).basicRemove(otherEnd, msgs);
			case PbdPackage.PICK__ON_ALARM:
				return ((InternalEList<?>)getOnAlarm()).basicRemove(otherEnd, msgs);
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
			case PbdPackage.PICK__ON_MESSAGE:
				return getOnMessage();
			case PbdPackage.PICK__ON_ALARM:
				return getOnAlarm();
			case PbdPackage.PICK__CREATE_INSTANCE:
				return getCreateInstance();
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
			case PbdPackage.PICK__ON_MESSAGE:
				getOnMessage().clear();
				getOnMessage().addAll((Collection<? extends OnMessage>)newValue);
				return;
			case PbdPackage.PICK__ON_ALARM:
				getOnAlarm().clear();
				getOnAlarm().addAll((Collection<? extends OnAlarm>)newValue);
				return;
			case PbdPackage.PICK__CREATE_INSTANCE:
				setCreateInstance((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
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
			case PbdPackage.PICK__ON_MESSAGE:
				getOnMessage().clear();
				return;
			case PbdPackage.PICK__ON_ALARM:
				getOnAlarm().clear();
				return;
			case PbdPackage.PICK__CREATE_INSTANCE:
				setCreateInstance(CREATE_INSTANCE_EDEFAULT);
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
			case PbdPackage.PICK__ON_MESSAGE:
				return onMessage != null && !onMessage.isEmpty();
			case PbdPackage.PICK__ON_ALARM:
				return onAlarm != null && !onAlarm.isEmpty();
			case PbdPackage.PICK__CREATE_INSTANCE:
				return createInstance != CREATE_INSTANCE_EDEFAULT;
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
		result.append(" (createInstance: ");
		result.append(createInstance);
		result.append(')');
		return result.toString();
	}

} //PickImpl
