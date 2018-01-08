/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.For;
import org.eclipse.bpel4chor.model.pbd.OnAlarm;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.RepeatEvery;
import org.eclipse.bpel4chor.model.pbd.Scope;
import org.eclipse.bpel4chor.model.pbd.Until;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.OnAlarmImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.OnAlarmImpl#getUntil <em>Until</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.OnAlarmImpl#getRepeatEvery <em>Repeat Every</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.OnAlarmImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.OnAlarmImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnAlarmImpl extends ExtensibleElementsImpl implements OnAlarm {
	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected For for_;

	/**
	 * The cached value of the '{@link #getUntil() <em>Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntil()
	 * @generated
	 * @ordered
	 */
	protected Until until;

	/**
	 * The cached value of the '{@link #getRepeatEvery() <em>Repeat Every</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatEvery()
	 * @generated
	 * @ordered
	 */
	protected RepeatEvery repeatEvery;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnAlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.ON_ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public For getFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFor(For newFor, NotificationChain msgs) {
		For oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.ON_ALARM__FOR, oldFor, newFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(For newFor) {
		if (newFor != for_) {
			NotificationChain msgs = null;
			if (for_ != null)
				msgs = ((InternalEObject)for_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.ON_ALARM__FOR, null, msgs);
			if (newFor != null)
				msgs = ((InternalEObject)newFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.ON_ALARM__FOR, null, msgs);
			msgs = basicSetFor(newFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.ON_ALARM__FOR, newFor, newFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Until getUntil() {
		return until;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntil(Until newUntil, NotificationChain msgs) {
		Until oldUntil = until;
		until = newUntil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.ON_ALARM__UNTIL, oldUntil, newUntil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntil(Until newUntil) {
		if (newUntil != until) {
			NotificationChain msgs = null;
			if (until != null)
				msgs = ((InternalEObject)until).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.ON_ALARM__UNTIL, null, msgs);
			if (newUntil != null)
				msgs = ((InternalEObject)newUntil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.ON_ALARM__UNTIL, null, msgs);
			msgs = basicSetUntil(newUntil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.ON_ALARM__UNTIL, newUntil, newUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatEvery getRepeatEvery() {
		return repeatEvery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatEvery(RepeatEvery newRepeatEvery, NotificationChain msgs) {
		RepeatEvery oldRepeatEvery = repeatEvery;
		repeatEvery = newRepeatEvery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.ON_ALARM__REPEAT_EVERY, oldRepeatEvery, newRepeatEvery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatEvery(RepeatEvery newRepeatEvery) {
		if (newRepeatEvery != repeatEvery) {
			NotificationChain msgs = null;
			if (repeatEvery != null)
				msgs = ((InternalEObject)repeatEvery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.ON_ALARM__REPEAT_EVERY, null, msgs);
			if (newRepeatEvery != null)
				msgs = ((InternalEObject)newRepeatEvery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.ON_ALARM__REPEAT_EVERY, null, msgs);
			msgs = basicSetRepeatEvery(newRepeatEvery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.ON_ALARM__REPEAT_EVERY, newRepeatEvery, newRepeatEvery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		Scope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.ON_ALARM__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.ON_ALARM__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.ON_ALARM__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.ON_ALARM__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.ON_ALARM__ACTIVITY, oldActivity, newActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.ON_ALARM__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.ON_ALARM__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.ON_ALARM__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.ON_ALARM__FOR:
				return basicSetFor(null, msgs);
			case PbdPackage.ON_ALARM__UNTIL:
				return basicSetUntil(null, msgs);
			case PbdPackage.ON_ALARM__REPEAT_EVERY:
				return basicSetRepeatEvery(null, msgs);
			case PbdPackage.ON_ALARM__SCOPE:
				return basicSetScope(null, msgs);
			case PbdPackage.ON_ALARM__ACTIVITY:
				return basicSetActivity(null, msgs);
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
			case PbdPackage.ON_ALARM__FOR:
				return getFor();
			case PbdPackage.ON_ALARM__UNTIL:
				return getUntil();
			case PbdPackage.ON_ALARM__REPEAT_EVERY:
				return getRepeatEvery();
			case PbdPackage.ON_ALARM__SCOPE:
				return getScope();
			case PbdPackage.ON_ALARM__ACTIVITY:
				return getActivity();
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
			case PbdPackage.ON_ALARM__FOR:
				setFor((For)newValue);
				return;
			case PbdPackage.ON_ALARM__UNTIL:
				setUntil((Until)newValue);
				return;
			case PbdPackage.ON_ALARM__REPEAT_EVERY:
				setRepeatEvery((RepeatEvery)newValue);
				return;
			case PbdPackage.ON_ALARM__SCOPE:
				setScope((Scope)newValue);
				return;
			case PbdPackage.ON_ALARM__ACTIVITY:
				setActivity((Activity)newValue);
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
			case PbdPackage.ON_ALARM__FOR:
				setFor((For)null);
				return;
			case PbdPackage.ON_ALARM__UNTIL:
				setUntil((Until)null);
				return;
			case PbdPackage.ON_ALARM__REPEAT_EVERY:
				setRepeatEvery((RepeatEvery)null);
				return;
			case PbdPackage.ON_ALARM__SCOPE:
				setScope((Scope)null);
				return;
			case PbdPackage.ON_ALARM__ACTIVITY:
				setActivity((Activity)null);
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
			case PbdPackage.ON_ALARM__FOR:
				return for_ != null;
			case PbdPackage.ON_ALARM__UNTIL:
				return until != null;
			case PbdPackage.ON_ALARM__REPEAT_EVERY:
				return repeatEvery != null;
			case PbdPackage.ON_ALARM__SCOPE:
				return scope != null;
			case PbdPackage.ON_ALARM__ACTIVITY:
				return activity != null;
		}
		return super.eIsSet(featureID);
	}

} //OnAlarmImpl
