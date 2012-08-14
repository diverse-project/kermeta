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

import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;

/**
 * This is the item provider adapter for a {@link org.kermeta.language.structure.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider
	extends NamedElementItemProvider
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
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

			addUriPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_uri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_uri_feature", "_UI_Package_type"),
				 StructurePackage.Literals.PACKAGE__URI,
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
			childrenFeatures.add(StructurePackage.Literals.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION);
			childrenFeatures.add(StructurePackage.Literals.PACKAGE__NESTED_PACKAGE);
			childrenFeatures.add(StructurePackage.Literals.PACKAGE__OWNED_ADAPTATION_OPERATORS);
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.kermeta.language.structure.Package)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Package_type") :
			/*getString("_UI_Package_type") + " " + */label;
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

		switch (notification.getFeatureID(org.kermeta.language.structure.Package.class)) {
			case StructurePackage.PACKAGE__URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
			case StructurePackage.PACKAGE__NESTED_PACKAGE:
			case StructurePackage.PACKAGE__OWNED_ADAPTATION_OPERATORS:
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
				(StructurePackage.Literals.PACKAGE__NESTED_PACKAGE,
				 StructureFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PACKAGE__OWNED_ADAPTATION_OPERATORS,
				 StructureFactory.eINSTANCE.createAdaptationOperator()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PACKAGE__OWNED_ADAPTATION_OPERATORS,
				 StructureFactory.eINSTANCE.createPropertyAdaptationOperator()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PACKAGE__OWNED_ADAPTATION_OPERATORS,
				 StructureFactory.eINSTANCE.createUnresolvedAdaptationOperator()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PACKAGE__OWNED_ADAPTATION_OPERATORS,
				 StructureFactory.eINSTANCE.createOperationAdaptationOperator()));
	}

}
