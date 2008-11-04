/**
 * <copyright>
 * </copyright>
 *
 * $Id: StringLiteral.java,v 1.1.1.1 2008-11-04 08:27:29 mclavreu Exp $
 */
package kompose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.StringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getStringLiteral()
 * @model
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
	 * @see kompose.KomposePackage#getStringLiteral_Value()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link kompose.StringLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringLiteral
