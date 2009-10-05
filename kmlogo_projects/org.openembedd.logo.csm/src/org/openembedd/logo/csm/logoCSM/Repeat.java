/**
 * <copyright> </copyright>
 * 
 * $Id: Repeat.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Repeat</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.Repeat#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getRepeat()
 * @model
 * @generated
 */
public interface Repeat extends ControlStructure
{
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getRepeat_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link org.openembedd.logo.csm.logoCSM.Repeat#getBlock <em>Block</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

} // Repeat
