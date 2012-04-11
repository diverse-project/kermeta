/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Expansion Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.SequenceExpansionExpression#getName <em>Name</em>}</li>
 *   <li>{@link alfDsl.SequenceExpansionExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link alfDsl.SequenceExpansionExpression#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getSequenceExpansionExpression()
 * @model
 * @generated
 */
public interface SequenceExpansionExpression extends SuffixExpression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alfDsl.AlfDslPackage#getSequenceExpansionExpression_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceExpansionExpression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see alfDsl.AlfDslPackage#getSequenceExpansionExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceExpansionExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference.
	 * @see #setSuffix(SuffixExpression)
	 * @see alfDsl.AlfDslPackage#getSequenceExpansionExpression_Suffix()
	 * @model containment="true"
	 * @generated
	 */
	SuffixExpression getSuffix();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceExpansionExpression#getSuffix <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' containment reference.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(SuffixExpression value);

} // SequenceExpansionExpression
