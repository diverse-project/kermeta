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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.kermeta.language.behavior.BehaviorFactory;
import org.kermeta.language.behavior.BehaviorPackage;
import org.kermeta.language.behavior.UnresolvedCall;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.provider.UnresolvedReferenceItemProvider;
import org.provider.KermetaEditPlugin;

/**
 * This is the item provider adapter for a {@link org.kermeta.language.behavior.UnresolvedCall} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnresolvedCallItemProvider
	extends UnresolvedReferenceItemProvider
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
	public UnresolvedCallItemProvider(AdapterFactory adapterFactory) {
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

			addStaticTypePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addStaticTypeVariableBindingsPropertyDescriptor(object);
			addIsAtprePropertyDescriptor(object);
			addTargetParentPropertyDescriptor(object);
			addIsCalledWithParenthesisPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Static Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Expression_staticType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Expression_staticType_feature", "_UI_Expression_type"),
				 BehaviorPackage.Literals.EXPRESSION__STATIC_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 BehaviorPackage.Literals.CALL_EXPRESSION__NAME,
				 true,
				 false,
				 false,
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
				 BehaviorPackage.Literals.CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Atpre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAtprePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnresolvedCall_isAtpre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnresolvedCall_isAtpre_feature", "_UI_UnresolvedCall_type"),
				 BehaviorPackage.Literals.UNRESOLVED_CALL__IS_ATPRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnresolvedCall_targetParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnresolvedCall_targetParent_feature", "_UI_UnresolvedCall_type"),
				 BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Called With Parenthesis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCalledWithParenthesisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnresolvedCall_isCalledWithParenthesis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnresolvedCall_isCalledWithParenthesis_feature", "_UI_UnresolvedCall_type"),
				 BehaviorPackage.Literals.UNRESOLVED_CALL__IS_CALLED_WITH_PARENTHESIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE);
			childrenFeatures.add(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS);
			childrenFeatures.add(BehaviorPackage.Literals.UNRESOLVED_CALL__USINGS);
			childrenFeatures.add(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET);
			childrenFeatures.add(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS);
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
	 * This returns UnresolvedCall.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnresolvedCall"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnresolvedCall)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnresolvedCall_type") :
			getString("_UI_UnresolvedCall_type") + " " + label;
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

		switch (notification.getFeatureID(UnresolvedCall.class)) {
			case BehaviorPackage.UNRESOLVED_CALL__NAME:
			case BehaviorPackage.UNRESOLVED_CALL__IS_ATPRE:
			case BehaviorPackage.UNRESOLVED_CALL__IS_CALLED_WITH_PARENTHESIS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BehaviorPackage.UNRESOLVED_CALL__CONTAINED_TYPE:
			case BehaviorPackage.UNRESOLVED_CALL__PARAMETERS:
			case BehaviorPackage.UNRESOLVED_CALL__USINGS:
			case BehaviorPackage.UNRESOLVED_CALL__TARGET:
			case BehaviorPackage.UNRESOLVED_CALL__GENERICS:
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
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createObjectTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createMetamodelVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createVirtualType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createUnresolvedType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createProductType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createUnresolvedInferredType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createUnresolvedTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE,
				 StructureFactory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createCallVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createCallFeature()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createCallOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createCallSuperOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createCallResult()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createCallValue()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createEmptyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createJavaStaticCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createCallTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createVoidLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createSelfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createUnresolvedCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createCallProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createCallEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__USINGS,
				 StructureFactory.eINSTANCE.createUsing()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createCallVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createCallFeature()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createCallOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createCallSuperOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createCallResult()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createCallValue()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createEmptyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createJavaStaticCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createCallTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createVoidLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createSelfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createUnresolvedCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createCallProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET,
				 BehaviorFactory.eINSTANCE.createCallEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createObjectTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createMetamodelVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createVirtualType()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createUnresolvedType()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createProductType()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createUnresolvedInferredType()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createUnresolvedTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS,
				 StructureFactory.eINSTANCE.createModelType()));
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
			childFeature == StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE ||
			childFeature == BehaviorPackage.Literals.UNRESOLVED_CALL__GENERICS ||
			childFeature == BehaviorPackage.Literals.CALL_EXPRESSION__PARAMETERS ||
			childFeature == BehaviorPackage.Literals.UNRESOLVED_CALL__TARGET;

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
	@Override
	public ResourceLocator getResourceLocator() {
		return KermetaEditPlugin.INSTANCE;
	}

}
