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
 * A representation of the literals of the enumeration '<em><b>For All Or Exists Or One Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.kermeta.alf.AlfPackage#getForAllOrExistsOrOneOperator()
 * @model
 * @generated
 */
public final class ForAllOrExistsOrOneOperator extends AbstractEnumerator {
	/**
	 * The '<em><b>FORALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORALL_LITERAL
	 * @model literal="forAll"
	 * @generated
	 * @ordered
	 */
	public static final int FORALL = 0;

	/**
	 * The '<em><b>EXISTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXISTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXISTS_LITERAL
	 * @model literal="exists"
	 * @generated
	 * @ordered
	 */
	public static final int EXISTS = 1;

	/**
	 * The '<em><b>ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_LITERAL
	 * @model literal="one"
	 * @generated
	 * @ordered
	 */
	public static final int ONE = 2;

	/**
	 * The '<em><b>FORALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORALL
	 * @generated
	 * @ordered
	 */
	public static final ForAllOrExistsOrOneOperator FORALL_LITERAL = new ForAllOrExistsOrOneOperator(FORALL, "FORALL", "forAll");

	/**
	 * The '<em><b>EXISTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXISTS
	 * @generated
	 * @ordered
	 */
	public static final ForAllOrExistsOrOneOperator EXISTS_LITERAL = new ForAllOrExistsOrOneOperator(EXISTS, "EXISTS", "exists");

	/**
	 * The '<em><b>ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE
	 * @generated
	 * @ordered
	 */
	public static final ForAllOrExistsOrOneOperator ONE_LITERAL = new ForAllOrExistsOrOneOperator(ONE, "ONE", "one");

	/**
	 * An array of all the '<em><b>For All Or Exists Or One Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ForAllOrExistsOrOneOperator[] VALUES_ARRAY =
		new ForAllOrExistsOrOneOperator[] {
			FORALL_LITERAL,
			EXISTS_LITERAL,
			ONE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>For All Or Exists Or One Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>For All Or Exists Or One Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ForAllOrExistsOrOneOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ForAllOrExistsOrOneOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>For All Or Exists Or One Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ForAllOrExistsOrOneOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ForAllOrExistsOrOneOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>For All Or Exists Or One Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ForAllOrExistsOrOneOperator get(int value) {
		switch (value) {
			case FORALL: return FORALL_LITERAL;
			case EXISTS: return EXISTS_LITERAL;
			case ONE: return ONE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ForAllOrExistsOrOneOperator(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ForAllOrExistsOrOneOperator
