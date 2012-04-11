/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.IfStatement#getSequentialClausses <em>Sequential Clausses</em>}</li>
 *   <li>{@link alfDsl.IfStatement#getFinalClause <em>Final Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Sequential Clausses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequential Clausses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequential Clausses</em>' containment reference.
	 * @see #setSequentialClausses(SequentialClauses)
	 * @see alfDsl.AlfDslPackage#getIfStatement_SequentialClausses()
	 * @model containment="true"
	 * @generated
	 */
	SequentialClauses getSequentialClausses();

	/**
	 * Sets the value of the '{@link alfDsl.IfStatement#getSequentialClausses <em>Sequential Clausses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequential Clausses</em>' containment reference.
	 * @see #getSequentialClausses()
	 * @generated
	 */
	void setSequentialClausses(SequentialClauses value);

	/**
	 * Returns the value of the '<em><b>Final Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Clause</em>' containment reference.
	 * @see #setFinalClause(FinalClause)
	 * @see alfDsl.AlfDslPackage#getIfStatement_FinalClause()
	 * @model containment="true"
	 * @generated
	 */
	FinalClause getFinalClause();

	/**
	 * Sets the value of the '{@link alfDsl.IfStatement#getFinalClause <em>Final Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Clause</em>' containment reference.
	 * @see #getFinalClause()
	 * @generated
	 */
	void setFinalClause(FinalClause value);

} // IfStatement
