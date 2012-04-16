/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Boolean Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.kermeta.alf.AlfPackage#getBooleanValue()
 * @model
 * @generated
 */
public final class BooleanValue extends AbstractEnumerator {
	/**
	 * The '<em><b>TRUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRUE_LITERAL
	 * @model literal="true"
	 * @generated
	 * @ordered
	 */
	public static final int TRUE = 0;

	/**
	 * The '<em><b>FALSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FALSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FALSE_LITERAL
	 * @model literal="false"
	 * @generated
	 * @ordered
	 */
	public static final int FALSE = 1;

	/**
	 * The '<em><b>TRUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUE
	 * @generated
	 * @ordered
	 */
	public static final BooleanValue TRUE_LITERAL = new BooleanValue(TRUE, "TRUE", "true");

	/**
	 * The '<em><b>FALSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALSE
	 * @generated
	 * @ordered
	 */
	public static final BooleanValue FALSE_LITERAL = new BooleanValue(FALSE, "FALSE", "false");

	/**
	 * An array of all the '<em><b>Boolean Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BooleanValue[] VALUES_ARRAY =
		new BooleanValue[] {
			TRUE_LITERAL,
			FALSE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Boolean Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Boolean Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BooleanValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BooleanValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Boolean Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BooleanValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BooleanValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Boolean Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BooleanValue get(int value) {
		switch (value) {
			case TRUE: return TRUE_LITERAL;
			case FALSE: return FALSE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BooleanValue(int value, String name, String literal) {
		super(value, name, literal);
	}

} //BooleanValue
