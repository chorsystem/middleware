/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding.util;

import org.eclipse.bpel4chor.model.grounding.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage
 * @generated
 */
public class GroundingAdapterFactory extends AdapterFactoryImpl
{
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static GroundingPackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public GroundingAdapterFactory()
        {
                if (modelPackage == null)
                {
                        modelPackage = GroundingPackage.eINSTANCE;
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
        protected GroundingSwitch<Adapter> modelSwitch =
                new GroundingSwitch<Adapter>()
                {
                        @Override
                        public Adapter caseGrounding(Grounding object)
                        {
                                return createGroundingAdapter();
                        }
                        @Override
                        public Adapter caseMessageLinks(MessageLinks object)
                        {
                                return createMessageLinksAdapter();
                        }
                        @Override
                        public Adapter caseParticipantRefs(ParticipantRefs object)
                        {
                                return createParticipantRefsAdapter();
                        }
                        @Override
                        public Adapter caseProperties(Properties object)
                        {
                                return createPropertiesAdapter();
                        }
                        @Override
                        public Adapter caseMessageLink(MessageLink object)
                        {
                                return createMessageLinkAdapter();
                        }
                        @Override
                        public Adapter caseParticipantRef(ParticipantRef object)
                        {
                                return createParticipantRefAdapter();
                        }
                        @Override
                        public Adapter caseProperty(Property object)
                        {
                                return createPropertyAdapter();
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
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.grounding.Grounding <em>Grounding</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.grounding.Grounding
         * @generated
         */
        public Adapter createGroundingAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.grounding.MessageLinks <em>Message Links</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLinks
         * @generated
         */
        public Adapter createMessageLinksAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.grounding.ParticipantRefs <em>Participant Refs</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.grounding.ParticipantRefs
         * @generated
         */
        public Adapter createParticipantRefsAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.grounding.Properties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.grounding.Properties
         * @generated
         */
        public Adapter createPropertiesAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.grounding.MessageLink <em>Message Link</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.grounding.MessageLink
         * @generated
         */
        public Adapter createMessageLinkAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.grounding.ParticipantRef <em>Participant Ref</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.grounding.ParticipantRef
         * @generated
         */
        public Adapter createParticipantRefAdapter()
        {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.grounding.Property <em>Property</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see org.eclipse.bpel4chor.model.grounding.Property
         * @generated
         */
        public Adapter createPropertyAdapter()
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

} //GroundingAdapterFactory
