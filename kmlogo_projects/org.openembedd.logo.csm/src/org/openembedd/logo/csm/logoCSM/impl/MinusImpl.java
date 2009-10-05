/**
 * <copyright> </copyright>
 * 
 * $Id: MinusImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.ecore.EClass;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.logoCSM.Minus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Minus</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class MinusImpl extends BinaryExpImpl implements Minus
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MinusImpl()
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
		return LogoCSMPackage.Literals.MINUS;
	}

	@Override
	public String getExpressionSymbol()
	{
		return " - ";
	}

} // MinusImpl
