/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtVariableAccess.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import emf.spoon.reflect.reference.CtVariableReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Variable Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtVariableAccess#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtVariableAccess()
 * @model
 * @generated
 */
public interface CtVariableAccess extends CtExpression, spoon.reflect.code.CtVariableAccess {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(CtVariableReference)
	 * @see emf.spoon.reflect.code.CodePackage#getCtVariableAccess_Variable()
	 * @model
	 * @generated
	 */
	CtVariableReference getVariable();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtVariableAccess#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(CtVariableReference value);

} // CtVariableAccess