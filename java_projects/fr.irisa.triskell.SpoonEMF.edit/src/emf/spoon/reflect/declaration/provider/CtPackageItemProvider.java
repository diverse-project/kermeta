/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.spoon.reflect.declaration.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.declaration.CtPackage;
import emf.spoon.reflect.declaration.DeclarationPackage;

/**
 * This is the item provider adapter for a {@link emf.spoon.reflect.declaration.CtPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtPackageItemProvider
	extends CtNamedElementItemProvider
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
	public CtPackageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}


	  /**
	   * This does the same thing as ITreeContentProvider.getChildren.
	   */
	  public Collection<?> getChildren(Object object){
		 // super.getChildren(object);
		  List list =new ArrayList();
		  list.addAll(((CtPackage)object).getTypes());
		  list.addAll(((CtPackage)object).getPackages());
		  
		  return list;
		  
	  }

	  /**
	   * This does the same thing as ITreeContentProvider.hasChildren.
	   */
	  public boolean hasChildren(Object object){
		  return true;
	  }

	  /**
	   * This does the same thing as ITreeContentProvider.getParent.
	   */
	  public Object getParent(Object object){
		  return ((CtPackage)object).getDeclaringPackage();
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

			addPACKAGE_SEPARATORPropertyDescriptor(object);
			addTOP_LEVEL_PACKAGE_NAMEPropertyDescriptor(object);
			addPackagesPropertyDescriptor(object);
			addTypesPropertyDescriptor(object);
			addQualifiedNamePropertyDescriptor(object);
			addDeclaringPackagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the PACKAGE SEPARATOR feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPACKAGE_SEPARATORPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtPackage_PACKAGE_SEPARATOR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtPackage_PACKAGE_SEPARATOR_feature", "_UI_CtPackage_type"),
				 DeclarationPackage.Literals.CT_PACKAGE__PACKAGE_SEPARATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TOP LEVEL PACKAGE NAME feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTOP_LEVEL_PACKAGE_NAMEPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtPackage_TOP_LEVEL_PACKAGE_NAME_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtPackage_TOP_LEVEL_PACKAGE_NAME_feature", "_UI_CtPackage_type"),
				 DeclarationPackage.Literals.CT_PACKAGE__TOP_LEVEL_PACKAGE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Packages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtPackage_Packages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtPackage_Packages_feature", "_UI_CtPackage_type"),
				 DeclarationPackage.Literals.CT_PACKAGE__PACKAGES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtPackage_Types_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtPackage_Types_feature", "_UI_CtPackage_type"),
				 DeclarationPackage.Literals.CT_PACKAGE__TYPES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qualified Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifiedNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtPackage_QualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtPackage_QualifiedName_feature", "_UI_CtPackage_type"),
				 DeclarationPackage.Literals.CT_PACKAGE__QUALIFIED_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Declaring Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclaringPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtPackage_DeclaringPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtPackage_DeclaringPackage_feature", "_UI_CtPackage_type"),
				 DeclarationPackage.Literals.CT_PACKAGE__DECLARING_PACKAGE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CtPackage)object).getQualifiedName();
		return label == null || label.length() == 0 ?
			getString("_UI_CtPackage_type") :
			getString("_UI_CtPackage_type") + " " + label;
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

		switch (notification.getFeatureID(CtPackage.class)) {
			case DeclarationPackage.CT_PACKAGE__PACKAGE_SEPARATOR:
			case DeclarationPackage.CT_PACKAGE__TOP_LEVEL_PACKAGE_NAME:
			case DeclarationPackage.CT_PACKAGE__TYPES:
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
