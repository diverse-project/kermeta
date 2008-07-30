/**
 * <copyright>
 * </copyright>
 *
 * $Id: MANIFESTVersionEnum.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>MANIFEST Version Enum</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see manifest.ManifestPackage#getMANIFESTVersionEnum()
 * @model
 * @generated
 */
public enum MANIFESTVersionEnum implements Enumerator {
	/**
	 * The '<em><b>More Than1 3</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #MORE_THAN1_3_VALUE
	 * @generated
	 * @ordered
	 */
	MORE_THAN1_3(2, "moreThan1_3", "2"),

	/**
	 * The '<em><b>Less Than1 3</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #LESS_THAN1_3_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN1_3(1, "lessThan1_3", "1");

	/**
	 * The '<em><b>More Than1 3</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>More Than1 3</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #MORE_THAN1_3
	 * @model name="moreThan1_3" literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int MORE_THAN1_3_VALUE = 2;

	/**
	 * The '<em><b>Less Than1 3</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than1 3</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #LESS_THAN1_3
	 * @model name="lessThan1_3" literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN1_3_VALUE = 1;

	/**
	 * An array of all the '<em><b>MANIFEST Version Enum</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final MANIFESTVersionEnum[] VALUES_ARRAY = new MANIFESTVersionEnum[] {
			MORE_THAN1_3, LESS_THAN1_3, };

	/**
	 * A public read-only list of all the '<em><b>MANIFEST Version Enum</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<MANIFESTVersionEnum> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MANIFEST Version Enum</b></em>' literal with the
	 * specified literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static MANIFESTVersionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MANIFESTVersionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MANIFEST Version Enum</b></em>' literal with the
	 * specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static MANIFESTVersionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MANIFESTVersionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MANIFEST Version Enum</b></em>' literal with the
	 * specified integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static MANIFESTVersionEnum get(int value) {
		switch (value) {
		case MORE_THAN1_3_VALUE:
			return MORE_THAN1_3;
		case LESS_THAN1_3_VALUE:
			return LESS_THAN1_3;
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
	private MANIFESTVersionEnum(int value, String name, String literal) {
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

} // MANIFESTVersionEnum
