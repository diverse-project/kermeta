/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMUsage.java,v 1.9 2008-11-27 15:50:13 cfaucher Exp $
 */
package simk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SM Usage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see simk.SimkPackage#getSMUsage()
 * @model
 * @generated
 */
public enum SMUsage implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "Default", "Default"),

	/**
	 * The '<em><b>Super</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPER_VALUE
	 * @generated
	 * @ordered
	 */
	SUPER(1, "Super", "Super"),

	/**
	 * The '<em><b>Derived Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED_PROPERTY(2, "DerivedProperty", "DerivedProperty"),

	/**
	 * The '<em><b>Pre Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_CONDITION(3, "PreCondition", "PreCondition"),

	/**
	 * The '<em><b>Post Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	POST_CONDITION(4, "PostCondition", "PostCondition"),

	/**
	 * The '<em><b>Wrapper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRAPPER_VALUE
	 * @generated
	 * @ordered
	 */
	WRAPPER(5, "Wrapper", "Wrapper"),

	/**
	 * The '<em><b>Runner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNER_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNER(6, "Runner", "Runner"),

	/**
	 * The '<em><b>Invariant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	INVARIANT(7, "Invariant", "Invariant");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="Default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Super</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Super</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPER
	 * @model name="Super"
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_VALUE = 1;

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
	public static final int DERIVED_PROPERTY_VALUE = 2;

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
	public static final int PRE_CONDITION_VALUE = 3;

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
	public static final int POST_CONDITION_VALUE = 4;

	/**
	 * The '<em><b>Wrapper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wrapper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRAPPER
	 * @model name="Wrapper"
	 * @generated
	 * @ordered
	 */
	public static final int WRAPPER_VALUE = 5;

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
	public static final int RUNNER_VALUE = 6;

	/**
	 * The '<em><b>Invariant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Invariant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVARIANT
	 * @model name="Invariant"
	 * @generated
	 * @ordered
	 */
	public static final int INVARIANT_VALUE = 7;

	/**
	 * An array of all the '<em><b>SM Usage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SMUsage[] VALUES_ARRAY = new SMUsage[] { DEFAULT,
			SUPER, DERIVED_PROPERTY, PRE_CONDITION, POST_CONDITION, WRAPPER,
			RUNNER, INVARIANT, };

	/**
	 * A public read-only list of all the '<em><b>SM Usage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SMUsage> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
		case DEFAULT_VALUE:
			return DEFAULT;
		case SUPER_VALUE:
			return SUPER;
		case DERIVED_PROPERTY_VALUE:
			return DERIVED_PROPERTY;
		case PRE_CONDITION_VALUE:
			return PRE_CONDITION;
		case POST_CONDITION_VALUE:
			return POST_CONDITION;
		case WRAPPER_VALUE:
			return WRAPPER;
		case RUNNER_VALUE:
			return RUNNER;
		case INVARIANT_VALUE:
			return INVARIANT;
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
