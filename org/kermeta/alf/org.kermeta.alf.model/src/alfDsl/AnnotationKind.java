/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Annotation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see alfDsl.AlfDslPackage#getAnnotationKind()
 * @model
 * @generated
 */
public final class AnnotationKind extends AbstractEnumerator {
	/**
	 * The '<em><b>ISOLATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISOLATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISOLATED_LITERAL
	 * @model literal="isolated"
	 * @generated
	 * @ordered
	 */
	public static final int ISOLATED = 0;

	/**
	 * The '<em><b>DETERMINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DETERMINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETERMINED_LITERAL
	 * @model literal="determined"
	 * @generated
	 * @ordered
	 */
	public static final int DETERMINED = 1;

	/**
	 * The '<em><b>ASSURED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSURED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSURED_LITERAL
	 * @model literal="assured"
	 * @generated
	 * @ordered
	 */
	public static final int ASSURED = 2;

	/**
	 * The '<em><b>PARALLEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARALLEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_LITERAL
	 * @model literal="parallel"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL = 3;

	/**
	 * The '<em><b>ISOLATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISOLATED
	 * @generated
	 * @ordered
	 */
	public static final AnnotationKind ISOLATED_LITERAL = new AnnotationKind(ISOLATED, "ISOLATED", "isolated");

	/**
	 * The '<em><b>DETERMINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETERMINED
	 * @generated
	 * @ordered
	 */
	public static final AnnotationKind DETERMINED_LITERAL = new AnnotationKind(DETERMINED, "DETERMINED", "determined");

	/**
	 * The '<em><b>ASSURED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSURED
	 * @generated
	 * @ordered
	 */
	public static final AnnotationKind ASSURED_LITERAL = new AnnotationKind(ASSURED, "ASSURED", "assured");

	/**
	 * The '<em><b>PARALLEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @generated
	 * @ordered
	 */
	public static final AnnotationKind PARALLEL_LITERAL = new AnnotationKind(PARALLEL, "PARALLEL", "parallel");

	/**
	 * An array of all the '<em><b>Annotation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AnnotationKind[] VALUES_ARRAY =
		new AnnotationKind[] {
			ISOLATED_LITERAL,
			DETERMINED_LITERAL,
			ASSURED_LITERAL,
			PARALLEL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Annotation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Annotation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnnotationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Annotation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnnotationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Annotation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationKind get(int value) {
		switch (value) {
			case ISOLATED: return ISOLATED_LITERAL;
			case DETERMINED: return DETERMINED_LITERAL;
			case ASSURED: return ASSURED_LITERAL;
			case PARALLEL: return PARALLEL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AnnotationKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AnnotationKind
