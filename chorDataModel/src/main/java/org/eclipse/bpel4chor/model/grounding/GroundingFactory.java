/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.grounding;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.grounding.GroundingPackage
 * @generated
 */
public interface GroundingFactory extends EFactory
{
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        GroundingFactory eINSTANCE = org.eclipse.bpel4chor.model.grounding.impl.GroundingFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Grounding</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Grounding</em>'.
         * @generated
         */
        Grounding createGrounding();

        /**
         * Returns a new object of class '<em>Message Links</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Message Links</em>'.
         * @generated
         */
        MessageLinks createMessageLinks();

        /**
         * Returns a new object of class '<em>Participant Refs</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Participant Refs</em>'.
         * @generated
         */
        ParticipantRefs createParticipantRefs();

        /**
         * Returns a new object of class '<em>Properties</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Properties</em>'.
         * @generated
         */
        Properties createProperties();

        /**
         * Returns a new object of class '<em>Message Link</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Message Link</em>'.
         * @generated
         */
        MessageLink createMessageLink();

        /**
         * Returns a new object of class '<em>Participant Ref</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Participant Ref</em>'.
         * @generated
         */
        ParticipantRef createParticipantRef();

        /**
         * Returns a new object of class '<em>Property</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Property</em>'.
         * @generated
         */
        Property createProperty();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        GroundingPackage getGroundingPackage();

} //GroundingFactory
