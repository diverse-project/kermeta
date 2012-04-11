/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>This Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.ThisExpression#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getThisExpression()
 * @model
 * @generated
 */
public interface ThisExpression extends ValueSpecification, NonLiteralValueSpecification {
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
	 * @see alfDsl.AlfDslPackage#getThisExpression_Suffix()
	 * @model containment="true"
	 * @generated
	 */
	SuffixExpression getSuffix();

	/**
	 * Sets the value of the '{@link alfDsl.ThisExpression#getSuffix <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' containment reference.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(SuffixExpression value);

} // ThisExpression
