/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

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

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.ImportantType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.PrefaceType;
import org.kermeta.Docbook.TipType;
import org.kermeta.Docbook.TitleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.PrefaceTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.PrefaceTypeImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.PrefaceTypeImpl#getImportant <em>Important</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.PrefaceTypeImpl#getTip <em>Tip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrefaceTypeImpl extends EObjectImpl implements PrefaceType {
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
	 * The cached value of the '{@link #getPara() <em>Para</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPara()
	 * @generated
	 * @ordered
	 */
	protected EList<ParaType> para;

	/**
	 * The cached value of the '{@link #getImportant() <em>Important</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportant()
	 * @generated
	 * @ordered
	 */
	protected ImportantType important;

	/**
	 * The cached value of the '{@link #getTip() <em>Tip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTip()
	 * @generated
	 * @ordered
	 */
	protected TipType tip;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrefaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.PREFACE_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.PREFACE_TYPE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PREFACE_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PREFACE_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PREFACE_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParaType> getPara() {
		if (para == null) {
			para = new EObjectContainmentEList<ParaType>(ParaType.class, this, DocbookPackage.PREFACE_TYPE__PARA);
		}
		return para;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportantType getImportant() {
		return important;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportant(ImportantType newImportant, NotificationChain msgs) {
		ImportantType oldImportant = important;
		important = newImportant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.PREFACE_TYPE__IMPORTANT, oldImportant, newImportant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportant(ImportantType newImportant) {
		if (newImportant != important) {
			NotificationChain msgs = null;
			if (important != null)
				msgs = ((InternalEObject)important).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PREFACE_TYPE__IMPORTANT, null, msgs);
			if (newImportant != null)
				msgs = ((InternalEObject)newImportant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PREFACE_TYPE__IMPORTANT, null, msgs);
			msgs = basicSetImportant(newImportant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PREFACE_TYPE__IMPORTANT, newImportant, newImportant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipType getTip() {
		return tip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTip(TipType newTip, NotificationChain msgs) {
		TipType oldTip = tip;
		tip = newTip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.PREFACE_TYPE__TIP, oldTip, newTip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTip(TipType newTip) {
		if (newTip != tip) {
			NotificationChain msgs = null;
			if (tip != null)
				msgs = ((InternalEObject)tip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PREFACE_TYPE__TIP, null, msgs);
			if (newTip != null)
				msgs = ((InternalEObject)newTip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PREFACE_TYPE__TIP, null, msgs);
			msgs = basicSetTip(newTip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PREFACE_TYPE__TIP, newTip, newTip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.PREFACE_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case DocbookPackage.PREFACE_TYPE__PARA:
				return ((InternalEList<?>)getPara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.PREFACE_TYPE__IMPORTANT:
				return basicSetImportant(null, msgs);
			case DocbookPackage.PREFACE_TYPE__TIP:
				return basicSetTip(null, msgs);
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
			case DocbookPackage.PREFACE_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.PREFACE_TYPE__PARA:
				return getPara();
			case DocbookPackage.PREFACE_TYPE__IMPORTANT:
				return getImportant();
			case DocbookPackage.PREFACE_TYPE__TIP:
				return getTip();
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
			case DocbookPackage.PREFACE_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case DocbookPackage.PREFACE_TYPE__PARA:
				getPara().clear();
				getPara().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.PREFACE_TYPE__IMPORTANT:
				setImportant((ImportantType)newValue);
				return;
			case DocbookPackage.PREFACE_TYPE__TIP:
				setTip((TipType)newValue);
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
			case DocbookPackage.PREFACE_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case DocbookPackage.PREFACE_TYPE__PARA:
				getPara().clear();
				return;
			case DocbookPackage.PREFACE_TYPE__IMPORTANT:
				setImportant((ImportantType)null);
				return;
			case DocbookPackage.PREFACE_TYPE__TIP:
				setTip((TipType)null);
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
			case DocbookPackage.PREFACE_TYPE__TITLE:
				return title != null;
			case DocbookPackage.PREFACE_TYPE__PARA:
				return para != null && !para.isEmpty();
			case DocbookPackage.PREFACE_TYPE__IMPORTANT:
				return important != null;
			case DocbookPackage.PREFACE_TYPE__TIP:
				return tip != null;
		}
		return super.eIsSet(featureID);
	}

} //PrefaceTypeImpl
