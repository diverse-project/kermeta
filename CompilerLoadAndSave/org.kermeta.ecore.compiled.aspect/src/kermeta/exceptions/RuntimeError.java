/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuntimeError.java,v 1.1 2008-07-02 09:43:48 ftanguy Exp $
 */
package kermeta.exceptions;

import kermeta.language.behavior.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.exceptions.RuntimeError#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.exceptions.ExceptionsPackage#getRuntimeError()
 * @model annotation="kermeta documentation='/** Exception for interpreter exceptions \052/'"
 * @generated
 */
public interface RuntimeError extends kermeta.exceptions.Exception {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see kermeta.exceptions.ExceptionsPackage#getRuntimeError_Expression()
	 * @model containment="true"
	 *        annotation="kermeta documentation='/** The code that raised the exception \052/'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link kermeta.exceptions.RuntimeError#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // RuntimeError
