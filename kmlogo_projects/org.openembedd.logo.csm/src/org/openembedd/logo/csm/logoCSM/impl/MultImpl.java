/**
 * <copyright> </copyright>
 * 
 * $Id: MultImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.ecore.EClass;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.logoCSM.Mult;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mult</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class MultImpl extends BinaryExpImpl implements Mult
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MultImpl()
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
		return LogoCSMPackage.Literals.MULT;
	}

	@Override
	public String getExpressionSymbol()
	{
		return " * ";
	}

} // MultImpl
