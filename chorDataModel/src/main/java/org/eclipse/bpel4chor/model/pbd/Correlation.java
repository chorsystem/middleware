/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Correlation#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Correlation#getInitiate <em>Initiate</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Correlation#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCorrelation()
 * @model
 * @generated
 */
public interface Correlation extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' attribute.
	 * @see #setSet(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCorrelation_Set()
	 * @model
	 * @generated
	 */
	String getSet();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Correlation#getSet <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' attribute.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(String value);

	/**
	 * Returns the value of the '<em><b>Initiate</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Initiate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiate</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Initiate
	 * @see #setInitiate(Initiate)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCorrelation_Initiate()
	 * @model default="no"
	 * @generated
	 */
	Initiate getInitiate();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Correlation#getInitiate <em>Initiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiate</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Initiate
	 * @see #getInitiate()
	 * @generated
	 */
	void setInitiate(Initiate value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Pattern
	 * @see #setPattern(Pattern)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCorrelation_Pattern()
	 * @model
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Correlation#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Pattern
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

} // Correlation
