/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtThrow.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Throw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtThrow#getThrownExpression <em>Thrown Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtThrow()
 * @model
 * @generated
 */
public interface CtThrow extends CtCFlowBreak, spoon.reflect.code.CtThrow {
	/**
	 * Returns the value of the '<em><b>Thrown Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thrown Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Expression</em>' reference.
	 * @see #setThrownExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtThrow_ThrownExpression()
	 * @model
	 * @generated
	 */
	CtExpression getThrownExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtThrow#getThrownExpression <em>Thrown Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrown Expression</em>' reference.
	 * @see #getThrownExpression()
	 * @generated
	 */
	void setThrownExpression(CtExpression value);

} // CtThrow