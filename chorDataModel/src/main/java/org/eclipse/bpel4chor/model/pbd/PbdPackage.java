/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.pbd.PbdFactory
 * @model kind="package"
 * @generated
 */
public interface PbdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pbd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/wsbpel/2.0/process/abstract";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pbd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PbdPackage eINSTANCE = org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl <em>Extensible Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExtensibleElements()
	 * @generated
	 */
	int EXTENSIBLE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__ANY_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__STATE = 3;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__XPATH = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__ID = 5;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__INSTANCE_ID = 6;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER = 7;

	/**
	 * The number of structural features of the '<em>Extensible Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENTS_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.DocumentationImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LANG = 1;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ANY_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXTENSIONS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IMPORT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Exchanges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MESSAGE_EXCHANGES = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABLES = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CORRELATION_SETS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fault Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FAULT_HANDLERS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EVENT_HANDLERS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACTIVITY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TARGET_NAMESPACE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Query Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__QUERY_LANGUAGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXPRESSION_LANGUAGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPRESS_JOIN_FAILURE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXIT_ON_STANDARD_FAULT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Abstract Process Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ABSTRACT_PROCESS_PROFILE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensionsImpl <em>Extensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ExtensionsImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExtensions()
	 * @generated
	 */
	int EXTENSIONS = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__EXTENSION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ExtensionImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAMESPACE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__MUST_UNDERSTAND = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ImportImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAMESPACE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LOCATION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_TYPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.MessageExchangesImpl <em>Message Exchanges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.MessageExchangesImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getMessageExchanges()
	 * @generated
	 */
	int MESSAGE_EXCHANGES = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__MESSAGE_EXCHANGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Exchanges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.MessageExchangeImpl <em>Message Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.MessageExchangeImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getMessageExchange()
	 * @generated
	 */
	int MESSAGE_EXCHANGE = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.VariablesImpl <em>Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.VariablesImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getVariables()
	 * @generated
	 */
	int VARIABLES = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__VARIABLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.VariableImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FROM = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MESSAGE_TYPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xsd Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__XSD_ELEMENT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CorrelationSetsImpl <em>Correlation Sets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.CorrelationSetsImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCorrelationSets()
	 * @generated
	 */
	int CORRELATION_SETS = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Correlation Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__CORRELATION_SET = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correlation Sets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CorrelationSetImpl <em>Correlation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.CorrelationSetImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCorrelationSet()
	 * @generated
	 */
	int CORRELATION_SET = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__PROPERTIES = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FaultHandlersImpl <em>Fault Handlers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.FaultHandlersImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFaultHandlers()
	 * @generated
	 */
	int FAULT_HANDLERS = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Catch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__CATCH = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS__CATCH_ALL = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fault Handlers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLERS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ActivityContainerImpl <em>Activity Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ActivityContainerImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getActivityContainer()
	 * @generated
	 */
	int ACTIVITY_CONTAINER = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER__ACTIVITY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONTAINER_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CatchImpl <em>Catch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.CatchImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCatch()
	 * @generated
	 */
	int CATCH = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__DOCUMENTATION = ACTIVITY_CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__ANY_ATTRIBUTE = ACTIVITY_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__ANY_ELEMENT = ACTIVITY_CONTAINER__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__STATE = ACTIVITY_CONTAINER__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__XPATH = ACTIVITY_CONTAINER__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__ID = ACTIVITY_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__INSTANCE_ID = ACTIVITY_CONTAINER__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__INSTANCE_BUFFER = ACTIVITY_CONTAINER__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__ACTIVITY = ACTIVITY_CONTAINER__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_NAME = ACTIVITY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_VARIABLE = ACTIVITY_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_MESSAGE_TYPE = ACTIVITY_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_ELEMENT = ACTIVITY_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_FEATURE_COUNT = ACTIVITY_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CatchAllImpl <em>Catch All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.CatchAllImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCatchAll()
	 * @generated
	 */
	int CATCH_ALL = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__DOCUMENTATION = ACTIVITY_CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__ANY_ATTRIBUTE = ACTIVITY_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__ANY_ELEMENT = ACTIVITY_CONTAINER__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__STATE = ACTIVITY_CONTAINER__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__XPATH = ACTIVITY_CONTAINER__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__ID = ACTIVITY_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__INSTANCE_ID = ACTIVITY_CONTAINER__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__INSTANCE_BUFFER = ACTIVITY_CONTAINER__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__ACTIVITY = ACTIVITY_CONTAINER__ACTIVITY;

	/**
	 * The number of structural features of the '<em>Catch All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL_FEATURE_COUNT = ACTIVITY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.EventHandlersImpl <em>Event Handlers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.EventHandlersImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getEventHandlers()
	 * @generated
	 */
	int EVENT_HANDLERS = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>On Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__ON_EVENT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS__ON_ALARM = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Handlers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLERS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OnMsgCommonImpl <em>On Msg Common</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.OnMsgCommonImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOnMsgCommon()
	 * @generated
	 */
	int ON_MSG_COMMON = 18;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__CORRELATIONS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__FROM_PARTS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__MESSAGE_EXCHANGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON__VARIABLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>On Msg Common</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MSG_COMMON_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OnEventImpl <em>On Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.OnEventImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOnEvent()
	 * @generated
	 */
	int ON_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__DOCUMENTATION = ON_MSG_COMMON__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__ANY_ATTRIBUTE = ON_MSG_COMMON__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__ANY_ELEMENT = ON_MSG_COMMON__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__STATE = ON_MSG_COMMON__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__XPATH = ON_MSG_COMMON__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__ID = ON_MSG_COMMON__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__INSTANCE_ID = ON_MSG_COMMON__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__INSTANCE_BUFFER = ON_MSG_COMMON__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__CORRELATIONS = ON_MSG_COMMON__CORRELATIONS;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__FROM_PARTS = ON_MSG_COMMON__FROM_PARTS;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__MESSAGE_EXCHANGE = ON_MSG_COMMON__MESSAGE_EXCHANGE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__VARIABLE = ON_MSG_COMMON__VARIABLE;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__SCOPE = ON_MSG_COMMON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__MESSAGE_TYPE = ON_MSG_COMMON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xsd Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__XSD_ELEMENT = ON_MSG_COMMON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>On Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT_FEATURE_COUNT = ON_MSG_COMMON_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CorrelationsImpl <em>Correlations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.CorrelationsImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCorrelations()
	 * @generated
	 */
	int CORRELATIONS = 19;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__CORRELATION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correlations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CorrelationImpl <em>Correlation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.CorrelationImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCorrelation()
	 * @generated
	 */
	int CORRELATION = 20;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__SET = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__INITIATE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__PATTERN = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OnAlarmImpl <em>On Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.OnAlarmImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOnAlarm()
	 * @generated
	 */
	int ON_ALARM = 21;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__FOR = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__UNTIL = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repeat Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__REPEAT_EVERY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__SCOPE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__ACTIVITY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>On Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ActivityImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 22;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TARGETS = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SOURCES = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUPPRESS_JOIN_FAILURE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.TargetsImpl <em>Targets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.TargetsImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getTargets()
	 * @generated
	 */
	int TARGETS = 23;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Join Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__JOIN_CONDITION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__TARGET = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Targets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.TargetImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 24;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__LINK_NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.SourcesImpl <em>Sources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.SourcesImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getSources()
	 * @generated
	 */
	int SOURCES = 25;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__SOURCE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.SourceImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 26;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Transition Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TRANSITION_CONDITION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LINK_NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.AssignImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 27;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__COPY = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension Assign Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__EXTENSION_ASSIGN_OPERATION = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__VALIDATE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.CopyImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 28;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__FROM = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__TO = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Keep Src Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__KEEP_SRC_ELEMENT_NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Missing From Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__IGNORE_MISSING_FROM_DATA = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FromImpl <em>From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.FromImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFrom()
	 * @generated
	 */
	int FROM = 30;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__LITERAL = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__QUERY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__EXPRESSION_LANGUAGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__VARIABLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__PART = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__PROPERTY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__PARTNER_LINK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Endpoint Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__ENDPOINT_REFERENCE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__OPAQUE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__EXPRESSION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OpaqueFromImpl <em>Opaque From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.OpaqueFromImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOpaqueFrom()
	 * @generated
	 */
	int OPAQUE_FROM = 29;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__DOCUMENTATION = FROM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__ANY_ATTRIBUTE = FROM__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__ANY_ELEMENT = FROM__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__STATE = FROM__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__XPATH = FROM__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__ID = FROM__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__INSTANCE_ID = FROM__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__INSTANCE_BUFFER = FROM__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__LITERAL = FROM__LITERAL;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__QUERY = FROM__QUERY;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__EXPRESSION_LANGUAGE = FROM__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__VARIABLE = FROM__VARIABLE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__PART = FROM__PART;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__PROPERTY = FROM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__PARTNER_LINK = FROM__PARTNER_LINK;

	/**
	 * The feature id for the '<em><b>Endpoint Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__ENDPOINT_REFERENCE = FROM__ENDPOINT_REFERENCE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__OPAQUE = FROM__OPAQUE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM__EXPRESSION = FROM__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Opaque From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_FROM_FEATURE_COUNT = FROM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.LiteralImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 31;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ANY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.QueryImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 32;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Query Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__QUERY_LANGUAGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__OPAQUE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__VALUE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ToImpl <em>To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ToImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getTo()
	 * @generated
	 */
	int TO = 33;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__QUERY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__OPAQUE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__EXPRESSION_LANGUAGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__VARIABLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__PART = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__PROPERTY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__PARTNER_LINK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__EXPRESSION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensionAssignOperationImpl <em>Extension Assign Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ExtensionAssignOperationImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExtensionAssignOperation()
	 * @generated
	 */
	int EXTENSION_ASSIGN_OPERATION = 34;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The number of structural features of the '<em>Extension Assign Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASSIGN_OPERATION_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CompensateImpl <em>Compensate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.CompensateImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCompensate()
	 * @generated
	 */
	int COMPENSATE = 35;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The number of structural features of the '<em>Compensate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CompensateScopeImpl <em>Compensate Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.CompensateScopeImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCompensateScope()
	 * @generated
	 */
	int COMPENSATE_SCOPE = 36;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__TARGET = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compensate Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.EmptyImpl <em>Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.EmptyImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getEmpty()
	 * @generated
	 */
	int EMPTY = 37;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The number of structural features of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensionActivityImpl <em>Extension Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ExtensionActivityImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExtensionActivity()
	 * @generated
	 */
	int EXTENSION_ACTIVITY = 38;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The number of structural features of the '<em>Extension Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.FlowImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 39;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__LINKS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ACTIVITY = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.LinksImpl <em>Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.LinksImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getLinks()
	 * @generated
	 */
	int LINKS = 40;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__LINK = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.LinkImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 41;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl <em>For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getForEach()
	 * @generated
	 */
	int FOR_EACH = 42;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Start Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__START_COUNTER_VALUE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__FINAL_COUNTER_VALUE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__COMPLETION_CONDITION = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__SCOPE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Counter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__COUNTER_NAME = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__PARALLEL = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__VARIABLE = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>State Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__STATE_BUFFER = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CompletionConditionImpl <em>Completion Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.CompletionConditionImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCompletionCondition()
	 * @generated
	 */
	int COMPLETION_CONDITION = 43;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__BRANCHES = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Completion Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ExpressionImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 65;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION_LANGUAGE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OPAQUE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__BODY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.BranchesImpl <em>Branches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.BranchesImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getBranches()
	 * @generated
	 */
	int BRANCHES = 44;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__DOCUMENTATION = EXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__ANY_ELEMENT = EXPRESSION__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__STATE = EXPRESSION__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__XPATH = EXPRESSION__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__INSTANCE_ID = EXPRESSION__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__INSTANCE_BUFFER = EXPRESSION__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__OPAQUE = EXPRESSION__OPAQUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__BODY = EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Successful Branches Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__SUCCESSFUL_BRANCHES_ONLY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.IfImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getIf()
	 * @generated
	 */
	int IF = 45;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ACTIVITY = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elseif</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSEIF = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ElseifImpl <em>Elseif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ElseifImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getElseif()
	 * @generated
	 */
	int ELSEIF = 46;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__CONDITION = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF__ACTIVITY = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elseif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSEIF_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ElseImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 47;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__DOCUMENTATION = ACTIVITY_CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__ANY_ATTRIBUTE = ACTIVITY_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__ANY_ELEMENT = ACTIVITY_CONTAINER__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__STATE = ACTIVITY_CONTAINER__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__XPATH = ACTIVITY_CONTAINER__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__ID = ACTIVITY_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__INSTANCE_ID = ACTIVITY_CONTAINER__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__INSTANCE_BUFFER = ACTIVITY_CONTAINER__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__ACTIVITY = ACTIVITY_CONTAINER__ACTIVITY;

	/**
	 * The number of structural features of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = ACTIVITY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl <em>Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getInvoke()
	 * @generated
	 */
	int INVOKE = 48;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Dangling Message Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__DANGLING_MESSAGE_LINK = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__CORRELATIONS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__CATCH = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Catch All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__CATCH_ALL = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compensation Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__COMPENSATION_HANDLER = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>To Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TO_PARTS = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FROM_PARTS = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Input Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__INPUT_VARIABLE = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__OUTPUT_VARIABLE = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FromPartsImpl <em>From Parts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.FromPartsImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFromParts()
	 * @generated
	 */
	int FROM_PARTS = 49;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>From Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS__FROM_PART = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>From Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PARTS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FromPartImpl <em>From Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.FromPartImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFromPart()
	 * @generated
	 */
	int FROM_PART = 50;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__PART = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__TO_VARIABLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>From Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ToPartsImpl <em>To Parts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ToPartsImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getToParts()
	 * @generated
	 */
	int TO_PARTS = 51;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>To Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS__TO_PART = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PARTS_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ToPartImpl <em>To Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ToPartImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getToPart()
	 * @generated
	 */
	int TO_PART = 52;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__DOCUMENTATION = EXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__ANY_ATTRIBUTE = EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__ANY_ELEMENT = EXTENSIBLE_ELEMENTS__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__STATE = EXTENSIBLE_ELEMENTS__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__XPATH = EXTENSIBLE_ELEMENTS__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__ID = EXTENSIBLE_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__INSTANCE_ID = EXTENSIBLE_ELEMENTS__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__INSTANCE_BUFFER = EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__PART = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__FROM_VARIABLE = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART_FEATURE_COUNT = EXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.PickImpl <em>Pick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PickImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getPick()
	 * @generated
	 */
	int PICK = 53;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>On Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ON_MESSAGE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ON_ALARM = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Create Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__CREATE_INSTANCE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OnMessageImpl <em>On Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.OnMessageImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOnMessage()
	 * @generated
	 */
	int ON_MESSAGE = 54;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__DOCUMENTATION = ON_MSG_COMMON__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__ANY_ATTRIBUTE = ON_MSG_COMMON__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__ANY_ELEMENT = ON_MSG_COMMON__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__STATE = ON_MSG_COMMON__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__XPATH = ON_MSG_COMMON__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__ID = ON_MSG_COMMON__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__INSTANCE_ID = ON_MSG_COMMON__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__INSTANCE_BUFFER = ON_MSG_COMMON__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__CORRELATIONS = ON_MSG_COMMON__CORRELATIONS;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__FROM_PARTS = ON_MSG_COMMON__FROM_PARTS;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__MESSAGE_EXCHANGE = ON_MSG_COMMON__MESSAGE_EXCHANGE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__VARIABLE = ON_MSG_COMMON__VARIABLE;

	/**
	 * The feature id for the '<em><b>Dangling Message Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__DANGLING_MESSAGE_LINK = ON_MSG_COMMON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__ACTIVITY = ON_MSG_COMMON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__NAME = ON_MSG_COMMON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>On Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_FEATURE_COUNT = ON_MSG_COMMON_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ReceiveImpl <em>Receive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ReceiveImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getReceive()
	 * @generated
	 */
	int RECEIVE = 55;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Dangling Message Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__DANGLING_MESSAGE_LINK = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__CORRELATIONS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__FROM_PARTS = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__VARIABLE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Create Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__CREATE_INSTANCE = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__MESSAGE_EXCHANGE = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.RepeatUntilImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getRepeatUntil()
	 * @generated
	 */
	int REPEAT_UNTIL = 56;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__ACTIVITY = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__CONDITION = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat Until</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ReplyImpl <em>Reply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ReplyImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getReply()
	 * @generated
	 */
	int REPLY = 57;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Dangling Message Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__DANGLING_MESSAGE_LINK = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__CORRELATIONS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__TO_PARTS = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__VARIABLE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__FAULT_NAME = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__MESSAGE_EXCHANGE = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Reply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.RethrowImpl <em>Rethrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.RethrowImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getRethrow()
	 * @generated
	 */
	int RETHROW = 58;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The number of structural features of the '<em>Rethrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 59;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Message Exchanges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__MESSAGE_EXCHANGES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__VARIABLES = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CORRELATION_SETS = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__FAULT_HANDLERS = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compensation Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__COMPENSATION_HANDLER = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Termination Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__TERMINATION_HANDLER = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EVENT_HANDLERS = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ACTIVITY = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Isolated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ISOLATED = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EXIT_ON_STANDARD_FAULT = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.SequenceImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 60;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVITY = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ThrowImpl <em>Throw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ThrowImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getThrow()
	 * @generated
	 */
	int THROW = 61;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__FAULT_NAME = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__FAULT_VARIABLE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ValidateImpl <em>Validate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ValidateImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getValidate()
	 * @generated
	 */
	int VALIDATE = 62;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__VARIABLES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Validate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.WaitImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 63;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__FOR = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__UNTIL = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.WhileImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 64;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ACTIVITY = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__STATE_BUFFER = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ForImpl <em>For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ForImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFor()
	 * @generated
	 */
	int FOR = 66;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__DOCUMENTATION = EXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__ANY_ELEMENT = EXPRESSION__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__STATE = EXPRESSION__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__XPATH = EXPRESSION__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__INSTANCE_ID = EXPRESSION__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__INSTANCE_BUFFER = EXPRESSION__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__OPAQUE = EXPRESSION__OPAQUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__BODY = EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.UntilImpl <em>Until</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.UntilImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getUntil()
	 * @generated
	 */
	int UNTIL = 67;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__DOCUMENTATION = EXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__ANY_ELEMENT = EXPRESSION__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__STATE = EXPRESSION__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__XPATH = EXPRESSION__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__INSTANCE_ID = EXPRESSION__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__INSTANCE_BUFFER = EXPRESSION__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__OPAQUE = EXPRESSION__OPAQUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__BODY = EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Until</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.ConditionImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 68;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DOCUMENTATION = EXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ANY_ELEMENT = EXPRESSION__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATE = EXPRESSION__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__XPATH = EXPRESSION__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__INSTANCE_ID = EXPRESSION__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__INSTANCE_BUFFER = EXPRESSION__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OPAQUE = EXPRESSION__OPAQUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__BODY = EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.TransitionConditionImpl <em>Transition Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.TransitionConditionImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getTransitionCondition()
	 * @generated
	 */
	int TRANSITION_CONDITION = 69;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__DOCUMENTATION = CONDITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__ANY_ATTRIBUTE = CONDITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__ANY_ELEMENT = CONDITION__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__STATE = CONDITION__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__XPATH = CONDITION__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__INSTANCE_ID = CONDITION__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__INSTANCE_BUFFER = CONDITION__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__EXPRESSION_LANGUAGE = CONDITION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__OPAQUE = CONDITION__OPAQUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION__BODY = CONDITION__BODY;

	/**
	 * The number of structural features of the '<em>Transition Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.JoinConditionImpl <em>Join Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.JoinConditionImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getJoinCondition()
	 * @generated
	 */
	int JOIN_CONDITION = 70;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__DOCUMENTATION = CONDITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__ANY_ATTRIBUTE = CONDITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__ANY_ELEMENT = CONDITION__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__STATE = CONDITION__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__XPATH = CONDITION__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__INSTANCE_ID = CONDITION__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__INSTANCE_BUFFER = CONDITION__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__EXPRESSION_LANGUAGE = CONDITION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__OPAQUE = CONDITION__OPAQUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION__BODY = CONDITION__BODY;

	/**
	 * The number of structural features of the '<em>Join Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.RepeatEveryImpl <em>Repeat Every</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.RepeatEveryImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getRepeatEvery()
	 * @generated
	 */
	int REPEAT_EVERY = 71;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__DOCUMENTATION = EXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__ANY_ELEMENT = EXPRESSION__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__STATE = EXPRESSION__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__XPATH = EXPRESSION__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__INSTANCE_ID = EXPRESSION__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__INSTANCE_BUFFER = EXPRESSION__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__OPAQUE = EXPRESSION__OPAQUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__BODY = EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Repeat Every</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.StartCounterValueImpl <em>Start Counter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.StartCounterValueImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getStartCounterValue()
	 * @generated
	 */
	int START_COUNTER_VALUE = 72;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__DOCUMENTATION = EXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__ANY_ELEMENT = EXPRESSION__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__STATE = EXPRESSION__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__XPATH = EXPRESSION__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__INSTANCE_ID = EXPRESSION__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__INSTANCE_BUFFER = EXPRESSION__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__OPAQUE = EXPRESSION__OPAQUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE__BODY = EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Start Counter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_COUNTER_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FinalCounterValueImpl <em>Final Counter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.FinalCounterValueImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFinalCounterValue()
	 * @generated
	 */
	int FINAL_COUNTER_VALUE = 73;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__DOCUMENTATION = EXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__ANY_ELEMENT = EXPRESSION__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__STATE = EXPRESSION__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__XPATH = EXPRESSION__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__INSTANCE_ID = EXPRESSION__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__INSTANCE_BUFFER = EXPRESSION__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__OPAQUE = EXPRESSION__OPAQUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE__BODY = EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Final Counter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COUNTER_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OpaqueActivityImpl <em>Opaque Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.OpaqueActivityImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOpaqueActivity()
	 * @generated
	 */
	int OPAQUE_ACTIVITY = 74;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__ANY_ELEMENT = ACTIVITY__ANY_ELEMENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__XPATH = ACTIVITY__XPATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__INSTANCE_ID = ACTIVITY__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Instance Buffer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__INSTANCE_BUFFER = ACTIVITY__INSTANCE_BUFFER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK = ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK;

	/**
	 * The number of structural features of the '<em>Opaque Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.CLinkable <em>CLinkable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.CLinkable
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCLinkable()
	 * @generated
	 */
	int CLINKABLE = 75;

	/**
	 * The feature id for the '<em><b>Dangling Message Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINKABLE__DANGLING_MESSAGE_LINK = 0;

	/**
	 * The number of structural features of the '<em>CLinkable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINKABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.DanglingMessageLinkImpl <em>Dangling Message Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.DanglingMessageLinkImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getDanglingMessageLink()
	 * @generated
	 */
	int DANGLING_MESSAGE_LINK = 76;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_MESSAGE_LINK__URI = 0;

	/**
	 * The number of structural features of the '<em>Dangling Message Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_MESSAGE_LINK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.DanglingFlowActivityLinkImpl <em>Dangling Flow Activity Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.DanglingFlowActivityLinkImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getDanglingFlowActivityLink()
	 * @generated
	 */
	int DANGLING_FLOW_ACTIVITY_LINK = 77;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_FLOW_ACTIVITY_LINK__URI = 0;

	/**
	 * The number of structural features of the '<em>Dangling Flow Activity Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_FLOW_ACTIVITY_LINK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.impl.LoopIterationImpl <em>Loop Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.impl.LoopIterationImpl
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getLoopIteration()
	 * @generated
	 */
	int LOOP_ITERATION = 78;

	/**
	 * The feature id for the '<em><b>Loop Iteration Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ITERATION__LOOP_ITERATION_COUNTER = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ITERATION__ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Loop Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ITERATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.Initiate <em>Initiate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.Initiate
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getInitiate()
	 * @generated
	 */
	int INITIATE = 79;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.Roles <em>Roles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.Roles
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getRoles()
	 * @generated
	 */
	int ROLES = 80;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.Pattern <em>Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.Pattern
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 81;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.Boolean <em>Boolean</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 82;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.OpaqueStr <em>Opaque Str</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.OpaqueStr
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOpaqueStr()
	 * @generated
	 */
	int OPAQUE_STR = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel4chor.model.pbd.OpaqueBoolean <em>Opaque Boolean</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel4chor.model.pbd.OpaqueBoolean
	 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOpaqueBoolean()
	 * @generated
	 */
	int OPAQUE_BOOLEAN = 84;


	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements <em>Extensible Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensible Elements</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensibleElements
	 * @generated
	 */
	EClass getExtensibleElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getDocumentation()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EReference getExtensibleElements_Documentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getAnyAttribute()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EAttribute getExtensibleElements_AnyAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getAnyElement <em>Any Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Element</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getAnyElement()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EReference getExtensibleElements_AnyElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getState()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EAttribute getExtensibleElements_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getXpath()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EAttribute getExtensibleElements_Xpath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getId()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EAttribute getExtensibleElements_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getInstanceID()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EAttribute getExtensibleElements_InstanceID();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getInstanceBuffer <em>Instance Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Instance Buffer</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getInstanceBuffer()
	 * @see #getExtensibleElements()
	 * @generated
	 */
	EReference getExtensibleElements_InstanceBuffer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Documentation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Documentation#getSource()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Documentation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Documentation#getLang()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Lang();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Documentation#getAnyElement <em>Any Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Element</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Documentation#getAnyElement()
	 * @see #getDocumentation()
	 * @generated
	 */
	EReference getDocumentation_AnyElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Process#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getExtensions()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Extensions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Process#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getImport()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Process#getMessageExchanges <em>Message Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Exchanges</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getMessageExchanges()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_MessageExchanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Process#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getVariables()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Process#getCorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Sets</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getCorrelationSets()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_CorrelationSets();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Process#getFaultHandlers <em>Fault Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Handlers</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getFaultHandlers()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FaultHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Process#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Handlers</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getEventHandlers()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_EventHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Process#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getActivity()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Activity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Process#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getTargetNamespace()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Process#getQueryLanguage <em>Query Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Language</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getQueryLanguage()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_QueryLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Process#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getExpressionLanguage()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Process#getSuppressJoinFailure <em>Suppress Join Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Join Failure</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getSuppressJoinFailure()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_SuppressJoinFailure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Process#getExitOnStandardFault <em>Exit On Standard Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit On Standard Fault</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getExitOnStandardFault()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ExitOnStandardFault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Process#getAbstractProcessProfile <em>Abstract Process Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Process Profile</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Process#getAbstractProcessProfile()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_AbstractProcessProfile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Extensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensions</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Extensions
	 * @generated
	 */
	EClass getExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Extensions#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Extensions#getExtension()
	 * @see #getExtensions()
	 * @generated
	 */
	EReference getExtensions_Extension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Extension#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Extension#getNamespace()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Extension#getMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Extension#getMustUnderstand()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_MustUnderstand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Import#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Import#getNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Import#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Import#getLocation()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Import#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Import#getImportType()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.MessageExchanges <em>Message Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Exchanges</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.MessageExchanges
	 * @generated
	 */
	EClass getMessageExchanges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.MessageExchanges#getMessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Exchange</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.MessageExchanges#getMessageExchange()
	 * @see #getMessageExchanges()
	 * @generated
	 */
	EReference getMessageExchanges_MessageExchange();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.MessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Exchange</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.MessageExchange
	 * @generated
	 */
	EClass getMessageExchange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.MessageExchange#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.MessageExchange#getName()
	 * @see #getMessageExchange()
	 * @generated
	 */
	EAttribute getMessageExchange_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Variables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variables</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Variables
	 * @generated
	 */
	EClass getVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Variables#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Variables#getVariable()
	 * @see #getVariables()
	 * @generated
	 */
	EReference getVariables_Variable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Variable#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Variable#getFrom()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_From();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Variable#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Type</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Variable#getMessageType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_MessageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Variable#getXsdElement <em>Xsd Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xsd Element</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Variable#getXsdElement()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_XsdElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.CorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Sets</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CorrelationSets
	 * @generated
	 */
	EClass getCorrelationSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.CorrelationSets#getCorrelationSet <em>Correlation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Set</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CorrelationSets#getCorrelationSet()
	 * @see #getCorrelationSets()
	 * @generated
	 */
	EReference getCorrelationSets_CorrelationSet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.CorrelationSet <em>Correlation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Set</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CorrelationSet
	 * @generated
	 */
	EClass getCorrelationSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.CorrelationSet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CorrelationSet#getProperties()
	 * @see #getCorrelationSet()
	 * @generated
	 */
	EAttribute getCorrelationSet_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.CorrelationSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CorrelationSet#getName()
	 * @see #getCorrelationSet()
	 * @generated
	 */
	EAttribute getCorrelationSet_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.FaultHandlers <em>Fault Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Handlers</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.FaultHandlers
	 * @generated
	 */
	EClass getFaultHandlers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.FaultHandlers#getCatch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.FaultHandlers#getCatch()
	 * @see #getFaultHandlers()
	 * @generated
	 */
	EReference getFaultHandlers_Catch();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.FaultHandlers#getCatchAll <em>Catch All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch All</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.FaultHandlers#getCatchAll()
	 * @see #getFaultHandlers()
	 * @generated
	 */
	EReference getFaultHandlers_CatchAll();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Catch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Catch
	 * @generated
	 */
	EClass getCatch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Catch#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Catch#getFaultName()
	 * @see #getCatch()
	 * @generated
	 */
	EAttribute getCatch_FaultName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Catch#getFaultVariable <em>Fault Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Catch#getFaultVariable()
	 * @see #getCatch()
	 * @generated
	 */
	EAttribute getCatch_FaultVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Catch#getFaultMessageType <em>Fault Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Message Type</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Catch#getFaultMessageType()
	 * @see #getCatch()
	 * @generated
	 */
	EAttribute getCatch_FaultMessageType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Catch#getFaultElement <em>Fault Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Element</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Catch#getFaultElement()
	 * @see #getCatch()
	 * @generated
	 */
	EAttribute getCatch_FaultElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.CatchAll <em>Catch All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch All</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CatchAll
	 * @generated
	 */
	EClass getCatchAll();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.ActivityContainer <em>Activity Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Container</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ActivityContainer
	 * @generated
	 */
	EClass getActivityContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.ActivityContainer#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ActivityContainer#getActivity()
	 * @see #getActivityContainer()
	 * @generated
	 */
	EReference getActivityContainer_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.EventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handlers</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.EventHandlers
	 * @generated
	 */
	EClass getEventHandlers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.EventHandlers#getOnEvent <em>On Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Event</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.EventHandlers#getOnEvent()
	 * @see #getEventHandlers()
	 * @generated
	 */
	EReference getEventHandlers_OnEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.EventHandlers#getOnAlarm <em>On Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Alarm</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.EventHandlers#getOnAlarm()
	 * @see #getEventHandlers()
	 * @generated
	 */
	EReference getEventHandlers_OnAlarm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.OnEvent <em>On Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Event</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnEvent
	 * @generated
	 */
	EClass getOnEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.OnEvent#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnEvent#getScope()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.OnEvent#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnEvent#getMessageType()
	 * @see #getOnEvent()
	 * @generated
	 */
	EAttribute getOnEvent_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.OnEvent#getXsdElement <em>Xsd Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xsd Element</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnEvent#getXsdElement()
	 * @see #getOnEvent()
	 * @generated
	 */
	EAttribute getOnEvent_XsdElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.OnMsgCommon <em>On Msg Common</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Msg Common</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnMsgCommon
	 * @generated
	 */
	EClass getOnMsgCommon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.OnMsgCommon#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnMsgCommon#getCorrelations()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EReference getOnMsgCommon_Correlations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.OnMsgCommon#getFromParts <em>From Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Parts</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnMsgCommon#getFromParts()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EReference getOnMsgCommon_FromParts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.OnMsgCommon#getMessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnMsgCommon#getMessageExchange()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EAttribute getOnMsgCommon_MessageExchange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.OnMsgCommon#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnMsgCommon#getVariable()
	 * @see #getOnMsgCommon()
	 * @generated
	 */
	EAttribute getOnMsgCommon_Variable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Correlations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlations</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Correlations
	 * @generated
	 */
	EClass getCorrelations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Correlations#getCorrelation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Correlations#getCorrelation()
	 * @see #getCorrelations()
	 * @generated
	 */
	EReference getCorrelations_Correlation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Correlation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Correlation
	 * @generated
	 */
	EClass getCorrelation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Correlation#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Correlation#getSet()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Set();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Correlation#getInitiate <em>Initiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiate</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Correlation#getInitiate()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Initiate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Correlation#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Correlation#getPattern()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Pattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm <em>On Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Alarm</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnAlarm
	 * @generated
	 */
	EClass getOnAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnAlarm#getFor()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EReference getOnAlarm_For();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnAlarm#getUntil()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EReference getOnAlarm_Until();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getRepeatEvery <em>Repeat Every</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Every</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnAlarm#getRepeatEvery()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EReference getOnAlarm_RepeatEvery();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnAlarm#getScope()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EReference getOnAlarm_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.OnAlarm#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnAlarm#getActivity()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EReference getOnAlarm_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Activity#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Targets</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Activity#getTargets()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Targets();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Activity#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sources</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Activity#getSources()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Sources();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Activity#getSuppressJoinFailure <em>Suppress Join Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Join Failure</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Activity#getSuppressJoinFailure()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_SuppressJoinFailure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Activity#getDanglingFlowActivityLink <em>Dangling Flow Activity Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dangling Flow Activity Link</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Activity#getDanglingFlowActivityLink()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_DanglingFlowActivityLink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Targets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Targets</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Targets
	 * @generated
	 */
	EClass getTargets();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Targets#getJoinCondition <em>Join Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Targets#getJoinCondition()
	 * @see #getTargets()
	 * @generated
	 */
	EReference getTargets_JoinCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Targets#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Targets#getTarget()
	 * @see #getTargets()
	 * @generated
	 */
	EReference getTargets_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Target#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Target#getLinkName()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_LinkName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Sources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sources</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Sources
	 * @generated
	 */
	EClass getSources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Sources#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Sources#getSource()
	 * @see #getSources()
	 * @generated
	 */
	EReference getSources_Source();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Source#getTransitionCondition <em>Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Source#getTransitionCondition()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_TransitionCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Source#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Source#getLinkName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_LinkName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Assign#getCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Copy</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Assign#getCopy()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Copy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Assign#getExtensionAssignOperation <em>Extension Assign Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Assign Operation</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Assign#getExtensionAssignOperation()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_ExtensionAssignOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Assign#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Assign#getValidate()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Validate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Copy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Copy#getFrom()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Copy#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Copy#getTo()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_To();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Copy#getKeepSrcElementName <em>Keep Src Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep Src Element Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Copy#getKeepSrcElementName()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_KeepSrcElementName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Copy#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Missing From Data</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Copy#getIgnoreMissingFromData()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_IgnoreMissingFromData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.OpaqueFrom <em>Opaque From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque From</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OpaqueFrom
	 * @generated
	 */
	EClass getOpaqueFrom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.From <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From
	 * @generated
	 */
	EClass getFrom();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.From#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From#getLiteral()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Literal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.From#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From#getQuery()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.From#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From#getExpressionLanguage()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.From#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From#getVariable()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.From#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From#getPart()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Part();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.From#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From#getProperty()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.From#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From#getPartnerLink()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_PartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.From#getEndpointReference <em>Endpoint Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Reference</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From#getEndpointReference()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_EndpointReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.From#getOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From#getOpaque()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Opaque();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.From#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.From#getExpression()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Literal#getAnyElement <em>Any Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Element</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Literal#getAnyElement()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_AnyElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Query#getQueryLanguage <em>Query Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Language</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Query#getQueryLanguage()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_QueryLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Query#getOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Query#getOpaque()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Opaque();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Query#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Query#getValue()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.To <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.To
	 * @generated
	 */
	EClass getTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.To#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.To#getQuery()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.To#getOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.To#getOpaque()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_Opaque();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.To#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.To#getExpressionLanguage()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.To#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.To#getVariable()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.To#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.To#getPart()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_Part();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.To#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.To#getProperty()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.To#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.To#getPartnerLink()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_PartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.To#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.To#getExpression()
	 * @see #getTo()
	 * @generated
	 */
	EAttribute getTo_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.ExtensionAssignOperation <em>Extension Assign Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Assign Operation</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensionAssignOperation
	 * @generated
	 */
	EClass getExtensionAssignOperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Compensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensate</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Compensate
	 * @generated
	 */
	EClass getCompensate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.CompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensate Scope</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CompensateScope
	 * @generated
	 */
	EClass getCompensateScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.CompensateScope#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CompensateScope#getTarget()
	 * @see #getCompensateScope()
	 * @generated
	 */
	EAttribute getCompensateScope_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Empty
	 * @generated
	 */
	EClass getEmpty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.ExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ExtensionActivity
	 * @generated
	 */
	EClass getExtensionActivity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Flow#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Links</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Flow#getLinks()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Flow#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Flow#getActivity()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Links <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Links</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Links
	 * @generated
	 */
	EClass getLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Links#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Links#getLink()
	 * @see #getLinks()
	 * @generated
	 */
	EReference getLinks_Link();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.ForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ForEach
	 * @generated
	 */
	EClass getForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getStartCounterValue <em>Start Counter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Counter Value</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ForEach#getStartCounterValue()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_StartCounterValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getFinalCounterValue <em>Final Counter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Counter Value</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ForEach#getFinalCounterValue()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_FinalCounterValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ForEach#getCompletionCondition()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_CompletionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ForEach#getScope()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getCounterName <em>Counter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ForEach#getCounterName()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_CounterName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ForEach#getParallel()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_Parallel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ForEach#getVariable()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getStateBuffer <em>State Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Buffer</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ForEach#getStateBuffer()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_StateBuffer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.CompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CompletionCondition
	 * @generated
	 */
	EClass getCompletionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.CompletionCondition#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branches</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CompletionCondition#getBranches()
	 * @see #getCompletionCondition()
	 * @generated
	 */
	EReference getCompletionCondition_Branches();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Branches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branches</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Branches
	 * @generated
	 */
	EClass getBranches();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Branches#getSuccessfulBranchesOnly <em>Successful Branches Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Successful Branches Only</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Branches#getSuccessfulBranchesOnly()
	 * @see #getBranches()
	 * @generated
	 */
	EAttribute getBranches_SuccessfulBranchesOnly();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.If#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.If#getActivity()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.If#getElseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elseif</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.If#getElseif()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elseif();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Elseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elseif</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Elseif
	 * @generated
	 */
	EClass getElseif();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Elseif#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Elseif#getCondition()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Elseif#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Elseif#getActivity()
	 * @see #getElseif()
	 * @generated
	 */
	EReference getElseif_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Invoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Invoke
	 * @generated
	 */
	EClass getInvoke();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Invoke#getCorrelations()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Correlations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCatch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Invoke#getCatch()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Catch();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCatchAll <em>Catch All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch All</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Invoke#getCatchAll()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_CatchAll();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCompensationHandler <em>Compensation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensation Handler</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Invoke#getCompensationHandler()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_CompensationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getToParts <em>To Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Parts</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Invoke#getToParts()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_ToParts();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getFromParts <em>From Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Parts</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Invoke#getFromParts()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_FromParts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getInputVariable <em>Input Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Invoke#getInputVariable()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_InputVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getOutputVariable <em>Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Invoke#getOutputVariable()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_OutputVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.FromParts <em>From Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Parts</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.FromParts
	 * @generated
	 */
	EClass getFromParts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.FromParts#getFromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>From Part</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.FromParts#getFromPart()
	 * @see #getFromParts()
	 * @generated
	 */
	EReference getFromParts_FromPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.FromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Part</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.FromPart
	 * @generated
	 */
	EClass getFromPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.FromPart#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.FromPart#getPart()
	 * @see #getFromPart()
	 * @generated
	 */
	EAttribute getFromPart_Part();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.FromPart#getToVariable <em>To Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.FromPart#getToVariable()
	 * @see #getFromPart()
	 * @generated
	 */
	EAttribute getFromPart_ToVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.ToParts <em>To Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Parts</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ToParts
	 * @generated
	 */
	EClass getToParts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.ToParts#getToPart <em>To Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Part</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ToParts#getToPart()
	 * @see #getToParts()
	 * @generated
	 */
	EReference getToParts_ToPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.ToPart <em>To Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Part</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ToPart
	 * @generated
	 */
	EClass getToPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.ToPart#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ToPart#getPart()
	 * @see #getToPart()
	 * @generated
	 */
	EAttribute getToPart_Part();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.ToPart#getFromVariable <em>From Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.ToPart#getFromVariable()
	 * @see #getToPart()
	 * @generated
	 */
	EAttribute getToPart_FromVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Pick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Pick
	 * @generated
	 */
	EClass getPick();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Pick#getOnMessage <em>On Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Message</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Pick#getOnMessage()
	 * @see #getPick()
	 * @generated
	 */
	EReference getPick_OnMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Pick#getOnAlarm <em>On Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Alarm</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Pick#getOnAlarm()
	 * @see #getPick()
	 * @generated
	 */
	EReference getPick_OnAlarm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Pick#getCreateInstance <em>Create Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Instance</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Pick#getCreateInstance()
	 * @see #getPick()
	 * @generated
	 */
	EAttribute getPick_CreateInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.OnMessage <em>On Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Message</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnMessage
	 * @generated
	 */
	EClass getOnMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.OnMessage#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnMessage#getActivity()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Activity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.OnMessage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OnMessage#getName()
	 * @see #getOnMessage()
	 * @generated
	 */
	EAttribute getOnMessage_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Receive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Receive
	 * @generated
	 */
	EClass getReceive();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Receive#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Receive#getCorrelations()
	 * @see #getReceive()
	 * @generated
	 */
	EReference getReceive_Correlations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Receive#getFromParts <em>From Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Parts</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Receive#getFromParts()
	 * @see #getReceive()
	 * @generated
	 */
	EReference getReceive_FromParts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Receive#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Receive#getVariable()
	 * @see #getReceive()
	 * @generated
	 */
	EAttribute getReceive_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Receive#getCreateInstance <em>Create Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Instance</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Receive#getCreateInstance()
	 * @see #getReceive()
	 * @generated
	 */
	EAttribute getReceive_CreateInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Receive#getMessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Receive#getMessageExchange()
	 * @see #getReceive()
	 * @generated
	 */
	EAttribute getReceive_MessageExchange();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Until</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.RepeatUntil
	 * @generated
	 */
	EClass getRepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.RepeatUntil#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.RepeatUntil#getActivity()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.RepeatUntil#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.RepeatUntil#getCondition()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Condition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Reply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Reply
	 * @generated
	 */
	EClass getReply();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Reply#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Reply#getCorrelations()
	 * @see #getReply()
	 * @generated
	 */
	EReference getReply_Correlations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Reply#getToParts <em>To Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Parts</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Reply#getToParts()
	 * @see #getReply()
	 * @generated
	 */
	EReference getReply_ToParts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Reply#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Reply#getVariable()
	 * @see #getReply()
	 * @generated
	 */
	EAttribute getReply_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Reply#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Reply#getFaultName()
	 * @see #getReply()
	 * @generated
	 */
	EAttribute getReply_FaultName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Reply#getMessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Reply#getMessageExchange()
	 * @see #getReply()
	 * @generated
	 */
	EAttribute getReply_MessageExchange();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Rethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rethrow</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Rethrow
	 * @generated
	 */
	EClass getRethrow();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Scope#getMessageExchanges <em>Message Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Exchanges</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope#getMessageExchanges()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_MessageExchanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Scope#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope#getVariables()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Scope#getCorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Sets</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope#getCorrelationSets()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_CorrelationSets();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Scope#getFaultHandlers <em>Fault Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Handlers</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope#getFaultHandlers()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_FaultHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Scope#getCompensationHandler <em>Compensation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensation Handler</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope#getCompensationHandler()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_CompensationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Scope#getTerminationHandler <em>Termination Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Termination Handler</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope#getTerminationHandler()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_TerminationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Scope#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Handlers</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope#getEventHandlers()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_EventHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Scope#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope#getActivity()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Activity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Scope#getIsolated <em>Isolated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolated</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope#getIsolated()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Isolated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Scope#getExitOnStandardFault <em>Exit On Standard Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit On Standard Fault</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Scope#getExitOnStandardFault()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_ExitOnStandardFault();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.Sequence#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Sequence#getActivity()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Throw <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Throw
	 * @generated
	 */
	EClass getThrow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Throw#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Throw#getFaultName()
	 * @see #getThrow()
	 * @generated
	 */
	EAttribute getThrow_FaultName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Throw#getFaultVariable <em>Fault Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Variable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Throw#getFaultVariable()
	 * @see #getThrow()
	 * @generated
	 */
	EAttribute getThrow_FaultVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Validate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Validate
	 * @generated
	 */
	EClass getValidate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Validate#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variables</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Validate#getVariables()
	 * @see #getValidate()
	 * @generated
	 */
	EAttribute getValidate_Variables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Wait#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Wait#getFor()
	 * @see #getWait()
	 * @generated
	 */
	EReference getWait_For();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.Wait#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Wait#getUntil()
	 * @see #getWait()
	 * @generated
	 */
	EReference getWait_Until();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.While#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.While#getActivity()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.While#getStateBuffer <em>State Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Buffer</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.While#getStateBuffer()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_StateBuffer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Expression#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Expression#getExpressionLanguage()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Expression#getOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Expression#getOpaque()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Opaque();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.Expression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Expression#getBody()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.For <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.For
	 * @generated
	 */
	EClass getFor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Until <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Until</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Until
	 * @generated
	 */
	EClass getUntil();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.TransitionCondition <em>Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.TransitionCondition
	 * @generated
	 */
	EClass getTransitionCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.JoinCondition <em>Join Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Condition</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.JoinCondition
	 * @generated
	 */
	EClass getJoinCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.RepeatEvery <em>Repeat Every</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Every</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.RepeatEvery
	 * @generated
	 */
	EClass getRepeatEvery();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.StartCounterValue <em>Start Counter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Counter Value</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.StartCounterValue
	 * @generated
	 */
	EClass getStartCounterValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.FinalCounterValue <em>Final Counter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Counter Value</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.FinalCounterValue
	 * @generated
	 */
	EClass getFinalCounterValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.OpaqueActivity <em>Opaque Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OpaqueActivity
	 * @generated
	 */
	EClass getOpaqueActivity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.CLinkable <em>CLinkable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLinkable</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CLinkable
	 * @generated
	 */
	EClass getCLinkable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel4chor.model.pbd.CLinkable#getDanglingMessageLink <em>Dangling Message Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dangling Message Link</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.CLinkable#getDanglingMessageLink()
	 * @see #getCLinkable()
	 * @generated
	 */
	EReference getCLinkable_DanglingMessageLink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.DanglingMessageLink <em>Dangling Message Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dangling Message Link</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.DanglingMessageLink
	 * @generated
	 */
	EClass getDanglingMessageLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.DanglingMessageLink#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.DanglingMessageLink#getURI()
	 * @see #getDanglingMessageLink()
	 * @generated
	 */
	EAttribute getDanglingMessageLink_URI();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.DanglingFlowActivityLink <em>Dangling Flow Activity Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dangling Flow Activity Link</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.DanglingFlowActivityLink
	 * @generated
	 */
	EClass getDanglingFlowActivityLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.DanglingFlowActivityLink#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.DanglingFlowActivityLink#getURI()
	 * @see #getDanglingFlowActivityLink()
	 * @generated
	 */
	EAttribute getDanglingFlowActivityLink_URI();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel4chor.model.pbd.LoopIteration <em>Loop Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Iteration</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.LoopIteration
	 * @generated
	 */
	EClass getLoopIteration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel4chor.model.pbd.LoopIteration#getLoopIterationCounter <em>Loop Iteration Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Iteration Counter</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.LoopIteration#getLoopIterationCounter()
	 * @see #getLoopIteration()
	 * @generated
	 */
	EAttribute getLoopIteration_LoopIterationCounter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel4chor.model.pbd.LoopIteration#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.LoopIteration#getActivity()
	 * @see #getLoopIteration()
	 * @generated
	 */
	EReference getLoopIteration_Activity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.pbd.Initiate <em>Initiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Initiate</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Initiate
	 * @generated
	 */
	EEnum getInitiate();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.pbd.Roles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Roles</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Roles
	 * @generated
	 */
	EEnum getRoles();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.pbd.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pattern</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Pattern
	 * @generated
	 */
	EEnum getPattern();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.pbd.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @generated
	 */
	EEnum getBoolean();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.pbd.OpaqueStr <em>Opaque Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Opaque Str</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OpaqueStr
	 * @generated
	 */
	EEnum getOpaqueStr();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel4chor.model.pbd.OpaqueBoolean <em>Opaque Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Opaque Boolean</em>'.
	 * @see org.eclipse.bpel4chor.model.pbd.OpaqueBoolean
	 * @generated
	 */
	EEnum getOpaqueBoolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PbdFactory getPbdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl <em>Extensible Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ExtensibleElementsImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExtensibleElements()
		 * @generated
		 */
		EClass EXTENSIBLE_ELEMENTS = eINSTANCE.getExtensibleElements();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIBLE_ELEMENTS__DOCUMENTATION = eINSTANCE.getExtensibleElements_Documentation();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE = eINSTANCE.getExtensibleElements_AnyAttribute();

		/**
		 * The meta object literal for the '<em><b>Any Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIBLE_ELEMENTS__ANY_ELEMENT = eINSTANCE.getExtensibleElements_AnyElement();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIBLE_ELEMENTS__STATE = eINSTANCE.getExtensibleElements_State();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIBLE_ELEMENTS__XPATH = eINSTANCE.getExtensibleElements_Xpath();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIBLE_ELEMENTS__ID = eINSTANCE.getExtensibleElements_Id();

		/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIBLE_ELEMENTS__INSTANCE_ID = eINSTANCE.getExtensibleElements_InstanceID();

		/**
		 * The meta object literal for the '<em><b>Instance Buffer</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIBLE_ELEMENTS__INSTANCE_BUFFER = eINSTANCE.getExtensibleElements_InstanceBuffer();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.DocumentationImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__SOURCE = eINSTANCE.getDocumentation_Source();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__LANG = eINSTANCE.getDocumentation_Lang();

		/**
		 * The meta object literal for the '<em><b>Any Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION__ANY_ELEMENT = eINSTANCE.getDocumentation_AnyElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__EXTENSIONS = eINSTANCE.getProcess_Extensions();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__IMPORT = eINSTANCE.getProcess_Import();

		/**
		 * The meta object literal for the '<em><b>Message Exchanges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__MESSAGE_EXCHANGES = eINSTANCE.getProcess_MessageExchanges();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__VARIABLES = eINSTANCE.getProcess_Variables();

		/**
		 * The meta object literal for the '<em><b>Correlation Sets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__CORRELATION_SETS = eINSTANCE.getProcess_CorrelationSets();

		/**
		 * The meta object literal for the '<em><b>Fault Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FAULT_HANDLERS = eINSTANCE.getProcess_FaultHandlers();

		/**
		 * The meta object literal for the '<em><b>Event Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__EVENT_HANDLERS = eINSTANCE.getProcess_EventHandlers();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ACTIVITY = eINSTANCE.getProcess_Activity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__TARGET_NAMESPACE = eINSTANCE.getProcess_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Query Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__QUERY_LANGUAGE = eINSTANCE.getProcess_QueryLanguage();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__EXPRESSION_LANGUAGE = eINSTANCE.getProcess_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Suppress Join Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__SUPPRESS_JOIN_FAILURE = eINSTANCE.getProcess_SuppressJoinFailure();

		/**
		 * The meta object literal for the '<em><b>Exit On Standard Fault</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__EXIT_ON_STANDARD_FAULT = eINSTANCE.getProcess_ExitOnStandardFault();

		/**
		 * The meta object literal for the '<em><b>Abstract Process Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__ABSTRACT_PROCESS_PROFILE = eINSTANCE.getProcess_AbstractProcessProfile();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensionsImpl <em>Extensions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ExtensionsImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExtensions()
		 * @generated
		 */
		EClass EXTENSIONS = eINSTANCE.getExtensions();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONS__EXTENSION = eINSTANCE.getExtensions_Extension();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ExtensionImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__NAMESPACE = eINSTANCE.getExtension_Namespace();

		/**
		 * The meta object literal for the '<em><b>Must Understand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__MUST_UNDERSTAND = eINSTANCE.getExtension_MustUnderstand();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ImportImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__NAMESPACE = eINSTANCE.getImport_Namespace();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__LOCATION = eINSTANCE.getImport_Location();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_TYPE = eINSTANCE.getImport_ImportType();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.MessageExchangesImpl <em>Message Exchanges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.MessageExchangesImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getMessageExchanges()
		 * @generated
		 */
		EClass MESSAGE_EXCHANGES = eINSTANCE.getMessageExchanges();

		/**
		 * The meta object literal for the '<em><b>Message Exchange</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_EXCHANGES__MESSAGE_EXCHANGE = eINSTANCE.getMessageExchanges_MessageExchange();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.MessageExchangeImpl <em>Message Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.MessageExchangeImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getMessageExchange()
		 * @generated
		 */
		EClass MESSAGE_EXCHANGE = eINSTANCE.getMessageExchange();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_EXCHANGE__NAME = eINSTANCE.getMessageExchange_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.VariablesImpl <em>Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.VariablesImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getVariables()
		 * @generated
		 */
		EClass VARIABLES = eINSTANCE.getVariables();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLES__VARIABLE = eINSTANCE.getVariables_Variable();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.VariableImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__FROM = eINSTANCE.getVariable_From();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__MESSAGE_TYPE = eINSTANCE.getVariable_MessageType();

		/**
		 * The meta object literal for the '<em><b>Xsd Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__XSD_ELEMENT = eINSTANCE.getVariable_XsdElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CorrelationSetsImpl <em>Correlation Sets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.CorrelationSetsImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCorrelationSets()
		 * @generated
		 */
		EClass CORRELATION_SETS = eINSTANCE.getCorrelationSets();

		/**
		 * The meta object literal for the '<em><b>Correlation Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_SETS__CORRELATION_SET = eINSTANCE.getCorrelationSets_CorrelationSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CorrelationSetImpl <em>Correlation Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.CorrelationSetImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCorrelationSet()
		 * @generated
		 */
		EClass CORRELATION_SET = eINSTANCE.getCorrelationSet();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION_SET__PROPERTIES = eINSTANCE.getCorrelationSet_Properties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION_SET__NAME = eINSTANCE.getCorrelationSet_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FaultHandlersImpl <em>Fault Handlers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.FaultHandlersImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFaultHandlers()
		 * @generated
		 */
		EClass FAULT_HANDLERS = eINSTANCE.getFaultHandlers();

		/**
		 * The meta object literal for the '<em><b>Catch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_HANDLERS__CATCH = eINSTANCE.getFaultHandlers_Catch();

		/**
		 * The meta object literal for the '<em><b>Catch All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_HANDLERS__CATCH_ALL = eINSTANCE.getFaultHandlers_CatchAll();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CatchImpl <em>Catch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.CatchImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCatch()
		 * @generated
		 */
		EClass CATCH = eINSTANCE.getCatch();

		/**
		 * The meta object literal for the '<em><b>Fault Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH__FAULT_NAME = eINSTANCE.getCatch_FaultName();

		/**
		 * The meta object literal for the '<em><b>Fault Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH__FAULT_VARIABLE = eINSTANCE.getCatch_FaultVariable();

		/**
		 * The meta object literal for the '<em><b>Fault Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH__FAULT_MESSAGE_TYPE = eINSTANCE.getCatch_FaultMessageType();

		/**
		 * The meta object literal for the '<em><b>Fault Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH__FAULT_ELEMENT = eINSTANCE.getCatch_FaultElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CatchAllImpl <em>Catch All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.CatchAllImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCatchAll()
		 * @generated
		 */
		EClass CATCH_ALL = eINSTANCE.getCatchAll();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ActivityContainerImpl <em>Activity Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ActivityContainerImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getActivityContainer()
		 * @generated
		 */
		EClass ACTIVITY_CONTAINER = eINSTANCE.getActivityContainer();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONTAINER__ACTIVITY = eINSTANCE.getActivityContainer_Activity();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.EventHandlersImpl <em>Event Handlers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.EventHandlersImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getEventHandlers()
		 * @generated
		 */
		EClass EVENT_HANDLERS = eINSTANCE.getEventHandlers();

		/**
		 * The meta object literal for the '<em><b>On Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLERS__ON_EVENT = eINSTANCE.getEventHandlers_OnEvent();

		/**
		 * The meta object literal for the '<em><b>On Alarm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLERS__ON_ALARM = eINSTANCE.getEventHandlers_OnAlarm();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OnEventImpl <em>On Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.OnEventImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOnEvent()
		 * @generated
		 */
		EClass ON_EVENT = eINSTANCE.getOnEvent();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EVENT__SCOPE = eINSTANCE.getOnEvent_Scope();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_EVENT__MESSAGE_TYPE = eINSTANCE.getOnEvent_MessageType();

		/**
		 * The meta object literal for the '<em><b>Xsd Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_EVENT__XSD_ELEMENT = eINSTANCE.getOnEvent_XsdElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OnMsgCommonImpl <em>On Msg Common</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.OnMsgCommonImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOnMsgCommon()
		 * @generated
		 */
		EClass ON_MSG_COMMON = eINSTANCE.getOnMsgCommon();

		/**
		 * The meta object literal for the '<em><b>Correlations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MSG_COMMON__CORRELATIONS = eINSTANCE.getOnMsgCommon_Correlations();

		/**
		 * The meta object literal for the '<em><b>From Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MSG_COMMON__FROM_PARTS = eINSTANCE.getOnMsgCommon_FromParts();

		/**
		 * The meta object literal for the '<em><b>Message Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MSG_COMMON__MESSAGE_EXCHANGE = eINSTANCE.getOnMsgCommon_MessageExchange();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MSG_COMMON__VARIABLE = eINSTANCE.getOnMsgCommon_Variable();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CorrelationsImpl <em>Correlations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.CorrelationsImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCorrelations()
		 * @generated
		 */
		EClass CORRELATIONS = eINSTANCE.getCorrelations();

		/**
		 * The meta object literal for the '<em><b>Correlation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATIONS__CORRELATION = eINSTANCE.getCorrelations_Correlation();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CorrelationImpl <em>Correlation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.CorrelationImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCorrelation()
		 * @generated
		 */
		EClass CORRELATION = eINSTANCE.getCorrelation();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__SET = eINSTANCE.getCorrelation_Set();

		/**
		 * The meta object literal for the '<em><b>Initiate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__INITIATE = eINSTANCE.getCorrelation_Initiate();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__PATTERN = eINSTANCE.getCorrelation_Pattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OnAlarmImpl <em>On Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.OnAlarmImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOnAlarm()
		 * @generated
		 */
		EClass ON_ALARM = eINSTANCE.getOnAlarm();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM__FOR = eINSTANCE.getOnAlarm_For();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM__UNTIL = eINSTANCE.getOnAlarm_Until();

		/**
		 * The meta object literal for the '<em><b>Repeat Every</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM__REPEAT_EVERY = eINSTANCE.getOnAlarm_RepeatEvery();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM__SCOPE = eINSTANCE.getOnAlarm_Scope();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM__ACTIVITY = eINSTANCE.getOnAlarm_Activity();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ActivityImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TARGETS = eINSTANCE.getActivity_Targets();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SOURCES = eINSTANCE.getActivity_Sources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Suppress Join Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__SUPPRESS_JOIN_FAILURE = eINSTANCE.getActivity_SuppressJoinFailure();

		/**
		 * The meta object literal for the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DANGLING_FLOW_ACTIVITY_LINK = eINSTANCE.getActivity_DanglingFlowActivityLink();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.TargetsImpl <em>Targets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.TargetsImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getTargets()
		 * @generated
		 */
		EClass TARGETS = eINSTANCE.getTargets();

		/**
		 * The meta object literal for the '<em><b>Join Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGETS__JOIN_CONDITION = eINSTANCE.getTargets_JoinCondition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGETS__TARGET = eINSTANCE.getTargets_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.TargetImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__LINK_NAME = eINSTANCE.getTarget_LinkName();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.SourcesImpl <em>Sources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.SourcesImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getSources()
		 * @generated
		 */
		EClass SOURCES = eINSTANCE.getSources();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCES__SOURCE = eINSTANCE.getSources_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.SourceImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Transition Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__TRANSITION_CONDITION = eINSTANCE.getSource_TransitionCondition();

		/**
		 * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__LINK_NAME = eINSTANCE.getSource_LinkName();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.AssignImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__COPY = eINSTANCE.getAssign_Copy();

		/**
		 * The meta object literal for the '<em><b>Extension Assign Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__EXTENSION_ASSIGN_OPERATION = eINSTANCE.getAssign_ExtensionAssignOperation();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__VALIDATE = eINSTANCE.getAssign_Validate();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CopyImpl <em>Copy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.CopyImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCopy()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCopy();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__FROM = eINSTANCE.getCopy_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__TO = eINSTANCE.getCopy_To();

		/**
		 * The meta object literal for the '<em><b>Keep Src Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY__KEEP_SRC_ELEMENT_NAME = eINSTANCE.getCopy_KeepSrcElementName();

		/**
		 * The meta object literal for the '<em><b>Ignore Missing From Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY__IGNORE_MISSING_FROM_DATA = eINSTANCE.getCopy_IgnoreMissingFromData();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OpaqueFromImpl <em>Opaque From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.OpaqueFromImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOpaqueFrom()
		 * @generated
		 */
		EClass OPAQUE_FROM = eINSTANCE.getOpaqueFrom();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FromImpl <em>From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.FromImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFrom()
		 * @generated
		 */
		EClass FROM = eINSTANCE.getFrom();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__LITERAL = eINSTANCE.getFrom_Literal();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__QUERY = eINSTANCE.getFrom_Query();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__EXPRESSION_LANGUAGE = eINSTANCE.getFrom_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__VARIABLE = eINSTANCE.getFrom_Variable();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__PART = eINSTANCE.getFrom_Part();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__PROPERTY = eINSTANCE.getFrom_Property();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__PARTNER_LINK = eINSTANCE.getFrom_PartnerLink();

		/**
		 * The meta object literal for the '<em><b>Endpoint Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__ENDPOINT_REFERENCE = eINSTANCE.getFrom_EndpointReference();

		/**
		 * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__OPAQUE = eINSTANCE.getFrom_Opaque();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__EXPRESSION = eINSTANCE.getFrom_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.LiteralImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Any Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__ANY_ELEMENT = eINSTANCE.getLiteral_AnyElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.QueryImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Query Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__QUERY_LANGUAGE = eINSTANCE.getQuery_QueryLanguage();

		/**
		 * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__OPAQUE = eINSTANCE.getQuery_Opaque();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__VALUE = eINSTANCE.getQuery_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ToImpl <em>To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ToImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getTo()
		 * @generated
		 */
		EClass TO = eINSTANCE.getTo();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO__QUERY = eINSTANCE.getTo_Query();

		/**
		 * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__OPAQUE = eINSTANCE.getTo_Opaque();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__EXPRESSION_LANGUAGE = eINSTANCE.getTo_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__VARIABLE = eINSTANCE.getTo_Variable();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__PART = eINSTANCE.getTo_Part();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__PROPERTY = eINSTANCE.getTo_Property();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__PARTNER_LINK = eINSTANCE.getTo_PartnerLink();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO__EXPRESSION = eINSTANCE.getTo_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensionAssignOperationImpl <em>Extension Assign Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ExtensionAssignOperationImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExtensionAssignOperation()
		 * @generated
		 */
		EClass EXTENSION_ASSIGN_OPERATION = eINSTANCE.getExtensionAssignOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CompensateImpl <em>Compensate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.CompensateImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCompensate()
		 * @generated
		 */
		EClass COMPENSATE = eINSTANCE.getCompensate();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CompensateScopeImpl <em>Compensate Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.CompensateScopeImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCompensateScope()
		 * @generated
		 */
		EClass COMPENSATE_SCOPE = eINSTANCE.getCompensateScope();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPENSATE_SCOPE__TARGET = eINSTANCE.getCompensateScope_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.EmptyImpl <em>Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.EmptyImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getEmpty()
		 * @generated
		 */
		EClass EMPTY = eINSTANCE.getEmpty();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExtensionActivityImpl <em>Extension Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ExtensionActivityImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExtensionActivity()
		 * @generated
		 */
		EClass EXTENSION_ACTIVITY = eINSTANCE.getExtensionActivity();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.FlowImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__LINKS = eINSTANCE.getFlow_Links();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ACTIVITY = eINSTANCE.getFlow_Activity();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.LinksImpl <em>Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.LinksImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getLinks()
		 * @generated
		 */
		EClass LINKS = eINSTANCE.getLinks();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKS__LINK = eINSTANCE.getLinks_Link();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.LinkImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl <em>For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getForEach()
		 * @generated
		 */
		EClass FOR_EACH = eINSTANCE.getForEach();

		/**
		 * The meta object literal for the '<em><b>Start Counter Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__START_COUNTER_VALUE = eINSTANCE.getForEach_StartCounterValue();

		/**
		 * The meta object literal for the '<em><b>Final Counter Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__FINAL_COUNTER_VALUE = eINSTANCE.getForEach_FinalCounterValue();

		/**
		 * The meta object literal for the '<em><b>Completion Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__COMPLETION_CONDITION = eINSTANCE.getForEach_CompletionCondition();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__SCOPE = eINSTANCE.getForEach_Scope();

		/**
		 * The meta object literal for the '<em><b>Counter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__COUNTER_NAME = eINSTANCE.getForEach_CounterName();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__PARALLEL = eINSTANCE.getForEach_Parallel();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__VARIABLE = eINSTANCE.getForEach_Variable();

		/**
		 * The meta object literal for the '<em><b>State Buffer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__STATE_BUFFER = eINSTANCE.getForEach_StateBuffer();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.CompletionConditionImpl <em>Completion Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.CompletionConditionImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCompletionCondition()
		 * @generated
		 */
		EClass COMPLETION_CONDITION = eINSTANCE.getCompletionCondition();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETION_CONDITION__BRANCHES = eINSTANCE.getCompletionCondition_Branches();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.BranchesImpl <em>Branches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.BranchesImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getBranches()
		 * @generated
		 */
		EClass BRANCHES = eINSTANCE.getBranches();

		/**
		 * The meta object literal for the '<em><b>Successful Branches Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCHES__SUCCESSFUL_BRANCHES_ONLY = eINSTANCE.getBranches_SuccessfulBranchesOnly();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.IfImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ACTIVITY = eINSTANCE.getIf_Activity();

		/**
		 * The meta object literal for the '<em><b>Elseif</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSEIF = eINSTANCE.getIf_Elseif();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ElseifImpl <em>Elseif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ElseifImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getElseif()
		 * @generated
		 */
		EClass ELSEIF = eINSTANCE.getElseif();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__CONDITION = eINSTANCE.getElseif_Condition();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSEIF__ACTIVITY = eINSTANCE.getElseif_Activity();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ElseImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl <em>Invoke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getInvoke()
		 * @generated
		 */
		EClass INVOKE = eINSTANCE.getInvoke();

		/**
		 * The meta object literal for the '<em><b>Correlations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__CORRELATIONS = eINSTANCE.getInvoke_Correlations();

		/**
		 * The meta object literal for the '<em><b>Catch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__CATCH = eINSTANCE.getInvoke_Catch();

		/**
		 * The meta object literal for the '<em><b>Catch All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__CATCH_ALL = eINSTANCE.getInvoke_CatchAll();

		/**
		 * The meta object literal for the '<em><b>Compensation Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__COMPENSATION_HANDLER = eINSTANCE.getInvoke_CompensationHandler();

		/**
		 * The meta object literal for the '<em><b>To Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__TO_PARTS = eINSTANCE.getInvoke_ToParts();

		/**
		 * The meta object literal for the '<em><b>From Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__FROM_PARTS = eINSTANCE.getInvoke_FromParts();

		/**
		 * The meta object literal for the '<em><b>Input Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__INPUT_VARIABLE = eINSTANCE.getInvoke_InputVariable();

		/**
		 * The meta object literal for the '<em><b>Output Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__OUTPUT_VARIABLE = eINSTANCE.getInvoke_OutputVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FromPartsImpl <em>From Parts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.FromPartsImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFromParts()
		 * @generated
		 */
		EClass FROM_PARTS = eINSTANCE.getFromParts();

		/**
		 * The meta object literal for the '<em><b>From Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_PARTS__FROM_PART = eINSTANCE.getFromParts_FromPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FromPartImpl <em>From Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.FromPartImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFromPart()
		 * @generated
		 */
		EClass FROM_PART = eINSTANCE.getFromPart();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_PART__PART = eINSTANCE.getFromPart_Part();

		/**
		 * The meta object literal for the '<em><b>To Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_PART__TO_VARIABLE = eINSTANCE.getFromPart_ToVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ToPartsImpl <em>To Parts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ToPartsImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getToParts()
		 * @generated
		 */
		EClass TO_PARTS = eINSTANCE.getToParts();

		/**
		 * The meta object literal for the '<em><b>To Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_PARTS__TO_PART = eINSTANCE.getToParts_ToPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ToPartImpl <em>To Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ToPartImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getToPart()
		 * @generated
		 */
		EClass TO_PART = eINSTANCE.getToPart();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_PART__PART = eINSTANCE.getToPart_Part();

		/**
		 * The meta object literal for the '<em><b>From Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_PART__FROM_VARIABLE = eINSTANCE.getToPart_FromVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.PickImpl <em>Pick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PickImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getPick()
		 * @generated
		 */
		EClass PICK = eINSTANCE.getPick();

		/**
		 * The meta object literal for the '<em><b>On Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK__ON_MESSAGE = eINSTANCE.getPick_OnMessage();

		/**
		 * The meta object literal for the '<em><b>On Alarm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK__ON_ALARM = eINSTANCE.getPick_OnAlarm();

		/**
		 * The meta object literal for the '<em><b>Create Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICK__CREATE_INSTANCE = eINSTANCE.getPick_CreateInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OnMessageImpl <em>On Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.OnMessageImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOnMessage()
		 * @generated
		 */
		EClass ON_MESSAGE = eINSTANCE.getOnMessage();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_MESSAGE__ACTIVITY = eINSTANCE.getOnMessage_Activity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MESSAGE__NAME = eINSTANCE.getOnMessage_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ReceiveImpl <em>Receive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ReceiveImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getReceive()
		 * @generated
		 */
		EClass RECEIVE = eINSTANCE.getReceive();

		/**
		 * The meta object literal for the '<em><b>Correlations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE__CORRELATIONS = eINSTANCE.getReceive_Correlations();

		/**
		 * The meta object literal for the '<em><b>From Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE__FROM_PARTS = eINSTANCE.getReceive_FromParts();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE__VARIABLE = eINSTANCE.getReceive_Variable();

		/**
		 * The meta object literal for the '<em><b>Create Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE__CREATE_INSTANCE = eINSTANCE.getReceive_CreateInstance();

		/**
		 * The meta object literal for the '<em><b>Message Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE__MESSAGE_EXCHANGE = eINSTANCE.getReceive_MessageExchange();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.RepeatUntilImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getRepeatUntil()
		 * @generated
		 */
		EClass REPEAT_UNTIL = eINSTANCE.getRepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__ACTIVITY = eINSTANCE.getRepeatUntil_Activity();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__CONDITION = eINSTANCE.getRepeatUntil_Condition();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ReplyImpl <em>Reply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ReplyImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getReply()
		 * @generated
		 */
		EClass REPLY = eINSTANCE.getReply();

		/**
		 * The meta object literal for the '<em><b>Correlations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY__CORRELATIONS = eINSTANCE.getReply_Correlations();

		/**
		 * The meta object literal for the '<em><b>To Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY__TO_PARTS = eINSTANCE.getReply_ToParts();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY__VARIABLE = eINSTANCE.getReply_Variable();

		/**
		 * The meta object literal for the '<em><b>Fault Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY__FAULT_NAME = eINSTANCE.getReply_FaultName();

		/**
		 * The meta object literal for the '<em><b>Message Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY__MESSAGE_EXCHANGE = eINSTANCE.getReply_MessageExchange();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.RethrowImpl <em>Rethrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.RethrowImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getRethrow()
		 * @generated
		 */
		EClass RETHROW = eINSTANCE.getRethrow();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Message Exchanges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__MESSAGE_EXCHANGES = eINSTANCE.getScope_MessageExchanges();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__VARIABLES = eINSTANCE.getScope_Variables();

		/**
		 * The meta object literal for the '<em><b>Correlation Sets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__CORRELATION_SETS = eINSTANCE.getScope_CorrelationSets();

		/**
		 * The meta object literal for the '<em><b>Fault Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__FAULT_HANDLERS = eINSTANCE.getScope_FaultHandlers();

		/**
		 * The meta object literal for the '<em><b>Compensation Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__COMPENSATION_HANDLER = eINSTANCE.getScope_CompensationHandler();

		/**
		 * The meta object literal for the '<em><b>Termination Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__TERMINATION_HANDLER = eINSTANCE.getScope_TerminationHandler();

		/**
		 * The meta object literal for the '<em><b>Event Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__EVENT_HANDLERS = eINSTANCE.getScope_EventHandlers();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__ACTIVITY = eINSTANCE.getScope_Activity();

		/**
		 * The meta object literal for the '<em><b>Isolated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__ISOLATED = eINSTANCE.getScope_Isolated();

		/**
		 * The meta object literal for the '<em><b>Exit On Standard Fault</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__EXIT_ON_STANDARD_FAULT = eINSTANCE.getScope_ExitOnStandardFault();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.SequenceImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ACTIVITY = eINSTANCE.getSequence_Activity();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ThrowImpl <em>Throw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ThrowImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getThrow()
		 * @generated
		 */
		EClass THROW = eINSTANCE.getThrow();

		/**
		 * The meta object literal for the '<em><b>Fault Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROW__FAULT_NAME = eINSTANCE.getThrow_FaultName();

		/**
		 * The meta object literal for the '<em><b>Fault Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROW__FAULT_VARIABLE = eINSTANCE.getThrow_FaultVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ValidateImpl <em>Validate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ValidateImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getValidate()
		 * @generated
		 */
		EClass VALIDATE = eINSTANCE.getValidate();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATE__VARIABLES = eINSTANCE.getValidate_Variables();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.WaitImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT__FOR = eINSTANCE.getWait_For();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT__UNTIL = eINSTANCE.getWait_Until();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.WhileImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__ACTIVITY = eINSTANCE.getWhile_Activity();

		/**
		 * The meta object literal for the '<em><b>State Buffer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__STATE_BUFFER = eINSTANCE.getWhile_StateBuffer();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ExpressionImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__EXPRESSION_LANGUAGE = eINSTANCE.getExpression_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__OPAQUE = eINSTANCE.getExpression_Opaque();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__BODY = eINSTANCE.getExpression_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ForImpl <em>For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ForImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFor()
		 * @generated
		 */
		EClass FOR = eINSTANCE.getFor();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.UntilImpl <em>Until</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.UntilImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getUntil()
		 * @generated
		 */
		EClass UNTIL = eINSTANCE.getUntil();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.ConditionImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.TransitionConditionImpl <em>Transition Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.TransitionConditionImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getTransitionCondition()
		 * @generated
		 */
		EClass TRANSITION_CONDITION = eINSTANCE.getTransitionCondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.JoinConditionImpl <em>Join Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.JoinConditionImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getJoinCondition()
		 * @generated
		 */
		EClass JOIN_CONDITION = eINSTANCE.getJoinCondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.RepeatEveryImpl <em>Repeat Every</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.RepeatEveryImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getRepeatEvery()
		 * @generated
		 */
		EClass REPEAT_EVERY = eINSTANCE.getRepeatEvery();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.StartCounterValueImpl <em>Start Counter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.StartCounterValueImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getStartCounterValue()
		 * @generated
		 */
		EClass START_COUNTER_VALUE = eINSTANCE.getStartCounterValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.FinalCounterValueImpl <em>Final Counter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.FinalCounterValueImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getFinalCounterValue()
		 * @generated
		 */
		EClass FINAL_COUNTER_VALUE = eINSTANCE.getFinalCounterValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.OpaqueActivityImpl <em>Opaque Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.OpaqueActivityImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOpaqueActivity()
		 * @generated
		 */
		EClass OPAQUE_ACTIVITY = eINSTANCE.getOpaqueActivity();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.CLinkable <em>CLinkable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.CLinkable
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getCLinkable()
		 * @generated
		 */
		EClass CLINKABLE = eINSTANCE.getCLinkable();

		/**
		 * The meta object literal for the '<em><b>Dangling Message Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINKABLE__DANGLING_MESSAGE_LINK = eINSTANCE.getCLinkable_DanglingMessageLink();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.DanglingMessageLinkImpl <em>Dangling Message Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.DanglingMessageLinkImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getDanglingMessageLink()
		 * @generated
		 */
		EClass DANGLING_MESSAGE_LINK = eINSTANCE.getDanglingMessageLink();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DANGLING_MESSAGE_LINK__URI = eINSTANCE.getDanglingMessageLink_URI();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.DanglingFlowActivityLinkImpl <em>Dangling Flow Activity Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.DanglingFlowActivityLinkImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getDanglingFlowActivityLink()
		 * @generated
		 */
		EClass DANGLING_FLOW_ACTIVITY_LINK = eINSTANCE.getDanglingFlowActivityLink();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DANGLING_FLOW_ACTIVITY_LINK__URI = eINSTANCE.getDanglingFlowActivityLink_URI();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.impl.LoopIterationImpl <em>Loop Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.impl.LoopIterationImpl
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getLoopIteration()
		 * @generated
		 */
		EClass LOOP_ITERATION = eINSTANCE.getLoopIteration();

		/**
		 * The meta object literal for the '<em><b>Loop Iteration Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_ITERATION__LOOP_ITERATION_COUNTER = eINSTANCE.getLoopIteration_LoopIterationCounter();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_ITERATION__ACTIVITY = eINSTANCE.getLoopIteration_Activity();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.Initiate <em>Initiate</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.Initiate
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getInitiate()
		 * @generated
		 */
		EEnum INITIATE = eINSTANCE.getInitiate();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.Roles <em>Roles</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.Roles
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getRoles()
		 * @generated
		 */
		EEnum ROLES = eINSTANCE.getRoles();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.Pattern <em>Pattern</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.Pattern
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getPattern()
		 * @generated
		 */
		EEnum PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.Boolean <em>Boolean</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.Boolean
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getBoolean()
		 * @generated
		 */
		EEnum BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.OpaqueStr <em>Opaque Str</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.OpaqueStr
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOpaqueStr()
		 * @generated
		 */
		EEnum OPAQUE_STR = eINSTANCE.getOpaqueStr();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpel4chor.model.pbd.OpaqueBoolean <em>Opaque Boolean</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpel4chor.model.pbd.OpaqueBoolean
		 * @see org.eclipse.bpel4chor.model.pbd.impl.PbdPackageImpl#getOpaqueBoolean()
		 * @generated
		 */
		EEnum OPAQUE_BOOLEAN = eINSTANCE.getOpaqueBoolean();

	}

} //PbdPackage
