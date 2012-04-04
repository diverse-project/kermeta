/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicer.provider;


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
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org2.kermeta.kompren.slicer.Slicer;
import org2.kermeta.kompren.slicer.SlicerFactory;
import org2.kermeta.kompren.slicer.SlicerPackage;

/**
 * This is the item provider adapter for a {@link org2.kermeta.kompren.slicer.Slicer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SlicerItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "INRIA/IRISA\nTriskell Team";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicerItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addUriMetamodelPropertyDescriptor(object);
			addActivePropertyDescriptor(object);
			addStrictPropertyDescriptor(object);
			addHelperPropertyDescriptor(object);
			addOnStartPropertyDescriptor(object);
			addOnEndPropertyDescriptor(object);
			addInputClassesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Slicer_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Slicer_name_feature", "_UI_Slicer_type"),
				 SlicerPackage.Literals.SLICER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Metamodel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriMetamodelPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Slicer_uriMetamodel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Slicer_uriMetamodel_feature", "_UI_Slicer_type"),
				 SlicerPackage.Literals.SLICER__URI_METAMODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivePropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Slicer_active_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Slicer_active_feature", "_UI_Slicer_type"),
				 SlicerPackage.Literals.SLICER__ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strict feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrictPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Slicer_strict_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Slicer_strict_feature", "_UI_Slicer_type"),
				 SlicerPackage.Literals.SLICER__STRICT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Helper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHelperPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Slicer_helper_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Slicer_helper_feature", "_UI_Slicer_type"),
				 SlicerPackage.Literals.SLICER__HELPER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnStartPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Slicer_onStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Slicer_onStart_feature", "_UI_Slicer_type"),
				 SlicerPackage.Literals.SLICER__ON_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnEndPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Slicer_onEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Slicer_onEnd_feature", "_UI_Slicer_type"),
				 SlicerPackage.Literals.SLICER__ON_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputClassesPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Slicer_inputClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Slicer_inputClasses_feature", "_UI_Slicer_type"),
				 SlicerPackage.Literals.SLICER__INPUT_CLASSES,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SlicerPackage.Literals.SLICER__CONSTRAINTS);
			childrenFeatures.add(SlicerPackage.Literals.SLICER__RADIUS);
			childrenFeatures.add(SlicerPackage.Literals.SLICER__SLICED_ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(final Object object, final Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Slicer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Slicer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(final Object object) {
		String label = ((Slicer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Slicer_type") :
			getString("_UI_Slicer_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Slicer.class)) {
			case SlicerPackage.SLICER__NAME:
			case SlicerPackage.SLICER__URI_METAMODEL:
			case SlicerPackage.SLICER__ACTIVE:
			case SlicerPackage.SLICER__STRICT:
			case SlicerPackage.SLICER__HELPER:
			case SlicerPackage.SLICER__ON_START:
			case SlicerPackage.SLICER__ON_END:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SlicerPackage.SLICER__CONSTRAINTS:
			case SlicerPackage.SLICER__RADIUS:
			case SlicerPackage.SLICER__SLICED_ELEMENTS:
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
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SlicerPackage.Literals.SLICER__CONSTRAINTS,
				 SlicerFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SlicerPackage.Literals.SLICER__RADIUS,
				 SlicerFactory.eINSTANCE.createRadius()));

		newChildDescriptors.add
			(createChildParameter
				(SlicerPackage.Literals.SLICER__SLICED_ELEMENTS,
				 SlicerFactory.eINSTANCE.createSlicedClass()));

		newChildDescriptors.add
			(createChildParameter
				(SlicerPackage.Literals.SLICER__SLICED_ELEMENTS,
				 SlicerFactory.eINSTANCE.createSlicedProperty()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return komprenEditPlugin.INSTANCE;
	}

}
