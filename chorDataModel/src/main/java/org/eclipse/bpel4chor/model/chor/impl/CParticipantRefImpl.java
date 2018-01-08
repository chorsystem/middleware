/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantRef;
import org.eclipse.bpel4chor.model.chor.ChorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CParticipant Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantRefImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CParticipantRefImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CParticipantRefImpl extends EObjectImpl implements CParticipantRef
{
        /**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
        protected CParticipant participant;

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
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected CParticipantRefImpl()
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
		return ChorPackage.Literals.CPARTICIPANT_REF;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipant getParticipant()
        {
		if (participant != null && participant.eIsProxy()) {
			InternalEObject oldParticipant = (InternalEObject)participant;
			participant = (CParticipant)eResolveProxy(oldParticipant);
			if (participant != oldParticipant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.CPARTICIPANT_REF__PARTICIPANT, oldParticipant, participant));
			}
		}
		return participant;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipant basicGetParticipant()
        {
		return participant;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setParticipant(CParticipant newParticipant)
        {
		CParticipant oldParticipant = participant;
		participant = newParticipant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CPARTICIPANT_REF__PARTICIPANT, oldParticipant, participant));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getName()
        {
		return name;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setName(String newName)
        {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CPARTICIPANT_REF__NAME, oldName, name));
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
			case ChorPackage.CPARTICIPANT_REF__PARTICIPANT:
				if (resolve) return getParticipant();
				return basicGetParticipant();
			case ChorPackage.CPARTICIPANT_REF__NAME:
				return getName();
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
			case ChorPackage.CPARTICIPANT_REF__PARTICIPANT:
				setParticipant((CParticipant)newValue);
				return;
			case ChorPackage.CPARTICIPANT_REF__NAME:
				setName((String)newValue);
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
			case ChorPackage.CPARTICIPANT_REF__PARTICIPANT:
				setParticipant((CParticipant)null);
				return;
			case ChorPackage.CPARTICIPANT_REF__NAME:
				setName(NAME_EDEFAULT);
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
			case ChorPackage.CPARTICIPANT_REF__PARTICIPANT:
				return participant != null;
			case ChorPackage.CPARTICIPANT_REF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //CParticipantRefImpl
