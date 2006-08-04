/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintLanguage.java,v 1.2 2006-08-04 13:31:36 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Language</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getConstraintLanguage()
 * @model
 * @generated
 */
public final class ConstraintLanguage extends AbstractEnumerator {
	/**
	 * The '<em><b>Kermeta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kermeta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KERMETA_LITERAL
	 * @model name="kermeta"
	 * @generated
	 * @ordered
	 */
	public static final int KERMETA = 0;

	/**
	 * The '<em><b>Ocl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ocl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCL_LITERAL
	 * @model name="ocl"
	 * @generated
	 * @ordered
	 */
	public static final int OCL = 1;

	/**
	 * The '<em><b>Kermeta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KERMETA
	 * @generated
	 * @ordered
	 */
	public static final ConstraintLanguage KERMETA_LITERAL = new ConstraintLanguage(KERMETA, "kermeta", "kermeta");

	/**
	 * The '<em><b>Ocl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCL
	 * @generated
	 * @ordered
	 */
	public static final ConstraintLanguage OCL_LITERAL = new ConstraintLanguage(OCL, "ocl", "ocl");

	/**
	 * An array of all the '<em><b>Constraint Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConstraintLanguage[] VALUES_ARRAY =
		new ConstraintLanguage[] {
			KERMETA_LITERAL,
			OCL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Constraint Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constraint Language</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintLanguage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintLanguage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Language</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintLanguage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintLanguage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Language</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintLanguage get(int value) {
		switch (value) {
			case KERMETA: return KERMETA_LITERAL;
			case OCL: return OCL_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConstraintLanguage(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ConstraintLanguage
