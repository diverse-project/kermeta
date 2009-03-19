/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtBinaryOperator.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import spoon.reflect.code.BinaryOperatorKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtBinaryOperator#getKind <em>Kind</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtBinaryOperator#getRightHandOperand <em>Right Hand Operand</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtBinaryOperator#getLeftHandOperand <em>Left Hand Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtBinaryOperator()
 * @model
 * @generated
 */
public interface CtBinaryOperator extends CtExpression, spoon.reflect.code.CtBinaryOperator {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(BinaryOperatorKind)
	 * @see emf.spoon.reflect.code.CodePackage#getCtBinaryOperator_Kind()
	 * @model dataType="emf.spoon.BinaryOperatorKind"
	 * @generated
	 */
	BinaryOperatorKind getKind();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtBinaryOperator#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BinaryOperatorKind value);

	/**
	 * Returns the value of the '<em><b>Right Hand Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Operand</em>' reference.
	 * @see #setRightHandOperand(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtBinaryOperator_RightHandOperand()
	 * @model
	 * @generated
	 */
	CtExpression getRightHandOperand();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtBinaryOperator#getRightHandOperand <em>Right Hand Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Operand</em>' reference.
	 * @see #getRightHandOperand()
	 * @generated
	 */
	void setRightHandOperand(CtExpression value);

	/**
	 * Returns the value of the '<em><b>Left Hand Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hand Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Operand</em>' reference.
	 * @see #setLeftHandOperand(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtBinaryOperator_LeftHandOperand()
	 * @model
	 * @generated
	 */
	CtExpression getLeftHandOperand();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtBinaryOperator#getLeftHandOperand <em>Left Hand Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Hand Operand</em>' reference.
	 * @see #getLeftHandOperand()
	 * @generated
	 */
	void setLeftHandOperand(CtExpression value);

} // CtBinaryOperator