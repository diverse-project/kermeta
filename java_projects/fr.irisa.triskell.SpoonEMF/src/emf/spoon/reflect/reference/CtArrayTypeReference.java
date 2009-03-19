/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtArrayTypeReference.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import emf.spoon.reflect.declaration.CtSimpleType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Array Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.CtArrayTypeReference#getComponentType <em>Component Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtArrayTypeReference()
 * @model
 * @generated
 */
public interface CtArrayTypeReference extends CtTypeReference, spoon.reflect.reference.CtArrayTypeReference {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(CtTypeReference)
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtArrayTypeReference_ComponentType()
	 * @model
	 * @generated
	 */
	CtTypeReference getComponentType();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtArrayTypeReference#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(CtTypeReference value);
	
	CtSimpleType getDeclaration();

} // CtArrayTypeReference