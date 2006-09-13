/**
 * <copyright>
 * </copyright>
 *
 * $Id: StructureItemProviderAdapterFactory.java,v 1.4 2006-09-13 16:49:43 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.provider;

import fr.irisa.triskell.kermeta.language.structure.util.StructureAdapterFactory;

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
public class StructureItemProviderAdapterFactory extends StructureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public StructureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);		
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.Object} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectItemProvider objectItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		if (objectItemProvider == null) {
			objectItemProvider = new ObjectItemProvider(this);
		}

		return objectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralItemProvider enumerationLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		if (enumerationLiteralItemProvider == null) {
			enumerationLiteralItemProvider = new EnumerationLiteralItemProvider(this);
		}

		return enumerationLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.MultiplicityElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityElementItemProvider multiplicityElementItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.MultiplicityElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		if (multiplicityElementItemProvider == null) {
			multiplicityElementItemProvider = new MultiplicityElementItemProvider(this);
		}

		return multiplicityElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.PrimitiveType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeItemProvider primitiveTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		if (primitiveTypeItemProvider == null) {
			primitiveTypeItemProvider = new PrimitiveTypeItemProvider(this);
		}

		return primitiveTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.Tag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagItemProvider tagItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTagAdapter() {
		if (tagItemProvider == null) {
			tagItemProvider = new TagItemProvider(this);
		}

		return tagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.ClassDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDefinitionItemProvider classDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createClassDefinitionAdapter() {
		if (classDefinitionItemProvider == null) {
			classDefinitionItemProvider = new ClassDefinitionItemProvider(this);
		}

		return classDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.TypeVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVariableItemProvider typeVariableItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.TypeVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTypeVariableAdapter() {
		if (typeVariableItemProvider == null) {
			typeVariableItemProvider = new TypeVariableItemProvider(this);
		}

		return typeVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.ProductType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTypeItemProvider productTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.ProductType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createProductTypeAdapter() {
		if (productTypeItemProvider == null) {
			productTypeItemProvider = new ProductTypeItemProvider(this);
		}

		return productTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.FunctionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTypeItemProvider functionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		if (functionTypeItemProvider == null) {
			functionTypeItemProvider = new FunctionTypeItemProvider(this);
		}

		return functionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVariableBindingItemProvider typeVariableBindingItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTypeVariableBindingAdapter() {
		if (typeVariableBindingItemProvider == null) {
			typeVariableBindingItemProvider = new TypeVariableBindingItemProvider(this);
		}

		return typeVariableBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefinitionItemProvider typeDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		if (typeDefinitionItemProvider == null) {
			typeDefinitionItemProvider = new TypeDefinitionItemProvider(this);
		}

		return typeDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.VoidType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoidTypeItemProvider voidTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.VoidType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVoidTypeAdapter() {
		if (voidTypeItemProvider == null) {
			voidTypeItemProvider = new VoidTypeItemProvider(this);
		}

		return voidTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.ModelTypeDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeDefinitionItemProvider modelTypeDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.ModelTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createModelTypeDefinitionAdapter() {
		if (modelTypeDefinitionItemProvider == null) {
			modelTypeDefinitionItemProvider = new ModelTypeDefinitionItemProvider(this);
		}

		return modelTypeDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.irisa.triskell.kermeta.language.structure.ModelType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeItemProvider modelTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.irisa.triskell.kermeta.language.structure.ModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		if (modelTypeItemProvider == null) {
			modelTypeItemProvider = new ModelTypeItemProvider(this);
		}

		return modelTypeItemProvider;
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
		if (classItemProvider != null) classItemProvider.dispose();
		if (objectItemProvider != null) objectItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (typeItemProvider != null) typeItemProvider.dispose();
		if (enumerationLiteralItemProvider != null) enumerationLiteralItemProvider.dispose();
		if (multiplicityElementItemProvider != null) multiplicityElementItemProvider.dispose();
		if (enumerationItemProvider != null) enumerationItemProvider.dispose();
		if (packageItemProvider != null) packageItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (primitiveTypeItemProvider != null) primitiveTypeItemProvider.dispose();
		if (tagItemProvider != null) tagItemProvider.dispose();
		if (constraintItemProvider != null) constraintItemProvider.dispose();
		if (classDefinitionItemProvider != null) classDefinitionItemProvider.dispose();
		if (typeVariableItemProvider != null) typeVariableItemProvider.dispose();
		if (productTypeItemProvider != null) productTypeItemProvider.dispose();
		if (functionTypeItemProvider != null) functionTypeItemProvider.dispose();
		if (typeVariableBindingItemProvider != null) typeVariableBindingItemProvider.dispose();
		if (typeDefinitionItemProvider != null) typeDefinitionItemProvider.dispose();
		if (voidTypeItemProvider != null) voidTypeItemProvider.dispose();
		if (modelTypeDefinitionItemProvider != null) modelTypeDefinitionItemProvider.dispose();
		if (modelTypeItemProvider != null) modelTypeItemProvider.dispose();
	}

}
