/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtReturn.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtReturn#getReturnedExpression <em>Returned Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtReturn()
 * @model
 * @generated
 */
public interface CtReturn extends CtCFlowBreak, spoon.reflect.code.CtReturn {
	/**
	 * Returns the value of the '<em><b>Returned Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returned Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returned Expression</em>' reference.
	 * @see #setReturnedExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtReturn_ReturnedExpression()
	 * @model
	 * @generated
	 */
	CtExpression getReturnedExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtReturn#getReturnedExpression <em>Returned Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned Expression</em>' reference.
	 * @see #getReturnedExpression()
	 * @generated
	 */
	void setReturnedExpression(CtExpression value);

} // CtReturn