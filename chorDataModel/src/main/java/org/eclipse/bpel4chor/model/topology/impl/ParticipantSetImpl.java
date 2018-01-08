/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.bpel4chor.model.topology.Participant;
import org.eclipse.bpel4chor.model.topology.ParticipantSet;
import org.eclipse.bpel4chor.model.topology.TopologyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantSetImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantSetImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantSetImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantSetImpl#getParticipantSet <em>Participant Set</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantSetImpl#getParticipant <em>Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantSetImpl extends EObjectImpl implements ParticipantSet
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
         * The default value of the '{@link #getType() <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getType()
         * @generated
         * @ordered
         */
        protected static final String TYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getType()
         * @generated
         * @ordered
         */
        protected String type = TYPE_EDEFAULT;

        /**
         * The cached value of the '{@link #getForEach() <em>For Each</em>}' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getForEach()
         * @generated
         * @ordered
         */
        protected EList<QName> forEach;

        /**
         * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getScope()
         * @generated
         * @ordered
         */
        protected static final QName SCOPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getScope()
         * @generated
         * @ordered
         */
        protected QName scope = SCOPE_EDEFAULT;

        /**
         * The cached value of the '{@link #getParticipantSet() <em>Participant Set</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipantSet()
         * @generated
         * @ordered
         */
        protected EList<ParticipantSet> participantSet;

        /**
         * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipant()
         * @generated
         * @ordered
         */
        protected EList<Participant> participant;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ParticipantSetImpl()
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
                return TopologyPackage.Literals.PARTICIPANT_SET;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT_SET__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getType()
        {
                return type;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setType(String newType)
        {
                String oldType = type;
                type = newType;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT_SET__TYPE, oldType, type));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<QName> getForEach()
        {
                if (forEach == null)
                {
                        forEach = new EDataTypeUniqueEList<QName>(QName.class, this, TopologyPackage.PARTICIPANT_SET__FOR_EACH);
                }
                return forEach;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QName getScope()
        {
                return scope;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setScope(QName newScope)
        {
                QName oldScope = scope;
                scope = newScope;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT_SET__SCOPE, oldScope, scope));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<ParticipantSet> getParticipantSet()
        {
                if (participantSet == null)
                {
                        participantSet = new EObjectContainmentEList<ParticipantSet>(ParticipantSet.class, this, TopologyPackage.PARTICIPANT_SET__PARTICIPANT_SET);
                }
                return participantSet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Participant> getParticipant()
        {
                if (participant == null)
                {
                        participant = new EObjectContainmentEList<Participant>(Participant.class, this, TopologyPackage.PARTICIPANT_SET__PARTICIPANT);
                }
                return participant;
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
                        case TopologyPackage.PARTICIPANT_SET__PARTICIPANT_SET:
                                return ((InternalEList<?>)getParticipantSet()).basicRemove(otherEnd, msgs);
                        case TopologyPackage.PARTICIPANT_SET__PARTICIPANT:
                                return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
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
                        case TopologyPackage.PARTICIPANT_SET__NAME:
                                return getName();
                        case TopologyPackage.PARTICIPANT_SET__TYPE:
                                return getType();
                        case TopologyPackage.PARTICIPANT_SET__FOR_EACH:
                                return getForEach();
                        case TopologyPackage.PARTICIPANT_SET__SCOPE:
                                return getScope();
                        case TopologyPackage.PARTICIPANT_SET__PARTICIPANT_SET:
                                return getParticipantSet();
                        case TopologyPackage.PARTICIPANT_SET__PARTICIPANT:
                                return getParticipant();
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
                        case TopologyPackage.PARTICIPANT_SET__NAME:
                                setName((String)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT_SET__TYPE:
                                setType((String)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT_SET__FOR_EACH:
                                getForEach().clear();
                                getForEach().addAll((Collection<? extends QName>)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT_SET__SCOPE:
                                setScope((QName)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT_SET__PARTICIPANT_SET:
                                getParticipantSet().clear();
                                getParticipantSet().addAll((Collection<? extends ParticipantSet>)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT_SET__PARTICIPANT:
                                getParticipant().clear();
                                getParticipant().addAll((Collection<? extends Participant>)newValue);
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
                        case TopologyPackage.PARTICIPANT_SET__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case TopologyPackage.PARTICIPANT_SET__TYPE:
                                setType(TYPE_EDEFAULT);
                                return;
                        case TopologyPackage.PARTICIPANT_SET__FOR_EACH:
                                getForEach().clear();
                                return;
                        case TopologyPackage.PARTICIPANT_SET__SCOPE:
                                setScope(SCOPE_EDEFAULT);
                                return;
                        case TopologyPackage.PARTICIPANT_SET__PARTICIPANT_SET:
                                getParticipantSet().clear();
                                return;
                        case TopologyPackage.PARTICIPANT_SET__PARTICIPANT:
                                getParticipant().clear();
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
                        case TopologyPackage.PARTICIPANT_SET__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case TopologyPackage.PARTICIPANT_SET__TYPE:
                                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
                        case TopologyPackage.PARTICIPANT_SET__FOR_EACH:
                                return forEach != null && !forEach.isEmpty();
                        case TopologyPackage.PARTICIPANT_SET__SCOPE:
                                return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
                        case TopologyPackage.PARTICIPANT_SET__PARTICIPANT_SET:
                                return participantSet != null && !participantSet.isEmpty();
                        case TopologyPackage.PARTICIPANT_SET__PARTICIPANT:
                                return participant != null && !participant.isEmpty();
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
                result.append(", type: ");
                result.append(type);
                result.append(", forEach: ");
                result.append(forEach);
                result.append(", scope: ");
                result.append(scope);
                result.append(')');
                return result.toString();
        }

} //ParticipantSetImpl
