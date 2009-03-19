/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTargetedExpression.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Targeted Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtTargetedExpression#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtTargetedExpression()
 * @model
 * @generated
 */
public interface CtTargetedExpression extends CtExpression, spoon.reflect.code.CtTargetedExpression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtTargetedExpression_Target()
	 * @model
	 * @generated
	 */
	CtExpression getTarget();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtTargetedExpression#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CtExpression value);

} // CtTargetedExpression