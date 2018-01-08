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
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Activity#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Activity#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Activity#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Activity#getSuppressJoinFailure <em>Suppress Join Failure</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Activity#getDanglingFlowActivityLink <em>Dangling Flow Activity Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference.
	 * @see #setTargets(Targets)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getActivity_Targets()
	 * @model containment="true"
	 * @generated
	 */
	Targets getTargets();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Activity#getTargets <em>Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets</em>' containment reference.
	 * @see #getTargets()
	 * @generated
	 */
	void setTargets(Targets value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference.
	 * @see #setSources(Sources)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getActivity_Sources()
	 * @model containment="true"
	 * @generated
	 */
	Sources getSources();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Activity#getSources <em>Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sources</em>' containment reference.
	 * @see #getSources()
	 * @generated
	 */
	void setSources(Sources value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppress Join Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress Join Failure</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #setSuppressJoinFailure(Boolean)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getActivity_SuppressJoinFailure()
	 * @model default="no"
	 * @generated
	 */
	Boolean getSuppressJoinFailure();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Activity#getSuppressJoinFailure <em>Suppress Join Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Join Failure</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #getSuppressJoinFailure()
	 * @generated
	 */
	void setSuppressJoinFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Dangling Flow Activity Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.DanglingFlowActivityLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dangling Flow Activity Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dangling Flow Activity Link</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getActivity_DanglingFlowActivityLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<DanglingFlowActivityLink> getDanglingFlowActivityLink();

} // Activity
