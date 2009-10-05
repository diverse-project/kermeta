/**
 * <copyright> </copyright>
 * 
 * $Id: BlockImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openembedd.logo.csm.logoCSM.Block;
import org.openembedd.logo.csm.logoCSM.Instruction;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Block</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.BlockImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BlockImpl extends InstructionImpl implements Block
{
	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction>	instructions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BlockImpl()
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
		return LogoCSMPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Instruction> getInstructions()
	{
		if (instructions == null)
		{
			instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this,
				LogoCSMPackage.BLOCK__INSTRUCTIONS);
		}
		return instructions;
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
		case LogoCSMPackage.BLOCK__INSTRUCTIONS:
			return ((InternalEList<?>) getInstructions()).basicRemove(otherEnd, msgs);
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
		case LogoCSMPackage.BLOCK__INSTRUCTIONS:
			return getInstructions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case LogoCSMPackage.BLOCK__INSTRUCTIONS:
			getInstructions().clear();
			getInstructions().addAll((Collection<? extends Instruction>) newValue);
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
		case LogoCSMPackage.BLOCK__INSTRUCTIONS:
			getInstructions().clear();
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
		case LogoCSMPackage.BLOCK__INSTRUCTIONS:
			return instructions != null && !instructions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BlockImpl
