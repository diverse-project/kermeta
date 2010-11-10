/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed.provider;


import art_relaxed.implem_relaxed.Implem_relaxedFactory;

import art_relaxed.instance_relaxed.ComponentInstance;
import art_relaxed.instance_relaxed.Instance_relaxedFactory;
import art_relaxed.instance_relaxed.Instance_relaxedPackage;

import art_relaxed.provider.ModelElementItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import smartadapters4ART.provider.Art_AOM_FrameworkEditPlugin;

/**
 * This is the item provider adapter for a {@link art_relaxed.instance_relaxed.ComponentInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInstanceItemProvider
	extends ModelElementItemProvider
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
	public ComponentInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addGroupsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_type_feature", "_UI_ComponentInstance_type"),
				 Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_state_feature", "_UI_ComponentInstance_type"),
				 Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_groups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_groups_feature", "_UI_ComponentInstance_type"),
				 Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__GROUPS,
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
			childrenFeatures.add(Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__ATTRIBUTE);
			childrenFeatures.add(Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__BINDING);
			childrenFeatures.add(Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__IMPLEM);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentInstance_type") :
			getString("_UI_ComponentInstance_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentInstance.class)) {
			case Instance_relaxedPackage.COMPONENT_INSTANCE__STATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Instance_relaxedPackage.COMPONENT_INSTANCE__ATTRIBUTE:
			case Instance_relaxedPackage.COMPONENT_INSTANCE__BINDING:
			case Instance_relaxedPackage.COMPONENT_INSTANCE__IMPLEM:
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
				(Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__ATTRIBUTE,
				 Instance_relaxedFactory.eINSTANCE.createValuedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__ATTRIBUTE,
				 Instance_relaxedFactory.eINSTANCE.createDictionaryValuedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__BINDING,
				 Instance_relaxedFactory.eINSTANCE.createTransmissionBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__IMPLEM,
				 Implem_relaxedFactory.eINSTANCE.createFractalComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Instance_relaxedPackage.Literals.COMPONENT_INSTANCE__IMPLEM,
				 Implem_relaxedFactory.eINSTANCE.createOSGiComponent()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Art_AOM_FrameworkEditPlugin.INSTANCE;
	}

}
