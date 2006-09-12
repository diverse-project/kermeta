/**
 * <copyright>
 * </copyright>
 *
 * $Id: Loop.java,v 1.2 2006-09-12 12:59:23 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Loop#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Loop#getBody <em>Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Loop#getStopCondition <em>Stop Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Expression {
	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference.
	 * @see #setInitialization(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLoop_Initialization()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitialization();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.Loop#getInitialization <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' containment reference.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(Expression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLoop_Body()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.Loop#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Stop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Condition</em>' containment reference.
	 * @see #setStopCondition(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLoop_StopCondition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getStopCondition();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.Loop#getStopCondition <em>Stop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Condition</em>' containment reference.
	 * @see #getStopCondition()
	 * @generated
	 */
	void setStopCondition(Expression value);

} // Loop