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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.kermeta.language.behavior.BehaviorFactory;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;

/**
 * This is the item provider adapter for a {@link org.kermeta.language.structure.Property} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyItemProvider
	extends MultiplicityElementItemProvider
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
	public PropertyItemProvider(AdapterFactory adapterFactory) {
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

			addOppositePropertyDescriptor(object);
			addIsReadOnlyPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addIsCompositePropertyDescriptor(object);
			addIsDerivedPropertyDescriptor(object);
			addIsIDPropertyDescriptor(object);
			addIsGetterAbstractPropertyDescriptor(object);
			addIsSetterAbstractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Opposite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOppositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_opposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_opposite_feature", "_UI_Property_type"),
				 StructurePackage.Literals.PROPERTY__OPPOSITE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_isReadOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_isReadOnly_feature", "_UI_Property_type"),
				 StructurePackage.Literals.PROPERTY__IS_READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_default_feature", "_UI_Property_type"),
				 StructurePackage.Literals.PROPERTY__DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Composite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCompositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_isComposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_isComposite_feature", "_UI_Property_type"),
				 StructurePackage.Literals.PROPERTY__IS_COMPOSITE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_isDerived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_isDerived_feature", "_UI_Property_type"),
				 StructurePackage.Literals.PROPERTY__IS_DERIVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_isID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_isID_feature", "_UI_Property_type"),
				 StructurePackage.Literals.PROPERTY__IS_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Getter Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsGetterAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_isGetterAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_isGetterAbstract_feature", "_UI_Property_type"),
				 StructurePackage.Literals.PROPERTY__IS_GETTER_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Setter Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSetterAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_isSetterAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_isSetterAbstract_feature", "_UI_Property_type"),
				 StructurePackage.Literals.PROPERTY__IS_SETTER_ABSTRACT,
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
			childrenFeatures.add(StructurePackage.Literals.PROPERTY__GETTER_BODY);
			childrenFeatures.add(StructurePackage.Literals.PROPERTY__SETTER_BODY);
			childrenFeatures.add(StructurePackage.Literals.PROPERTY__OWNED_UNRESOLVED_PROPERTIES);
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
	 * This returns Property.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		if(((Property) object).getIsDerived()) 
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Property_derived"));

		if(((Property) object).getIsComposite())
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Property_contained"));
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Property"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Property)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Property_type") :
			getString("_UI_Property_type") + " " + label;
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

		switch (notification.getFeatureID(Property.class)) {
			case StructurePackage.PROPERTY__IS_READ_ONLY:
			case StructurePackage.PROPERTY__DEFAULT:
			case StructurePackage.PROPERTY__IS_COMPOSITE:
			case StructurePackage.PROPERTY__IS_DERIVED:
			case StructurePackage.PROPERTY__IS_ID:
			case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
			case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StructurePackage.PROPERTY__GETTER_BODY:
			case StructurePackage.PROPERTY__SETTER_BODY:
			case StructurePackage.PROPERTY__OWNED_UNRESOLVED_PROPERTIES:
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
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallFeature()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallSuperOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallResult()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallValue()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createEmptyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createJavaStaticCall()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createVoidLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createSelfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createUnresolvedCall()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallProperty()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__GETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallFeature()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallSuperOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallResult()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallValue()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createEmptyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createJavaStaticCall()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createVoidLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createSelfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createVariableDecl()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createUnresolvedCall()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallProperty()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__SETTER_BODY,
				 BehaviorFactory.eINSTANCE.createCallEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.PROPERTY__OWNED_UNRESOLVED_PROPERTIES,
				 StructureFactory.eINSTANCE.createUnresolvedProperty()));
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
			childFeature == StructurePackage.Literals.PROPERTY__GETTER_BODY ||
			childFeature == StructurePackage.Literals.PROPERTY__SETTER_BODY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
