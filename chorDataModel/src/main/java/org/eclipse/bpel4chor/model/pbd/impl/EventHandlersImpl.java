/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.pbd.EventHandlers;
import org.eclipse.bpel4chor.model.pbd.OnAlarm;
import org.eclipse.bpel4chor.model.pbd.OnEvent;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Handlers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.EventHandlersImpl#getOnEvent <em>On Event</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.EventHandlersImpl#getOnAlarm <em>On Alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventHandlersImpl extends ExtensibleElementsImpl implements EventHandlers {
	/**
	 * The cached value of the '{@link #getOnEvent() <em>On Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<OnEvent> onEvent;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventHandlersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.EVENT_HANDLERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnEvent> getOnEvent() {
		if (onEvent == null) {
			onEvent = new EObjectContainmentEList<OnEvent>(OnEvent.class, this, PbdPackage.EVENT_HANDLERS__ON_EVENT);
		}
		return onEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnAlarm> getOnAlarm() {
		if (onAlarm == null) {
			onAlarm = new EObjectContainmentEList<OnAlarm>(OnAlarm.class, this, PbdPackage.EVENT_HANDLERS__ON_ALARM);
		}
		return onAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.EVENT_HANDLERS__ON_EVENT:
				return ((InternalEList<?>)getOnEvent()).basicRemove(otherEnd, msgs);
			case PbdPackage.EVENT_HANDLERS__ON_ALARM:
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
			case PbdPackage.EVENT_HANDLERS__ON_EVENT:
				return getOnEvent();
			case PbdPackage.EVENT_HANDLERS__ON_ALARM:
				return getOnAlarm();
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
			case PbdPackage.EVENT_HANDLERS__ON_EVENT:
				getOnEvent().clear();
				getOnEvent().addAll((Collection<? extends OnEvent>)newValue);
				return;
			case PbdPackage.EVENT_HANDLERS__ON_ALARM:
				getOnAlarm().clear();
				getOnAlarm().addAll((Collection<? extends OnAlarm>)newValue);
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
			case PbdPackage.EVENT_HANDLERS__ON_EVENT:
				getOnEvent().clear();
				return;
			case PbdPackage.EVENT_HANDLERS__ON_ALARM:
				getOnAlarm().clear();
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
			case PbdPackage.EVENT_HANDLERS__ON_EVENT:
				return onEvent != null && !onEvent.isEmpty();
			case PbdPackage.EVENT_HANDLERS__ON_ALARM:
				return onAlarm != null && !onAlarm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventHandlersImpl
