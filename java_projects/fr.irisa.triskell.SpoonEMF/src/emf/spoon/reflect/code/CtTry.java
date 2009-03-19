/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTry.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Try</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtTry#getFinalizer <em>Finalizer</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtTry#getBody <em>Body</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtTry#getCatchers <em>Catchers</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtTry()
 * @model
 * @generated
 */
public interface CtTry extends CtStatement, spoon.reflect.code.CtTry {
	/**
	 * Returns the value of the '<em><b>Finalizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalizer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalizer</em>' reference.
	 * @see #setFinalizer(CtBlock)
	 * @see emf.spoon.reflect.code.CodePackage#getCtTry_Finalizer()
	 * @model
	 * @generated
	 */
	CtBlock getFinalizer();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtTry#getFinalizer <em>Finalizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalizer</em>' reference.
	 * @see #getFinalizer()
	 * @generated
	 */
	void setFinalizer(CtBlock value);

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
	 * @see emf.spoon.reflect.code.CodePackage#getCtTry_Body()
	 * @model
	 * @generated
	 */
	CtBlock getBody();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtTry#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(CtBlock value);

	/**
	 * Returns the value of the '<em><b>Catchers</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.code.CtCatch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catchers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catchers</em>' reference list.
	 * @see emf.spoon.reflect.code.CodePackage#getCtTry_Catchers()
	 * @model type="emf.spoon.reflect.code.CtCatch"
	 * @generated
	 */
	List getCatchers();

} // CtTry