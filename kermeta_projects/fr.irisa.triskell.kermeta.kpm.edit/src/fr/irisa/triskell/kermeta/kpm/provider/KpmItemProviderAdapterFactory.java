/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmItemProviderAdapterFactory.java,v 1.7 2008-05-28 09:26:01 ftanguy Exp $
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
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

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
	@Override
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this);
		}

		return dependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Parameter}.
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
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Out} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutItemProvider outItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Out}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutAdapter() {
		if (outItemProvider == null) {
			outItemProvider = new OutItemProvider(this);
		}

		return outItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.ORExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORExpressionItemProvider orExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.ORExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createORExpressionAdapter() {
		if (orExpressionItemProvider == null) {
			orExpressionItemProvider = new ORExpressionItemProvider(this);
		}

		return orExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.ANDExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANDExpressionItemProvider andExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.ANDExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createANDExpressionAdapter() {
		if (andExpressionItemProvider == null) {
			andExpressionItemProvider = new ANDExpressionItemProvider(this);
		}

		return andExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.FilterExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterExpressionItemProvider filterExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.FilterExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilterExpressionAdapter() {
		if (filterExpressionItemProvider == null) {
			filterExpressionItemProvider = new FilterExpressionItemProvider(this);
		}

		return filterExpressionItemProvider;
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
	@Override
	public Adapter createTypeFilterAdapter() {
		if (typeFilterItemProvider == null) {
			typeFilterItemProvider = new TypeFilterItemProvider(this);
		}

		return typeFilterItemProvider;
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
	@Override
	public Adapter createNameFilterAdapter() {
		if (nameFilterItemProvider == null) {
			nameFilterItemProvider = new NameFilterItemProvider(this);
		}

		return nameFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.NullExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullExpressionItemProvider nullExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.NullExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNullExpressionAdapter() {
		if (nullExpressionItemProvider == null) {
			nullExpressionItemProvider = new NullExpressionItemProvider(this);
		}

		return nullExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
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
	@Override
	public Adapter createKPMAdapter() {
		if (kpmItemProvider == null) {
			kpmItemProvider = new KPMItemProvider(this);
		}

		return kpmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.kpm.Unit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitItemProvider unitItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.kpm.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitAdapter() {
		if (unitItemProvider == null) {
			unitItemProvider = new UnitItemProvider(this);
		}

		return unitItemProvider;
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
	@Override
	public Adapter createExistFilterAdapter() {
		if (existFilterItemProvider == null) {
			existFilterItemProvider = new ExistFilterItemProvider(this);
		}

		return existFilterItemProvider;
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
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
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
		if (ruleItemProvider != null) ruleItemProvider.dispose();
		if (outItemProvider != null) outItemProvider.dispose();
		if (orExpressionItemProvider != null) orExpressionItemProvider.dispose();
		if (andExpressionItemProvider != null) andExpressionItemProvider.dispose();
		if (filterExpressionItemProvider != null) filterExpressionItemProvider.dispose();
		if (typeFilterItemProvider != null) typeFilterItemProvider.dispose();
		if (nameFilterItemProvider != null) nameFilterItemProvider.dispose();
		if (typeItemProvider != null) typeItemProvider.dispose();
		if (nullExpressionItemProvider != null) nullExpressionItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (kpmItemProvider != null) kpmItemProvider.dispose();
		if (unitItemProvider != null) unitItemProvider.dispose();
		if (existFilterItemProvider != null) existFilterItemProvider.dispose();
		if (dependencyItemProvider != null) dependencyItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
	}

}
