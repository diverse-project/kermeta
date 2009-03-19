/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.spoon.reflect.declaration.provider;


import emf.spoon.provider.Java5EditPlugin;

import emf.spoon.reflect.declaration.CtField;
import emf.spoon.reflect.declaration.CtMethod;
import emf.spoon.reflect.declaration.DeclarationPackage;

import java.util.ArrayList;
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
 * This is the item provider adapter for a {@link emf.spoon.reflect.declaration.CtField} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtFieldItemProvider
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
	public CtFieldItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Collection<?> getChildren(Object object){
		 // super.getChildren(object);
		  List list = new ArrayList();
		  list.addAll(((CtField)object).getAnnotations());
		  list.addAll(((CtField)object).getModifiers());
//		  list.add(((CtField)object).getBody());
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
		  return ((CtField)object).getParent();
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

			addTypePropertyDescriptor(object);
			addDefaultExpressionPropertyDescriptor(object);
			addFIELD_SEPARATORPropertyDescriptor(object);
			addDeclaringTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_CtTypedElement_Type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtTypedElement_Type_feature", "_UI_CtTypedElement_type"),
				 DeclarationPackage.Literals.CT_TYPED_ELEMENT__TYPE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtVariable_DefaultExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtVariable_DefaultExpression_feature", "_UI_CtVariable_type"),
				 DeclarationPackage.Literals.CT_VARIABLE__DEFAULT_EXPRESSION,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the FIELD SEPARATOR feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFIELD_SEPARATORPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtField_FIELD_SEPARATOR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtField_FIELD_SEPARATOR_feature", "_UI_CtField_type"),
				 DeclarationPackage.Literals.CT_FIELD__FIELD_SEPARATOR,
				 true,
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
				 getString("_UI_CtField_DeclaringType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtField_DeclaringType_feature", "_UI_CtField_type"),
				 DeclarationPackage.Literals.CT_FIELD__DECLARING_TYPE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtField.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtField"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CtField)object).getSimpleName();
		return label == null || label.length() == 0 ?
			getString("_UI_CtField_type") :
			getString("_UI_CtField_type") + " " + label;
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

		switch (notification.getFeatureID(CtField.class)) {
			case DeclarationPackage.CT_FIELD__FIELD_SEPARATOR:
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
