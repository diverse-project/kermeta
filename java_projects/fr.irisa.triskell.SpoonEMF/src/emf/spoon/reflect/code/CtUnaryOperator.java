/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtUnaryOperator.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import spoon.reflect.code.UnaryOperatorKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtUnaryOperator#getOperand <em>Operand</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtUnaryOperator#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtUnaryOperator()
 * @model
 * @generated
 */
public interface CtUnaryOperator extends CtExpression, CtStatement, spoon.reflect.code.CtUnaryOperator {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtUnaryOperator_Operand()
	 * @model
	 * @generated
	 */
	CtExpression getOperand();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtUnaryOperator#getOperand <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(CtExpression value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(UnaryOperatorKind)
	 * @see emf.spoon.reflect.code.CodePackage#getCtUnaryOperator_Kind()
	 * @model dataType="emf.spoon.UnaryOperatorKind"
	 * @generated
	 */
	UnaryOperatorKind getKind();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtUnaryOperator#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(UnaryOperatorKind value);

} // CtUnaryOperator