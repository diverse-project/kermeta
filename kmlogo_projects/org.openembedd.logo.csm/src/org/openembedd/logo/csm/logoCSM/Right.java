/**
 * <copyright> </copyright>
 * 
 * $Id: Right.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Right</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.Right#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getRight()
 * @model
 * @generated
 */
public interface Right extends Primitive
{
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(Expression)
	 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getRight_Angle()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAngle();

	/**
	 * Sets the value of the '{@link org.openembedd.logo.csm.logoCSM.Right#getAngle <em>Angle</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Expression value);

} // Right
