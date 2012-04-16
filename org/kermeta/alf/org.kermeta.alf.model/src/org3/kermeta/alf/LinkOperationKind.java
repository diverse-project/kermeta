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
 * A representation of the literals of the enumeration '<em><b>Link Operation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org3.kermeta.alf.AlfPackage#getLinkOperationKind()
 * @model
 * @generated
 */
public final class LinkOperationKind extends AbstractEnumerator {
	/**
	 * The '<em><b>CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE_LITERAL
	 * @model literal="createLink"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE = 0;

	/**
	 * The '<em><b>DESTROY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESTROY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESTROY_LITERAL
	 * @model literal="destroyLink"
	 * @generated
	 * @ordered
	 */
	public static final int DESTROY = 1;

	/**
	 * The '<em><b>CLEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLEAR_LITERAL
	 * @model literal="clearAssoc"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR = 2;

	/**
	 * The '<em><b>CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @generated
	 * @ordered
	 */
	public static final LinkOperationKind CREATE_LITERAL = new LinkOperationKind(CREATE, "CREATE", "createLink");

	/**
	 * The '<em><b>DESTROY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROY
	 * @generated
	 * @ordered
	 */
	public static final LinkOperationKind DESTROY_LITERAL = new LinkOperationKind(DESTROY, "DESTROY", "destroyLink");

	/**
	 * The '<em><b>CLEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR
	 * @generated
	 * @ordered
	 */
	public static final LinkOperationKind CLEAR_LITERAL = new LinkOperationKind(CLEAR, "CLEAR", "clearAssoc");

	/**
	 * An array of all the '<em><b>Link Operation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LinkOperationKind[] VALUES_ARRAY =
		new LinkOperationKind[] {
			CREATE_LITERAL,
			DESTROY_LITERAL,
			CLEAR_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Link Operation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Link Operation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LinkOperationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinkOperationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Link Operation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LinkOperationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinkOperationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Link Operation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LinkOperationKind get(int value) {
		switch (value) {
			case CREATE: return CREATE_LITERAL;
			case DESTROY: return DESTROY_LITERAL;
			case CLEAR: return CLEAR_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LinkOperationKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //LinkOperationKind
