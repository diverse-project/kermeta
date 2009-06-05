/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.FigureType;
import org.kermeta.Docbook.MediaobjectType;
import org.kermeta.Docbook.TitleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.FigureTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.FigureTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.FigureTypeImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.FigureTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FigureTypeImpl extends EObjectImpl implements FigureType {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getMediaobject() <em>Mediaobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaobject()
	 * @generated
	 * @ordered
	 */
	protected MediaobjectType mediaobject;

	/**
	 * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FLOAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected BigInteger float_ = FLOAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.FIGURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.FIGURE_TYPE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.FIGURE_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.FIGURE_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.FIGURE_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaobjectType getMediaobject() {
		return mediaobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMediaobject(MediaobjectType newMediaobject, NotificationChain msgs) {
		MediaobjectType oldMediaobject = mediaobject;
		mediaobject = newMediaobject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.FIGURE_TYPE__MEDIAOBJECT, oldMediaobject, newMediaobject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediaobject(MediaobjectType newMediaobject) {
		if (newMediaobject != mediaobject) {
			NotificationChain msgs = null;
			if (mediaobject != null)
				msgs = ((InternalEObject)mediaobject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.FIGURE_TYPE__MEDIAOBJECT, null, msgs);
			if (newMediaobject != null)
				msgs = ((InternalEObject)newMediaobject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.FIGURE_TYPE__MEDIAOBJECT, null, msgs);
			msgs = basicSetMediaobject(newMediaobject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.FIGURE_TYPE__MEDIAOBJECT, newMediaobject, newMediaobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFloat() {
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat(BigInteger newFloat) {
		BigInteger oldFloat = float_;
		float_ = newFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.FIGURE_TYPE__FLOAT, oldFloat, float_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.FIGURE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.FIGURE_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case DocbookPackage.FIGURE_TYPE__MEDIAOBJECT:
				return basicSetMediaobject(null, msgs);
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
			case DocbookPackage.FIGURE_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.FIGURE_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.FIGURE_TYPE__FLOAT:
				return getFloat();
			case DocbookPackage.FIGURE_TYPE__ID:
				return getId();
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
			case DocbookPackage.FIGURE_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case DocbookPackage.FIGURE_TYPE__MEDIAOBJECT:
				setMediaobject((MediaobjectType)newValue);
				return;
			case DocbookPackage.FIGURE_TYPE__FLOAT:
				setFloat((BigInteger)newValue);
				return;
			case DocbookPackage.FIGURE_TYPE__ID:
				setId((String)newValue);
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
			case DocbookPackage.FIGURE_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case DocbookPackage.FIGURE_TYPE__MEDIAOBJECT:
				setMediaobject((MediaobjectType)null);
				return;
			case DocbookPackage.FIGURE_TYPE__FLOAT:
				setFloat(FLOAT_EDEFAULT);
				return;
			case DocbookPackage.FIGURE_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case DocbookPackage.FIGURE_TYPE__TITLE:
				return title != null;
			case DocbookPackage.FIGURE_TYPE__MEDIAOBJECT:
				return mediaobject != null;
			case DocbookPackage.FIGURE_TYPE__FLOAT:
				return FLOAT_EDEFAULT == null ? float_ != null : !FLOAT_EDEFAULT.equals(float_);
			case DocbookPackage.FIGURE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (float: ");
		result.append(float_);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FigureTypeImpl
