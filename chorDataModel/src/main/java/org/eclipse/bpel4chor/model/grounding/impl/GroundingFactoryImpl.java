/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding.impl;

import org.eclipse.bpel4chor.model.grounding.*;

import org.eclipse.emf.ecore.EClass;
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
public class GroundingFactoryImpl extends EFactoryImpl implements GroundingFactory
{
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static GroundingFactory init()
        {
                try
                {
                        GroundingFactory theGroundingFactory = (GroundingFactory)EPackage.Registry.INSTANCE.getEFactory("urn:HPI_IAAS:choreography:schemas:choreography:grounding:2006/12"); 
                        if (theGroundingFactory != null)
                        {
                                return theGroundingFactory;
                        }
                }
                catch (Exception exception)
                {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new GroundingFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public GroundingFactoryImpl()
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
                        case GroundingPackage.GROUNDING: return createGrounding();
                        case GroundingPackage.MESSAGE_LINKS: return createMessageLinks();
                        case GroundingPackage.PARTICIPANT_REFS: return createParticipantRefs();
                        case GroundingPackage.PROPERTIES: return createProperties();
                        case GroundingPackage.MESSAGE_LINK: return createMessageLink();
                        case GroundingPackage.PARTICIPANT_REF: return createParticipantRef();
                        case GroundingPackage.PROPERTY: return createProperty();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Grounding createGrounding()
        {
                GroundingImpl grounding = new GroundingImpl();
                return grounding;
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
        public ParticipantRefs createParticipantRefs()
        {
                ParticipantRefsImpl participantRefs = new ParticipantRefsImpl();
                return participantRefs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Properties createProperties()
        {
                PropertiesImpl properties = new PropertiesImpl();
                return properties;
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
        public ParticipantRef createParticipantRef()
        {
                ParticipantRefImpl participantRef = new ParticipantRefImpl();
                return participantRef;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Property createProperty()
        {
                PropertyImpl property = new PropertyImpl();
                return property;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public GroundingPackage getGroundingPackage()
        {
                return (GroundingPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static GroundingPackage getPackage()
        {
                return GroundingPackage.eINSTANCE;
        }

} //GroundingFactoryImpl
