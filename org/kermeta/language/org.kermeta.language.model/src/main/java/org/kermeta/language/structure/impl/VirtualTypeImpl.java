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
import org.kermeta.language.structure.ModelElementTypeDefinition;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelTypeVariable;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.structure.TypeVariableBinding;
import org.kermeta.language.structure.VirtualType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.VirtualTypeImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.VirtualTypeImpl#getModelTypeVariable <em>Model Type Variable</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.VirtualTypeImpl#getTypeParamBinding <em>Type Param Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualTypeImpl extends ObjectTypeVariableImpl implements VirtualType {
	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected ModelElementTypeDefinition typeDefinition;

	/**
	 * The cached value of the '{@link #getModelTypeVariable() <em>Model Type Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelTypeVariable()
	 * @generated
	 * @ordered
	 */
	protected ModelTypeVariable modelTypeVariable;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.VIRTUAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementTypeDefinition getTypeDefinition() {
		if (typeDefinition != null && typeDefinition.eIsProxy()) {
			InternalEObject oldTypeDefinition = (InternalEObject)typeDefinition;
			typeDefinition = (ModelElementTypeDefinition)eResolveProxy(oldTypeDefinition);
			if (typeDefinition != oldTypeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.VIRTUAL_TYPE__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
			}
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementTypeDefinition basicGetTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(ModelElementTypeDefinition newTypeDefinition) {
		ModelElementTypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.VIRTUAL_TYPE__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeVariable getModelTypeVariable() {
		if (modelTypeVariable != null && modelTypeVariable.eIsProxy()) {
			InternalEObject oldModelTypeVariable = (InternalEObject)modelTypeVariable;
			modelTypeVariable = (ModelTypeVariable)eResolveProxy(oldModelTypeVariable);
			if (modelTypeVariable != oldModelTypeVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.VIRTUAL_TYPE__MODEL_TYPE_VARIABLE, oldModelTypeVariable, modelTypeVariable));
			}
		}
		return modelTypeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeVariable basicGetModelTypeVariable() {
		return modelTypeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelTypeVariable(ModelTypeVariable newModelTypeVariable, NotificationChain msgs) {
		ModelTypeVariable oldModelTypeVariable = modelTypeVariable;
		modelTypeVariable = newModelTypeVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.VIRTUAL_TYPE__MODEL_TYPE_VARIABLE, oldModelTypeVariable, newModelTypeVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelTypeVariable(ModelTypeVariable newModelTypeVariable) {
		if (newModelTypeVariable != modelTypeVariable) {
			NotificationChain msgs = null;
			if (modelTypeVariable != null)
				msgs = ((InternalEObject)modelTypeVariable).eInverseRemove(this, StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE, ModelTypeVariable.class, msgs);
			if (newModelTypeVariable != null)
				msgs = ((InternalEObject)newModelTypeVariable).eInverseAdd(this, StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE, ModelTypeVariable.class, msgs);
			msgs = basicSetModelTypeVariable(newModelTypeVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.VIRTUAL_TYPE__MODEL_TYPE_VARIABLE, newModelTypeVariable, newModelTypeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariableBinding> getTypeParamBinding() {
		if (typeParamBinding == null) {
			typeParamBinding = new EObjectContainmentEList<TypeVariableBinding>(TypeVariableBinding.class, this, StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING);
		}
		return typeParamBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE_VARIABLE:
				if (modelTypeVariable != null)
					msgs = ((InternalEObject)modelTypeVariable).eInverseRemove(this, StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE, ModelTypeVariable.class, msgs);
				return basicSetModelTypeVariable((ModelTypeVariable)otherEnd, msgs);
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
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE_VARIABLE:
				return basicSetModelTypeVariable(null, msgs);
			case StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING:
				return ((InternalEList<?>)getTypeParamBinding()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.VIRTUAL_TYPE__TYPE_DEFINITION:
				if (resolve) return getTypeDefinition();
				return basicGetTypeDefinition();
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE_VARIABLE:
				if (resolve) return getModelTypeVariable();
				return basicGetModelTypeVariable();
			case StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING:
				return getTypeParamBinding();
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
			case StructurePackage.VIRTUAL_TYPE__TYPE_DEFINITION:
				setTypeDefinition((ModelElementTypeDefinition)newValue);
				return;
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE_VARIABLE:
				setModelTypeVariable((ModelTypeVariable)newValue);
				return;
			case StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING:
				getTypeParamBinding().clear();
				getTypeParamBinding().addAll((Collection<? extends TypeVariableBinding>)newValue);
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
			case StructurePackage.VIRTUAL_TYPE__TYPE_DEFINITION:
				setTypeDefinition((ModelElementTypeDefinition)null);
				return;
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE_VARIABLE:
				setModelTypeVariable((ModelTypeVariable)null);
				return;
			case StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING:
				getTypeParamBinding().clear();
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
			case StructurePackage.VIRTUAL_TYPE__TYPE_DEFINITION:
				return typeDefinition != null;
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE_VARIABLE:
				return modelTypeVariable != null;
			case StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING:
				return typeParamBinding != null && !typeParamBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualTypeImpl
