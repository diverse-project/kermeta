/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.StringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getStringLiteral()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='This expression is a literal representing a String value, typically : \"my string\"'"
 * @generated
 */
public interface StringLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getStringLiteral_Value()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='The concrete value represented by this literal'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.StringLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringLiteral
