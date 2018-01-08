/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel.impl;

import org.eclipse.bpel4chor.model.globalDataModel.DataConnector;
import org.eclipse.bpel4chor.model.globalDataModel.DataConnectors;
import org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategies;
import org.eclipse.bpel4chor.model.globalDataModel.DataHandlingStrategy;
import org.eclipse.bpel4chor.model.globalDataModel.DataMapping;
import org.eclipse.bpel4chor.model.globalDataModel.DataMappings;
import org.eclipse.bpel4chor.model.globalDataModel.DataObject;
import org.eclipse.bpel4chor.model.globalDataModel.DataObjectMetadata;
import org.eclipse.bpel4chor.model.globalDataModel.DataObjectType;
import org.eclipse.bpel4chor.model.globalDataModel.DataObjects;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelFactory;
import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage;
import org.eclipse.bpel4chor.model.globalDataModel.TransferStrategyType;
import org.eclipse.bpel4chor.model.globalDataModel.TransformationStrategyType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xsd.XSDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalDataModelPackageImpl extends EPackageImpl implements GlobalDataModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalDataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConnectorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataHandlingStrategiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataHandlingStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataObjectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transferStrategyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transformationStrategyTypeEEnum = null;

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
	 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GlobalDataModelPackageImpl() {
		super(eNS_URI, GlobalDataModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GlobalDataModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GlobalDataModelPackage init() {
		if (isInited) return (GlobalDataModelPackage)EPackage.Registry.INSTANCE.getEPackage(GlobalDataModelPackage.eNS_URI);

		// Obtain or create and register package
		GlobalDataModelPackageImpl theGlobalDataModelPackage = (GlobalDataModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GlobalDataModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GlobalDataModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XSDPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGlobalDataModelPackage.createPackageContents();

		// Initialize created meta-data
		theGlobalDataModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGlobalDataModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GlobalDataModelPackage.eNS_URI, theGlobalDataModelPackage);
		return theGlobalDataModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalDataModel() {
		return globalDataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalDataModel_DataObjects() {
		return (EReference)globalDataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalDataModel_DataConnectors() {
		return (EReference)globalDataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObject() {
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataObject_Name() {
		return (EAttribute)dataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataObject_Type() {
		return (EAttribute)dataObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_StructuralDefinition() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_MetaData() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_Incoming() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_Outgoing() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_DataHandlingStrategies() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObjects() {
		return dataObjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObjects_DataObject() {
		return (EReference)dataObjectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConnectors() {
		return dataConnectorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConnectors_DataConnector() {
		return (EReference)dataConnectorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConnector() {
		return dataConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataConnector_Name() {
		return (EAttribute)dataConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConnector_Source() {
		return (EReference)dataConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConnector_Target() {
		return (EReference)dataConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConnector_SourceMappings() {
		return (EReference)dataConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConnector_TargetMappings() {
		return (EReference)dataConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMapping() {
		return dataMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMapping_SourceSelector() {
		return (EAttribute)dataMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMapping_TargetSelector() {
		return (EAttribute)dataMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMappings() {
		return dataMappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMappings_DataMapping() {
		return (EReference)dataMappingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObjectMetadata() {
		return dataObjectMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObjectMetadata_MetaData() {
		return (EReference)dataObjectMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataHandlingStrategies() {
		return dataHandlingStrategiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHandlingStrategies_DataHandlingStrategy() {
		return (EReference)dataHandlingStrategiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataHandlingStrategy() {
		return dataHandlingStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataHandlingStrategy_TransferStrategy() {
		return (EAttribute)dataHandlingStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataHandlingStrategy_TransformationStrategy() {
		return (EAttribute)dataHandlingStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataObjectType() {
		return dataObjectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransferStrategyType() {
		return transferStrategyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransformationStrategyType() {
		return transformationStrategyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDataModelFactory getGlobalDataModelFactory() {
		return (GlobalDataModelFactory)getEFactoryInstance();
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
		globalDataModelEClass = createEClass(GLOBAL_DATA_MODEL);
		createEReference(globalDataModelEClass, GLOBAL_DATA_MODEL__DATA_OBJECTS);
		createEReference(globalDataModelEClass, GLOBAL_DATA_MODEL__DATA_CONNECTORS);

		dataObjectEClass = createEClass(DATA_OBJECT);
		createEAttribute(dataObjectEClass, DATA_OBJECT__NAME);
		createEAttribute(dataObjectEClass, DATA_OBJECT__TYPE);
		createEReference(dataObjectEClass, DATA_OBJECT__STRUCTURAL_DEFINITION);
		createEReference(dataObjectEClass, DATA_OBJECT__META_DATA);
		createEReference(dataObjectEClass, DATA_OBJECT__INCOMING);
		createEReference(dataObjectEClass, DATA_OBJECT__OUTGOING);
		createEReference(dataObjectEClass, DATA_OBJECT__DATA_HANDLING_STRATEGIES);

		dataObjectsEClass = createEClass(DATA_OBJECTS);
		createEReference(dataObjectsEClass, DATA_OBJECTS__DATA_OBJECT);

		dataConnectorsEClass = createEClass(DATA_CONNECTORS);
		createEReference(dataConnectorsEClass, DATA_CONNECTORS__DATA_CONNECTOR);

		dataConnectorEClass = createEClass(DATA_CONNECTOR);
		createEAttribute(dataConnectorEClass, DATA_CONNECTOR__NAME);
		createEReference(dataConnectorEClass, DATA_CONNECTOR__SOURCE);
		createEReference(dataConnectorEClass, DATA_CONNECTOR__TARGET);
		createEReference(dataConnectorEClass, DATA_CONNECTOR__SOURCE_MAPPINGS);
		createEReference(dataConnectorEClass, DATA_CONNECTOR__TARGET_MAPPINGS);

		dataMappingEClass = createEClass(DATA_MAPPING);
		createEAttribute(dataMappingEClass, DATA_MAPPING__SOURCE_SELECTOR);
		createEAttribute(dataMappingEClass, DATA_MAPPING__TARGET_SELECTOR);

		dataMappingsEClass = createEClass(DATA_MAPPINGS);
		createEReference(dataMappingsEClass, DATA_MAPPINGS__DATA_MAPPING);

		dataObjectMetadataEClass = createEClass(DATA_OBJECT_METADATA);
		createEReference(dataObjectMetadataEClass, DATA_OBJECT_METADATA__META_DATA);

		dataHandlingStrategiesEClass = createEClass(DATA_HANDLING_STRATEGIES);
		createEReference(dataHandlingStrategiesEClass, DATA_HANDLING_STRATEGIES__DATA_HANDLING_STRATEGY);

		dataHandlingStrategyEClass = createEClass(DATA_HANDLING_STRATEGY);
		createEAttribute(dataHandlingStrategyEClass, DATA_HANDLING_STRATEGY__TRANSFER_STRATEGY);
		createEAttribute(dataHandlingStrategyEClass, DATA_HANDLING_STRATEGY__TRANSFORMATION_STRATEGY);

		// Create enums
		dataObjectTypeEEnum = createEEnum(DATA_OBJECT_TYPE);
		transferStrategyTypeEEnum = createEEnum(TRANSFER_STRATEGY_TYPE);
		transformationStrategyTypeEEnum = createEEnum(TRANSFORMATION_STRATEGY_TYPE);
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
		XSDPackage theXSDPackage = (XSDPackage)EPackage.Registry.INSTANCE.getEPackage(XSDPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(globalDataModelEClass, GlobalDataModel.class, "GlobalDataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalDataModel_DataObjects(), this.getDataObjects(), null, "dataObjects", null, 0, 1, GlobalDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalDataModel_DataConnectors(), this.getDataConnectors(), null, "dataConnectors", null, 0, 1, GlobalDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataObjectEClass, DataObject.class, "DataObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataObject_Type(), this.getDataObjectType(), "type", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataObject_StructuralDefinition(), theXSDPackage.getXSDTypeDefinition(), null, "structuralDefinition", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataObject_MetaData(), this.getDataObjectMetadata(), null, "metaData", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataObject_Incoming(), this.getDataConnectors(), null, "incoming", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataObject_Outgoing(), this.getDataConnectors(), null, "outgoing", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataObject_DataHandlingStrategies(), this.getDataHandlingStrategies(), null, "dataHandlingStrategies", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataObjectsEClass, DataObjects.class, "DataObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataObjects_DataObject(), this.getDataObject(), null, "dataObject", null, 0, -1, DataObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataConnectorsEClass, DataConnectors.class, "DataConnectors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataConnectors_DataConnector(), this.getDataConnector(), null, "dataConnector", null, 0, -1, DataConnectors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataConnectorEClass, DataConnector.class, "DataConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataConnector_Source(), ecorePackage.getEObject(), null, "source", null, 0, 1, DataConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataConnector_Target(), ecorePackage.getEObject(), null, "target", null, 0, 1, DataConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataConnector_SourceMappings(), this.getDataMappings(), null, "sourceMappings", null, 0, 1, DataConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataConnector_TargetMappings(), this.getDataMappings(), null, "targetMappings", null, 0, 1, DataConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMappingEClass, DataMapping.class, "DataMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataMapping_SourceSelector(), ecorePackage.getEString(), "sourceSelector", null, 0, 1, DataMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataMapping_TargetSelector(), ecorePackage.getEString(), "targetSelector", null, 0, 1, DataMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMappingsEClass, DataMappings.class, "DataMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataMappings_DataMapping(), this.getDataMapping(), null, "dataMapping", null, 0, -1, DataMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataObjectMetadataEClass, DataObjectMetadata.class, "DataObjectMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataObjectMetadata_MetaData(), ecorePackage.getEObject(), null, "metaData", null, 0, -1, DataObjectMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataHandlingStrategiesEClass, DataHandlingStrategies.class, "DataHandlingStrategies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataHandlingStrategies_DataHandlingStrategy(), this.getDataHandlingStrategy(), null, "dataHandlingStrategy", null, 0, -1, DataHandlingStrategies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataHandlingStrategyEClass, DataHandlingStrategy.class, "DataHandlingStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataHandlingStrategy_TransferStrategy(), this.getTransferStrategyType(), "transferStrategy", null, 0, 1, DataHandlingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataHandlingStrategy_TransformationStrategy(), this.getTransformationStrategyType(), "transformationStrategy", null, 0, 1, DataHandlingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataObjectTypeEEnum, DataObjectType.class, "DataObjectType");
		addEEnumLiteral(dataObjectTypeEEnum, DataObjectType.DEFAULT);
		addEEnumLiteral(dataObjectTypeEEnum, DataObjectType.CONSTANT);
		addEEnumLiteral(dataObjectTypeEEnum, DataObjectType.REFERENCE);

		initEEnum(transferStrategyTypeEEnum, TransferStrategyType.class, "TransferStrategyType");
		addEEnumLiteral(transferStrategyTypeEEnum, TransferStrategyType.ON_DEMAND);
		addEEnumLiteral(transferStrategyTypeEEnum, TransferStrategyType.IN_ADVANCE);
		addEEnumLiteral(transferStrategyTypeEEnum, TransferStrategyType.DIRECT);
		addEEnumLiteral(transferStrategyTypeEEnum, TransferStrategyType.EFFICIENT);

		initEEnum(transformationStrategyTypeEEnum, TransformationStrategyType.class, "TransformationStrategyType");
		addEEnumLiteral(transformationStrategyTypeEEnum, TransformationStrategyType.ON_DEMAND);
		addEEnumLiteral(transformationStrategyTypeEEnum, TransformationStrategyType.IN_ADVANCE);
		addEEnumLiteral(transformationStrategyTypeEEnum, TransformationStrategyType.ON_QUERY);
		addEEnumLiteral(transformationStrategyTypeEEnum, TransformationStrategyType.ON_READ);

		// Create resource
		createResource(eNS_URI);
	}

} //GlobalDataModelPackageImpl
