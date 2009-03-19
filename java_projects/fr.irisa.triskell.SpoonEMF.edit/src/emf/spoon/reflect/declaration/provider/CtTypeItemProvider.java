/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.spoon.reflect.declaration.provider;


import emf.spoon.provider.Java5EditPlugin;

import emf.spoon.reflect.declaration.CtType;
import emf.spoon.reflect.declaration.DeclarationFactory;
import emf.spoon.reflect.declaration.DeclarationPackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link emf.spoon.reflect.declaration.CtType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtTypeItemProvider
	extends CtGenericElementItemProvider
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
	public CtTypeItemProvider(AdapterFactory adapterFactory) {
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

			addModifiersPropertyDescriptor(object);
			addSimpleNamePropertyDescriptor(object);
			addReferencePropertyDescriptor(object);
			addINNERTTYPE_SEPARATORPropertyDescriptor(object);
			addFieldsPropertyDescriptor(object);
			addNestedTypesPropertyDescriptor(object);
			addActualClassPropertyDescriptor(object);
			addDeclaringTypePropertyDescriptor(object);
			addAllFieldsPropertyDescriptor(object);
			addTopLevelPropertyDescriptor(object);
			addPackagePropertyDescriptor(object);
			addQualifiedNamePropertyDescriptor(object);
			addMethodsPropertyDescriptor(object);
			addSuperinterfacesPropertyDescriptor(object);
			addAllMethodsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Modifiers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtModifiable_Modifiers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtModifiable_Modifiers_feature", "_UI_CtModifiable_type"),
				 DeclarationPackage.Literals.CT_MODIFIABLE__MODIFIERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Simple Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimpleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtNamedElement_SimpleName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtNamedElement_SimpleName_feature", "_UI_CtNamedElement_type"),
				 DeclarationPackage.Literals.CT_NAMED_ELEMENT__SIMPLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtNamedElement_Reference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtNamedElement_Reference_feature", "_UI_CtNamedElement_type"),
				 DeclarationPackage.Literals.CT_NAMED_ELEMENT__REFERENCE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the INNERTTYPE SEPARATOR feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addINNERTTYPE_SEPARATORPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtSimpleType_INNERTTYPE_SEPARATOR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtSimpleType_INNERTTYPE_SEPARATOR_feature", "_UI_CtSimpleType_type"),
				 DeclarationPackage.Literals.CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtSimpleType_Fields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtSimpleType_Fields_feature", "_UI_CtSimpleType_type"),
				 DeclarationPackage.Literals.CT_SIMPLE_TYPE__FIELDS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nested Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestedTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtSimpleType_NestedTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtSimpleType_NestedTypes_feature", "_UI_CtSimpleType_type"),
				 DeclarationPackage.Literals.CT_SIMPLE_TYPE__NESTED_TYPES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtSimpleType_ActualClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtSimpleType_ActualClass_feature", "_UI_CtSimpleType_type"),
				 DeclarationPackage.Literals.CT_SIMPLE_TYPE__ACTUAL_CLASS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Declaring Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclaringTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtSimpleType_DeclaringType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtSimpleType_DeclaringType_feature", "_UI_CtSimpleType_type"),
				 DeclarationPackage.Literals.CT_SIMPLE_TYPE__DECLARING_TYPE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtSimpleType_AllFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtSimpleType_AllFields_feature", "_UI_CtSimpleType_type"),
				 DeclarationPackage.Literals.CT_SIMPLE_TYPE__ALL_FIELDS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtSimpleType_TopLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtSimpleType_TopLevel_feature", "_UI_CtSimpleType_type"),
				 DeclarationPackage.Literals.CT_SIMPLE_TYPE__TOP_LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtSimpleType_Package_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtSimpleType_Package_feature", "_UI_CtSimpleType_type"),
				 DeclarationPackage.Literals.CT_SIMPLE_TYPE__PACKAGE,
				 false,
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
				 getString("_UI_CtSimpleType_QualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtSimpleType_QualifiedName_feature", "_UI_CtSimpleType_type"),
				 DeclarationPackage.Literals.CT_SIMPLE_TYPE__QUALIFIED_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Methods feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtType_Methods_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtType_Methods_feature", "_UI_CtType_type"),
				 DeclarationPackage.Literals.CT_TYPE__METHODS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Superinterfaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperinterfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtType_Superinterfaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtType_Superinterfaces_feature", "_UI_CtType_type"),
				 DeclarationPackage.Literals.CT_TYPE__SUPERINTERFACES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Methods feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllMethodsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtType_AllMethods_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtType_AllMethods_feature", "_UI_CtType_type"),
				 DeclarationPackage.Literals.CT_TYPE__ALL_METHODS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CtType)object).getSimpleName();
		return label == null || label.length() == 0 ?
			getString("_UI_CtType_type") :
			getString("_UI_CtType_type") + " " + label;
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

		switch (notification.getFeatureID(CtType.class)) {
			case DeclarationPackage.CT_TYPE__MODIFIERS:
			case DeclarationPackage.CT_TYPE__SIMPLE_NAME:
			case DeclarationPackage.CT_TYPE__INNERTTYPE_SEPARATOR:
			case DeclarationPackage.CT_TYPE__ACTUAL_CLASS:
			case DeclarationPackage.CT_TYPE__TOP_LEVEL:
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
