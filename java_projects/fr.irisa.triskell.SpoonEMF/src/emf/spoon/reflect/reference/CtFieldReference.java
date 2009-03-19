/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtFieldReference.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import java.lang.reflect.Field;

import emf.spoon.reflect.declaration.CtField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Field Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.CtFieldReference#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtFieldReference#getFinal <em>Final</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtFieldReference#getStatic <em>Static</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtFieldReference#getActualField <em>Actual Field</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtFieldReference#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtFieldReference()
 * @model
 * @generated
 */
public interface CtFieldReference extends CtVariableReference, spoon.reflect.reference.CtFieldReference {
	/**
	 * Returns the value of the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaring Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Type</em>' reference.
	 * @see #setDeclaringType(CtTypeReference)
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtFieldReference_DeclaringType()
	 * @model
	 * @generated
	 */
	CtTypeReference getDeclaringType();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtFieldReference#getDeclaringType <em>Declaring Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Type</em>' reference.
	 * @see #getDeclaringType()
	 * @generated
	 */
	void setDeclaringType(CtTypeReference value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(Boolean)
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtFieldReference_Final()
	 * @model dataType="emf.spoon.Boolean"
	 * @generated
	 */
	Boolean getFinal();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtFieldReference#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Boolean value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(Boolean)
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtFieldReference_Static()
	 * @model dataType="emf.spoon.Boolean"
	 * @generated
	 */
	Boolean getStatic();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtFieldReference#getStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #getStatic()
	 * @generated
	 */
	void setStatic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Actual Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Field</em>' attribute.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtFieldReference_ActualField()
	 * @model dataType="emf.spoon.Field" changeable="false"
	 * @generated
	 */
	Field getActualField();

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtFieldReference_QualifiedName()
	 * @model dataType="emf.spoon.String" changeable="false"
	 * @generated
	 */
	String getQualifiedName();
	
	CtField getDeclaration();
	

} // CtFieldReference