/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;

import org.kermeta.language.structure.EnumerationLiteral;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CallFeature is the model element that refers to the use of a feature, i.e either 
 * a property or an operation in a statement. In <code>stdio.writeln("hello")</code>, 
 * <code>writeln</code> is a CallFeature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.CallFeature#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.CallFeature#getIsAtpre <em>Is Atpre</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getCallFeature()
 * @model
 * @generated
 */
public interface CallFeature extends CallExpression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target Expression (the owner of the feature)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getCallFeature_Target()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.CallFeature#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Atpre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether this CallFeature represents a call to @pre in a postcondition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Atpre</em>' attribute.
	 * @see #setIsAtpre(Boolean)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getCallFeature_IsAtpre()
	 * @model dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsAtpre();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.CallFeature#getIsAtpre <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atpre</em>' attribute.
	 * @see #getIsAtpre()
	 * @generated
	 */
	void setIsAtpre(Boolean value);

} // CallFeature
