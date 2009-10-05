/**
 * <copyright> </copyright>
 * 
 * $Id: InstructionImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openembedd.logo.csm.logoCSM.Instruction;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Instruction</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.InstructionImpl#getNext <em>Next</em>}</li>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.InstructionImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class InstructionImpl extends EObjectImpl implements Instruction
{
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Instruction	next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Instruction	previous;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstructionImpl()
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
		return LogoCSMPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Instruction getNext()
	{
		if (next != null && next.eIsProxy())
		{
			InternalEObject oldNext = (InternalEObject) next;
			next = (Instruction) eResolveProxy(oldNext);
			if (next != oldNext)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogoCSMPackage.INSTRUCTION__NEXT,
						oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Instruction basicGetNext()
	{
		return next;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNext(Instruction newNext, NotificationChain msgs)
	{
		Instruction oldNext = next;
		next = newNext;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				LogoCSMPackage.INSTRUCTION__NEXT, oldNext, newNext);
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
	public void setNext(Instruction newNext)
	{
		if (newNext != next)
		{
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this, LogoCSMPackage.INSTRUCTION__PREVIOUS,
					Instruction.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext).eInverseAdd(this, LogoCSMPackage.INSTRUCTION__PREVIOUS,
					Instruction.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoCSMPackage.INSTRUCTION__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Instruction getPrevious()
	{
		if (previous != null && previous.eIsProxy())
		{
			InternalEObject oldPrevious = (InternalEObject) previous;
			previous = (Instruction) eResolveProxy(oldPrevious);
			if (previous != oldPrevious)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogoCSMPackage.INSTRUCTION__PREVIOUS,
						oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Instruction basicGetPrevious()
	{
		return previous;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Instruction newPrevious, NotificationChain msgs)
	{
		Instruction oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				LogoCSMPackage.INSTRUCTION__PREVIOUS, oldPrevious, newPrevious);
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
	public void setPrevious(Instruction newPrevious)
	{
		if (newPrevious != previous)
		{
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this, LogoCSMPackage.INSTRUCTION__NEXT,
					Instruction.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject) newPrevious).eInverseAdd(this, LogoCSMPackage.INSTRUCTION__NEXT,
					Instruction.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoCSMPackage.INSTRUCTION__PREVIOUS, newPrevious,
				newPrevious));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
		case LogoCSMPackage.INSTRUCTION__NEXT:
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this, LogoCSMPackage.INSTRUCTION__PREVIOUS,
					Instruction.class, msgs);
			return basicSetNext((Instruction) otherEnd, msgs);
		case LogoCSMPackage.INSTRUCTION__PREVIOUS:
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this, LogoCSMPackage.INSTRUCTION__NEXT,
					Instruction.class, msgs);
			return basicSetPrevious((Instruction) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case LogoCSMPackage.INSTRUCTION__NEXT:
			return basicSetNext(null, msgs);
		case LogoCSMPackage.INSTRUCTION__PREVIOUS:
			return basicSetPrevious(null, msgs);
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
		case LogoCSMPackage.INSTRUCTION__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case LogoCSMPackage.INSTRUCTION__PREVIOUS:
			if (resolve)
				return getPrevious();
			return basicGetPrevious();
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
		case LogoCSMPackage.INSTRUCTION__NEXT:
			setNext((Instruction) newValue);
			return;
		case LogoCSMPackage.INSTRUCTION__PREVIOUS:
			setPrevious((Instruction) newValue);
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
		case LogoCSMPackage.INSTRUCTION__NEXT:
			setNext((Instruction) null);
			return;
		case LogoCSMPackage.INSTRUCTION__PREVIOUS:
			setPrevious((Instruction) null);
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
		case LogoCSMPackage.INSTRUCTION__NEXT:
			return next != null;
		case LogoCSMPackage.INSTRUCTION__PREVIOUS:
			return previous != null;
		}
		return super.eIsSet(featureID);
	}

} // InstructionImpl
