/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ForEach#getStartCounterValue <em>Start Counter Value</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ForEach#getFinalCounterValue <em>Final Counter Value</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ForEach#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ForEach#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ForEach#getCounterName <em>Counter Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ForEach#getParallel <em>Parallel</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ForEach#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.ForEach#getStateBuffer <em>State Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getForEach()
 * @model
 * @generated
 */
public interface ForEach extends Activity {
	/**
	 * Returns the value of the '<em><b>Start Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Counter Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Counter Value</em>' containment reference.
	 * @see #setStartCounterValue(StartCounterValue)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getForEach_StartCounterValue()
	 * @model containment="true"
	 * @generated
	 */
	StartCounterValue getStartCounterValue();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getStartCounterValue <em>Start Counter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Counter Value</em>' containment reference.
	 * @see #getStartCounterValue()
	 * @generated
	 */
	void setStartCounterValue(StartCounterValue value);

	/**
	 * Returns the value of the '<em><b>Final Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Counter Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Counter Value</em>' containment reference.
	 * @see #setFinalCounterValue(FinalCounterValue)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getForEach_FinalCounterValue()
	 * @model containment="true"
	 * @generated
	 */
	FinalCounterValue getFinalCounterValue();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getFinalCounterValue <em>Final Counter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Counter Value</em>' containment reference.
	 * @see #getFinalCounterValue()
	 * @generated
	 */
	void setFinalCounterValue(FinalCounterValue value);

	/**
	 * Returns the value of the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Condition</em>' containment reference.
	 * @see #setCompletionCondition(CompletionCondition)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getForEach_CompletionCondition()
	 * @model containment="true"
	 * @generated
	 */
	CompletionCondition getCompletionCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getCompletionCondition <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Condition</em>' containment reference.
	 * @see #getCompletionCondition()
	 * @generated
	 */
	void setCompletionCondition(CompletionCondition value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(Scope)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getForEach_Scope()
	 * @model containment="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Counter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Name</em>' attribute.
	 * @see #setCounterName(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getForEach_CounterName()
	 * @model
	 * @generated
	 */
	String getCounterName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getCounterName <em>Counter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Name</em>' attribute.
	 * @see #getCounterName()
	 * @generated
	 */
	void setCounterName(String value);

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #setParallel(Boolean)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getForEach_Parallel()
	 * @model
	 * @generated
	 */
	Boolean getParallel();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #getParallel()
	 * @generated
	 */
	void setParallel(Boolean value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getForEach_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.ForEach#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>State Buffer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.LoopIteration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Buffer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Buffer</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getForEach_StateBuffer()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoopIteration> getStateBuffer();

} // ForEach
