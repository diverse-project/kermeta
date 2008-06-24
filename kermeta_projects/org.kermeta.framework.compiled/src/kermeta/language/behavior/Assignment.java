/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Assignment.java,v 1.1 2008-06-24 14:23:29 cfaucher Exp $
 */
package kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Assignment#getValue <em>Value</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getTarget <em>Target</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#isIsCast <em>Is Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getAssignment()
 * @model annotation="kermeta documentation='Assignment is the model-element representation of the assignment statement <code>x := y</code>\n<img alt=\"\" src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_assign_expressions.png\"/>'"
 * @generated
 */
public interface Assignment extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see kermeta.language.behavior.BehaviorPackage#getAssignment_Value()
   * @model containment="true" required="true"
   *        annotation="kermeta documentation='Value to be assigned, as a KerMeta expression'"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link kermeta.language.behavior.Assignment#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(CallExpression)
   * @see kermeta.language.behavior.BehaviorPackage#getAssignment_Target()
   * @model containment="true" required="true"
   *        annotation="kermeta documentation='Target of the assignment, as a CallExpression'"
   * @generated
   */
  CallExpression getTarget();

  /**
   * Sets the value of the '{@link kermeta.language.behavior.Assignment#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(CallExpression value);

  /**
   * Returns the value of the '<em><b>Is Cast</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Cast</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Cast</em>' attribute.
   * @see #setIsCast(boolean)
   * @see kermeta.language.behavior.BehaviorPackage#getAssignment_IsCast()
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='Boolean stating whether current assignment corresponds to a cast operation '"
   * @generated
   */
  boolean isIsCast();

  /**
   * Sets the value of the '{@link kermeta.language.behavior.Assignment#isIsCast <em>Is Cast</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Cast</em>' attribute.
   * @see #isIsCast()
   * @generated
   */
  void setIsCast(boolean value);

} // Assignment
