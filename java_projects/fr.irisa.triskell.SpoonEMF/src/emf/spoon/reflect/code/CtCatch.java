/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtCatch.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Catch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtCatch#getBody <em>Body</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtCatch#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtCatch()
 * @model
 * @generated
 */
public interface CtCatch extends CtCodeElement, spoon.reflect.code.CtCatch {
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
	 * @see emf.spoon.reflect.code.CodePackage#getCtCatch_Body()
	 * @model
	 * @generated
	 */
	CtBlock getBody();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtCatch#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(CtBlock value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(CtLocalVariable)
	 * @see emf.spoon.reflect.code.CodePackage#getCtCatch_Parameter()
	 * @model
	 * @generated
	 */
	CtLocalVariable getParameter();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtCatch#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(CtLocalVariable value);

} // CtCatch