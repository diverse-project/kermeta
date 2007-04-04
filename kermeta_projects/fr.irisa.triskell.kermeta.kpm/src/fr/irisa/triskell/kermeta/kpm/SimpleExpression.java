/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleExpression.java,v 1.1 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.SimpleExpression#getSubExpression <em>Sub Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getSimpleExpression()
 * @model abstract="true"
 * @generated
 */
public interface SimpleExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Sub Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Expression</em>' containment reference.
	 * @see #setSubExpression(NestedExpression)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getSimpleExpression_SubExpression()
	 * @model containment="true"
	 * @generated
	 */
	NestedExpression getSubExpression();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.SimpleExpression#getSubExpression <em>Sub Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Expression</em>' containment reference.
	 * @see #getSubExpression()
	 * @generated
	 */
	void setSubExpression(NestedExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean evaluateIn(Unit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean evaluateOut(Unit unit);

} // SimpleExpression