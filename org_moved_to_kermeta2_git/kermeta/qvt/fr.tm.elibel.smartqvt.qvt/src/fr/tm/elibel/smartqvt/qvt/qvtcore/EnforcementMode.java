/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enforcement Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getEnforcementMode()
 * @model
 * @generated
 */
public final class EnforcementMode extends AbstractEnumerator {
	/**
	 * The '<em><b>Creation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Creation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATION_LITERAL
	 * @model name="Creation"
	 * @generated
	 * @ordered
	 */
	public static final int CREATION = 0;

	/**
	 * The '<em><b>Deletion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deletion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETION_LITERAL
	 * @model name="Deletion"
	 * @generated
	 * @ordered
	 */
	public static final int DELETION = 1;

	/**
	 * The '<em><b>Creation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATION
	 * @generated
	 * @ordered
	 */
	public static final EnforcementMode CREATION_LITERAL = new EnforcementMode(CREATION, "Creation", "Creation");

	/**
	 * The '<em><b>Deletion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETION
	 * @generated
	 * @ordered
	 */
	public static final EnforcementMode DELETION_LITERAL = new EnforcementMode(DELETION, "Deletion", "Deletion");

	/**
	 * An array of all the '<em><b>Enforcement Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnforcementMode[] VALUES_ARRAY =
		new EnforcementMode[] {
			CREATION_LITERAL,
			DELETION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Enforcement Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enforcement Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnforcementMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnforcementMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enforcement Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnforcementMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnforcementMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enforcement Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnforcementMode get(int value) {
		switch (value) {
			case CREATION: return CREATION_LITERAL;
			case DELETION: return DELETION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnforcementMode(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EnforcementMode
