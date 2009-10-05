/**
 * <copyright> </copyright>
 * 
 * $Id: ProcCallImpl.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openembedd.logo.csm.logoCSM.Expression;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.logoCSM.ProcCall;
import org.openembedd.logo.csm.logoCSM.ProcDeclaration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Proc Call</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.ProcCallImpl#getActualArgs <em>Actual Args</em>}</li>
 * <li>{@link org.openembedd.logo.csm.logoCSM.impl.ProcCallImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ProcCallImpl extends InstructionImpl implements ProcCall
{
	/**
	 * The cached value of the '{@link #getActualArgs() <em>Actual Args</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getActualArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression>	actualArgs;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected ProcDeclaration	declaration;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProcCallImpl()
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
		return LogoCSMPackage.Literals.PROC_CALL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Expression> getActualArgs()
	{
		if (actualArgs == null)
		{
			actualArgs = new EObjectContainmentEList<Expression>(Expression.class, this,
				LogoCSMPackage.PROC_CALL__ACTUAL_ARGS);
		}
		return actualArgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProcDeclaration getDeclaration()
	{
		if (declaration != null && declaration.eIsProxy())
		{
			InternalEObject oldDeclaration = (InternalEObject) declaration;
			declaration = (ProcDeclaration) eResolveProxy(oldDeclaration);
			if (declaration != oldDeclaration)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogoCSMPackage.PROC_CALL__DECLARATION,
						oldDeclaration, declaration));
			}
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProcDeclaration basicGetDeclaration()
	{
		return declaration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDeclaration(ProcDeclaration newDeclaration, NotificationChain msgs)
	{
		ProcDeclaration oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				LogoCSMPackage.PROC_CALL__DECLARATION, oldDeclaration, newDeclaration);
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
	public void setDeclaration(ProcDeclaration newDeclaration)
	{
		if (newDeclaration != declaration)
		{
			NotificationChain msgs = null;
			if (declaration != null)
				msgs = ((InternalEObject) declaration).eInverseRemove(this, LogoCSMPackage.PROC_DECLARATION__PROC_CALL,
					ProcDeclaration.class, msgs);
			if (newDeclaration != null)
				msgs = ((InternalEObject) newDeclaration).eInverseAdd(this, LogoCSMPackage.PROC_DECLARATION__PROC_CALL,
					ProcDeclaration.class, msgs);
			msgs = basicSetDeclaration(newDeclaration, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoCSMPackage.PROC_CALL__DECLARATION,
				newDeclaration, newDeclaration));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
		case LogoCSMPackage.PROC_CALL__DECLARATION:
			if (declaration != null)
				msgs = ((InternalEObject) declaration).eInverseRemove(this, LogoCSMPackage.PROC_DECLARATION__PROC_CALL,
					ProcDeclaration.class, msgs);
			return basicSetDeclaration((ProcDeclaration) otherEnd, msgs);
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
		case LogoCSMPackage.PROC_CALL__ACTUAL_ARGS:
			return ((InternalEList<?>) getActualArgs()).basicRemove(otherEnd, msgs);
		case LogoCSMPackage.PROC_CALL__DECLARATION:
			return basicSetDeclaration(null, msgs);
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
		case LogoCSMPackage.PROC_CALL__ACTUAL_ARGS:
			return getActualArgs();
		case LogoCSMPackage.PROC_CALL__DECLARATION:
			if (resolve)
				return getDeclaration();
			return basicGetDeclaration();
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
		case LogoCSMPackage.PROC_CALL__ACTUAL_ARGS:
			getActualArgs().clear();
			getActualArgs().addAll((Collection<? extends Expression>) newValue);
			return;
		case LogoCSMPackage.PROC_CALL__DECLARATION:
			setDeclaration((ProcDeclaration) newValue);
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
		case LogoCSMPackage.PROC_CALL__ACTUAL_ARGS:
			getActualArgs().clear();
			return;
		case LogoCSMPackage.PROC_CALL__DECLARATION:
			setDeclaration((ProcDeclaration) null);
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
		case LogoCSMPackage.PROC_CALL__ACTUAL_ARGS:
			return actualArgs != null && !actualArgs.isEmpty();
		case LogoCSMPackage.PROC_CALL__DECLARATION:
			return declaration != null;
		}
		return super.eIsSet(featureID);
	}

} // ProcCallImpl
