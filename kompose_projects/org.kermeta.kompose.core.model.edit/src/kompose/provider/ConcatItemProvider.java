/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import kompose.Change;
import kompose.Concat;
import kompose.KomposeFactory;
import kompose.KomposePackage;

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

/**
 * This is the item provider adapter for a {@link kompose.Concat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcatItemProvider
	extends ElementDirectiveItemProvider
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
	public ConcatItemProvider(AdapterFactory adapterFactory) {
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

			addPropertyNamesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Concat_propertyNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Concat_propertyNames_feature", "_UI_Concat_type"),
				 KomposePackage.Literals.CONCAT__PROPERTY_NAMES,
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
			childrenFeatures.add(KomposePackage.Literals.CONCAT__TARGET);
			childrenFeatures.add(KomposePackage.Literals.CONCAT__VALUE);
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
	 * This returns Concat.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Concat"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = "";
		List<String> names = new ArrayList<String>();
		names = ((Concat)object).getPropertyNames();
		if (names.size() != 0){
			for (Iterator<String> iterator = names.iterator(); iterator.hasNext();) {
				String str = (String) iterator.next();
				label += str;
				if (iterator.hasNext())
					label += "+";
			}
		}
		System.out.println(label);
		return label == null || label.length() == 0 ?
				getString("_UI_Concat_type") :
				getString("_UI_Concat_type") + " " + label;
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

		switch (notification.getFeatureID(Concat.class)) {
			case KomposePackage.CONCAT__PROPERTY_NAMES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case KomposePackage.CONCAT__TARGET:
			case KomposePackage.CONCAT__VALUE:
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
				(KomposePackage.Literals.CONCAT__TARGET,
				 KomposeFactory.eINSTANCE.createNameRef()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__TARGET,
				 KomposeFactory.eINSTANCE.createIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__TARGET,
				 KomposeFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__TARGET,
				 KomposeFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__TARGET,
				 KomposeFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__TARGET,
				 KomposeFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__TARGET,
				 KomposeFactory.eINSTANCE.createVoidLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__VALUE,
				 KomposeFactory.eINSTANCE.createNameRef()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__VALUE,
				 KomposeFactory.eINSTANCE.createIDRef()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__VALUE,
				 KomposeFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__VALUE,
				 KomposeFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__VALUE,
				 KomposeFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__VALUE,
				 KomposeFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KomposePackage.Literals.CONCAT__VALUE,
				 KomposeFactory.eINSTANCE.createVoidLiteral()));
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
			childFeature == KomposePackage.Literals.CONCAT__TARGET ||
			childFeature == KomposePackage.Literals.CONCAT__VALUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
