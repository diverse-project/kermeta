/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: KermetaEAnnotationKey.java,v 1.11 2009-02-10 17:51:58 cfaucher Exp $
 */
package km2ecore.helper.ecore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kermeta EAnnotation Key</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see km2ecore.helper.ecore.EcorePackage#getKermetaEAnnotationKey()
 * @model
 * @generated
 */
public enum KermetaEAnnotationKey implements Enumerator {
	/**
	 * The '<em><b>Is Abstract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ABSTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	IS_ABSTRACT(0, "isAbstract", "isAbstract"),

	/**
	 * The '<em><b>Alias</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIAS_VALUE
	 * @generated
	 * @ordered
	 */
	ALIAS(1, "alias", "alias"),

	/**
	 * The '<em><b>Super Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPER_OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	SUPER_OPERATION(2, "superOperation", "superOperation"),

	/**
	 * The '<em><b>Is Read Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_READ_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_READ_ONLY(3, "isReadOnly", "isReadOnly"),

	/**
	 * The '<em><b>Documentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATION(4, "documentation", "documentation");

	/**
	 * The '<em><b>Is Abstract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Abstract</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_ABSTRACT
	 * @model name="isAbstract"
	 * @generated
	 * @ordered
	 */
	public static final int IS_ABSTRACT_VALUE = 0;

	/**
	 * The '<em><b>Alias</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alias</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALIAS
	 * @model name="alias"
	 * @generated
	 * @ordered
	 */
	public static final int ALIAS_VALUE = 1;

	/**
	 * The '<em><b>Super Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Super Operation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPER_OPERATION
	 * @model name="superOperation"
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_OPERATION_VALUE = 2;

	/**
	 * The '<em><b>Is Read Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Read Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_READ_ONLY
	 * @model name="isReadOnly"
	 * @generated
	 * @ordered
	 */
	public static final int IS_READ_ONLY_VALUE = 3;

	/**
	 * The '<em><b>Documentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Documentation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION
	 * @model name="documentation"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Kermeta EAnnotation Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KermetaEAnnotationKey[] VALUES_ARRAY = new KermetaEAnnotationKey[] {
			IS_ABSTRACT, ALIAS, SUPER_OPERATION, IS_READ_ONLY, DOCUMENTATION, };

	/**
	 * A public read-only list of all the '<em><b>Kermeta EAnnotation Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KermetaEAnnotationKey> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kermeta EAnnotation Key</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KermetaEAnnotationKey get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KermetaEAnnotationKey result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kermeta EAnnotation Key</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KermetaEAnnotationKey getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KermetaEAnnotationKey result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kermeta EAnnotation Key</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KermetaEAnnotationKey get(int value) {
		switch (value) {
		case IS_ABSTRACT_VALUE:
			return IS_ABSTRACT;
		case ALIAS_VALUE:
			return ALIAS;
		case SUPER_OPERATION_VALUE:
			return SUPER_OPERATION;
		case IS_READ_ONLY_VALUE:
			return IS_READ_ONLY;
		case DOCUMENTATION_VALUE:
			return DOCUMENTATION;
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
	private KermetaEAnnotationKey(int value, String name, String literal) {
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

} //KermetaEAnnotationKey
