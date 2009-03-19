/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTypeParameterReference.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import java.util.List;

import emf.spoon.reflect.declaration.CtSimpleType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Type Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.CtTypeParameterReference#getUpper <em>Upper</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtTypeParameterReference#getBounds <em>Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtTypeParameterReference()
 * @model
 * @generated
 */
public interface CtTypeParameterReference extends CtTypeReference<Object>, spoon.reflect.reference.CtTypeParameterReference {
	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(Boolean)
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtTypeParameterReference_Upper()
	 * @model dataType="emf.spoon.Boolean"
	 * @generated
	 */
	Boolean getUpper();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtTypeParameterReference#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Boolean value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.reference.CtTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' reference list.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtTypeParameterReference_Bounds()
	 * @model type="emf.spoon.reflect.reference.CtTypeReference"
	 * @generated
	 */
	List getBounds();
	
	CtSimpleType getDeclaration();

} // CtTypeParameterReference