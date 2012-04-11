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
 * A representation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.AdditiveExpression#getExp <em>Exp</em>}</li>
 *   <li>{@link alfDsl.AdditiveExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getAdditiveExpression()
 * @model
 * @generated
 */
public interface AdditiveExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.MultiplicativeExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getAdditiveExpression_Exp()
	 * @model type="alfDsl.MultiplicativeExpression" containment="true"
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
	 * @see alfDsl.AlfDslPackage#getAdditiveExpression_Op()
	 * @model unique="false"
	 * @generated
	 */
	EList getOp();

} // AdditiveExpression
