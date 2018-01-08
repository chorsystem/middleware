/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import java.util.Collection;

import java.util.Map;
import org.eclipse.bpel4chor.model.chor.common.CommonPackage;
import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.chor.common.impl.EStringToProcessInstanceMapImpl;
import org.eclipse.bpel4chor.model.chor.common.impl.EStringToElementInstanceMapImpl;
import org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance;

import org.eclipse.bpel4chor.model.pbd.Documentation;
import org.eclipse.bpel4chor.model.pbd.ExtensibleElements;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extensible Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl#getAnyElement <em>Any Element</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl#getInstanceBuffer <em>Instance Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensibleElementsImpl extends EObjectImpl implements ExtensibleElements {
	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> anyAttribute;

	/**
	 * The cached value of the '{@link #getAnyElement() <em>Any Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> anyElement;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXpath() <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpath() <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected String xpath = XPATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String instanceID = INSTANCE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstanceBuffer() <em>Instance Buffer</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceBuffer()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EMap<String, ElementInstance>> instanceBuffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensibleElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.EXTENSIBLE_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Documentation>(Documentation.class, this, PbdPackage.EXTENSIBLE_ELEMENTS__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new EDataTypeUniqueEList<Object>(Object.class, this, PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAnyElement() {
		if (anyElement == null) {
			anyElement = new EObjectContainmentEList<EObject>(EObject.class, this, PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ELEMENT);
		}
		return anyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.EXTENSIBLE_ELEMENTS__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXpath() {
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpath(String newXpath) {
		String oldXpath = xpath;
		xpath = newXpath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.EXTENSIBLE_ELEMENTS__XPATH, oldXpath, xpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.EXTENSIBLE_ELEMENTS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceID() {
		return instanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(String newInstanceID) {
		String oldInstanceID = instanceID;
		instanceID = newInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_ID, oldInstanceID, instanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EMap<String, ElementInstance>> getInstanceBuffer() {
		if (instanceBuffer == null) {
			instanceBuffer = new EcoreEMap<String,EMap<String, ElementInstance>>(CommonPackage.Literals.ESTRING_TO_PROCESS_INSTANCE_MAP, EStringToProcessInstanceMapImpl.class, this, PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER);
		}
		return instanceBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.EXTENSIBLE_ELEMENTS__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ELEMENT:
				return ((InternalEList<?>)getAnyElement()).basicRemove(otherEnd, msgs);
			case PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER:
				return ((InternalEList<?>)getInstanceBuffer()).basicRemove(otherEnd, msgs);
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
			case PbdPackage.EXTENSIBLE_ELEMENTS__DOCUMENTATION:
				return getDocumentation();
			case PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ELEMENT:
				return getAnyElement();
			case PbdPackage.EXTENSIBLE_ELEMENTS__STATE:
				return getState();
			case PbdPackage.EXTENSIBLE_ELEMENTS__XPATH:
				return getXpath();
			case PbdPackage.EXTENSIBLE_ELEMENTS__ID:
				return getId();
			case PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_ID:
				return getInstanceID();
			case PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER:
				if (coreType) return getInstanceBuffer();
				else return getInstanceBuffer().map();
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
			case PbdPackage.EXTENSIBLE_ELEMENTS__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection<? extends Object>)newValue);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ELEMENT:
				getAnyElement().clear();
				getAnyElement().addAll((Collection<? extends EObject>)newValue);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__STATE:
				setState((String)newValue);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__XPATH:
				setXpath((String)newValue);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__ID:
				setId((String)newValue);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_ID:
				setInstanceID((String)newValue);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER:
				((EStructuralFeature.Setting)getInstanceBuffer()).set(newValue);
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
			case PbdPackage.EXTENSIBLE_ELEMENTS__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ELEMENT:
				getAnyElement().clear();
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__STATE:
				setState(STATE_EDEFAULT);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__XPATH:
				setXpath(XPATH_EDEFAULT);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__ID:
				setId(ID_EDEFAULT);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
				return;
			case PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER:
				getInstanceBuffer().clear();
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
			case PbdPackage.EXTENSIBLE_ELEMENTS__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case PbdPackage.EXTENSIBLE_ELEMENTS__ANY_ELEMENT:
				return anyElement != null && !anyElement.isEmpty();
			case PbdPackage.EXTENSIBLE_ELEMENTS__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case PbdPackage.EXTENSIBLE_ELEMENTS__XPATH:
				return XPATH_EDEFAULT == null ? xpath != null : !XPATH_EDEFAULT.equals(xpath);
			case PbdPackage.EXTENSIBLE_ELEMENTS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceID != null : !INSTANCE_ID_EDEFAULT.equals(instanceID);
			case PbdPackage.EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER:
				return instanceBuffer != null && !instanceBuffer.isEmpty();
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
		result.append(" (anyAttribute: ");
		result.append(anyAttribute);
		result.append(", state: ");
		result.append(state);
		result.append(", xpath: ");
		result.append(xpath);
		result.append(", id: ");
		result.append(id);
		result.append(", instanceID: ");
		result.append(instanceID);
		result.append(')');
		return result.toString();
	}

} //ExtensibleElementsImpl
