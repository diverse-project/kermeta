/**
 * <copyright>
 * </copyright>
 *
 * $Id: ErrorKind.java,v 1.7 2008-10-29 08:29:18 cfaucher Exp $
 */
package kermeta.kunit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Error Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kermeta.kunit.KunitPackage#getErrorKind()
 * @model annotation="kermeta documentation='/**\r\n * all kinds of error we can meet\r\n \052/'"
 * @generated
 */
public enum ErrorKind implements Enumerator {
	/**
	 * The '<em><b>Set Up Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_UP_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	SET_UP_ERROR(0, "setUpError", "setUpError"),

	/**
	 * The '<em><b>Test Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_ERROR(1, "testError", "testError"),

	/**
	 * The '<em><b>Tear Down Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAR_DOWN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	TEAR_DOWN_ERROR(2, "tearDownError", "tearDownError");

	/**
	 * The '<em><b>Set Up Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Set Up Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_UP_ERROR
	 * @model name="setUpError"
	 * @generated
	 * @ordered
	 */
	public static final int SET_UP_ERROR_VALUE = 0;

	/**
	 * The '<em><b>Test Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST_ERROR
	 * @model name="testError"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_ERROR_VALUE = 1;

	/**
	 * The '<em><b>Tear Down Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tear Down Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEAR_DOWN_ERROR
	 * @model name="tearDownError"
	 * @generated
	 * @ordered
	 */
	public static final int TEAR_DOWN_ERROR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Error Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ErrorKind[] VALUES_ARRAY = new ErrorKind[] {
			SET_UP_ERROR, TEST_ERROR, TEAR_DOWN_ERROR, };

	/**
	 * A public read-only list of all the '<em><b>Error Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ErrorKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Error Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErrorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Error Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErrorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Error Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErrorKind get(int value) {
		switch (value) {
		case SET_UP_ERROR_VALUE:
			return SET_UP_ERROR;
		case TEST_ERROR_VALUE:
			return TEST_ERROR;
		case TEAR_DOWN_ERROR_VALUE:
			return TEAR_DOWN_ERROR;
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
	private ErrorKind(int value, String name, String literal) {
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

} //ErrorKind
