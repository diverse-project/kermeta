/**
 * <copyright>
 * </copyright>
 *
 * $Id: BackImpl.java,v 1.2 2007-05-31 17:03:57 ffleurey Exp $
 */
package fr.irisa.triskell.kmLogo.ASM.impl;

import fr.irisa.triskell.kmLogo.ASM.ASMPackage;
import fr.irisa.triskell.kmLogo.ASM.Back;
import fr.irisa.triskell.kmLogo.ASM.Expression;

import fr.irisa.triskell.kmLogo.ASM.LogoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Back</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.impl.BackImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BackImpl extends PrimitiveImpl implements Back {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected Expression steps = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ASMPackage.Literals.BACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSteps() {
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSteps(Expression newSteps, NotificationChain msgs) {
		Expression oldSteps = steps;
		steps = newSteps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASMPackage.BACK__STEPS, oldSteps, newSteps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteps(Expression newSteps) {
		if (newSteps != steps) {
			NotificationChain msgs = null;
			if (steps != null)
				msgs = ((InternalEObject)steps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASMPackage.BACK__STEPS, null, msgs);
			if (newSteps != null)
				msgs = ((InternalEObject)newSteps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASMPackage.BACK__STEPS, null, msgs);
			msgs = basicSetSteps(newSteps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASMPackage.BACK__STEPS, newSteps, newSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASMPackage.BACK__STEPS:
				return basicSetSteps(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASMPackage.BACK__STEPS:
				return getSteps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ASMPackage.BACK__STEPS:
				setSteps((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ASMPackage.BACK__STEPS:
				setSteps((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ASMPackage.BACK__STEPS:
				return steps != null;
		}
		return super.eIsSet(featureID);
	}

} //BackImpl