/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.kermeta.language.structure.ModelTypeDefinitionBinding;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;

/**
 * This is the item provider adapter for a {@link org.kermeta.language.structure.ModelTypeDefinitionBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTypeDefinitionBindingItemProvider
	extends KermetaModelElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeDefinitionBindingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBoundModelTypeDefinitionPropertyDescriptor(object);
			addTargetedTransformationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bound Model Type Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoundModelTypeDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelTypeDefinitionBinding_boundModelTypeDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelTypeDefinitionBinding_boundModelTypeDefinition_feature", "_UI_ModelTypeDefinitionBinding_type"),
				 StructurePackage.Literals.MODEL_TYPE_DEFINITION_BINDING__BOUND_MODEL_TYPE_DEFINITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Targeted Transformations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetedTransformationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelTypeDefinitionBinding_targetedTransformations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelTypeDefinitionBinding_targetedTransformations_feature", "_UI_ModelTypeDefinitionBinding_type"),
				 StructurePackage.Literals.MODEL_TYPE_DEFINITION_BINDING__TARGETED_TRANSFORMATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StructurePackage.Literals.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS);
			childrenFeatures.add(StructurePackage.Literals.MODEL_TYPE_DEFINITION_BINDING__OWNED_CLASS_DEFINITION_BINDINGS);
			childrenFeatures.add(StructurePackage.Literals.MODEL_TYPE_DEFINITION_BINDING__USED_ADAPTATION_OPERATORS);
			childrenFeatures.add(StructurePackage.Literals.MODEL_TYPE_DEFINITION_BINDING__OWNED_ENUMERATION_BINDINGS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ModelTypeDefinitionBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelTypeDefinitionBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ModelTypeDefinitionBinding_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ModelTypeDefinitionBinding.class)) {
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_MODEL_TYPE_DEFINITIONS:
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_CLASS_DEFINITION_BINDINGS:
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__USED_ADAPTATION_OPERATORS:
			case StructurePackage.MODEL_TYPE_DEFINITION_BINDING__OWNED_ENUMERATION_BINDINGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS,
				 StructureFactory.eINSTANCE.createModelTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS,
				 StructureFactory.eINSTANCE.createUnresolvedModelTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TYPE_DEFINITION_BINDING__OWNED_CLASS_DEFINITION_BINDINGS,
				 StructureFactory.eINSTANCE.createClassDefinitionBinding()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TYPE_DEFINITION_BINDING__USED_ADAPTATION_OPERATORS,
				 StructureFactory.eINSTANCE.createUseAdaptationOperator()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TYPE_DEFINITION_BINDING__OWNED_ENUMERATION_BINDINGS,
				 StructureFactory.eINSTANCE.createEnumerationBinding()));
	}

}
