/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;

import java.util.Map;
import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensible Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type is extended by other component types to allow elements and attributes from other namespaces to be added at the modeled places.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getAnyElement <em>Any Element</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getInstanceBuffer <em>Instance Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getExtensibleElements()
 * @model
 * @generated
 */
public interface ExtensibleElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getExtensibleElements_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getExtensibleElements_AnyAttribute()
	 * @model
	 * @generated
	 */
	EList<Object> getAnyAttribute();

	/**
	 * Returns the value of the '<em><b>Any Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Element</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getExtensibleElements_AnyElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getAnyElement();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getExtensibleElements_State()
	 * @model transient="true"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath</em>' attribute.
	 * @see #setXpath(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getExtensibleElements_Xpath()
	 * @model transient="true"
	 * @generated
	 */
	String getXpath();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getXpath <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' attribute.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getExtensibleElements_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance ID</em>' attribute.
	 * @see #setInstanceID(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getExtensibleElements_InstanceID()
	 * @model transient="true"
	 * @generated
	 */
	String getInstanceID();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ExtensibleElements#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Instance Buffer</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link java.util.Map.Entry},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Buffer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Buffer</em>' map.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getExtensibleElements_InstanceBuffer()
	 * @model mapType="org.eclipse.bpel4chor.model.chor.common.EStringToProcessInstanceMap<org.eclipse.emf.ecore.EString, org.eclipse.bpel4chor.model.chor.common.EStringToElementInstanceMap>"
	 * @generated
	 */
	EMap<String, EMap<String, ElementInstance>> getInstanceBuffer();

} // ExtensibleElements
