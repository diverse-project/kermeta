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
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.declaration.CtClass;
import emf.spoon.reflect.declaration.DeclarationPackage;

/**
 * This is the item provider adapter for a {@link emf.spoon.reflect.declaration.CtClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtClassItemProvider
	extends CtTypeItemProvider
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	
	
	
	
	
	public void dispose()
	  {
			System.err.println("dispose CtClass");
	  }
	  
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CtClassItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	
	int depth=0;
	
	  /**
	   * This does the same thing as ITreeContentProvider.getChildren.
	   */
	  public Collection<?> getChildren(Object object){
		 // super.getChildren(object);
		  List list =new ArrayList();
		  
		  list.addAll(((CtClass)object).getFields());
		  list.addAll(((CtClass)object).getMethods());
		  list.addAll(((CtClass)object).getAnnotations());
		  list.addAll(((CtClass)object).getConstructors());
		  list.addAll(((CtClass)object).getFormalTypeParameters());
		  
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
		  
		  return ((CtClass)object).getPackage();
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

			addSuperclassPropertyDescriptor(object);
			addAnonymousExecutablesPropertyDescriptor(object);
			addConstructorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Superclass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperclassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtClass_Superclass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtClass_Superclass_feature", "_UI_CtClass_type"),
				 DeclarationPackage.Literals.CT_CLASS__SUPERCLASS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Anonymous Executables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnonymousExecutablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtClass_AnonymousExecutables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtClass_AnonymousExecutables_feature", "_UI_CtClass_type"),
				 DeclarationPackage.Literals.CT_CLASS__ANONYMOUS_EXECUTABLES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constructors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstructorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtClass_Constructors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtClass_Constructors_feature", "_UI_CtClass_type"),
				 DeclarationPackage.Literals.CT_CLASS__CONSTRUCTORS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CtClass)object).getSimpleName();
		return label == null || label.length() == 0 ?
			getString("_UI_CtClass_type") :
			getString("_UI_CtClass_type") + " " + label;
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

	@Override
	public Collection<?> getNewChildDescriptors(Object object,
			EditingDomain editingDomain, Object sibling) {
		return super.getNewChildDescriptors(object, editingDomain, sibling);
	}

	@Override
	protected void adjustWrapperIndex(Object object, int increment) {
		// TODO Auto-generated method stub
		super.adjustWrapperIndex(object, increment);
		System.out.println("adjustWrapperIndex");
	}

}
