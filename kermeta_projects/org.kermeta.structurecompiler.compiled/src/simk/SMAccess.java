/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMAccess.java,v 1.2 2008-10-16 13:18:17 cfaucher Exp $
 */
package simk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SM Access</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see simk.SimkPackage#getSMAccess()
 * @model
 * @generated
 */
public enum SMAccess implements Enumerator {
	/**
	 * The '<em><b>Private</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE(0, "private", "private"),

	/**
	 * The '<em><b>Protected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTECTED_VALUE
	 * @generated
	 * @ordered
	 */
	PROTECTED(1, "protected", "protected"),

	/**
	 * The '<em><b>Public</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC(2, "public", "public");

	/**
	 * The '<em><b>Private</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Private</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @model name="private"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_VALUE = 0;

	/**
	 * The '<em><b>Protected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTECTED
	 * @model name="protected"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_VALUE = 1;

	/**
	 * The '<em><b>Public</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Public</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLIC
	 * @model name="public"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>SM Access</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SMAccess[] VALUES_ARRAY = new SMAccess[] { PRIVATE,
			PROTECTED, PUBLIC, };

	/**
	 * A public read-only list of all the '<em><b>SM Access</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SMAccess> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SM Access</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMAccess get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SMAccess result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SM Access</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMAccess getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SMAccess result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SM Access</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMAccess get(int value) {
		switch (value) {
		case PRIVATE_VALUE:
			return PRIVATE;
		case PROTECTED_VALUE:
			return PROTECTED;
		case PUBLIC_VALUE:
			return PUBLIC;
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
	private SMAccess(int value, String name, String literal) {
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

} //SMAccess
