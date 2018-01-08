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
 * A representation of the model object '<em><b>Correlation Sets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.CorrelationSets#getCorrelationSet <em>Correlation Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCorrelationSets()
 * @model
 * @generated
 */
public interface CorrelationSets extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Correlation Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.CorrelationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Set</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getCorrelationSets_CorrelationSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<CorrelationSet> getCorrelationSet();

} // CorrelationSets
