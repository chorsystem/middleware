/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.impl;

import org.eclipse.bpel4chor.model.topology.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyFactoryImpl extends EFactoryImpl implements TopologyFactory
{
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static TopologyFactory init()
        {
                try
                {
                        TopologyFactory theTopologyFactory = (TopologyFactory)EPackage.Registry.INSTANCE.getEFactory("urn:HPI_IAAS:choreography:schemas:choreography:topology:2006/12"); 
                        if (theTopologyFactory != null)
                        {
                                return theTopologyFactory;
                        }
                }
                catch (Exception exception)
                {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new TopologyFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TopologyFactoryImpl()
        {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EObject create(EClass eClass)
        {
                switch (eClass.getClassifierID())
                {
                        case TopologyPackage.TOPOLOGY: return createTopology();
                        case TopologyPackage.PARTICIPANT_TYPE: return createParticipantType();
                        case TopologyPackage.PARTICIPANT: return createParticipant();
                        case TopologyPackage.PARTICIPANT_SET: return createParticipantSet();
                        case TopologyPackage.PARTICIPANTS: return createParticipants();
                        case TopologyPackage.MESSAGE_LINK: return createMessageLink();
                        case TopologyPackage.PARTICIPANT_TYPES: return createParticipantTypes();
                        case TopologyPackage.MESSAGE_LINKS: return createMessageLinks();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object createFromString(EDataType eDataType, String initialValue)
        {
                switch (eDataType.getClassifierID())
                {
                        case TopologyPackage.CONTAINMENT:
                                return createContainmentFromString(eDataType, initialValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String convertToString(EDataType eDataType, Object instanceValue)
        {
                switch (eDataType.getClassifierID())
                {
                        case TopologyPackage.CONTAINMENT:
                                return convertContainmentToString(eDataType, instanceValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Topology createTopology()
        {
                TopologyImpl topology = new TopologyImpl();
                return topology;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParticipantType createParticipantType()
        {
                ParticipantTypeImpl participantType = new ParticipantTypeImpl();
                return participantType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Participant createParticipant()
        {
                ParticipantImpl participant = new ParticipantImpl();
                return participant;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParticipantSet createParticipantSet()
        {
                ParticipantSetImpl participantSet = new ParticipantSetImpl();
                return participantSet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Participants createParticipants()
        {
                ParticipantsImpl participants = new ParticipantsImpl();
                return participants;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MessageLink createMessageLink()
        {
                MessageLinkImpl messageLink = new MessageLinkImpl();
                return messageLink;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParticipantTypes createParticipantTypes()
        {
                ParticipantTypesImpl participantTypes = new ParticipantTypesImpl();
                return participantTypes;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MessageLinks createMessageLinks()
        {
                MessageLinksImpl messageLinks = new MessageLinksImpl();
                return messageLinks;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Containment createContainmentFromString(EDataType eDataType, String initialValue)
        {
                Containment result = Containment.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertContainmentToString(EDataType eDataType, Object instanceValue)
        {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TopologyPackage getTopologyPackage()
        {
                return (TopologyPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static TopologyPackage getPackage()
        {
                return TopologyPackage.eINSTANCE;
        }

} //TopologyFactoryImpl
