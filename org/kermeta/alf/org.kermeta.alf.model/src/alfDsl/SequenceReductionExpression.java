/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Reduction Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.SequenceReductionExpression#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link alfDsl.SequenceReductionExpression#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link alfDsl.SequenceReductionExpression#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getSequenceReductionExpression()
 * @model
 * @generated
 */
public interface SequenceReductionExpression extends SuffixExpression {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see alfDsl.AlfDslPackage#getSequenceReductionExpression_IsOrdered()
	 * @model
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceReductionExpression#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(QualifiedNameWithBinding)
	 * @see alfDsl.AlfDslPackage#getSequenceReductionExpression_Behavior()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedNameWithBinding getBehavior();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceReductionExpression#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(QualifiedNameWithBinding value);

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
	 * @see alfDsl.AlfDslPackage#getSequenceReductionExpression_Suffix()
	 * @model containment="true"
	 * @generated
	 */
	SuffixExpression getSuffix();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceReductionExpression#getSuffix <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' containment reference.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(SuffixExpression value);

} // SequenceReductionExpression
