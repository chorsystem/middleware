/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.util;

import java.util.Map;
import org.eclipse.bpel4chor.model.chor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage
 * @generated
 */
public class ChorAdapterFactory extends AdapterFactoryImpl
{
        /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected static ChorPackage modelPackage;

        /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ChorAdapterFactory()
        {
		if (modelPackage == null) {
			modelPackage = ChorPackage.eINSTANCE;
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
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
        protected ChorSwitch<Adapter> modelSwitch =
                new ChorSwitch<Adapter>() {
			@Override
			public Adapter caseChoreography(Choreography object) {
				return createChoreographyAdapter();
			}
			@Override
			public Adapter caseCMessageLink(CMessageLink object) {
				return createCMessageLinkAdapter();
			}
			@Override
			public Adapter caseCParticipantRef(CParticipantRef object) {
				return createCParticipantRefAdapter();
			}
			@Override
			public Adapter caseFlowActivityLink(FlowActivityLink object) {
				return createFlowActivityLinkAdapter();
			}
			@Override
			public Adapter caseCParticipantCommon(CParticipantCommon object) {
				return createCParticipantCommonAdapter();
			}
			@Override
			public Adapter caseCParticipant(CParticipant object) {
				return createCParticipantAdapter();
			}
			@Override
			public Adapter caseCParticipantSet(CParticipantSet object) {
				return createCParticipantSetAdapter();
			}
			@Override
			public Adapter caseCGrounding(CGrounding object) {
				return createCGroundingAdapter();
			}
			@Override
			public Adapter caseCorrelationSetGrounding(CorrelationSetGrounding object) {
				return createCorrelationSetGroundingAdapter();
			}
			@Override
			public Adapter casePropertyGrounding(PropertyGrounding object) {
				return createPropertyGroundingAdapter();
			}
			@Override
			public Adapter caseCMessageLinkGrounding(CMessageLinkGrounding object) {
				return createCMessageLinkGroundingAdapter();
			}
			@Override
			public Adapter caseCParticipantRefGrounding(CParticipantRefGrounding object) {
				return createCParticipantRefGroundingAdapter();
			}
			@Override
			public Adapter caseCQName(CQName object) {
				return createCQNameAdapter();
			}
			@Override
			public Adapter caseForEachIterationSpec(ForEachIterationSpec object) {
				return createForEachIterationSpecAdapter();
			}
			@Override
			public Adapter caseAbstractConnectorLink(AbstractConnectorLink object) {
				return createAbstractConnectorLinkAdapter();
			}
			@Override
			public Adapter caseProcessInstance(ProcessInstance object) {
				return createProcessInstanceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.Choreography
	 * @generated
	 */
        public Adapter createChoreographyAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.CMessageLink <em>CMessage Link</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLink
	 * @generated
	 */
        public Adapter createCMessageLinkAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.CParticipantRef <em>CParticipant Ref</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantRef
	 * @generated
	 */
        public Adapter createCParticipantRefAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink <em>Flow Activity Link</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.FlowActivityLink
	 * @generated
	 */
        public Adapter createFlowActivityLinkAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.CParticipantCommon <em>CParticipant Common</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantCommon
	 * @generated
	 */
        public Adapter createCParticipantCommonAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.CParticipant <em>CParticipant</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipant
	 * @generated
	 */
        public Adapter createCParticipantAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.CParticipantSet <em>CParticipant Set</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantSet
	 * @generated
	 */
        public Adapter createCParticipantSetAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.CGrounding <em>CGrounding</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.CGrounding
	 * @generated
	 */
        public Adapter createCGroundingAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding <em>Correlation Set Grounding</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding
	 * @generated
	 */
        public Adapter createCorrelationSetGroundingAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.PropertyGrounding <em>Property Grounding</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.PropertyGrounding
	 * @generated
	 */
        public Adapter createPropertyGroundingAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding <em>CMessage Link Grounding</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding
	 * @generated
	 */
        public Adapter createCMessageLinkGroundingAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding <em>CParticipant Ref Grounding</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding
	 * @generated
	 */
        public Adapter createCParticipantRefGroundingAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.CQName <em>CQ Name</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.CQName
	 * @generated
	 */
        public Adapter createCQNameAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec <em>For Each Iteration Spec</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.ForEachIterationSpec
	 * @generated
	 */
        public Adapter createForEachIterationSpecAdapter()
        {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.AbstractConnectorLink <em>Abstract Connector Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.AbstractConnectorLink
	 * @generated
	 */
	public Adapter createAbstractConnectorLinkAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpel4chor.model.chor.ProcessInstance <em>Process Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpel4chor.model.chor.ProcessInstance
	 * @generated
	 */
	public Adapter createProcessInstanceAdapter() {
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

} //ChorAdapterFactory
