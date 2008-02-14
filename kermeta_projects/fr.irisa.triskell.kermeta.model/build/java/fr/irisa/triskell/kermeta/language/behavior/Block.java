/**
 * <copyright>
 * </copyright>
 *
 * $Id: Block.java,v 1.8 2008-02-14 07:13:03 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Block#getStatement <em>Statement</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Block#getRescueBlock <em>Rescue Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getBlock()
 * @model annotation="GenModel documentation='/**\n * Block is the model-element representation for the <code>do...end</code> block.\n \052/'"
 * @generated
 */
public interface Block extends Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Rescue Block</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.behavior.Rescue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescue Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescue Block</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getBlock_RescueBlock()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="GenModel documentation='/**\n * List of rescues defined for the block\n \052/'"
	 * @generated
	 */
	EList<Rescue> getRescueBlock();

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getBlock_Statement()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="GenModel documentation='/**\n * List of statements composing the block\n \052/'"
	 * @generated
	 */
	EList<Expression> getStatement();

} // Block