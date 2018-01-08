/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology.util;

import org.eclipse.bpel4chor.model.topology.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage
 * @generated
 */
public class TopologyAdapterFactory extends AdapterFactoryImpl
{
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static TopologyPackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TopologyAdapterFactory()
        {
                if (modelPackage == null)
                {
                        modelPackage = TopologyPackage.eINSTANCE;
                }
        }

        /**
         * Returns whether this factory is applicable for the type of the object.
         * <!-- begin-user-doc -->
         * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
         * <!-- end-user-doc -->
         * @return whether this factory is applicable for the type of the object.
         * @generated
         */
        @Override
        public boolean isFactoryForType(Object object)
        {
                if (object == modelPackage)
                {
                        return true;
                }
                if (object instanceof EObject)
                {
                        return ((EObject)object).eClass().getEPackage() == modelPackage;
                }
                return false;
        }

        /**
         * The switch that delegates to the <code>createXXX</code> methods.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TopologySwitch<Adapter> modelSwitch =
                new TopologySwitch<Adapter>()
                {
                        @Override
                        public Adapter caseTopology(Topology object)
                        {
                                return createTopologyAdapter();
                        }
                        @Override
                        public Adapter caseParticipantType(ParticipantType object)
                        {
                                return createParticipantTypeAdapter();
                        }
                        @Override
                        public Adapter caseParticipant(Participant object)
                        {
                                return createParticipantAdapter();
                        }
                        @Override
                        public Adapter caseParticipantSet(ParticipantSet object)
                        {
                                return createParticipantSetAdapter();
                        }
                        @Override
                        public Adapter caseParticipants(Participants object)
                        {
                                return createParticipantsAdapter();
                        }
                        @Override
                        public Adapter caseMessageLink(MessageLink object)
                        {
                                return createMessageLinkAdapter();
                        }
                        @Override
                        public Adapter caseParticipantTypes(ParticipantTypes object)
                        {
                                return createParticipantTypesAdapter();
                        }
                        @Override
                        public Adapter caseMessageLinks(MessageLinks object)
                        {
                                return createMessageLinksAdapter();
                        }
                        @Override
                        public Adapter defaultCase(EObject object)
                        {
                                return createEObjectAdapter();
                        }
                };

        /**
         * Creates an adapter for the <code>target</code>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param target the object to adapt.
         * @return the adapter for the <code>target</code>.
         * @generated
         */
        @Override
        public Adapter createAdapter(Notifier target)
        {
                return modelSwitch.doSwitch((EObject)target);
        }


        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.topology.Topology <em>Topology</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.topology.Topology
         * @generated
         */
        public Adapter createTopologyAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.topology.ParticipantType <em>Participant Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantType
         * @generated
         */
        public Adapter createParticipantTypeAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.topology.Participant <em>Participant</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.topology.Participant
         * @generated
         */
        public Adapter createParticipantAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.topology.ParticipantSet <em>Participant Set</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantSet
         * @generated
         */
        public Adapter createParticipantSetAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.topology.Participants <em>Participants</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.topology.Participants
         * @generated
         */
        public Adapter createParticipantsAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.topology.MessageLink <em>Message Link</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.topology.MessageLink
         * @generated
         */
        public Adapter createMessageLinkAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.topology.ParticipantTypes <em>Participant Types</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.topology.ParticipantTypes
         * @generated
         */
        public Adapter createParticipantTypesAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.topology.MessageLinks <em>Message Links</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.topology.MessageLinks
         * @generated
         */
        public Adapter createMessageLinksAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for the default case.
         * <!-- begin-user-doc -->
         * This default implementation returns null.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @generated
         */
        public Adapter createEObjectAdapter()
        {
                return null;
        }

} //TopologyAdapterFactory
