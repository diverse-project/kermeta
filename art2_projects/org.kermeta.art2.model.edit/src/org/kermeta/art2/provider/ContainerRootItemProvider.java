/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.Art2Package;
import org.kermeta.art2.ContainerRoot;

/**
 * This is the item provider adapter for a {@link org.kermeta.art2.ContainerRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerRootItemProvider
	extends ItemProviderAdapter
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
	public ContainerRootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Art2Package.Literals.CONTAINER_ROOT__NODES);
			childrenFeatures.add(Art2Package.Literals.CONTAINER_ROOT__COMPONENT_TYPES);
			childrenFeatures.add(Art2Package.Literals.CONTAINER_ROOT__REPOSITORIES);
			childrenFeatures.add(Art2Package.Literals.CONTAINER_ROOT__BINDINGS);
			childrenFeatures.add(Art2Package.Literals.CONTAINER_ROOT__DATA_TYPES);
			childrenFeatures.add(Art2Package.Literals.CONTAINER_ROOT__PORT_TYPES);
			childrenFeatures.add(Art2Package.Literals.CONTAINER_ROOT__LIBRARIES);
			childrenFeatures.add(Art2Package.Literals.CONTAINER_ROOT__MESSAGE_HUB);
			childrenFeatures.add(Art2Package.Literals.CONTAINER_ROOT__MBINDINGS);
			childrenFeatures.add(Art2Package.Literals.CONTAINER_ROOT__THIRD_PARTIES);
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
	 * This returns ContainerRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContainerRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ContainerRoot_type");
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

		switch (notification.getFeatureID(ContainerRoot.class)) {
			case Art2Package.CONTAINER_ROOT__NODES:
			case Art2Package.CONTAINER_ROOT__COMPONENT_TYPES:
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
			case Art2Package.CONTAINER_ROOT__BINDINGS:
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
			case Art2Package.CONTAINER_ROOT__PORT_TYPES:
			case Art2Package.CONTAINER_ROOT__LIBRARIES:
			case Art2Package.CONTAINER_ROOT__MESSAGE_HUB:
			case Art2Package.CONTAINER_ROOT__MBINDINGS:
			case Art2Package.CONTAINER_ROOT__THIRD_PARTIES:
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
				(Art2Package.Literals.CONTAINER_ROOT__NODES,
				 Art2Factory.eINSTANCE.createContainerNode()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__COMPONENT_TYPES,
				 Art2Factory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__COMPONENT_TYPES,
				 Art2Factory.eINSTANCE.createCompositeType()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__REPOSITORIES,
				 Art2Factory.eINSTANCE.createRepository()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__BINDINGS,
				 Art2Factory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__DATA_TYPES,
				 Art2Factory.eINSTANCE.createTypedElement()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__DATA_TYPES,
				 Art2Factory.eINSTANCE.createDictionaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__PORT_TYPES,
				 Art2Factory.eINSTANCE.createServicePortType()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__PORT_TYPES,
				 Art2Factory.eINSTANCE.createMessagePortType()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__LIBRARIES,
				 Art2Factory.eINSTANCE.createComponentTypeLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__MESSAGE_HUB,
				 Art2Factory.eINSTANCE.createMessageHub()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__MESSAGE_HUB,
				 Art2Factory.eINSTANCE.createTopic()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__MESSAGE_HUB,
				 Art2Factory.eINSTANCE.createQueue()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__MBINDINGS,
				 Art2Factory.eINSTANCE.createMBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__THIRD_PARTIES,
				 Art2Factory.eINSTANCE.createDeployUnit()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__THIRD_PARTIES,
				 Art2Factory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__THIRD_PARTIES,
				 Art2Factory.eINSTANCE.createCompositeType()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.CONTAINER_ROOT__THIRD_PARTIES,
				 Art2Factory.eINSTANCE.createComponentTypeLibrary()));
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
			childFeature == Art2Package.Literals.CONTAINER_ROOT__COMPONENT_TYPES ||
			childFeature == Art2Package.Literals.CONTAINER_ROOT__THIRD_PARTIES ||
			childFeature == Art2Package.Literals.CONTAINER_ROOT__LIBRARIES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ArtEditPlugin.INSTANCE;
	}

}
