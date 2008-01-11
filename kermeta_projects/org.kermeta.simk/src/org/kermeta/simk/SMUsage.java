/**
 * $Id: SMUsage.java,v 1.6 2008-01-11 14:33:02 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMUsage.java,v 1.6 2008-01-11 14:33:02 cfaucher Exp $
 */
package org.kermeta.simk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SM Usage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.kermeta.simk.SimkPackage#getSMUsage()
 * @model
 * @generated
 */
public enum SMUsage implements Enumerator {
	/**
	 * The '<em><b>Function Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_TYPE(0, "FunctionType", "FunctionType"),

	/**
	 * The '<em><b>Runner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNER_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNER(1, "Runner", "Runner"), /**
	 * The '<em><b>Launcher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAUNCHER_VALUE
	 * @generated
	 * @ordered
	 */
	LAUNCHER(2, "Launcher", "Launcher"), /**
	 * The '<em><b>Derived Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED_PROPERTY(3, "DerivedProperty", "DerivedProperty"), /**
	 * The '<em><b>Pre Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_CONDITION(4, "PreCondition", "PreCondition"), /**
	 * The '<em><b>Post Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	POST_CONDITION(5, "PostCondition", "PostCondition");

	/**
	 * The '<em><b>Function Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_TYPE
	 * @model name="FunctionType"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_TYPE_VALUE = 0;

	/**
	 * The '<em><b>Runner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Runner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUNNER
	 * @model name="Runner"
	 * @generated
	 * @ordered
	 */
	public static final int RUNNER_VALUE = 1;

	/**
	 * The '<em><b>Launcher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Launcher</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAUNCHER
	 * @model name="Launcher"
	 * @generated
	 * @ordered
	 */
	public static final int LAUNCHER_VALUE = 2;

	/**
	 * The '<em><b>Derived Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Derived Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERIVED_PROPERTY
	 * @model name="DerivedProperty"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_PROPERTY_VALUE = 3;

	/**
	 * The '<em><b>Pre Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pre Condition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_CONDITION
	 * @model name="PreCondition"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_CONDITION_VALUE = 4;

	/**
	 * The '<em><b>Post Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post Condition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_CONDITION
	 * @model name="PostCondition"
	 * @generated
	 * @ordered
	 */
	public static final int POST_CONDITION_VALUE = 5;

	/**
	 * An array of all the '<em><b>SM Usage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SMUsage[] VALUES_ARRAY =
		new SMUsage[] {
			FUNCTION_TYPE,
			RUNNER,
			LAUNCHER,
			DERIVED_PROPERTY,
			PRE_CONDITION,
			POST_CONDITION,
		};

	/**
	 * A public read-only list of all the '<em><b>SM Usage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SMUsage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SM Usage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMUsage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SMUsage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SM Usage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMUsage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SMUsage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SM Usage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMUsage get(int value) {
		switch (value) {
			case FUNCTION_TYPE_VALUE: return FUNCTION_TYPE;
			case RUNNER_VALUE: return RUNNER;
			case LAUNCHER_VALUE: return LAUNCHER;
			case DERIVED_PROPERTY_VALUE: return DERIVED_PROPERTY;
			case PRE_CONDITION_VALUE: return PRE_CONDITION;
			case POST_CONDITION_VALUE: return POST_CONDITION;
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
	private SMUsage(int value, String name, String literal) {
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
	
} //SMUsage
