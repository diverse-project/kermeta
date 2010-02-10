/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.smartadapters.core.adaptations.AdaptationsPackage;
import org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance;

import org.smartadapters.core.provider.Runtime_AOM_Framework1EditPlugin;
import org.smartadapters.core.provider.setAdaptationItemProvider;

/**
 * This is the item provider adapter for a {@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SetruntimeinstancePrimitiveInstanceItemProvider
	extends setAdaptationItemProvider
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
	public SetruntimeinstancePrimitiveInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addPrimitiveInstanceToSetPropertyDescriptor(object);
			addReftypePropertyDescriptor(object);
			addRefstatePropertyDescriptor(object);
			addRefsuperComponentPropertyDescriptor(object);
			addRefattributePropertyDescriptor(object);
			addRefbindingPropertyDescriptor(object);
			addRefnamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Primitive Instance To Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimitiveInstanceToSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstancePrimitiveInstance_PrimitiveInstanceToSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstancePrimitiveInstance_PrimitiveInstanceToSet_feature", "_UI_SetruntimeinstancePrimitiveInstance_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reftype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReftypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstancePrimitiveInstance_reftype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstancePrimitiveInstance_reftype_feature", "_UI_SetruntimeinstancePrimitiveInstance_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refstate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstancePrimitiveInstance_refstate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstancePrimitiveInstance_refstate_feature", "_UI_SetruntimeinstancePrimitiveInstance_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refsuper Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefsuperComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstancePrimitiveInstance_refsuperComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstancePrimitiveInstance_refsuperComponent_feature", "_UI_SetruntimeinstancePrimitiveInstance_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refattribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefattributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstancePrimitiveInstance_refattribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstancePrimitiveInstance_refattribute_feature", "_UI_SetruntimeinstancePrimitiveInstance_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refbinding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefbindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstancePrimitiveInstance_refbinding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstancePrimitiveInstance_refbinding_feature", "_UI_SetruntimeinstancePrimitiveInstance_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstancePrimitiveInstance_refname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstancePrimitiveInstance_refname_feature", "_UI_SetruntimeinstancePrimitiveInstance_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SetruntimeinstancePrimitiveInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SetruntimeinstancePrimitiveInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SetruntimeinstancePrimitiveInstance)object).getRefname();
		return label == null || label.length() == 0 ?
			getString("_UI_SetruntimeinstancePrimitiveInstance_type") :
			getString("_UI_SetruntimeinstancePrimitiveInstance_type") + " " + label;
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

		switch (notification.getFeatureID(SetruntimeinstancePrimitiveInstance.class)) {
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE:
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Runtime_AOM_Framework1EditPlugin.INSTANCE;
	}

}
