/**
 * <copyright> </copyright>
 * 
 * $Id: Block.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Block</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.Block#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Instruction
{
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list. The list contents are of type
	 * {@link org.openembedd.logo.csm.logoCSM.Instruction}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getBlock_Instructions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // Block
