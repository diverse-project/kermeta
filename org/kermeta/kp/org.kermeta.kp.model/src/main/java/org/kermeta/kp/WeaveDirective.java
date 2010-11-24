/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weave Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.WeaveDirective#getMix <em>Mix</em>}</li>
 *   <li>{@link org.kermeta.kp.WeaveDirective#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getWeaveDirective()
 * @model
 * @generated
 */
public interface WeaveDirective extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Mix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mix</em>' containment reference.
	 * @see #setMix(Expression)
	 * @see org.kermeta.kp.KpPackage#getWeaveDirective_Mix()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMix();

	/**
	 * Sets the value of the '{@link org.kermeta.kp.WeaveDirective#getMix <em>Mix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mix</em>' containment reference.
	 * @see #getMix()
	 * @generated
	 */
	void setMix(Expression value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see org.kermeta.kp.KpPackage#getWeaveDirective_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.kp.WeaveDirective#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

} // WeaveDirective
