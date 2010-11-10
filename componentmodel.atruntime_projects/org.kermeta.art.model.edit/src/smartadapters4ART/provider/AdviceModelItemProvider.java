/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.provider;


import art_relaxed.Art_relaxedFactory;

import art_relaxed.distrib_relaxed.Distrib_relaxedFactory;

import art_relaxed.group_relaxed.Group_relaxedFactory;

import art_relaxed.implem_relaxed.Implem_relaxedFactory;

import art_relaxed.instance_relaxed.Instance_relaxedFactory;

import art_relaxed.type_relaxed.Type_relaxedFactory;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import smartadapters4ART.AdviceModel;
import smartadapters4ART.Smartadapters4ARTPackage;

/**
 * This is the item provider adapter for a {@link smartadapters4ART.AdviceModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdviceModelItemProvider
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
	public AdviceModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT);
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
	 * This returns AdviceModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AdviceModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AdviceModel_type");
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

		switch (notification.getFeatureID(AdviceModel.class)) {
			case Smartadapters4ARTPackage.ADVICE_MODEL__CONTENT:
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
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Art_relaxedFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Art_relaxedFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Instance_relaxedFactory.eINSTANCE.createPrimitiveInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Instance_relaxedFactory.eINSTANCE.createCompositeInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Instance_relaxedFactory.eINSTANCE.createTransmissionBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Instance_relaxedFactory.eINSTANCE.createDelegationBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Instance_relaxedFactory.eINSTANCE.createValuedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Instance_relaxedFactory.eINSTANCE.createDictionaryValuedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Instance_relaxedFactory.eINSTANCE.createDefaultEntry()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Instance_relaxedFactory.eINSTANCE.createOtherEntry()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createCompositeType()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createFunctionalService()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createControlService()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createPortCollection()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createPortId()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createBasicAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createDictionary()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Type_relaxedFactory.eINSTANCE.createDictionaryDefaultValue()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Implem_relaxedFactory.eINSTANCE.createFractalComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Implem_relaxedFactory.eINSTANCE.createOSGiComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Implem_relaxedFactory.eINSTANCE.createOSGiType()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Group_relaxedFactory.eINSTANCE.createTypeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Group_relaxedFactory.eINSTANCE.createInstanceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Smartadapters4ARTPackage.Literals.ADVICE_MODEL__CONTENT,
				 Distrib_relaxedFactory.eINSTANCE.createNode()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Art_AOM_FrameworkEditPlugin.INSTANCE;
	}

}
