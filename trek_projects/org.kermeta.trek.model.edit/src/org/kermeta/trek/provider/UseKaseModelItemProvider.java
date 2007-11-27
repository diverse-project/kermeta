/**
 * <copyright>
 * </copyright>
 *
 * $Id: UseKaseModelItemProvider.java,v 1.3 2007-11-27 16:45:59 cfaucher Exp $
 */
package org.kermeta.trek.provider;


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

import org.kermeta.trek.TrekFactory;
import org.kermeta.trek.TrekPackage;
import org.kermeta.trek.UseKaseModel;

/**
 * This is the item provider adapter for a {@link org.kermeta.trek.UseKaseModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UseKaseModelItemProvider
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
	public UseKaseModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TrekPackage.Literals.USE_KASE_MODEL__KUSE_CASES);
			childrenFeatures.add(TrekPackage.Literals.USE_KASE_MODEL__KTEST_CASES);
			childrenFeatures.add(TrekPackage.Literals.USE_KASE_MODEL__KTAGS);
			childrenFeatures.add(TrekPackage.Literals.USE_KASE_MODEL__KUSER_STORIES);
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
	 * This returns UseKaseModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UseKaseModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UseKaseModel_type");
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

		switch (notification.getFeatureID(UseKaseModel.class)) {
			case TrekPackage.USE_KASE_MODEL__KUSE_CASES:
			case TrekPackage.USE_KASE_MODEL__KTEST_CASES:
			case TrekPackage.USE_KASE_MODEL__KTAGS:
			case TrekPackage.USE_KASE_MODEL__KUSER_STORIES:
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
				(TrekPackage.Literals.USE_KASE_MODEL__KUSE_CASES,
				 TrekFactory.eINSTANCE.createKUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(TrekPackage.Literals.USE_KASE_MODEL__KTEST_CASES,
				 TrekFactory.eINSTANCE.createKTestCase()));

		newChildDescriptors.add
			(createChildParameter
				(TrekPackage.Literals.USE_KASE_MODEL__KTAGS,
				 TrekFactory.eINSTANCE.createKTagElement()));

		newChildDescriptors.add
			(createChildParameter
				(TrekPackage.Literals.USE_KASE_MODEL__KUSER_STORIES,
				 TrekFactory.eINSTANCE.createKUserStory()));
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
