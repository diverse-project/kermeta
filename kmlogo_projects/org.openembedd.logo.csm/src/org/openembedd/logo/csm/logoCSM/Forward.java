/**
 * <copyright> </copyright>
 * 
 * $Id: Forward.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Forward</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.Forward#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getForward()
 * @model
 * @generated
 */
public interface Forward extends Primitive
{
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Steps</em>' containment reference.
	 * @see #setSteps(Expression)
	 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getForward_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSteps();

	/**
	 * Sets the value of the '{@link org.openembedd.logo.csm.logoCSM.Forward#getSteps <em>Steps</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Steps</em>' containment reference.
	 * @see #getSteps()
	 * @generated
	 */
	void setSteps(Expression value);

} // Forward
