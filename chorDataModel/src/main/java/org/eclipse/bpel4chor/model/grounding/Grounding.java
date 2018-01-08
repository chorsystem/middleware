/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.Grounding#getTopology <em>Topology</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.Grounding#getMessageLinks <em>Message Links</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.Grounding#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.grounding.Grounding#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getGrounding()
 * @model
 * @generated
 */
public interface Grounding extends EObject
{
        /**
         * Returns the value of the '<em><b>Topology</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Topology</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Topology</em>' attribute.
         * @see #setTopology(QName)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getGrounding_Topology()
         * @model dataType="org.eclipse.wst.wsdl.QName"
         * @generated
         */
        QName getTopology();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.Grounding#getTopology <em>Topology</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Topology</em>' attribute.
         * @see #getTopology()
         * @generated
         */
        void setTopology(QName value);

        /**
         * Returns the value of the '<em><b>Message Links</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Message Links</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Message Links</em>' containment reference.
         * @see #setMessageLinks(MessageLinks)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getGrounding_MessageLinks()
         * @model containment="true" required="true"
         *        extendedMetaData="name='messageLinks' kind='element' namespace='##targetNamespace'"
         * @generated
         */
        MessageLinks getMessageLinks();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.Grounding#getMessageLinks <em>Message Links</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Message Links</em>' containment reference.
         * @see #getMessageLinks()
         * @generated
         */
        void setMessageLinks(MessageLinks value);

        /**
         * Returns the value of the '<em><b>Participant Refs</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participant Refs</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participant Refs</em>' containment reference.
         * @see #setParticipantRefs(ParticipantRefs)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getGrounding_ParticipantRefs()
         * @model containment="true" required="true"
         *        extendedMetaData="name='participantRefs' kind='element' namespace='##targetNamespace'"
         * @generated
         */
        ParticipantRefs getParticipantRefs();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.Grounding#getParticipantRefs <em>Participant Refs</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Participant Refs</em>' containment reference.
         * @see #getParticipantRefs()
         * @generated
         */
        void setParticipantRefs(ParticipantRefs value);

        /**
         * Returns the value of the '<em><b>Properties</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Properties</em>' containment reference.
         * @see #setProperties(Properties)
         * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage#getGrounding_Properties()
         * @model containment="true" required="true"
         *        extendedMetaData="name='properties' kind='element' namespace='##targetNamespace'"
         * @generated
         */
        Properties getProperties();

        /**
         * Sets the value of the '{@link org.eclipse.bpel4chor.model.grounding.Grounding#getProperties <em>Properties</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Properties</em>' containment reference.
         * @see #getProperties()
         * @generated
         */
        void setProperties(Properties value);

} // Grounding
