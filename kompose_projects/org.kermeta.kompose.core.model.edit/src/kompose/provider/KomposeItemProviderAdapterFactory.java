/**
 * <copyright>
 * </copyright>
 *
 * $Id: KomposeItemProviderAdapterFactory.java,v 1.1.1.1 2008-11-17 15:37:25 mclavreu Exp $
 */
package kompose.provider;

import java.util.ArrayList;
import java.util.Collection;

import kompose.util.KomposeAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KomposeItemProviderAdapterFactory extends KomposeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KomposeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.Remove} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveItemProvider removeItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.Remove}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRemoveAdapter() {
		if (removeItemProvider == null) {
			removeItemProvider = new RemoveItemProvider(this);
		}

		return removeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.Add} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddItemProvider addItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.Add}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAddAdapter() {
		if (addItemProvider == null) {
			addItemProvider = new AddItemProvider(this);
		}

		return addItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.Create} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateItemProvider createItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.Create}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		if (createItemProvider == null) {
			createItemProvider = new CreateItemProvider(this);
		}

		return createItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.Set} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetItemProvider setItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.Set}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSetAdapter() {
		if (setItemProvider == null) {
			setItemProvider = new SetItemProvider(this);
		}

		return setItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.NameRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameRefItemProvider nameRefItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.NameRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createNameRefAdapter() {
		if (nameRefItemProvider == null) {
			nameRefItemProvider = new NameRefItemProvider(this);
		}

		return nameRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.IDRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDRefItemProvider idRefItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.IDRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIDRefAdapter() {
		if (idRefItemProvider == null) {
			idRefItemProvider = new IDRefItemProvider(this);
		}

		return idRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.Literal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralItemProvider literalItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		if (literalItemProvider == null) {
			literalItemProvider = new LiteralItemProvider(this);
		}

		return literalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.StringLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralItemProvider stringLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.StringLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		if (stringLiteralItemProvider == null) {
			stringLiteralItemProvider = new StringLiteralItemProvider(this);
		}

		return stringLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.BooleanLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralItemProvider booleanLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.BooleanLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		if (booleanLiteralItemProvider == null) {
			booleanLiteralItemProvider = new BooleanLiteralItemProvider(this);
		}

		return booleanLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.IntegerLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLiteralItemProvider integerLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.IntegerLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIntegerLiteralAdapter() {
		if (integerLiteralItemProvider == null) {
			integerLiteralItemProvider = new IntegerLiteralItemProvider(this);
		}

		return integerLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.VoidLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoidLiteralItemProvider voidLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.VoidLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVoidLiteralAdapter() {
		if (voidLiteralItemProvider == null) {
			voidLiteralItemProvider = new VoidLiteralItemProvider(this);
		}

		return voidLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.Context} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextItemProvider contextItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createContextAdapter() {
		if (contextItemProvider == null) {
			contextItemProvider = new ContextItemProvider(this);
		}

		return contextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link kompose.Composer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposerItemProvider composerItemProvider;

	/**
	 * This creates an adapter for a {@link kompose.Composer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createComposerAdapter() {
		if (composerItemProvider == null) {
			composerItemProvider = new ComposerItemProvider(this);
		}

		return composerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (removeItemProvider != null) removeItemProvider.dispose();
		if (addItemProvider != null) addItemProvider.dispose();
		if (createItemProvider != null) createItemProvider.dispose();
		if (setItemProvider != null) setItemProvider.dispose();
		if (nameRefItemProvider != null) nameRefItemProvider.dispose();
		if (idRefItemProvider != null) idRefItemProvider.dispose();
		if (literalItemProvider != null) literalItemProvider.dispose();
		if (stringLiteralItemProvider != null) stringLiteralItemProvider.dispose();
		if (booleanLiteralItemProvider != null) booleanLiteralItemProvider.dispose();
		if (integerLiteralItemProvider != null) integerLiteralItemProvider.dispose();
		if (voidLiteralItemProvider != null) voidLiteralItemProvider.dispose();
		if (contextItemProvider != null) contextItemProvider.dispose();
		if (composerItemProvider != null) composerItemProvider.dispose();
	}

}
