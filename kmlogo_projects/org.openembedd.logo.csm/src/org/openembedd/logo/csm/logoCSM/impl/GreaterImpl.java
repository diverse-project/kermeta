/**
 * <copyright> </copyright>
 * 
 * $Id: GreaterImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.ecore.EClass;
import org.openembedd.logo.csm.logoCSM.Greater;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Greater</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class GreaterImpl extends BinaryExpImpl implements Greater
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GreaterImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return LogoCSMPackage.Literals.GREATER;
	}

	@Override
	public String getExpressionSymbol()
	{
		return " > ";
	}

} // GreaterImpl
