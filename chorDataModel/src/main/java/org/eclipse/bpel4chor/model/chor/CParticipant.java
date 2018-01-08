/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CParticipant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipant#getContainment <em>Containment</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipant#getSelects <em>Selects</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.CParticipant#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipant()
 * @model
 * @generated
 */
public interface CParticipant extends CParticipantCommon
{
        /**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.chor.PContainment}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Containment</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.chor.PContainment
	 * @see #setContainment(PContainment)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipant_Containment()
	 * @model
	 * @generated
	 */
        PContainment getContainment();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.CParticipant#getContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.chor.PContainment
	 * @see #getContainment()
	 * @generated
	 */
        void setContainment(PContainment value);

        /**
	 * Returns the value of the '<em><b>Selects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.CParticipantCommon}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Selects</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Selects</em>' reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipant_Selects()
	 * @model
	 * @generated
	 */
        EList<CParticipantCommon> getSelects();

								/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.chor.ProcessInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getCParticipant_Instances()
	 * @model
	 * @generated
	 */
	EList<ProcessInstance> getInstances();

} // CParticipant
