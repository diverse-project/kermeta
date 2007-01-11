/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPMItemProvider.java,v 1.1 2007-01-11 16:05:00 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.provider;


import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;

import fr.irisa.triskell.kermeta.kpm.edit.plugin.KPMEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.triskell.kermeta.kpm.KPM} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KPMItemProvider
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
	public KPMItemProvider(AdapterFactory adapterFactory) {
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(KpmPackage.Literals.KPM__EVENTS);
			childrenFeatures.add(KpmPackage.Literals.KPM__DEPENDENCIES);
			childrenFeatures.add(KpmPackage.Literals.KPM__ACTIONS);
			childrenFeatures.add(KpmPackage.Literals.KPM__FILTERS);
			childrenFeatures.add(KpmPackage.Literals.KPM__TYPES);
			childrenFeatures.add(KpmPackage.Literals.KPM__EXPRESSIONS);
			childrenFeatures.add(KpmPackage.Literals.KPM__UNITS);
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
	 * This returns KPM.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KPM"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_KPM_type");
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

		switch (notification.getFeatureID(KPM.class)) {
			case KpmPackage.KPM__EVENTS:
			case KpmPackage.KPM__DEPENDENCIES:
			case KpmPackage.KPM__ACTIONS:
			case KpmPackage.KPM__FILTERS:
			case KpmPackage.KPM__TYPES:
			case KpmPackage.KPM__EXPRESSIONS:
			case KpmPackage.KPM__UNITS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__EVENTS,
				 KpmFactory.eINSTANCE.createDependencyEvent()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__DEPENDENCIES,
				 KpmFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__ACTIONS,
				 KpmFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__FILTERS,
				 KpmFactory.eINSTANCE.createNameFilter()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__FILTERS,
				 KpmFactory.eINSTANCE.createExistFilter()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__FILTERS,
				 KpmFactory.eINSTANCE.createTypeFilter()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__TYPES,
				 KpmFactory.eINSTANCE.createDependencyType()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__EXPRESSIONS,
				 KpmFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__UNITS,
				 KpmFactory.eINSTANCE.createFile()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__UNITS,
				 KpmFactory.eINSTANCE.createDirectory()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.KPM__UNITS,
				 KpmFactory.eINSTANCE.createProject()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return KPMEditPlugin.INSTANCE;
	}

}
