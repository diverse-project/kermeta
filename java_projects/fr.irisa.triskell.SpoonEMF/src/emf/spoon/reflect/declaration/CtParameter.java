/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtParameter.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import emf.spoon.reflect.reference.CtParameterReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtParameter#getVarArgs <em>Var Args</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtParameter#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtParameter()
 * @model
 * @generated
 */
public interface CtParameter extends CtNamedElement, CtVariable, spoon.reflect.declaration.CtParameter {
	/**
	 * Returns the value of the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Args</em>' attribute.
	 * @see #setVarArgs(Boolean)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtParameter_VarArgs()
	 * @model dataType="emf.spoon.Boolean"
	 * @generated
	 */
	Boolean getVarArgs();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtParameter#getVarArgs <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Args</em>' attribute.
	 * @see #getVarArgs()
	 * @generated
	 */
	void setVarArgs(Boolean value);


	CtParameterReference getReference();

} // CtParameter