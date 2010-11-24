/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ObjectImpl#getKTag <em>KTag</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ObjectImpl#getKOwnedTags <em>KOwned Tags</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ObjectImpl#getKType <em>KType</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements org.kermeta.language.structure.Object {
	/**
	 * The cached value of the '{@link #getKTag() <em>KTag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> kTag;

	/**
	 * The cached value of the '{@link #getKOwnedTags() <em>KOwned Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKOwnedTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> kOwnedTags;

	/**
	 * The cached value of the '{@link #getKType() <em>KType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKType()
	 * @generated
	 * @ordered
	 */
	protected Type kType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getKTag() {
		if (kTag == null) {
			kTag = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, StructurePackage.OBJECT__KTAG, StructurePackage.TAG__OBJECT);
		}
		return kTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getKOwnedTags() {
		if (kOwnedTags == null) {
			kOwnedTags = new EObjectContainmentEList<Tag>(Tag.class, this, StructurePackage.OBJECT__KOWNED_TAGS);
		}
		return kOwnedTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getKType() {
		if (kType != null && kType.eIsProxy()) {
			InternalEObject oldKType = (InternalEObject)kType;
			kType = (Type)eResolveProxy(oldKType);
			if (kType != oldKType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.OBJECT__KTYPE, oldKType, kType));
			}
		}
		return kType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetKType() {
		return kType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKType(Type newKType) {
		Type oldKType = kType;
		kType = newKType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OBJECT__KTYPE, oldKType, kType));
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
			case StructurePackage.OBJECT__KTAG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKTag()).basicAdd(otherEnd, msgs);
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
			case StructurePackage.OBJECT__KTAG:
				return ((InternalEList<?>)getKTag()).basicRemove(otherEnd, msgs);
			case StructurePackage.OBJECT__KOWNED_TAGS:
				return ((InternalEList<?>)getKOwnedTags()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.OBJECT__KTAG:
				return getKTag();
			case StructurePackage.OBJECT__KOWNED_TAGS:
				return getKOwnedTags();
			case StructurePackage.OBJECT__KTYPE:
				if (resolve) return getKType();
				return basicGetKType();
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
			case StructurePackage.OBJECT__KTAG:
				getKTag().clear();
				getKTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case StructurePackage.OBJECT__KOWNED_TAGS:
				getKOwnedTags().clear();
				getKOwnedTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case StructurePackage.OBJECT__KTYPE:
				setKType((Type)newValue);
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
			case StructurePackage.OBJECT__KTAG:
				getKTag().clear();
				return;
			case StructurePackage.OBJECT__KOWNED_TAGS:
				getKOwnedTags().clear();
				return;
			case StructurePackage.OBJECT__KTYPE:
				setKType((Type)null);
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
			case StructurePackage.OBJECT__KTAG:
				return kTag != null && !kTag.isEmpty();
			case StructurePackage.OBJECT__KOWNED_TAGS:
				return kOwnedTags != null && !kOwnedTags.isEmpty();
			case StructurePackage.OBJECT__KTYPE:
				return kType != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectImpl
