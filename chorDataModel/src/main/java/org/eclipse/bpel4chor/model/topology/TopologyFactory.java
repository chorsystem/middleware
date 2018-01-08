/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.topology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.topology.TopologyPackage
 * @generated
 */
public interface TopologyFactory extends EFactory
{
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        TopologyFactory eINSTANCE = org.eclipse.bpel4chor.model.topology.impl.TopologyFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Topology</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Topology</em>'.
         * @generated
         */
        Topology createTopology();

        /**
         * Returns a new object of class '<em>Participant Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Participant Type</em>'.
         * @generated
         */
        ParticipantType createParticipantType();

        /**
         * Returns a new object of class '<em>Participant</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Participant</em>'.
         * @generated
         */
        Participant createParticipant();

        /**
         * Returns a new object of class '<em>Participant Set</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Participant Set</em>'.
         * @generated
         */
        ParticipantSet createParticipantSet();

        /**
         * Returns a new object of class '<em>Participants</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Participants</em>'.
         * @generated
         */
        Participants createParticipants();

        /**
         * Returns a new object of class '<em>Message Link</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Message Link</em>'.
         * @generated
         */
        MessageLink createMessageLink();

        /**
         * Returns a new object of class '<em>Participant Types</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Participant Types</em>'.
         * @generated
         */
        ParticipantTypes createParticipantTypes();

        /**
         * Returns a new object of class '<em>Message Links</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Message Links</em>'.
         * @generated
         */
        MessageLinks createMessageLinks();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        TopologyPackage getTopologyPackage();

} //TopologyFactory
