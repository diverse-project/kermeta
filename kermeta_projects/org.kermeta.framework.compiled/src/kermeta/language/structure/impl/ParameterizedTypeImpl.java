/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterizedTypeImpl.java,v 1.2 2008-08-19 13:23:06 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.language.structure.GenericTypeDefinition;
import kermeta.language.structure.ParameterizedType;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.TypeVariableBinding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ParameterizedTypeImpl#getTypeParamBinding <em>Type Param Binding</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ParameterizedTypeImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ParameterizedTypeImpl#getVirtualTypeBinding <em>Virtual Type Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ParameterizedTypeImpl extends TypeImpl implements
		ParameterizedType {
	/**
	 * The cached value of the '{@link #getTypeParamBinding() <em>Type Param Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParamBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariableBinding> typeParamBinding;

	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected GenericTypeDefinition typeDefinition;

	/**
	 * The cached value of the '{@link #getVirtualTypeBinding() <em>Virtual Type Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualTypeBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariableBinding> virtualTypeBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.PARAMETERIZED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariableBinding> getTypeParamBinding() {
		if (typeParamBinding == null) {
			typeParamBinding = new EObjectContainmentEList.Resolving<TypeVariableBinding>(
					TypeVariableBinding.class, this,
					StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING);
		}
		return typeParamBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTypeDefinition getTypeDefinition() {
		if (typeDefinition != null && typeDefinition.eIsProxy()) {
			InternalEObject oldTypeDefinition = (InternalEObject) typeDefinition;
			typeDefinition = (GenericTypeDefinition) eResolveProxy(oldTypeDefinition);
			if (typeDefinition != oldTypeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION,
							oldTypeDefinition, typeDefinition));
			}
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTypeDefinition basicGetTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(GenericTypeDefinition newTypeDefinition) {
		GenericTypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION,
					oldTypeDefinition, typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariableBinding> getVirtualTypeBinding() {
		if (virtualTypeBinding == null) {
			virtualTypeBinding = new EObjectContainmentEList.Resolving<TypeVariableBinding>(
					TypeVariableBinding.class, this,
					StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING);
		}
		return virtualTypeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
			return ((InternalEList<?>) getTypeParamBinding()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
			return ((InternalEList<?>) getVirtualTypeBinding()).basicRemove(
					otherEnd, msgs);
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
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
			return getTypeParamBinding();
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION:
			if (resolve)
				return getTypeDefinition();
			return basicGetTypeDefinition();
		case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
			return getVirtualTypeBinding();
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
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
			getTypeParamBinding().clear();
			getTypeParamBinding().addAll(
					(Collection<? extends TypeVariableBinding>) newValue);
			return;
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION:
			setTypeDefinition((GenericTypeDefinition) newValue);
			return;
		case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
			getVirtualTypeBinding().clear();
			getVirtualTypeBinding().addAll(
					(Collection<? extends TypeVariableBinding>) newValue);
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
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
			getTypeParamBinding().clear();
			return;
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION:
			setTypeDefinition((GenericTypeDefinition) null);
			return;
		case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
			getVirtualTypeBinding().clear();
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
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
			return typeParamBinding != null && !typeParamBinding.isEmpty();
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION:
			return typeDefinition != null;
		case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
			return virtualTypeBinding != null && !virtualTypeBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterizedTypeImpl
