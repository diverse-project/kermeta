/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Invocation Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.SuperInvocationStatement#get_super <em>super</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getSuperInvocationStatement()
 * @model
 * @generated
 */
public interface SuperInvocationStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>super</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>super</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>super</em>' containment reference.
	 * @see #set_super(SuperInvocationExpression)
	 * @see alfDsl.AlfDslPackage#getSuperInvocationStatement__super()
	 * @model containment="true"
	 * @generated
	 */
	SuperInvocationExpression get_super();

	/**
	 * Sets the value of the '{@link alfDsl.SuperInvocationStatement#get_super <em>super</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>super</em>' containment reference.
	 * @see #get_super()
	 * @generated
	 */
	void set_super(SuperInvocationExpression value);

} // SuperInvocationStatement
