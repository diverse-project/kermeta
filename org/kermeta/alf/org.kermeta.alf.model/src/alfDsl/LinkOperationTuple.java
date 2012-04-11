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
 * A representation of the model object '<em><b>Link Operation Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.LinkOperationTuple#getLinkOperationTupleElement <em>Link Operation Tuple Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getLinkOperationTuple()
 * @model
 * @generated
 */
public interface LinkOperationTuple extends EObject {
	/**
	 * Returns the value of the '<em><b>Link Operation Tuple Element</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.LinkOperationTupleElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Operation Tuple Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Operation Tuple Element</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getLinkOperationTuple_LinkOperationTupleElement()
	 * @model type="alfDsl.LinkOperationTupleElement" containment="true"
	 * @generated
	 */
	EList getLinkOperationTupleElement();

} // LinkOperationTuple
