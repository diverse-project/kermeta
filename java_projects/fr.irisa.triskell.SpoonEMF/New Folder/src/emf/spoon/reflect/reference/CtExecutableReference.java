/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtExecutableReference.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

import emf.spoon.reflect.declaration.CtExecutable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Executable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.CtExecutableReference#getType <em>Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtExecutableReference#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtExecutableReference#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtExecutableReference#getStatic <em>Static</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtExecutableReference#getActualConstructor <em>Actual Constructor</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtExecutableReference#getActualMethod <em>Actual Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtExecutableReference()
 * @model
 * @generated
 */
public interface CtExecutableReference extends CtGenericElementReference, CtReference, spoon.reflect.reference.CtExecutableReference {
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
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtExecutableReference_Type()
	 * @model
	 * @generated
	 */
	CtTypeReference getType();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtExecutableReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CtTypeReference value);

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
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtExecutableReference_DeclaringType()
	 * @model
	 * @generated
	 */
	CtTypeReference getDeclaringType();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtExecutableReference#getDeclaringType <em>Declaring Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Type</em>' reference.
	 * @see #getDeclaringType()
	 * @generated
	 */
	void setDeclaringType(CtTypeReference value);

	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.reference.CtTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' reference list.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtExecutableReference_ParameterTypes()
	 * @model type="emf.spoon.reflect.reference.CtTypeReference"
	 * @generated
	 */
	List getParameterTypes();

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
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtExecutableReference_Static()
	 * @model dataType="emf.spoon.Boolean"
	 * @generated
	 */
	Boolean getStatic();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtExecutableReference#getStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #getStatic()
	 * @generated
	 */
	void setStatic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Actual Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Constructor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Constructor</em>' attribute.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtExecutableReference_ActualConstructor()
	 * @model dataType="emf.spoon.Constructor" changeable="false"
	 * @generated
	 */
	Constructor getActualConstructor();

	/**
	 * Returns the value of the '<em><b>Actual Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Method</em>' attribute.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtExecutableReference_ActualMethod()
	 * @model dataType="emf.spoon.Method" changeable="false"
	 * @generated
	 */
	Method getActualMethod();
	
	CtExecutable getDeclaration();

} // CtExecutableReference