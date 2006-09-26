/**
 * <copyright>
 * </copyright>
 *
 * $Id: RootImpl.java,v 1.1 2006-09-26 15:28:31 dtouzet Exp $
 */
package sts.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sts.Root;
import sts.Rule;
import sts.StsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sts.impl.RootImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link sts.impl.RootImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends EObjectImpl implements Root {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList rules = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Rule start = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StsPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList(Rule.class, this, StsPackage.ROOT__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Rule)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StsPackage.ROOT__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Rule newStart) {
		Rule oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StsPackage.ROOT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StsPackage.ROOT__RULES:
				return ((InternalEList)getRules()).basicRemove(otherEnd, msgs);
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
			case StsPackage.ROOT__RULES:
				return getRules();
			case StsPackage.ROOT__START:
				if (resolve) return getStart();
				return basicGetStart();
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
			case StsPackage.ROOT__RULES:
				getRules().clear();
				getRules().addAll((Collection)newValue);
				return;
			case StsPackage.ROOT__START:
				setStart((Rule)newValue);
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
			case StsPackage.ROOT__RULES:
				getRules().clear();
				return;
			case StsPackage.ROOT__START:
				setStart((Rule)null);
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
			case StsPackage.ROOT__RULES:
				return rules != null && !rules.isEmpty();
			case StsPackage.ROOT__START:
				return start != null;
		}
		return super.eIsSet(featureID);
	}

} //RootImpl