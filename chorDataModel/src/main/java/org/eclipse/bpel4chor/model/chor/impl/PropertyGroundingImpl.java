/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import org.eclipse.bpel4chor.model.chor.CQName;
import org.eclipse.bpel4chor.model.chor.ChorPackage;
import org.eclipse.bpel4chor.model.chor.PropertyGrounding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.PropertyGroundingImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.PropertyGroundingImpl#getWSDLProperty <em>WSDL Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyGroundingImpl extends EObjectImpl implements PropertyGrounding
{
        /**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
        protected static final String PROPERTY_NAME_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
        protected String propertyName = PROPERTY_NAME_EDEFAULT;

        /**
	 * The cached value of the '{@link #getWSDLProperty() <em>WSDL Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getWSDLProperty()
	 * @generated
	 * @ordered
	 */
        protected CQName wsdlProperty;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected PropertyGroundingImpl()
        {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass()
        {
		return ChorPackage.Literals.PROPERTY_GROUNDING;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getPropertyName()
        {
		return propertyName;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setPropertyName(String newPropertyName)
        {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.PROPERTY_GROUNDING__PROPERTY_NAME, oldPropertyName, propertyName));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CQName getWSDLProperty()
        {
		return wsdlProperty;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetWSDLProperty(CQName newWSDLProperty, NotificationChain msgs)
        {
		CQName oldWSDLProperty = wsdlProperty;
		wsdlProperty = newWSDLProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.PROPERTY_GROUNDING__WSDL_PROPERTY, oldWSDLProperty, newWSDLProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setWSDLProperty(CQName newWSDLProperty)
        {
		if (newWSDLProperty != wsdlProperty) {
			NotificationChain msgs = null;
			if (wsdlProperty != null)
				msgs = ((InternalEObject)wsdlProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.PROPERTY_GROUNDING__WSDL_PROPERTY, null, msgs);
			if (newWSDLProperty != null)
				msgs = ((InternalEObject)newWSDLProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.PROPERTY_GROUNDING__WSDL_PROPERTY, null, msgs);
			msgs = basicSetWSDLProperty(newWSDLProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.PROPERTY_GROUNDING__WSDL_PROPERTY, newWSDLProperty, newWSDLProperty));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
        {
		switch (featureID) {
			case ChorPackage.PROPERTY_GROUNDING__WSDL_PROPERTY:
				return basicSetWSDLProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType)
        {
		switch (featureID) {
			case ChorPackage.PROPERTY_GROUNDING__PROPERTY_NAME:
				return getPropertyName();
			case ChorPackage.PROPERTY_GROUNDING__WSDL_PROPERTY:
				return getWSDLProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public void eSet(int featureID, Object newValue)
        {
		switch (featureID) {
			case ChorPackage.PROPERTY_GROUNDING__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case ChorPackage.PROPERTY_GROUNDING__WSDL_PROPERTY:
				setWSDLProperty((CQName)newValue);
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
        public void eUnset(int featureID)
        {
		switch (featureID) {
			case ChorPackage.PROPERTY_GROUNDING__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case ChorPackage.PROPERTY_GROUNDING__WSDL_PROPERTY:
				setWSDLProperty((CQName)null);
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
        public boolean eIsSet(int featureID)
        {
		switch (featureID) {
			case ChorPackage.PROPERTY_GROUNDING__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case ChorPackage.PROPERTY_GROUNDING__WSDL_PROPERTY:
				return wsdlProperty != null;
		}
		return super.eIsSet(featureID);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public String toString()
        {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propertyName: ");
		result.append(propertyName);
		result.append(')');
		return result.toString();
	}

} //PropertyGroundingImpl
