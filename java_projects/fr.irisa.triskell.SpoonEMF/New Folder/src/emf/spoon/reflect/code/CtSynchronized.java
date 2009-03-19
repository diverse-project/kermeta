/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtSynchronized.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Synchronized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtSynchronized#getBlock <em>Block</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtSynchronized#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtSynchronized()
 * @model
 * @generated
 */
public interface CtSynchronized extends CtStatement, spoon.reflect.code.CtSynchronized {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' reference.
	 * @see #setBlock(CtBlock)
	 * @see emf.spoon.reflect.code.CodePackage#getCtSynchronized_Block()
	 * @model
	 * @generated
	 */
	CtBlock getBlock();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtSynchronized#getBlock <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(CtBlock value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtSynchronized_Expression()
	 * @model
	 * @generated
	 */
	CtExpression getExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtSynchronized#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(CtExpression value);

} // CtSynchronized