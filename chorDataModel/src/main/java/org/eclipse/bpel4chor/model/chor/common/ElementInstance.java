/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getProcessInstanceID <em>Process Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#isVisited <em>Visited</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getElementInstance()
 * @model
 * @generated
 */
public interface ElementInstance extends EObject {
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
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getElementInstance_InstanceID()
	 * @model
	 * @generated
	 */
	String getInstanceID();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Process Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Instance ID</em>' attribute.
	 * @see #setProcessInstanceID(String)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getElementInstance_ProcessInstanceID()
	 * @model
	 * @generated
	 */
	String getProcessInstanceID();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getProcessInstanceID <em>Process Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Instance ID</em>' attribute.
	 * @see #getProcessInstanceID()
	 * @generated
	 */
	void setProcessInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getElementInstance_Timestamp()
	 * @model
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

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
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getElementInstance_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visited</em>' attribute.
	 * @see #setVisited(boolean)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getElementInstance_Visited()
	 * @model
	 * @generated
	 */
	boolean isVisited();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.ElementInstance#isVisited <em>Visited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visited</em>' attribute.
	 * @see #isVisited()
	 * @generated
	 */
	void setVisited(boolean value);

} // ElementInstance
