/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtConditional.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtConditional#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtConditional#getCondition <em>Condition</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtConditional#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtConditional()
 * @model
 * @generated
 */
public interface CtConditional extends CtExpression, spoon.reflect.code.CtConditional {
	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' reference.
	 * @see #setElseExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtConditional_ElseExpression()
	 * @model
	 * @generated
	 */
	CtExpression getElseExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtConditional#getElseExpression <em>Else Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(CtExpression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtConditional_Condition()
	 * @model
	 * @generated
	 */
	CtExpression getCondition();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtConditional#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(CtExpression value);

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' reference.
	 * @see #setThenExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtConditional_ThenExpression()
	 * @model
	 * @generated
	 */
	CtExpression getThenExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtConditional#getThenExpression <em>Then Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(CtExpression value);

} // CtConditional