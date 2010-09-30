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

import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.Art2Package;
import org.kermeta.art2.ComponentType;

/**
 * This is the item provider adapter for a {@link org.kermeta.art2.ComponentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentTypeItemProvider
	extends TypeDefinitionItemProvider
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
	public ComponentTypeItemProvider(AdapterFactory adapterFactory) {
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

			addStartMethodPropertyDescriptor(object);
			addStopMethodPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Start Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentType_startMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_startMethod_feature", "_UI_ComponentType_type"),
				 Art2Package.Literals.COMPONENT_TYPE__START_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stop Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStopMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentType_stopMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_stopMethod_feature", "_UI_ComponentType_type"),
				 Art2Package.Literals.COMPONENT_TYPE__STOP_METHOD,
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
			childrenFeatures.add(Art2Package.Literals.COMPONENT_TYPE__DICTIONARY);
			childrenFeatures.add(Art2Package.Literals.COMPONENT_TYPE__REQUIRED);
			childrenFeatures.add(Art2Package.Literals.COMPONENT_TYPE__INTEGRATION_PATTERNS);
			childrenFeatures.add(Art2Package.Literals.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES);
			childrenFeatures.add(Art2Package.Literals.COMPONENT_TYPE__PROVIDED);
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
	 * This returns ComponentType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentType_type") :
			getString("_UI_ComponentType_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentType.class)) {
			case Art2Package.COMPONENT_TYPE__START_METHOD:
			case Art2Package.COMPONENT_TYPE__STOP_METHOD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Art2Package.COMPONENT_TYPE__DICTIONARY:
			case Art2Package.COMPONENT_TYPE__REQUIRED:
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
			case Art2Package.COMPONENT_TYPE__PROVIDED:
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
				(Art2Package.Literals.COMPONENT_TYPE__DICTIONARY,
				 Art2Factory.eINSTANCE.createDictionaryType()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.COMPONENT_TYPE__REQUIRED,
				 Art2Factory.eINSTANCE.createPortTypeRef()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.COMPONENT_TYPE__INTEGRATION_PATTERNS,
				 Art2Factory.eINSTANCE.createIntegrationPattern()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES,
				 Art2Factory.eINSTANCE.createExtraFonctionalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Art2Package.Literals.COMPONENT_TYPE__PROVIDED,
				 Art2Factory.eINSTANCE.createPortTypeRef()));
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
			childFeature == Art2Package.Literals.COMPONENT_TYPE__REQUIRED ||
			childFeature == Art2Package.Literals.COMPONENT_TYPE__PROVIDED;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
