/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.chor.CGrounding;
import org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding;
import org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding;
import org.eclipse.bpel4chor.model.chor.ChorPackage;
import org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding;

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
 * An implementation of the model object '<em><b>CGrounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CGroundingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CGroundingImpl#getCMessageLinkGroundings <em>CMessage Link Groundings</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CGroundingImpl#getCorrelationSetGroundings <em>Correlation Set Groundings</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.CGroundingImpl#getCParticipantRefGroundings <em>CParticipant Ref Groundings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CGroundingImpl extends EObjectImpl implements CGrounding
{
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
	 * The cached value of the '{@link #getCMessageLinkGroundings() <em>CMessage Link Groundings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCMessageLinkGroundings()
	 * @generated
	 * @ordered
	 */
        protected EList<CMessageLinkGrounding> cMessageLinkGroundings;

        /**
	 * The cached value of the '{@link #getCorrelationSetGroundings() <em>Correlation Set Groundings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCorrelationSetGroundings()
	 * @generated
	 * @ordered
	 */
        protected EList<CorrelationSetGrounding> correlationSetGroundings;

        /**
	 * The cached value of the '{@link #getCParticipantRefGroundings() <em>CParticipant Ref Groundings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCParticipantRefGroundings()
	 * @generated
	 * @ordered
	 */
        protected EList<CParticipantRefGrounding> cParticipantRefGroundings;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected CGroundingImpl()
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
		return ChorPackage.Literals.CGROUNDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CGROUNDING__NAME, oldName, name));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CMessageLinkGrounding> getCMessageLinkGroundings()
        {
		if (cMessageLinkGroundings == null) {
			cMessageLinkGroundings = new EObjectContainmentEList<CMessageLinkGrounding>(CMessageLinkGrounding.class, this, ChorPackage.CGROUNDING__CMESSAGE_LINK_GROUNDINGS);
		}
		return cMessageLinkGroundings;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CorrelationSetGrounding> getCorrelationSetGroundings()
        {
		if (correlationSetGroundings == null) {
			correlationSetGroundings = new EObjectContainmentEList<CorrelationSetGrounding>(CorrelationSetGrounding.class, this, ChorPackage.CGROUNDING__CORRELATION_SET_GROUNDINGS);
		}
		return correlationSetGroundings;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CParticipantRefGrounding> getCParticipantRefGroundings()
        {
		if (cParticipantRefGroundings == null) {
			cParticipantRefGroundings = new EObjectContainmentEList<CParticipantRefGrounding>(CParticipantRefGrounding.class, this, ChorPackage.CGROUNDING__CPARTICIPANT_REF_GROUNDINGS);
		}
		return cParticipantRefGroundings;
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
			case ChorPackage.CGROUNDING__CMESSAGE_LINK_GROUNDINGS:
				return ((InternalEList<?>)getCMessageLinkGroundings()).basicRemove(otherEnd, msgs);
			case ChorPackage.CGROUNDING__CORRELATION_SET_GROUNDINGS:
				return ((InternalEList<?>)getCorrelationSetGroundings()).basicRemove(otherEnd, msgs);
			case ChorPackage.CGROUNDING__CPARTICIPANT_REF_GROUNDINGS:
				return ((InternalEList<?>)getCParticipantRefGroundings()).basicRemove(otherEnd, msgs);
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
			case ChorPackage.CGROUNDING__NAME:
				return getName();
			case ChorPackage.CGROUNDING__CMESSAGE_LINK_GROUNDINGS:
				return getCMessageLinkGroundings();
			case ChorPackage.CGROUNDING__CORRELATION_SET_GROUNDINGS:
				return getCorrelationSetGroundings();
			case ChorPackage.CGROUNDING__CPARTICIPANT_REF_GROUNDINGS:
				return getCParticipantRefGroundings();
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
			case ChorPackage.CGROUNDING__NAME:
				setName((String)newValue);
				return;
			case ChorPackage.CGROUNDING__CMESSAGE_LINK_GROUNDINGS:
				getCMessageLinkGroundings().clear();
				getCMessageLinkGroundings().addAll((Collection<? extends CMessageLinkGrounding>)newValue);
				return;
			case ChorPackage.CGROUNDING__CORRELATION_SET_GROUNDINGS:
				getCorrelationSetGroundings().clear();
				getCorrelationSetGroundings().addAll((Collection<? extends CorrelationSetGrounding>)newValue);
				return;
			case ChorPackage.CGROUNDING__CPARTICIPANT_REF_GROUNDINGS:
				getCParticipantRefGroundings().clear();
				getCParticipantRefGroundings().addAll((Collection<? extends CParticipantRefGrounding>)newValue);
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
			case ChorPackage.CGROUNDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChorPackage.CGROUNDING__CMESSAGE_LINK_GROUNDINGS:
				getCMessageLinkGroundings().clear();
				return;
			case ChorPackage.CGROUNDING__CORRELATION_SET_GROUNDINGS:
				getCorrelationSetGroundings().clear();
				return;
			case ChorPackage.CGROUNDING__CPARTICIPANT_REF_GROUNDINGS:
				getCParticipantRefGroundings().clear();
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
			case ChorPackage.CGROUNDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChorPackage.CGROUNDING__CMESSAGE_LINK_GROUNDINGS:
				return cMessageLinkGroundings != null && !cMessageLinkGroundings.isEmpty();
			case ChorPackage.CGROUNDING__CORRELATION_SET_GROUNDINGS:
				return correlationSetGroundings != null && !correlationSetGroundings.isEmpty();
			case ChorPackage.CGROUNDING__CPARTICIPANT_REF_GROUNDINGS:
				return cParticipantRefGroundings != null && !cParticipantRefGroundings.isEmpty();
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

} //CGroundingImpl
