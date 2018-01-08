/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Reply#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Reply#getToParts <em>To Parts</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Reply#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Reply#getFaultName <em>Fault Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Reply#getMessageExchange <em>Message Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getReply()
 * @model
 * @generated
 */
public interface Reply extends Activity, CLinkable {
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
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getReply_Correlations()
	 * @model containment="true"
	 * @generated
	 */
	Correlations getCorrelations();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Reply#getCorrelations <em>Correlations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlations</em>' containment reference.
	 * @see #getCorrelations()
	 * @generated
	 */
	void setCorrelations(Correlations value);

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
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getReply_ToParts()
	 * @model containment="true"
	 * @generated
	 */
	ToParts getToParts();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Reply#getToParts <em>To Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Parts</em>' containment reference.
	 * @see #getToParts()
	 * @generated
	 */
	void setToParts(ToParts value);

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
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getReply_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Reply#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Name</em>' attribute.
	 * @see #setFaultName(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getReply_FaultName()
	 * @model
	 * @generated
	 */
	String getFaultName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Reply#getFaultName <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Name</em>' attribute.
	 * @see #getFaultName()
	 * @generated
	 */
	void setFaultName(String value);

	/**
	 * Returns the value of the '<em><b>Message Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Exchange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Exchange</em>' attribute.
	 * @see #setMessageExchange(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getReply_MessageExchange()
	 * @model
	 * @generated
	 */
	String getMessageExchange();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Reply#getMessageExchange <em>Message Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchange</em>' attribute.
	 * @see #getMessageExchange()
	 * @generated
	 */
	void setMessageExchange(String value);

} // Reply
