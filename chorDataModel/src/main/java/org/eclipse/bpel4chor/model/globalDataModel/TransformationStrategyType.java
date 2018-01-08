/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.globalDataModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transformation Strategy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModelPackage#getTransformationStrategyType()
 * @model
 * @generated
 */
public enum TransformationStrategyType implements Enumerator {
	/**
	 * The '<em><b>On demand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_DEMAND_VALUE
	 * @generated
	 * @ordered
	 */
	ON_DEMAND(0, "on_demand", "on_demand"),

	/**
	 * The '<em><b>In advance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_ADVANCE_VALUE
	 * @generated
	 * @ordered
	 */
	IN_ADVANCE(1, "in_advance", "in_advance"),

	/**
	 * The '<em><b>On query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	ON_QUERY(2, "on_query", "on_query"),

	/**
	 * The '<em><b>On read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_READ_VALUE
	 * @generated
	 * @ordered
	 */
	ON_READ(3, "on_read", "on_read");

	/**
	 * The '<em><b>On demand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On demand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_DEMAND
	 * @model name="on_demand"
	 * @generated
	 * @ordered
	 */
	public static final int ON_DEMAND_VALUE = 0;

	/**
	 * The '<em><b>In advance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In advance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_ADVANCE
	 * @model name="in_advance"
	 * @generated
	 * @ordered
	 */
	public static final int IN_ADVANCE_VALUE = 1;

	/**
	 * The '<em><b>On query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On query</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_QUERY
	 * @model name="on_query"
	 * @generated
	 * @ordered
	 */
	public static final int ON_QUERY_VALUE = 2;

	/**
	 * The '<em><b>On read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_READ
	 * @model name="on_read"
	 * @generated
	 * @ordered
	 */
	public static final int ON_READ_VALUE = 3;

	/**
	 * An array of all the '<em><b>Transformation Strategy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransformationStrategyType[] VALUES_ARRAY =
		new TransformationStrategyType[] {
			ON_DEMAND,
			IN_ADVANCE,
			ON_QUERY,
			ON_READ,
		};

	/**
	 * A public read-only list of all the '<em><b>Transformation Strategy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransformationStrategyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transformation Strategy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformationStrategyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformationStrategyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformation Strategy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformationStrategyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformationStrategyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformation Strategy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformationStrategyType get(int value) {
		switch (value) {
			case ON_DEMAND_VALUE: return ON_DEMAND;
			case IN_ADVANCE_VALUE: return IN_ADVANCE;
			case ON_QUERY_VALUE: return ON_QUERY;
			case ON_READ_VALUE: return ON_READ;
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
	private TransformationStrategyType(int value, String name, String literal) {
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
	
} //TransformationStrategyType
