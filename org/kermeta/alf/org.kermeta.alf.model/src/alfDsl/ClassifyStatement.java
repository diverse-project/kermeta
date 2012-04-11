/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classify Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.ClassifyStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link alfDsl.ClassifyStatement#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getClassifyStatement()
 * @model
 * @generated
 */
public interface ClassifyStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see alfDsl.AlfDslPackage#getClassifyStatement_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link alfDsl.ClassifyStatement#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference.
	 * @see #setClause(ClassificationClause)
	 * @see alfDsl.AlfDslPackage#getClassifyStatement_Clause()
	 * @model containment="true"
	 * @generated
	 */
	ClassificationClause getClause();

	/**
	 * Sets the value of the '{@link alfDsl.ClassifyStatement#getClause <em>Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clause</em>' containment reference.
	 * @see #getClause()
	 * @generated
	 */
	void setClause(ClassificationClause value);

} // ClassifyStatement
