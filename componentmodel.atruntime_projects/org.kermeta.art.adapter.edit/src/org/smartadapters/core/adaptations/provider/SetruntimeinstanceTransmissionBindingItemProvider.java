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
import org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding;

import org.smartadapters.core.provider.Runtime_AOM_Framework1EditPlugin;
import org.smartadapters.core.provider.setAdaptationItemProvider;

/**
 * This is the item provider adapter for a {@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SetruntimeinstanceTransmissionBindingItemProvider
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
	public SetruntimeinstanceTransmissionBindingItemProvider(AdapterFactory adapterFactory) {
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

			addTransmissionBindingToSetPropertyDescriptor(object);
			addRefclientPropertyDescriptor(object);
			addRefserverPropertyDescriptor(object);
			addRefserverInstancePropertyDescriptor(object);
			addRefIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Transmission Binding To Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransmissionBindingToSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstanceTransmissionBinding_TransmissionBindingToSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstanceTransmissionBinding_TransmissionBindingToSet_feature", "_UI_SetruntimeinstanceTransmissionBinding_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refclient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefclientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstanceTransmissionBinding_refclient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstanceTransmissionBinding_refclient_feature", "_UI_SetruntimeinstanceTransmissionBinding_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refserver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefserverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstanceTransmissionBinding_refserver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstanceTransmissionBinding_refserver_feature", "_UI_SetruntimeinstanceTransmissionBinding_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refserver Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefserverInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstanceTransmissionBinding_refserverInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstanceTransmissionBinding_refserverInstance_feature", "_UI_SetruntimeinstanceTransmissionBinding_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ref Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SetruntimeinstanceTransmissionBinding_refId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SetruntimeinstanceTransmissionBinding_refId_feature", "_UI_SetruntimeinstanceTransmissionBinding_type"),
				 AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SetruntimeinstanceTransmissionBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SetruntimeinstanceTransmissionBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SetruntimeinstanceTransmissionBinding)object).getRefId();
		return label == null || label.length() == 0 ?
			getString("_UI_SetruntimeinstanceTransmissionBinding_type") :
			getString("_UI_SetruntimeinstanceTransmissionBinding_type") + " " + label;
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

		switch (notification.getFeatureID(SetruntimeinstanceTransmissionBinding.class)) {
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID:
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
