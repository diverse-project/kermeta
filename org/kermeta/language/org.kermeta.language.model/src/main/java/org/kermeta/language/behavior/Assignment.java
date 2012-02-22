/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Assignment is the model-element representation of the assignment statement <code>x := y</code>
 * <img alt="" src="http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_assign_expressions.png"/>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.Assignment#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.Assignment#getValue <em>Value</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.Assignment#getIsCast <em>Is Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Expression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target of the assignment, as a CallExpression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(CallExpression)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getAssignment_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CallExpression getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.Assignment#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CallExpression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value to be assigned, as a KerMeta expression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getAssignment_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.Assignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Cast</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating whether current assignment corresponds to a cast operation 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Cast</em>' attribute.
	 * @see #setIsCast(Boolean)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getAssignment_IsCast()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsCast();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.Assignment#getIsCast <em>Is Cast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cast</em>' attribute.
	 * @see #getIsCast()
	 * @generated
	 */
	void setIsCast(Boolean value);

} // Assignment
