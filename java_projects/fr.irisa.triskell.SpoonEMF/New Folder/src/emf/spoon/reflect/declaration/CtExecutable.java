/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtExecutable.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import java.util.List;

import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.code.CtBlock;
import emf.spoon.reflect.reference.CtExecutableReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Executable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtExecutable#getEXECUTABLE_SEPARATOR <em>EXECUTABLE SEPARATOR</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtExecutable#getParameters <em>Parameters</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtExecutable#getBody <em>Body</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtExecutable#getThrownTypes <em>Thrown Types</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtExecutable#getDeclaringType <em>Declaring Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtExecutable()
 * @model
 * @generated
 */
public interface CtExecutable<T> extends CtGenericElement, CtNamedElement, spoon.reflect.declaration.CtExecutable<T> {
	/**
	 * Returns the value of the '<em><b>EXECUTABLE SEPARATOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EXECUTABLE SEPARATOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EXECUTABLE SEPARATOR</em>' attribute.
	 * @see #setEXECUTABLE_SEPARATOR(String)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtExecutable_EXECUTABLE_SEPARATOR()
	 * @model dataType="emf.spoon.String"
	 *        annotation="SpoonGenerics type='java.lang.String'"
	 * @generated
	 */
	String getEXECUTABLE_SEPARATOR();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtExecutable#getEXECUTABLE_SEPARATOR <em>EXECUTABLE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EXECUTABLE SEPARATOR</em>' attribute.
	 * @see #getEXECUTABLE_SEPARATOR()
	 * @generated
	 */
	void setEXECUTABLE_SEPARATOR(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtParameter}.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtParameter#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtExecutable_Parameters()
	 * @see emf.spoon.reflect.declaration.CtParameter#getParent
	 * @model type="emf.spoon.reflect.declaration.CtParameter" opposite="Parent"
	 * @generated
	 */
	List getParameters();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(CtBlock)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtExecutable_Body()
	 * @model
	 * @generated
	 */
	CtBlock getBody();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtExecutable#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(CtBlock value);

	/**
	 * Returns the value of the '<em><b>Thrown Types</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.reference.CtTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thrown Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Types</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtExecutable_ThrownTypes()
	 * @model type="emf.spoon.reflect.reference.CtTypeReference"
	 * @generated
	 */
	EmfSet getThrownTypes();

	/**
	 * Returns the value of the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaring Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Type</em>' reference.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtExecutable_DeclaringType()
	 * @model changeable="false"
	 * @generated
	 */
	CtType getDeclaringType();
	
	CtExecutableReference getReference();
} // CtExecutable