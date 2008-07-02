/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Loop.java,v 1.1 2008-07-02 09:13:25 ftanguy Exp $
 */
package kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Loop#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link kermeta.language.behavior.Loop#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.behavior.Loop#getStopCondition <em>Stop Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getLoop()
 * @model annotation="kermeta documentation='Loop refers to <code>from var x : X init a until booleanCondition loop ... end</code>'"
 * @generated
 */
public interface Loop extends Expression
{
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
   * @see kermeta.language.behavior.BehaviorPackage#getLoop_Initialization()
   * @model containment="true"
   * @generated
   */
  Expression getInitialization();

  /**
   * Sets the value of the '{@link kermeta.language.behavior.Loop#getInitialization <em>Initialization</em>}' containment reference.
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
   * @see kermeta.language.behavior.BehaviorPackage#getLoop_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link kermeta.language.behavior.Loop#getBody <em>Body</em>}' containment reference.
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
   * @see kermeta.language.behavior.BehaviorPackage#getLoop_StopCondition()
   * @model containment="true" required="true"
   * @generated
   */
  Expression getStopCondition();

  /**
   * Sets the value of the '{@link kermeta.language.behavior.Loop#getStopCondition <em>Stop Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop Condition</em>' containment reference.
   * @see #getStopCondition()
   * @generated
   */
  void setStopCondition(Expression value);

} // Loop
