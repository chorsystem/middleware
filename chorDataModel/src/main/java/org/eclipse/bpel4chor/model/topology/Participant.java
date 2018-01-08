/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Participant#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Participant#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Participant#getSelects <em>Selects</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Participant#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Participant#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.topology.Participant#getContainment <em>Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject
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
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipant_Name()
         * @model required="true"
         * @generated
         */
        String getName();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.Participant#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);

        /**
         * Returns the value of the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Type</em>' attribute.
         * @see #setType(String)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipant_Type()
         * @model ordered="false"
         * @generated
         */
        String getType();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.Participant#getType <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Type</em>' attribute.
         * @see #getType()
         * @generated
         */
        void setType(String value);

        /**
         * Returns the value of the '<em><b>Selects</b></em>' attribute list.
         * The list contents are of type {@link java.lang.String}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Selects</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Selects</em>' attribute list.
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipant_Selects()
         * @model
         * @generated
         */
        EList<String> getSelects();

        /**
         * Returns the value of the '<em><b>For Each</b></em>' attribute.
         * The default value is <code>""</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>For Each</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>For Each</em>' attribute.
         * @see #setForEach(QName)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipant_ForEach()
         * @model default="" dataType="org.eclipse.wst.wsdl.QName"
         * @generated
         */
        QName getForEach();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.Participant#getForEach <em>For Each</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>For Each</em>' attribute.
         * @see #getForEach()
         * @generated
         */
        void setForEach(QName value);

        /**
         * Returns the value of the '<em><b>Scope</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Scope</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Scope</em>' attribute.
         * @see #setScope(QName)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipant_Scope()
         * @model dataType="org.eclipse.wst.wsdl.QName"
         * @generated
         */
        QName getScope();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.Participant#getScope <em>Scope</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Scope</em>' attribute.
         * @see #getScope()
         * @generated
         */
        void setScope(QName value);

        /**
         * Returns the value of the '<em><b>Containment</b></em>' attribute.
         * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.topology.Containment}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Containment</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Containment</em>' attribute.
         * @see org.eclipse.bpel4chor.model.topology.Containment
         * @see #setContainment(Containment)
         * @see org.eclipse.bpel4chor.model.topology.TopologyPackage#getParticipant_Containment()
         * @model
         * @generated
         */
        Containment getContainment();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.topology.Participant#getContainment <em>Containment</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Containment</em>' attribute.
         * @see org.eclipse.bpel4chor.model.topology.Containment
         * @see #getContainment()
         * @generated
         */
        void setContainment(Containment value);

} // Participant
