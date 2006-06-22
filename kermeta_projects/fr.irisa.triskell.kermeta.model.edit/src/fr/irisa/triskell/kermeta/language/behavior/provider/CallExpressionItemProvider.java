/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallExpressionItemProvider.java,v 1.2 2006-06-22 11:20:29 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.provider;


import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;

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
 * This is the item provider adapter for a {@link fr.irisa.triskell.kermeta.language.behavior.CallExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CallExpressionItemProvider
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
	public CallExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addStaticTypeVariableBindingsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CallExpression_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CallExpression_name_feature", "_UI_CallExpression_type"),
				 BehaviorPackage.eINSTANCE.getCallExpression_Name(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static Type Variable Bindings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticTypeVariableBindingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CallExpression_staticTypeVariableBindings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CallExpression_staticTypeVariableBindings_feature", "_UI_CallExpression_type"),
				 BehaviorPackage.eINSTANCE.getCallExpression_StaticTypeVariableBindings(),
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
			childrenFeatures.add(BehaviorPackage.eINSTANCE.getCallExpression_Parameters());
		}
		return childrenFeatures;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CallExpression)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CallExpression_type") :
			getString("_UI_CallExpression_type") + " " + label;
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

		switch (notification.getFeatureID(CallExpression.class)) {
			case BehaviorPackage.CALL_EXPRESSION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BehaviorPackage.CALL_EXPRESSION__PARAMETERS:
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
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createCallVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createCallFeature()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createCallSuperOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createCallResult()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createCallValue()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createEmptyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createJavaStaticCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createVoidLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createSelfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.eINSTANCE.getCallExpression_Parameters(),
				 BehaviorFactory.eINSTANCE.createVariableDecl()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return KermetaEditPlugin.INSTANCE;
	}

}
