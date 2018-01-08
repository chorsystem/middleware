/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PContainment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel4chor.model.chor.ChorPackage#getPContainment()
 * @model
 * @generated
 */
public enum PContainment implements Enumerator
{
        /**
	 * The '<em><b>Addifnotexists</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #ADDIFNOTEXISTS_VALUE
	 * @generated
	 * @ordered
	 */
        ADDIFNOTEXISTS(0, "addifnotexists", "add-if-not-exists"),

        /**
	 * The '<em><b>Mustadd</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #MUSTADD_VALUE
	 * @generated
	 * @ordered
	 */
        MUSTADD(1, "mustadd", "must-add"),

        /**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
        REQUIRED(2, "required", "required");

        /**
	 * The '<em><b>Addifnotexists</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Addifnotexists</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #ADDIFNOTEXISTS
	 * @model name="addifnotexists" literal="add-if-not-exists"
	 * @generated
	 * @ordered
	 */
        public static final int ADDIFNOTEXISTS_VALUE = 0;

        /**
	 * The '<em><b>Mustadd</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Mustadd</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #MUSTADD
	 * @model name="mustadd" literal="must-add"
	 * @generated
	 * @ordered
	 */
        public static final int MUSTADD_VALUE = 1;

        /**
	 * The '<em><b>Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Required</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #REQUIRED
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
        public static final int REQUIRED_VALUE = 2;

        /**
	 * An array of all the '<em><b>PContainment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static final PContainment[] VALUES_ARRAY =
                new PContainment[] {
			ADDIFNOTEXISTS,
			MUSTADD,
			REQUIRED,
		};

        /**
	 * A public read-only list of all the '<em><b>PContainment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static final List<PContainment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
	 * Returns the '<em><b>PContainment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static PContainment get(String literal)
        {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PContainment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>PContainment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static PContainment getByName(String name)
        {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PContainment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>PContainment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static PContainment get(int value)
        {
		switch (value) {
			case ADDIFNOTEXISTS_VALUE: return ADDIFNOTEXISTS;
			case MUSTADD_VALUE: return MUSTADD;
			case REQUIRED_VALUE: return REQUIRED;
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
        private PContainment(int value, String name, String literal)
        {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public int getValue()
        {
	  return value;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getName()
        {
	  return name;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getLiteral()
        {
	  return literal;
	}

        /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public String toString()
        {
		return literal;
	}
        
} //PContainment
