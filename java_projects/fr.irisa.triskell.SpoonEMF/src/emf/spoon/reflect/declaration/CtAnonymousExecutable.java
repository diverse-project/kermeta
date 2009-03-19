/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAnonymousExecutable.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import emf.spoon.reflect.code.CtBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Anonymous Executable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtAnonymousExecutable#getBody <em>Body</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtAnonymousExecutable#getOwnerClass <em>Owner Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnonymousExecutable()
 * @model
 * @generated
 */
public interface CtAnonymousExecutable extends CtElement, CtModifiable, spoon.reflect.declaration.CtAnonymousExecutable {
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
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnonymousExecutable_Body()
	 * @model
	 * @generated
	 */
	CtBlock getBody();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtAnonymousExecutable#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(CtBlock value);

	/**
	 * Returns the value of the '<em><b>Owner Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emf.spoon.reflect.declaration.CtClass#getAnonymousExecutables <em>Anonymous Executables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' reference.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnonymousExecutable_OwnerClass()
	 * @see emf.spoon.reflect.declaration.CtClass#getAnonymousExecutables
	 * @model opposite="AnonymousExecutables" changeable="false"
	 * @generated
	 */
	CtClass getOwnerClass();

} // CtAnonymousExecutable