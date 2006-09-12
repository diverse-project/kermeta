/**
 * <copyright>
 * </copyright>
 *
 * $Id: Conditional.java,v 1.2 2006-09-12 12:59:23 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Conditional#getThenBody <em>Then Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Conditional#getElseBody <em>Else Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Conditional#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends Expression {
	/**
	 * Returns the value of the '<em><b>Then Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Body</em>' containment reference.
	 * @see #setThenBody(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getConditional_ThenBody()
	 * @model containment="true"
	 * @generated
	 */
	Expression getThenBody();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.Conditional#getThenBody <em>Then Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Body</em>' containment reference.
	 * @see #getThenBody()
	 * @generated
	 */
	void setThenBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Body</em>' containment reference.
	 * @see #setElseBody(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getConditional_ElseBody()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElseBody();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.Conditional#getElseBody <em>Else Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Body</em>' containment reference.
	 * @see #getElseBody()
	 * @generated
	 */
	void setElseBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getConditional_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.Conditional#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // Conditional