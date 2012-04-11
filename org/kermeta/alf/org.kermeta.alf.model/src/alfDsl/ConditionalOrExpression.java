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
 * A representation of the model object '<em><b>Conditional Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.ConditionalOrExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getConditionalOrExpression()
 * @model
 * @generated
 */
public interface ConditionalOrExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.ConditionalAndExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getConditionalOrExpression_Exp()
	 * @model type="alfDsl.ConditionalAndExpression" containment="true"
	 * @generated
	 */
	EList getExp();

} // ConditionalOrExpression
