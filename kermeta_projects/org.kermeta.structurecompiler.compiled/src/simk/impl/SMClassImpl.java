/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMClassImpl.java,v 1.8 2008-11-07 08:53:07 cfaucher Exp $
 */
package simk.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import simk.SMClass;
import simk.SMContext;
import simk.SMUsage;
import simk.SimkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simk.impl.SMClassImpl#getContext <em>Context</em>}</li>
 *   <li>{@link simk.impl.SMClassImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMClassImpl extends SMNamedElementImpl implements SMClass {
	/**
	 * The default value of the '{@link #getUsages() <em>Usages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected static final SMUsage USAGES_EDEFAULT = SMUsage.DEFAULT;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected SMUsage usages = USAGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimkPackage.Literals.SM_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext getContext() {
		if (eContainerFeatureID != SimkPackage.SM_CLASS__CONTEXT)
			return null;
		return (SMContext) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext basicGetContext() {
		if (eContainerFeatureID != SimkPackage.SM_CLASS__CONTEXT)
			return null;
		return (SMContext) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(SMContext newContext,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContext,
				SimkPackage.SM_CLASS__CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(SMContext newContext) {
		if (newContext != eInternalContainer()
				|| (eContainerFeatureID != SimkPackage.SM_CLASS__CONTEXT && newContext != null)) {
			if (EcoreUtil.isAncestor(this, newContext))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext)
						.eInverseAdd(this, SimkPackage.SM_CONTEXT__SM_CLASS,
								SMContext.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_CLASS__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMUsage getUsages() {
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsages(SMUsage newUsages) {
		SMUsage oldUsages = usages;
		usages = newUsages == null ? USAGES_EDEFAULT : newUsages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimkPackage.SM_CLASS__USAGES, oldUsages, usages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapperUsage() {

		this.setUsages(simk.SMUsage.getByName("Wrapper"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		java.lang.String result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimkPackage.SM_CLASS__CONTEXT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContext((SMContext) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimkPackage.SM_CLASS__CONTEXT:
			return basicSetContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case SimkPackage.SM_CLASS__CONTEXT:
			return eInternalContainer().eInverseRemove(this,
					SimkPackage.SM_CONTEXT__SM_CLASS, SMContext.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimkPackage.SM_CLASS__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
		case SimkPackage.SM_CLASS__USAGES:
			return getUsages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimkPackage.SM_CLASS__CONTEXT:
			setContext((SMContext) newValue);
			return;
		case SimkPackage.SM_CLASS__USAGES:
			setUsages((SMUsage) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SimkPackage.SM_CLASS__CONTEXT:
			setContext((SMContext) null);
			return;
		case SimkPackage.SM_CLASS__USAGES:
			setUsages(USAGES_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SimkPackage.SM_CLASS__CONTEXT:
			return basicGetContext() != null;
		case SimkPackage.SM_CLASS__USAGES:
			return usages != USAGES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (usages: ");
		result.append(usages);
		result.append(')');
		return result.toString();
	}

} //SMClassImpl
