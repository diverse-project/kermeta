/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtFor.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtFor#getForInit <em>For Init</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtFor#getForUpdate <em>For Update</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtFor#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtFor()
 * @model
 * @generated
 */
public interface CtFor extends CtLoop, spoon.reflect.code.CtFor {
	/**
	 * Returns the value of the '<em><b>For Init</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.code.CtStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Init</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Init</em>' reference list.
	 * @see emf.spoon.reflect.code.CodePackage#getCtFor_ForInit()
	 * @model type="emf.spoon.reflect.code.CtStatement"
	 * @generated
	 */
	List getForInit();

	/**
	 * Returns the value of the '<em><b>For Update</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.code.CtStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Update</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Update</em>' reference list.
	 * @see emf.spoon.reflect.code.CodePackage#getCtFor_ForUpdate()
	 * @model type="emf.spoon.reflect.code.CtStatement"
	 * @generated
	 */
	List getForUpdate();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtFor_Expression()
	 * @model
	 * @generated
	 */
	CtExpression getExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtFor#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(CtExpression value);

} // CtFor