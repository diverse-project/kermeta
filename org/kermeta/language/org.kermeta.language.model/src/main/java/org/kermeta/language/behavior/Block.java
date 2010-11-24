/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Block is the model-element representation for the <code>do...end</code> block.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.Block#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.Block#getRescueBlock <em>Rescue Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Expression {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of statements composing the block
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see org.kermeta.language.behavior.BehaviorPackage#getBlock_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getStatement();

	/**
	 * Returns the value of the '<em><b>Rescue Block</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.behavior.Rescue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of rescues defined for the block
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rescue Block</em>' containment reference list.
	 * @see org.kermeta.language.behavior.BehaviorPackage#getBlock_RescueBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rescue> getRescueBlock();

} // Block
