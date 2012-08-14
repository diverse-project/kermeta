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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ComplexClassDefinitionBinding;
import org.kermeta.language.structure.OperationBinding;
import org.kermeta.language.structure.PropertyBinding;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Class Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexClassDefinitionBindingImpl#getOwnedPropertyBindings <em>Owned Property Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexClassDefinitionBindingImpl#getOwnedOperationBindings <em>Owned Operation Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexClassDefinitionBindingImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexClassDefinitionBindingImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexClassDefinitionBindingImpl extends ClassDefinitionBindingImpl implements ComplexClassDefinitionBinding {
	/**
	 * The cached value of the '{@link #getOwnedPropertyBindings() <em>Owned Property Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyBinding> ownedPropertyBindings;

	/**
	 * The cached value of the '{@link #getOwnedOperationBindings() <em>Owned Operation Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationBinding> ownedOperationBindings;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinition> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinition> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexClassDefinitionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.COMPLEX_CLASS_DEFINITION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyBinding> getOwnedPropertyBindings() {
		if (ownedPropertyBindings == null) {
			ownedPropertyBindings = new EObjectContainmentEList<PropertyBinding>(PropertyBinding.class, this, StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS);
		}
		return ownedPropertyBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationBinding> getOwnedOperationBindings() {
		if (ownedOperationBindings == null) {
			ownedOperationBindings = new EObjectContainmentEList<OperationBinding>(OperationBinding.class, this, StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS);
		}
		return ownedOperationBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDefinition> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<ClassDefinition>(ClassDefinition.class, this, StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDefinition> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<ClassDefinition>(ClassDefinition.class, this, StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS:
				return ((InternalEList<?>)getOwnedPropertyBindings()).basicRemove(otherEnd, msgs);
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS:
				return ((InternalEList<?>)getOwnedOperationBindings()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS:
				return getOwnedPropertyBindings();
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS:
				return getOwnedOperationBindings();
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__SOURCES:
				return getSources();
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__TARGETS:
				return getTargets();
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
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS:
				getOwnedPropertyBindings().clear();
				getOwnedPropertyBindings().addAll((Collection<? extends PropertyBinding>)newValue);
				return;
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS:
				getOwnedOperationBindings().clear();
				getOwnedOperationBindings().addAll((Collection<? extends OperationBinding>)newValue);
				return;
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends ClassDefinition>)newValue);
				return;
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends ClassDefinition>)newValue);
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
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS:
				getOwnedPropertyBindings().clear();
				return;
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS:
				getOwnedOperationBindings().clear();
				return;
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__SOURCES:
				getSources().clear();
				return;
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__TARGETS:
				getTargets().clear();
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
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS:
				return ownedPropertyBindings != null && !ownedPropertyBindings.isEmpty();
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS:
				return ownedOperationBindings != null && !ownedOperationBindings.isEmpty();
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__SOURCES:
				return sources != null && !sources.isEmpty();
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING__TARGETS:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexClassDefinitionBindingImpl
