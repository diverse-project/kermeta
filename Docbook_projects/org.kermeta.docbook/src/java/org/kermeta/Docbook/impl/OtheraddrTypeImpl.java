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
import org.kermeta.Docbook.OtheraddrType;
import org.kermeta.Docbook.UlinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Otheraddr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.OtheraddrTypeImpl#getUlink <em>Ulink</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtheraddrTypeImpl extends EObjectImpl implements OtheraddrType {
	/**
	 * The cached value of the '{@link #getUlink() <em>Ulink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUlink()
	 * @generated
	 * @ordered
	 */
	protected UlinkType ulink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtheraddrTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.OTHERADDR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UlinkType getUlink() {
		return ulink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUlink(UlinkType newUlink, NotificationChain msgs) {
		UlinkType oldUlink = ulink;
		ulink = newUlink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.OTHERADDR_TYPE__ULINK, oldUlink, newUlink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUlink(UlinkType newUlink) {
		if (newUlink != ulink) {
			NotificationChain msgs = null;
			if (ulink != null)
				msgs = ((InternalEObject)ulink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.OTHERADDR_TYPE__ULINK, null, msgs);
			if (newUlink != null)
				msgs = ((InternalEObject)newUlink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.OTHERADDR_TYPE__ULINK, null, msgs);
			msgs = basicSetUlink(newUlink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.OTHERADDR_TYPE__ULINK, newUlink, newUlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.OTHERADDR_TYPE__ULINK:
				return basicSetUlink(null, msgs);
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
			case DocbookPackage.OTHERADDR_TYPE__ULINK:
				return getUlink();
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
			case DocbookPackage.OTHERADDR_TYPE__ULINK:
				setUlink((UlinkType)newValue);
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
			case DocbookPackage.OTHERADDR_TYPE__ULINK:
				setUlink((UlinkType)null);
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
			case DocbookPackage.OTHERADDR_TYPE__ULINK:
				return ulink != null;
		}
		return super.eIsSet(featureID);
	}

} //OtheraddrTypeImpl
