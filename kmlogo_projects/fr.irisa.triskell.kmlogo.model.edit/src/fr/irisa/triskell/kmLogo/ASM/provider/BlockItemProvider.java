/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockItemProvider.java,v 1.2 2008-05-29 12:09:20 vmahe Exp $
 */
package fr.irisa.triskell.kmLogo.ASM.provider;


import fr.irisa.triskell.kmLogo.ASM.ASMFactory;
import fr.irisa.triskell.kmLogo.ASM.ASMPackage;
import fr.irisa.triskell.kmLogo.ASM.Block;

import fr.irisa.triskell.kmLogo.ASM.LogoFactory;
import fr.irisa.triskell.kmLogo.ASM.LogoPackage;

import fr.irisa.triskell.kmLogo.provider.ASMLogoEditPlugin;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.triskell.kmLogo.ASM.Block} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockItemProvider
	extends InstructionItemProvider
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
	public BlockItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ASMPackage.Literals.BLOCK__INSTRUCTIONS);
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
	 * This returns Block.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Block"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_Block_type");
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

		switch (notification.getFeatureID(Block.class)) {
			case ASMPackage.BLOCK__INSTRUCTIONS:
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
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createBack()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createForward()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createLeft()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createPenDown()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createPenUp()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createClear()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createProcDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createControlStructure()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
				 ASMFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BLOCK__INSTRUCTIONS,
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
