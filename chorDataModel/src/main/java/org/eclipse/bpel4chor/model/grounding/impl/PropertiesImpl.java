/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.grounding.GroundingPackage;
import org.eclipse.bpel4chor.model.grounding.Properties;
import org.eclipse.bpel4chor.model.grounding.Property;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.PropertiesImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesImpl extends EObjectImpl implements Properties
{
        /**
         * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getProperty()
         * @generated
         * @ordered
         */
        protected EList<Property> property;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected PropertiesImpl()
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
                return GroundingPackage.Literals.PROPERTIES;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Property> getProperty()
        {
                if (property == null)
                {
                        property = new EObjectContainmentEList<Property>(Property.class, this, GroundingPackage.PROPERTIES__PROPERTY);
                }
                return property;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
        {
                switch (featureID)
                {
                        case GroundingPackage.PROPERTIES__PROPERTY:
                                return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
                switch (featureID)
                {
                        case GroundingPackage.PROPERTIES__PROPERTY:
                                return getProperty();
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
                switch (featureID)
                {
                        case GroundingPackage.PROPERTIES__PROPERTY:
                                getProperty().clear();
                                getProperty().addAll((Collection<? extends Property>)newValue);
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
                switch (featureID)
                {
                        case GroundingPackage.PROPERTIES__PROPERTY:
                                getProperty().clear();
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
                switch (featureID)
                {
                        case GroundingPackage.PROPERTIES__PROPERTY:
                                return property != null && !property.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //PropertiesImpl
