/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAbstractInvocation.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import java.util.List;

import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.reference.CtExecutableReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Abstract Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtAbstractInvocation#getExecutable <em>Executable</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtAbstractInvocation#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtAbstractInvocation()
 * @model
 * @generated
 */
public interface CtAbstractInvocation extends CtElement, spoon.reflect.code.CtAbstractInvocation {
	/**
	 * Returns the value of the '<em><b>Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' reference.
	 * @see #setExecutable(CtExecutableReference)
	 * @see emf.spoon.reflect.code.CodePackage#getCtAbstractInvocation_Executable()
	 * @model
	 * @generated
	 */
	CtExecutableReference getExecutable();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtAbstractInvocation#getExecutable <em>Executable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' reference.
	 * @see #getExecutable()
	 * @generated
	 */
	void setExecutable(CtExecutableReference value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.code.CtExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see emf.spoon.reflect.code.CodePackage#getCtAbstractInvocation_Arguments()
	 * @model type="emf.spoon.reflect.code.CtExpression"
	 * @generated
	 */
	List getArguments();

} // CtAbstractInvocation