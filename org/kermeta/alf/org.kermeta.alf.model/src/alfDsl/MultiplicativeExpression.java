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
 * A representation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.MultiplicativeExpression#getExp <em>Exp</em>}</li>
 *   <li>{@link alfDsl.MultiplicativeExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getMultiplicativeExpression()
 * @model
 * @generated
 */
public interface MultiplicativeExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.UnaryExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getMultiplicativeExpression_Exp()
	 * @model type="alfDsl.UnaryExpression" containment="true"
	 * @generated
	 */
	EList getExp();

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute list.
	 * @see alfDsl.AlfDslPackage#getMultiplicativeExpression_Op()
	 * @model unique="false"
	 * @generated
	 */
	EList getOp();

} // MultiplicativeExpression
