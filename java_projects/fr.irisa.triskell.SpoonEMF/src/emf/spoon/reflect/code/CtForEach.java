/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtForEach.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtForEach#getExpression <em>Expression</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtForEach#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtForEach()
 * @model
 * @generated
 */
public interface CtForEach extends CtLoop, spoon.reflect.code.CtForEach {
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
	 * @see emf.spoon.reflect.code.CodePackage#getCtForEach_Expression()
	 * @model
	 * @generated
	 */
	CtExpression getExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtForEach#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(CtExpression value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(CtLocalVariable)
	 * @see emf.spoon.reflect.code.CodePackage#getCtForEach_Variable()
	 * @model
	 * @generated
	 */
	CtLocalVariable getVariable();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtForEach#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(CtLocalVariable value);

} // CtForEach