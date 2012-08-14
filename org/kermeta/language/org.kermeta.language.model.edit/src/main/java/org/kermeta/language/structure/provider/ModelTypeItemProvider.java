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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.kermeta.language.structure.ModelType;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;

/**
 * This is the item provider adapter for a {@link org.kermeta.language.structure.ModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTypeItemProvider
	extends TypeItemProvider
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
	public ModelTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addSuperTypePropertyDescriptor(object);
			addIsAspectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 StructurePackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeDefinition_superType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeDefinition_superType_feature", "_UI_TypeDefinition_type"),
				 StructurePackage.Literals.TYPE_DEFINITION__SUPER_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Aspect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAspectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeDefinition_isAspect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeDefinition_isAspect_feature", "_UI_TypeDefinition_type"),
				 StructurePackage.Literals.TYPE_DEFINITION__IS_ASPECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE);
			childrenFeatures.add(StructurePackage.Literals.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION);
			childrenFeatures.add(StructurePackage.Literals.MODEL_TYPE__OWNED_BINDINGS);
			childrenFeatures.add(StructurePackage.Literals.MODEL_TYPE__OWNED_PACKAGES);
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
	 * This returns ModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelType_type") :
			getString("_UI_ModelType_type") + " " + label;
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

		switch (notification.getFeatureID(ModelType.class)) {
			case StructurePackage.MODEL_TYPE__NAME:
			case StructurePackage.MODEL_TYPE__IS_ASPECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StructurePackage.MODEL_TYPE__CONTAINED_TYPE:
			case StructurePackage.MODEL_TYPE__OWNED_TYPE_DEFINITION:
			case StructurePackage.MODEL_TYPE__OWNED_BINDINGS:
			case StructurePackage.MODEL_TYPE__OWNED_PACKAGES:
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
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createObjectTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createModelTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createVirtualType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createUnresolvedType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createProductType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createUnresolvedInferredType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createUnresolvedTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION,
				 StructureFactory.eINSTANCE.createTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION,
				 StructureFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION,
				 StructureFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION,
				 StructureFactory.eINSTANCE.createClassDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION,
				 StructureFactory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TYPE__OWNED_BINDINGS,
				 StructureFactory.eINSTANCE.createSimpleBinding()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TYPE__OWNED_BINDINGS,
				 StructureFactory.eINSTANCE.createAdaptationBinding()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.MODEL_TYPE__OWNED_PACKAGES,
				 StructureFactory.eINSTANCE.createPackage()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE ||
			childFeature == StructurePackage.Literals.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
