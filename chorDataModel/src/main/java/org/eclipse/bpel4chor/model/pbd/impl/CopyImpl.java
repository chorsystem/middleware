/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import org.eclipse.bpel4chor.model.pbd.Copy;
import org.eclipse.bpel4chor.model.pbd.From;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.To;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.CopyImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.CopyImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.CopyImpl#getKeepSrcElementName <em>Keep Src Element Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.CopyImpl#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyImpl extends ExtensibleElementsImpl implements Copy {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected From from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected To to;

	/**
	 * The default value of the '{@link #getKeepSrcElementName() <em>Keep Src Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepSrcElementName()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.bpel4chor.model.pbd.Boolean KEEP_SRC_ELEMENT_NAME_EDEFAULT = org.eclipse.bpel4chor.model.pbd.Boolean.NO;

	/**
	 * The cached value of the '{@link #getKeepSrcElementName() <em>Keep Src Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepSrcElementName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel4chor.model.pbd.Boolean keepSrcElementName = KEEP_SRC_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreMissingFromData() <em>Ignore Missing From Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreMissingFromData()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.bpel4chor.model.pbd.Boolean IGNORE_MISSING_FROM_DATA_EDEFAULT = org.eclipse.bpel4chor.model.pbd.Boolean.NO;

	/**
	 * The cached value of the '{@link #getIgnoreMissingFromData() <em>Ignore Missing From Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreMissingFromData()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel4chor.model.pbd.Boolean ignoreMissingFromData = IGNORE_MISSING_FROM_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.COPY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public From getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(From newFrom, NotificationChain msgs) {
		From oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.COPY__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(From newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.COPY__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.COPY__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.COPY__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public To getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(To newTo, NotificationChain msgs) {
		To oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.COPY__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(To newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.COPY__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.COPY__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.COPY__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean getKeepSrcElementName() {
		return keepSrcElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepSrcElementName(org.eclipse.bpel4chor.model.pbd.Boolean newKeepSrcElementName) {
		org.eclipse.bpel4chor.model.pbd.Boolean oldKeepSrcElementName = keepSrcElementName;
		keepSrcElementName = newKeepSrcElementName == null ? KEEP_SRC_ELEMENT_NAME_EDEFAULT : newKeepSrcElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.COPY__KEEP_SRC_ELEMENT_NAME, oldKeepSrcElementName, keepSrcElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean getIgnoreMissingFromData() {
		return ignoreMissingFromData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreMissingFromData(org.eclipse.bpel4chor.model.pbd.Boolean newIgnoreMissingFromData) {
		org.eclipse.bpel4chor.model.pbd.Boolean oldIgnoreMissingFromData = ignoreMissingFromData;
		ignoreMissingFromData = newIgnoreMissingFromData == null ? IGNORE_MISSING_FROM_DATA_EDEFAULT : newIgnoreMissingFromData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.COPY__IGNORE_MISSING_FROM_DATA, oldIgnoreMissingFromData, ignoreMissingFromData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.COPY__FROM:
				return basicSetFrom(null, msgs);
			case PbdPackage.COPY__TO:
				return basicSetTo(null, msgs);
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
			case PbdPackage.COPY__FROM:
				return getFrom();
			case PbdPackage.COPY__TO:
				return getTo();
			case PbdPackage.COPY__KEEP_SRC_ELEMENT_NAME:
				return getKeepSrcElementName();
			case PbdPackage.COPY__IGNORE_MISSING_FROM_DATA:
				return getIgnoreMissingFromData();
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
			case PbdPackage.COPY__FROM:
				setFrom((From)newValue);
				return;
			case PbdPackage.COPY__TO:
				setTo((To)newValue);
				return;
			case PbdPackage.COPY__KEEP_SRC_ELEMENT_NAME:
				setKeepSrcElementName((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
				return;
			case PbdPackage.COPY__IGNORE_MISSING_FROM_DATA:
				setIgnoreMissingFromData((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
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
			case PbdPackage.COPY__FROM:
				setFrom((From)null);
				return;
			case PbdPackage.COPY__TO:
				setTo((To)null);
				return;
			case PbdPackage.COPY__KEEP_SRC_ELEMENT_NAME:
				setKeepSrcElementName(KEEP_SRC_ELEMENT_NAME_EDEFAULT);
				return;
			case PbdPackage.COPY__IGNORE_MISSING_FROM_DATA:
				setIgnoreMissingFromData(IGNORE_MISSING_FROM_DATA_EDEFAULT);
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
			case PbdPackage.COPY__FROM:
				return from != null;
			case PbdPackage.COPY__TO:
				return to != null;
			case PbdPackage.COPY__KEEP_SRC_ELEMENT_NAME:
				return keepSrcElementName != KEEP_SRC_ELEMENT_NAME_EDEFAULT;
			case PbdPackage.COPY__IGNORE_MISSING_FROM_DATA:
				return ignoreMissingFromData != IGNORE_MISSING_FROM_DATA_EDEFAULT;
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
		result.append(" (keepSrcElementName: ");
		result.append(keepSrcElementName);
		result.append(", ignoreMissingFromData: ");
		result.append(ignoreMissingFromData);
		result.append(')');
		return result.toString();
	}

} //CopyImpl
