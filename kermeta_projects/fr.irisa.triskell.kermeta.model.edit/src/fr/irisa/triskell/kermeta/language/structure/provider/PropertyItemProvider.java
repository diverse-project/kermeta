/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertyItemProvider.java,v 1.24 2008-04-30 13:58:11 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.provider.KermetaEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link fr.irisa.triskell.kermeta.language.structure.Property} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PropertyItemProvider extends MultiplicityElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Opposite feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addOppositePropertyDescriptor(Object object) {
		// this is an adaptation of the ecore source
		// it provides a correct list for the opposite property,
		// without the reference on itself and inspect the inherited properties.
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Property_opposite_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Property_opposite_feature", "_UI_Property_type"),
				StructurePackage.eINSTANCE.getProperty_Opposite(), true, false,
				true, null, null, null) {
			public Collection<Property> getChoiceOfValues(Object object) {
				Property eReference = (Property) object;
				// Get the owner of this property, thus a ClassDefinition
				ClassDefinition eContainingClass = eReference.getOwningClass();
				// Get the target of this property, thus a ClassDefinition
				ClassDefinition eReferenceType = (ClassDefinition) ((Class) eReference
						.getType()).getTypeDefinition();
				if (eContainingClass == null || eReferenceType == null) {
					return Collections.EMPTY_LIST;
				}
				Collection<Property> result = new ArrayList(super
						.getChoiceOfValues(object));
				for (Iterator<Property> i = result.iterator(); i.hasNext();) {
					Property eOpposite = i.next();
					if (eOpposite != null) {
						if (eOpposite == eReference) {
							i.remove();
						} else {
							// Get the owner of this property, thus a
							// ClassDefinition
							ClassDefinition eOppositeContainingClass = eOpposite
									.getOwningClass();
							// Get the target of this property, thus a
							// ClassDefinition
							// Fixing the bug #2044
							if(eOpposite.getType() instanceof Class) {
								ClassDefinition eOppositeReferenceType = (ClassDefinition) ((Class) eOpposite
										.getType()).getTypeDefinition();
								if (eOppositeContainingClass == null
										|| ClassDefinitionHelper.isSuperClassOfByName(
												eOppositeContainingClass,
												eReferenceType)
										|| eOppositeContainingClass != eReferenceType
										|| ClassDefinitionHelper.isSuperClassOfByName(
												eContainingClass,
												eOppositeReferenceType)
										|| eContainingClass != eOppositeReferenceType) {
									// FIXME We must remove from the list all classes that are typed as PrimitiveType or ValueType
									i.remove();
								}
							}
						}
					}
				}
				return result;
			}

			public void resetPropertyValue(Object object) {
				setPropertyValue(object, null);
			}

			public void setPropertyValue(Object object, Object value) {
				Property eReference = (Property) object;
				Property eOpposite = (Property) value;
				EditingDomain editingDomain = getEditingDomain(eReference);
				if (editingDomain == null) {
					Property oldReferenceOpposite = eReference.getOpposite();
					if (oldReferenceOpposite != null) {
						oldReferenceOpposite.setOpposite(null);
					}
					if (eOpposite != null) {
						Property oldOppositeOpposite = eOpposite.getOpposite();
						if (oldOppositeOpposite != null) {
							oldOppositeOpposite.setOpposite(null);
						}
						eOpposite.setOpposite(eReference);
					}
					eReference.setOpposite(eOpposite);
				} else {
					CompoundCommand compoundCommand = new CompoundCommand(
							CompoundCommand.LAST_COMMAND_ALL);
					Property oldReferenceOpposite = eReference.getOpposite();
					if (oldReferenceOpposite != null) {
						compoundCommand.append(SetCommand.create(editingDomain,
								getCommandOwner(oldReferenceOpposite), feature,
								null));
					}
					if (eOpposite != null) {
						Property oldOppositeOpposite = eOpposite.getOpposite();
						if (oldOppositeOpposite != null) {
							compoundCommand.append(SetCommand.create(
									editingDomain,
									getCommandOwner(oldOppositeOpposite),
									feature, null));
						}
						compoundCommand.append(SetCommand
								.create(editingDomain,
										getCommandOwner(eOpposite), feature,
										eReference));
					}
					compoundCommand.append(SetCommand.create(editingDomain,
							getCommandOwner(eReference), feature, eOpposite));
					editingDomain.getCommandStack().execute(compoundCommand);
				}
			}
		});

	}

	/**
	 * This adds a property descriptor for the Is Read Only feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * This adds a property descriptor for the Is Composite feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Derived feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is ID feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StructurePackage.Literals.PROPERTY__GETTER_BODY);
			childrenFeatures.add(StructurePackage.Literals.PROPERTY__SETTER_BODY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Property"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getText(Object object) {
		String label = ((Property) object).getName();
		String parent = ((Property) object).getOwningClass().getName();
		// We get the label (ClassDefinition name) of the parent of the given
		// Property
		return label == null || label.length() == 0 ? getString("_UI_Property_type")
				: /*getString("_UI_Property_type") + " " + */label + " owned by "
						+ parent;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
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
				 BehaviorFactory.eINSTANCE.createTypeLiteral()));

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
				 BehaviorFactory.eINSTANCE.createTypeLiteral()));

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
	}

	/**
	 * This returns the label text for
	 * {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return KermetaEditPlugin.INSTANCE;
	}

}