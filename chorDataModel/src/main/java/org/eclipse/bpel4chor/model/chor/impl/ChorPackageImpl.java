/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage;
import org.eclipse.bpel4chor.model.chor.AbstractConnectorLink;
import org.eclipse.bpel4chor.model.chor.CGrounding;
import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding;
import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantCommon;
import org.eclipse.bpel4chor.model.chor.CParticipantRef;
import org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding;
import org.eclipse.bpel4chor.model.chor.CParticipantSet;
import org.eclipse.bpel4chor.model.chor.CQName;
import org.eclipse.bpel4chor.model.chor.ChorFactory;
import org.eclipse.bpel4chor.model.chor.ChorPackage;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding;
import org.eclipse.bpel4chor.model.chor.FlowActivityLink;
import org.eclipse.bpel4chor.model.chor.ForEachIterationSpec;
import org.eclipse.bpel4chor.model.chor.PContainment;
import org.eclipse.bpel4chor.model.chor.ProcessInstance;
import org.eclipse.bpel4chor.model.chor.PropertyGrounding;
import org.eclipse.bpel4chor.model.chor.common.CommonPackage;
import org.eclipse.bpel4chor.model.chor.common.impl.CommonPackageImpl;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChorPackageImpl extends EPackageImpl implements ChorPackage
{
        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass choreographyEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass cMessageLinkEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass cParticipantRefEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass flowActivityLinkEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass cParticipantCommonEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass cParticipantEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass cParticipantSetEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass cGroundingEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass correlationSetGroundingEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass propertyGroundingEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass cMessageLinkGroundingEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass cParticipantRefGroundingEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass cqNameEClass = null;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass forEachIterationSpecEClass = null;

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConnectorLinkEClass = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processInstanceEClass = null;

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EEnum pContainmentEEnum = null;

        /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
        private ChorPackageImpl()
        {
		super(eNS_URI, ChorFactory.eINSTANCE);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static boolean isInited = false;

        /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ChorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
        public static ChorPackage init()
        {
		if (isInited) return (ChorPackage)EPackage.Registry.INSTANCE.getEPackage(ChorPackage.eNS_URI);

		// Obtain or create and register package
		ChorPackageImpl theChorPackage = (ChorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AbstractconstructsPackage.eINSTANCE.eClass();
		GlobalDataModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);

		// Create package meta-data objects
		theChorPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theChorPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChorPackage.eNS_URI, theChorPackage);
		return theChorPackage;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getChoreography()
        {
		return choreographyEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getChoreography_Name()
        {
		return (EAttribute)choreographyEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getChoreography_TargetNamespace()
        {
		return (EAttribute)choreographyEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getChoreography_Participants()
        {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getChoreography_ParticipantSets()
        {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(3);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getChoreography_MessageLinks()
        {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(4);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getChoreography_ParticipantRefs()
        {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(5);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getChoreography_FlowActivityLinks()
        {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(6);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getChoreography_Groundings()
        {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(7);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getChoreography_ForEachIterationSpecs()
        {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(8);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_AbstractConnectorLinks() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(9);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_GlobalDataModel() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(10);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCMessageLink()
        {
		return cMessageLinkEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCMessageLink_SendActivity()
        {
		return (EReference)cMessageLinkEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCMessageLink_ReceiveActivity()
        {
		return (EReference)cMessageLinkEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCMessageLink_ParticipantRefs()
        {
		return (EReference)cMessageLinkEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCMessageLink_BindSenderTo()
        {
		return (EReference)cMessageLinkEClass.getEStructuralFeatures().get(3);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCMessageLink_Sender()
        {
		return (EReference)cMessageLinkEClass.getEStructuralFeatures().get(4);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCMessageLink_Senders()
        {
		return (EReference)cMessageLinkEClass.getEStructuralFeatures().get(5);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCMessageLink_Receiver()
        {
		return (EReference)cMessageLinkEClass.getEStructuralFeatures().get(6);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getCMessageLink_MessageName()
        {
		return (EAttribute)cMessageLinkEClass.getEStructuralFeatures().get(7);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getCMessageLink_Name()
        {
		return (EAttribute)cMessageLinkEClass.getEStructuralFeatures().get(8);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMessageLink_State() {
		return (EAttribute)cMessageLinkEClass.getEStructuralFeatures().get(9);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMessageLink_Id() {
		return (EAttribute)cMessageLinkEClass.getEStructuralFeatures().get(10);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMessageLink_InstanceID() {
		return (EAttribute)cMessageLinkEClass.getEStructuralFeatures().get(11);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMessageLink_InstanceBuffer() {
		return (EReference)cMessageLinkEClass.getEStructuralFeatures().get(12);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCParticipantRef()
        {
		return cParticipantRefEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCParticipantRef_Participant()
        {
		return (EReference)cParticipantRefEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getCParticipantRef_Name()
        {
		return (EAttribute)cParticipantRefEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getFlowActivityLink()
        {
		return flowActivityLinkEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getFlowActivityLink_SourceActivity()
        {
		return (EReference)flowActivityLinkEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getFlowActivityLink_TargetActivity()
        {
		return (EReference)flowActivityLinkEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getFlowActivityLink_Name()
        {
		return (EAttribute)flowActivityLinkEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getFlowActivityLink_TransitionCondition()
        {
		return (EReference)flowActivityLinkEClass.getEStructuralFeatures().get(3);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowActivityLink_Changed() {
		return (EAttribute)flowActivityLinkEClass.getEStructuralFeatures().get(4);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowActivityLink_State() {
		return (EAttribute)flowActivityLinkEClass.getEStructuralFeatures().get(5);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowActivityLink_Id() {
		return (EAttribute)flowActivityLinkEClass.getEStructuralFeatures().get(6);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowActivityLink_InstanceBuffer() {
		return (EReference)flowActivityLinkEClass.getEStructuralFeatures().get(8);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowActivityLink_InstanceID() {
		return (EAttribute)flowActivityLinkEClass.getEStructuralFeatures().get(7);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCParticipantCommon()
        {
		return cParticipantCommonEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getCParticipantCommon_Name()
        {
		return (EAttribute)cParticipantCommonEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCParticipantCommon_Scope()
        {
		return (EReference)cParticipantCommonEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCParticipantCommon_Process()
        {
		return (EReference)cParticipantCommonEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCParticipant()
        {
		return cParticipantEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getCParticipant_Containment()
        {
		return (EAttribute)cParticipantEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCParticipant_Selects()
        {
		return (EReference)cParticipantEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCParticipant_Instances() {
		return (EReference)cParticipantEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCParticipantSet()
        {
		return cParticipantSetEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCParticipantSet_Participants()
        {
		return (EReference)cParticipantSetEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCParticipantSet_ParticipantSets()
        {
		return (EReference)cParticipantSetEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCGrounding()
        {
		return cGroundingEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getCGrounding_Name()
        {
		return (EAttribute)cGroundingEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCGrounding_CMessageLinkGroundings()
        {
		return (EReference)cGroundingEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCGrounding_CorrelationSetGroundings()
        {
		return (EReference)cGroundingEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCGrounding_CParticipantRefGroundings()
        {
		return (EReference)cGroundingEClass.getEStructuralFeatures().get(3);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCorrelationSetGrounding()
        {
		return correlationSetGroundingEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCorrelationSetGrounding_CorrelationSet()
        {
		return (EReference)correlationSetGroundingEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCorrelationSetGrounding_PropertyGroundings()
        {
		return (EReference)correlationSetGroundingEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getPropertyGrounding()
        {
		return propertyGroundingEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getPropertyGrounding_PropertyName()
        {
		return (EAttribute)propertyGroundingEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getPropertyGrounding_WSDLProperty()
        {
		return (EReference)propertyGroundingEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCMessageLinkGrounding()
        {
		return cMessageLinkGroundingEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCMessageLinkGrounding_CMessageLink()
        {
		return (EReference)cMessageLinkGroundingEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCMessageLinkGrounding_PortType()
        {
		return (EReference)cMessageLinkGroundingEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getCMessageLinkGrounding_Operation()
        {
		return (EAttribute)cMessageLinkGroundingEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCMessageLinkGrounding_BSToWSDLProperty()
        {
		return (EReference)cMessageLinkGroundingEClass.getEStructuralFeatures().get(3);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCParticipantRefGrounding()
        {
		return cParticipantRefGroundingEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCParticipantRefGrounding_CParticipantRef()
        {
		return (EReference)cParticipantRefGroundingEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getCParticipantRefGrounding_WSDLProperty()
        {
		return (EReference)cParticipantRefGroundingEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getCQName()
        {
		return cqNameEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getCQName_NsURI()
        {
		return (EAttribute)cqNameEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getCQName_LocalPart()
        {
		return (EAttribute)cqNameEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EAttribute getCQName_Prefix()
        {
		return (EAttribute)cqNameEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getForEachIterationSpec()
        {
		return forEachIterationSpecEClass;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getForEachIterationSpec_IteratorSet()
        {
		return (EReference)forEachIterationSpecEClass.getEStructuralFeatures().get(0);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getForEachIterationSpec_IteratorValue()
        {
		return (EReference)forEachIterationSpecEClass.getEStructuralFeatures().get(1);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getForEachIterationSpec_ForEach()
        {
		return (EReference)forEachIterationSpecEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConnectorLink() {
		return abstractConnectorLinkEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnectorLink_SendActivity() {
		return (EReference)abstractConnectorLinkEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnectorLink_ReceiveActivity() {
		return (EReference)abstractConnectorLinkEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnectorLink_ParticipantRefs() {
		return (EReference)abstractConnectorLinkEClass.getEStructuralFeatures().get(2);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnectorLink_BindSenderTo() {
		return (EReference)abstractConnectorLinkEClass.getEStructuralFeatures().get(3);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnectorLink_Sender() {
		return (EReference)abstractConnectorLinkEClass.getEStructuralFeatures().get(4);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnectorLink_Senders() {
		return (EReference)abstractConnectorLinkEClass.getEStructuralFeatures().get(5);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnectorLink_Receiver() {
		return (EReference)abstractConnectorLinkEClass.getEStructuralFeatures().get(6);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConnectorLink_MessageName() {
		return (EAttribute)abstractConnectorLinkEClass.getEStructuralFeatures().get(7);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConnectorLink_Name() {
		return (EAttribute)abstractConnectorLinkEClass.getEStructuralFeatures().get(8);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnectorLink_AbstractConnector() {
		return (EReference)abstractConnectorLinkEClass.getEStructuralFeatures().get(9);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessInstance() {
		return processInstanceEClass;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessInstance_InstanceID() {
		return (EAttribute)processInstanceEClass.getEStructuralFeatures().get(0);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInstance_Process() {
		return (EReference)processInstanceEClass.getEStructuralFeatures().get(1);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EEnum getPContainment()
        {
		return pContainmentEEnum;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ChorFactory getChorFactory()
        {
		return (ChorFactory)getEFactoryInstance();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private boolean isCreated = false;

        /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void createPackageContents()
        {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		choreographyEClass = createEClass(CHOREOGRAPHY);
		createEAttribute(choreographyEClass, CHOREOGRAPHY__NAME);
		createEAttribute(choreographyEClass, CHOREOGRAPHY__TARGET_NAMESPACE);
		createEReference(choreographyEClass, CHOREOGRAPHY__PARTICIPANTS);
		createEReference(choreographyEClass, CHOREOGRAPHY__PARTICIPANT_SETS);
		createEReference(choreographyEClass, CHOREOGRAPHY__MESSAGE_LINKS);
		createEReference(choreographyEClass, CHOREOGRAPHY__PARTICIPANT_REFS);
		createEReference(choreographyEClass, CHOREOGRAPHY__FLOW_ACTIVITY_LINKS);
		createEReference(choreographyEClass, CHOREOGRAPHY__GROUNDINGS);
		createEReference(choreographyEClass, CHOREOGRAPHY__FOR_EACH_ITERATION_SPECS);
		createEReference(choreographyEClass, CHOREOGRAPHY__ABSTRACT_CONNECTOR_LINKS);
		createEReference(choreographyEClass, CHOREOGRAPHY__GLOBAL_DATA_MODEL);

		cMessageLinkEClass = createEClass(CMESSAGE_LINK);
		createEReference(cMessageLinkEClass, CMESSAGE_LINK__SEND_ACTIVITY);
		createEReference(cMessageLinkEClass, CMESSAGE_LINK__RECEIVE_ACTIVITY);
		createEReference(cMessageLinkEClass, CMESSAGE_LINK__PARTICIPANT_REFS);
		createEReference(cMessageLinkEClass, CMESSAGE_LINK__BIND_SENDER_TO);
		createEReference(cMessageLinkEClass, CMESSAGE_LINK__SENDER);
		createEReference(cMessageLinkEClass, CMESSAGE_LINK__SENDERS);
		createEReference(cMessageLinkEClass, CMESSAGE_LINK__RECEIVER);
		createEAttribute(cMessageLinkEClass, CMESSAGE_LINK__MESSAGE_NAME);
		createEAttribute(cMessageLinkEClass, CMESSAGE_LINK__NAME);
		createEAttribute(cMessageLinkEClass, CMESSAGE_LINK__STATE);
		createEAttribute(cMessageLinkEClass, CMESSAGE_LINK__ID);
		createEAttribute(cMessageLinkEClass, CMESSAGE_LINK__INSTANCE_ID);
		createEReference(cMessageLinkEClass, CMESSAGE_LINK__INSTANCE_BUFFER);

		cParticipantRefEClass = createEClass(CPARTICIPANT_REF);
		createEReference(cParticipantRefEClass, CPARTICIPANT_REF__PARTICIPANT);
		createEAttribute(cParticipantRefEClass, CPARTICIPANT_REF__NAME);

		flowActivityLinkEClass = createEClass(FLOW_ACTIVITY_LINK);
		createEReference(flowActivityLinkEClass, FLOW_ACTIVITY_LINK__SOURCE_ACTIVITY);
		createEReference(flowActivityLinkEClass, FLOW_ACTIVITY_LINK__TARGET_ACTIVITY);
		createEAttribute(flowActivityLinkEClass, FLOW_ACTIVITY_LINK__NAME);
		createEReference(flowActivityLinkEClass, FLOW_ACTIVITY_LINK__TRANSITION_CONDITION);
		createEAttribute(flowActivityLinkEClass, FLOW_ACTIVITY_LINK__CHANGED);
		createEAttribute(flowActivityLinkEClass, FLOW_ACTIVITY_LINK__STATE);
		createEAttribute(flowActivityLinkEClass, FLOW_ACTIVITY_LINK__ID);
		createEAttribute(flowActivityLinkEClass, FLOW_ACTIVITY_LINK__INSTANCE_ID);
		createEReference(flowActivityLinkEClass, FLOW_ACTIVITY_LINK__INSTANCE_BUFFER);

		cParticipantCommonEClass = createEClass(CPARTICIPANT_COMMON);
		createEAttribute(cParticipantCommonEClass, CPARTICIPANT_COMMON__NAME);
		createEReference(cParticipantCommonEClass, CPARTICIPANT_COMMON__SCOPE);
		createEReference(cParticipantCommonEClass, CPARTICIPANT_COMMON__PROCESS);

		cParticipantEClass = createEClass(CPARTICIPANT);
		createEAttribute(cParticipantEClass, CPARTICIPANT__CONTAINMENT);
		createEReference(cParticipantEClass, CPARTICIPANT__SELECTS);
		createEReference(cParticipantEClass, CPARTICIPANT__INSTANCES);

		cParticipantSetEClass = createEClass(CPARTICIPANT_SET);
		createEReference(cParticipantSetEClass, CPARTICIPANT_SET__PARTICIPANTS);
		createEReference(cParticipantSetEClass, CPARTICIPANT_SET__PARTICIPANT_SETS);

		cGroundingEClass = createEClass(CGROUNDING);
		createEAttribute(cGroundingEClass, CGROUNDING__NAME);
		createEReference(cGroundingEClass, CGROUNDING__CMESSAGE_LINK_GROUNDINGS);
		createEReference(cGroundingEClass, CGROUNDING__CORRELATION_SET_GROUNDINGS);
		createEReference(cGroundingEClass, CGROUNDING__CPARTICIPANT_REF_GROUNDINGS);

		correlationSetGroundingEClass = createEClass(CORRELATION_SET_GROUNDING);
		createEReference(correlationSetGroundingEClass, CORRELATION_SET_GROUNDING__CORRELATION_SET);
		createEReference(correlationSetGroundingEClass, CORRELATION_SET_GROUNDING__PROPERTY_GROUNDINGS);

		propertyGroundingEClass = createEClass(PROPERTY_GROUNDING);
		createEAttribute(propertyGroundingEClass, PROPERTY_GROUNDING__PROPERTY_NAME);
		createEReference(propertyGroundingEClass, PROPERTY_GROUNDING__WSDL_PROPERTY);

		cMessageLinkGroundingEClass = createEClass(CMESSAGE_LINK_GROUNDING);
		createEReference(cMessageLinkGroundingEClass, CMESSAGE_LINK_GROUNDING__CMESSAGE_LINK);
		createEReference(cMessageLinkGroundingEClass, CMESSAGE_LINK_GROUNDING__PORT_TYPE);
		createEAttribute(cMessageLinkGroundingEClass, CMESSAGE_LINK_GROUNDING__OPERATION);
		createEReference(cMessageLinkGroundingEClass, CMESSAGE_LINK_GROUNDING__BS_TO_WSDL_PROPERTY);

		cParticipantRefGroundingEClass = createEClass(CPARTICIPANT_REF_GROUNDING);
		createEReference(cParticipantRefGroundingEClass, CPARTICIPANT_REF_GROUNDING__CPARTICIPANT_REF);
		createEReference(cParticipantRefGroundingEClass, CPARTICIPANT_REF_GROUNDING__WSDL_PROPERTY);

		cqNameEClass = createEClass(CQ_NAME);
		createEAttribute(cqNameEClass, CQ_NAME__NS_URI);
		createEAttribute(cqNameEClass, CQ_NAME__LOCAL_PART);
		createEAttribute(cqNameEClass, CQ_NAME__PREFIX);

		forEachIterationSpecEClass = createEClass(FOR_EACH_ITERATION_SPEC);
		createEReference(forEachIterationSpecEClass, FOR_EACH_ITERATION_SPEC__ITERATOR_SET);
		createEReference(forEachIterationSpecEClass, FOR_EACH_ITERATION_SPEC__ITERATOR_VALUE);
		createEReference(forEachIterationSpecEClass, FOR_EACH_ITERATION_SPEC__FOR_EACH);

		abstractConnectorLinkEClass = createEClass(ABSTRACT_CONNECTOR_LINK);
		createEReference(abstractConnectorLinkEClass, ABSTRACT_CONNECTOR_LINK__SEND_ACTIVITY);
		createEReference(abstractConnectorLinkEClass, ABSTRACT_CONNECTOR_LINK__RECEIVE_ACTIVITY);
		createEReference(abstractConnectorLinkEClass, ABSTRACT_CONNECTOR_LINK__PARTICIPANT_REFS);
		createEReference(abstractConnectorLinkEClass, ABSTRACT_CONNECTOR_LINK__BIND_SENDER_TO);
		createEReference(abstractConnectorLinkEClass, ABSTRACT_CONNECTOR_LINK__SENDER);
		createEReference(abstractConnectorLinkEClass, ABSTRACT_CONNECTOR_LINK__SENDERS);
		createEReference(abstractConnectorLinkEClass, ABSTRACT_CONNECTOR_LINK__RECEIVER);
		createEAttribute(abstractConnectorLinkEClass, ABSTRACT_CONNECTOR_LINK__MESSAGE_NAME);
		createEAttribute(abstractConnectorLinkEClass, ABSTRACT_CONNECTOR_LINK__NAME);
		createEReference(abstractConnectorLinkEClass, ABSTRACT_CONNECTOR_LINK__ABSTRACT_CONNECTOR);

		processInstanceEClass = createEClass(PROCESS_INSTANCE);
		createEAttribute(processInstanceEClass, PROCESS_INSTANCE__INSTANCE_ID);
		createEReference(processInstanceEClass, PROCESS_INSTANCE__PROCESS);

		// Create enums
		pContainmentEEnum = createEEnum(PCONTAINMENT);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private boolean isInitialized = false;

        /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void initializePackageContents()
        {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GlobalDataModelPackage theGlobalDataModelPackage = (GlobalDataModelPackage)EPackage.Registry.INSTANCE.getEPackage(GlobalDataModelPackage.eNS_URI);
		PbdPackage thePbdPackage = (PbdPackage)EPackage.Registry.INSTANCE.getEPackage(PbdPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		AbstractconstructsPackage theAbstractconstructsPackage = (AbstractconstructsPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractconstructsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cParticipantEClass.getESuperTypes().add(this.getCParticipantCommon());
		cParticipantSetEClass.getESuperTypes().add(this.getCParticipantCommon());

		// Initialize classes and features; add operations and parameters
		initEClass(choreographyEClass, Choreography.class, "Choreography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoreography_Name(), ecorePackage.getEString(), "name", null, 1, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoreography_TargetNamespace(), ecorePackage.getEString(), "targetNamespace", null, 1, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_Participants(), this.getCParticipant(), null, "participants", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_ParticipantSets(), this.getCParticipantSet(), null, "participantSets", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_MessageLinks(), this.getCMessageLink(), null, "messageLinks", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_ParticipantRefs(), this.getCParticipantRef(), null, "participantRefs", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_FlowActivityLinks(), this.getFlowActivityLink(), null, "flowActivityLinks", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_Groundings(), this.getCGrounding(), null, "groundings", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_ForEachIterationSpecs(), this.getForEachIterationSpec(), null, "forEachIterationSpecs", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_AbstractConnectorLinks(), this.getAbstractConnectorLink(), null, "abstractConnectorLinks", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_GlobalDataModel(), theGlobalDataModelPackage.getGlobalDataModel(), null, "GlobalDataModel", null, 0, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cMessageLinkEClass, CMessageLink.class, "CMessageLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMessageLink_SendActivity(), thePbdPackage.getCLinkable(), null, "sendActivity", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMessageLink_ReceiveActivity(), thePbdPackage.getCLinkable(), null, "receiveActivity", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMessageLink_ParticipantRefs(), this.getCParticipantRef(), null, "participantRefs", null, 0, -1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMessageLink_BindSenderTo(), this.getCParticipant(), null, "bindSenderTo", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMessageLink_Sender(), this.getCParticipant(), null, "sender", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMessageLink_Senders(), this.getCParticipantSet(), null, "senders", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMessageLink_Receiver(), this.getCParticipant(), null, "receiver", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMessageLink_MessageName(), ecorePackage.getEString(), "messageName", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMessageLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMessageLink_State(), ecorePackage.getEString(), "state", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMessageLink_Id(), ecorePackage.getEString(), "id", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMessageLink_InstanceID(), ecorePackage.getEString(), "instanceID", null, 0, 1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMessageLink_InstanceBuffer(), theCommonPackage.getEStringToElementInstanceMap(), null, "instanceBuffer", null, 0, -1, CMessageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cParticipantRefEClass, CParticipantRef.class, "CParticipantRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCParticipantRef_Participant(), this.getCParticipant(), null, "participant", null, 0, 1, CParticipantRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCParticipantRef_Name(), ecorePackage.getEString(), "name", null, 1, 1, CParticipantRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowActivityLinkEClass, FlowActivityLink.class, "FlowActivityLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowActivityLink_SourceActivity(), thePbdPackage.getActivity(), null, "sourceActivity", null, 0, 1, FlowActivityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowActivityLink_TargetActivity(), thePbdPackage.getActivity(), null, "targetActivity", null, 0, 1, FlowActivityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowActivityLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowActivityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowActivityLink_TransitionCondition(), thePbdPackage.getTransitionCondition(), null, "transitionCondition", null, 0, 1, FlowActivityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowActivityLink_Changed(), thePbdPackage.getBoolean(), "changed", null, 0, 1, FlowActivityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowActivityLink_State(), ecorePackage.getEString(), "state", null, 0, 1, FlowActivityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowActivityLink_Id(), ecorePackage.getEString(), "id", null, 0, 1, FlowActivityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowActivityLink_InstanceID(), ecorePackage.getEString(), "instanceID", null, 0, 1, FlowActivityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowActivityLink_InstanceBuffer(), theCommonPackage.getEStringToElementInstanceMap(), null, "instanceBuffer", null, 0, -1, FlowActivityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cParticipantCommonEClass, CParticipantCommon.class, "CParticipantCommon", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCParticipantCommon_Name(), ecorePackage.getEString(), "name", null, 1, 1, CParticipantCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCParticipantCommon_Scope(), thePbdPackage.getScope(), null, "scope", null, 0, 1, CParticipantCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCParticipantCommon_Process(), thePbdPackage.getProcess(), null, "process", null, 0, 1, CParticipantCommon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cParticipantEClass, CParticipant.class, "CParticipant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCParticipant_Containment(), this.getPContainment(), "containment", null, 0, 1, CParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCParticipant_Selects(), this.getCParticipantCommon(), null, "selects", null, 0, -1, CParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCParticipant_Instances(), this.getProcessInstance(), null, "instances", null, 0, -1, CParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cParticipantSetEClass, CParticipantSet.class, "CParticipantSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCParticipantSet_Participants(), this.getCParticipant(), null, "participants", null, 0, -1, CParticipantSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCParticipantSet_ParticipantSets(), this.getCParticipantSet(), null, "participantSets", null, 0, -1, CParticipantSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cGroundingEClass, CGrounding.class, "CGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCGrounding_Name(), ecorePackage.getEString(), "name", null, 1, 1, CGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCGrounding_CMessageLinkGroundings(), this.getCMessageLinkGrounding(), null, "cMessageLinkGroundings", null, 0, -1, CGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCGrounding_CorrelationSetGroundings(), this.getCorrelationSetGrounding(), null, "correlationSetGroundings", null, 0, -1, CGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCGrounding_CParticipantRefGroundings(), this.getCParticipantRefGrounding(), null, "cParticipantRefGroundings", null, 0, -1, CGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(correlationSetGroundingEClass, CorrelationSetGrounding.class, "CorrelationSetGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrelationSetGrounding_CorrelationSet(), thePbdPackage.getCorrelationSet(), null, "correlationSet", null, 0, 1, CorrelationSetGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrelationSetGrounding_PropertyGroundings(), this.getPropertyGrounding(), null, "propertyGroundings", null, 0, -1, CorrelationSetGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyGroundingEClass, PropertyGrounding.class, "PropertyGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyGrounding_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1, PropertyGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGrounding_WSDLProperty(), this.getCQName(), null, "WSDLProperty", null, 0, 1, PropertyGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cMessageLinkGroundingEClass, CMessageLinkGrounding.class, "CMessageLinkGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMessageLinkGrounding_CMessageLink(), this.getCMessageLink(), null, "cMessageLink", null, 0, 1, CMessageLinkGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMessageLinkGrounding_PortType(), this.getCQName(), null, "portType", null, 0, 1, CMessageLinkGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMessageLinkGrounding_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, CMessageLinkGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMessageLinkGrounding_BSToWSDLProperty(), this.getCQName(), null, "bSToWSDLProperty", null, 0, 1, CMessageLinkGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cParticipantRefGroundingEClass, CParticipantRefGrounding.class, "CParticipantRefGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCParticipantRefGrounding_CParticipantRef(), this.getCParticipantRef(), null, "cParticipantRef", null, 0, 1, CParticipantRefGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCParticipantRefGrounding_WSDLProperty(), this.getCQName(), null, "WSDLProperty", null, 0, 1, CParticipantRefGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cqNameEClass, CQName.class, "CQName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCQName_NsURI(), ecorePackage.getEString(), "nsURI", null, 0, 1, CQName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCQName_LocalPart(), ecorePackage.getEString(), "localPart", null, 1, 1, CQName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCQName_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, CQName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEachIterationSpecEClass, ForEachIterationSpec.class, "ForEachIterationSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForEachIterationSpec_IteratorSet(), this.getCParticipantSet(), null, "iteratorSet", null, 0, 1, ForEachIterationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEachIterationSpec_IteratorValue(), this.getCParticipant(), null, "iteratorValue", null, 0, 1, ForEachIterationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEachIterationSpec_ForEach(), thePbdPackage.getForEach(), null, "forEach", null, 0, 1, ForEachIterationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConnectorLinkEClass, AbstractConnectorLink.class, "AbstractConnectorLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConnectorLink_SendActivity(), thePbdPackage.getCLinkable(), null, "sendActivity", null, 0, 1, AbstractConnectorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnectorLink_ReceiveActivity(), thePbdPackage.getCLinkable(), null, "receiveActivity", null, 0, 1, AbstractConnectorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnectorLink_ParticipantRefs(), this.getCParticipantRef(), null, "participantRefs", null, 0, -1, AbstractConnectorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnectorLink_BindSenderTo(), this.getCParticipant(), null, "bindSenderTo", null, 0, 1, AbstractConnectorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnectorLink_Sender(), this.getCParticipant(), null, "sender", null, 0, 1, AbstractConnectorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnectorLink_Senders(), this.getCParticipantSet(), null, "senders", null, 0, 1, AbstractConnectorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnectorLink_Receiver(), this.getCParticipant(), null, "receiver", null, 0, 1, AbstractConnectorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConnectorLink_MessageName(), ecorePackage.getEString(), "messageName", null, 0, 1, AbstractConnectorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConnectorLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractConnectorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnectorLink_AbstractConnector(), theAbstractconstructsPackage.getAbstractConnector(), null, "AbstractConnector", null, 0, 1, AbstractConnectorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processInstanceEClass, ProcessInstance.class, "ProcessInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessInstance_InstanceID(), ecorePackage.getEString(), "instanceID", null, 0, 1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessInstance_Process(), thePbdPackage.getProcess(), null, "process", null, 0, 1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pContainmentEEnum, PContainment.class, "PContainment");
		addEEnumLiteral(pContainmentEEnum, PContainment.ADDIFNOTEXISTS);
		addEEnumLiteral(pContainmentEEnum, PContainment.MUSTADD);
		addEEnumLiteral(pContainmentEEnum, PContainment.REQUIRED);

		// Create resource
		createResource(eNS_URI);
	}

} //ChorPackageImpl
