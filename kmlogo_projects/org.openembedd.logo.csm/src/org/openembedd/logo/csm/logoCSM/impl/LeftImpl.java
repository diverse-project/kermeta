/**
 * <copyright> </copyright>
 * 
 * $Id: LeftImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openembedd.logo.csm.logoCSM.Expression;
import org.openembedd.logo.csm.logoCSM.Left;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Left</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.LeftImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LeftImpl extends PrimitiveImpl implements Left
{
	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected Expression	angle;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LeftImpl()
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
		return LogoCSMPackage.Literals.LEFT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Expression getAngle()
	{
		return angle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAngle(Expression newAngle, NotificationChain msgs)
	{
		Expression oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogoCSMPackage.LEFT__ANGLE,
				oldAngle, newAngle);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAngle(Expression newAngle)
	{
		if (newAngle != angle)
		{
			NotificationChain msgs = null;
			if (angle != null)
				msgs = ((InternalEObject) angle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- LogoCSMPackage.LEFT__ANGLE, null, msgs);
			if (newAngle != null)
				msgs = ((InternalEObject) newAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- LogoCSMPackage.LEFT__ANGLE, null, msgs);
			msgs = basicSetAngle(newAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoCSMPackage.LEFT__ANGLE, newAngle, newAngle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
		case LogoCSMPackage.LEFT__ANGLE:
			return basicSetAngle(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case LogoCSMPackage.LEFT__ANGLE:
			return getAngle();
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
		case LogoCSMPackage.LEFT__ANGLE:
			setAngle((Expression) newValue);
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
		case LogoCSMPackage.LEFT__ANGLE:
			setAngle((Expression) null);
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
		case LogoCSMPackage.LEFT__ANGLE:
			return angle != null;
		}
		return super.eIsSet(featureID);
	}

} // LeftImpl
