/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import art.ArtFactory;
import art.ArtPackage;
import art.group.GroupFactory;
import art.instance.InstanceFactory;
import art.type.TypeFactory;

/**
 * This is the item provider adapter for a {@link art.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider
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
	public SystemItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ArtPackage.Literals.SYSTEM__ROOT);
			childrenFeatures.add(ArtPackage.Literals.SYSTEM__SERVICES);
			childrenFeatures.add(ArtPackage.Literals.SYSTEM__TYPES);
			childrenFeatures.add(ArtPackage.Literals.SYSTEM__DATA_TYPES);
			childrenFeatures.add(ArtPackage.Literals.SYSTEM__GROUPS);
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
	 * This returns System.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((art.System)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_System_type") :
			getString("_UI_System_type") + " " + label;
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

		switch (notification.getFeatureID(art.System.class)) {
			case ArtPackage.SYSTEM__ROOT:
			case ArtPackage.SYSTEM__SERVICES:
			case ArtPackage.SYSTEM__TYPES:
			case ArtPackage.SYSTEM__DATA_TYPES:
			case ArtPackage.SYSTEM__GROUPS:
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
				(ArtPackage.Literals.SYSTEM__ROOT,
				 InstanceFactory.eINSTANCE.createCompositeInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ArtPackage.Literals.SYSTEM__SERVICES,
				 TypeFactory.eINSTANCE.createFunctionalService()));

		newChildDescriptors.add
			(createChildParameter
				(ArtPackage.Literals.SYSTEM__SERVICES,
				 TypeFactory.eINSTANCE.createControlService()));

		newChildDescriptors.add
			(createChildParameter
				(ArtPackage.Literals.SYSTEM__TYPES,
				 TypeFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(ArtPackage.Literals.SYSTEM__TYPES,
				 TypeFactory.eINSTANCE.createCompositeType()));

		newChildDescriptors.add
			(createChildParameter
				(ArtPackage.Literals.SYSTEM__DATA_TYPES,
				 ArtFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(ArtPackage.Literals.SYSTEM__GROUPS,
				 GroupFactory.eINSTANCE.createTypeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ArtPackage.Literals.SYSTEM__GROUPS,
				 GroupFactory.eINSTANCE.createInstanceGroup()));
	}

}
