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
import org.kermeta.Docbook.ImageobjectType;
import org.kermeta.Docbook.MediaobjectType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mediaobject Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.MediaobjectTypeImpl#getImageobject <em>Imageobject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaobjectTypeImpl extends EObjectImpl implements MediaobjectType {
	/**
	 * The cached value of the '{@link #getImageobject() <em>Imageobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageobject()
	 * @generated
	 * @ordered
	 */
	protected ImageobjectType imageobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaobjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.MEDIAOBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageobjectType getImageobject() {
		return imageobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageobject(ImageobjectType newImageobject, NotificationChain msgs) {
		ImageobjectType oldImageobject = imageobject;
		imageobject = newImageobject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.MEDIAOBJECT_TYPE__IMAGEOBJECT, oldImageobject, newImageobject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageobject(ImageobjectType newImageobject) {
		if (newImageobject != imageobject) {
			NotificationChain msgs = null;
			if (imageobject != null)
				msgs = ((InternalEObject)imageobject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.MEDIAOBJECT_TYPE__IMAGEOBJECT, null, msgs);
			if (newImageobject != null)
				msgs = ((InternalEObject)newImageobject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.MEDIAOBJECT_TYPE__IMAGEOBJECT, null, msgs);
			msgs = basicSetImageobject(newImageobject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MEDIAOBJECT_TYPE__IMAGEOBJECT, newImageobject, newImageobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.MEDIAOBJECT_TYPE__IMAGEOBJECT:
				return basicSetImageobject(null, msgs);
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
			case DocbookPackage.MEDIAOBJECT_TYPE__IMAGEOBJECT:
				return getImageobject();
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
			case DocbookPackage.MEDIAOBJECT_TYPE__IMAGEOBJECT:
				setImageobject((ImageobjectType)newValue);
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
			case DocbookPackage.MEDIAOBJECT_TYPE__IMAGEOBJECT:
				setImageobject((ImageobjectType)null);
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
			case DocbookPackage.MEDIAOBJECT_TYPE__IMAGEOBJECT:
				return imageobject != null;
		}
		return super.eIsSet(featureID);
	}

} //MediaobjectTypeImpl
