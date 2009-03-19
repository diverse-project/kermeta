/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtField.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import emf.spoon.reflect.reference.CtFieldReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtField#getFIELD_SEPARATOR <em>FIELD SEPARATOR</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtField#getDeclaringType <em>Declaring Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtField()
 * @model
 * @generated
 */
public interface CtField extends CtNamedElement, CtVariable, spoon.reflect.declaration.CtField {
	/**
	 * Returns the value of the '<em><b>FIELD SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FIELD SEPARATOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FIELD SEPARATOR</em>' attribute.
	 * @see #setFIELD_SEPARATOR(String)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtField_FIELD_SEPARATOR()
	 * @model dataType="emf.spoon.String"
	 *        annotation="SpoonGenerics type='java.lang.String'"
	 * @generated
	 */
	String getFIELD_SEPARATOR();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtField#getFIELD_SEPARATOR <em>FIELD SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FIELD SEPARATOR</em>' attribute.
	 * @see #getFIELD_SEPARATOR()
	 * @generated
	 */
	void setFIELD_SEPARATOR(String value);

	/**
	 * Returns the value of the '<em><b>Declaring Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtSimpleType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaring Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Type</em>' reference.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtField_DeclaringType()
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getFields
	 * @model opposite="Fields" changeable="false"
	 * @generated
	 */
	CtSimpleType getDeclaringType();
	
	CtFieldReference getReference();

} // CtField