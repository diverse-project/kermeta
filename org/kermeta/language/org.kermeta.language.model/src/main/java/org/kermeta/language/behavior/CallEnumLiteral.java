/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;

import org.kermeta.language.structure.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.CallEnumLiteral#getStaticEnumLiteral <em>Static Enum Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getCallEnumLiteral()
 * @model
 * @generated
 */
public interface CallEnumLiteral extends CallExpression {
	/**
	 * Returns the value of the '<em><b>Static Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Enum Literal</em>' reference.
	 * @see #setStaticEnumLiteral(EnumerationLiteral)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getCallEnumLiteral_StaticEnumLiteral()
	 * @model
	 * @generated
	 */
	EnumerationLiteral getStaticEnumLiteral();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.CallEnumLiteral#getStaticEnumLiteral <em>Static Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Enum Literal</em>' reference.
	 * @see #getStaticEnumLiteral()
	 * @generated
	 */
	void setStaticEnumLiteral(EnumerationLiteral value);

} // CallEnumLiteral
