/**
 * <copyright> </copyright>
 * 
 * $Id: ControlStructure.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Control Structure</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.ControlStructure#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getControlStructure()
 * @model abstract="true"
 * @generated
 */
public interface ControlStructure extends Instruction
{
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getControlStructure_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.openembedd.logo.csm.logoCSM.ControlStructure#getCondition <em>Condition</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // ControlStructure
