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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.SimpleOperationBinding;
import org.kermeta.language.structure.SimpleParameterBinding;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Operation Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.SimpleOperationBindingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.SimpleOperationBindingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.SimpleOperationBindingImpl#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleOperationBindingImpl extends OperationBindingImpl implements SimpleOperationBinding {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Operation source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Operation target;

	/**
	 * The cached value of the '{@link #getOwnedParameterBindings() <em>Owned Parameter Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleParameterBinding> ownedParameterBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleOperationBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.SIMPLE_OPERATION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Operation)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.SIMPLE_OPERATION_BINDING__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Operation newSource) {
		Operation oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.SIMPLE_OPERATION_BINDING__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Operation)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.SIMPLE_OPERATION_BINDING__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Operation newTarget) {
		Operation oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.SIMPLE_OPERATION_BINDING__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleParameterBinding> getOwnedParameterBindings() {
		if (ownedParameterBindings == null) {
			ownedParameterBindings = new EObjectContainmentEList<SimpleParameterBinding>(SimpleParameterBinding.class, this, StructurePackage.SIMPLE_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS);
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
			case StructurePackage.SIMPLE_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS:
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
			case StructurePackage.SIMPLE_OPERATION_BINDING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StructurePackage.SIMPLE_OPERATION_BINDING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StructurePackage.SIMPLE_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS:
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
			case StructurePackage.SIMPLE_OPERATION_BINDING__SOURCE:
				setSource((Operation)newValue);
				return;
			case StructurePackage.SIMPLE_OPERATION_BINDING__TARGET:
				setTarget((Operation)newValue);
				return;
			case StructurePackage.SIMPLE_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS:
				getOwnedParameterBindings().clear();
				getOwnedParameterBindings().addAll((Collection<? extends SimpleParameterBinding>)newValue);
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
			case StructurePackage.SIMPLE_OPERATION_BINDING__SOURCE:
				setSource((Operation)null);
				return;
			case StructurePackage.SIMPLE_OPERATION_BINDING__TARGET:
				setTarget((Operation)null);
				return;
			case StructurePackage.SIMPLE_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS:
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
			case StructurePackage.SIMPLE_OPERATION_BINDING__SOURCE:
				return source != null;
			case StructurePackage.SIMPLE_OPERATION_BINDING__TARGET:
				return target != null;
			case StructurePackage.SIMPLE_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS:
				return ownedParameterBindings != null && !ownedParameterBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleOperationBindingImpl
