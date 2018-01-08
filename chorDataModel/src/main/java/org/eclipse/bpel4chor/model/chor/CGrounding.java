/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CGrounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CGrounding#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CGrounding#getCMessageLinkGroundings <em>CMessage Link Groundings</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CGrounding#getCorrelationSetGroundings <em>Correlation Set Groundings</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CGrounding#getCParticipantRefGroundings <em>CParticipant Ref Groundings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCGrounding()
 * @model
 * @generated
 */
public interface CGrounding extends EObject
{
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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCGrounding_Name()
	 * @model required="true"
	 * @generated
	 */
        String getName();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CGrounding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
        void setName(String value);

        /**
	 * Returns the value of the '<em><b>CMessage Link Groundings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CMessageLinkGrounding}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>CMessage Link Groundings</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>CMessage Link Groundings</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCGrounding_CMessageLinkGroundings()
	 * @model containment="true"
	 * @generated
	 */
        EList<CMessageLinkGrounding> getCMessageLinkGroundings();

        /**
	 * Returns the value of the '<em><b>Correlation Set Groundings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CorrelationSetGrounding}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Correlation Set Groundings</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Set Groundings</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCGrounding_CorrelationSetGroundings()
	 * @model containment="true"
	 * @generated
	 */
        EList<CorrelationSetGrounding> getCorrelationSetGroundings();

        /**
	 * Returns the value of the '<em><b>CParticipant Ref Groundings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CParticipantRefGrounding}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>CParticipant Ref Groundings</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>CParticipant Ref Groundings</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCGrounding_CParticipantRefGroundings()
	 * @model containment="true"
	 * @generated
	 */
        EList<CParticipantRefGrounding> getCParticipantRefGroundings();

} // CGrounding
