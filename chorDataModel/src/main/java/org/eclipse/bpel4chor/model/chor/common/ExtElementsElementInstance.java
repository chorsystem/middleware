/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ext Elements Element Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getLoopIteration <em>Loop Iteration</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getParentLoopInstance <em>Parent Loop Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getExtElementsElementInstance()
 * @model
 * @generated
 */
public interface ExtElementsElementInstance extends ElementInstance {
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
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getExtElementsElementInstance_Xpath()
	 * @model
	 * @generated
	 */
	String getXpath();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getXpath <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' attribute.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(String value);

	/**
	 * Returns the value of the '<em><b>Loop Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Iteration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Iteration</em>' attribute.
	 * @see #setLoopIteration(long)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getExtElementsElementInstance_LoopIteration()
	 * @model
	 * @generated
	 */
	long getLoopIteration();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getLoopIteration <em>Loop Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Iteration</em>' attribute.
	 * @see #getLoopIteration()
	 * @generated
	 */
	void setLoopIteration(long value);

	/**
	 * Returns the value of the '<em><b>Parent Loop Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Loop Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Loop Instance</em>' reference.
	 * @see #setParentLoopInstance(LoopElementInstance)
	 * @see org.eclipse.bpel4chor.model.chor.common.CommonPackage#getExtElementsElementInstance_ParentLoopInstance()
	 * @model
	 * @generated
	 */
	LoopElementInstance getParentLoopInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance#getParentLoopInstance <em>Parent Loop Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Loop Instance</em>' reference.
	 * @see #getParentLoopInstance()
	 * @generated
	 */
	void setParentLoopInstance(LoopElementInstance value);

} // ExtElementsElementInstance
