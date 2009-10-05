/**
 * <copyright> </copyright>
 * 
 * $Id: Expression.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Expression</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Expression extends Instruction
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	String parseExpression();

} // Expression
