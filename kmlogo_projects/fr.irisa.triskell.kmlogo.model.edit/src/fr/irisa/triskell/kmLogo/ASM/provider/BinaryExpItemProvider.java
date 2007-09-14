/**
 * <copyright>
 * </copyright>
 *
 * $Id: BinaryExpItemProvider.java,v 1.1 2007-09-14 08:19:39 ffleurey Exp $
 */
package fr.irisa.triskell.kmLogo.ASM.provider;


import fr.irisa.triskell.kmLogo.ASM.ASMFactory;
import fr.irisa.triskell.kmLogo.ASM.ASMPackage;
import fr.irisa.triskell.kmLogo.ASM.BinaryExp;

import fr.irisa.triskell.kmLogo.ASM.LogoFactory;
import fr.irisa.triskell.kmLogo.ASM.LogoPackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.triskell.kmLogo.ASM.BinaryExp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryExpItemProvider
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
	public BinaryExpItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ASMPackage.Literals.BINARY_EXP__LHS);
			childrenFeatures.add(ASMPackage.Literals.BINARY_EXP__RHS);
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
	 * This returns BinaryExp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryExp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_BinaryExp_type");
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

		switch (notification.getFeatureID(BinaryExp.class)) {
			case ASMPackage.BINARY_EXP__LHS:
			case ASMPackage.BINARY_EXP__RHS:
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
				(ASMPackage.Literals.BINARY_EXP__LHS,
				 ASMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__LHS,
				 ASMFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__LHS,
				 ASMFactory.eINSTANCE.createParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__LHS,
				 ASMFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__LHS,
				 ASMFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__LHS,
				 ASMFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__LHS,
				 ASMFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__LHS,
				 ASMFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__LHS,
				 ASMFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__LHS,
				 ASMFactory.eINSTANCE.createLower()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__RHS,
				 ASMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__RHS,
				 ASMFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__RHS,
				 ASMFactory.eINSTANCE.createParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__RHS,
				 ASMFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__RHS,
				 ASMFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__RHS,
				 ASMFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__RHS,
				 ASMFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__RHS,
				 ASMFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__RHS,
				 ASMFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(ASMPackage.Literals.BINARY_EXP__RHS,
				 ASMFactory.eINSTANCE.createLower()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ASMPackage.Literals.BINARY_EXP__LHS ||
			childFeature == ASMPackage.Literals.BINARY_EXP__RHS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
