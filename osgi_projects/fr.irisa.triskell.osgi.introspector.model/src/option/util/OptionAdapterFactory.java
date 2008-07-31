/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptionAdapterFactory.java,v 1.2 2008-07-31 12:23:17 edaubert Exp $
 */
package option.util;

import option.ActivationPolicyDirective;
import option.AttributEntry;
import option.DirectiveEntry;
import option.ExcludeClasses;
import option.ExcludePackages;
import option.ExportPackageDirective;
import option.Extension;
import option.FragmentAttachment;
import option.FragmentHostDirective;
import option.ImportPackageDirective;
import option.IncludeClasses;
import option.IncludePackages;
import option.Language;
import option.Mandatory;
import option.NativeCodeDirective;
import option.OptionPackage;
import option.OsName;
import option.OsVersion;
import option.ParameterEntry;
import option.Processor;
import option.RequireBundleDirective;
import option.Resolution;
import option.SelectionFilter;
import option.Singleton;
import option.SymbolicNameDirective;
import option.Uses;
import option.Visibility;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It
 * provides an adapter <code>createXXX</code> method for each class of the
 * model. <!-- end-user-doc -->
 * 
 * @see option.OptionPackage
 * @generated
 */
public class OptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static OptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public OptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OptionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code>
	 * if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OptionSwitch<Adapter> modelSwitch = new OptionSwitch<Adapter>() {
		@Override
		public Adapter caseParameterEntry(ParameterEntry object) {
			return createParameterEntryAdapter();
		}

		@Override
		public Adapter caseDirectiveEntry(DirectiveEntry object) {
			return createDirectiveEntryAdapter();
		}

		@Override
		public Adapter caseAttributEntry(AttributEntry object) {
			return createAttributEntryAdapter();
		}

		@Override
		public Adapter caseOsName(OsName object) {
			return createOsNameAdapter();
		}

		@Override
		public Adapter caseNativeCodeDirective(NativeCodeDirective object) {
			return createNativeCodeDirectiveAdapter();
		}

		@Override
		public Adapter caseOsVersion(OsVersion object) {
			return createOsVersionAdapter();
		}

		@Override
		public Adapter caseExcludePackages(ExcludePackages object) {
			return createExcludePackagesAdapter();
		}

		@Override
		public Adapter caseProcessor(Processor object) {
			return createProcessorAdapter();
		}

		@Override
		public Adapter caseIncludePackages(IncludePackages object) {
			return createIncludePackagesAdapter();
		}

		@Override
		public Adapter caseUses(Uses object) {
			return createUsesAdapter();
		}

		@Override
		public Adapter caseExtension(Extension object) {
			return createExtensionAdapter();
		}

		@Override
		public Adapter caseMandatory(Mandatory object) {
			return createMandatoryAdapter();
		}

		@Override
		public Adapter caseLanguage(Language object) {
			return createLanguageAdapter();
		}

		@Override
		public Adapter caseVisibility(Visibility object) {
			return createVisibilityAdapter();
		}

		@Override
		public Adapter caseSingleton(Singleton object) {
			return createSingletonAdapter();
		}

		@Override
		public Adapter caseResolution(Resolution object) {
			return createResolutionAdapter();
		}

		@Override
		public Adapter caseFragmentAttachment(FragmentAttachment object) {
			return createFragmentAttachmentAdapter();
		}

		@Override
		public Adapter caseSelectionFilter(SelectionFilter object) {
			return createSelectionFilterAdapter();
		}

		@Override
		public Adapter caseRequireBundleDirective(RequireBundleDirective object) {
			return createRequireBundleDirectiveAdapter();
		}

		@Override
		public Adapter caseFragmentHostDirective(FragmentHostDirective object) {
			return createFragmentHostDirectiveAdapter();
		}

		@Override
		public Adapter caseSymbolicNameDirective(SymbolicNameDirective object) {
			return createSymbolicNameDirectiveAdapter();
		}

		@Override
		public Adapter caseExportPackageDirective(ExportPackageDirective object) {
			return createExportPackageDirectiveAdapter();
		}

		@Override
		public Adapter caseImportPackageDirective(ImportPackageDirective object) {
			return createImportPackageDirectiveAdapter();
		}

		@Override
		public Adapter caseActivationPolicyDirective(
				ActivationPolicyDirective object) {
			return createActivationPolicyDirectiveAdapter();
		}

		@Override
		public Adapter caseIncludeClasses(IncludeClasses object) {
			return createIncludeClassesAdapter();
		}

		@Override
		public Adapter caseExcludeClasses(ExcludeClasses object) {
			return createExcludeClassesAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.ParameterEntry <em>Parameter Entry</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.ParameterEntry
	 * @generated
	 */
	public Adapter createParameterEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.DirectiveEntry <em>Directive Entry</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.DirectiveEntry
	 * @generated
	 */
	public Adapter createDirectiveEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.AttributEntry <em>Attribut Entry</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.AttributEntry
	 * @generated
	 */
	public Adapter createAttributEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.OsName <em>Os Name</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.OsName
	 * @generated
	 */
	public Adapter createOsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.NativeCodeDirective <em>Native Code Directive</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.NativeCodeDirective
	 * @generated
	 */
	public Adapter createNativeCodeDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.OsVersion <em>Os Version</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.OsVersion
	 * @generated
	 */
	public Adapter createOsVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.ExcludePackages <em>Exclude Packages</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.ExcludePackages
	 * @generated
	 */
	public Adapter createExcludePackagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.IncludePackages <em>Include Packages</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.IncludePackages
	 * @generated
	 */
	public Adapter createIncludePackagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.Uses
	 * @generated
	 */
	public Adapter createUsesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.Mandatory
	 * @generated
	 */
	public Adapter createMandatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.Language <em>Language</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.Visibility
	 * @generated
	 */
	public Adapter createVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.Singleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.Singleton
	 * @generated
	 */
	public Adapter createSingletonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.Resolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.Resolution
	 * @generated
	 */
	public Adapter createResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.FragmentAttachment <em>Fragment Attachment</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.FragmentAttachment
	 * @generated
	 */
	public Adapter createFragmentAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.SelectionFilter <em>Selection Filter</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.SelectionFilter
	 * @generated
	 */
	public Adapter createSelectionFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.RequireBundleDirective <em>Require Bundle Directive</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.RequireBundleDirective
	 * @generated
	 */
	public Adapter createRequireBundleDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.FragmentHostDirective <em>Fragment Host Directive</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.FragmentHostDirective
	 * @generated
	 */
	public Adapter createFragmentHostDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.SymbolicNameDirective <em>Symbolic Name Directive</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.SymbolicNameDirective
	 * @generated
	 */
	public Adapter createSymbolicNameDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.ExportPackageDirective <em>Export Package Directive</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.ExportPackageDirective
	 * @generated
	 */
	public Adapter createExportPackageDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.ImportPackageDirective <em>Import Package Directive</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.ImportPackageDirective
	 * @generated
	 */
	public Adapter createImportPackageDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.ActivationPolicyDirective <em>Activation Policy Directive</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.ActivationPolicyDirective
	 * @generated
	 */
	public Adapter createActivationPolicyDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.IncludeClasses <em>Include Classes</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.IncludeClasses
	 * @generated
	 */
	public Adapter createIncludeClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link option.ExcludeClasses <em>Exclude Classes</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see option.ExcludeClasses
	 * @generated
	 */
	public Adapter createExcludeClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // OptionAdapterFactory
