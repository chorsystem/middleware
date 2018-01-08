/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.TransitionCondition;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Activity Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getSourceActivity <em>Source Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getTargetActivity <em>Target Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getTransitionCondition <em>Transition Condition</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getChanged <em>Changed</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getInstanceBuffer <em>Instance Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getFlowActivityLink()
 * @model
 * @generated
 */
public interface FlowActivityLink extends EObject
{
        /**
	 * Returns the value of the '<em><b>Source Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Source Activity</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Activity</em>' reference.
	 * @see #setSourceActivity(Activity)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getFlowActivityLink_SourceActivity()
	 * @model
	 * @generated
	 */
        Activity getSourceActivity();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getSourceActivity <em>Source Activity</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Activity</em>' reference.
	 * @see #getSourceActivity()
	 * @generated
	 */
        void setSourceActivity(Activity value);

        /**
	 * Returns the value of the '<em><b>Target Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Target Activity</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Activity</em>' reference.
	 * @see #setTargetActivity(Activity)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getFlowActivityLink_TargetActivity()
	 * @model
	 * @generated
	 */
        Activity getTargetActivity();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getTargetActivity <em>Target Activity</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Activity</em>' reference.
	 * @see #getTargetActivity()
	 * @generated
	 */
        void setTargetActivity(Activity value);

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
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getFlowActivityLink_Name()
	 * @model
	 * @generated
	 */
        String getName();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
        void setName(String value);

        /**
	 * Returns the value of the '<em><b>Transition Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Transition Condition</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Condition</em>' containment reference.
	 * @see #setTransitionCondition(TransitionCondition)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getFlowActivityLink_TransitionCondition()
	 * @model containment="true"
	 * @generated
	 */
        TransitionCondition getTransitionCondition();

        /**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getTransitionCondition <em>Transition Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Condition</em>' containment reference.
	 * @see #getTransitionCondition()
	 * @generated
	 */
        void setTransitionCondition(TransitionCondition value);

								/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #setChanged(org.eclipse.bpel4chor.model.pbd.Boolean)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getFlowActivityLink_Changed()
	 * @model
	 * @generated
	 */
	org.eclipse.bpel4chor.model.pbd.Boolean getChanged();

								/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #getChanged()
	 * @generated
	 */
	void setChanged(org.eclipse.bpel4chor.model.pbd.Boolean value);

								/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getFlowActivityLink_State()
	 * @model
	 * @generated
	 */
	String getState();

								/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

								/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getFlowActivityLink_Id()
	 * @model
	 * @generated
	 */
	String getId();

								/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

								/**
	 * Returns the value of the '<em><b>Instance Buffer</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.bpel4chor.model.chor.common.ElementInstance},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Buffer</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Buffer</em>' map.
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getFlowActivityLink_InstanceBuffer()
	 * @model mapType="org.eclipse.bpel4chor.model.chor.common.EStringToElementInstanceMap<org.eclipse.emf.ecore.EString, org.eclipse.bpel4chor.model.chor.common.ElementInstance>"
	 * @generated
	 */
	EMap<String, ElementInstance> getInstanceBuffer();

								/**
	 * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance ID</em>' attribute.
	 * @see #setInstanceID(String)
	 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getFlowActivityLink_InstanceID()
	 * @model
	 * @generated
	 */
	String getInstanceID();

								/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.chor.FlowActivityLink#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(String value);

} // FlowActivityLink
