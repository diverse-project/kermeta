/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilingMode.java,v 1.7 2008-10-29 08:29:09 cfaucher Exp $
 */
package km2ecore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Compiling Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see km2ecore.Km2ecorePackage#getCompilingMode()
 * @model annotation="kermeta documentation='/** Enumeration representing the different compiling modes \052/'"
 * @generated
 */
public enum CompilingMode implements Enumerator {
	/**
	 * The '<em><b>Only Ecore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY_ECORE_VALUE
	 * @generated
	 * @ordered
	 */
	ONLY_ECORE(0, "onlyEcore", "onlyEcore"),

	/**
	 * The '<em><b>Behavior Kmt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOR_KMT_VALUE
	 * @generated
	 * @ordered
	 */
	BEHAVIOR_KMT(1, "behaviorKmt", "behaviorKmt"),

	/**
	 * The '<em><b>Behavior Java</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOR_JAVA_VALUE
	 * @generated
	 * @ordered
	 */
	BEHAVIOR_JAVA(2, "behaviorJava", "behaviorJava");

	/**
	 * The '<em><b>Only Ecore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Only Ecore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONLY_ECORE
	 * @model name="onlyEcore"
	 * @generated
	 * @ordered
	 */
	public static final int ONLY_ECORE_VALUE = 0;

	/**
	 * The '<em><b>Behavior Kmt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Behavior Kmt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOR_KMT
	 * @model name="behaviorKmt"
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_KMT_VALUE = 1;

	/**
	 * The '<em><b>Behavior Java</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Behavior Java</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOR_JAVA
	 * @model name="behaviorJava"
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_JAVA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Compiling Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompilingMode[] VALUES_ARRAY = new CompilingMode[] {
			ONLY_ECORE, BEHAVIOR_KMT, BEHAVIOR_JAVA, };

	/**
	 * A public read-only list of all the '<em><b>Compiling Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompilingMode> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Compiling Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompilingMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompilingMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compiling Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompilingMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompilingMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compiling Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompilingMode get(int value) {
		switch (value) {
		case ONLY_ECORE_VALUE:
			return ONLY_ECORE;
		case BEHAVIOR_KMT_VALUE:
			return BEHAVIOR_KMT;
		case BEHAVIOR_JAVA_VALUE:
			return BEHAVIOR_JAVA;
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
	private CompilingMode(int value, String name, String literal) {
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

} //CompilingMode
