/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior.provider;


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
import org.kermeta.language.behavior.BehaviorFactory;
import org.kermeta.language.behavior.BehaviorPackage;
import org.kermeta.language.behavior.LambdaExpression;

/**
 * This is the item provider adapter for a {@link org.kermeta.language.behavior.LambdaExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LambdaExpressionItemProvider
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
	public LambdaExpressionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BehaviorPackage.Literals.LAMBDA_EXPRESSION__PARAMETERS);
			childrenFeatures.add(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY);
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
	 * This returns LambdaExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LambdaExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_LambdaExpression_type");
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

		switch (notification.getFeatureID(LambdaExpression.class)) {
			case BehaviorPackage.LAMBDA_EXPRESSION__PARAMETERS:
			case BehaviorPackage.LAMBDA_EXPRESSION__BODY:
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
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createLambdaParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createCallVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createCallFeature()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createCallOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createCallSuperOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createCallResult()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createCallValue()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createEmptyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createJavaStaticCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createCallTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createVoidLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createSelfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createUnresolvedCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createCallProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createCallEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.LAMBDA_EXPRESSION__BODY,
				 BehaviorFactory.eINSTANCE.createCallModelTransformation()));
	}

}
