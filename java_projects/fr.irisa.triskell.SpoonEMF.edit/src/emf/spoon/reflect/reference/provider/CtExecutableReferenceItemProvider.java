/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.spoon.reflect.reference.provider;


import emf.spoon.provider.Java5EditPlugin;

import emf.spoon.reflect.reference.CtExecutableReference;
import emf.spoon.reflect.reference.ReferencePackage;

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
 * This is the item provider adapter for a {@link emf.spoon.reflect.reference.CtExecutableReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtExecutableReferenceItemProvider
	extends CtGenericElementReferenceItemProvider
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
	public CtExecutableReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addSimpleNamePropertyDescriptor(object);
			addAnnotationsPropertyDescriptor(object);
			addDeclarationPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addDeclaringTypePropertyDescriptor(object);
			addParameterTypesPropertyDescriptor(object);
			addStaticPropertyDescriptor(object);
			addActualConstructorPropertyDescriptor(object);
			addActualMethodPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_CtReference_SimpleName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtReference_SimpleName_feature", "_UI_CtReference_type"),
				 ReferencePackage.Literals.CT_REFERENCE__SIMPLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Annotations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtReference_Annotations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtReference_Annotations_feature", "_UI_CtReference_type"),
				 ReferencePackage.Literals.CT_REFERENCE__ANNOTATIONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Declaration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclarationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtReference_Declaration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtReference_Declaration_feature", "_UI_CtReference_type"),
				 ReferencePackage.Literals.CT_REFERENCE__DECLARATION,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtExecutableReference_Type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtExecutableReference_Type_feature", "_UI_CtExecutableReference_type"),
				 ReferencePackage.Literals.CT_EXECUTABLE_REFERENCE__TYPE,
				 true,
				 false,
				 false,
				 null,
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
				 getString("_UI_CtExecutableReference_DeclaringType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtExecutableReference_DeclaringType_feature", "_UI_CtExecutableReference_type"),
				 ReferencePackage.Literals.CT_EXECUTABLE_REFERENCE__DECLARING_TYPE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtExecutableReference_ParameterTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtExecutableReference_ParameterTypes_feature", "_UI_CtExecutableReference_type"),
				 ReferencePackage.Literals.CT_EXECUTABLE_REFERENCE__PARAMETER_TYPES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtExecutableReference_Static_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtExecutableReference_Static_feature", "_UI_CtExecutableReference_type"),
				 ReferencePackage.Literals.CT_EXECUTABLE_REFERENCE__STATIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Constructor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualConstructorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtExecutableReference_ActualConstructor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtExecutableReference_ActualConstructor_feature", "_UI_CtExecutableReference_type"),
				 ReferencePackage.Literals.CT_EXECUTABLE_REFERENCE__ACTUAL_CONSTRUCTOR,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtExecutableReference_ActualMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtExecutableReference_ActualMethod_feature", "_UI_CtExecutableReference_type"),
				 ReferencePackage.Literals.CT_EXECUTABLE_REFERENCE__ACTUAL_METHOD,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CtExecutableReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtExecutableReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CtExecutableReference)object).getSimpleName();
		return label == null || label.length() == 0 ?
			getString("_UI_CtExecutableReference_type") :
			getString("_UI_CtExecutableReference_type") + " " + label;
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

		switch (notification.getFeatureID(CtExecutableReference.class)) {
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__SIMPLE_NAME:
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ANNOTATIONS:
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__STATIC:
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ACTUAL_CONSTRUCTOR:
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ACTUAL_METHOD:
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
