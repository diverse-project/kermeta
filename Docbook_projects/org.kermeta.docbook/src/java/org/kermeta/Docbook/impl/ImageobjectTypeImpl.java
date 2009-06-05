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
import org.kermeta.Docbook.ImagedataType;
import org.kermeta.Docbook.ImageobjectType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imageobject Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.ImageobjectTypeImpl#getImagedata <em>Imagedata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageobjectTypeImpl extends EObjectImpl implements ImageobjectType {
	/**
	 * The cached value of the '{@link #getImagedata() <em>Imagedata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagedata()
	 * @generated
	 * @ordered
	 */
	protected ImagedataType imagedata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageobjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.IMAGEOBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagedataType getImagedata() {
		return imagedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagedata(ImagedataType newImagedata, NotificationChain msgs) {
		ImagedataType oldImagedata = imagedata;
		imagedata = newImagedata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.IMAGEOBJECT_TYPE__IMAGEDATA, oldImagedata, newImagedata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagedata(ImagedataType newImagedata) {
		if (newImagedata != imagedata) {
			NotificationChain msgs = null;
			if (imagedata != null)
				msgs = ((InternalEObject)imagedata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.IMAGEOBJECT_TYPE__IMAGEDATA, null, msgs);
			if (newImagedata != null)
				msgs = ((InternalEObject)newImagedata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.IMAGEOBJECT_TYPE__IMAGEDATA, null, msgs);
			msgs = basicSetImagedata(newImagedata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.IMAGEOBJECT_TYPE__IMAGEDATA, newImagedata, newImagedata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.IMAGEOBJECT_TYPE__IMAGEDATA:
				return basicSetImagedata(null, msgs);
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
			case DocbookPackage.IMAGEOBJECT_TYPE__IMAGEDATA:
				return getImagedata();
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
			case DocbookPackage.IMAGEOBJECT_TYPE__IMAGEDATA:
				setImagedata((ImagedataType)newValue);
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
			case DocbookPackage.IMAGEOBJECT_TYPE__IMAGEDATA:
				setImagedata((ImagedataType)null);
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
			case DocbookPackage.IMAGEOBJECT_TYPE__IMAGEDATA:
				return imagedata != null;
		}
		return super.eIsSet(featureID);
	}

} //ImageobjectTypeImpl
