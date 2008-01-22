/**
 * <copyright>
 * </copyright>
 *
 * $Id: Block.java,v 1.7 2008-01-22 14:24:31 cfaucher Exp $
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
 * @model
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
	 * @generated
	 */
	EList<Expression> getStatement();

} // Block