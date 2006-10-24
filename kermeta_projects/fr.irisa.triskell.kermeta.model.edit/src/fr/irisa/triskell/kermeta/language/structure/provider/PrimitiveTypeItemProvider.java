/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveTypeItemProvider.java,v 1.6 2006-10-24 09:19:19 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.provider;


import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

import fr.irisa.triskell.kermeta.provider.KermetaEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.triskell.kermeta.language.structure.PrimitiveType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveTypeItemProvider
	extends DataTypeItemProvider
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
	public PrimitiveTypeItemProvider(AdapterFactory adapterFactory) {
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

			addInstanceTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instance Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PrimitiveType_instanceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PrimitiveType_instanceType_feature", "_UI_PrimitiveType_type"),
				 StructurePackage.Literals.PRIMITIVE_TYPE__INSTANCE_TYPE,
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE);
		}
		return childrenFeatures;
	}

	/**
	 * This returns PrimitiveType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrimitiveType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((PrimitiveType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PrimitiveType_type") :
			getString("_UI_PrimitiveType_type") + " " + label;
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

		switch (notification.getFeatureID(PrimitiveType.class)) {
			case StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE:
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
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createProductType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createModelType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return KermetaEditPlugin.INSTANCE;
	}

}
