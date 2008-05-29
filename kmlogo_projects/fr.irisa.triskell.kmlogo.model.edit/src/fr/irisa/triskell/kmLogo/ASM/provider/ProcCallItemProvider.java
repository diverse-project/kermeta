/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProcCallItemProvider.java,v 1.2 2008-05-29 12:09:21 vmahe Exp $
 */
package fr.irisa.triskell.kmLogo.ASM.provider;


import fr.irisa.triskell.kmLogo.ASM.LogoFactory;
import fr.irisa.triskell.kmLogo.ASM.LogoPackage;
import fr.irisa.triskell.kmLogo.ASM.ASMFactory;
import fr.irisa.triskell.kmLogo.ASM.ASMPackage;
import fr.irisa.triskell.kmLogo.ASM.ProcCall;

import fr.irisa.triskell.kmLogo.provider.ASMLogoEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.triskell.kmLogo.ASM.ProcCall} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcCallItemProvider
	extends ExpressionItemProvider
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
	public ProcCallItemProvider(AdapterFactory adapterFactory) {
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

			addDeclarationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ProcCall_declaration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcCall_declaration_feature", "_UI_ProcCall_type"),
				 ASMPackage.Literals.PROC_CALL__DECLARATION,
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
			childrenFeatures.add(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS);
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
	 * This returns ProcCall.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcCall"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_ProcCall_type");
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

		switch (notification.getFeatureID(ProcCall.class)) {
			case ASMPackage.PROC_CALL__ACTUAL_ARGS:
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 ASMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 ASMFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 ASMFactory.eINSTANCE.createParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 ASMFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 ASMFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 ASMFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 ASMFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 ASMFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 ASMFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 ASMFactory.eINSTANCE.createLower()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return ASMLogoEditPlugin.INSTANCE;
	}

}
