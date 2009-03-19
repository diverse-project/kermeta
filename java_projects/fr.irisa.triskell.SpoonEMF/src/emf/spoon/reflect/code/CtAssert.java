/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAssert.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtAssert#getExpression <em>Expression</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtAssert#getAssertExpression <em>Assert Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtAssert()
 * @model
 * @generated
 */
public interface CtAssert extends CtStatement, spoon.reflect.code.CtAssert {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtAssert_Expression()
	 * @model
	 * @generated
	 */
	CtExpression getExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtAssert#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(CtExpression value);

	/**
	 * Returns the value of the '<em><b>Assert Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assert Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert Expression</em>' reference.
	 * @see #setAssertExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtAssert_AssertExpression()
	 * @model
	 * @generated
	 */
	CtExpression getAssertExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtAssert#getAssertExpression <em>Assert Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert Expression</em>' reference.
	 * @see #getAssertExpression()
	 * @generated
	 */
	void setAssertExpression(CtExpression value);

} // CtAssert