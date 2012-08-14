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

import org.kermeta.language.structure.ComplexOperationBinding;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.ParameterBinding;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Operation Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexOperationBindingImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexOperationBindingImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexOperationBindingImpl#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexOperationBindingImpl extends OperationBindingImpl implements ComplexOperationBinding {
	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> targets;

	/**
	 * The cached value of the '{@link #getOwnedParameterBindings() <em>Owned Parameter Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> ownedParameterBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexOperationBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.COMPLEX_OPERATION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<Operation>(Operation.class, this, StructurePackage.COMPLEX_OPERATION_BINDING__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<Operation>(Operation.class, this, StructurePackage.COMPLEX_OPERATION_BINDING__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getOwnedParameterBindings() {
		if (ownedParameterBindings == null) {
			ownedParameterBindings = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, StructurePackage.COMPLEX_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS);
		}
		return ownedParameterBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.COMPLEX_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS:
				return ((InternalEList<?>)getOwnedParameterBindings()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.COMPLEX_OPERATION_BINDING__SOURCES:
				return getSources();
			case StructurePackage.COMPLEX_OPERATION_BINDING__TARGETS:
				return getTargets();
			case StructurePackage.COMPLEX_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS:
				return getOwnedParameterBindings();
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
			case StructurePackage.COMPLEX_OPERATION_BINDING__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Operation>)newValue);
				return;
			case StructurePackage.COMPLEX_OPERATION_BINDING__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Operation>)newValue);
				return;
			case StructurePackage.COMPLEX_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS:
				getOwnedParameterBindings().clear();
				getOwnedParameterBindings().addAll((Collection<? extends ParameterBinding>)newValue);
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
			case StructurePackage.COMPLEX_OPERATION_BINDING__SOURCES:
				getSources().clear();
				return;
			case StructurePackage.COMPLEX_OPERATION_BINDING__TARGETS:
				getTargets().clear();
				return;
			case StructurePackage.COMPLEX_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS:
				getOwnedParameterBindings().clear();
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
			case StructurePackage.COMPLEX_OPERATION_BINDING__SOURCES:
				return sources != null && !sources.isEmpty();
			case StructurePackage.COMPLEX_OPERATION_BINDING__TARGETS:
				return targets != null && !targets.isEmpty();
			case StructurePackage.COMPLEX_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS:
				return ownedParameterBindings != null && !ownedParameterBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexOperationBindingImpl
