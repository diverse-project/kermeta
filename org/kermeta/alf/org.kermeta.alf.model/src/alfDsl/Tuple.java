/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.Tuple#getTupleElements <em>Tuple Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getTuple()
 * @model
 * @generated
 */
public interface Tuple extends EObject {
	/**
	 * Returns the value of the '<em><b>Tuple Elements</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.TupleElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Elements</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getTuple_TupleElements()
	 * @model type="alfDsl.TupleElement" containment="true"
	 * @generated
	 */
	EList getTupleElements();

} // Tuple
