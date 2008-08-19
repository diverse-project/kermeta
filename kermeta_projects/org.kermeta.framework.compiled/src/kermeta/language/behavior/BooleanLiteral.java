/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanLiteral.java,v 1.2 2008-08-19 13:22:59 cfaucher Exp $
 */
package kermeta.language.behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.BooleanLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getBooleanLiteral()
 * @model annotation="kermeta documentation='This expression is a literal representing a Boolean value, typically : true or false keyword'"
 * @generated
 */
public interface BooleanLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Boolean)
	 * @see kermeta.language.behavior.BehaviorPackage#getBooleanLiteral_Value()
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='The concrete value represented by this literal'"
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.BooleanLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);

} // BooleanLiteral
