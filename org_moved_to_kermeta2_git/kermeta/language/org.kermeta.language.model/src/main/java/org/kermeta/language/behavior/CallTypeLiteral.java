/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This expression is a literal representing a Type.
 * for example, in 
 *    Integer.new
 * Integer is a type literal representing the type kermeta::standard::Integer
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.CallTypeLiteral#getTyperef <em>Typeref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getCallTypeLiteral()
 * @model
 * @generated
 */
public interface CallTypeLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Typeref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type refered by this literal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typeref</em>' containment reference.
	 * @see #setTyperef(TypeReference)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getCallTypeLiteral_Typeref()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeReference getTyperef();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.CallTypeLiteral#getTyperef <em>Typeref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeref</em>' containment reference.
	 * @see #getTyperef()
	 * @generated
	 */
	void setTyperef(TypeReference value);

} // CallTypeLiteral
