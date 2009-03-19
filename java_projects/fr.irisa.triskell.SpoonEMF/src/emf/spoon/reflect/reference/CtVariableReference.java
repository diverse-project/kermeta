/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtVariableReference.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import emf.spoon.reflect.declaration.CtVariable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.CtVariableReference#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtVariableReference()
 * @model
 * @generated
 */
public interface CtVariableReference extends CtReference, spoon.reflect.reference.CtVariableReference {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CtTypeReference)
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtVariableReference_Type()
	 * @model
	 * @generated
	 */
	CtTypeReference getType();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtVariableReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CtTypeReference value);
	
	CtVariable getDeclaration();

} // CtVariableReference