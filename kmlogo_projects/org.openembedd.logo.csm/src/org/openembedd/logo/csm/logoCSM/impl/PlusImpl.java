/**
 * <copyright> </copyright>
 * 
 * $Id: PlusImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.ecore.EClass;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.logoCSM.Plus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Plus</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class PlusImpl extends BinaryExpImpl implements Plus
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PlusImpl()
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
		return LogoCSMPackage.Literals.PLUS;
	}

	@Override
	public String getExpressionSymbol()
	{
		return " + ";
	}

} // PlusImpl
