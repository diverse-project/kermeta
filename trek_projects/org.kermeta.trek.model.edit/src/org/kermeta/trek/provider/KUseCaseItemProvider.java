/**
 * <copyright>
 * </copyright>
 *
 * $Id: KUseCaseItemProvider.java,v 1.3 2007-11-27 16:45:59 cfaucher Exp $
 */
package org.kermeta.trek.provider;


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

import org.kermeta.trek.KUseCase;
import org.kermeta.trek.TrekFactory;
import org.kermeta.trek.TrekPackage;

/**
 * This is the item provider adapter for a {@link org.kermeta.trek.KUseCase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KUseCaseItemProvider
	extends TrekModelElementItemProvider
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
	public KUseCaseItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addShortSummaryPropertyDescriptor(object);
			addUsePropertyDescriptor(object);
			addUsedByPropertyDescriptor(object);
			addVerifiedByPropertyDescriptor(object);
			addRefinesPropertyDescriptor(object);
			addRefinedByPropertyDescriptor(object);
			addCoversPropertyDescriptor(object);
			addLevelPropertyDescriptor(object);
			addTagsPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_id_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_AllPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Short Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_shortSummary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_shortSummary_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__SHORT_SUMMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DescriptionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_use_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_use_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__USE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_RelationshipsbetweenusecasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Used By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_usedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_usedBy_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__USED_BY,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_RelationshipsbetweenusecasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Verified By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerifiedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_verifiedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_verifiedBy_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__VERIFIED_BY,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_AllPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Refines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_refines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_refines_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__REFINES,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_RelationshipsbetweenusecasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Refined By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_refinedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_refinedBy_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__REFINED_BY,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_RelationshipsbetweenusecasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Covers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoversPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_covers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_covers_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__COVERS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_AllPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_level_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_QualifierPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Tags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_tags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_tags_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__TAGS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_QualifierPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KUseCase_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KUseCase_priority_feature", "_UI_KUseCase_type"),
				 TrekPackage.Literals.KUSE_CASE__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_QualifierPropertyCategory"),
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
			childrenFeatures.add(TrekPackage.Literals.KUSE_CASE__STATUS);
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
	 * This returns KUseCase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KUseCase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((KUseCase)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_KUseCase_type") :
			getString("_UI_KUseCase_type") + " " + label;
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

		switch (notification.getFeatureID(KUseCase.class)) {
			case TrekPackage.KUSE_CASE__ID:
			case TrekPackage.KUSE_CASE__SHORT_SUMMARY:
			case TrekPackage.KUSE_CASE__LEVEL:
			case TrekPackage.KUSE_CASE__PRIORITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TrekPackage.KUSE_CASE__STATUS:
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
				(TrekPackage.Literals.KUSE_CASE__STATUS,
				 TrekFactory.eINSTANCE.createKStatus()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UsekaseEditPlugin.INSTANCE;
	}

}
