/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Import Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getImportKind()
 * @model
 * @generated
 */
public final class ImportKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_LITERAL
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION = 0;

	/**
	 * The '<em><b>Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Access</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCESS_LITERAL
	 * @model name="access"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS = 1;

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION
	 * @generated
	 * @ordered
	 */
	public static final ImportKind EXTENSION_LITERAL = new ImportKind(EXTENSION, "extension", "extension");

	/**
	 * The '<em><b>Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS
	 * @generated
	 * @ordered
	 */
	public static final ImportKind ACCESS_LITERAL = new ImportKind(ACCESS, "access", "access");

	/**
	 * An array of all the '<em><b>Import Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImportKind[] VALUES_ARRAY =
		new ImportKind[] {
			EXTENSION_LITERAL,
			ACCESS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Import Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Import Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImportKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImportKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Import Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImportKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImportKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Import Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImportKind get(int value) {
		switch (value) {
			case EXTENSION: return EXTENSION_LITERAL;
			case ACCESS: return ACCESS_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ImportKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ImportKind
