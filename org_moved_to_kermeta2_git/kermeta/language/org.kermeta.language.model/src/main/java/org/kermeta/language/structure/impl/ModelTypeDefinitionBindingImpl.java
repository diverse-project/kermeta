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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.ClassDefinitionBinding;
import org.kermeta.language.structure.EnumerationBinding;
import org.kermeta.language.structure.ModelTransformation;
import org.kermeta.language.structure.ModelTypeDefinition;
import org.kermeta.language.structure.ModelTypeDefinitionBinding;
import org.kermeta.language.structure.ModelTypeDefinitionContainer;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.UseAdaptationOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionBindingImpl#getOwnedModelTypeDefinitions <em>Owned Model Type Definitions</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionBindingImpl#getOwnedClassDefinitionBindings <em>Owned Class Definition Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionBindingImpl#getUsedAdaptationOperators <em>Used Adaptation Operators</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionBindingImpl#getOwnedEnumerationBindings <em>Owned Enumeration Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionBindingImpl#getBoundModelTypeDefinition <em>Bound Model Type Definition</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionBindingImpl#getTargetedTransformations <em>Targeted Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeDefinitionBindingImpl extends KermetaModelElementImpl implements ModelTypeDefinitionBinding {
	/**
	 * The cached value of the '{@link #getOwnedModelTypeDefinitions() <em>Owned Model Type Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModelTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelTypeDefinition> ownedModelTypeDefinitions;

	/**
	 * The cached value of the '{@link #getOwnedClassDefinitionBindings() <em>Owned Class Definition Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedClassDefinitionBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinitionBinding> ownedClassDefinitionBindings;

	/**
	 * The cached value of the '{@link #getUsedAdaptationOperators() <em>Used Adaptation Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedAdaptationOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<UseAdaptationOperator> usedAdaptationOperators;

	/**
	 * The cached value of the '{@link #getOwnedEnumerationBindings() <em>Owned Enumeration Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumerationBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationBinding> ownedEnumerationBindings;

	/**
	 * The cached value of the '{@link #getBoundModelTypeDefinition() <em>Bound Model Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundModelTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected ModelTypeDefinition boundModelTypeDefinition;

	/**
	 * The cached value of the '{@link #getTargetedTransformations() <em>Targeted Transformations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelTransformation> targetedTransformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeDefinitionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODEL_TYPE_DEFINITION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelTypeDefinition> getOwnedModelTypeDefinitions() {
		if (ownedModelTypeDefinitions == null) {
			ownedModelTypeDefinitions = new EObjectContainmentEList<ModelTypeDefinition>(ModelTypeDefinition.class, this, StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_MODEL_TYPE_DEFINITIONS);
		}
		return ownedModelTypeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDefinitionBinding> getOwnedClassDefinitionBindings() {
		if (ownedClassDefinitionBindings == null) {
			ownedClassDefinitionBindings = new EObjectContainmentEList<ClassDefinitionBinding>(ClassDefinitionBinding.class, this, StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_CLASS_DEFINITION_BINDINGS);
		}
		return ownedClassDefinitionBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseAdaptationOperator> getUsedAdaptationOperators() {
		if (usedAdaptationOperators == null) {
			usedAdaptationOperators = new EObjectContainmentEList<UseAdaptationOperator>(UseAdaptationOperator.class, this, StructurePackage.MODEL_TYPE_DEFINITION_BINDING__USED_ADAPTATION_OPERATORS);
		}
		return usedAdaptationOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationBinding> getOwnedEnumerationBindings() {
		if (ownedEnumerationBindings == null) {
			ownedEnumerationBindings = new EObjectContainmentEList<EnumerationBinding>(EnumerationBinding.class, this, StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_ENUMERATION_BINDINGS);
		}
		return ownedEnumerationBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeDefinition getBoundModelTypeDefinition() {
		if (boundModelTypeDefinition != null && boundModelTypeDefinition.eIsProxy()) {
			InternalEObject oldBoundModelTypeDefinition = (InternalEObject)boundModelTypeDefinition;
			boundModelTypeDefinition = (ModelTypeDefinition)eResolveProxy(oldBoundModelTypeDefinition);
			if (boundModelTypeDefinition != oldBoundModelTypeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.MODEL_TYPE_DEFINITION_BINDING__BOUND_MODEL_TYPE_DEFINITION, oldBoundModelTypeDefinition, boundModelTypeDefinition));
			}
		}
		return boundModelTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeDefinition basicGetBoundModelTypeDefinition() {
		return boundModelTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundModelTypeDefinition(ModelTypeDefinition newBoundModelTypeDefinition) {
		ModelTypeDefinition oldBoundModelTypeDefinition = boundModelTypeDefinition;
		boundModelTypeDefinition = newBoundModelTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TYPE_DEFINITION_BINDING__BOUND_MODEL_TYPE_DEFINITION, oldBoundModelTypeDefinition, boundModelTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelTransformation> getTargetedTransformations() {
		if (targetedTransformations == null) {
			targetedTransformations = new EObjectResolvingEList<ModelTransformation>(ModelTransformation.class, this, StructurePackage.MODEL_TYPE_DEFINITION_BINDING__TARGETED_TRANSFORMATIONS);
		}
		return targetedTransformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_MODEL_TYPE_DEFINITIONS:
				return ((InternalEList<?>)getOwnedModelTypeDefinitions()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				return ((InternalEList<?>)getOwnedClassDefinitionBindings()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__USED_ADAPTATION_OPERATORS:
				return ((InternalEList<?>)getUsedAdaptationOperators()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_ENUMERATION_BINDINGS:
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
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_MODEL_TYPE_DEFINITIONS:
				return getOwnedModelTypeDefinitions();
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				return getOwnedClassDefinitionBindings();
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__USED_ADAPTATION_OPERATORS:
				return getUsedAdaptationOperators();
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_ENUMERATION_BINDINGS:
				return getOwnedEnumerationBindings();
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__BOUND_MODEL_TYPE_DEFINITION:
				if (resolve) return getBoundModelTypeDefinition();
				return basicGetBoundModelTypeDefinition();
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__TARGETED_TRANSFORMATIONS:
				return getTargetedTransformations();
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
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_MODEL_TYPE_DEFINITIONS:
				getOwnedModelTypeDefinitions().clear();
				getOwnedModelTypeDefinitions().addAll((Collection<? extends ModelTypeDefinition>)newValue);
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				getOwnedClassDefinitionBindings().clear();
				getOwnedClassDefinitionBindings().addAll((Collection<? extends ClassDefinitionBinding>)newValue);
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__USED_ADAPTATION_OPERATORS:
				getUsedAdaptationOperators().clear();
				getUsedAdaptationOperators().addAll((Collection<? extends UseAdaptationOperator>)newValue);
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_ENUMERATION_BINDINGS:
				getOwnedEnumerationBindings().clear();
				getOwnedEnumerationBindings().addAll((Collection<? extends EnumerationBinding>)newValue);
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__BOUND_MODEL_TYPE_DEFINITION:
				setBoundModelTypeDefinition((ModelTypeDefinition)newValue);
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__TARGETED_TRANSFORMATIONS:
				getTargetedTransformations().clear();
				getTargetedTransformations().addAll((Collection<? extends ModelTransformation>)newValue);
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
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_MODEL_TYPE_DEFINITIONS:
				getOwnedModelTypeDefinitions().clear();
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				getOwnedClassDefinitionBindings().clear();
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__USED_ADAPTATION_OPERATORS:
				getUsedAdaptationOperators().clear();
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_ENUMERATION_BINDINGS:
				getOwnedEnumerationBindings().clear();
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__BOUND_MODEL_TYPE_DEFINITION:
				setBoundModelTypeDefinition((ModelTypeDefinition)null);
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__TARGETED_TRANSFORMATIONS:
				getTargetedTransformations().clear();
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
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_MODEL_TYPE_DEFINITIONS:
				return ownedModelTypeDefinitions != null && !ownedModelTypeDefinitions.isEmpty();
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
				return ownedClassDefinitionBindings != null && !ownedClassDefinitionBindings.isEmpty();
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__USED_ADAPTATION_OPERATORS:
				return usedAdaptationOperators != null && !usedAdaptationOperators.isEmpty();
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_ENUMERATION_BINDINGS:
				return ownedEnumerationBindings != null && !ownedEnumerationBindings.isEmpty();
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__BOUND_MODEL_TYPE_DEFINITION:
				return boundModelTypeDefinition != null;
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__TARGETED_TRANSFORMATIONS:
				return targetedTransformations != null && !targetedTransformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelTypeDefinitionContainer.class) {
			switch (derivedFeatureID) {
				case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_MODEL_TYPE_DEFINITIONS: return StructurePackage.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelTypeDefinitionContainer.class) {
			switch (baseFeatureID) {
				case StructurePackage.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS: return StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_MODEL_TYPE_DEFINITIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ModelTypeDefinitionBindingImpl
