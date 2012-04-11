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
 * A representation of the model object '<em><b>For Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.ForControl#getLoopVariableDefinition <em>Loop Variable Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getForControl()
 * @model
 * @generated
 */
public interface ForControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Loop Variable Definition</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.LoopVariableDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Variable Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Variable Definition</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getForControl_LoopVariableDefinition()
	 * @model type="alfDsl.LoopVariableDefinition" containment="true"
	 * @generated
	 */
	EList getLoopVariableDefinition();

} // ForControl
