/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtNewClass.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import emf.spoon.reflect.declaration.CtClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct New Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtNewClass#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtNewClass()
 * @model
 * @generated
 */
public interface CtNewClass extends CtAbstractInvocation, CtExpression, CtStatement, spoon.reflect.code.CtNewClass {
	/**
	 * Returns the value of the '<em><b>Anonymous Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class</em>' reference.
	 * @see #setAnonymousClass(CtClass)
	 * @see emf.spoon.reflect.code.CodePackage#getCtNewClass_AnonymousClass()
	 * @model
	 * @generated
	 */
	CtClass getAnonymousClass();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtNewClass#getAnonymousClass <em>Anonymous Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Class</em>' reference.
	 * @see #getAnonymousClass()
	 * @generated
	 */
	void setAnonymousClass(CtClass value);

} // CtNewClass