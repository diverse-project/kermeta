/**
 * <copyright>
 * </copyright>
 *
 * $Id: FragmentAttachmentEnum.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package option;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Fragment Attachment Enum</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * @see option.OptionPackage#getFragmentAttachmentEnum()
 * @model
 * @generated
 */
public enum FragmentAttachmentEnum implements Enumerator {
	/**
	 * The '<em><b>ALWAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS(0, "ALWAYS", "always"),

	/**
	 * The '<em><b>NEVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(1, "NEVER", "never"),

	/**
	 * The '<em><b>RESOLVETIME</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #RESOLVETIME_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVETIME(2, "RESOLVETIME", "resolve-time");

	/**
	 * The '<em><b>ALWAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALWAYS</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALWAYS
	 * @model literal="always"
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_VALUE = 0;

	/**
	 * The '<em><b>NEVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEVER</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEVER
	 * @model literal="never"
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 1;

	/**
	 * The '<em><b>RESOLVETIME</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>RESOLVETIME</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOLVETIME
	 * @model literal="resolve-time"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVETIME_VALUE = 2;

	/**
	 * An array of all the '<em><b>Fragment Attachment Enum</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final FragmentAttachmentEnum[] VALUES_ARRAY = new FragmentAttachmentEnum[] {
			ALWAYS,
			NEVER,
			RESOLVETIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Fragment Attachment Enum</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FragmentAttachmentEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fragment Attachment Enum</b></em>' literal with
	 * the specified literal value. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static FragmentAttachmentEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FragmentAttachmentEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fragment Attachment Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static FragmentAttachmentEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FragmentAttachmentEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fragment Attachment Enum</b></em>' literal with
	 * the specified integer value. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static FragmentAttachmentEnum get(int value) {
		switch (value) {
			case ALWAYS_VALUE: return ALWAYS;
			case NEVER_VALUE: return NEVER;
			case RESOLVETIME_VALUE: return RESOLVETIME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private FragmentAttachmentEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // FragmentAttachmentEnum
