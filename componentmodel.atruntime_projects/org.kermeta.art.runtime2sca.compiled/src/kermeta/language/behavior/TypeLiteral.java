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
 * A representation of the model object '<em><b>Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.TypeLiteral#getTyperef <em>Typeref</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getTypeLiteral()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='This expression is a literal representing a Type.\nfor example, in \n   Integer.new\nInteger is a type literal representing the type kermeta::standard::Integer'"
 * @generated
 */
public interface TypeLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Typeref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeref</em>' containment reference.
	 * @see #setTyperef(TypeReference)
	 * @see kermeta.language.behavior.BehaviorPackage#getTypeLiteral_Typeref()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='The type refered by this literal'"
	 * @generated
	 */
	TypeReference getTyperef();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.TypeLiteral#getTyperef <em>Typeref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeref</em>' containment reference.
	 * @see #getTyperef()
	 * @generated
	 */
	void setTyperef(TypeReference value);

} // TypeLiteral
