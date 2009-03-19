/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.spoon.reflect.declaration.provider;


import emf.spoon.factory.EmfSet;
import emf.spoon.provider.Java5EditPlugin;

import emf.spoon.reflect.declaration.CtClass;
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

/**
 * This is the item provider adapter for a {@link emf.spoon.reflect.declaration.CtMethod} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtMethodItemProvider
	extends CtExecutableItemProvider
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
	public CtMethodItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	  /**
	   * This does the same thing as ITreeContentProvider.getChildren.
	   */
	  public Collection<?> getChildren(Object object){
		 // super.getChildren(object);
		  List list = new ArrayList();
		  list.addAll(((CtMethod)object).getAnnotations());
		  list.addAll(((CtMethod)object).getFormalTypeParameters());
		  list.add(((CtMethod)object).getBody());
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
		  return ((CtMethod)object).getParent();
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
	 * This returns CtMethod.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtMethod"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CtMethod)object).getSimpleName();
		return label == null || label.length() == 0 ?
			getString("_UI_CtMethod_type") :
			getString("_UI_CtMethod_type") + " " + label;
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
