/**
 * <copyright>
 * </copyright>
 *
 * $Id: NestedExpressionItemProvider.java,v 1.3 2008-05-28 09:26:01 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.provider;


import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NestedExpression;

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

/**
 * This is the item provider adapter for a {@link fr.irisa.triskell.kermeta.kpm.NestedExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NestedExpressionItemProvider
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
	public NestedExpressionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(KpmPackage.Literals.NESTED_EXPRESSION__RIGHT);
			childrenFeatures.add(KpmPackage.Literals.NESTED_EXPRESSION__LEFT);
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
		return getString("_UI_NestedExpression_type");
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

		switch (notification.getFeatureID(NestedExpression.class)) {
			case KpmPackage.NESTED_EXPRESSION__RIGHT:
			case KpmPackage.NESTED_EXPRESSION__LEFT:
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
				(KpmPackage.Literals.NESTED_EXPRESSION__RIGHT,
				 KpmFactory.eINSTANCE.createORExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.NESTED_EXPRESSION__RIGHT,
				 KpmFactory.eINSTANCE.createANDExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.NESTED_EXPRESSION__RIGHT,
				 KpmFactory.eINSTANCE.createFilterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.NESTED_EXPRESSION__RIGHT,
				 KpmFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.NESTED_EXPRESSION__LEFT,
				 KpmFactory.eINSTANCE.createORExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.NESTED_EXPRESSION__LEFT,
				 KpmFactory.eINSTANCE.createANDExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.NESTED_EXPRESSION__LEFT,
				 KpmFactory.eINSTANCE.createFilterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KpmPackage.Literals.NESTED_EXPRESSION__LEFT,
				 KpmFactory.eINSTANCE.createNullExpression()));
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
			childFeature == KpmPackage.Literals.NESTED_EXPRESSION__RIGHT ||
			childFeature == KpmPackage.Literals.NESTED_EXPRESSION__LEFT;

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
		return KpmEditPlugin.INSTANCE;
	}

}
