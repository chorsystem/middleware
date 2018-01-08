/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import org.eclipse.bpel4chor.model.pbd.From;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.wst.wsdl.Message;

import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.VariableImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.VariableImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.VariableImpl#getXsdElement <em>Xsd Element</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.VariableImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends ExtensibleElementsImpl implements Variable {
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
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected Message messageType;

	/**
	 * The cached value of the '{@link #getXsdElement() <em>Xsd Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdElement()
	 * @generated
	 * @ordered
	 */
	protected XSDElementDeclaration xsdElement;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected XSDTypeDefinition type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.VARIABLE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.VARIABLE__FROM, oldFrom, newFrom);
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
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.VARIABLE__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.VARIABLE__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.VARIABLE__FROM, newFrom, newFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageType(Message newMessageType, NotificationChain msgs) {
		Message oldMessageType = messageType;
		messageType = newMessageType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.VARIABLE__MESSAGE_TYPE, oldMessageType, newMessageType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageType(Message newMessageType) {
		if (newMessageType != messageType) {
			NotificationChain msgs = null;
			if (messageType != null)
				msgs = ((InternalEObject)messageType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.VARIABLE__MESSAGE_TYPE, null, msgs);
			if (newMessageType != null)
				msgs = ((InternalEObject)newMessageType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.VARIABLE__MESSAGE_TYPE, null, msgs);
			msgs = basicSetMessageType(newMessageType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.VARIABLE__MESSAGE_TYPE, newMessageType, newMessageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDElementDeclaration getXsdElement() {
		return xsdElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsdElement(XSDElementDeclaration newXsdElement, NotificationChain msgs) {
		XSDElementDeclaration oldXsdElement = xsdElement;
		xsdElement = newXsdElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.VARIABLE__XSD_ELEMENT, oldXsdElement, newXsdElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXsdElement(XSDElementDeclaration newXsdElement) {
		if (newXsdElement != xsdElement) {
			NotificationChain msgs = null;
			if (xsdElement != null)
				msgs = ((InternalEObject)xsdElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.VARIABLE__XSD_ELEMENT, null, msgs);
			if (newXsdElement != null)
				msgs = ((InternalEObject)newXsdElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.VARIABLE__XSD_ELEMENT, null, msgs);
			msgs = basicSetXsdElement(newXsdElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.VARIABLE__XSD_ELEMENT, newXsdElement, newXsdElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(XSDTypeDefinition newType, NotificationChain msgs) {
		XSDTypeDefinition oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.VARIABLE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(XSDTypeDefinition newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.VARIABLE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.VARIABLE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.VARIABLE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.VARIABLE__FROM:
				return basicSetFrom(null, msgs);
			case PbdPackage.VARIABLE__MESSAGE_TYPE:
				return basicSetMessageType(null, msgs);
			case PbdPackage.VARIABLE__XSD_ELEMENT:
				return basicSetXsdElement(null, msgs);
			case PbdPackage.VARIABLE__TYPE:
				return basicSetType(null, msgs);
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
			case PbdPackage.VARIABLE__FROM:
				return getFrom();
			case PbdPackage.VARIABLE__NAME:
				return getName();
			case PbdPackage.VARIABLE__MESSAGE_TYPE:
				return getMessageType();
			case PbdPackage.VARIABLE__XSD_ELEMENT:
				return getXsdElement();
			case PbdPackage.VARIABLE__TYPE:
				return getType();
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
			case PbdPackage.VARIABLE__FROM:
				setFrom((From)newValue);
				return;
			case PbdPackage.VARIABLE__NAME:
				setName((String)newValue);
				return;
			case PbdPackage.VARIABLE__MESSAGE_TYPE:
				setMessageType((Message)newValue);
				return;
			case PbdPackage.VARIABLE__XSD_ELEMENT:
				setXsdElement((XSDElementDeclaration)newValue);
				return;
			case PbdPackage.VARIABLE__TYPE:
				setType((XSDTypeDefinition)newValue);
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
			case PbdPackage.VARIABLE__FROM:
				setFrom((From)null);
				return;
			case PbdPackage.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PbdPackage.VARIABLE__MESSAGE_TYPE:
				setMessageType((Message)null);
				return;
			case PbdPackage.VARIABLE__XSD_ELEMENT:
				setXsdElement((XSDElementDeclaration)null);
				return;
			case PbdPackage.VARIABLE__TYPE:
				setType((XSDTypeDefinition)null);
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
			case PbdPackage.VARIABLE__FROM:
				return from != null;
			case PbdPackage.VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PbdPackage.VARIABLE__MESSAGE_TYPE:
				return messageType != null;
			case PbdPackage.VARIABLE__XSD_ELEMENT:
				return xsdElement != null;
			case PbdPackage.VARIABLE__TYPE:
				return type != null;
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

} //VariableImpl
