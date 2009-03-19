/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtCase.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtCase#getCaseExpression <em>Case Expression</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtCase#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtCase()
 * @model
 * @generated
 */
public interface CtCase extends CtStatement, spoon.reflect.code.CtCase {
	/**
	 * Returns the value of the '<em><b>Case Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Expression</em>' reference.
	 * @see #setCaseExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtCase_CaseExpression()
	 * @model
	 * @generated
	 */
	CtExpression getCaseExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtCase#getCaseExpression <em>Case Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Expression</em>' reference.
	 * @see #getCaseExpression()
	 * @generated
	 */
	void setCaseExpression(CtExpression value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.code.CtStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' reference list.
	 * @see emf.spoon.reflect.code.CodePackage#getCtCase_Statements()
	 * @model type="emf.spoon.reflect.code.CtStatement"
	 * @generated
	 */
	List getStatements();

} // CtCase