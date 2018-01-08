/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.bpel4chor.model.topology.Containment;
import org.eclipse.bpel4chor.model.topology.Participant;
import org.eclipse.bpel4chor.model.topology.TopologyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.wst.wsdl.WSDLFactory;
import org.eclipse.wst.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantImpl#getSelects <em>Selects</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantImpl#getContainment <em>Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantImpl extends EObjectImpl implements Participant
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
         * The cached value of the '{@link #getSelects() <em>Selects</em>}' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSelects()
         * @generated
         * @ordered
         */
        protected EList<String> selects;

        /**
         * The default value of the '{@link #getForEach() <em>For Each</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getForEach()
         * @generated
         * @ordered
         */
        protected static final QName FOR_EACH_EDEFAULT = (QName)WSDLFactory.eINSTANCE.createFromString(WSDLPackage.eINSTANCE.getQName(), "");

        /**
         * The cached value of the '{@link #getForEach() <em>For Each</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getForEach()
         * @generated
         * @ordered
         */
        protected QName forEach = FOR_EACH_EDEFAULT;

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
         * The default value of the '{@link #getContainment() <em>Containment</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getContainment()
         * @generated
         * @ordered
         */
        protected static final Containment CONTAINMENT_EDEFAULT = Containment.ADDIFNOTEXISTS;

        /**
         * The cached value of the '{@link #getContainment() <em>Containment</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getContainment()
         * @generated
         * @ordered
         */
        protected Containment containment = CONTAINMENT_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ParticipantImpl()
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
                return TopologyPackage.Literals.PARTICIPANT;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT__NAME, oldName, name));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT__TYPE, oldType, type));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<String> getSelects()
        {
                if (selects == null)
                {
                        selects = new EDataTypeUniqueEList<String>(String.class, this, TopologyPackage.PARTICIPANT__SELECTS);
                }
                return selects;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QName getForEach()
        {
                return forEach;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setForEach(QName newForEach)
        {
                QName oldForEach = forEach;
                forEach = newForEach;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT__FOR_EACH, oldForEach, forEach));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT__SCOPE, oldScope, scope));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Containment getContainment()
        {
                return containment;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setContainment(Containment newContainment)
        {
                Containment oldContainment = containment;
                containment = newContainment == null ? CONTAINMENT_EDEFAULT : newContainment;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT__CONTAINMENT, oldContainment, containment));
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
                        case TopologyPackage.PARTICIPANT__NAME:
                                return getName();
                        case TopologyPackage.PARTICIPANT__TYPE:
                                return getType();
                        case TopologyPackage.PARTICIPANT__SELECTS:
                                return getSelects();
                        case TopologyPackage.PARTICIPANT__FOR_EACH:
                                return getForEach();
                        case TopologyPackage.PARTICIPANT__SCOPE:
                                return getScope();
                        case TopologyPackage.PARTICIPANT__CONTAINMENT:
                                return getContainment();
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
                        case TopologyPackage.PARTICIPANT__NAME:
                                setName((String)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT__TYPE:
                                setType((String)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT__SELECTS:
                                getSelects().clear();
                                getSelects().addAll((Collection<? extends String>)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT__FOR_EACH:
                                setForEach((QName)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT__SCOPE:
                                setScope((QName)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT__CONTAINMENT:
                                setContainment((Containment)newValue);
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
                        case TopologyPackage.PARTICIPANT__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case TopologyPackage.PARTICIPANT__TYPE:
                                setType(TYPE_EDEFAULT);
                                return;
                        case TopologyPackage.PARTICIPANT__SELECTS:
                                getSelects().clear();
                                return;
                        case TopologyPackage.PARTICIPANT__FOR_EACH:
                                setForEach(FOR_EACH_EDEFAULT);
                                return;
                        case TopologyPackage.PARTICIPANT__SCOPE:
                                setScope(SCOPE_EDEFAULT);
                                return;
                        case TopologyPackage.PARTICIPANT__CONTAINMENT:
                                setContainment(CONTAINMENT_EDEFAULT);
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
                        case TopologyPackage.PARTICIPANT__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case TopologyPackage.PARTICIPANT__TYPE:
                                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
                        case TopologyPackage.PARTICIPANT__SELECTS:
                                return selects != null && !selects.isEmpty();
                        case TopologyPackage.PARTICIPANT__FOR_EACH:
                                return FOR_EACH_EDEFAULT == null ? forEach != null : !FOR_EACH_EDEFAULT.equals(forEach);
                        case TopologyPackage.PARTICIPANT__SCOPE:
                                return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
                        case TopologyPackage.PARTICIPANT__CONTAINMENT:
                                return containment != CONTAINMENT_EDEFAULT;
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
                result.append(", selects: ");
                result.append(selects);
                result.append(", forEach: ");
                result.append(forEach);
                result.append(", scope: ");
                result.append(scope);
                result.append(", containment: ");
                result.append(containment);
                result.append(')');
                return result.toString();
        }

} //ParticipantImpl
