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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.ModelElementTypeDefinition;
import org.kermeta.language.structure.ModelTransformation;
import org.kermeta.language.structure.ModelTypeDefinition;
import org.kermeta.language.structure.ModelTypeDefinitionBinding;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionImpl#getOwnedBindings <em>Owned Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionImpl#getOwnedTransformations <em>Owned Transformations</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeDefinitionImpl extends TypeDefinitionImpl implements ModelTypeDefinition {
	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Metamodel metamodel;

	/**
	 * The cached value of the '{@link #getOwnedBindings() <em>Owned Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelTypeDefinitionBinding> ownedBindings;

	/**
	 * The cached value of the '{@link #getOwnedTransformations() <em>Owned Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelTransformation> ownedTransformations;

	/**
	 * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElementTypeDefinition> typeDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODEL_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject)metamodel;
			metamodel = (Metamodel)eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.MODEL_TYPE_DEFINITION__METAMODEL, oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(Metamodel newMetamodel) {
		Metamodel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TYPE_DEFINITION__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelTypeDefinitionBinding> getOwnedBindings() {
		if (ownedBindings == null) {
			ownedBindings = new EObjectContainmentEList<ModelTypeDefinitionBinding>(ModelTypeDefinitionBinding.class, this, StructurePackage.MODEL_TYPE_DEFINITION__OWNED_BINDINGS);
		}
		return ownedBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelTransformation> getOwnedTransformations() {
		if (ownedTransformations == null) {
			ownedTransformations = new EObjectContainmentWithInverseEList<ModelTransformation>(ModelTransformation.class, this, StructurePackage.MODEL_TYPE_DEFINITION__OWNED_TRANSFORMATIONS, StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION);
		}
		return ownedTransformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElementTypeDefinition> getTypeDefinitions() {
		if (typeDefinitions == null) {
			typeDefinitions = new EObjectResolvingEList<ModelElementTypeDefinition>(ModelElementTypeDefinition.class, this, StructurePackage.MODEL_TYPE_DEFINITION__TYPE_DEFINITIONS);
		}
		return typeDefinitions;
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
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_TRANSFORMATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTransformations()).basicAdd(otherEnd, msgs);
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
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_BINDINGS:
				return ((InternalEList<?>)getOwnedBindings()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_TRANSFORMATIONS:
				return ((InternalEList<?>)getOwnedTransformations()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.MODEL_TYPE_DEFINITION__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_BINDINGS:
				return getOwnedBindings();
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_TRANSFORMATIONS:
				return getOwnedTransformations();
			case StructurePackage.MODEL_TYPE_DEFINITION__TYPE_DEFINITIONS:
				return getTypeDefinitions();
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
			case StructurePackage.MODEL_TYPE_DEFINITION__METAMODEL:
				setMetamodel((Metamodel)newValue);
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_BINDINGS:
				getOwnedBindings().clear();
				getOwnedBindings().addAll((Collection<? extends ModelTypeDefinitionBinding>)newValue);
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_TRANSFORMATIONS:
				getOwnedTransformations().clear();
				getOwnedTransformations().addAll((Collection<? extends ModelTransformation>)newValue);
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				getTypeDefinitions().addAll((Collection<? extends ModelElementTypeDefinition>)newValue);
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
			case StructurePackage.MODEL_TYPE_DEFINITION__METAMODEL:
				setMetamodel((Metamodel)null);
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_BINDINGS:
				getOwnedBindings().clear();
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_TRANSFORMATIONS:
				getOwnedTransformations().clear();
				return;
			case StructurePackage.MODEL_TYPE_DEFINITION__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
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
			case StructurePackage.MODEL_TYPE_DEFINITION__METAMODEL:
				return metamodel != null;
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_BINDINGS:
				return ownedBindings != null && !ownedBindings.isEmpty();
			case StructurePackage.MODEL_TYPE_DEFINITION__OWNED_TRANSFORMATIONS:
				return ownedTransformations != null && !ownedTransformations.isEmpty();
			case StructurePackage.MODEL_TYPE_DEFINITION__TYPE_DEFINITIONS:
				return typeDefinitions != null && !typeDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelTypeDefinitionImpl
