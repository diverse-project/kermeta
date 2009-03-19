/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtVariable.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.reference.CtVariableReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtVariable#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtVariable()
 * @model
 * @generated
 */
public interface CtVariable extends CtNamedElement, CtTypedElement, spoon.reflect.declaration.CtVariable {
	/**
	 * Returns the value of the '<em><b>Default Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Expression</em>' reference.
	 * @see #setDefaultExpression(CtExpression)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtVariable_DefaultExpression()
	 * @model
	 * @generated
	 */
	CtExpression getDefaultExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtVariable#getDefaultExpression <em>Default Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Expression</em>' reference.
	 * @see #getDefaultExpression()
	 * @generated
	 */
	void setDefaultExpression(CtExpression value);
	

	
	CtVariableReference getReference();

} // CtVariable