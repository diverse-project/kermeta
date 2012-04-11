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
 * A representation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.RelationalExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link alfDsl.RelationalExpression#getOp <em>Op</em>}</li>
 *   <li>{@link alfDsl.RelationalExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getRelationalExpression()
 * @model
 * @generated
 */
public interface RelationalExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ShiftExpression)
	 * @see alfDsl.AlfDslPackage#getRelationalExpression_Left()
	 * @model containment="true"
	 * @generated
	 */
	ShiftExpression getLeft();

	/**
	 * Sets the value of the '{@link alfDsl.RelationalExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ShiftExpression value);

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
	 * @see alfDsl.AlfDslPackage#getRelationalExpression_Op()
	 * @model
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link alfDsl.RelationalExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ShiftExpression)
	 * @see alfDsl.AlfDslPackage#getRelationalExpression_Right()
	 * @model containment="true"
	 * @generated
	 */
	ShiftExpression getRight();

	/**
	 * Sets the value of the '{@link alfDsl.RelationalExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ShiftExpression value);

} // RelationalExpression
