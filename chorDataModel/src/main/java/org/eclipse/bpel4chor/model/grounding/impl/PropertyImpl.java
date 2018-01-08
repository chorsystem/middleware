/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding.impl;

import javax.xml.namespace.QName;

import org.eclipse.bpel4chor.model.grounding.GroundingPackage;
import org.eclipse.bpel4chor.model.grounding.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.PropertyImpl#getWSDLproperty <em>WSD Lproperty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property
{
        /**
         * The default value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
        protected static final QName NAME_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
        protected QName name = NAME_EDEFAULT;

        /**
         * The default value of the '{@link #getWSDLproperty() <em>WSD Lproperty</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getWSDLproperty()
         * @generated
         * @ordered
         */
        protected static final QName WSD_LPROPERTY_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getWSDLproperty() <em>WSD Lproperty</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getWSDLproperty()
         * @generated
         * @ordered
         */
        protected QName wsdLproperty = WSD_LPROPERTY_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected PropertyImpl()
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
                return GroundingPackage.Literals.PROPERTY;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QName getName()
        {
                return name;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setName(QName newName)
        {
                QName oldName = name;
                name = newName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.PROPERTY__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QName getWSDLproperty()
        {
                return wsdLproperty;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setWSDLproperty(QName newWSDLproperty)
        {
                QName oldWSDLproperty = wsdLproperty;
                wsdLproperty = newWSDLproperty;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.PROPERTY__WSD_LPROPERTY, oldWSDLproperty, wsdLproperty));
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
                        case GroundingPackage.PROPERTY__NAME:
                                return getName();
                        case GroundingPackage.PROPERTY__WSD_LPROPERTY:
                                return getWSDLproperty();
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
                switch (featureID)
                {
                        case GroundingPackage.PROPERTY__NAME:
                                setName((QName)newValue);
                                return;
                        case GroundingPackage.PROPERTY__WSD_LPROPERTY:
                                setWSDLproperty((QName)newValue);
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
                        case GroundingPackage.PROPERTY__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case GroundingPackage.PROPERTY__WSD_LPROPERTY:
                                setWSDLproperty(WSD_LPROPERTY_EDEFAULT);
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
                        case GroundingPackage.PROPERTY__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case GroundingPackage.PROPERTY__WSD_LPROPERTY:
                                return WSD_LPROPERTY_EDEFAULT == null ? wsdLproperty != null : !WSD_LPROPERTY_EDEFAULT.equals(wsdLproperty);
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
                result.append(" (name: ");
                result.append(name);
                result.append(", WSDLproperty: ");
                result.append(wsdLproperty);
                result.append(')');
                return result.toString();
        }

} //PropertyImpl
