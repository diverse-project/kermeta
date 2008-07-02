/**
 * <copyright>
 * </copyright>
 *
 * $Id: Block.java,v 1.1 2008-07-02 09:43:51 ftanguy Exp $
 */
package kermeta.language.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Block#getStatement <em>Statement</em>}</li>
 *   <li>{@link kermeta.language.behavior.Block#getRescueBlock <em>Rescue Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getBlock()
 * @model annotation="kermeta documentation='Block is the model-element representation for the <code>do...end</code> block.'"
 * @generated
 */
public interface Block extends Expression {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see kermeta.language.behavior.BehaviorPackage#getBlock_Statement()
	 * @model containment="true"
	 *        annotation="kermeta documentation='List of statements composing the block'"
	 * @generated
	 */
	EList<Expression> getStatement();

	/**
	 * Returns the value of the '<em><b>Rescue Block</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.behavior.Rescue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescue Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescue Block</em>' containment reference list.
	 * @see kermeta.language.behavior.BehaviorPackage#getBlock_RescueBlock()
	 * @model containment="true"
	 *        annotation="kermeta documentation='List of rescues defined for the block'"
	 * @generated
	 */
	EList<Rescue> getRescueBlock();

} // Block
