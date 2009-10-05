/**
 * <copyright> </copyright>
 * 
 * $Id: LowerImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.ecore.EClass;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.logoCSM.Lower;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Lower</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class LowerImpl extends BinaryExpImpl implements Lower
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LowerImpl()
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
		return LogoCSMPackage.Literals.LOWER;
	}

	@Override
	public String getExpressionSymbol()
	{
		return " < ";
	}

} // LowerImpl
