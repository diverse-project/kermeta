/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmItemProviderAdapterFactory.java,v 1.1 2007-01-11 16:05:00 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.provider;

import fr.irisa.triskell.kermeta.kpm.util.KpmAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KpmItemProviderAdapterFactory extends KpmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public KpmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);		
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.AbstractFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFileItemProvider abstractFileItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.AbstractFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAbstractFileAdapter() {
		if (abstractFileItemProvider == null) {
			abstractFileItemProvider = new AbstractFileItemProvider(this);
		}

		return abstractFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.AbstractDirectory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDirectoryItemProvider abstractDirectoryItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.AbstractDirectory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAbstractDirectoryAdapter() {
		if (abstractDirectoryItemProvider == null) {
			abstractDirectoryItemProvider = new AbstractDirectoryItemProvider(this);
		}

		return abstractDirectoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.AbstractProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractProjectItemProvider abstractProjectItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.AbstractProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAbstractProjectAdapter() {
		if (abstractProjectItemProvider == null) {
			abstractProjectItemProvider = new AbstractProjectItemProvider(this);
		}

		return abstractProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.NameFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameFilterItemProvider nameFilterItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.NameFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createNameFilterAdapter() {
		if (nameFilterItemProvider == null) {
			nameFilterItemProvider = new NameFilterItemProvider(this);
		}

		return nameFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Dependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyItemProvider dependencyItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this);
		}

		return dependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.DependencyType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyTypeItemProvider dependencyTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDependencyTypeAdapter() {
		if (dependencyTypeItemProvider == null) {
			dependencyTypeItemProvider = new DependencyTypeItemProvider(this);
		}

		return dependencyTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.DependencyEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyEventItemProvider dependencyEventItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.DependencyEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDependencyEventAdapter() {
		if (dependencyEventItemProvider == null) {
			dependencyEventItemProvider = new DependencyEventItemProvider(this);
		}

		return dependencyEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.ExistFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistFilterItemProvider existFilterItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.ExistFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createExistFilterAdapter() {
		if (existFilterItemProvider == null) {
			existFilterItemProvider = new ExistFilterItemProvider(this);
		}

		return existFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.TypeFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeFilterItemProvider typeFilterItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.TypeFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTypeFilterAdapter() {
		if (typeFilterItemProvider == null) {
			typeFilterItemProvider = new TypeFilterItemProvider(this);
		}

		return typeFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.File} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileItemProvider fileItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFileAdapter() {
		if (fileItemProvider == null) {
			fileItemProvider = new FileItemProvider(this);
		}

		return fileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Directory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectoryItemProvider directoryItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Directory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDirectoryAdapter() {
		if (directoryItemProvider == null) {
			directoryItemProvider = new DirectoryItemProvider(this);
		}

		return directoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Project} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectItemProvider projectItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new ProjectItemProvider(this);
		}

		return projectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.KPM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KPMItemProvider kpmItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.KPM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createKPMAdapter() {
		if (kpmItemProvider == null) {
			kpmItemProvider = new KPMItemProvider(this);
		}

		return kpmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.And} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAndAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new AndItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Or} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrItemProvider orItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Or}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createOrAdapter() {
		if (orItemProvider == null) {
			orItemProvider = new OrItemProvider(this);
		}

		return orItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionItemProvider expressionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		if (expressionItemProvider == null) {
			expressionItemProvider = new ExpressionItemProvider(this);
		}

		return expressionItemProvider;
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
		if (abstractFileItemProvider != null) abstractFileItemProvider.dispose();
		if (abstractDirectoryItemProvider != null) abstractDirectoryItemProvider.dispose();
		if (abstractProjectItemProvider != null) abstractProjectItemProvider.dispose();
		if (nameFilterItemProvider != null) nameFilterItemProvider.dispose();
		if (dependencyItemProvider != null) dependencyItemProvider.dispose();
		if (dependencyTypeItemProvider != null) dependencyTypeItemProvider.dispose();
		if (dependencyEventItemProvider != null) dependencyEventItemProvider.dispose();
		if (existFilterItemProvider != null) existFilterItemProvider.dispose();
		if (typeFilterItemProvider != null) typeFilterItemProvider.dispose();
		if (fileItemProvider != null) fileItemProvider.dispose();
		if (directoryItemProvider != null) directoryItemProvider.dispose();
		if (projectItemProvider != null) projectItemProvider.dispose();
		if (kpmItemProvider != null) kpmItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (andItemProvider != null) andItemProvider.dispose();
		if (orItemProvider != null) orItemProvider.dispose();
		if (expressionItemProvider != null) expressionItemProvider.dispose();
	}

}
