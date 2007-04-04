/**
 * <copyright>
 * </copyright>
 *
 * $Id: NestedExpression.java,v 1.1 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.NestedExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getNestedExpression()
 * @model abstract="true"
 * @generated
 */
public interface NestedExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(SimpleExpression)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getNestedExpression_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleExpression getExpression();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.NestedExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(SimpleExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean evaluateIn(Unit unit, boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean evaluateOut(Unit unit, boolean value);

} // NestedExpression