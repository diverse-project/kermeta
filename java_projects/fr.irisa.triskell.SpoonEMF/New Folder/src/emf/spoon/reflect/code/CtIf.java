/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtIf.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtIf#getThenStatement <em>Then Statement</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtIf#getCondition <em>Condition</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtIf#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtIf()
 * @model
 * @generated
 */
public interface CtIf extends CtStatement, spoon.reflect.code.CtIf {
	/**
	 * Returns the value of the '<em><b>Then Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Statement</em>' reference.
	 * @see #setThenStatement(CtStatement)
	 * @see emf.spoon.reflect.code.CodePackage#getCtIf_ThenStatement()
	 * @model
	 * @generated
	 */
	CtStatement getThenStatement();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtIf#getThenStatement <em>Then Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Statement</em>' reference.
	 * @see #getThenStatement()
	 * @generated
	 */
	void setThenStatement(CtStatement value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtIf_Condition()
	 * @model
	 * @generated
	 */
	CtExpression getCondition();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtIf#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(CtExpression value);

	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' reference.
	 * @see #setElseStatement(CtStatement)
	 * @see emf.spoon.reflect.code.CodePackage#getCtIf_ElseStatement()
	 * @model
	 * @generated
	 */
	CtStatement getElseStatement();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtIf#getElseStatement <em>Else Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Statement</em>' reference.
	 * @see #getElseStatement()
	 * @generated
	 */
	void setElseStatement(CtStatement value);

} // CtIf