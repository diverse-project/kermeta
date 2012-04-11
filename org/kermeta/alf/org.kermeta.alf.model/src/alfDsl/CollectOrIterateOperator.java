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
 * A representation of the literals of the enumeration '<em><b>Collect Or Iterate Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see alfDsl.AlfDslPackage#getCollectOrIterateOperator()
 * @model
 * @generated
 */
public final class CollectOrIterateOperator extends AbstractEnumerator {
	/**
	 * The '<em><b>COLLECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLLECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLECT_LITERAL
	 * @model literal="collect"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECT = 0;

	/**
	 * The '<em><b>ITERATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITERATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITERATE_LITERAL
	 * @model literal="iterate"
	 * @generated
	 * @ordered
	 */
	public static final int ITERATE = 1;

	/**
	 * The '<em><b>COLLECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECT
	 * @generated
	 * @ordered
	 */
	public static final CollectOrIterateOperator COLLECT_LITERAL = new CollectOrIterateOperator(COLLECT, "COLLECT", "collect");

	/**
	 * The '<em><b>ITERATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITERATE
	 * @generated
	 * @ordered
	 */
	public static final CollectOrIterateOperator ITERATE_LITERAL = new CollectOrIterateOperator(ITERATE, "ITERATE", "iterate");

	/**
	 * An array of all the '<em><b>Collect Or Iterate Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CollectOrIterateOperator[] VALUES_ARRAY =
		new CollectOrIterateOperator[] {
			COLLECT_LITERAL,
			ITERATE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Collect Or Iterate Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Collect Or Iterate Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollectOrIterateOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CollectOrIterateOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Collect Or Iterate Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollectOrIterateOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CollectOrIterateOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Collect Or Iterate Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollectOrIterateOperator get(int value) {
		switch (value) {
			case COLLECT: return COLLECT_LITERAL;
			case ITERATE: return ITERATE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CollectOrIterateOperator(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CollectOrIterateOperator
