/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtSimpleType.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtSimpleType#getINNERTTYPE_SEPARATOR <em>INNERTTYPE SEPARATOR</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtSimpleType#getFields <em>Fields</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtSimpleType#getNestedTypes <em>Nested Types</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtSimpleType#getActualClass <em>Actual Class</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtSimpleType#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtSimpleType#getAllFields <em>All Fields</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtSimpleType#getTopLevel <em>Top Level</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtSimpleType#getPackage <em>Package</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtSimpleType#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtSimpleType()
 * @model
 * @generated
 */
public interface CtSimpleType extends CtNamedElement, spoon.reflect.declaration.CtSimpleType {
	/**
	 * Returns the value of the '<em><b>INNERTTYPE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INNERTTYPE SEPARATOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INNERTTYPE SEPARATOR</em>' attribute.
	 * @see #setINNERTTYPE_SEPARATOR(String)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtSimpleType_INNERTTYPE_SEPARATOR()
	 * @model dataType="emf.spoon.String"
	 *        annotation="SpoonGenerics type='java.lang.String'"
	 * @generated
	 */
	String getINNERTTYPE_SEPARATOR();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtSimpleType#getINNERTTYPE_SEPARATOR <em>INNERTTYPE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INNERTTYPE SEPARATOR</em>' attribute.
	 * @see #getINNERTTYPE_SEPARATOR()
	 * @generated
	 */
	void setINNERTTYPE_SEPARATOR(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtField}.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtField#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtSimpleType_Fields()
	 * @see emf.spoon.reflect.declaration.CtField#getDeclaringType
	 * @model type="emf.spoon.reflect.declaration.CtField" opposite="DeclaringType"
	 * @generated
	 */
	EmfSet getFields();

	/**
	 * Returns the value of the '<em><b>Nested Types</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtSimpleType}.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtSimpleType#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Types</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtSimpleType_NestedTypes()
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getDeclaringType
	 * @model type="emf.spoon.reflect.declaration.CtSimpleType" opposite="DeclaringType"
	 * @generated
	 */
	EmfSet getNestedTypes();

	/**
	 * Returns the value of the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Class</em>' attribute.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtSimpleType_ActualClass()
	 * @model dataType="emf.spoon.Class" changeable="false"
	 * @generated
	 */
	Class getActualClass();

	/**
	 * Returns the value of the '<em><b>Declaring Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtSimpleType#getNestedTypes <em>Nested Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaring Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Type</em>' reference.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtSimpleType_DeclaringType()
	 * @see emf.spoon.reflect.declaration.CtSimpleType#getNestedTypes
	 * @model opposite="NestedTypes" changeable="false"
	 * @generated
	 */
	CtSimpleType getDeclaringType();

	/**
	 * Returns the value of the '<em><b>All Fields</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtField}.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtField#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Fields</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtSimpleType_AllFields()
	 * @see emf.spoon.reflect.declaration.CtField#getDeclaringType
	 * @model type="emf.spoon.reflect.declaration.CtField" opposite="DeclaringType" changeable="false"
	 * @generated
	 */
	EmfSet getAllFields();

	/**
	 * Returns the value of the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Level</em>' attribute.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtSimpleType_TopLevel()
	 * @model dataType="emf.spoon.Boolean" changeable="false"
	 * @generated
	 */
	Boolean getTopLevel();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtPackage#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtSimpleType_Package()
	 * @see emf.spoon.reflect.declaration.CtPackage#getTypes
	 * @model opposite="Types" changeable="false"
	 * @generated
	 */
	CtPackage getPackage();

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtSimpleType_QualifiedName()
	 * @model dataType="emf.spoon.String" changeable="false"
	 * @generated
	 */
	String getQualifiedName();
	 
	CtTypeReference getReference();

} // CtSimpleType