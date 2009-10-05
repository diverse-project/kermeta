/**
 * <copyright> </copyright>
 * 
 * $Id: ParameterCallImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.logoCSM.Parameter;
import org.openembedd.logo.csm.logoCSM.ParameterCall;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter Call</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.ParameterCallImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ParameterCallImpl extends InstructionImpl implements ParameterCall
{
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter	parameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ParameterCallImpl()
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
		return LogoCSMPackage.Literals.PARAMETER_CALL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter getParameter()
	{
		if (parameter != null && parameter.eIsProxy())
		{
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (Parameter) eResolveProxy(oldParameter);
			if (parameter != oldParameter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogoCSMPackage.PARAMETER_CALL__PARAMETER,
						oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter basicGetParameter()
	{
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParameter(Parameter newParameter)
	{
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoCSMPackage.PARAMETER_CALL__PARAMETER,
				oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String parseExpression()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case LogoCSMPackage.PARAMETER_CALL__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
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
		case LogoCSMPackage.PARAMETER_CALL__PARAMETER:
			setParameter((Parameter) newValue);
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
		case LogoCSMPackage.PARAMETER_CALL__PARAMETER:
			setParameter((Parameter) null);
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
		case LogoCSMPackage.PARAMETER_CALL__PARAMETER:
			return parameter != null;
		}
		return super.eIsSet(featureID);
	}

} // ParameterCallImpl
