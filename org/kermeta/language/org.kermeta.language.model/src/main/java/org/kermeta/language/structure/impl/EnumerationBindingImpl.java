/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.EnumLiteralbinding;
import org.kermeta.language.structure.EnumerationBinding;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.EnumerationBindingImpl#getOwnedEnumLiteralBindings <em>Owned Enum Literal Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EnumerationBindingImpl extends KermetaModelElementImpl implements EnumerationBinding {
	/**
	 * The cached value of the '{@link #getOwnedEnumLiteralBindings() <em>Owned Enum Literal Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumLiteralBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumLiteralbinding> ownedEnumLiteralBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.ENUMERATION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumLiteralbinding> getOwnedEnumLiteralBindings() {
		if (ownedEnumLiteralBindings == null) {
			ownedEnumLiteralBindings = new EObjectContainmentEList<EnumLiteralbinding>(EnumLiteralbinding.class, this, StructurePackage.ENUMERATION_BINDING__OWNED_ENUM_LITERAL_BINDINGS);
		}
		return ownedEnumLiteralBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.ENUMERATION_BINDING__OWNED_ENUM_LITERAL_BINDINGS:
				return ((InternalEList<?>)getOwnedEnumLiteralBindings()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.ENUMERATION_BINDING__OWNED_ENUM_LITERAL_BINDINGS:
				return getOwnedEnumLiteralBindings();
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
			case StructurePackage.ENUMERATION_BINDING__OWNED_ENUM_LITERAL_BINDINGS:
				getOwnedEnumLiteralBindings().clear();
				getOwnedEnumLiteralBindings().addAll((Collection<? extends EnumLiteralbinding>)newValue);
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
			case StructurePackage.ENUMERATION_BINDING__OWNED_ENUM_LITERAL_BINDINGS:
				getOwnedEnumLiteralBindings().clear();
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
			case StructurePackage.ENUMERATION_BINDING__OWNED_ENUM_LITERAL_BINDINGS:
				return ownedEnumLiteralBindings != null && !ownedEnumLiteralBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumerationBindingImpl
