/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.bpel4chor.model.pbd.CorrelationSet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Set Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding#getCorrelationSet <em>Correlation Set</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding#getPropertyGroundings <em>Property Groundings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCorrelationSetGrounding()
 * @model
 * @generated
 */
public interface CorrelationSetGrounding extends EObject
{
        /**
	 * Returns the value of the '<em><b>Correlation Set</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Correlation Set</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Set</em>' reference.
	 * @see #setCorrelationSet(CorrelationSet)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCorrelationSetGrounding_CorrelationSet()
	 * @model
	 * @generated
	 */
        CorrelationSet getCorrelationSet();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding#getCorrelationSet <em>Correlation Set</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Set</em>' reference.
	 * @see #getCorrelationSet()
	 * @generated
	 */
        void setCorrelationSet(CorrelationSet value);

        /**
	 * Returns the value of the '<em><b>Property Groundings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.PropertyGrounding}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Property Groundings</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Groundings</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCorrelationSetGrounding_PropertyGroundings()
	 * @model containment="true"
	 * @generated
	 */
        EList<PropertyGrounding> getPropertyGroundings();

} // CorrelationSetGrounding
