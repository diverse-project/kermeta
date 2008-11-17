/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComposerItemProvider.java,v 1.1.1.1 2008-11-17 15:37:25 mclavreu Exp $
 */
package kompose.provider;


import java.util.Collection;
import java.util.List;

import kompose.Composer;
import kompose.KomposeFactory;
import kompose.KomposePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link kompose.Composer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComposerItemProvider
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
	public ComposerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPrimaryModelURIPropertyDescriptor(object);
			addAspectModelURIPropertyDescriptor(object);
			addComposedModelURIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Primary Model URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryModelURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Composer_primaryModelURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Composer_primaryModelURI_feature", "_UI_Composer_type"),
				 KomposePackage.Literals.COMPOSER__PRIMARY_MODEL_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aspect Model URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAspectModelURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Composer_aspectModelURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Composer_aspectModelURI_feature", "_UI_Composer_type"),
				 KomposePackage.Literals.COMPOSER__ASPECT_MODEL_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Composed Model URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComposedModelURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Composer_composedModelURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Composer_composedModelURI_feature", "_UI_Composer_type"),
				 KomposePackage.Literals.COMPOSER__COMPOSED_MODEL_URI,
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(KomposePackage.Literals.COMPOSER__PREDIRECTIVES_PM);
			childrenFeatures.add(KomposePackage.Literals.COMPOSER__POSTDIRECTIVES);
			childrenFeatures.add(KomposePackage.Literals.COMPOSER__PREDIRECTIVES_AM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Composer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Composer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Composer)object).getPrimaryModelURI();
		return label == null || label.length() == 0 ?
			getString("_UI_Composer_type") :
			getString("_UI_Composer_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Composer.class)) {
			case KomposePackage.COMPOSER__PRIMARY_MODEL_URI:
			case KomposePackage.COMPOSER__ASPECT_MODEL_URI:
			case KomposePackage.COMPOSER__COMPOSED_MODEL_URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case KomposePackage.COMPOSER__PREDIRECTIVES_PM:
			case KomposePackage.COMPOSER__POSTDIRECTIVES:
			case KomposePackage.COMPOSER__PREDIRECTIVES_AM:
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__PREDIRECTIVES_PM,
				 KomposeFactory.eINSTANCE.createRemove()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__PREDIRECTIVES_PM,
				 KomposeFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__PREDIRECTIVES_PM,
				 KomposeFactory.eINSTANCE.createCreate()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__PREDIRECTIVES_PM,
				 KomposeFactory.eINSTANCE.createSet()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__POSTDIRECTIVES,
				 KomposeFactory.eINSTANCE.createRemove()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__POSTDIRECTIVES,
				 KomposeFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__POSTDIRECTIVES,
				 KomposeFactory.eINSTANCE.createCreate()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__POSTDIRECTIVES,
				 KomposeFactory.eINSTANCE.createSet()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__PREDIRECTIVES_AM,
				 KomposeFactory.eINSTANCE.createRemove()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__PREDIRECTIVES_AM,
				 KomposeFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__PREDIRECTIVES_AM,
				 KomposeFactory.eINSTANCE.createCreate()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.COMPOSER__PREDIRECTIVES_AM,
				 KomposeFactory.eINSTANCE.createSet()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == KomposePackage.Literals.COMPOSER__PREDIRECTIVES_PM ||
			childFeature == KomposePackage.Literals.COMPOSER__POSTDIRECTIVES ||
			childFeature == KomposePackage.Literals.COMPOSER__PREDIRECTIVES_AM;

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
	public ResourceLocator getResourceLocator() {
		return KomposeEditPlugin.INSTANCE;
	}

}
