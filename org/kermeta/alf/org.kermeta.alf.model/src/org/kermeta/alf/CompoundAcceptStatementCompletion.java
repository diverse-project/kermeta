/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Accept Statement Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.CompoundAcceptStatementCompletion#getBlock <em>Block</em>}</li>
 *   <li>{@link org.kermeta.alf.CompoundAcceptStatementCompletion#getAcceptBlock <em>Accept Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getCompoundAcceptStatementCompletion()
 * @model
 * @generated
 */
public interface CompoundAcceptStatementCompletion extends EObject {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see org.kermeta.alf.AlfPackage#getCompoundAcceptStatementCompletion_Block()
	 * @model containment="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link org.kermeta.alf.CompoundAcceptStatementCompletion#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Accept Block</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.alf.AcceptBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Block</em>' containment reference list.
	 * @see org.kermeta.alf.AlfPackage#getCompoundAcceptStatementCompletion_AcceptBlock()
	 * @model type="org.kermeta.alf.AcceptBlock" containment="true"
	 * @generated
	 */
	EList getAcceptBlock();

} // CompoundAcceptStatementCompletion
