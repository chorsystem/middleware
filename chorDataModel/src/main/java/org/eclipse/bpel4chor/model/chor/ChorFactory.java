/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage
 * @generated
 */
public interface ChorFactory extends EFactory
{
        /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        ChorFactory eINSTANCE = org.eclipse.bpel4chor.model.chor.impl.ChorFactoryImpl.init();

        /**
	 * Returns a new object of class '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choreography</em>'.
	 * @generated
	 */
        Choreography createChoreography();

        /**
	 * Returns a new object of class '<em>CMessage Link</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMessage Link</em>'.
	 * @generated
	 */
        CMessageLink createCMessageLink();

        /**
	 * Returns a new object of class '<em>CParticipant Ref</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>CParticipant Ref</em>'.
	 * @generated
	 */
        CParticipantRef createCParticipantRef();

        /**
	 * Returns a new object of class '<em>Flow Activity Link</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Activity Link</em>'.
	 * @generated
	 */
        FlowActivityLink createFlowActivityLink();

        /**
	 * Returns a new object of class '<em>CParticipant</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>CParticipant</em>'.
	 * @generated
	 */
        CParticipant createCParticipant();

        /**
	 * Returns a new object of class '<em>CParticipant Set</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>CParticipant Set</em>'.
	 * @generated
	 */
        CParticipantSet createCParticipantSet();

        /**
	 * Returns a new object of class '<em>CGrounding</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>CGrounding</em>'.
	 * @generated
	 */
        CGrounding createCGrounding();

        /**
	 * Returns a new object of class '<em>Correlation Set Grounding</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correlation Set Grounding</em>'.
	 * @generated
	 */
        CorrelationSetGrounding createCorrelationSetGrounding();

        /**
	 * Returns a new object of class '<em>Property Grounding</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Grounding</em>'.
	 * @generated
	 */
        PropertyGrounding createPropertyGrounding();

        /**
	 * Returns a new object of class '<em>CMessage Link Grounding</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMessage Link Grounding</em>'.
	 * @generated
	 */
        CMessageLinkGrounding createCMessageLinkGrounding();

        /**
	 * Returns a new object of class '<em>CParticipant Ref Grounding</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>CParticipant Ref Grounding</em>'.
	 * @generated
	 */
        CParticipantRefGrounding createCParticipantRefGrounding();

        /**
	 * Returns a new object of class '<em>CQ Name</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>CQ Name</em>'.
	 * @generated
	 */
        CQName createCQName();

        /**
	 * Returns a new object of class '<em>For Each Iteration Spec</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Each Iteration Spec</em>'.
	 * @generated
	 */
        ForEachIterationSpec createForEachIterationSpec();

        /**
	 * Returns a new object of class '<em>Abstract Connector Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Connector Link</em>'.
	 * @generated
	 */
	AbstractConnectorLink createAbstractConnectorLink();

								/**
	 * Returns a new object of class '<em>Process Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Instance</em>'.
	 * @generated
	 */
	ProcessInstance createProcessInstance();

								/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
        ChorPackage getChorPackage();

} //ChorFactory
