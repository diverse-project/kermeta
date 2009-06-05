/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.TgroupType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Informaltable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.InformaltableTypeImpl#getTgroup <em>Tgroup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformaltableTypeImpl extends EObjectImpl implements InformaltableType {
	/**
	 * The cached value of the '{@link #getTgroup() <em>Tgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgroup()
	 * @generated
	 * @ordered
	 */
	protected TgroupType tgroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformaltableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.INFORMALTABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TgroupType getTgroup() {
		return tgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgroup(TgroupType newTgroup, NotificationChain msgs) {
		TgroupType oldTgroup = tgroup;
		tgroup = newTgroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.INFORMALTABLE_TYPE__TGROUP, oldTgroup, newTgroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTgroup(TgroupType newTgroup) {
		if (newTgroup != tgroup) {
			NotificationChain msgs = null;
			if (tgroup != null)
				msgs = ((InternalEObject)tgroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFORMALTABLE_TYPE__TGROUP, null, msgs);
			if (newTgroup != null)
				msgs = ((InternalEObject)newTgroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFORMALTABLE_TYPE__TGROUP, null, msgs);
			msgs = basicSetTgroup(newTgroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFORMALTABLE_TYPE__TGROUP, newTgroup, newTgroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.INFORMALTABLE_TYPE__TGROUP:
				return basicSetTgroup(null, msgs);
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
			case DocbookPackage.INFORMALTABLE_TYPE__TGROUP:
				return getTgroup();
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
			case DocbookPackage.INFORMALTABLE_TYPE__TGROUP:
				setTgroup((TgroupType)newValue);
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
			case DocbookPackage.INFORMALTABLE_TYPE__TGROUP:
				setTgroup((TgroupType)null);
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
			case DocbookPackage.INFORMALTABLE_TYPE__TGROUP:
				return tgroup != null;
		}
		return super.eIsSet(featureID);
	}

} //InformaltableTypeImpl
