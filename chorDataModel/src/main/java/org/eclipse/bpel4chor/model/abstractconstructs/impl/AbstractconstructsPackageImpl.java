/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.abstractconstructs.impl;

import org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity;
import org.eclipse.bpel4chor.model.abstractconstructs.AbstractConnector;
import org.eclipse.bpel4chor.model.abstractconstructs.AbstractContainer;
import org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsFactory;
import org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage;
import org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases;

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
public class AbstractconstructsPackageImpl extends EPackageImpl implements AbstractconstructsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum refinementPhasesEEnum = null;

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
	 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbstractconstructsPackageImpl() {
		super(eNS_URI, AbstractconstructsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AbstractconstructsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AbstractconstructsPackage init() {
		if (isInited) return (AbstractconstructsPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractconstructsPackage.eNS_URI);

		// Obtain or create and register package
		AbstractconstructsPackageImpl theAbstractconstructsPackage = (AbstractconstructsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AbstractconstructsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AbstractconstructsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PbdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAbstractconstructsPackage.createPackageContents();

		// Initialize created meta-data
		theAbstractconstructsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbstractconstructsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AbstractconstructsPackage.eNS_URI, theAbstractconstructsPackage);
		return theAbstractconstructsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractActivity() {
		return abstractActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractActivity_RefinementStartPhase() {
		return (EAttribute)abstractActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractActivity_RefinementEndPhase() {
		return (EAttribute)abstractActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractActivity_FailureHandlingStrategy() {
		return (EAttribute)abstractActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractActivity_PluginType() {
		return (EAttribute)abstractActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractActivity_TypeSpecificContent() {
		return (EReference)abstractActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConnector() {
		return abstractConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConnector_Name() {
		return (EAttribute)abstractConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnector_Source() {
		return (EReference)abstractConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnector_Target() {
		return (EReference)abstractConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConnector_RefinementStartPhase() {
		return (EAttribute)abstractConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConnector_RefinementEndPhase() {
		return (EAttribute)abstractConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConnector_FailureHandlingStrategy() {
		return (EAttribute)abstractConnectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConnector_PluginType() {
		return (EAttribute)abstractConnectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnector_TypeSpecificContent() {
		return (EReference)abstractConnectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractContainer() {
		return abstractContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContainer_Content() {
		return (EReference)abstractContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRefinementPhases() {
		return refinementPhasesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractconstructsFactory getAbstractconstructsFactory() {
		return (AbstractconstructsFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractActivityEClass = createEClass(ABSTRACT_ACTIVITY);
		createEAttribute(abstractActivityEClass, ABSTRACT_ACTIVITY__REFINEMENT_START_PHASE);
		createEAttribute(abstractActivityEClass, ABSTRACT_ACTIVITY__REFINEMENT_END_PHASE);
		createEAttribute(abstractActivityEClass, ABSTRACT_ACTIVITY__FAILURE_HANDLING_STRATEGY);
		createEAttribute(abstractActivityEClass, ABSTRACT_ACTIVITY__PLUGIN_TYPE);
		createEReference(abstractActivityEClass, ABSTRACT_ACTIVITY__TYPE_SPECIFIC_CONTENT);

		abstractConnectorEClass = createEClass(ABSTRACT_CONNECTOR);
		createEAttribute(abstractConnectorEClass, ABSTRACT_CONNECTOR__NAME);
		createEReference(abstractConnectorEClass, ABSTRACT_CONNECTOR__SOURCE);
		createEReference(abstractConnectorEClass, ABSTRACT_CONNECTOR__TARGET);
		createEAttribute(abstractConnectorEClass, ABSTRACT_CONNECTOR__REFINEMENT_START_PHASE);
		createEAttribute(abstractConnectorEClass, ABSTRACT_CONNECTOR__REFINEMENT_END_PHASE);
		createEAttribute(abstractConnectorEClass, ABSTRACT_CONNECTOR__FAILURE_HANDLING_STRATEGY);
		createEAttribute(abstractConnectorEClass, ABSTRACT_CONNECTOR__PLUGIN_TYPE);
		createEReference(abstractConnectorEClass, ABSTRACT_CONNECTOR__TYPE_SPECIFIC_CONTENT);

		abstractContainerEClass = createEClass(ABSTRACT_CONTAINER);
		createEReference(abstractContainerEClass, ABSTRACT_CONTAINER__CONTENT);

		// Create enums
		refinementPhasesEEnum = createEEnum(REFINEMENT_PHASES);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PbdPackage thePbdPackage = (PbdPackage)EPackage.Registry.INSTANCE.getEPackage(PbdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractActivityEClass.getESuperTypes().add(thePbdPackage.getExtensionActivity());
		abstractContainerEClass.getESuperTypes().add(thePbdPackage.getExtensionActivity());
		abstractContainerEClass.getESuperTypes().add(thePbdPackage.getCLinkable());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractActivityEClass, AbstractActivity.class, "AbstractActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractActivity_RefinementStartPhase(), this.getRefinementPhases(), "refinementStartPhase", null, 0, 1, AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractActivity_RefinementEndPhase(), this.getRefinementPhases(), "refinementEndPhase", null, 0, 1, AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractActivity_FailureHandlingStrategy(), ecorePackage.getEString(), "failureHandlingStrategy", null, 0, 1, AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractActivity_PluginType(), ecorePackage.getEString(), "pluginType", null, 1, 1, AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractActivity_TypeSpecificContent(), ecorePackage.getEObject(), null, "typeSpecificContent", null, 0, 1, AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConnectorEClass, AbstractConnector.class, "AbstractConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractConnector_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnector_Source(), this.getAbstractContainer(), null, "source", null, 1, 1, AbstractConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnector_Target(), this.getAbstractConnector(), null, "target", null, 1, 1, AbstractConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConnector_RefinementStartPhase(), this.getRefinementPhases(), "refinementStartPhase", null, 0, 1, AbstractConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConnector_RefinementEndPhase(), this.getRefinementPhases(), "refinementEndPhase", null, 0, 1, AbstractConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConnector_FailureHandlingStrategy(), ecorePackage.getEString(), "failureHandlingStrategy", null, 0, 1, AbstractConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConnector_PluginType(), ecorePackage.getEString(), "pluginType", null, 1, 1, AbstractConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnector_TypeSpecificContent(), ecorePackage.getEObject(), null, "typeSpecificContent", null, 0, 1, AbstractConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractContainerEClass, AbstractContainer.class, "AbstractContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractContainer_Content(), thePbdPackage.getActivity(), null, "content", null, 0, -1, AbstractContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(refinementPhasesEEnum, RefinementPhases.class, "RefinementPhases");
		addEEnumLiteral(refinementPhasesEEnum, RefinementPhases.CHOREOGRAPHY_MODELING);
		addEEnumLiteral(refinementPhasesEEnum, RefinementPhases.WORKFLOW_MODELING);
		addEEnumLiteral(refinementPhasesEEnum, RefinementPhases.PROVISION);
		addEEnumLiteral(refinementPhasesEEnum, RefinementPhases.EXECUTION);

		// Create resource
		createResource(eNS_URI);
	}

} //AbstractconstructsPackageImpl
