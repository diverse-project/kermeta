/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * We call "CallVariable" the use of a variable in a statement.
 * in <code>i := j + 1</code>, i and j are 2 CallVariables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.CallVariable#getIsAtpre <em>Is Atpre</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getCallVariable()
 * @model
 * @generated
 */
public interface CallVariable extends CallExpression {
	/**
	 * Returns the value of the '<em><b>Is Atpre</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether this CallVariable represents a call to @pre in a postcondition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Atpre</em>' attribute.
	 * @see #setIsAtpre(Boolean)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getCallVariable_IsAtpre()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsAtpre();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.CallVariable#getIsAtpre <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atpre</em>' attribute.
	 * @see #getIsAtpre()
	 * @generated
	 */
	void setIsAtpre(Boolean value);

} // CallVariable
