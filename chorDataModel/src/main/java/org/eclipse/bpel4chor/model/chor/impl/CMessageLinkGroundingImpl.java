/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding;
import org.eclipse.bpel4chor.model.chor.CQName;
import org.eclipse.bpel4chor.model.chor.ChorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMessage Link Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CMessageLinkGroundingImpl#getCMessageLink <em>CMessage Link</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CMessageLinkGroundingImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CMessageLinkGroundingImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CMessageLinkGroundingImpl#getBSToWSDLProperty <em>BS To WSDL Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMessageLinkGroundingImpl extends EObjectImpl implements CMessageLinkGrounding
{
        /**
	 * The cached value of the '{@link #getCMessageLink() <em>CMessage Link</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCMessageLink()
	 * @generated
	 * @ordered
	 */
        protected CMessageLink cMessageLink;

        /**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
        protected CQName portType;

        /**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
        protected static final String OPERATION_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
        protected String operation = OPERATION_EDEFAULT;

        /**
	 * The cached value of the '{@link #getBSToWSDLProperty() <em>BS To WSDL Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getBSToWSDLProperty()
	 * @generated
	 * @ordered
	 */
        protected CQName bSToWSDLProperty;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected CMessageLinkGroundingImpl()
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
		return ChorPackage.Literals.CMESSAGE_LINK_GROUNDING;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CMessageLink getCMessageLink()
        {
		if (cMessageLink != null && cMessageLink.eIsProxy()) {
			InternalEObject oldCMessageLink = (InternalEObject)cMessageLink;
			cMessageLink = (CMessageLink)eResolveProxy(oldCMessageLink);
			if (cMessageLink != oldCMessageLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.CMESSAGE_LINK_GROUNDING__CMESSAGE_LINK, oldCMessageLink, cMessageLink));
			}
		}
		return cMessageLink;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CMessageLink basicGetCMessageLink()
        {
		return cMessageLink;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCMessageLink(CMessageLink newCMessageLink)
        {
		CMessageLink oldCMessageLink = cMessageLink;
		cMessageLink = newCMessageLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CMESSAGE_LINK_GROUNDING__CMESSAGE_LINK, oldCMessageLink, cMessageLink));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CQName getPortType()
        {
		return portType;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetPortType(CQName newPortType, NotificationChain msgs)
        {
		CQName oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.CMESSAGE_LINK_GROUNDING__PORT_TYPE, oldPortType, newPortType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setPortType(CQName newPortType)
        {
		if (newPortType != portType) {
			NotificationChain msgs = null;
			if (portType != null)
				msgs = ((InternalEObject)portType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.CMESSAGE_LINK_GROUNDING__PORT_TYPE, null, msgs);
			if (newPortType != null)
				msgs = ((InternalEObject)newPortType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.CMESSAGE_LINK_GROUNDING__PORT_TYPE, null, msgs);
			msgs = basicSetPortType(newPortType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CMESSAGE_LINK_GROUNDING__PORT_TYPE, newPortType, newPortType));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getOperation()
        {
		return operation;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setOperation(String newOperation)
        {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CMESSAGE_LINK_GROUNDING__OPERATION, oldOperation, operation));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CQName getBSToWSDLProperty()
        {
		return bSToWSDLProperty;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetBSToWSDLProperty(CQName newBSToWSDLProperty, NotificationChain msgs)
        {
		CQName oldBSToWSDLProperty = bSToWSDLProperty;
		bSToWSDLProperty = newBSToWSDLProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY, oldBSToWSDLProperty, newBSToWSDLProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setBSToWSDLProperty(CQName newBSToWSDLProperty)
        {
		if (newBSToWSDLProperty != bSToWSDLProperty) {
			NotificationChain msgs = null;
			if (bSToWSDLProperty != null)
				msgs = ((InternalEObject)bSToWSDLProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY, null, msgs);
			if (newBSToWSDLProperty != null)
				msgs = ((InternalEObject)newBSToWSDLProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY, null, msgs);
			msgs = basicSetBSToWSDLProperty(newBSToWSDLProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY, newBSToWSDLProperty, newBSToWSDLProperty));
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
			case ChorPackage.CMESSAGE_LINK_GROUNDING__PORT_TYPE:
				return basicSetPortType(null, msgs);
			case ChorPackage.CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY:
				return basicSetBSToWSDLProperty(null, msgs);
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
			case ChorPackage.CMESSAGE_LINK_GROUNDING__CMESSAGE_LINK:
				if (resolve) return getCMessageLink();
				return basicGetCMessageLink();
			case ChorPackage.CMESSAGE_LINK_GROUNDING__PORT_TYPE:
				return getPortType();
			case ChorPackage.CMESSAGE_LINK_GROUNDING__OPERATION:
				return getOperation();
			case ChorPackage.CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY:
				return getBSToWSDLProperty();
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
			case ChorPackage.CMESSAGE_LINK_GROUNDING__CMESSAGE_LINK:
				setCMessageLink((CMessageLink)newValue);
				return;
			case ChorPackage.CMESSAGE_LINK_GROUNDING__PORT_TYPE:
				setPortType((CQName)newValue);
				return;
			case ChorPackage.CMESSAGE_LINK_GROUNDING__OPERATION:
				setOperation((String)newValue);
				return;
			case ChorPackage.CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY:
				setBSToWSDLProperty((CQName)newValue);
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
			case ChorPackage.CMESSAGE_LINK_GROUNDING__CMESSAGE_LINK:
				setCMessageLink((CMessageLink)null);
				return;
			case ChorPackage.CMESSAGE_LINK_GROUNDING__PORT_TYPE:
				setPortType((CQName)null);
				return;
			case ChorPackage.CMESSAGE_LINK_GROUNDING__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case ChorPackage.CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY:
				setBSToWSDLProperty((CQName)null);
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
			case ChorPackage.CMESSAGE_LINK_GROUNDING__CMESSAGE_LINK:
				return cMessageLink != null;
			case ChorPackage.CMESSAGE_LINK_GROUNDING__PORT_TYPE:
				return portType != null;
			case ChorPackage.CMESSAGE_LINK_GROUNDING__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case ChorPackage.CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY:
				return bSToWSDLProperty != null;
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //CMessageLinkGroundingImpl
