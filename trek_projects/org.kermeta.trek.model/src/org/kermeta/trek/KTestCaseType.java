/**
 * <copyright>
 * </copyright>
 *
 * $Id: KTestCaseType.java,v 1.1 2007-11-26 17:04:18 cfaucher Exp $
 */
package org.kermeta.trek;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>KTest Case Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.kermeta.trek.TrekPackage#getKTestCaseType()
 * @model
 * @generated
 */
public enum KTestCaseType implements Enumerator {
	/**
	 * The '<em><b>Unit Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_TEST(0, "UnitTest", "UnitTest"),

	/**
	 * The '<em><b>Black Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK_BOX(1, "BlackBox", "BlackBox");

	/**
	 * The '<em><b>Unit Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_TEST
	 * @model name="UnitTest"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_TEST_VALUE = 0;

	/**
	 * The '<em><b>Black Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Black Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK_BOX
	 * @model name="BlackBox"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_BOX_VALUE = 1;

	/**
	 * An array of all the '<em><b>KTest Case Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KTestCaseType[] VALUES_ARRAY =
		new KTestCaseType[] {
			UNIT_TEST,
			BLACK_BOX,
		};

	/**
	 * A public read-only list of all the '<em><b>KTest Case Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KTestCaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>KTest Case Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KTestCaseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KTestCaseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>KTest Case Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KTestCaseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KTestCaseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>KTest Case Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KTestCaseType get(int value) {
		switch (value) {
			case UNIT_TEST_VALUE: return UNIT_TEST;
			case BLACK_BOX_VALUE: return BLACK_BOX;
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
	private KTestCaseType(int value, String name, String literal) {
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
	
} //KTestCaseType
