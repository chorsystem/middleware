/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.chor.ChorPackage;
import org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding;
import org.eclipse.bpel4chor.model.chor.PropertyGrounding;

import org.eclipse.bpel4chor.model.pbd.CorrelationSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Set Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CorrelationSetGroundingImpl#getCorrelationSet <em>Correlation Set</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CorrelationSetGroundingImpl#getPropertyGroundings <em>Property Groundings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationSetGroundingImpl extends EObjectImpl implements CorrelationSetGrounding
{
        /**
	 * The cached value of the '{@link #getCorrelationSet() <em>Correlation Set</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCorrelationSet()
	 * @generated
	 * @ordered
	 */
        protected CorrelationSet correlationSet;

        /**
	 * The cached value of the '{@link #getPropertyGroundings() <em>Property Groundings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getPropertyGroundings()
	 * @generated
	 * @ordered
	 */
        protected EList<PropertyGrounding> propertyGroundings;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected CorrelationSetGroundingImpl()
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
		return ChorPackage.Literals.CORRELATION_SET_GROUNDING;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CorrelationSet getCorrelationSet()
        {
		if (correlationSet != null && correlationSet.eIsProxy()) {
			InternalEObject oldCorrelationSet = (InternalEObject)correlationSet;
			correlationSet = (CorrelationSet)eResolveProxy(oldCorrelationSet);
			if (correlationSet != oldCorrelationSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.CORRELATION_SET_GROUNDING__CORRELATION_SET, oldCorrelationSet, correlationSet));
			}
		}
		return correlationSet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CorrelationSet basicGetCorrelationSet()
        {
		return correlationSet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCorrelationSet(CorrelationSet newCorrelationSet)
        {
		CorrelationSet oldCorrelationSet = correlationSet;
		correlationSet = newCorrelationSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CORRELATION_SET_GROUNDING__CORRELATION_SET, oldCorrelationSet, correlationSet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<PropertyGrounding> getPropertyGroundings()
        {
		if (propertyGroundings == null) {
			propertyGroundings = new EObjectContainmentEList<PropertyGrounding>(PropertyGrounding.class, this, ChorPackage.CORRELATION_SET_GROUNDING__PROPERTY_GROUNDINGS);
		}
		return propertyGroundings;
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
			case ChorPackage.CORRELATION_SET_GROUNDING__PROPERTY_GROUNDINGS:
				return ((InternalEList<?>)getPropertyGroundings()).basicRemove(otherEnd, msgs);
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
			case ChorPackage.CORRELATION_SET_GROUNDING__CORRELATION_SET:
				if (resolve) return getCorrelationSet();
				return basicGetCorrelationSet();
			case ChorPackage.CORRELATION_SET_GROUNDING__PROPERTY_GROUNDINGS:
				return getPropertyGroundings();
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
        public void eSet(int featureID, Object newValue)
        {
		switch (featureID) {
			case ChorPackage.CORRELATION_SET_GROUNDING__CORRELATION_SET:
				setCorrelationSet((CorrelationSet)newValue);
				return;
			case ChorPackage.CORRELATION_SET_GROUNDING__PROPERTY_GROUNDINGS:
				getPropertyGroundings().clear();
				getPropertyGroundings().addAll((Collection<? extends PropertyGrounding>)newValue);
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
			case ChorPackage.CORRELATION_SET_GROUNDING__CORRELATION_SET:
				setCorrelationSet((CorrelationSet)null);
				return;
			case ChorPackage.CORRELATION_SET_GROUNDING__PROPERTY_GROUNDINGS:
				getPropertyGroundings().clear();
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
			case ChorPackage.CORRELATION_SET_GROUNDING__CORRELATION_SET:
				return correlationSet != null;
			case ChorPackage.CORRELATION_SET_GROUNDING__PROPERTY_GROUNDINGS:
				return propertyGroundings != null && !propertyGroundings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CorrelationSetGroundingImpl
