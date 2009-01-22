/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntegerLiteral.java,v 1.2 2009-01-22 20:26:53 mclavreu Exp $
 */
package kompose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.IntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see kompose.KomposePackage#getIntegerLiteral_Value()
	 * @model dataType="kompose.Integer"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link kompose.IntegerLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // IntegerLiteral
