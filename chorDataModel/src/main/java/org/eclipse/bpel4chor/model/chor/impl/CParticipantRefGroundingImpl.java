/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import org.eclipse.bpel4chor.model.chor.CParticipantRef;
import org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding;
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
 * An implementation of the model object '<em><b>CParticipant Ref Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantRefGroundingImpl#getCParticipantRef <em>CParticipant Ref</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantRefGroundingImpl#getWSDLProperty <em>WSDL Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CParticipantRefGroundingImpl extends EObjectImpl implements CParticipantRefGrounding
{
        /**
	 * The cached value of the '{@link #getCParticipantRef() <em>CParticipant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCParticipantRef()
	 * @generated
	 * @ordered
	 */
        protected CParticipantRef cParticipantRef;

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
        protected CParticipantRefGroundingImpl()
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
		return ChorPackage.Literals.CPARTICIPANT_REF_GROUNDING;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipantRef getCParticipantRef()
        {
		if (cParticipantRef != null && cParticipantRef.eIsProxy()) {
			InternalEObject oldCParticipantRef = (InternalEObject)cParticipantRef;
			cParticipantRef = (CParticipantRef)eResolveProxy(oldCParticipantRef);
			if (cParticipantRef != oldCParticipantRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.CPARTICIPANT_REF_GROUNDING__CPARTICIPANT_REF, oldCParticipantRef, cParticipantRef));
			}
		}
		return cParticipantRef;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipantRef basicGetCParticipantRef()
        {
		return cParticipantRef;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCParticipantRef(CParticipantRef newCParticipantRef)
        {
		CParticipantRef oldCParticipantRef = cParticipantRef;
		cParticipantRef = newCParticipantRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CPARTICIPANT_REF_GROUNDING__CPARTICIPANT_REF, oldCParticipantRef, cParticipantRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY, oldWSDLProperty, newWSDLProperty);
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
				msgs = ((InternalEObject)wsdlProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY, null, msgs);
			if (newWSDLProperty != null)
				msgs = ((InternalEObject)newWSDLProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY, null, msgs);
			msgs = basicSetWSDLProperty(newWSDLProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY, newWSDLProperty, newWSDLProperty));
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
			case ChorPackage.CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY:
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
			case ChorPackage.CPARTICIPANT_REF_GROUNDING__CPARTICIPANT_REF:
				if (resolve) return getCParticipantRef();
				return basicGetCParticipantRef();
			case ChorPackage.CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY:
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
			case ChorPackage.CPARTICIPANT_REF_GROUNDING__CPARTICIPANT_REF:
				setCParticipantRef((CParticipantRef)newValue);
				return;
			case ChorPackage.CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY:
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
			case ChorPackage.CPARTICIPANT_REF_GROUNDING__CPARTICIPANT_REF:
				setCParticipantRef((CParticipantRef)null);
				return;
			case ChorPackage.CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY:
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
			case ChorPackage.CPARTICIPANT_REF_GROUNDING__CPARTICIPANT_REF:
				return cParticipantRef != null;
			case ChorPackage.CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY:
				return wsdlProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //CParticipantRefGroundingImpl
