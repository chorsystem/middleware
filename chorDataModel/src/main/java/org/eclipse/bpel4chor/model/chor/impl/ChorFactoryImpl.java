/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import java.util.Map;
import org.eclipse.bpel4chor.model.chor.*;

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
public class ChorFactoryImpl extends EFactoryImpl implements ChorFactory
{
        /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static ChorFactory init()
        {
		try {
			ChorFactory theChorFactory = (ChorFactory)EPackage.Registry.INSTANCE.getEFactory("urn:HPI_IAAS:choreography:schemas:choreography:2006/12"); 
			if (theChorFactory != null) {
				return theChorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChorFactoryImpl();
	}

        /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ChorFactoryImpl()
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
		switch (eClass.getClassifierID()) {
			case ChorPackage.CHOREOGRAPHY: return createChoreography();
			case ChorPackage.CMESSAGE_LINK: return createCMessageLink();
			case ChorPackage.CPARTICIPANT_REF: return createCParticipantRef();
			case ChorPackage.FLOW_ACTIVITY_LINK: return createFlowActivityLink();
			case ChorPackage.CPARTICIPANT: return createCParticipant();
			case ChorPackage.CPARTICIPANT_SET: return createCParticipantSet();
			case ChorPackage.CGROUNDING: return createCGrounding();
			case ChorPackage.CORRELATION_SET_GROUNDING: return createCorrelationSetGrounding();
			case ChorPackage.PROPERTY_GROUNDING: return createPropertyGrounding();
			case ChorPackage.CMESSAGE_LINK_GROUNDING: return createCMessageLinkGrounding();
			case ChorPackage.CPARTICIPANT_REF_GROUNDING: return createCParticipantRefGrounding();
			case ChorPackage.CQ_NAME: return createCQName();
			case ChorPackage.FOR_EACH_ITERATION_SPEC: return createForEachIterationSpec();
			case ChorPackage.ABSTRACT_CONNECTOR_LINK: return createAbstractConnectorLink();
			case ChorPackage.PROCESS_INSTANCE: return createProcessInstance();
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
		switch (eDataType.getClassifierID()) {
			case ChorPackage.PCONTAINMENT:
				return createPContainmentFromString(eDataType, initialValue);
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
		switch (eDataType.getClassifierID()) {
			case ChorPackage.PCONTAINMENT:
				return convertPContainmentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public Choreography createChoreography()
        {
		ChoreographyImpl choreography = new ChoreographyImpl();
		return choreography;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CMessageLink createCMessageLink()
        {
		CMessageLinkImpl cMessageLink = new CMessageLinkImpl();
		return cMessageLink;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipantRef createCParticipantRef()
        {
		CParticipantRefImpl cParticipantRef = new CParticipantRefImpl();
		return cParticipantRef;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public FlowActivityLink createFlowActivityLink()
        {
		FlowActivityLinkImpl flowActivityLink = new FlowActivityLinkImpl();
		return flowActivityLink;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipant createCParticipant()
        {
		CParticipantImpl cParticipant = new CParticipantImpl();
		return cParticipant;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipantSet createCParticipantSet()
        {
		CParticipantSetImpl cParticipantSet = new CParticipantSetImpl();
		return cParticipantSet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CGrounding createCGrounding()
        {
		CGroundingImpl cGrounding = new CGroundingImpl();
		return cGrounding;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CorrelationSetGrounding createCorrelationSetGrounding()
        {
		CorrelationSetGroundingImpl correlationSetGrounding = new CorrelationSetGroundingImpl();
		return correlationSetGrounding;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public PropertyGrounding createPropertyGrounding()
        {
		PropertyGroundingImpl propertyGrounding = new PropertyGroundingImpl();
		return propertyGrounding;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CMessageLinkGrounding createCMessageLinkGrounding()
        {
		CMessageLinkGroundingImpl cMessageLinkGrounding = new CMessageLinkGroundingImpl();
		return cMessageLinkGrounding;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CParticipantRefGrounding createCParticipantRefGrounding()
        {
		CParticipantRefGroundingImpl cParticipantRefGrounding = new CParticipantRefGroundingImpl();
		return cParticipantRefGrounding;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CQName createCQName()
        {
		CQNameImpl cqName = new CQNameImpl();
		return cqName;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ForEachIterationSpec createForEachIterationSpec()
        {
		ForEachIterationSpecImpl forEachIterationSpec = new ForEachIterationSpecImpl();
		return forEachIterationSpec;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectorLink createAbstractConnectorLink() {
		AbstractConnectorLinkImpl abstractConnectorLink = new AbstractConnectorLinkImpl();
		return abstractConnectorLink;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstance createProcessInstance() {
		ProcessInstanceImpl processInstance = new ProcessInstanceImpl();
		return processInstance;
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public PContainment createPContainmentFromString(EDataType eDataType, String initialValue)
        {
		PContainment result = PContainment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String convertPContainmentToString(EDataType eDataType, Object instanceValue)
        {
		return instanceValue == null ? null : instanceValue.toString();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ChorPackage getChorPackage()
        {
		return (ChorPackage)getEPackage();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
        @Deprecated
        public static ChorPackage getPackage()
        {
		return ChorPackage.eINSTANCE;
	}

} //ChorFactoryImpl
