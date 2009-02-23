/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: KermetaEAnnotationSource.java,v 1.12 2009-02-23 15:26:55 cfaucher Exp $
 */
package km2ecore.helper.ecore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kermeta EAnnotation Source</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see km2ecore.helper.ecore.EcorePackage#getKermetaEAnnotationSource()
 * @model annotation="kermeta documentation='/** Enumeration that lists the different keys among the Kermeta annotation in the Ecore side \052/'"
 * @generated
 */
public enum KermetaEAnnotationSource implements Enumerator {
	/**
	 * The '<em><b>Kermeta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KERMETA_VALUE
	 * @generated
	 * @ordered
	 */
	KERMETA(0, "kermeta", "kermeta");

	/**
	 * The '<em><b>Kermeta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kermeta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KERMETA
	 * @model name="kermeta"
	 * @generated
	 * @ordered
	 */
	public static final int KERMETA_VALUE = 0;

	/**
	 * An array of all the '<em><b>Kermeta EAnnotation Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KermetaEAnnotationSource[] VALUES_ARRAY = new KermetaEAnnotationSource[] { KERMETA, };

	/**
	 * A public read-only list of all the '<em><b>Kermeta EAnnotation Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KermetaEAnnotationSource> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kermeta EAnnotation Source</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KermetaEAnnotationSource get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KermetaEAnnotationSource result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kermeta EAnnotation Source</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KermetaEAnnotationSource getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KermetaEAnnotationSource result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kermeta EAnnotation Source</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KermetaEAnnotationSource get(int value) {
		switch (value) {
		case KERMETA_VALUE:
			return KERMETA;
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
	private KermetaEAnnotationSource(int value, String name, String literal) {
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

} //KermetaEAnnotationSource
