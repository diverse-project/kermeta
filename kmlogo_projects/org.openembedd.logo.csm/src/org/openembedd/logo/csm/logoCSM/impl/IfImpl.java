/**
 * <copyright> </copyright>
 * 
 * $Id: IfImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openembedd.logo.csm.logoCSM.Block;
import org.openembedd.logo.csm.logoCSM.If;
import org.openembedd.logo.csm.logoCSM.LogoCSMFactory;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>If</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.IfImpl#getThenPart <em>Then Part</em>}</li>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.IfImpl#getElsePart <em>Else Part</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IfImpl extends ControlStructureImpl implements If
{
	/**
	 * The cached value of the '{@link #getThenPart() <em>Then Part</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getThenPart()
	 * @generated
	 * @ordered
	 */
	protected Block	thenPart;

	/**
	 * The cached value of the '{@link #getElsePart() <em>Else Part</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getElsePart()
	 * @generated
	 * @ordered
	 */
	protected Block	elsePart;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IfImpl()
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
		return LogoCSMPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Block getThenPart()
	{
		if (thenPart == null)
		{
			thenPart = LogoCSMFactory.eINSTANCE.createBlock();
		}
		return thenPart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetThenPart(Block newThenPart, NotificationChain msgs)
	{
		Block oldThenPart = thenPart;
		thenPart = newThenPart;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				LogoCSMPackage.IF__THEN_PART, oldThenPart, newThenPart);
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
	public void setThenPart(Block newThenPart)
	{
		if (newThenPart != thenPart)
		{
			NotificationChain msgs = null;
			if (thenPart != null)
				msgs = ((InternalEObject) thenPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- LogoCSMPackage.IF__THEN_PART, null, msgs);
			if (newThenPart != null)
				msgs = ((InternalEObject) newThenPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- LogoCSMPackage.IF__THEN_PART, null, msgs);
			msgs = basicSetThenPart(newThenPart, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoCSMPackage.IF__THEN_PART, newThenPart,
				newThenPart));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Block getElsePart()
	{
		if (elsePart == null)
		{
			elsePart = LogoCSMFactory.eINSTANCE.createBlock();
		}
		return elsePart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetElsePart(Block newElsePart, NotificationChain msgs)
	{
		Block oldElsePart = elsePart;
		elsePart = newElsePart;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				LogoCSMPackage.IF__ELSE_PART, oldElsePart, newElsePart);
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
	public void setElsePart(Block newElsePart)
	{
		if (newElsePart != elsePart)
		{
			NotificationChain msgs = null;
			if (elsePart != null)
				msgs = ((InternalEObject) elsePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- LogoCSMPackage.IF__ELSE_PART, null, msgs);
			if (newElsePart != null)
				msgs = ((InternalEObject) newElsePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- LogoCSMPackage.IF__ELSE_PART, null, msgs);
			msgs = basicSetElsePart(newElsePart, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoCSMPackage.IF__ELSE_PART, newElsePart,
				newElsePart));
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
		case LogoCSMPackage.IF__THEN_PART:
			return basicSetThenPart(null, msgs);
		case LogoCSMPackage.IF__ELSE_PART:
			return basicSetElsePart(null, msgs);
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
		case LogoCSMPackage.IF__THEN_PART:
			return getThenPart();
		case LogoCSMPackage.IF__ELSE_PART:
			return getElsePart();
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
		case LogoCSMPackage.IF__THEN_PART:
			setThenPart((Block) newValue);
			return;
		case LogoCSMPackage.IF__ELSE_PART:
			setElsePart((Block) newValue);
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
		case LogoCSMPackage.IF__THEN_PART:
			setThenPart((Block) null);
			return;
		case LogoCSMPackage.IF__ELSE_PART:
			setElsePart((Block) null);
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
		case LogoCSMPackage.IF__THEN_PART:
			return thenPart != null;
		case LogoCSMPackage.IF__ELSE_PART:
			return elsePart != null;
		}
		return super.eIsSet(featureID);
	}

} // IfImpl
