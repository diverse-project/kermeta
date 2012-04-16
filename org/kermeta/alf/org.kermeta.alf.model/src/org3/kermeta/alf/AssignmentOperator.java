/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assignment Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org3.kermeta.alf.AlfPackage#getAssignmentOperator()
 * @model
 * @generated
 */
public final class AssignmentOperator extends AbstractEnumerator {
	/**
	 * The '<em><b>ASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGN_LITERAL
	 * @model literal="="
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN = 0;

	/**
	 * The '<em><b>PLUSASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLUSASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUSASSIGN_LITERAL
	 * @model literal="+="
	 * @generated
	 * @ordered
	 */
	public static final int PLUSASSIGN = 1;

	/**
	 * The '<em><b>MINUSASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINUSASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUSASSIGN_LITERAL
	 * @model literal="-="
	 * @generated
	 * @ordered
	 */
	public static final int MINUSASSIGN = 2;

	/**
	 * The '<em><b>MULTASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTASSIGN_LITERAL
	 * @model literal="*="
	 * @generated
	 * @ordered
	 */
	public static final int MULTASSIGN = 3;

	/**
	 * The '<em><b>MODASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODASSIGN_LITERAL
	 * @model literal="%="
	 * @generated
	 * @ordered
	 */
	public static final int MODASSIGN = 4;

	/**
	 * The '<em><b>DIVASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIVASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVASSIGN_LITERAL
	 * @model literal="/="
	 * @generated
	 * @ordered
	 */
	public static final int DIVASSIGN = 5;

	/**
	 * The '<em><b>ANDASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANDASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANDASSIGN_LITERAL
	 * @model literal="&="
	 * @generated
	 * @ordered
	 */
	public static final int ANDASSIGN = 6;

	/**
	 * The '<em><b>ORASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORASSIGN_LITERAL
	 * @model literal="|="
	 * @generated
	 * @ordered
	 */
	public static final int ORASSIGN = 7;

	/**
	 * The '<em><b>XORASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XORASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XORASSIGN_LITERAL
	 * @model literal="^="
	 * @generated
	 * @ordered
	 */
	public static final int XORASSIGN = 8;

	/**
	 * The '<em><b>LSHIFTASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LSHIFTASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LSHIFTASSIGN_LITERAL
	 * @model literal="<<="
	 * @generated
	 * @ordered
	 */
	public static final int LSHIFTASSIGN = 9;

	/**
	 * The '<em><b>RSHIFTASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RSHIFTASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RSHIFTASSIGN_LITERAL
	 * @model literal=">>="
	 * @generated
	 * @ordered
	 */
	public static final int RSHIFTASSIGN = 10;

	/**
	 * The '<em><b>URSHIFTASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>URSHIFTASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URSHIFTASSIGN_LITERAL
	 * @model literal=">>>="
	 * @generated
	 * @ordered
	 */
	public static final int URSHIFTASSIGN = 11;

	/**
	 * The '<em><b>ASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator ASSIGN_LITERAL = new AssignmentOperator(ASSIGN, "ASSIGN", "=");

	/**
	 * The '<em><b>PLUSASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUSASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator PLUSASSIGN_LITERAL = new AssignmentOperator(PLUSASSIGN, "PLUSASSIGN", "+=");

	/**
	 * The '<em><b>MINUSASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUSASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator MINUSASSIGN_LITERAL = new AssignmentOperator(MINUSASSIGN, "MINUSASSIGN", "-=");

	/**
	 * The '<em><b>MULTASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator MULTASSIGN_LITERAL = new AssignmentOperator(MULTASSIGN, "MULTASSIGN", "*=");

	/**
	 * The '<em><b>MODASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator MODASSIGN_LITERAL = new AssignmentOperator(MODASSIGN, "MODASSIGN", "%=");

	/**
	 * The '<em><b>DIVASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator DIVASSIGN_LITERAL = new AssignmentOperator(DIVASSIGN, "DIVASSIGN", "/=");

	/**
	 * The '<em><b>ANDASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANDASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator ANDASSIGN_LITERAL = new AssignmentOperator(ANDASSIGN, "ANDASSIGN", "&=");

	/**
	 * The '<em><b>ORASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator ORASSIGN_LITERAL = new AssignmentOperator(ORASSIGN, "ORASSIGN", "|=");

	/**
	 * The '<em><b>XORASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XORASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator XORASSIGN_LITERAL = new AssignmentOperator(XORASSIGN, "XORASSIGN", "^=");

	/**
	 * The '<em><b>LSHIFTASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LSHIFTASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator LSHIFTASSIGN_LITERAL = new AssignmentOperator(LSHIFTASSIGN, "LSHIFTASSIGN", "<<=");

	/**
	 * The '<em><b>RSHIFTASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSHIFTASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator RSHIFTASSIGN_LITERAL = new AssignmentOperator(RSHIFTASSIGN, "RSHIFTASSIGN", ">>=");

	/**
	 * The '<em><b>URSHIFTASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URSHIFTASSIGN
	 * @generated
	 * @ordered
	 */
	public static final AssignmentOperator URSHIFTASSIGN_LITERAL = new AssignmentOperator(URSHIFTASSIGN, "URSHIFTASSIGN", ">>>=");

	/**
	 * An array of all the '<em><b>Assignment Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssignmentOperator[] VALUES_ARRAY =
		new AssignmentOperator[] {
			ASSIGN_LITERAL,
			PLUSASSIGN_LITERAL,
			MINUSASSIGN_LITERAL,
			MULTASSIGN_LITERAL,
			MODASSIGN_LITERAL,
			DIVASSIGN_LITERAL,
			ANDASSIGN_LITERAL,
			ORASSIGN_LITERAL,
			XORASSIGN_LITERAL,
			LSHIFTASSIGN_LITERAL,
			RSHIFTASSIGN_LITERAL,
			URSHIFTASSIGN_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Assignment Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assignment Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssignmentOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignmentOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assignment Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssignmentOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignmentOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assignment Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssignmentOperator get(int value) {
		switch (value) {
			case ASSIGN: return ASSIGN_LITERAL;
			case PLUSASSIGN: return PLUSASSIGN_LITERAL;
			case MINUSASSIGN: return MINUSASSIGN_LITERAL;
			case MULTASSIGN: return MULTASSIGN_LITERAL;
			case MODASSIGN: return MODASSIGN_LITERAL;
			case DIVASSIGN: return DIVASSIGN_LITERAL;
			case ANDASSIGN: return ANDASSIGN_LITERAL;
			case ORASSIGN: return ORASSIGN_LITERAL;
			case XORASSIGN: return XORASSIGN_LITERAL;
			case LSHIFTASSIGN: return LSHIFTASSIGN_LITERAL;
			case RSHIFTASSIGN: return RSHIFTASSIGN_LITERAL;
			case URSHIFTASSIGN: return URSHIFTASSIGN_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssignmentOperator(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AssignmentOperator
