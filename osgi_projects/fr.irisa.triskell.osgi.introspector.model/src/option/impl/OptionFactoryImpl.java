/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptionFactoryImpl.java,v 1.3 2008-07-31 13:43:53 edaubert Exp $
 */
package option.impl;

import option.*;
import option.AttributEntry;
import option.ExcludeClasses;
import option.ExcludePackages;
import option.Extension;
import option.ExtensionEnum;
import option.FragmentAttachment;
import option.FragmentAttachmentEnum;
import option.ISOCodeLanguage;
import option.IncludeClasses;
import option.IncludePackages;
import option.Language;
import option.Mandatory;
import option.OptionFactory;
import option.OptionPackage;
import option.OsName;
import option.OsNameEnum;
import option.OsVersion;
import option.Processor;
import option.ProcessorEnum;
import option.Resolution;
import option.ResolutionEnum;
import option.SelectionFilter;
import option.Singleton;
import option.Uses;
import option.Visibility;
import option.VisibilityEnum;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OptionFactoryImpl extends EFactoryImpl implements OptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static OptionFactory init() {
		try {
			OptionFactory theOptionFactory = (OptionFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.osgi.framework/manifest/option"); 
			if (theOptionFactory != null) {
				return theOptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OptionPackage.ATTRIBUT_ENTRY: return createAttributEntry();
			case OptionPackage.OS_NAME: return createOsName();
			case OptionPackage.OS_VERSION: return createOsVersion();
			case OptionPackage.EXCLUDE_PACKAGES: return createExcludePackages();
			case OptionPackage.PROCESSOR: return createProcessor();
			case OptionPackage.INCLUDE_PACKAGES: return createIncludePackages();
			case OptionPackage.USES: return createUses();
			case OptionPackage.EXTENSION: return createExtension();
			case OptionPackage.MANDATORY: return createMandatory();
			case OptionPackage.LANGUAGE: return createLanguage();
			case OptionPackage.VISIBILITY: return createVisibility();
			case OptionPackage.SINGLETON: return createSingleton();
			case OptionPackage.RESOLUTION: return createResolution();
			case OptionPackage.FRAGMENT_ATTACHMENT: return createFragmentAttachment();
			case OptionPackage.SELECTION_FILTER: return createSelectionFilter();
			case OptionPackage.INCLUDE_CLASSES: return createIncludeClasses();
			case OptionPackage.EXCLUDE_CLASSES: return createExcludeClasses();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OptionPackage.FRAGMENT_ATTACHMENT_ENUM:
				return createFragmentAttachmentEnumFromString(eDataType, initialValue);
			case OptionPackage.PROCESSOR_ENUM:
				return createProcessorEnumFromString(eDataType, initialValue);
			case OptionPackage.RESOLUTION_ENUM:
				return createResolutionEnumFromString(eDataType, initialValue);
			case OptionPackage.VISIBILITY_ENUM:
				return createVisibilityEnumFromString(eDataType, initialValue);
			case OptionPackage.ISO_CODE_LANGUAGE:
				return createISOCodeLanguageFromString(eDataType, initialValue);
			case OptionPackage.EXTENSION_ENUM:
				return createExtensionEnumFromString(eDataType, initialValue);
			case OptionPackage.OS_NAME_ENUM:
				return createOsNameEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OptionPackage.FRAGMENT_ATTACHMENT_ENUM:
				return convertFragmentAttachmentEnumToString(eDataType, instanceValue);
			case OptionPackage.PROCESSOR_ENUM:
				return convertProcessorEnumToString(eDataType, instanceValue);
			case OptionPackage.RESOLUTION_ENUM:
				return convertResolutionEnumToString(eDataType, instanceValue);
			case OptionPackage.VISIBILITY_ENUM:
				return convertVisibilityEnumToString(eDataType, instanceValue);
			case OptionPackage.ISO_CODE_LANGUAGE:
				return convertISOCodeLanguageToString(eDataType, instanceValue);
			case OptionPackage.EXTENSION_ENUM:
				return convertExtensionEnumToString(eDataType, instanceValue);
			case OptionPackage.OS_NAME_ENUM:
				return convertOsNameEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AttributEntry createAttributEntry() {
		AttributEntryImpl attributEntry = new AttributEntryImpl();
		return attributEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OsName createOsName() {
		OsNameImpl osName = new OsNameImpl();
		return osName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OsVersion createOsVersion() {
		OsVersionImpl osVersion = new OsVersionImpl();
		return osVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludePackages createExcludePackages() {
		ExcludePackagesImpl excludePackages = new ExcludePackagesImpl();
		return excludePackages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IncludePackages createIncludePackages() {
		IncludePackagesImpl includePackages = new IncludePackagesImpl();
		return includePackages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Uses createUses() {
		UsesImpl uses = new UsesImpl();
		return uses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Mandatory createMandatory() {
		MandatoryImpl mandatory = new MandatoryImpl();
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibility() {
		VisibilityImpl visibility = new VisibilityImpl();
		return visibility;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Singleton createSingleton() {
		SingletonImpl singleton = new SingletonImpl();
		return singleton;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Resolution createResolution() {
		ResolutionImpl resolution = new ResolutionImpl();
		return resolution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentAttachment createFragmentAttachment() {
		FragmentAttachmentImpl fragmentAttachment = new FragmentAttachmentImpl();
		return fragmentAttachment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionFilter createSelectionFilter() {
		SelectionFilterImpl selectionFilter = new SelectionFilterImpl();
		return selectionFilter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeClasses createIncludeClasses() {
		IncludeClassesImpl includeClasses = new IncludeClassesImpl();
		return includeClasses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeClasses createExcludeClasses() {
		ExcludeClassesImpl excludeClasses = new ExcludeClassesImpl();
		return excludeClasses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentAttachmentEnum createFragmentAttachmentEnumFromString(
			EDataType eDataType, String initialValue) {
		FragmentAttachmentEnum result = FragmentAttachmentEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFragmentAttachmentEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorEnum createProcessorEnumFromString(EDataType eDataType,
			String initialValue) {
		ProcessorEnum result = ProcessorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessorEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionEnum createResolutionEnumFromString(EDataType eDataType,
			String initialValue) {
		ResolutionEnum result = ResolutionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolutionEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityEnum createVisibilityEnumFromString(EDataType eDataType,
			String initialValue) {
		VisibilityEnum result = VisibilityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ISOCodeLanguage createISOCodeLanguageFromString(EDataType eDataType,
			String initialValue) {
		ISOCodeLanguage result = ISOCodeLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISOCodeLanguageToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionEnum createExtensionEnumFromString(EDataType eDataType,
			String initialValue) {
		ExtensionEnum result = ExtensionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OsNameEnum createOsNameEnumFromString(EDataType eDataType,
			String initialValue) {
		OsNameEnum result = OsNameEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsNameEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OptionPackage getOptionPackage() {
		return (OptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OptionPackage getPackage() {
		return OptionPackage.eINSTANCE;
	}

} // OptionFactoryImpl
