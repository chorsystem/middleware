/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.abstractconstructs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Refinement Phases</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage#getRefinementPhases()
 * @model
 * @generated
 */
public enum RefinementPhases implements Enumerator {
	/**
	 * The '<em><b>Choreography Modeling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOREOGRAPHY_MODELING_VALUE
	 * @generated
	 * @ordered
	 */
	CHOREOGRAPHY_MODELING(0, "Choreography_Modeling", "Choreography_Modeling"),

	/**
	 * The '<em><b>Workflow Modeling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_MODELING_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOW_MODELING(1, "Workflow_Modeling", "Workflow_Modeling"),

	/**
	 * The '<em><b>Provision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISION_VALUE
	 * @generated
	 * @ordered
	 */
	PROVISION(2, "Provision", "Provision"),

	/**
	 * The '<em><b>Execution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTION_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTION(3, "Execution", "Execution");

	/**
	 * The '<em><b>Choreography Modeling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Choreography Modeling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHOREOGRAPHY_MODELING
	 * @model name="Choreography_Modeling"
	 * @generated
	 * @ordered
	 */
	public static final int CHOREOGRAPHY_MODELING_VALUE = 0;

	/**
	 * The '<em><b>Workflow Modeling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Workflow Modeling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_MODELING
	 * @model name="Workflow_Modeling"
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_MODELING_VALUE = 1;

	/**
	 * The '<em><b>Provision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Provision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVISION
	 * @model name="Provision"
	 * @generated
	 * @ordered
	 */
	public static final int PROVISION_VALUE = 2;

	/**
	 * The '<em><b>Execution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Execution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXECUTION
	 * @model name="Execution"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Refinement Phases</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RefinementPhases[] VALUES_ARRAY =
		new RefinementPhases[] {
			CHOREOGRAPHY_MODELING,
			WORKFLOW_MODELING,
			PROVISION,
			EXECUTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Refinement Phases</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RefinementPhases> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Refinement Phases</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefinementPhases get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefinementPhases result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Refinement Phases</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefinementPhases getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefinementPhases result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Refinement Phases</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefinementPhases get(int value) {
		switch (value) {
			case CHOREOGRAPHY_MODELING_VALUE: return CHOREOGRAPHY_MODELING;
			case WORKFLOW_MODELING_VALUE: return WORKFLOW_MODELING;
			case PROVISION_VALUE: return PROVISION;
			case EXECUTION_VALUE: return EXECUTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RefinementPhases(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RefinementPhases
