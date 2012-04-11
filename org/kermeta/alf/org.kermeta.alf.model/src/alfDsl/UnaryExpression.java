/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.UnaryExpression#getOp <em>Op</em>}</li>
 *   <li>{@link alfDsl.UnaryExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see alfDsl.AlfDslPackage#getUnaryExpression_Op()
	 * @model
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link alfDsl.UnaryExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(PrimaryExpression)
	 * @see alfDsl.AlfDslPackage#getUnaryExpression_Exp()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryExpression getExp();

	/**
	 * Sets the value of the '{@link alfDsl.UnaryExpression#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(PrimaryExpression value);

} // UnaryExpression
