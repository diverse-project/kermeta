/**
 * <copyright>
 * </copyright>
 *
 * $Id: RaiseItemProvider.java,v 1.6 2006-10-24 09:19:18 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.provider;


import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.Raise;

import fr.irisa.triskell.kermeta.provider.KermetaEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.triskell.kermeta.language.behavior.Raise} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RaiseItemProvider
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
	public RaiseItemProvider(AdapterFactory adapterFactory) {
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BehaviorPackage.Literals.RAISE__EXPRESSION);
		}
		return childrenFeatures;
	}

	/**
	 * This returns Raise.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Raise"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_Raise_type");
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

		switch (notification.getFeatureID(Raise.class)) {
			case BehaviorPackage.RAISE__EXPRESSION:
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
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createCallVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createCallFeature()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createCallSuperOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createCallResult()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createCallValue()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createEmptyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createJavaStaticCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createVoidLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
				 BehaviorFactory.eINSTANCE.createSelfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.RAISE__EXPRESSION,
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
