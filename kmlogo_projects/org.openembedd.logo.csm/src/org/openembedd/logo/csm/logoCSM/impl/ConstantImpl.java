/**
 * <copyright> </copyright>
 * 
 * $Id: ConstantImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openembedd.logo.csm.logoCSM.Constant;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Constant</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.ConstantImpl#getIntegerValue <em>Integer Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ConstantImpl extends InstructionImpl implements Constant
{
	/**
	 * The default value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected static final int	INTEGER_VALUE_EDEFAULT	= 0;

	/**
	 * The cached value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected int				integerValue			= INTEGER_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConstantImpl()
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
		return LogoCSMPackage.Literals.CONSTANT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getIntegerValue()
	{
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIntegerValue(int newIntegerValue)
	{
		int oldIntegerValue = integerValue;
		integerValue = newIntegerValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoCSMPackage.CONSTANT__INTEGER_VALUE,
				oldIntegerValue, integerValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String parseExpression()
	{
		return "" + integerValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case LogoCSMPackage.CONSTANT__INTEGER_VALUE:
			return new Integer(getIntegerValue());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case LogoCSMPackage.CONSTANT__INTEGER_VALUE:
			setIntegerValue(((Integer) newValue).intValue());
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case LogoCSMPackage.CONSTANT__INTEGER_VALUE:
			setIntegerValue(INTEGER_VALUE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case LogoCSMPackage.CONSTANT__INTEGER_VALUE:
			return integerValue != INTEGER_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (integerValue: ");
		result.append(integerValue);
		result.append(')');
		return result.toString();
	}

} // ConstantImpl
