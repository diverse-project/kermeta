/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.provider;

import java.util.ArrayList;
import java.util.Collection;

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

import org.kermeta.art2.util.Art2AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Art2ItemProviderAdapterFactory extends Art2AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.ComponentInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceItemProvider componentInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInstanceAdapter() {
		if (componentInstanceItemProvider == null) {
			componentInstanceItemProvider = new ComponentInstanceItemProvider(this);
		}

		return componentInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.ComponentType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeItemProvider componentTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentTypeAdapter() {
		if (componentTypeItemProvider == null) {
			componentTypeItemProvider = new ComponentTypeItemProvider(this);
		}

		return componentTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.ContainerNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerNodeItemProvider containerNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.ContainerNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerNodeAdapter() {
		if (containerNodeItemProvider == null) {
			containerNodeItemProvider = new ContainerNodeItemProvider(this);
		}

		return containerNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.ContainerRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerRootItemProvider containerRootItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.ContainerRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerRootAdapter() {
		if (containerRootItemProvider == null) {
			containerRootItemProvider = new ContainerRootItemProvider(this);
		}

		return containerRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Port} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortItemProvider portItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAdapter() {
		if (portItemProvider == null) {
			portItemProvider = new PortItemProvider(this);
		}

		return portItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Namespace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceItemProvider namespaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Namespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamespaceAdapter() {
		if (namespaceItemProvider == null) {
			namespaceItemProvider = new NamespaceItemProvider(this);
		}

		return namespaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Dictionary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryItemProvider dictionaryItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Dictionary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDictionaryAdapter() {
		if (dictionaryItemProvider == null) {
			dictionaryItemProvider = new DictionaryItemProvider(this);
		}

		return dictionaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.DictionaryType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryTypeItemProvider dictionaryTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.DictionaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDictionaryTypeAdapter() {
		if (dictionaryTypeItemProvider == null) {
			dictionaryTypeItemProvider = new DictionaryTypeItemProvider(this);
		}

		return dictionaryTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.DictionaryAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryAttributeItemProvider dictionaryAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.DictionaryAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDictionaryAttributeAdapter() {
		if (dictionaryAttributeItemProvider == null) {
			dictionaryAttributeItemProvider = new DictionaryAttributeItemProvider(this);
		}

		return dictionaryAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.DictionaryValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryValueItemProvider dictionaryValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.DictionaryValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDictionaryValueAdapter() {
		if (dictionaryValueItemProvider == null) {
			dictionaryValueItemProvider = new DictionaryValueItemProvider(this);
		}

		return dictionaryValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Binding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingItemProvider bindingItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Binding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingAdapter() {
		if (bindingItemProvider == null) {
			bindingItemProvider = new BindingItemProvider(this);
		}

		return bindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.CompositeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTypeItemProvider compositeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.CompositeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeTypeAdapter() {
		if (compositeTypeItemProvider == null) {
			compositeTypeItemProvider = new CompositeTypeItemProvider(this);
		}

		return compositeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.PortTypeRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeRefItemProvider portTypeRefItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortTypeRefAdapter() {
		if (portTypeRefItemProvider == null) {
			portTypeRefItemProvider = new PortTypeRefItemProvider(this);
		}

		return portTypeRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Wire} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireItemProvider wireItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Wire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWireAdapter() {
		if (wireItemProvider == null) {
			wireItemProvider = new WireItemProvider(this);
		}

		return wireItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.ServicePortType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicePortTypeItemProvider servicePortTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.ServicePortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServicePortTypeAdapter() {
		if (servicePortTypeItemProvider == null) {
			servicePortTypeItemProvider = new ServicePortTypeItemProvider(this);
		}

		return servicePortTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.TypedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedElementItemProvider typedElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypedElementAdapter() {
		if (typedElementItemProvider == null) {
			typedElementItemProvider = new TypedElementItemProvider(this);
		}

		return typedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.MessagePortType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagePortTypeItemProvider messagePortTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.MessagePortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessagePortTypeAdapter() {
		if (messagePortTypeItemProvider == null) {
			messagePortTypeItemProvider = new MessagePortTypeItemProvider(this);
		}

		return messagePortTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Repository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryItemProvider repositoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryAdapter() {
		if (repositoryItemProvider == null) {
			repositoryItemProvider = new RepositoryItemProvider(this);
		}

		return repositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.DeployUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployUnitItemProvider deployUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.DeployUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeployUnitAdapter() {
		if (deployUnitItemProvider == null) {
			deployUnitItemProvider = new DeployUnitItemProvider(this);
		}

		return deployUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.ComponentTypeLibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeLibraryItemProvider componentTypeLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.ComponentTypeLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentTypeLibraryAdapter() {
		if (componentTypeLibraryItemProvider == null) {
			componentTypeLibraryItemProvider = new ComponentTypeLibraryItemProvider(this);
		}

		return componentTypeLibraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedElementAdapter() {
		if (namedElementItemProvider == null) {
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.IntegrationPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationPatternItemProvider integrationPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.IntegrationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegrationPatternAdapter() {
		if (integrationPatternItemProvider == null) {
			integrationPatternItemProvider = new IntegrationPatternItemProvider(this);
		}

		return integrationPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.ExtraFonctionalProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraFonctionalPropertyItemProvider extraFonctionalPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.ExtraFonctionalProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtraFonctionalPropertyAdapter() {
		if (extraFonctionalPropertyItemProvider == null) {
			extraFonctionalPropertyItemProvider = new ExtraFonctionalPropertyItemProvider(this);
		}

		return extraFonctionalPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Metric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricItemProvider metricItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetricAdapter() {
		if (metricItemProvider == null) {
			metricItemProvider = new MetricItemProvider(this);
		}

		return metricItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.PortTypeMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeMappingItemProvider portTypeMappingItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.PortTypeMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortTypeMappingAdapter() {
		if (portTypeMappingItemProvider == null) {
			portTypeMappingItemProvider = new PortTypeMappingItemProvider(this);
		}

		return portTypeMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Topic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicItemProvider topicItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopicAdapter() {
		if (topicItemProvider == null) {
			topicItemProvider = new TopicItemProvider(this);
		}

		return topicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.MessageHub} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageHubItemProvider messageHubItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.MessageHub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageHubAdapter() {
		if (messageHubItemProvider == null) {
			messageHubItemProvider = new MessageHubItemProvider(this);
		}

		return messageHubItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.Queue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueueItemProvider queueItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.Queue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueueAdapter() {
		if (queueItemProvider == null) {
			queueItemProvider = new QueueItemProvider(this);
		}

		return queueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.kermeta.art2.MBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBindingItemProvider mBindingItemProvider;

	/**
	 * This creates an adapter for a {@link org.kermeta.art2.MBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMBindingAdapter() {
		if (mBindingItemProvider == null) {
			mBindingItemProvider = new MBindingItemProvider(this);
		}

		return mBindingItemProvider;
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
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
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
		if (componentInstanceItemProvider != null) componentInstanceItemProvider.dispose();
		if (componentTypeItemProvider != null) componentTypeItemProvider.dispose();
		if (containerNodeItemProvider != null) containerNodeItemProvider.dispose();
		if (containerRootItemProvider != null) containerRootItemProvider.dispose();
		if (portItemProvider != null) portItemProvider.dispose();
		if (namespaceItemProvider != null) namespaceItemProvider.dispose();
		if (dictionaryItemProvider != null) dictionaryItemProvider.dispose();
		if (dictionaryTypeItemProvider != null) dictionaryTypeItemProvider.dispose();
		if (dictionaryAttributeItemProvider != null) dictionaryAttributeItemProvider.dispose();
		if (dictionaryValueItemProvider != null) dictionaryValueItemProvider.dispose();
		if (bindingItemProvider != null) bindingItemProvider.dispose();
		if (compositeTypeItemProvider != null) compositeTypeItemProvider.dispose();
		if (portTypeRefItemProvider != null) portTypeRefItemProvider.dispose();
		if (wireItemProvider != null) wireItemProvider.dispose();
		if (servicePortTypeItemProvider != null) servicePortTypeItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (typedElementItemProvider != null) typedElementItemProvider.dispose();
		if (messagePortTypeItemProvider != null) messagePortTypeItemProvider.dispose();
		if (repositoryItemProvider != null) repositoryItemProvider.dispose();
		if (deployUnitItemProvider != null) deployUnitItemProvider.dispose();
		if (componentTypeLibraryItemProvider != null) componentTypeLibraryItemProvider.dispose();
		if (namedElementItemProvider != null) namedElementItemProvider.dispose();
		if (integrationPatternItemProvider != null) integrationPatternItemProvider.dispose();
		if (extraFonctionalPropertyItemProvider != null) extraFonctionalPropertyItemProvider.dispose();
		if (metricItemProvider != null) metricItemProvider.dispose();
		if (portTypeMappingItemProvider != null) portTypeMappingItemProvider.dispose();
		if (topicItemProvider != null) topicItemProvider.dispose();
		if (messageHubItemProvider != null) messageHubItemProvider.dispose();
		if (queueItemProvider != null) queueItemProvider.dispose();
		if (mBindingItemProvider != null) mBindingItemProvider.dispose();
	}

}
