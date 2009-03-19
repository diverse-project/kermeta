/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtLiteral.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtLiteral()
 * @model
 * @generated
 */
public interface CtLiteral extends CtExpression, spoon.reflect.code.CtLiteral {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see emf.spoon.reflect.code.CodePackage#getCtLiteral_Value()
	 * @model dataType="emf.spoon.Object"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // CtLiteral