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

import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.SimpleClassDefinitionBinding;
import org.kermeta.language.structure.SimpleOperationBinding;
import org.kermeta.language.structure.SimplePropertyBinding;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Class Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.SimpleClassDefinitionBindingImpl#getOwnedPropertyBindings <em>Owned Property Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.SimpleClassDefinitionBindingImpl#getOwnedOperationBindings <em>Owned Operation Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.SimpleClassDefinitionBindingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.SimpleClassDefinitionBindingImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleClassDefinitionBindingImpl extends ClassDefinitionBindingImpl implements SimpleClassDefinitionBinding {
	/**
	 * The cached value of the '{@link #getOwnedPropertyBindings() <em>Owned Property Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<SimplePropertyBinding> ownedPropertyBindings;

	/**
	 * The cached value of the '{@link #getOwnedOperationBindings() <em>Owned Operation Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleOperationBinding> ownedOperationBindings;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ClassDefinition source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ClassDefinition target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleClassDefinitionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.SIMPLE_CLASS_DEFINITION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimplePropertyBinding> getOwnedPropertyBindings() {
		if (ownedPropertyBindings == null) {
			ownedPropertyBindings = new EObjectContainmentEList<SimplePropertyBinding>(SimplePropertyBinding.class, this, StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS);
		}
		return ownedPropertyBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleOperationBinding> getOwnedOperationBindings() {
		if (ownedOperationBindings == null) {
			ownedOperationBindings = new EObjectContainmentEList<SimpleOperationBinding>(SimpleOperationBinding.class, this, StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS);
		}
		return ownedOperationBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ClassDefinition)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ClassDefinition newSource) {
		ClassDefinition oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ClassDefinition)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ClassDefinition newTarget) {
		ClassDefinition oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS:
				return ((InternalEList<?>)getOwnedPropertyBindings()).basicRemove(otherEnd, msgs);
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS:
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
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS:
				return getOwnedPropertyBindings();
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS:
				return getOwnedOperationBindings();
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS:
				getOwnedPropertyBindings().clear();
				getOwnedPropertyBindings().addAll((Collection<? extends SimplePropertyBinding>)newValue);
				return;
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS:
				getOwnedOperationBindings().clear();
				getOwnedOperationBindings().addAll((Collection<? extends SimpleOperationBinding>)newValue);
				return;
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__SOURCE:
				setSource((ClassDefinition)newValue);
				return;
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__TARGET:
				setTarget((ClassDefinition)newValue);
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
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS:
				getOwnedPropertyBindings().clear();
				return;
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS:
				getOwnedOperationBindings().clear();
				return;
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__SOURCE:
				setSource((ClassDefinition)null);
				return;
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__TARGET:
				setTarget((ClassDefinition)null);
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
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS:
				return ownedPropertyBindings != null && !ownedPropertyBindings.isEmpty();
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS:
				return ownedOperationBindings != null && !ownedOperationBindings.isEmpty();
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__SOURCE:
				return source != null;
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleClassDefinitionBindingImpl
