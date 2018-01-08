/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.bpel4chor.model.grounding.GroundingPackage;
import org.eclipse.bpel4chor.model.grounding.MessageLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl#getSenders <em>Senders</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl#getExpectedPortType <em>Expected Port Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl#getExpectedOperation <em>Expected Operation</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl#getMediator <em>Mediator</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl#getOfferedPortType <em>Offered Port Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.impl.MessageLinkImpl#getOfferedOperation <em>Offered Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageLinkImpl extends EObjectImpl implements MessageLink
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
         * The default value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getPortType()
         * @generated
         * @ordered
         */
        protected static final QName PORT_TYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getPortType()
         * @generated
         * @ordered
         */
        protected QName portType = PORT_TYPE_EDEFAULT;

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
         * The cached value of the '{@link #getSenders() <em>Senders</em>}' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSenders()
         * @generated
         * @ordered
         */
        protected EList<QName> senders;

        /**
         * The default value of the '{@link #getExpectedPortType() <em>Expected Port Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getExpectedPortType()
         * @generated
         * @ordered
         */
        protected static final QName EXPECTED_PORT_TYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getExpectedPortType() <em>Expected Port Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getExpectedPortType()
         * @generated
         * @ordered
         */
        protected QName expectedPortType = EXPECTED_PORT_TYPE_EDEFAULT;

        /**
         * The default value of the '{@link #getExpectedOperation() <em>Expected Operation</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getExpectedOperation()
         * @generated
         * @ordered
         */
        protected static final String EXPECTED_OPERATION_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getExpectedOperation() <em>Expected Operation</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getExpectedOperation()
         * @generated
         * @ordered
         */
        protected String expectedOperation = EXPECTED_OPERATION_EDEFAULT;

        /**
         * The default value of the '{@link #getMediator() <em>Mediator</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMediator()
         * @generated
         * @ordered
         */
        protected static final String MEDIATOR_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getMediator() <em>Mediator</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMediator()
         * @generated
         * @ordered
         */
        protected String mediator = MEDIATOR_EDEFAULT;

        /**
         * The default value of the '{@link #getOfferedPortType() <em>Offered Port Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOfferedPortType()
         * @generated
         * @ordered
         */
        protected static final QName OFFERED_PORT_TYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getOfferedPortType() <em>Offered Port Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOfferedPortType()
         * @generated
         * @ordered
         */
        protected QName offeredPortType = OFFERED_PORT_TYPE_EDEFAULT;

        /**
         * The default value of the '{@link #getOfferedOperation() <em>Offered Operation</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOfferedOperation()
         * @generated
         * @ordered
         */
        protected static final String OFFERED_OPERATION_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getOfferedOperation() <em>Offered Operation</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOfferedOperation()
         * @generated
         * @ordered
         */
        protected String offeredOperation = OFFERED_OPERATION_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MessageLinkImpl()
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
                return GroundingPackage.Literals.MESSAGE_LINK;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.MESSAGE_LINK__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QName getPortType()
        {
                return portType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setPortType(QName newPortType)
        {
                QName oldPortType = portType;
                portType = newPortType;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.MESSAGE_LINK__PORT_TYPE, oldPortType, portType));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.MESSAGE_LINK__OPERATION, oldOperation, operation));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<QName> getSenders()
        {
                if (senders == null)
                {
                        senders = new EDataTypeUniqueEList<QName>(QName.class, this, GroundingPackage.MESSAGE_LINK__SENDERS);
                }
                return senders;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QName getExpectedPortType()
        {
                return expectedPortType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setExpectedPortType(QName newExpectedPortType)
        {
                QName oldExpectedPortType = expectedPortType;
                expectedPortType = newExpectedPortType;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.MESSAGE_LINK__EXPECTED_PORT_TYPE, oldExpectedPortType, expectedPortType));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getExpectedOperation()
        {
                return expectedOperation;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setExpectedOperation(String newExpectedOperation)
        {
                String oldExpectedOperation = expectedOperation;
                expectedOperation = newExpectedOperation;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.MESSAGE_LINK__EXPECTED_OPERATION, oldExpectedOperation, expectedOperation));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getMediator()
        {
                return mediator;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMediator(String newMediator)
        {
                String oldMediator = mediator;
                mediator = newMediator;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.MESSAGE_LINK__MEDIATOR, oldMediator, mediator));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QName getOfferedPortType()
        {
                return offeredPortType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setOfferedPortType(QName newOfferedPortType)
        {
                QName oldOfferedPortType = offeredPortType;
                offeredPortType = newOfferedPortType;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.MESSAGE_LINK__OFFERED_PORT_TYPE, oldOfferedPortType, offeredPortType));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getOfferedOperation()
        {
                return offeredOperation;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setOfferedOperation(String newOfferedOperation)
        {
                String oldOfferedOperation = offeredOperation;
                offeredOperation = newOfferedOperation;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.MESSAGE_LINK__OFFERED_OPERATION, oldOfferedOperation, offeredOperation));
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
                        case GroundingPackage.MESSAGE_LINK__NAME:
                                return getName();
                        case GroundingPackage.MESSAGE_LINK__PORT_TYPE:
                                return getPortType();
                        case GroundingPackage.MESSAGE_LINK__OPERATION:
                                return getOperation();
                        case GroundingPackage.MESSAGE_LINK__SENDERS:
                                return getSenders();
                        case GroundingPackage.MESSAGE_LINK__EXPECTED_PORT_TYPE:
                                return getExpectedPortType();
                        case GroundingPackage.MESSAGE_LINK__EXPECTED_OPERATION:
                                return getExpectedOperation();
                        case GroundingPackage.MESSAGE_LINK__MEDIATOR:
                                return getMediator();
                        case GroundingPackage.MESSAGE_LINK__OFFERED_PORT_TYPE:
                                return getOfferedPortType();
                        case GroundingPackage.MESSAGE_LINK__OFFERED_OPERATION:
                                return getOfferedOperation();
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
                        case GroundingPackage.MESSAGE_LINK__NAME:
                                setName((QName)newValue);
                                return;
                        case GroundingPackage.MESSAGE_LINK__PORT_TYPE:
                                setPortType((QName)newValue);
                                return;
                        case GroundingPackage.MESSAGE_LINK__OPERATION:
                                setOperation((String)newValue);
                                return;
                        case GroundingPackage.MESSAGE_LINK__SENDERS:
                                getSenders().clear();
                                getSenders().addAll((Collection<? extends QName>)newValue);
                                return;
                        case GroundingPackage.MESSAGE_LINK__EXPECTED_PORT_TYPE:
                                setExpectedPortType((QName)newValue);
                                return;
                        case GroundingPackage.MESSAGE_LINK__EXPECTED_OPERATION:
                                setExpectedOperation((String)newValue);
                                return;
                        case GroundingPackage.MESSAGE_LINK__MEDIATOR:
                                setMediator((String)newValue);
                                return;
                        case GroundingPackage.MESSAGE_LINK__OFFERED_PORT_TYPE:
                                setOfferedPortType((QName)newValue);
                                return;
                        case GroundingPackage.MESSAGE_LINK__OFFERED_OPERATION:
                                setOfferedOperation((String)newValue);
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
                        case GroundingPackage.MESSAGE_LINK__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case GroundingPackage.MESSAGE_LINK__PORT_TYPE:
                                setPortType(PORT_TYPE_EDEFAULT);
                                return;
                        case GroundingPackage.MESSAGE_LINK__OPERATION:
                                setOperation(OPERATION_EDEFAULT);
                                return;
                        case GroundingPackage.MESSAGE_LINK__SENDERS:
                                getSenders().clear();
                                return;
                        case GroundingPackage.MESSAGE_LINK__EXPECTED_PORT_TYPE:
                                setExpectedPortType(EXPECTED_PORT_TYPE_EDEFAULT);
                                return;
                        case GroundingPackage.MESSAGE_LINK__EXPECTED_OPERATION:
                                setExpectedOperation(EXPECTED_OPERATION_EDEFAULT);
                                return;
                        case GroundingPackage.MESSAGE_LINK__MEDIATOR:
                                setMediator(MEDIATOR_EDEFAULT);
                                return;
                        case GroundingPackage.MESSAGE_LINK__OFFERED_PORT_TYPE:
                                setOfferedPortType(OFFERED_PORT_TYPE_EDEFAULT);
                                return;
                        case GroundingPackage.MESSAGE_LINK__OFFERED_OPERATION:
                                setOfferedOperation(OFFERED_OPERATION_EDEFAULT);
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
                        case GroundingPackage.MESSAGE_LINK__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case GroundingPackage.MESSAGE_LINK__PORT_TYPE:
                                return PORT_TYPE_EDEFAULT == null ? portType != null : !PORT_TYPE_EDEFAULT.equals(portType);
                        case GroundingPackage.MESSAGE_LINK__OPERATION:
                                return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
                        case GroundingPackage.MESSAGE_LINK__SENDERS:
                                return senders != null && !senders.isEmpty();
                        case GroundingPackage.MESSAGE_LINK__EXPECTED_PORT_TYPE:
                                return EXPECTED_PORT_TYPE_EDEFAULT == null ? expectedPortType != null : !EXPECTED_PORT_TYPE_EDEFAULT.equals(expectedPortType);
                        case GroundingPackage.MESSAGE_LINK__EXPECTED_OPERATION:
                                return EXPECTED_OPERATION_EDEFAULT == null ? expectedOperation != null : !EXPECTED_OPERATION_EDEFAULT.equals(expectedOperation);
                        case GroundingPackage.MESSAGE_LINK__MEDIATOR:
                                return MEDIATOR_EDEFAULT == null ? mediator != null : !MEDIATOR_EDEFAULT.equals(mediator);
                        case GroundingPackage.MESSAGE_LINK__OFFERED_PORT_TYPE:
                                return OFFERED_PORT_TYPE_EDEFAULT == null ? offeredPortType != null : !OFFERED_PORT_TYPE_EDEFAULT.equals(offeredPortType);
                        case GroundingPackage.MESSAGE_LINK__OFFERED_OPERATION:
                                return OFFERED_OPERATION_EDEFAULT == null ? offeredOperation != null : !OFFERED_OPERATION_EDEFAULT.equals(offeredOperation);
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
                result.append(", portType: ");
                result.append(portType);
                result.append(", operation: ");
                result.append(operation);
                result.append(", senders: ");
                result.append(senders);
                result.append(", expectedPortType: ");
                result.append(expectedPortType);
                result.append(", expectedOperation: ");
                result.append(expectedOperation);
                result.append(", mediator: ");
                result.append(mediator);
                result.append(", offeredPortType: ");
                result.append(offeredPortType);
                result.append(", offeredOperation: ");
                result.append(offeredOperation);
                result.append(')');
                return result.toString();
        }

} //MessageLinkImpl
