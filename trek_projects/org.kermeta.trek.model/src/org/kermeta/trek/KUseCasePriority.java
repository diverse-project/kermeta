/**
 * <copyright>
 * </copyright>
 *
 * $Id: KUseCasePriority.java,v 1.1 2007-11-27 16:45:55 cfaucher Exp $
 */
package org.kermeta.trek;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>KUse Case Priority</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.kermeta.trek.TrekPackage#getKUseCasePriority()
 * @model
 * @generated
 */
public enum KUseCasePriority implements Enumerator {
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
	 * The '<em><b>High</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH(1, "High", "High"),

	/**
	 * The '<em><b>Medium</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(2, "Medium", "Medium"),

	/**
	 * The '<em><b>Low</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOW(0, "Low", "Low");

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
	 * The '<em><b>High</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @model name="High"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUE = 1;

	/**
	 * The '<em><b>Medium</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medium</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @model name="Medium"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 2;

	/**
	 * The '<em><b>Low</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Low</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @model name="Low"
	 * @generated
	 * @ordered
	 */
	public static final int LOW_VALUE = 0;

	/**
	 * An array of all the '<em><b>KUse Case Priority</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KUseCasePriority[] VALUES_ARRAY =
		new KUseCasePriority[] {
			DEFAULT,
			HIGH,
			MEDIUM,
			LOW,
		};

	/**
	 * A public read-only list of all the '<em><b>KUse Case Priority</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KUseCasePriority> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>KUse Case Priority</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KUseCasePriority get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KUseCasePriority result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>KUse Case Priority</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KUseCasePriority getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KUseCasePriority result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>KUse Case Priority</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KUseCasePriority get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case HIGH_VALUE: return HIGH;
			case MEDIUM_VALUE: return MEDIUM;
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
	private KUseCasePriority(int value, String name, String literal) {
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
	
} //KUseCasePriority
