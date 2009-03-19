/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtDo.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Do</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtDo#getLoopingExpression <em>Looping Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtDo()
 * @model
 * @generated
 */
public interface CtDo extends CtLoop, spoon.reflect.code.CtDo {
	/**
	 * Returns the value of the '<em><b>Looping Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Looping Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Looping Expression</em>' reference.
	 * @see #setLoopingExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtDo_LoopingExpression()
	 * @model
	 * @generated
	 */
	CtExpression getLoopingExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtDo#getLoopingExpression <em>Looping Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Looping Expression</em>' reference.
	 * @see #getLoopingExpression()
	 * @generated
	 */
	void setLoopingExpression(CtExpression value);

} // CtDo