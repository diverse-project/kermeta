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
 * A representation of the literals of the enumeration '<em><b>Select Or Reject Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.kermeta.alf.AlfPackage#getSelectOrRejectOperator()
 * @model
 * @generated
 */
public final class SelectOrRejectOperator extends AbstractEnumerator {
	/**
	 * The '<em><b>SELECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECT_LITERAL
	 * @model literal="select"
	 * @generated
	 * @ordered
	 */
	public static final int SELECT = 0;

	/**
	 * The '<em><b>REJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT_LITERAL
	 * @model literal="reject"
	 * @generated
	 * @ordered
	 */
	public static final int REJECT = 1;

	/**
	 * The '<em><b>SELECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT
	 * @generated
	 * @ordered
	 */
	public static final SelectOrRejectOperator SELECT_LITERAL = new SelectOrRejectOperator(SELECT, "SELECT", "select");

	/**
	 * The '<em><b>REJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT
	 * @generated
	 * @ordered
	 */
	public static final SelectOrRejectOperator REJECT_LITERAL = new SelectOrRejectOperator(REJECT, "REJECT", "reject");

	/**
	 * An array of all the '<em><b>Select Or Reject Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SelectOrRejectOperator[] VALUES_ARRAY =
		new SelectOrRejectOperator[] {
			SELECT_LITERAL,
			REJECT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Select Or Reject Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Select Or Reject Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectOrRejectOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelectOrRejectOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Select Or Reject Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectOrRejectOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelectOrRejectOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Select Or Reject Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectOrRejectOperator get(int value) {
		switch (value) {
			case SELECT: return SELECT_LITERAL;
			case REJECT: return REJECT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SelectOrRejectOperator(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SelectOrRejectOperator
