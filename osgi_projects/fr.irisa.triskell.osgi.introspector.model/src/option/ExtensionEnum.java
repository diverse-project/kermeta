/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionEnum.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Extension Enum</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see option.OptionPackage#getExtensionEnum()
 * @model
 * @generated
 */
public enum ExtensionEnum implements Enumerator {
	/**
	 * The '<em><b>FRAMEWORK</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #FRAMEWORK_VALUE
	 * @generated
	 * @ordered
	 */
	FRAMEWORK(0, "FRAMEWORK", "framework"),

	/**
	 * The '<em><b>BOOTCLASSPATH</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #BOOTCLASSPATH_VALUE
	 * @generated
	 * @ordered
	 */
	BOOTCLASSPATH(1, "BOOTCLASSPATH", "bootclasspath");

	/**
	 * The '<em><b>FRAMEWORK</b></em>' literal value. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>FRAMEWORK</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FRAMEWORK
	 * @model literal="framework"
	 * @generated
	 * @ordered
	 */
	public static final int FRAMEWORK_VALUE = 0;

	/**
	 * The '<em><b>BOOTCLASSPATH</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOTCLASSPATH</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BOOTCLASSPATH
	 * @model literal="bootclasspath"
	 * @generated
	 * @ordered
	 */
	public static final int BOOTCLASSPATH_VALUE = 1;

	/**
	 * An array of all the '<em><b>Extension Enum</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ExtensionEnum[] VALUES_ARRAY = new ExtensionEnum[] {
			FRAMEWORK, BOOTCLASSPATH, };

	/**
	 * A public read-only list of all the '<em><b>Extension Enum</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ExtensionEnum> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Extension Enum</b></em>' literal with the
	 * specified literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ExtensionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExtensionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Extension Enum</b></em>' literal with the
	 * specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ExtensionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExtensionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Extension Enum</b></em>' literal with the
	 * specified integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ExtensionEnum get(int value) {
		switch (value) {
		case FRAMEWORK_VALUE:
			return FRAMEWORK;
		case BOOTCLASSPATH_VALUE:
			return BOOTCLASSPATH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private ExtensionEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // ExtensionEnum
