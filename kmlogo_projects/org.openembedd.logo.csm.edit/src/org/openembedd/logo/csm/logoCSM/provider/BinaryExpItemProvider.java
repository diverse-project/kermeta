/**
 * <copyright> </copyright>
 * 
 * $Id: BinaryExpItemProvider.java,v 1.1 2008-05-28 12:48:41 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.openembedd.logo.csm.logoCSM.BinaryExp;
import org.openembedd.logo.csm.logoCSM.LogoCSMFactory;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.provider.LogoCSMEditPlugin;

/**
 * This is the item provider adapter for a {@link org.openembedd.logo.csm.logoCSM.BinaryExp} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BinaryExpItemProvider extends InstructionItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BinaryExpItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(LogoCSMPackage.Literals.BINARY_EXP__LHS);
			childrenFeatures.add(LogoCSMPackage.Literals.BINARY_EXP__RHS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return getString("_UI_BinaryExp_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(BinaryExp.class))
		{
		case LogoCSMPackage.BINARY_EXP__LHS:
		case LogoCSMPackage.BINARY_EXP__RHS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created
	 * under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__LHS, LogoCSMFactory.eINSTANCE
				.createConstant()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__LHS, LogoCSMFactory.eINSTANCE
				.createProcCall()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__LHS, LogoCSMFactory.eINSTANCE
				.createParameterCall()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__LHS, LogoCSMFactory.eINSTANCE
				.createPlus()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__LHS, LogoCSMFactory.eINSTANCE
				.createMinus()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__LHS, LogoCSMFactory.eINSTANCE
				.createMult()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__LHS, LogoCSMFactory.eINSTANCE
				.createDiv()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__LHS, LogoCSMFactory.eINSTANCE
				.createEquals()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__LHS, LogoCSMFactory.eINSTANCE
				.createGreater()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__LHS, LogoCSMFactory.eINSTANCE
				.createLower()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__RHS, LogoCSMFactory.eINSTANCE
				.createConstant()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__RHS, LogoCSMFactory.eINSTANCE
				.createProcCall()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__RHS, LogoCSMFactory.eINSTANCE
				.createParameterCall()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__RHS, LogoCSMFactory.eINSTANCE
				.createPlus()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__RHS, LogoCSMFactory.eINSTANCE
				.createMinus()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__RHS, LogoCSMFactory.eINSTANCE
				.createMult()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__RHS, LogoCSMFactory.eINSTANCE
				.createDiv()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__RHS, LogoCSMFactory.eINSTANCE
				.createEquals()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__RHS, LogoCSMFactory.eINSTANCE
				.createGreater()));

		newChildDescriptors.add(createChildParameter(LogoCSMPackage.Literals.BINARY_EXP__RHS, LogoCSMFactory.eINSTANCE
				.createLower()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == LogoCSMPackage.Literals.BINARY_EXP__LHS
				|| childFeature == LogoCSMPackage.Literals.BINARY_EXP__RHS;

		if (qualify)
		{
			return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return LogoCSMEditPlugin.INSTANCE;
	}

}
