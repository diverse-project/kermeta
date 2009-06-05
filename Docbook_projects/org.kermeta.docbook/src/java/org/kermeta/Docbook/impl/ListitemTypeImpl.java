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
import org.kermeta.Docbook.ItemizedlistType;
import org.kermeta.Docbook.ListitemType;
import org.kermeta.Docbook.ParaType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listitem Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.ListitemTypeImpl#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ListitemTypeImpl#getPara <em>Para</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListitemTypeImpl extends EObjectImpl implements ListitemType {
	/**
	 * The cached value of the '{@link #getItemizedlist() <em>Itemizedlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemizedlist()
	 * @generated
	 * @ordered
	 */
	protected ItemizedlistType itemizedlist;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListitemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.LISTITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemizedlistType getItemizedlist() {
		return itemizedlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemizedlist(ItemizedlistType newItemizedlist, NotificationChain msgs) {
		ItemizedlistType oldItemizedlist = itemizedlist;
		itemizedlist = newItemizedlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.LISTITEM_TYPE__ITEMIZEDLIST, oldItemizedlist, newItemizedlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemizedlist(ItemizedlistType newItemizedlist) {
		if (newItemizedlist != itemizedlist) {
			NotificationChain msgs = null;
			if (itemizedlist != null)
				msgs = ((InternalEObject)itemizedlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.LISTITEM_TYPE__ITEMIZEDLIST, null, msgs);
			if (newItemizedlist != null)
				msgs = ((InternalEObject)newItemizedlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.LISTITEM_TYPE__ITEMIZEDLIST, null, msgs);
			msgs = basicSetItemizedlist(newItemizedlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.LISTITEM_TYPE__ITEMIZEDLIST, newItemizedlist, newItemizedlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParaType> getPara() {
		if (para == null) {
			para = new EObjectContainmentEList<ParaType>(ParaType.class, this, DocbookPackage.LISTITEM_TYPE__PARA);
		}
		return para;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.LISTITEM_TYPE__ITEMIZEDLIST:
				return basicSetItemizedlist(null, msgs);
			case DocbookPackage.LISTITEM_TYPE__PARA:
				return ((InternalEList<?>)getPara()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.LISTITEM_TYPE__ITEMIZEDLIST:
				return getItemizedlist();
			case DocbookPackage.LISTITEM_TYPE__PARA:
				return getPara();
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
			case DocbookPackage.LISTITEM_TYPE__ITEMIZEDLIST:
				setItemizedlist((ItemizedlistType)newValue);
				return;
			case DocbookPackage.LISTITEM_TYPE__PARA:
				getPara().clear();
				getPara().addAll((Collection<? extends ParaType>)newValue);
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
			case DocbookPackage.LISTITEM_TYPE__ITEMIZEDLIST:
				setItemizedlist((ItemizedlistType)null);
				return;
			case DocbookPackage.LISTITEM_TYPE__PARA:
				getPara().clear();
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
			case DocbookPackage.LISTITEM_TYPE__ITEMIZEDLIST:
				return itemizedlist != null;
			case DocbookPackage.LISTITEM_TYPE__PARA:
				return para != null && !para.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListitemTypeImpl
