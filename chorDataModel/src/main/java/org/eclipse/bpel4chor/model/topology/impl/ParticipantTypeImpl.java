/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.impl;

import javax.xml.namespace.QName;

import org.eclipse.bpel4chor.model.topology.ParticipantType;
import org.eclipse.bpel4chor.model.topology.TopologyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantTypeImpl#getParticipantBehaviorDescription <em>Participant Behavior Description</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.impl.ParticipantTypeImpl#getProcessLanguage <em>Process Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantTypeImpl extends EObjectImpl implements ParticipantType
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
         * The default value of the '{@link #getParticipantBehaviorDescription() <em>Participant Behavior Description</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipantBehaviorDescription()
         * @generated
         * @ordered
         */
        protected static final QName PARTICIPANT_BEHAVIOR_DESCRIPTION_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getParticipantBehaviorDescription() <em>Participant Behavior Description</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipantBehaviorDescription()
         * @generated
         * @ordered
         */
        protected QName participantBehaviorDescription = PARTICIPANT_BEHAVIOR_DESCRIPTION_EDEFAULT;

        /**
         * The default value of the '{@link #getProcessLanguage() <em>Process Language</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getProcessLanguage()
         * @generated
         * @ordered
         */
        protected static final String PROCESS_LANGUAGE_EDEFAULT = "urn:HPI_IAAS:choreography:profile:2006/12";

        /**
         * The cached value of the '{@link #getProcessLanguage() <em>Process Language</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getProcessLanguage()
         * @generated
         * @ordered
         */
        protected String processLanguage = PROCESS_LANGUAGE_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ParticipantTypeImpl()
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
                return TopologyPackage.Literals.PARTICIPANT_TYPE;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT_TYPE__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QName getParticipantBehaviorDescription()
        {
                return participantBehaviorDescription;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setParticipantBehaviorDescription(QName newParticipantBehaviorDescription)
        {
                QName oldParticipantBehaviorDescription = participantBehaviorDescription;
                participantBehaviorDescription = newParticipantBehaviorDescription;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT_TYPE__PARTICIPANT_BEHAVIOR_DESCRIPTION, oldParticipantBehaviorDescription, participantBehaviorDescription));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getProcessLanguage()
        {
                return processLanguage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setProcessLanguage(String newProcessLanguage)
        {
                String oldProcessLanguage = processLanguage;
                processLanguage = newProcessLanguage;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.PARTICIPANT_TYPE__PROCESS_LANGUAGE, oldProcessLanguage, processLanguage));
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
                        case TopologyPackage.PARTICIPANT_TYPE__NAME:
                                return getName();
                        case TopologyPackage.PARTICIPANT_TYPE__PARTICIPANT_BEHAVIOR_DESCRIPTION:
                                return getParticipantBehaviorDescription();
                        case TopologyPackage.PARTICIPANT_TYPE__PROCESS_LANGUAGE:
                                return getProcessLanguage();
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
                        case TopologyPackage.PARTICIPANT_TYPE__NAME:
                                setName((String)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT_TYPE__PARTICIPANT_BEHAVIOR_DESCRIPTION:
                                setParticipantBehaviorDescription((QName)newValue);
                                return;
                        case TopologyPackage.PARTICIPANT_TYPE__PROCESS_LANGUAGE:
                                setProcessLanguage((String)newValue);
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
                        case TopologyPackage.PARTICIPANT_TYPE__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case TopologyPackage.PARTICIPANT_TYPE__PARTICIPANT_BEHAVIOR_DESCRIPTION:
                                setParticipantBehaviorDescription(PARTICIPANT_BEHAVIOR_DESCRIPTION_EDEFAULT);
                                return;
                        case TopologyPackage.PARTICIPANT_TYPE__PROCESS_LANGUAGE:
                                setProcessLanguage(PROCESS_LANGUAGE_EDEFAULT);
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
                        case TopologyPackage.PARTICIPANT_TYPE__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case TopologyPackage.PARTICIPANT_TYPE__PARTICIPANT_BEHAVIOR_DESCRIPTION:
                                return PARTICIPANT_BEHAVIOR_DESCRIPTION_EDEFAULT == null ? participantBehaviorDescription != null : !PARTICIPANT_BEHAVIOR_DESCRIPTION_EDEFAULT.equals(participantBehaviorDescription);
                        case TopologyPackage.PARTICIPANT_TYPE__PROCESS_LANGUAGE:
                                return PROCESS_LANGUAGE_EDEFAULT == null ? processLanguage != null : !PROCESS_LANGUAGE_EDEFAULT.equals(processLanguage);
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
                result.append(", participantBehaviorDescription: ");
                result.append(participantBehaviorDescription);
                result.append(", processLanguage: ");
                result.append(processLanguage);
                result.append(')');
                return result.toString();
        }

} //ParticipantTypeImpl
