/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.smartadapters.core.Adaptation;
import org.smartadapters.core.Adapter;
import org.smartadapters.core.Aspect;
import org.smartadapters.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smartadapters.core.impl.AdapterImpl#getAspect <em>Aspect</em>}</li>
 *   <li>{@link org.smartadapters.core.impl.AdapterImpl#getAdapt <em>Adapt</em>}</li>
 *   <li>{@link org.smartadapters.core.impl.AdapterImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdapterImpl extends EObjectImpl implements Adapter {
	/**
	 * The cached value of the '{@link #getAspect() <em>Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect()
	 * @generated
	 * @ordered
	 */
	protected Aspect aspect;

	/**
	 * The cached value of the '{@link #getAdapt() <em>Adapt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapt()
	 * @generated
	 * @ordered
	 */
	protected EList<Adaptation> adapt;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect getAspect() {
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAspect(Aspect newAspect, NotificationChain msgs) {
		Aspect oldAspect = aspect;
		aspect = newAspect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ADAPTER__ASPECT, oldAspect, newAspect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspect(Aspect newAspect) {
		if (newAspect != aspect) {
			NotificationChain msgs = null;
			if (aspect != null)
				msgs = ((InternalEObject)aspect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ADAPTER__ASPECT, null, msgs);
			if (newAspect != null)
				msgs = ((InternalEObject)newAspect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ADAPTER__ASPECT, null, msgs);
			msgs = basicSetAspect(newAspect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ADAPTER__ASPECT, newAspect, newAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Adaptation> getAdapt() {
		if (adapt == null) {
			adapt = new EObjectContainmentWithInverseEList<Adaptation>(Adaptation.class, this, CorePackage.ADAPTER__ADAPT, CorePackage.ADAPTATION__ADAPTER);
		}
		return adapt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ADAPTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ADAPTER__ADAPT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAdapt()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ADAPTER__ASPECT:
				return basicSetAspect(null, msgs);
			case CorePackage.ADAPTER__ADAPT:
				return ((InternalEList<?>)getAdapt()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ADAPTER__ASPECT:
				return getAspect();
			case CorePackage.ADAPTER__ADAPT:
				return getAdapt();
			case CorePackage.ADAPTER__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ADAPTER__ASPECT:
				setAspect((Aspect)newValue);
				return;
			case CorePackage.ADAPTER__ADAPT:
				getAdapt().clear();
				getAdapt().addAll((Collection<? extends Adaptation>)newValue);
				return;
			case CorePackage.ADAPTER__NAME:
				setName((String)newValue);
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
			case CorePackage.ADAPTER__ASPECT:
				setAspect((Aspect)null);
				return;
			case CorePackage.ADAPTER__ADAPT:
				getAdapt().clear();
				return;
			case CorePackage.ADAPTER__NAME:
				setName(NAME_EDEFAULT);
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
			case CorePackage.ADAPTER__ASPECT:
				return aspect != null;
			case CorePackage.ADAPTER__ADAPT:
				return adapt != null && !adapt.isEmpty();
			case CorePackage.ADAPTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AdapterImpl
