/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import org.eclipse.bpel4chor.model.chor.CQName;
import org.eclipse.bpel4chor.model.chor.ChorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CQ Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CQNameImpl#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CQNameImpl#getLocalPart <em>Local Part</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CQNameImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CQNameImpl extends EObjectImpl implements CQName
{
        /**
	 * The default value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
        protected static final String NS_URI_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
        protected String nsURI = NS_URI_EDEFAULT;

        /**
	 * The default value of the '{@link #getLocalPart() <em>Local Part</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getLocalPart()
	 * @generated
	 * @ordered
	 */
        protected static final String LOCAL_PART_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getLocalPart() <em>Local Part</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getLocalPart()
	 * @generated
	 * @ordered
	 */
        protected String localPart = LOCAL_PART_EDEFAULT;

        /**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
        protected static final String PREFIX_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
        protected String prefix = PREFIX_EDEFAULT;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected CQNameImpl()
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
		return ChorPackage.Literals.CQ_NAME;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getNsURI()
        {
		return nsURI;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setNsURI(String newNsURI)
        {
		String oldNsURI = nsURI;
		nsURI = newNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CQ_NAME__NS_URI, oldNsURI, nsURI));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getLocalPart()
        {
		return localPart;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setLocalPart(String newLocalPart)
        {
		String oldLocalPart = localPart;
		localPart = newLocalPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CQ_NAME__LOCAL_PART, oldLocalPart, localPart));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getPrefix()
        {
		return prefix;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setPrefix(String newPrefix)
        {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CQ_NAME__PREFIX, oldPrefix, prefix));
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
			case ChorPackage.CQ_NAME__NS_URI:
				return getNsURI();
			case ChorPackage.CQ_NAME__LOCAL_PART:
				return getLocalPart();
			case ChorPackage.CQ_NAME__PREFIX:
				return getPrefix();
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
			case ChorPackage.CQ_NAME__NS_URI:
				setNsURI((String)newValue);
				return;
			case ChorPackage.CQ_NAME__LOCAL_PART:
				setLocalPart((String)newValue);
				return;
			case ChorPackage.CQ_NAME__PREFIX:
				setPrefix((String)newValue);
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
			case ChorPackage.CQ_NAME__NS_URI:
				setNsURI(NS_URI_EDEFAULT);
				return;
			case ChorPackage.CQ_NAME__LOCAL_PART:
				setLocalPart(LOCAL_PART_EDEFAULT);
				return;
			case ChorPackage.CQ_NAME__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
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
			case ChorPackage.CQ_NAME__NS_URI:
				return NS_URI_EDEFAULT == null ? nsURI != null : !NS_URI_EDEFAULT.equals(nsURI);
			case ChorPackage.CQ_NAME__LOCAL_PART:
				return LOCAL_PART_EDEFAULT == null ? localPart != null : !LOCAL_PART_EDEFAULT.equals(localPart);
			case ChorPackage.CQ_NAME__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
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
		result.append(" (nsURI: ");
		result.append(nsURI);
		result.append(", localPart: ");
		result.append(localPart);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} //CQNameImpl
