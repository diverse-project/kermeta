/**
 * <copyright>
 * </copyright>
 *
 * $Id: Loop.java,v 1.8 2008-03-19 16:34:13 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Loop refers to <code>from var x : X init a until booleanCondition loop ... end</code>
 * <!-- end-model-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initialization expression for the loop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference.
	 * @see #setInitialization(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLoop_Initialization()
	 * @model containment="true" resolveProxies="true"
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
	 * <!-- begin-model-doc -->
	 * Body of the loop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLoop_Body()
	 * @model containment="true" resolveProxies="true"
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
	 * <!-- begin-model-doc -->
	 * Stop condition of the loop, is interpreted as a Bollean value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Condition</em>' containment reference.
	 * @see #setStopCondition(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLoop_StopCondition()
	 * @model containment="true" resolveProxies="true" required="true"
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