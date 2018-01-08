/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.pbd.CLinkable;
import org.eclipse.bpel4chor.model.pbd.Correlations;
import org.eclipse.bpel4chor.model.pbd.DanglingMessageLink;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.Reply;
import org.eclipse.bpel4chor.model.pbd.ToParts;

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
 * An implementation of the model object '<em><b>Reply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReplyImpl#getDanglingMessageLink <em>Dangling Message Link</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReplyImpl#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReplyImpl#getToParts <em>To Parts</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReplyImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReplyImpl#getFaultName <em>Fault Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReplyImpl#getMessageExchange <em>Message Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplyImpl extends ActivityImpl implements Reply {
	/**
	 * The cached value of the '{@link #getDanglingMessageLink() <em>Dangling Message Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDanglingMessageLink()
	 * @generated
	 * @ordered
	 */
	protected EList<DanglingMessageLink> danglingMessageLink;

	/**
	 * The cached value of the '{@link #getCorrelations() <em>Correlations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelations()
	 * @generated
	 * @ordered
	 */
	protected Correlations correlations;

	/**
	 * The cached value of the '{@link #getToParts() <em>To Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToParts()
	 * @generated
	 * @ordered
	 */
	protected ToParts toParts;

	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected String variable = VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultName() <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultName() <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultName()
	 * @generated
	 * @ordered
	 */
	protected String faultName = FAULT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageExchange() <em>Message Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchange()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EXCHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageExchange() <em>Message Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchange()
	 * @generated
	 * @ordered
	 */
	protected String messageExchange = MESSAGE_EXCHANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.REPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DanglingMessageLink> getDanglingMessageLink() {
		if (danglingMessageLink == null) {
			danglingMessageLink = new EObjectContainmentEList<DanglingMessageLink>(DanglingMessageLink.class, this, PbdPackage.REPLY__DANGLING_MESSAGE_LINK);
		}
		return danglingMessageLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlations getCorrelations() {
		return correlations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelations(Correlations newCorrelations, NotificationChain msgs) {
		Correlations oldCorrelations = correlations;
		correlations = newCorrelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.REPLY__CORRELATIONS, oldCorrelations, newCorrelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelations(Correlations newCorrelations) {
		if (newCorrelations != correlations) {
			NotificationChain msgs = null;
			if (correlations != null)
				msgs = ((InternalEObject)correlations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.REPLY__CORRELATIONS, null, msgs);
			if (newCorrelations != null)
				msgs = ((InternalEObject)newCorrelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.REPLY__CORRELATIONS, null, msgs);
			msgs = basicSetCorrelations(newCorrelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.REPLY__CORRELATIONS, newCorrelations, newCorrelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToParts getToParts() {
		return toParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToParts(ToParts newToParts, NotificationChain msgs) {
		ToParts oldToParts = toParts;
		toParts = newToParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.REPLY__TO_PARTS, oldToParts, newToParts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToParts(ToParts newToParts) {
		if (newToParts != toParts) {
			NotificationChain msgs = null;
			if (toParts != null)
				msgs = ((InternalEObject)toParts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.REPLY__TO_PARTS, null, msgs);
			if (newToParts != null)
				msgs = ((InternalEObject)newToParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.REPLY__TO_PARTS, null, msgs);
			msgs = basicSetToParts(newToParts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.REPLY__TO_PARTS, newToParts, newToParts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		String oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.REPLY__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFaultName() {
		return faultName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultName(String newFaultName) {
		String oldFaultName = faultName;
		faultName = newFaultName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.REPLY__FAULT_NAME, oldFaultName, faultName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageExchange() {
		return messageExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchange(String newMessageExchange) {
		String oldMessageExchange = messageExchange;
		messageExchange = newMessageExchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.REPLY__MESSAGE_EXCHANGE, oldMessageExchange, messageExchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.REPLY__DANGLING_MESSAGE_LINK:
				return ((InternalEList<?>)getDanglingMessageLink()).basicRemove(otherEnd, msgs);
			case PbdPackage.REPLY__CORRELATIONS:
				return basicSetCorrelations(null, msgs);
			case PbdPackage.REPLY__TO_PARTS:
				return basicSetToParts(null, msgs);
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
			case PbdPackage.REPLY__DANGLING_MESSAGE_LINK:
				return getDanglingMessageLink();
			case PbdPackage.REPLY__CORRELATIONS:
				return getCorrelations();
			case PbdPackage.REPLY__TO_PARTS:
				return getToParts();
			case PbdPackage.REPLY__VARIABLE:
				return getVariable();
			case PbdPackage.REPLY__FAULT_NAME:
				return getFaultName();
			case PbdPackage.REPLY__MESSAGE_EXCHANGE:
				return getMessageExchange();
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
			case PbdPackage.REPLY__DANGLING_MESSAGE_LINK:
				getDanglingMessageLink().clear();
				getDanglingMessageLink().addAll((Collection<? extends DanglingMessageLink>)newValue);
				return;
			case PbdPackage.REPLY__CORRELATIONS:
				setCorrelations((Correlations)newValue);
				return;
			case PbdPackage.REPLY__TO_PARTS:
				setToParts((ToParts)newValue);
				return;
			case PbdPackage.REPLY__VARIABLE:
				setVariable((String)newValue);
				return;
			case PbdPackage.REPLY__FAULT_NAME:
				setFaultName((String)newValue);
				return;
			case PbdPackage.REPLY__MESSAGE_EXCHANGE:
				setMessageExchange((String)newValue);
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
			case PbdPackage.REPLY__DANGLING_MESSAGE_LINK:
				getDanglingMessageLink().clear();
				return;
			case PbdPackage.REPLY__CORRELATIONS:
				setCorrelations((Correlations)null);
				return;
			case PbdPackage.REPLY__TO_PARTS:
				setToParts((ToParts)null);
				return;
			case PbdPackage.REPLY__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case PbdPackage.REPLY__FAULT_NAME:
				setFaultName(FAULT_NAME_EDEFAULT);
				return;
			case PbdPackage.REPLY__MESSAGE_EXCHANGE:
				setMessageExchange(MESSAGE_EXCHANGE_EDEFAULT);
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
			case PbdPackage.REPLY__DANGLING_MESSAGE_LINK:
				return danglingMessageLink != null && !danglingMessageLink.isEmpty();
			case PbdPackage.REPLY__CORRELATIONS:
				return correlations != null;
			case PbdPackage.REPLY__TO_PARTS:
				return toParts != null;
			case PbdPackage.REPLY__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
			case PbdPackage.REPLY__FAULT_NAME:
				return FAULT_NAME_EDEFAULT == null ? faultName != null : !FAULT_NAME_EDEFAULT.equals(faultName);
			case PbdPackage.REPLY__MESSAGE_EXCHANGE:
				return MESSAGE_EXCHANGE_EDEFAULT == null ? messageExchange != null : !MESSAGE_EXCHANGE_EDEFAULT.equals(messageExchange);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CLinkable.class) {
			switch (derivedFeatureID) {
				case PbdPackage.REPLY__DANGLING_MESSAGE_LINK: return PbdPackage.CLINKABLE__DANGLING_MESSAGE_LINK;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CLinkable.class) {
			switch (baseFeatureID) {
				case PbdPackage.CLINKABLE__DANGLING_MESSAGE_LINK: return PbdPackage.REPLY__DANGLING_MESSAGE_LINK;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (variable: ");
		result.append(variable);
		result.append(", faultName: ");
		result.append(faultName);
		result.append(", messageExchange: ");
		result.append(messageExchange);
		result.append(')');
		return result.toString();
	}

} //ReplyImpl
