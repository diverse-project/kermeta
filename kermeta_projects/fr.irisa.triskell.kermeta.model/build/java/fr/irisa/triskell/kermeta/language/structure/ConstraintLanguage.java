/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintLanguage.java,v 1.5 2008-02-14 07:13:02 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Language</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getConstraintLanguage()
 * @model annotation="GenModel documentation='/**\n * Enumeration listing supported constraint languages\n \052/'"
 * @generated
 */
public enum ConstraintLanguage implements Enumerator
{
	/**
	 * The '<em><b>Kermeta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KERMETA
	 * @generated
	 * @ordered
	 */
	KERMETA_LITERAL(0, "kermeta", "kermeta"),
	/**
	 * The '<em><b>Ocl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCL
	 * @generated
	 * @ordered
	 */
	OCL_LITERAL(1, "ocl", "ocl");
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	public static final List<ConstraintLanguage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
	private ConstraintLanguage(int value, String name, String literal) {
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
}
