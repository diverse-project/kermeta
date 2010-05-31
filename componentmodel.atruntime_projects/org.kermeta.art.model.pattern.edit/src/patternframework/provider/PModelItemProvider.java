/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework.provider;


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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pattern.art.ArtFactory;
import pattern.art.group.GroupFactory;
import pattern.art.implem.ImplemFactory;
import pattern.art.instance.InstanceFactory;
import pattern.art.provider.MetamodelruntimePatternEditPlugin;

import pattern.art.type.TypeFactory;
import patternframework.PModel;
import patternframework.PatternframeworkFactory;
import patternframework.PatternframeworkPackage;

/**
 * This is the item provider adapter for a {@link patternframework.PModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PModelItemProvider
	extends ItemProviderAdapter
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
	public PModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PatternframeworkPackage.Literals.PMODEL__CONTENT);
			childrenFeatures.add(PatternframeworkPackage.Literals.PMODEL__ROLES);
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
	 * This returns PModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PModel_type");
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

		switch (notification.getFeatureID(PModel.class)) {
			case PatternframeworkPackage.PMODEL__CONTENT:
			case PatternframeworkPackage.PMODEL__ROLES:
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
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 PatternframeworkFactory.eINSTANCE.createPObject()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ArtFactory.eINSTANCE.createNamedElement()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ArtFactory.eINSTANCE.createModelElement()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ArtFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ArtFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ArtFactory.eINSTANCE.createTypedElement()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ArtFactory.eINSTANCE.createCardinalityElement()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createPrimitiveInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createCompositeInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createTransmissionBinding()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createDelegationBinding()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createAttributeInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createValuedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createDictionaryValuedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createEntry()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createDefaultEntry()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 InstanceFactory.eINSTANCE.createOtherEntry()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createCompositeType()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createFunctionalService()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createControlService()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createAbstractPort()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createPortCollection()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createPortId()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createBasicAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createDictionary()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 TypeFactory.eINSTANCE.createDictionaryDefaultValue()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ImplemFactory.eINSTANCE.createComponentImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ImplemFactory.eINSTANCE.createFractalComponent()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ImplemFactory.eINSTANCE.createOSGiComponent()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ImplemFactory.eINSTANCE.createTypeImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 ImplemFactory.eINSTANCE.createOSGiType()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 GroupFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 GroupFactory.eINSTANCE.createTypeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__CONTENT,
				 GroupFactory.eINSTANCE.createInstanceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PatternframeworkPackage.Literals.PMODEL__ROLES,
				 PatternframeworkFactory.eINSTANCE.createPRole()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MetamodelruntimePatternEditPlugin.INSTANCE;
	}

}
