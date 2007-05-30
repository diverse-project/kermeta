/**
 * <copyright>
 * </copyright>
 *
 * $Id: Block.java,v 1.1 2007-05-30 13:23:34 ffleurey Exp $
 */
package fr.irisa.triskell.kmLogo.ASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.Block#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Instruction {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kmLogo.ASM.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getBlock_Instructions()
	 * @model type="fr.irisa.triskell.kmLogo.ASM.Instruction" containment="true"
	 * @generated
	 */
	EList getInstructions();

} // Block