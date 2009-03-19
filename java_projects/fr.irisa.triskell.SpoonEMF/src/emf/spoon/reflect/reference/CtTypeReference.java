/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTypeReference.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import emf.spoon.reflect.declaration.CtSimpleType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.CtTypeReference#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtTypeReference#getPackage <em>Package</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtTypeReference#getActualClass <em>Actual Class</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtTypeReference#getPrimitif <em>Primitif</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtTypeReference#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtTypeReference()
 * @model
 * @generated
 */
public interface CtTypeReference<T> extends CtGenericElementReference, CtReference, spoon.reflect.reference.CtTypeReference<T> {
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
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtTypeReference_DeclaringType()
	 * @model
	 * @generated
	 */
	CtTypeReference getDeclaringType();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtTypeReference#getDeclaringType <em>Declaring Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Type</em>' reference.
	 * @see #getDeclaringType()
	 * @generated
	 */
	void setDeclaringType(CtTypeReference value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(CtPackageReference)
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtTypeReference_Package()
	 * @model
	 * @generated
	 */
	CtPackageReference getPackage();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtTypeReference#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(CtPackageReference value);

	/**
	 * Returns the value of the '<em><b>Actual Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Class</em>' attribute.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtTypeReference_ActualClass()
	 * @model dataType="emf.spoon.Class" changeable="false"
	 * @generated
	 */
	Class getActualClass();

	/**
	 * Returns the value of the '<em><b>Primitif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitif</em>' attribute.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtTypeReference_Primitif()
	 * @model dataType="emf.spoon.Boolean" changeable="false"
	 * @generated
	 */
	Boolean getPrimitif();

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtTypeReference_QualifiedName()
	 * @model dataType="emf.spoon.String" changeable="false"
	 * @generated
	 */
	String getQualifiedName();
	
	CtSimpleType getDeclaration();

} // CtTypeReference