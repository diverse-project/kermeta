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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.SimpleBinding;
import org.kermeta.language.structure.SimpleClassDefinitionBinding;
import org.kermeta.language.structure.SimpleEnumerationBinding;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.SimpleBindingImpl#getOwnedClassDefinitionBindings <em>Owned Class Definition Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.SimpleBindingImpl#getOwnedEnumerationBindings <em>Owned Enumeration Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleBindingImpl extends ModelTypeBindingImpl implements SimpleBinding {
	/**
	 * The cached value of the '{@link #getOwnedClassDefinitionBindings() <em>Owned Class Definition Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedClassDefinitionBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleClassDefinitionBinding> ownedClassDefinitionBindings;

	/**
	 * The cached value of the '{@link #getOwnedEnumerationBindings() <em>Owned Enumeration Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumerationBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleEnumerationBinding> ownedEnumerationBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.SIMPLE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleClassDefinitionBinding> getOwnedClassDefinitionBindings() {
		if (ownedClassDefinitionBindings == null) {
			ownedClassDefinitionBindings = new EObjectContainmentEList<SimpleClassDefinitionBinding>(SimpleClassDefinitionBinding.class, this, StructurePackage.SIMPLE_BINDING__OWNED_CLASS_DEFINITION_BINDINGS);
		}
		return ownedClassDefinitionBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleEnumerationBinding> getOwnedEnumerationBindings() {
		if (ownedEnumerationBindings == null) {
			ownedEnumerationBindings = new EObjectContainmentEList<SimpleEnumerationBinding>(SimpleEnumerationBinding.class, this, StructurePackage.SIMPLE_BINDING__OWNED_ENUMERATION_BINDINGS);
		}
		return ownedEnumerationBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.SIMPLE_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				return ((InternalEList<?>)getOwnedClassDefinitionBindings()).basicRemove(otherEnd, msgs);
			case StructurePackage.SIMPLE_BINDING__OWNED_ENUMERATION_BINDINGS:
				return ((InternalEList<?>)getOwnedEnumerationBindings()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.SIMPLE_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				return getOwnedClassDefinitionBindings();
			case StructurePackage.SIMPLE_BINDING__OWNED_ENUMERATION_BINDINGS:
				return getOwnedEnumerationBindings();
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
			case StructurePackage.SIMPLE_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				getOwnedClassDefinitionBindings().clear();
				getOwnedClassDefinitionBindings().addAll((Collection<? extends SimpleClassDefinitionBinding>)newValue);
				return;
			case StructurePackage.SIMPLE_BINDING__OWNED_ENUMERATION_BINDINGS:
				getOwnedEnumerationBindings().clear();
				getOwnedEnumerationBindings().addAll((Collection<? extends SimpleEnumerationBinding>)newValue);
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
			case StructurePackage.SIMPLE_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				getOwnedClassDefinitionBindings().clear();
				return;
			case StructurePackage.SIMPLE_BINDING__OWNED_ENUMERATION_BINDINGS:
				getOwnedEnumerationBindings().clear();
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
			case StructurePackage.SIMPLE_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				return ownedClassDefinitionBindings != null && !ownedClassDefinitionBindings.isEmpty();
			case StructurePackage.SIMPLE_BINDING__OWNED_ENUMERATION_BINDINGS:
				return ownedEnumerationBindings != null && !ownedEnumerationBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleBindingImpl
