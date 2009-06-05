/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.ItemizedlistType;
import org.kermeta.Docbook.ListitemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Itemizedlist Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.ItemizedlistTypeImpl#getListitem <em>Listitem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemizedlistTypeImpl extends EObjectImpl implements ItemizedlistType {
	/**
	 * The cached value of the '{@link #getListitem() <em>Listitem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListitem()
	 * @generated
	 * @ordered
	 */
	protected EList<ListitemType> listitem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemizedlistTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.ITEMIZEDLIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListitemType> getListitem() {
		if (listitem == null) {
			listitem = new EObjectContainmentEList<ListitemType>(ListitemType.class, this, DocbookPackage.ITEMIZEDLIST_TYPE__LISTITEM);
		}
		return listitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.ITEMIZEDLIST_TYPE__LISTITEM:
				return ((InternalEList<?>)getListitem()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.ITEMIZEDLIST_TYPE__LISTITEM:
				return getListitem();
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
			case DocbookPackage.ITEMIZEDLIST_TYPE__LISTITEM:
				getListitem().clear();
				getListitem().addAll((Collection<? extends ListitemType>)newValue);
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
			case DocbookPackage.ITEMIZEDLIST_TYPE__LISTITEM:
				getListitem().clear();
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
			case DocbookPackage.ITEMIZEDLIST_TYPE__LISTITEM:
				return listitem != null && !listitem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ItemizedlistTypeImpl
