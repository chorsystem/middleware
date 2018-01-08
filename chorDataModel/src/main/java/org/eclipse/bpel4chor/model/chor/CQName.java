/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CQ Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CQName#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CQName#getLocalPart <em>Local Part</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CQName#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCQName()
 * @model
 * @generated
 */
public interface CQName extends EObject
{
        /**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Ns URI</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCQName_NsURI()
	 * @model
	 * @generated
	 */
        String getNsURI();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CQName#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
        void setNsURI(String value);

        /**
	 * Returns the value of the '<em><b>Local Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Local Part</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Part</em>' attribute.
	 * @see #setLocalPart(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCQName_LocalPart()
	 * @model required="true"
	 * @generated
	 */
        String getLocalPart();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CQName#getLocalPart <em>Local Part</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Part</em>' attribute.
	 * @see #getLocalPart()
	 * @generated
	 */
        void setLocalPart(String value);

        /**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCQName_Prefix()
	 * @model
	 * @generated
	 */
        String getPrefix();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CQName#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
        void setPrefix(String value);

} // CQName
