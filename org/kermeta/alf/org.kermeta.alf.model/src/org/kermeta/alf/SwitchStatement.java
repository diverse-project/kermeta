/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.SwitchStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.kermeta.alf.SwitchStatement#getSwitchClause <em>Switch Clause</em>}</li>
 *   <li>{@link org.kermeta.alf.SwitchStatement#getDefaultClause <em>Default Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getSwitchStatement()
 * @model
 * @generated
 */
public interface SwitchStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.kermeta.alf.AlfPackage#getSwitchStatement_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.kermeta.alf.SwitchStatement#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Switch Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.alf.SwitchClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Clause</em>' containment reference list.
	 * @see org.kermeta.alf.AlfPackage#getSwitchStatement_SwitchClause()
	 * @model type="org.kermeta.alf.SwitchClause" containment="true"
	 * @generated
	 */
	EList getSwitchClause();

	/**
	 * Returns the value of the '<em><b>Default Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Clause</em>' containment reference.
	 * @see #setDefaultClause(SwitchDefaultClause)
	 * @see org.kermeta.alf.AlfPackage#getSwitchStatement_DefaultClause()
	 * @model containment="true"
	 * @generated
	 */
	SwitchDefaultClause getDefaultClause();

	/**
	 * Sets the value of the '{@link org.kermeta.alf.SwitchStatement#getDefaultClause <em>Default Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Clause</em>' containment reference.
	 * @see #getDefaultClause()
	 * @generated
	 */
	void setDefaultClause(SwitchDefaultClause value);

} // SwitchStatement
