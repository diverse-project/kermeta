/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.kermeta.language.behavior.BehaviorFactory;

import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.TypeMapping;

/**
 * This is the item provider adapter for a {@link org.kermeta.language.structure.TypeMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeMappingItemProvider
	extends TypeContainerItemProvider
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
	public TypeMappingItemProvider(AdapterFactory adapterFactory) {
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

			addTargetTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeMapping_targetType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeMapping_targetType_feature", "_UI_TypeMapping_type"),
				 StructurePackage.Literals.TYPE_MAPPING__TARGET_TYPE,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StructurePackage.Literals.TYPE_MAPPING__MAPPING);
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
	 * This returns TypeMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypeMapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TypeMapping_type");
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

		switch (notification.getFeatureID(TypeMapping.class)) {
			case StructurePackage.TYPE_MAPPING__MAPPING:
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
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createKermetaModelElement()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createMultiplicityElement()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createTypeVariableBinding()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createClassDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createTypeDefinitionContainer()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createModelingUnit()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createRequire()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createObjectTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createModelTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createVirtualType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createUnresolvedType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createUnresolvedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createUnresolvedOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createUsing()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createProductType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 StructureFactory.eINSTANCE.createUnresolvedInferredType()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createCallVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createCallFeature()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createCallOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createCallSuperOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createCallResult()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createCallValue()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createRescue()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createEmptyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createJavaStaticCall()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createLambdaParameter()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createCallTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createVoidLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createSelfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createUnresolvedCall()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createCallProperty()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.TYPE_MAPPING__MAPPING,
				 BehaviorFactory.eINSTANCE.createCallEnumLiteral()));
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
			childFeature == StructurePackage.Literals.KERMETA_MODEL_ELEMENT__KOWNED_TAGS ||
			childFeature == StructurePackage.Literals.TYPE_MAPPING__MAPPING ||
			childFeature == StructurePackage.Literals.TYPE_CONTAINER__CONTAINED_TYPE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
