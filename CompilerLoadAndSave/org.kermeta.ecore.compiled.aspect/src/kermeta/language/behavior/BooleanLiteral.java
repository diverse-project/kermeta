/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanLiteral.java,v 1.1 2008-07-02 09:43:51 ftanguy Exp $
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
 *   <li>{@link kermeta.language.behavior.BooleanLiteral#isValue <em>Value</em>}</li>
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
	 * @see #setValue(boolean)
	 * @see kermeta.language.behavior.BehaviorPackage#getBooleanLiteral_Value()
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='The concrete value represented by this literal'"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.BooleanLiteral#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanLiteral
