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
 * A representation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCatch <em>Catch</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCatchAll <em>Catch All</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCompensationHandler <em>Compensation Handler</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Invoke#getToParts <em>To Parts</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Invoke#getFromParts <em>From Parts</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Invoke#getInputVariable <em>Input Variable</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Invoke#getOutputVariable <em>Output Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getInvoke()
 * @model
 * @generated
 */
public interface Invoke extends Activity, CLinkable {
	/**
	 * Returns the value of the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlations</em>' containment reference.
	 * @see #setCorrelations(Correlations)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getInvoke_Correlations()
	 * @model containment="true"
	 * @generated
	 */
	Correlations getCorrelations();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCorrelations <em>Correlations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlations</em>' containment reference.
	 * @see #getCorrelations()
	 * @generated
	 */
	void setCorrelations(Correlations value);

	/**
	 * Returns the value of the '<em><b>Catch</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.Catch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getInvoke_Catch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Catch> getCatch();

	/**
	 * Returns the value of the '<em><b>Catch All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch All</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch All</em>' containment reference.
	 * @see #setCatchAll(CatchAll)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getInvoke_CatchAll()
	 * @model containment="true"
	 * @generated
	 */
	CatchAll getCatchAll();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCatchAll <em>Catch All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch All</em>' containment reference.
	 * @see #getCatchAll()
	 * @generated
	 */
	void setCatchAll(CatchAll value);

	/**
	 * Returns the value of the '<em><b>Compensation Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensation Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation Handler</em>' containment reference.
	 * @see #setCompensationHandler(ActivityContainer)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getInvoke_CompensationHandler()
	 * @model containment="true"
	 * @generated
	 */
	ActivityContainer getCompensationHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getCompensationHandler <em>Compensation Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Handler</em>' containment reference.
	 * @see #getCompensationHandler()
	 * @generated
	 */
	void setCompensationHandler(ActivityContainer value);

	/**
	 * Returns the value of the '<em><b>To Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Parts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Parts</em>' containment reference.
	 * @see #setToParts(ToParts)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getInvoke_ToParts()
	 * @model containment="true"
	 * @generated
	 */
	ToParts getToParts();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getToParts <em>To Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Parts</em>' containment reference.
	 * @see #getToParts()
	 * @generated
	 */
	void setToParts(ToParts value);

	/**
	 * Returns the value of the '<em><b>From Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Parts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Parts</em>' containment reference.
	 * @see #setFromParts(FromParts)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getInvoke_FromParts()
	 * @model containment="true"
	 * @generated
	 */
	FromParts getFromParts();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getFromParts <em>From Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Parts</em>' containment reference.
	 * @see #getFromParts()
	 * @generated
	 */
	void setFromParts(FromParts value);

	/**
	 * Returns the value of the '<em><b>Input Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Variable</em>' attribute.
	 * @see #setInputVariable(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getInvoke_InputVariable()
	 * @model
	 * @generated
	 */
	String getInputVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getInputVariable <em>Input Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Variable</em>' attribute.
	 * @see #getInputVariable()
	 * @generated
	 */
	void setInputVariable(String value);

	/**
	 * Returns the value of the '<em><b>Output Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Variable</em>' attribute.
	 * @see #setOutputVariable(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getInvoke_OutputVariable()
	 * @model
	 * @generated
	 */
	String getOutputVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Invoke#getOutputVariable <em>Output Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Variable</em>' attribute.
	 * @see #getOutputVariable()
	 * @generated
	 */
	void setOutputVariable(String value);

} // Invoke
