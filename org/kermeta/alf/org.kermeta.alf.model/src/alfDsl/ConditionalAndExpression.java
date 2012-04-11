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
 * A representation of the model object '<em><b>Conditional And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.ConditionalAndExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getConditionalAndExpression()
 * @model
 * @generated
 */
public interface ConditionalAndExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.InclusiveOrExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getConditionalAndExpression_Exp()
	 * @model type="alfDsl.InclusiveOrExpression" containment="true"
	 * @generated
	 */
	EList getExp();

} // ConditionalAndExpression
