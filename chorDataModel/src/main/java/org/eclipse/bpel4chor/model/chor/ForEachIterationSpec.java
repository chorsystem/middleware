/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.bpel4chor.model.pbd.ForEach;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Iteration Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getIteratorSet <em>Iterator Set</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getIteratorValue <em>Iterator Value</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getForEach <em>For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getForEachIterationSpec()
 * @model
 * @generated
 */
public interface ForEachIterationSpec extends EObject
{
        /**
	 * Returns the value of the '<em><b>Iterator Set</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Iterator Set</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator Set</em>' reference.
	 * @see #setIteratorSet(CParticipantSet)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getForEachIterationSpec_IteratorSet()
	 * @model
	 * @generated
	 */
        CParticipantSet getIteratorSet();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getIteratorSet <em>Iterator Set</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator Set</em>' reference.
	 * @see #getIteratorSet()
	 * @generated
	 */
        void setIteratorSet(CParticipantSet value);

        /**
	 * Returns the value of the '<em><b>Iterator Value</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Iterator Value</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator Value</em>' reference.
	 * @see #setIteratorValue(CParticipant)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getForEachIterationSpec_IteratorValue()
	 * @model
	 * @generated
	 */
        CParticipant getIteratorValue();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getIteratorValue <em>Iterator Value</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator Value</em>' reference.
	 * @see #getIteratorValue()
	 * @generated
	 */
        void setIteratorValue(CParticipant value);

        /**
	 * Returns the value of the '<em><b>For Each</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>For Each</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>For Each</em>' reference.
	 * @see #setForEach(ForEach)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getForEachIterationSpec_ForEach()
	 * @model
	 * @generated
	 */
        ForEach getForEach();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.ForEachIterationSpec#getForEach <em>For Each</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Each</em>' reference.
	 * @see #getForEach()
	 * @generated
	 */
        void setForEach(ForEach value);

} // ForEachIterationSpec
