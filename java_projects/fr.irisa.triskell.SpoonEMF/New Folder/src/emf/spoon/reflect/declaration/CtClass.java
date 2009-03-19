/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtClass.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import java.util.List;

import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtClass#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtClass#getAnonymousExecutables <em>Anonymous Executables</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtClass#getConstructors <em>Constructors</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtClass()
 * @model
 * @generated
 */
public interface CtClass extends CtType, spoon.reflect.declaration.CtClass {
	/**
	 * Returns the value of the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclass</em>' reference.
	 * @see #setSuperclass(CtTypeReference)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtClass_Superclass()
	 * @model
	 * @generated
	 */
	CtTypeReference getSuperclass();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtClass#getSuperclass <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superclass</em>' reference.
	 * @see #getSuperclass()
	 * @generated
	 */
	void setSuperclass(CtTypeReference value);

	/**
	 * Returns the value of the '<em><b>Anonymous Executables</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtAnonymousExecutable}.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtAnonymousExecutable#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Executables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Executables</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtClass_AnonymousExecutables()
	 * @see emf.spoon.reflect.declaration.CtAnonymousExecutable#getOwnerClass
	 * @model type="emf.spoon.reflect.declaration.CtAnonymousExecutable" opposite="OwnerClass"
	 * @generated
	 */
	List getAnonymousExecutables();

	/**
	 * Returns the value of the '<em><b>Constructors</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtConstructor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructors</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtClass_Constructors()
	 * @model type="emf.spoon.reflect.declaration.CtConstructor"
	 * @generated
	 */
	EmfSet getConstructors();
	
	CtTypeReference getReference();

} // CtClass