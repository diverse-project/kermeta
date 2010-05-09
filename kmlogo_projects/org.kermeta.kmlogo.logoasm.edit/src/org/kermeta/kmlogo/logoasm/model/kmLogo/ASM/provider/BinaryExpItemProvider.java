/*$Id : BinaryExpItemProvider.java v 1.3 May 8, 2010 9:32:04 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.edit
* File : 	BinaryExpItemProvider.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory;
import org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage;
import org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp;

/**
 * This is the item provider adapter for a {@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp} object.
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
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
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
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
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
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
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

}
