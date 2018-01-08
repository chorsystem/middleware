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
import org.eclipse.bpel4chor.model.pbd.FromParts;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.Receive;

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
 * An implementation of the model object '<em><b>Receive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReceiveImpl#getDanglingMessageLink <em>Dangling Message Link</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReceiveImpl#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReceiveImpl#getFromParts <em>From Parts</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReceiveImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReceiveImpl#getCreateInstance <em>Create Instance</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ReceiveImpl#getMessageExchange <em>Message Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveImpl extends ActivityImpl implements Receive {
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
	 * The cached value of the '{@link #getFromParts() <em>From Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromParts()
	 * @generated
	 * @ordered
	 */
	protected FromParts fromParts;

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
	protected ReceiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.RECEIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DanglingMessageLink> getDanglingMessageLink() {
		if (danglingMessageLink == null) {
			danglingMessageLink = new EObjectContainmentEList<DanglingMessageLink>(DanglingMessageLink.class, this, PbdPackage.RECEIVE__DANGLING_MESSAGE_LINK);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.RECEIVE__CORRELATIONS, oldCorrelations, newCorrelations);
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
				msgs = ((InternalEObject)correlations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.RECEIVE__CORRELATIONS, null, msgs);
			if (newCorrelations != null)
				msgs = ((InternalEObject)newCorrelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.RECEIVE__CORRELATIONS, null, msgs);
			msgs = basicSetCorrelations(newCorrelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.RECEIVE__CORRELATIONS, newCorrelations, newCorrelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromParts getFromParts() {
		return fromParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromParts(FromParts newFromParts, NotificationChain msgs) {
		FromParts oldFromParts = fromParts;
		fromParts = newFromParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.RECEIVE__FROM_PARTS, oldFromParts, newFromParts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromParts(FromParts newFromParts) {
		if (newFromParts != fromParts) {
			NotificationChain msgs = null;
			if (fromParts != null)
				msgs = ((InternalEObject)fromParts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.RECEIVE__FROM_PARTS, null, msgs);
			if (newFromParts != null)
				msgs = ((InternalEObject)newFromParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.RECEIVE__FROM_PARTS, null, msgs);
			msgs = basicSetFromParts(newFromParts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.RECEIVE__FROM_PARTS, newFromParts, newFromParts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.RECEIVE__VARIABLE, oldVariable, variable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.RECEIVE__CREATE_INSTANCE, oldCreateInstance, createInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.RECEIVE__MESSAGE_EXCHANGE, oldMessageExchange, messageExchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.RECEIVE__DANGLING_MESSAGE_LINK:
				return ((InternalEList<?>)getDanglingMessageLink()).basicRemove(otherEnd, msgs);
			case PbdPackage.RECEIVE__CORRELATIONS:
				return basicSetCorrelations(null, msgs);
			case PbdPackage.RECEIVE__FROM_PARTS:
				return basicSetFromParts(null, msgs);
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
			case PbdPackage.RECEIVE__DANGLING_MESSAGE_LINK:
				return getDanglingMessageLink();
			case PbdPackage.RECEIVE__CORRELATIONS:
				return getCorrelations();
			case PbdPackage.RECEIVE__FROM_PARTS:
				return getFromParts();
			case PbdPackage.RECEIVE__VARIABLE:
				return getVariable();
			case PbdPackage.RECEIVE__CREATE_INSTANCE:
				return getCreateInstance();
			case PbdPackage.RECEIVE__MESSAGE_EXCHANGE:
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
			case PbdPackage.RECEIVE__DANGLING_MESSAGE_LINK:
				getDanglingMessageLink().clear();
				getDanglingMessageLink().addAll((Collection<? extends DanglingMessageLink>)newValue);
				return;
			case PbdPackage.RECEIVE__CORRELATIONS:
				setCorrelations((Correlations)newValue);
				return;
			case PbdPackage.RECEIVE__FROM_PARTS:
				setFromParts((FromParts)newValue);
				return;
			case PbdPackage.RECEIVE__VARIABLE:
				setVariable((String)newValue);
				return;
			case PbdPackage.RECEIVE__CREATE_INSTANCE:
				setCreateInstance((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
				return;
			case PbdPackage.RECEIVE__MESSAGE_EXCHANGE:
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
			case PbdPackage.RECEIVE__DANGLING_MESSAGE_LINK:
				getDanglingMessageLink().clear();
				return;
			case PbdPackage.RECEIVE__CORRELATIONS:
				setCorrelations((Correlations)null);
				return;
			case PbdPackage.RECEIVE__FROM_PARTS:
				setFromParts((FromParts)null);
				return;
			case PbdPackage.RECEIVE__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case PbdPackage.RECEIVE__CREATE_INSTANCE:
				setCreateInstance(CREATE_INSTANCE_EDEFAULT);
				return;
			case PbdPackage.RECEIVE__MESSAGE_EXCHANGE:
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
			case PbdPackage.RECEIVE__DANGLING_MESSAGE_LINK:
				return danglingMessageLink != null && !danglingMessageLink.isEmpty();
			case PbdPackage.RECEIVE__CORRELATIONS:
				return correlations != null;
			case PbdPackage.RECEIVE__FROM_PARTS:
				return fromParts != null;
			case PbdPackage.RECEIVE__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
			case PbdPackage.RECEIVE__CREATE_INSTANCE:
				return createInstance != CREATE_INSTANCE_EDEFAULT;
			case PbdPackage.RECEIVE__MESSAGE_EXCHANGE:
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
				case PbdPackage.RECEIVE__DANGLING_MESSAGE_LINK: return PbdPackage.CLINKABLE__DANGLING_MESSAGE_LINK;
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
				case PbdPackage.CLINKABLE__DANGLING_MESSAGE_LINK: return PbdPackage.RECEIVE__DANGLING_MESSAGE_LINK;
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
		result.append(", createInstance: ");
		result.append(createInstance);
		result.append(", messageExchange: ");
		result.append(messageExchange);
		result.append(')');
		return result.toString();
	}

} //ReceiveImpl
