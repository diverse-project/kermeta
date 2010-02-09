/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>unique Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smartadapters.core.SmartAdapters4DiVAPackage#getuniqueType()
 * @model
 * @generated
 */
public enum uniqueType implements Enumerator {
	/**
	 * The '<em><b>Unique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	UNIQUE(0, "unique", "unique"),

	/**
	 * The '<em><b>Non unique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	NON_UNIQUE(1, "non_unique", "non_unique"),

	/**
	 * The '<em><b>On Demand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_DEMAND_VALUE
	 * @generated
	 * @ordered
	 */
	ON_DEMAND(2, "onDemand", "onDemand");

	/**
	 * The '<em><b>Unique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unique</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIQUE
	 * @model name="unique"
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_VALUE = 0;

	/**
	 * The '<em><b>Non unique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non unique</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_UNIQUE
	 * @model name="non_unique"
	 * @generated
	 * @ordered
	 */
	public static final int NON_UNIQUE_VALUE = 1;

	/**
	 * The '<em><b>On Demand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Demand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_DEMAND
	 * @model name="onDemand"
	 * @generated
	 * @ordered
	 */
	public static final int ON_DEMAND_VALUE = 2;

	/**
	 * An array of all the '<em><b>unique Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final uniqueType[] VALUES_ARRAY =
		new uniqueType[] {
			UNIQUE,
			NON_UNIQUE,
			ON_DEMAND,
		};

	/**
	 * A public read-only list of all the '<em><b>unique Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<uniqueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>unique Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static uniqueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			uniqueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>unique Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static uniqueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			uniqueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>unique Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static uniqueType get(int value) {
		switch (value) {
			case UNIQUE_VALUE: return UNIQUE;
			case NON_UNIQUE_VALUE: return NON_UNIQUE;
			case ON_DEMAND_VALUE: return ON_DEMAND;
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
	private uniqueType(int value, String name, String literal) {
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
	
} //uniqueType
