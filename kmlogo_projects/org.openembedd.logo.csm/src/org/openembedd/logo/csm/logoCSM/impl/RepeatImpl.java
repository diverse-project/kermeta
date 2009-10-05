/**
 * <copyright> </copyright>
 * 
 * $Id: RepeatImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openembedd.logo.csm.logoCSM.Block;
import org.openembedd.logo.csm.logoCSM.LogoCSMFactory;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.logoCSM.Repeat;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Repeat</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.RepeatImpl#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RepeatImpl extends ControlStructureImpl implements Repeat
{
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected Block	block;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RepeatImpl()
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
		return LogoCSMPackage.Literals.REPEAT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Block getBlock()
	{
		if (block == null)
		{
			block = LogoCSMFactory.eINSTANCE.createBlock();
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
	{
		Block oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				LogoCSMPackage.REPEAT__BLOCK, oldBlock, newBlock);
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
	public void setBlock(Block newBlock)
	{
		if (newBlock != block)
		{
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject) block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- LogoCSMPackage.REPEAT__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject) newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- LogoCSMPackage.REPEAT__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoCSMPackage.REPEAT__BLOCK, newBlock, newBlock));
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
		case LogoCSMPackage.REPEAT__BLOCK:
			return basicSetBlock(null, msgs);
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
		case LogoCSMPackage.REPEAT__BLOCK:
			return getBlock();
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
		case LogoCSMPackage.REPEAT__BLOCK:
			setBlock((Block) newValue);
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
		case LogoCSMPackage.REPEAT__BLOCK:
			setBlock((Block) null);
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
		case LogoCSMPackage.REPEAT__BLOCK:
			return block != null;
		}
		return super.eIsSet(featureID);
	}

} // RepeatImpl
