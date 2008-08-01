package fr.irisa.triskell.osgi.introspector.generator;

import jar.Class;
import jar.File;
import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import manifest.BundleActivationPolicy;
import manifest.BundleActivator;
import manifest.BundleCategory;
import manifest.BundleClassPath;
import manifest.BundleContactAddress;
import manifest.BundleCopyright;
import manifest.BundleDescription;
import manifest.BundleDocURL;
import manifest.BundleLocalization;
import manifest.BundleManifestVersion;
import manifest.BundleName;
import manifest.BundleNativeCode;
import manifest.BundleRequiredExecutionEnvironment;
import manifest.BundleSymbolicName;
import manifest.BundleUpdateLocation;
import manifest.BundleVendor;
import manifest.BundleVersion;
import manifest.DynamicImportPackage;
import manifest.ExportPackage;
import manifest.ExportService;
import manifest.FragmentHost;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.MANIFEST;
import manifest.MANIFESTEntry;
import manifest.MANIFESTVersionEnum;
import manifest.ManifestFactory;
import manifest.PolicyEnum;
import manifest.RequireBundle;
import manifest.Service;
import manifest.SimpleManifestEntryManyValues;
import manifest.Version;
import option.ActivationPolicyDirective;
import option.AttributEntry;
import option.ExcludeClasses;
import option.ExcludePackages;
import option.ExportPackageDirective;
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
import fr.irisa.osgi.manifest.parser.analysis.Analysis;
import fr.irisa.osgi.manifest.parser.node.*;
import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorUtil;
import framework.Bundle;

public class Translation implements Analysis {

	private Map<Bundle, String> log;
	private boolean validTranslation;

	private MANIFEST manifest;
	private Bundle bundle;

	private List<Service> servicesAvailable;
	
	private Map<Bundle, String> fragmentHostReferences;

	private Map<BundleClassPath, Bundle> unresolvedBundleClassPathBundle;
	private Map<BundleClassPath, List<String>> unresolvedBundleClassPathValue;
	
	private Map<RequireBundle, Bundle> unresolvedRequireBundleBundle;
	private Map<RequireBundle, String> unresolvedRequireBundleValue;
	
	private Map<ImportPackage, Bundle> unresolvedImportPackageBundle;
	private Map<ImportPackage, List<String>> unresolvedImportPackageValue;
	
	private Map<ImportService, Bundle> unresolvedImportServiceBundle;
	private Map<ImportService, String> unresolvedImportServiceValue;

	private Map<BundleActivator, Bundle> unresolvedActivatorBundle;
	private Map<BundleActivator, String> unresolvedActivatorValue;

	private Map<Service, Bundle> unresolvedExportServiceBundle;
	private Map<Service, String> unresolvedExportServiceValue;

	private Map<ExportPackage, Bundle> unresolvedExportPackageBundle;
	private Map<ExportPackage, List<String>> unresolvedExportPackageValue;

	private Map<Uses, Bundle> unresolvedExportPackageUsesBundle;
	private Map<Uses, List<String>> unresolvedExportPackageUsesValue;

	private Map<ExcludeClasses, ExportPackage> unresolvedExportPackageExcludeExportPackage;
	private Map<ExcludeClasses, List<String>> unresolvedExportPackageExcludeValue;

	private Map<IncludeClasses, ExportPackage> unresolvedExportPackageIncludeExportPackage;
	private Map<IncludeClasses, List<String>> unresolvedExportPackageIncludeValue;

	private Map<ExcludePackages, Bundle> unresolvedActivationPolicyExcludeBundle;
	private Map<ExcludePackages, List<String>> unresolvedActivationPolicyExcludeValue;

	private Map<IncludePackages, Bundle> unresolvedActivationPolicyIncludeBundle;
	private Map<IncludePackages, List<String>> unresolvedActivationPolicyIncludeValue;

	private ManifestFactory manifestFactory;
	private OptionFactory parameterFactory;
	private JarFactory jarFactory;

	private int excludeIncludeOrUse;
	private final int exclude = -1;
	private final int include = 1;
	private final int use = 0;

	private Object firstValue;
	private Object secondValue;
	private boolean _import;
	private boolean minNotInclude;
	private boolean maxNotInclude;
	private MANIFESTEntry entry;

	public Translation(Map<Bundle, String> log) {
		manifestFactory = ManifestFactory.eINSTANCE;
		parameterFactory = OptionFactory.eINSTANCE;
		jarFactory = JarFactory.eINSTANCE;

		this.validTranslation = true;
		this.log = log;

		this.servicesAvailable = new ArrayList<Service>();
		
		this.fragmentHostReferences = new Hashtable<Bundle, String>();
		
		this.unresolvedBundleClassPathBundle = new HashMap<BundleClassPath, Bundle>();
		this.unresolvedBundleClassPathValue = new HashMap<BundleClassPath, List<String>>();
		
		this.unresolvedRequireBundleBundle = new HashMap<RequireBundle, Bundle>();
		this.unresolvedRequireBundleValue = new HashMap<RequireBundle, String>();
		
		this.unresolvedImportPackageBundle = new HashMap<ImportPackage, Bundle>();
		this.unresolvedImportPackageValue = new HashMap<ImportPackage, List<String>>();
		
		this.unresolvedImportServiceBundle = new HashMap<ImportService, Bundle>();
		this.unresolvedImportServiceValue = new HashMap<ImportService, String>();

		this.unresolvedActivatorBundle = new Hashtable<BundleActivator, Bundle>();
		this.unresolvedActivatorValue = new Hashtable<BundleActivator, String>();

		this.unresolvedExportServiceBundle = new Hashtable<Service, Bundle>();
		this.unresolvedExportServiceValue = new Hashtable<Service, String>();

		this.unresolvedExportPackageBundle = new Hashtable<ExportPackage, Bundle>();
		this.unresolvedExportPackageValue = new Hashtable<ExportPackage, List<String>>();

		this.unresolvedExportPackageUsesBundle = new Hashtable<Uses, Bundle>();
		this.unresolvedExportPackageUsesValue = new Hashtable<Uses, List<String>>();

		this.unresolvedExportPackageExcludeExportPackage = new Hashtable<ExcludeClasses, ExportPackage>();
		this.unresolvedExportPackageExcludeValue = new Hashtable<ExcludeClasses, List<String>>();

		this.unresolvedExportPackageIncludeExportPackage = new Hashtable<IncludeClasses, ExportPackage>();
		this.unresolvedExportPackageIncludeValue = new Hashtable<IncludeClasses, List<String>>();

		this.unresolvedActivationPolicyExcludeBundle = new Hashtable<ExcludePackages, Bundle>();
		this.unresolvedActivationPolicyExcludeValue = new Hashtable<ExcludePackages, List<String>>();

		this.unresolvedActivationPolicyIncludeBundle = new Hashtable<IncludePackages, Bundle>();
		this.unresolvedActivationPolicyIncludeValue = new Hashtable<IncludePackages, List<String>>();

	}

	public void caseAAttribute(AAttribute node) {
		AttributEntry attribute = parameterFactory.createAttributEntry();
		String token = node.getAttributeEntry().getText().split("=")[0];
		if (token.endsWith(":")) {
			token = token.substring(0, token.length() - 1);
		}
		attribute.setToken(token);
		this.firstValue = "";
		node.getStringEntryValue().apply(this);
		attribute.setValue((String) this.firstValue);
		this.entry.addOption(attribute);

	}

	public void caseAActivationPolicyExcludeIncludeIdentifier(
			AActivationPolicyExcludeIncludeIdentifier node) {
		node.getPackageName().apply(this);
		this.registerUnresolvedActivationPolicyDirective(
				(ActivationPolicyDirective) this.secondValue,
				(String) this.firstValue);

	}

	public void caseAActivationpolicyValue(AActivationpolicyValue node) {
		this.firstValue = PolicyEnum.LAZY;

	}

	public void caseAAlwaysFragmentAttachmentValue(
			AAlwaysFragmentAttachmentValue node) {
		this.firstValue = FragmentAttachmentEnum.ALWAYS;

	}

	public void caseABundleActivationpolicyEntry(
			ABundleActivationpolicyEntry node) {
		if (node.getBundleActivationpolicyEntryValue() != null) {
			node.getBundleActivationpolicyEntryValue().apply(this);
		}

	}

	public void caseABundleActivationpolicyEntryManifestentry(
			ABundleActivationpolicyEntryManifestentry node) {
		node.getBundleActivationpolicyEntry().apply(this);

	}

	public void caseABundleActivationpolicyEntryValue(
			ABundleActivationpolicyEntryValue node) {
		BundleActivationPolicy entry = manifestFactory
				.createBundleActivationPolicy();
		this.firstValue = null;
		node.getActivationpolicyValue().apply(this);
		entry.setPolicy((PolicyEnum) this.firstValue);
		this.entry = entry;
		for (PActivationpolicyOptions option : node
				.getActivationpolicyOptions()) {
			option.apply(this);
		}
		this.manifest.setBundleActivationPolicy(entry);

	}

	public void caseABundleActivatorEntry(ABundleActivatorEntry node) {
		if (node.getBundleActivatorEntryValue() != null) {
			node.getBundleActivatorEntryValue().apply(this);
		}

	}

	public void caseABundleActivatorEntryManifestentry(
			ABundleActivatorEntryManifestentry node) {
		node.getBundleActivatorEntry().apply(this);

	}

	public void caseABundleActivatorEntryValue(ABundleActivatorEntryValue node) {
		BundleActivator entry = manifestFactory.createBundleActivator();
		this.firstValue = "";
		node.getUniqueName().apply(this);
		this.unresolvedActivatorBundle.put(entry, this.bundle);
		this.unresolvedActivatorValue.put(entry, (String) this.firstValue);
		this.manifest.setBundleActivator(entry);

	}

	public void caseABundleCategoryEntry(ABundleCategoryEntry node) {
		if (node.getBundleCategoryEntryValue() != null) {
			node.getBundleCategoryEntryValue().apply(this);
		}

	}

	public void caseABundleCategoryEntryManifestentry(
			ABundleCategoryEntryManifestentry node) {
		node.getBundleCategoryEntry().apply(this);

	}

	public void caseABundleCategoryEntryValue(ABundleCategoryEntryValue node) {
		BundleCategory entry = manifestFactory.createBundleCategory();
		this.firstValue = "";
		node.getStringEntryValue().apply(this);
		entry.addValue((String) this.firstValue);

	}

	public void caseABundleClasspathEntry(ABundleClasspathEntry node) {
		if (node.getBundleClasspathEntryValue() != null) {
			node.getBundleClasspathEntryValue().apply(this);
		}

	}

	public void caseABundleClasspathEntryManifestentry(
			ABundleClasspathEntryManifestentry node) {
		node.getBundleClasspathEntry().apply(this);

	}

	public void caseABundleClasspathEntryValue(ABundleClasspathEntryValue node) {
		node.getClasspathEntry().apply(this);
		for (PClasspathValue classPathValue : node.getClasspathValue()) {
			classPathValue.apply(this);
		}

	}

	public void caseABundleContactaddressEntry(ABundleContactaddressEntry node) {
		BundleContactAddress entry = manifestFactory
				.createBundleContactAddress();
		entry.setValue(node.getAllString().getText());

		this.entry = entry;
		this.setAttributes(node.getParameter());

		this.manifest.setBundleContactAddress(entry);

	}

	public void caseABundleContactaddressEntryManifestentry(
			ABundleContactaddressEntryManifestentry node) {
		node.getBundleContactaddressEntry().apply(this);

	}

	public void caseABundleCopyrightEntry(ABundleCopyrightEntry node) {
		BundleCopyright entry = manifestFactory.createBundleCopyright();
		entry.setValue(node.getAllString().getText());

		this.entry = entry;
		this.setAttributes(node.getParameter());

		this.manifest.setBundleCopyright(entry);

	}

	public void caseABundleCopyrightEntryManifestentry(
			ABundleCopyrightEntryManifestentry node) {
		node.getBundleCopyrightEntry().apply(this);

	}

	public void caseABundleDescriptionEntry(ABundleDescriptionEntry node) {
		BundleDescription entry = manifestFactory.createBundleDescription();
		entry.setValue(node.getAllString().getText());

		this.entry = entry;
		for (PParameter parameter : node.getParameter()) {
			parameter.apply(this);
		}

		this.manifest.setBundleDescription(entry);

	}

	public void caseABundleDescriptionEntryManifestentry(
			ABundleDescriptionEntryManifestentry node) {
		node.getBundleDescriptionEntry().apply(this);

	}

	public void caseABundleDocurlEntry(ABundleDocurlEntry node) {
		BundleDocURL entry = manifestFactory.createBundleDocURL();

		this.firstValue = "";
		node.getUrlValue().apply(this);

		entry.setUrl((URL) this.firstValue);

		this.entry = entry;
		this.setAttributes(node.getParameter());

		this.manifest.setBundleDocURL(entry);

	}

	public void caseABundleDocurlEntryManifestentry(
			ABundleDocurlEntryManifestentry node) {
		node.getBundleDocurlEntry().apply(this);

	}

	public void caseABundleLocalizationEntry(ABundleLocalizationEntry node) {
		BundleLocalization entry = manifestFactory.createBundleLocalization();
		entry.setValue(node.getAllString().getText());

		this.entry = entry;
		this.setAttributes(node.getParameter());

		this.manifest.setBundleLocalization(entry);

	}

	public void caseABundleLocalizationEntryManifestentry(
			ABundleLocalizationEntryManifestentry node) {
		node.getBundleLocalizationEntry().apply(this);

	}

	public void caseABundleManifestversionEntry(ABundleManifestversionEntry node) {
		BundleManifestVersion entry = manifestFactory
				.createBundleManifestVersion();
		String version = node.getManifestversion().getText();
		for (MANIFESTVersionEnum manifestVersion : MANIFESTVersionEnum.VALUES) {
			if (manifestVersion.getLiteral().equals(version)) {
				entry.setManifestVersion(manifestVersion);
				break;
			}
		}

		this.entry = entry;
		this.setAttributes(node.getParameter());

		this.manifest.setBundleManifestVersion(entry);

	}

	public void caseABundleManifestversionEntryManifestentry(
			ABundleManifestversionEntryManifestentry node) {
		node.getBundleManifestversionEntry().apply(this);

	}

	public void caseABundleNameEntry(ABundleNameEntry node) {
		BundleName entry = manifestFactory.createBundleName();
		entry.setValue(node.getAllString().getText());

		this.entry = entry;
		this.setAttributes(node.getParameter());

		this.manifest.setBundleName(entry);

	}

	public void caseABundleNameEntryManifestentry(
			ABundleNameEntryManifestentry node) {
		node.getBundleNameEntry().apply(this);

	}

	public void caseABundleNativecodeEntry(ABundleNativecodeEntry node) {
		if (node.getBundleNativecodeEntryValue() != null) {
			node.getBundleNativecodeEntryValue().apply(this);
		}

	}

	public void caseABundleNativecodeEntryManifestentry(
			ABundleNativecodeEntryManifestentry node) {
		node.getBundleNativecodeEntry().apply(this);

	}

	public void caseABundleNativecodeEntryValue(ABundleNativecodeEntryValue node) {
		node.getNativecodeEntry().apply(this);

		for (PNativecodeValue nativeCodeValue : node.getNativecodeValue()) {
			nativeCodeValue.apply(this);
		}

		if (node.getNativecodeOptional() != null) {
			node.getNativecodeOptional().apply(this);
		}

	}

	public void caseABundleRequiredexecutionenvironmentEntry(
			ABundleRequiredexecutionenvironmentEntry node) {
		node.getBundleRequiredexecutionenvironmentEntryValue().apply(this);

	}

	public void caseABundleRequiredexecutionenvironmentEntryManifestentry(
			ABundleRequiredexecutionenvironmentEntryManifestentry node) {
		node.getBundleRequiredexecutionenvironmentEntry().apply(this);

	}

	public void caseABundleRequiredexecutionenvironmentEntryValue(
			ABundleRequiredexecutionenvironmentEntryValue node) {
		node.getRequiredexecutionenvironment().apply(this);
		;

		for (PRequiredexecutionenvironmentValue value : node
				.getRequiredexecutionenvironmentValue()) {
			value.apply(this);
		}

	}

	public void caseABundleSymbolicnameEntry(ABundleSymbolicnameEntry node) {
		BundleSymbolicName entry = manifestFactory.createBundleSymbolicName();

		this.firstValue = "";
		node.getUniqueName().apply(this);
		entry.setSymbolicName((String) this.firstValue);
		this.bundle.setSymbolicName((String) this.firstValue);
		this.entry = entry;
		for (PSymbolicnameOption option : node.getSymbolicnameOption()) {
			option.apply(this);
		}

		this.manifest.setBundleSymbolicName(entry);
	}

	public void caseABundleSymbolicnameEntryManifestentry(
			ABundleSymbolicnameEntryManifestentry node) {
		node.getBundleSymbolicnameEntry().apply(this);

	}

	public void caseABundleUpdatelocationEntry(ABundleUpdatelocationEntry node) {
		BundleUpdateLocation entry = manifestFactory
				.createBundleUpdateLocation();

		this.firstValue = "";
		node.getUrlValue().apply(this);
		entry.setUrl((URL) this.firstValue);
		this.entry = entry;
		this.setAttributes(node.getParameter());
		this.manifest.setBundleUpdateLocation(entry);

	}

	public void caseABundleUpdatelocationEntryManifestentry(
			ABundleUpdatelocationEntryManifestentry node) {
		node.getBundleUpdatelocationEntry().apply(this);

	}

	public void caseABundleVendorEntry(ABundleVendorEntry node) {
		BundleVendor entry = manifestFactory.createBundleVendor();
		entry.setValue(node.getAllString().getText());

		this.entry = entry;
		this.setAttributes(node.getParameter());

		this.manifest.setBundleVendor(entry);

	}

	public void caseABundleVendorEntryManifestentry(
			ABundleVendorEntryManifestentry node) {
		node.getBundleVendorEntry().apply(this);

	}

	public void caseABundleVersionEntry(ABundleVersionEntry node) {
		BundleVersion entry = manifestFactory.createBundleVersion();
		this.firstValue = manifestFactory.createVersion();
		node.getMajorVersionEntry().apply(this);

		entry.setVersion((Version) this.firstValue);
		this.entry = entry;
		this.setAttributes(node.getParameter());
		this.manifest.setBundleVersion(entry);

	}

	public void caseABundleVersionEntryManifestentry(
			ABundleVersionEntryManifestentry node) {
		node.getBundleVersionEntry().apply(this);

	}

	public void caseACategoryValue(ACategoryValue node) {
		this.firstValue = "";
		node.getStringEntryValue().apply(this);
		((BundleCategory) this.entry).addValue((String) this.firstValue);

	}

	public void caseAClasspathEntry(AClasspathEntry node) {
		BundleClassPath entry = manifestFactory.createBundleClassPath();

		this.entry = entry;
		this.setTargetToClassPath(node.getTarget());

		for (PClasspathEntryValue entryValue : node.getClasspathEntryValue()) {
			entryValue.apply(this);
		}

		for (PParameter parameter : node.getParameter()) {
			parameter.apply(this);
		}

		if (entry.getEntries().size() > 0) {
			this.manifest.addBundleClassPath(entry);
		}
		
	}

	public void caseAClasspathEntryValue(AClasspathEntryValue node) {
		this.setTargetToClassPath(node.getTarget());

	}

	public void caseAClasspathValue(AClasspathValue node) {
		node.getClasspathEntry().apply(this);

	}

	public void caseADigestEntry(ADigestEntry node) {
		SimpleManifestEntryManyValues entry = manifestFactory
				.createSimpleManifestEntryManyValues();
		entry.setEntryName(node.getEntryDigest().getText().replace(":", "")
				.replace(" ", ""));
		entry.addValue(node.getDigestValue().getText());

		this.manifest.addUnknownEntry(entry);
	}

	public void caseADigestEntryOtherEntry(ADigestEntryOtherEntry node) {
		node.getDigestEntry().apply(this);

	}

	public void caseADotTarget(ADotTarget node) {
		this.firstValue = ".";

	}

	public void caseADynamicDescription(ADynamicDescription node) {
		DynamicImportPackage entry = manifestFactory
				.createDynamicImportPackage();

		this.firstValue = "";
		node.getPackageNameWildcard().apply(this);
		entry.addPackage((String) this.firstValue);

		this.entry = entry;
		for (PDynamicimportPackageNames value : node
				.getDynamicimportPackageNames()) {
			value.apply(this);
		}

		for (PParameter parameter : node.getParameter()) {
			parameter.apply(this);
		}

		this.manifest.addDynamicImportPackage(entry);
	}

	public void caseADynamicimportPackageEntry(ADynamicimportPackageEntry node) {
		node.getDynamicimportPackageEntryValue().apply(this);

	}

	public void caseADynamicimportPackageEntryManifestentry(
			ADynamicimportPackageEntryManifestentry node) {
		node.getDynamicimportPackageEntry().apply(this);

	}

	public void caseADynamicimportPackageEntryValue(
			ADynamicimportPackageEntryValue node) {
		node.getDynamicDescription().apply(this);

		for (PDynamicimportPackageValue value : node
				.getDynamicimportPackageValue()) {
			value.apply(this);
		}

	}

	public void caseADynamicimportPackageNames(ADynamicimportPackageNames node) {
		this.firstValue = "";
		node.getPackageNameWildcard().apply(this);
		((DynamicImportPackage) this.entry)
				.addPackage((String) this.firstValue);

	}

	public void caseADynamicimportPackageValue(ADynamicimportPackageValue node) {
		node.getDynamicDescription().apply(this);

	}

	public void caseAEqualsBooleanComparator(AEqualsBooleanComparator node) {
		this.firstValue = (String) this.firstValue + node.getEquals();

	}

	public void caseAExcludeActivationpolicyDirective(
			AExcludeActivationpolicyDirective node) {
		this.excludeIncludeOrUse = this.exclude;
		this.secondValue = parameterFactory.createExcludePackages();
		node.getActivationPolicyExcludeIncludeValue().apply(this);

	}

	public void caseAExcludeExportPackageDirective(
			AExcludeExportPackageDirective node) {
		this.excludeIncludeOrUse = this.exclude;
		this.secondValue = parameterFactory.createExcludeClasses();
		node.getExportPackageUseExcludeIncludeValue().apply(this);

	}

	public void caseAExcludeIncludeManyPackagesActivationPolicyExcludeIncludeValue(
			AExcludeIncludeManyPackagesActivationPolicyExcludeIncludeValue node) {
		this.firstValue = "";
		node.getPackageName().apply(this);
		this.registerUnresolvedActivationPolicyDirective(
				(ActivationPolicyDirective) this.secondValue,
				(String) this.firstValue);

		for (PActivationPolicyExcludeIncludeIdentifier identifier : node
				.getActivationPolicyExcludeIncludeIdentifier()) {
			identifier.apply(this);
		}
		((BundleActivationPolicy) this.entry)
				.addDirective((ActivationPolicyDirective) this.secondValue);

	}

	public void caseAExcludeIncludeOnePackageActivationPolicyExcludeIncludeValue(
			AExcludeIncludeOnePackageActivationPolicyExcludeIncludeValue node) {
		this.firstValue = "";
		node.getPackageName().apply(this);
		this.registerUnresolvedActivationPolicyDirective(
				(ActivationPolicyDirective) this.secondValue,
				(String) this.firstValue);
		((BundleActivationPolicy) this.entry)
				.addDirective((ActivationPolicyDirective) this.secondValue);

	}

	public void caseAExportPackageAttributeExportPackageParameter(
			AExportPackageAttributeExportPackageParameter node) {
		node.getParameter().apply(this);

	}

	public void caseAExportPackageDirectiveExportPackageParameter(
			AExportPackageDirectiveExportPackageParameter node) {
		node.getExportPackageDirective().apply(this);

	}

	public void caseAExportPackageEntry(AExportPackageEntry node) {
		node.getExportPackageEntryValue1().apply(this);

	}

	public void caseAExportPackageEntryManifestentry(
			AExportPackageEntryManifestentry node) {
		node.getExportPackageEntry().apply(this);

	}

	public void caseAExportPackageEntryValue(AExportPackageEntryValue node) {
		ExportPackage entry = manifestFactory.createExportPackage();
		this.firstValue = "";
		node.getPackageName().apply(this);

		List<String> exports = new ArrayList<String>();

		exports.add((String) this.firstValue);

		for (PPackageNames name : node.getPackageNames()) {
			this.firstValue = "";
			name.apply(this);
			exports.add((String) this.firstValue);
		}

		this.unresolvedExportPackageBundle.put(entry, this.bundle);
		this.unresolvedExportPackageValue.put(entry, exports);

		this.entry = entry;
		for (PExportPackageParameter parameter : node
				.getExportPackageParameter()) {
			parameter.apply(this);
		}

		this.manifest.addExportPackage(entry);

	}

	public void caseAExportPackageEntryValue1(AExportPackageEntryValue1 node) {
		node.getExportPackageEntryValue().apply(this);

		for (PExportPackageValue value : node.getExportPackageValue()) {
			value.apply(this);
		}

	}

	public void caseAExportPackageValue(AExportPackageValue node) {
		node.getExportPackageEntryValue().apply(this);

	}

	public void caseAExportServiceEntry(AExportServiceEntry node) {
		node.getExportServiceEntryValue().apply(this);

	}

	public void caseAExportServiceEntryManifestentry(
			AExportServiceEntryManifestentry node) {
		node.getExportServiceEntry().apply(this);

	}

	public void caseAExportServiceEntryValue(AExportServiceEntryValue node) {
		ExportService entry = manifestFactory.createExportService();
		this.firstValue = "";
		node.getUniqueName().apply(this);
		Service service = manifestFactory.createService();

		this.unresolvedExportServiceBundle.put(service, this.bundle);
		this.unresolvedExportServiceValue
				.put(service, (String) this.firstValue);
		this.servicesAvailable.add(service);

		entry.setService((Service) service);

		this.entry = entry;
		for (PParameter parameter : node.getParameter()) {
			parameter.apply(this);
		}
		this.manifest.addExportService(entry);

		this._import = false;
		for (PServiceValue value : node.getServiceValue()) {
			value.apply(this);
		}

	}

	public void caseAExtensionBootclasspathExtensionValue(
			AExtensionBootclasspathExtensionValue node) {
		this.firstValue = ExtensionEnum.BOOTCLASSPATH;

	}

	public void caseAExtensionFrameworkExtensionValue(
			AExtensionFrameworkExtensionValue node) {
		this.firstValue = ExtensionEnum.FRAMEWORK;

	}

	public void caseAFalseBoolean(AFalseBoolean node) {
		this.firstValue = false;

	}

	public void caseAFileUnquotedUrl(AFileUnquotedUrl node) {
		this.firstValue = (String) this.firstValue
				+ node.getUrlFile().getText();
		node.getPathUnquoted().apply(this);
		try {
			URL url = new URL((String) this.firstValue);
			this.firstValue = url;
		} catch (MalformedURLException e) {
			this.log
					.put(
							this.bundle,
							this.log.get(this.bundle)
									+ "MalformedURLException :  an URL value into the MANIFEST is malformed : "
									+ this.firstValue + "." + "\n");
		}

	}

	public void caseAFragmentAttachmentSymbolicnameDirective(
			AFragmentAttachmentSymbolicnameDirective node) {
		this.firstValue = null;
		node.getFragmentAttachmentValue().apply(this);
		FragmentAttachment directive = parameterFactory
				.createFragmentAttachment();
		directive
				.setFragmentAttachment((FragmentAttachmentEnum) this.firstValue);
		((BundleSymbolicName) this.entry).addDirective(directive);

	}

	public void caseAFragmentHostAttributeFragmentHostParameter(
			AFragmentHostAttributeFragmentHostParameter node) {
		node.getParameter().apply(this);

	}

	public void caseAFragmentHostDirective(AFragmentHostDirective node) {
		Extension directive = parameterFactory.createExtension();
		this.firstValue = null;
		node.getExtensionValue().apply(this);
		directive.setExtension((ExtensionEnum) this.firstValue);
		((FragmentHost) this.entry).setDirectives(directive);

	}

	public void caseAFragmentHostDirectiveFragmentHostParameter(
			AFragmentHostDirectiveFragmentHostParameter node) {
		node.getFragmentHostDirective().apply(this);

	}

	public void caseAFragmentHostEntry(AFragmentHostEntry node) {
		if (node.getFragmentHostEntryValue() != null) {
			node.getFragmentHostEntryValue().apply(this);
		}

	}

	public void caseAFragmentHostEntryManifestentry(
			AFragmentHostEntryManifestentry node) {
		node.getFragmentHostEntry().apply(this);

	}

	public void caseAFragmentHostEntryValue(AFragmentHostEntryValue node) {
		FragmentHost entry = manifestFactory.createFragmentHost();
		this.firstValue = "";
		node.getUniqueName().apply(this);
		this.fragmentHostReferences.put(this.bundle, (String) this.firstValue);

		this.entry = entry;
		for (PFragmentHostParameter parameter : node.getFragmentHostParameter()) {
			parameter.apply(this);
		}

		this.manifest.setFragmentHost(entry);
	}

	public void caseAFtpUnquotedUrl(AFtpUnquotedUrl node) {
		this.firstValue = (String) this.firstValue + node.getUrlFtp().getText();
		node.getPathUnquoted().apply(this);
		try {
			URL url = new URL((String) this.firstValue);
			this.firstValue = url;
		} catch (MalformedURLException e) {
			this.log
					.put(
							this.bundle,
							this.log.get(this.bundle)
									+ "MalformedURLException :  an URL value into the MANIFEST is malformed : "
									+ this.firstValue + "." + "\n");
		}

	}

	public void caseAGreaterBooleanComparator(AGreaterBooleanComparator node) {
		this.firstValue = (String) this.firstValue
				+ node.getGreater().getText();

	}

	public void caseAGreaterEqualsBooleanComparator(
			AGreaterEqualsBooleanComparator node) {
		this.firstValue = (String) this.firstValue
				+ node.getGreaterEquals().getText();

	}

	public void caseAHttpUnquotedUrl(AHttpUnquotedUrl node) {
		this.firstValue = node.getUrlHttp().getText();
		node.getPathUnquoted().apply(this);
		try {
			URL url = new URL((String) this.firstValue);
			this.firstValue = url;
		} catch (MalformedURLException e) {
			this.log
					.put(
							this.bundle,
							this.log.get(this.bundle)
									+ "MalformedURLException :  an URL value into the MANIFEST is malformed : "
									+ this.firstValue + "." + "\n");
		}

	}

	public void caseAImportPackageAttributeImportPackageParameter(
			AImportPackageAttributeImportPackageParameter node) {
		node.getParameter().apply(this);

	}

	public void caseAImportPackageDirective(AImportPackageDirective node) {
		Resolution directive = parameterFactory.createResolution();
		this.firstValue = null;
		node.getResolutionValue().apply(this);
		directive.setResolution((ResolutionEnum) this.firstValue);

	}

	public void caseAImportPackageDirectiveImportPackageParameter(
			AImportPackageDirectiveImportPackageParameter node) {
		node.getImportPackageDirective().apply(this);

	}

	public void caseAImportPackageEntry(AImportPackageEntry node) {
		if (node.getImportPackageEntryValue1() != null) {
			node.getImportPackageEntryValue1().apply(this);
		}

	}

	public void caseAImportPackageEntryManifestentry(
			AImportPackageEntryManifestentry node) {
		node.getImportPackageEntry().apply(this);

	}

	public void caseAImportPackageEntryValue(AImportPackageEntryValue node) {
		ImportPackage entry = manifestFactory.createImportPackage();

		this.firstValue = "";
		node.getPackageName().apply(this);

		List<String> exports = new ArrayList<String>();

		exports.add((String) this.firstValue);

		for (PPackageNames name : node.getPackageNames()) {
			this.firstValue = "";
			name.apply(this);
			exports.add((String) this.firstValue);
		}

		this.unresolvedImportPackageBundle.put(entry, this.bundle);
		this.unresolvedImportPackageValue.put(entry, exports);

		this.entry = entry;
		for (PImportPackageParameter parameter : node
				.getImportPackageParameter()) {
			parameter.apply(this);
		}

		this.manifest.addImportPackage(entry);

	}

	public void caseAImportPackageEntryValue1(AImportPackageEntryValue1 node) {
		node.getImportPackageEntryValue().apply(this);

		for (PImportPackageValue value : node.getImportPackageValue()) {
			value.apply(this);
		}

	}

	public void caseAImportPackageValue(AImportPackageValue node) {
		node.getImportPackageEntryValue().apply(this);

	}

	public void caseAImportServiceEntry(AImportServiceEntry node) {
		if (node.getImportServiceEntryValue() != null) {
			node.getImportServiceEntryValue().apply(this);
		}

	}

	public void caseAImportServiceEntryManifestentry(
			AImportServiceEntryManifestentry node) {
		node.getImportServiceEntry().apply(this);

	}

	public void caseAImportServiceEntryValue(AImportServiceEntryValue node) {
		this.firstValue = "";
		node.getUniqueName().apply(this);
		ImportService entry = manifestFactory.createImportService();
		this.unresolvedImportServiceBundle.put(entry, this.bundle);
		this.unresolvedImportServiceValue.put(entry, (String) this.firstValue);
		this.manifest.addImportService(entry);

		this._import = true;
		for (PServiceValue value : node.getServiceValue()) {
			value.apply(this);
		}

	}

	public void caseAIncludeActivationpolicyDirective(
			AIncludeActivationpolicyDirective node) {
		this.excludeIncludeOrUse = this.include;
		this.secondValue = parameterFactory.createIncludePackages();
		node.getActivationPolicyExcludeIncludeValue().apply(this);

	}

	public void caseAIncludeExportPackageDirective(
			AIncludeExportPackageDirective node) {
		this.excludeIncludeOrUse = this.include;
		this.secondValue = parameterFactory.createIncludeClasses();
		node.getExportPackageUseExcludeIncludeValue().apply(this);

	}

	public void caseALanguageDirective(ALanguageDirective node) {
		Language directive = parameterFactory.createLanguage();

		this.firstValue = "";
		node.getLanguageValue().apply(this);
		if (this.firstValue instanceof String) {
			for (ISOCodeLanguage language : ISOCodeLanguage.VALUES) {
				if (language.getLiteral().equals((String) this.firstValue)) {
					directive.setIsoCode(language);
					((BundleNativeCode) this.entry).addDirective(directive);
					break;
				}
			}
		}
	}

	public void caseALanguageDirectiveNativecodeDirective(
			ALanguageDirectiveNativecodeDirective node) {
		node.getLanguageDirective().apply(this);

	}

	public void caseALanguageValue(ALanguageValue node) {
		this.firstValue = (String) this.firstValue
				+ node.getIdentifier().getText();

	}

	public void caseALessBooleanComparator(ALessBooleanComparator node) {
		this.firstValue = (String) this.firstValue + node.getLess().getText();

	}

	public void caseALesserEqualsBooleanComparator(
			ALesserEqualsBooleanComparator node) {
		this.firstValue = (String) this.firstValue
				+ node.getLesserEquals().getText();

	}

	public void caseAMajorVersion(AMajorVersion node) {
		int majorVersion = Integer.parseInt(node.getNumber().getText());
		((Version) this.firstValue).setMajor(majorVersion);

		if (node.getMinorVersion() != null) {
			node.getMinorVersion().apply(this);
		}

	}

	public void caseAMandatoryExportPackageDirective(
			AMandatoryExportPackageDirective node) {
		Mandatory directive = parameterFactory.createMandatory();
		node.getMandatoryValue().apply(this);
		if (this.firstValue instanceof AttributEntry) {
			directive.addAttribut((AttributEntry) this.firstValue);
			((ExportPackage) this.entry).addDirective(directive);
		} else if (this.firstValue instanceof List) {
			for (AttributEntry attribut : (List<AttributEntry>) this.firstValue) {
				directive.addAttribut(attribut);
			}
			((ExportPackage) this.entry).addDirective(directive);
		} else {
			this.log.put(this.bundle, this.log.get(this.bundle)
					+ "this mandatory value " + this.firstValue
					+ " is not valid." + "\n");
		}

	}

	public void caseAMandatoryManyAttributesMandatoryValue(
			AMandatoryManyAttributesMandatoryValue node) {
		List<String> attributToken = new ArrayList<String>();
		node.getUnquotedString().getText();
		attributToken.add((String) this.firstValue);

		for (PMandatoryString mandatoryString : node.getMandatoryString()) {
			this.firstValue = "";
			mandatoryString.apply(this);
			if (this.firstValue instanceof String) {
				attributToken.add((String) this.firstValue);
			}
		}

		List<AttributEntry> attributs = new ArrayList<AttributEntry>();

		for (String token : attributToken) {
			for (AttributEntry attribut : this.entry.getOptions()) {
				if (token.equals(attribut.getToken())) {
					attributs.add(attribut);
					break;
				}
			}
		}
		this.firstValue = attributs;

	}

	public void caseAMandatoryOneAttributeMandatoryValue(
			AMandatoryOneAttributeMandatoryValue node) {
		String value = node.getUnquotedString().getText();
		for (AttributEntry attribut : this.entry.getOptions()) {
			if (value.equals(attribut.getToken())) {
				this.firstValue = attribut;
				break;
			}
		}

	}

	public void caseAMandatoryString(AMandatoryString node) {
		this.firstValue = node.getUnquotedString().getText();

	}

	public void caseAManifest(AManifest node) {
		for (PManifestcontent entry : node.getManifestcontent()) {
			entry.apply(this);
		}

	}

	public void caseAManifestcontent(AManifestcontent node) {
		node.getManifestentry().apply(this);

	}

	public void caseAMicroVersion(AMicroVersion node) {
		int microVersion = Integer.parseInt(node.getNumber().getText());
		((Version) this.firstValue).setMicro(microVersion);

		if (node.getQualifierVersion() != null) {
			node.getQualifierVersion().apply(this);
		}

	}

	public void caseAMinorVersion(AMinorVersion node) {
		int minorVersion = Integer.parseInt(node.getNumber().getText());
		((Version) this.firstValue).setMinor(minorVersion);

		if (node.getMicroVersion() != null) {
			node.getMicroVersion().apply(this);
		}

	}

	public void caseANativecodeAttributeNativecodeParameter(
			ANativecodeAttributeNativecodeParameter node) {
		node.getParameter().apply(this);

	}

	public void caseANativecodeDirectiveNativecodeParameter(
			ANativecodeDirectiveNativecodeParameter node) {
		node.getNativecodeDirective().apply(this);

	}

	public void caseANativecodeEntry(ANativecodeEntry node) {
		BundleNativeCode entry = manifestFactory.createBundleNativeCode();

		this.entry = entry;
		this.setTargetToNativeCode(node.getTarget());

		for (PNativecodeEntryValue nativeCodeEntryValue : node
				.getNativecodeEntryValue()) {
			nativeCodeEntryValue.apply(this);
		}

		for (PNativecodeParameter parameter : node.getNativecodeParameter()) {
			parameter.apply(this);
		}

		this.manifest.addBundleNativeCode(entry);

	}

	public void caseANativecodeEntryValue(ANativecodeEntryValue node) {
		this.setTargetToNativeCode(node.getTarget());

	}

	public void caseANativecodeOptional(ANativecodeOptional node) {
		this.manifest.setNativeCodeOptional(true);

	}

	public void caseANativecodeValue(ANativecodeValue node) {
		node.getNativecodeEntry().apply(this);

	}

	public void caseANeverFragmentAttachmentValue(
			ANeverFragmentAttachmentValue node) {
		this.firstValue = FragmentAttachmentEnum.NEVER;

	}

	public void caseANotEqualsBooleanComparator(ANotEqualsBooleanComparator node) {
		this.firstValue = (String) this.firstValue
				+ node.getNotEquals().getText();

	}

	public void caseAOsnameAixOsnameValue(AOsnameAixOsnameValue node) {
		this.firstValue = OsNameEnum.AIX;

	}

	public void caseAOsnameDigitalunixOsnameValue(
			AOsnameDigitalunixOsnameValue node) {
		this.firstValue = OsNameEnum.DIGITAL_UNIX;

	}

	public void caseAOsnameDirective(AOsnameDirective node) {
		this.firstValue = null;
		node.getOsnameValue().apply(this);
		OsName directive = parameterFactory.createOsName();
		directive.setOsname((OsNameEnum) this.firstValue);
		((BundleNativeCode) this.entry).addDirective(directive);
	}

	public void caseAOsnameDirectiveNativecodeDirective(
			AOsnameDirectiveNativecodeDirective node) {
		node.getOsnameDirective().apply(this);

	}

	public void caseAOsnameEmbosOsnameValue(AOsnameEmbosOsnameValue node) {
		this.firstValue = OsNameEnum.EMBOS;

	}

	public void caseAOsnameEpoc32OsnameValue(AOsnameEpoc32OsnameValue node) {
		this.firstValue = OsNameEnum.EPOC32;

	}

	public void caseAOsnameFreebsdOsnameValue(AOsnameFreebsdOsnameValue node) {
		this.firstValue = OsNameEnum.FREE_BSD;

	}

	public void caseAOsnameHpuxOsnameValue(AOsnameHpuxOsnameValue node) {
		this.firstValue = OsNameEnum.HPUX;

	}

	public void caseAOsnameIrixOsnameValue(AOsnameIrixOsnameValue node) {
		this.firstValue = OsNameEnum.IRIX;

	}

	public void caseAOsnameLinuxOsnameValue(AOsnameLinuxOsnameValue node) {
		this.firstValue = OsNameEnum.LINUX;

	}

	public void caseAOsnameMacosOsnameValue(AOsnameMacosOsnameValue node) {
		this.firstValue = OsNameEnum.MAC_OS;

	}

	public void caseAOsnameNetbsdOsnameValue(AOsnameNetbsdOsnameValue node) {
		this.firstValue = OsNameEnum.NET_BSD;

	}

	public void caseAOsnameNetwareOsnameValue(AOsnameNetwareOsnameValue node) {
		this.firstValue = OsNameEnum.NETWARE;

	}

	public void caseAOsnameOpenbsdOsnameValue(AOsnameOpenbsdOsnameValue node) {
		this.firstValue = OsNameEnum.OPEN_BSD;

	}

	public void caseAOsnameOs2OsnameValue(AOsnameOs2OsnameValue node) {
		this.firstValue = OsNameEnum.OS2;

	}

	public void caseAOsnameQnxOsnameValue(AOsnameQnxOsnameValue node) {
		this.firstValue = OsNameEnum.QNX;

	}

	public void caseAOsnameSolarisOsnameValue(AOsnameSolarisOsnameValue node) {
		this.firstValue = OsNameEnum.SOLARIS;

	}

	public void caseAOsnameSunosOsnameValue(AOsnameSunosOsnameValue node) {
		this.firstValue = OsNameEnum.SUN_OS;

	}

	public void caseAOsnameVxworksOsnameValue(AOsnameVxworksOsnameValue node) {
		this.firstValue = OsNameEnum.VX_WORKS;

	}

	public void caseAOsnameWindows2000OsnameValue(
			AOsnameWindows2000OsnameValue node) {
		this.firstValue = OsNameEnum.WINDOWS2000;

	}

	public void caseAOsnameWindows2003OsnameValue(
			AOsnameWindows2003OsnameValue node) {
		this.firstValue = OsNameEnum.WINDOWS2003;

	}

	public void caseAOsnameWindows95OsnameValue(AOsnameWindows95OsnameValue node) {
		this.firstValue = OsNameEnum.WINDOWS95;

	}

	public void caseAOsnameWindows98OsnameValue(AOsnameWindows98OsnameValue node) {
		this.firstValue = OsNameEnum.WINDOWS98;

	}

	public void caseAOsnameWindowsceOsnameValue(AOsnameWindowsceOsnameValue node) {
		this.firstValue = OsNameEnum.WINDOWS_CE;

	}

	public void caseAOsnameWindowsntOsnameValue(AOsnameWindowsntOsnameValue node) {
		this.firstValue = OsNameEnum.WINDOWS_NT;

	}

	public void caseAOsnameWindowsvistaOsnameValue(
			AOsnameWindowsvistaOsnameValue node) {
		this.firstValue = OsNameEnum.WINDOWS_VISTA;

	}

	public void caseAOsnameWindowsxpOsnameValue(AOsnameWindowsxpOsnameValue node) {
		this.firstValue = OsNameEnum.WINDOWS_XP;

	}

	public void caseAOsversionDirective(AOsversionDirective node) {
		OsVersion directive = parameterFactory.createOsVersion();
		this.firstValue = null;
		node.getVersionRange().apply(this);
		directive.setMinVersion((Version) this.firstValue);
		directive.setMinNotInclude(this.minNotInclude);

		if (this.secondValue instanceof Version) {
			directive.setMaxVersion((Version) this.secondValue);
			directive.setMaxNotInclude(this.maxNotInclude);
		}

	}

	public void caseAOsversionDirectiveNativecodeDirective(
			AOsversionDirectiveNativecodeDirective node) {
		node.getOsversionDirective().apply(this);

	}

	public void caseAOtherEntryManifestentry(AOtherEntryManifestentry node) {
		node.getOtherEntry().apply(this);

	}

	public void caseAOtherEntryValue(AOtherEntryValue node) {
		this.firstValue = "";
		((SimpleManifestEntryManyValues) this.entry).addValue(node
				.getSimpleStringValue().getText());
		for (POtherValue otherValue : node.getOtherValue()) {
			this.firstValue = "";
			otherValue.apply(this);
			((SimpleManifestEntryManyValues) this.entry)
					.addValue((String) this.firstValue);
		}

		for (PParameter parameter : node.getParameter()) {
			parameter.apply(this);
		}

	}

	public void caseAOtherEntryValueNext(AOtherEntryValueNext node) {
		node.getOtherEntryValue().apply(this);

	}

	public void caseAOtherValue(AOtherValue node) {
		this.firstValue = (String) node.getSimpleStringValue().getText();

	}

	public void caseAPackageNames(APackageNames node) {
		node.getPackageName().apply(this);

	}

	public void caseAParameter(AParameter node) {
		node.getAttribute().apply(this);

	}

	public void caseAPathElement(APathElement node) {
		this.firstValue = (String) this.firstValue
				+ node.getUnquotedString().getText();

	}

	public void caseAPathQuoted(APathQuoted node) {
		this.firstValue = (String) this.firstValue + "\"";
		node.getPathUnquoted().apply(this);
		this.firstValue = (String) this.firstValue + "\"";
	}

	public void caseAPathQuotedPath(APathQuotedPath node) {
		node.getPathQuoted().apply(this);

	}

	public void caseAPathSepOnlyPathUnquoted(APathSepOnlyPathUnquoted node) {
		this.firstValue = (String) this.firstValue + node.getPathSep();

	}

	public void caseAPathSeptelementPathUnquoted(
			APathSeptelementPathUnquoted node) {
		if (node.getFirst() != null) {
			this.firstValue = (String) this.firstValue
					+ node.getFirst().getText();
		}
		if (node.getSecond() != null) {
			this.firstValue = (String) this.firstValue
					+ node.getSecond().getText();
		}
		if (node.getPathSep() != null) {
			this.firstValue = (String) this.firstValue
					+ node.getPathSep().getText();
		}

		node.getPathElement().apply(this);

		for (PPathSuffix suffix : node.getPathSuffix()) {
			suffix.apply(this);
		}

		this.firstValue = ((String) this.firstValue).replace(" ", "");

	}

	public void caseAPathSuffix(APathSuffix node) {
		this.firstValue = (String) this.firstValue + node.getPathSep();
		node.getPathElement().apply(this);

	}

	public void caseAPathTarget(APathTarget node) {
		node.getPath().apply(this);

	}

	public void caseAPathUnquotedPath(APathUnquotedPath node) {
		node.getPathUnquoted().apply(this);

	}

	public void caseAProcessor68kProcessorValue(AProcessor68kProcessorValue node) {
		this.firstValue = ProcessorEnum.P6_8K;

	}

	public void caseAProcessorAlphaProcessorValue(
			AProcessorAlphaProcessorValue node) {
		this.firstValue = ProcessorEnum.ALPHA;

	}

	public void caseAProcessorArmProcessorValue(AProcessorArmProcessorValue node) {
		this.firstValue = ProcessorEnum.ARM;

	}

	public void caseAProcessorDirective(AProcessorDirective node) {
		Processor directive = parameterFactory.createProcessor();
		this.firstValue = null;
		node.getProcessorValue().apply(this);
		directive.setProcessor((ProcessorEnum) this.firstValue);
		((BundleNativeCode) this.entry).addDirective(directive);

	}

	public void caseAProcessorDirectiveNativecodeDirective(
			AProcessorDirectiveNativecodeDirective node) {
		node.getProcessorDirective().apply(this);

	}

	public void caseAProcessorIgniteProcessorValue(
			AProcessorIgniteProcessorValue node) {
		this.firstValue = ProcessorEnum.IGNITE;

	}

	public void caseAProcessorMipsProcessorValue(
			AProcessorMipsProcessorValue node) {
		this.firstValue = ProcessorEnum.MIPS;

	}

	public void caseAProcessorPariscProcessorValue(
			AProcessorPariscProcessorValue node) {
		this.firstValue = ProcessorEnum.PARISC;

	}

	public void caseAProcessorPowerpcProcessorValue(
			AProcessorPowerpcProcessorValue node) {
		this.firstValue = ProcessorEnum.POWER_PC;

	}

	public void caseAProcessorS390ProcessorValue(
			AProcessorS390ProcessorValue node) {
		this.firstValue = ProcessorEnum.S390;

	}

	public void caseAProcessorS390xProcessorValue(
			AProcessorS390xProcessorValue node) {
		this.firstValue = ProcessorEnum.S39_0X;

	}

	public void caseAProcessorSh4ProcessorValue(AProcessorSh4ProcessorValue node) {
		this.firstValue = ProcessorEnum.SH4;

	}

	public void caseAProcessorSparcProcessorValue(
			AProcessorSparcProcessorValue node) {
		this.firstValue = ProcessorEnum.SPARC;

	}

	public void caseAProcessorV850eProcessorValue(
			AProcessorV850eProcessorValue node) {
		this.firstValue = ProcessorEnum.V850E;

	}

	public void caseAProcessorX8664ProcessorValue(
			AProcessorX8664ProcessorValue node) {
		this.firstValue = ProcessorEnum.X8664;

	}

	public void caseAProcessorX86ProcessorValue(AProcessorX86ProcessorValue node) {
		this.firstValue = ProcessorEnum.X86;

	}

	public void caseAQuotedStringStringEntryValue(
			AQuotedStringStringEntryValue node) {
		this.firstValue = node.getQuotedString().getText();

	}

	public void caseAQuotedUrl(AQuotedUrl node) {
		this.firstValue = "\"";
		node.getUnquotedUrl().apply(this);
		this.firstValue = (String) this.firstValue + "\"";

	}

	public void caseAQuotedUrlValue(AQuotedUrlValue node) {
		node.getQuotedUrl().apply(this);

	}

	public void caseARequireBundleAttributeRequireBundleOptions(
			ARequireBundleAttributeRequireBundleOptions node) {
		node.getParameter().apply(this);

	}

	public void caseARequireBundleDirectiveRequireBundleOptions(
			ARequireBundleDirectiveRequireBundleOptions node) {
		node.getRequireBundleDirective().apply(this);

	}

	public void caseARequireBundleEntry(ARequireBundleEntry node) {
		if (node.getRequireBundleEntryValue() != null) {
			node.getRequireBundleEntryValue().apply(this);
		}
	}

	public void caseARequireBundleEntryManifestentry(
			ARequireBundleEntryManifestentry node) {
		node.getRequireBundleEntry().apply(this);

	}

	public void caseARequireBundleEntryValue(ARequireBundleEntryValue node) {
		node.getRequireBundleSymbolicname().apply(this);

		for (PRequireBundleValue value : node.getRequireBundleValue()) {
			value.apply(this);
		}

	}

	public void caseARequireBundleSymbolicname(ARequireBundleSymbolicname node) {
		RequireBundle entry = ManifestFactory.eINSTANCE.createRequireBundle();
		
		this.firstValue = "";
		node.getUniqueName().apply(this);

		this.unresolvedRequireBundleBundle.put(entry, this.bundle);
		this.unresolvedRequireBundleValue.put(entry, (String) this.firstValue);
		
		this.entry = entry;
		for (PRequireBundleOptions option : node.getRequireBundleOptions()) {
			option.apply(this);
		}
		
		this.manifest.addRequireBundle(entry);
		

	}

	public void caseARequireBundleValue(ARequireBundleValue node) {
		node.getRequireBundleSymbolicname().apply(this);

	}

	public void caseARequiredexecutionenvironment(
			ARequiredexecutionenvironment node) {
		BundleRequiredExecutionEnvironment entry = manifestFactory
				.createBundleRequiredExecutionEnvironment();
		if (node.getIdentifierRequiredConfiguration() != null) {
			String configuration = node.getIdentifierRequiredConfiguration()
					.getText();
			configuration = configuration.substring(0,
					configuration.length() - 1);
			entry.setConfiguration(configuration);
		}
		entry.setProfile(node.getIdentifierRequiredProfile().getText());

		this.manifest.addBundleRequiredExecutionEnvironment(entry);
	}

	public void caseARequiredexecutionenvironmentValue(
			ARequiredexecutionenvironmentValue node) {
		node.getRequiredexecutionenvironment().apply(this);

	}

	public void caseAResolutionDirectiveRequireBundleDirective(
			AResolutionDirectiveRequireBundleDirective node) {
		if (this.entry instanceof RequireBundle) {
			this.firstValue = null;
			node.getResolutionValue().apply(this);
			Resolution directive = parameterFactory.createResolution();
			directive.setResolution((ResolutionEnum) this.firstValue);
			((RequireBundle) this.entry).addDirective(directive);
		}

	}

	public void caseAResolutionMandatoryResolutionValue(
			AResolutionMandatoryResolutionValue node) {
		this.firstValue = ResolutionEnum.MANDATORY;

	}

	public void caseAResolutionOptionalResolutionValue(
			AResolutionOptionalResolutionValue node) {
		this.firstValue = ResolutionEnum.OPTIONAL;

	}

	public void caseAResolveTimeFragmentAttachmentValue(
			AResolveTimeFragmentAttachmentValue node) {
		this.firstValue = FragmentAttachmentEnum.RESOLVETIME;

	}

	public void caseASelectionFilterDirective(ASelectionFilterDirective node) {
		SelectionFilter directive = parameterFactory.createSelectionFilter();
		this.firstValue = "";
		node.getSelectionFilterValue().apply(this);
		directive.setExpression((String) this.firstValue);
		((BundleNativeCode) this.entry).addDirective(directive);

	}

	public void caseASelectionFilterDirectiveNativecodeDirective(
			ASelectionFilterDirectiveNativecodeDirective node) {
		node.getSelectionFilterDirective().apply(this);

	}

	public void caseASelectionFilterValue(ASelectionFilterValue node) {
		node.getFirst().apply(this);
		node.getBooleanComparator().apply(this);
		node.getNext().apply(this);

	}

	public void caseAServiceValue(AServiceValue node) {
		this.firstValue = "";
		node.getUniqueName().apply(this);
		if (this._import) {
			ImportService entry = manifestFactory.createImportService();
			this.unresolvedImportServiceBundle.put(entry, this.bundle);
			this.unresolvedImportServiceValue.put(entry, (String) this.firstValue);
			this.manifest.addImportService(entry);

			this.entry = entry;
			for (PParameter parameter : node.getParameter()) {
				parameter.apply(this);
			}

		} else if (!this._import) {
			ExportService entry = manifestFactory.createExportService();
			Service service = manifestFactory.createService();

			this.unresolvedExportServiceBundle.put(service, this.bundle);
			this.unresolvedExportServiceValue.put(service,
					(String) this.firstValue);
			this.servicesAvailable.add(service);

			entry.setService(service);

			this.entry = entry;
			for (PParameter parameter : node.getParameter()) {
				parameter.apply(this);
			}

			this.manifest.addExportService(entry);
		}
	}

	public void caseASimpleEntry(ASimpleEntry node) {
		SimpleManifestEntryManyValues entry = manifestFactory
				.createSimpleManifestEntryManyValues();
		entry.setEntryName(node.getEntry().getText().split(":")[0]);
		this.entry = entry;
		if (node.getSimpleEntryValue() != null) {
			node.getSimpleEntryValue().apply(this);
			this.manifest.addUnknownEntry(entry);
		}

	}

	public void caseASimpleEntryOtherEntry(ASimpleEntryOtherEntry node) {
		node.getSimpleEntry().apply(this);

	}

	public void caseASimpleEntryValue(ASimpleEntryValue node) {
		node.getOtherEntryValue().apply(this);
		for (POtherEntryValueNext otherEntryValue : node
				.getOtherEntryValueNext()) {
			otherEntryValue.apply(this);
		}

	}

	public void caseASingletonSymbolicnameDirective(
			ASingletonSymbolicnameDirective node) {
		Singleton directive = parameterFactory.createSingleton();
		this.firstValue = null;
		node.getBoolean().apply(this);
		directive.setSingleton((Boolean) this.firstValue);
		((BundleSymbolicName) this.entry).addDirective(directive);

	}

	public void caseASymbolicnameAttributeSymbolicnameOption(
			ASymbolicnameAttributeSymbolicnameOption node) {
		node.getParameter().apply(this);

	}

	public void caseASymbolicnameDirectiveSymbolicnameOption(
			ASymbolicnameDirectiveSymbolicnameOption node) {
		node.getSymbolicnameDirective().apply(this);

	}

	public void caseATrueBoolean(ATrueBoolean node) {
		this.firstValue = true;

	}

	public void caseAUniqueName(AUniqueName node) {
		this.firstValue = (String) this.firstValue
				+ node.getIdentifier().getText();
		for (PUniqueNameSuffix suffix : node.getUniqueNameSuffix()) {
			suffix.apply(this);
		}
	}

	public void caseAUniqueNameSuffix(AUniqueNameSuffix node) {
		this.firstValue = (String) this.firstValue + node.getDot().getText()
				+ node.getIdentifier().getText();

	}

	public void caseAUnquotedStringStringEntryValue(
			AUnquotedStringStringEntryValue node) {
		this.firstValue = (String) this.firstValue
				+ node.getUnquotedString().getText();

	}

	public void caseAUnquotedUrlValue(AUnquotedUrlValue node) {
		node.getUnquotedUrl().apply(this);

	}

	public void caseAUsesExportPackageDirective(AUsesExportPackageDirective node) {
		this.excludeIncludeOrUse = this.use;
		this.secondValue = parameterFactory.createUses();
		node.getExportPackageUseExcludeIncludeValue().apply(this);

	}

	public void caseAVersionAtleast(AVersionAtleast node) {
		this.minNotInclude = false;
		this.maxNotInclude = true;

		this.firstValue = manifestFactory.createVersion();
		node.getMajorVersionEntry().apply(this);

	}

	public void caseAVersionAtleastVersionRange(AVersionAtleastVersionRange node) {
		node.getVersionAtleast().apply(this);

	}

	public void caseAVersionInterval(AVersionInterval node) {

		if (node.getLeftBracket().getText().equals("(")) {
			this.minNotInclude = true;
		} else if (node.getLeftBracket().getText().equals("[")) {
			this.minNotInclude = false;
		}

		if (node.getRightBracket().getText().equals("(")) {
			this.maxNotInclude = true;
		} else if (node.getRightBracket().getText().equals("[")) {
			this.maxNotInclude = false;
		}

		this.firstValue = manifestFactory.createVersion();
		node.getMaxVersion().apply(this);

		this.secondValue = this.firstValue;

		this.firstValue = manifestFactory.createVersion();
		node.getMinVersion().apply(this);

	}

	public void caseAVersionIntervalVersionRange(
			AVersionIntervalVersionRange node) {
		node.getVersionInterval().apply(this);

	}

	public void caseAVisibilityDirectiveRequireBundleDirective(
			AVisibilityDirectiveRequireBundleDirective node) {
		Visibility directive = parameterFactory.createVisibility();
		this.firstValue = null;
		node.getVisibilityValue().apply(this);

		directive.setVisibility((VisibilityEnum) this.firstValue);
		((RequireBundle) this.entry).addDirective(directive);

	}

	public void caseAVisibilityPrivateVisibilityValue(
			AVisibilityPrivateVisibilityValue node) {
		this.firstValue = VisibilityEnum.PRIVATE;

	}

	public void caseAVisibilityReexportVisibilityValue(
			AVisibilityReexportVisibilityValue node) {
		this.firstValue = VisibilityEnum.REEXPORT;

	}

	private Package convertToJavaElement(Folder folder) {
		Package _package = null;
		for (SystemEntry entry : folder.getEntries()) {
			if (entry instanceof Folder) {
				Package tmp = this.convertToJavaElement((Folder) entry);
				if (tmp != null) {
					if (_package == null) {
						_package = jarFactory.createPackage();
						_package.setName(folder.getName());
						_package.setFullPath(folder.getFullPath().replace("/",
								".").substring(0, folder.getFullPath().length() - 1));
					}
					_package.addPackage(tmp);
				}
			} else {
				if (entry.getFullPath().endsWith(".class")) {
					if (_package == null) {
						_package = jarFactory.createPackage();
						_package.setName(folder.getName());
						_package.setFullPath(folder.getFullPath().replace("/",
								".").substring(0, folder.getFullPath().length() - 1));
					}
					Class clazz = jarFactory.createClass();
					clazz.setName(entry.getName().substring(0,
							entry.getName().indexOf(".class")));
					clazz.setFullPath(entry.getFullPath().replace(".class", "")
							.replace("/", "."));
					_package.addClass(clazz);
				}
			}
		}

		return _package;
	}

	public void caseEOF(EOF node) {
		if (this.manifest.getBundleSymbolicName() == null) {
			this.log
					.put(
							this.bundle,
							this.log.get(this.bundle)
									+ "The manifest for this bundle is unvalid."
									+ "\n"
									+ "Maybe it respects the old bundle definition with plugin.xml file."
									+ "\n"
									+ "With the Introspector, you need to use MANIFEST.MF file to describe our bundle."
									+ "\n");
			this.validTranslation = false;
		}
		if (this.manifest.getBundleClassPaths().size() == 0) {
			for (SystemEntry entry : this.bundle.getFolder().getEntries()) {
				if (entry instanceof Folder) {
					Package _package = this
							.convertToJavaElement((Folder) entry);
					if (_package != null) {
						this.bundle.getPackage().addPackage(_package);
					}
				} else if (entry.getName().endsWith(".class")) {
					Class clazz = jarFactory.createClass();
					clazz.setName(entry.getName().substring(0,
							entry.getName().indexOf(".class")));
					clazz.setName(entry.getFullPath().replace(".class", ""));
					this.bundle.getPackage().addClass(clazz);
				}
			}
			BundleClassPath entry = manifestFactory.createBundleClassPath();
			entry.addEntry(this.bundle.getFolder());
			this.manifest.addBundleClassPath(entry);
		} else {
			for (SystemEntry entry : this.bundle.getFolder().getEntries()) {
				if (entry.isBundleClassPath()) {
					if (entry instanceof Folder) {
						Package _package = this.convertToJavaElement((Folder)entry);
						if (_package != null) {
							this.bundle.getPackage().addPackage(_package);
						}
					} else {
						Class clazz = JarFactory.eINSTANCE.createClass();
						clazz.setFullPath(entry.getFullPath().replace("/", "."));
						clazz.setName(entry.getName().substring(0, entry.getName().length() - (".class").length()));
					}
				}
			}
		}
		if (this.manifest.getFragmentHost() != null) {
			if (this.manifest.getBundleActivator() != null) {
				this.validTranslation = false;
				this.log
						.put(
								this.bundle,
								this.log.get(this.bundle)
										+ "When there is a Fragment-Host entry, there should not have a Bundle-Activator entry"
										+ "\n");
			}
			if (this.manifest.getFragmentHost().getDirectives() != null) {
				if (this.manifest.getImportPackages().size() > 0) {
					this.validTranslation = false;
					this.log
							.put(
									this.bundle,
									this.log.get(this.bundle)
											+ "When the extension directive is set to the Fragment-Host entry, there should not have Import-Package entry"
											+ "\n");
				}
				if (this.manifest.getRequireBundles().size() > 0) {
					this.validTranslation = false;
					this.log
							.put(
									this.bundle,
									this.log.get(this.bundle)
											+ "When the extension directive is set to the Fragment-Host entry, there should not have Require-Bundle entry"
											+ "\n");
				}
				if (this.manifest.getBundleNativeCodes().size() > 0) {
					this.validTranslation = false;
					this.log
							.put(
									this.bundle,
									this.log.get(this.bundle)
											+ "When the extension directive is set to the Fragment-Host entry, there should not have Bundle-NativeCode entry"
											+ "\n");
				}
				if (this.manifest.getDynamicImportPackages().size() > 0) {
					this.validTranslation = false;
					this.log
							.put(
									this.bundle,
									this.log.get(this.bundle)
											+ "When the extension directive is set to the Fragment-Host entry, there should not have DynamicImport-Package entry"
											+ "\n");
				}
			}
		}
	}

	public void caseStart(Start node) {
		this.validTranslation = true;
		this.log.put(this.bundle, "");
		node.getPManifest().apply(this);
		node.getEOF().apply(this);
	}

	public void caseTAlways(TAlways node) {
		// do nothing and never call

	}

	public void caseTBundleActivationpolicy(TBundleActivationpolicy node) {
		// do nothing and never call

	}

	public void caseTBundleActivator(TBundleActivator node) {
		// do nothing and never call

	}

	public void caseTBundleCategory(TBundleCategory node) {
		// do nothing and never call

	}

	public void caseTBundleClasspath(TBundleClasspath node) {
		// do nothing and never call

	}

	public void caseTBundleContactaddress(TBundleContactaddress node) {
		// do nothing and never call

	}

	public void caseTBundleCopyright(TBundleCopyright node) {
		// do nothing and never call

	}

	public void caseTBundleDescription(TBundleDescription node) {
		// do nothing and never call

	}

	public void caseTBundleDocurl(TBundleDocurl node) {
		// do nothing and never call

	}

	public void caseTBundleLocalization(TBundleLocalization node) {
		// do nothing and never call

	}

	public void caseTBundleManifestversion(TBundleManifestversion node) {
		// do nothing and never call

	}

	public void caseTBundleName(TBundleName node) {
		// do nothing and never call

	}

	public void caseTBundleNativecode(TBundleNativecode node) {
		// do nothing and never call

	}

	public void caseTBundleRequiredexecutionenvironment(
			TBundleRequiredexecutionenvironment node) {
		// do nothing and never call

	}

	public void caseTBundleSymbolicname(TBundleSymbolicname node) {
		// do nothing and never call

	}

	public void caseTBundleUpdatelocation(TBundleUpdatelocation node) {
		// do nothing and never call

	}

	public void caseTBundleVendor(TBundleVendor node) {
		// do nothing and never call

	}

	public void caseTBundleVersion(TBundleVersion node) {
		// do nothing and never call

	}

	public void caseTComma(TComma node) {
		// do nothing and never call

	}

	public void caseTDefinition(TDefinition node) {
		// do nothing and never call

	}

	public void caseTDot(TDot node) {
		// do nothing and never call

	}

	public void caseTDotdot(TDotdot node) {
		// do nothing and never call
	}

	public void caseTDoubleAntiSlash(TDoubleAntiSlash node) {
		// do nothing and never call

	}

	public void caseTDynamicimportPackage(TDynamicimportPackage node) {
		// do nothing and never call

	}

	public void caseTEntry(TEntry node) {
		// do nothing and never call

	}

	public void caseTEntryDigest(TEntryDigest node) {
		// do nothing and never call

	}

	public void caseTEol(TEol node) {
		// do nothing and never call

	}

	public void caseTEolblank(TEolblank node) {
		// do nothing and never call

	}

	public void caseTEquals(TEquals node) {
		// do nothing and never call

	}

	public void caseTExclude(TExclude node) {
		// do nothing and never call

	}

	public void caseTExportPackage(TExportPackage node) {
		// do nothing and never call

	}

	public void caseTExportService(TExportService node) {
		// do nothing and never call

	}

	public void caseTExtension(TExtension node) {
		// do nothing and never call

	}

	public void caseTExtensionBootclasspath(TExtensionBootclasspath node) {
		// do nothing and never call

	}

	public void caseTExtensionFramework(TExtensionFramework node) {
		// do nothing and never call

	}

	public void caseTFalse(TFalse node) {
		// do nothing and never call

	}

	public void caseTFragmentAttachment(TFragmentAttachment node) {
		// do nothing and never call
	}

	public void caseTFragmentHost(TFragmentHost node) {
		// do nothing and never call

	}

	public void caseTGreater(TGreater node) {
		// do nothing and never call
	}

	public void caseTGreaterEquals(TGreaterEquals node) {
		// do nothing and never call

	}

	public void caseTIdentifier(TIdentifier node) {
		// do nothing and never call

	}

	public void caseTIdentifierRequiredConfiguration(
			TIdentifierRequiredConfiguration node) {
		// do nothing and never call

	}

	public void caseTIdentifierRequiredProfile(TIdentifierRequiredProfile node) {
		// do nothing and never call

	}

	public void caseTImportPackage(TImportPackage node) {
		// do nothing and never call
	}

	public void caseTImportService(TImportService node) {
		// do nothing and never call

	}

	public void caseTInclude(TInclude node) {
		// do nothing and never call

	}

	public void caseTLanguage(TLanguage node) {
		// do nothing and never call

	}

	public void caseTLazy(TLazy node) {
		// do nothing and never call

	}

	public void caseTLeftBracket(TLeftBracket node) {
		// do nothing and never call

	}

	public void caseTLess(TLess node) {
		// do nothing and never call

	}

	public void caseTLesserEquals(TLesserEquals node) {
		// do nothing and never call

	}

	public void caseTMandatory(TMandatory node) {
		// do nothing and never call

	}

	public void caseTManifestversion(TManifestversion node) {
		// do nothing and never call

	}

	public void caseTNever(TNever node) {
		// do nothing and never call

	}

	public void caseTNotEquals(TNotEquals node) {
		// do nothing and never call

	}

	public void caseTOptional(TOptional node) {
		// do nothing and never call

	}

	public void caseTOsname(TOsname node) {
		// do nothing and never call

	}

	public void caseTOsnameAix(TOsnameAix node) {
		// do nothing and never call

	}

	public void caseTOsnameDigitalunix(TOsnameDigitalunix node) {
		// do nothing and never call

	}

	public void caseTOsnameEmbos(TOsnameEmbos node) {
		// do nothing and never call

	}

	public void caseTOsnameEpoc32(TOsnameEpoc32 node) {
		// do nothing and never call

	}

	public void caseTOsnameFreebsd(TOsnameFreebsd node) {
		// do nothing and never call

	}

	public void caseTOsnameHpux(TOsnameHpux node) {
		// do nothing and never call

	}

	public void caseTOsnameIrix(TOsnameIrix node) {
		// do nothing and never call

	}

	public void caseTOsnameLinux(TOsnameLinux node) {
		// do nothing and never call

	}

	public void caseTOsnameMacos(TOsnameMacos node) {
		// do nothing and never call

	}

	public void caseTOsnameNetbsd(TOsnameNetbsd node) {
		// do nothing and never call

	}

	public void caseTOsnameNetware(TOsnameNetware node) {
		// do nothing and never call

	}

	public void caseTOsnameOpenbsd(TOsnameOpenbsd node) {
		// do nothing and never call

	}

	public void caseTOsnameOs2(TOsnameOs2 node) {
		// do nothing and never call

	}

	public void caseTOsnameQnx(TOsnameQnx node) {
		// do nothing and never call

	}

	public void caseTOsnameSolaris(TOsnameSolaris node) {
		// do nothing and never call

	}

	public void caseTOsnameSunos(TOsnameSunos node) {
		// do nothing and never call

	}

	public void caseTOsnameVxworks(TOsnameVxworks node) {
		// do nothing and never call

	}

	public void caseTOsnameWindows2000(TOsnameWindows2000 node) {
		// do nothing and never call

	}

	public void caseTOsnameWindows2003(TOsnameWindows2003 node) {
		// do nothing and never call

	}

	public void caseTOsnameWindows95(TOsnameWindows95 node) {
		// do nothing and never call

	}

	public void caseTOsnameWindows98(TOsnameWindows98 node) {
		// do nothing and never call

	}

	public void caseTOsnameWindowsce(TOsnameWindowsce node) {
		// do nothing and never call

	}

	public void caseTOsnameWindowsnt(TOsnameWindowsnt node) {
		// do nothing and never call

	}

	public void caseTOsnameWindowsvista(TOsnameWindowsvista node) {
		// do nothing and never call

	}

	public void caseTOsnameWindowsxp(TOsnameWindowsxp node) {
		// do nothing and never call

	}

	public void caseTOsversion(TOsversion node) {
		// do nothing and never call

	}

	public void caseTPathSep(TPathSep node) {
		// do nothing and never call

	}

	public void caseTProcessor(TProcessor node) {
		// do nothing and never call

	}

	public void caseTProcessor68k(TProcessor68k node) {
		// do nothing and never call

	}

	public void caseTProcessorAlpha(TProcessorAlpha node) {
		// do nothing and never call

	}

	public void caseTProcessorArm(TProcessorArm node) {
		// do nothing and never call

	}

	public void caseTProcessorIgnite(TProcessorIgnite node) {
		// do nothing and never call

	}

	public void caseTProcessorMips(TProcessorMips node) {
		// do nothing and never call

	}

	public void caseTProcessorParisc(TProcessorParisc node) {
		// do nothing and never call

	}

	public void caseTProcessorPowerpc(TProcessorPowerpc node) {
		// do nothing and never call

	}

	public void caseTProcessorS390(TProcessorS390 node) {
		// do nothing and never call

	}

	public void caseTProcessorS390x(TProcessorS390x node) {
		// do nothing and never call

	}

	public void caseTProcessorSh4(TProcessorSh4 node) {
		// do nothing and never call

	}

	public void caseTProcessorSparc(TProcessorSparc node) {
		// do nothing and never call

	}

	public void caseTProcessorV850e(TProcessorV850e node) {
		// do nothing and never call

	}

	public void caseTProcessorX86(TProcessorX86 node) {
		// do nothing and never call

	}

	public void caseTProcessorX8664(TProcessorX8664 node) {
		// do nothing and never call

	}

	public void caseTProtectedString(TProtectedString node) {
		// do nothing and never call

	}

	public void caseTQuote(TQuote node) {
		// do nothing and never call

	}

	public void caseTQuotedString(TQuotedString node) {
		// do nothing and never call

	}

	public void caseTRequireBundle(TRequireBundle node) {
		// do nothing and never call

	}

	public void caseTResolution(TResolution node) {
		// do nothing and never call

	}

	public void caseTResolutionMandatory(TResolutionMandatory node) {
		// do nothing and never call

	}

	public void caseTResolutionOptional(TResolutionOptional node) {
		// do nothing and never call

	}

	public void caseTResolveTime(TResolveTime node) {
		// do nothing and never call

	}

	public void caseTRightBracket(TRightBracket node) {
		// do nothing and never call

	}

	public void caseTSelectionFilter(TSelectionFilter node) {
		// do nothing and never call

	}

	public void caseTSemicolon(TSemicolon node) {
		// do nothing and never call

	}

	public void caseTSingleton(TSingleton node) {
		// do nothing and never call

	}

	public void caseTTrue(TTrue node) {
		// do nothing and never call

	}

	public void caseTUnquotedString(TUnquotedString node) {
		// do nothing and never call

	}

	public void caseTUrlFile(TUrlFile node) {
		// do nothing and never call

	}

	public void caseTUrlFtp(TUrlFtp node) {
		// do nothing and never call

	}

	public void caseTUrlHttp(TUrlHttp node) {
		// do nothing and never call

	}

	public void caseTUses(TUses node) {
		// do nothing and never call

	}

	public void caseTVisibility(TVisibility node) {
		// do nothing and never call

	}

	public void caseTVisibilityPrivate(TVisibilityPrivate node) {
		// do nothing and never call

	}

	public void caseTVisibilityReexport(TVisibilityReexport node) {
		// do nothing and never call

	}

	public Object getIn(Node node) {
		return null;
	}

	public Object getOut(Node node) {
		return null;
	}

	public void setIn(Node node, Object o) {

	}

	public void setOut(Node node, Object o) {

	}

	public void caseAAttributeActivationpolicyOptions(
			AAttributeActivationpolicyOptions node) {
		node.getParameter().apply(this);

	}

	public void caseADirectiveActivationpolicyOptions(
			ADirectiveActivationpolicyOptions node) {
		node.getActivationpolicyDirective().apply(this);

	}

	public Map<Bundle, String> getFragmentHostReferences() {
		return fragmentHostReferences;
	}

	public void setFragmentHostReferences(
			Map<Bundle, String> fragmentHostReferences) {
		this.fragmentHostReferences = fragmentHostReferences;
	}

	public MANIFEST getManifest() {
		return manifest;
	}

	public void setManifest(MANIFEST manifest) {
		this.manifest = manifest;
	}

	public Bundle getBundle() {
		return bundle;
	}

	public void setBundle(Bundle bundle) {
		this.bundle = bundle;
	}

	public void caseTDigestValue(TDigestValue node) {
		// do nothing and never call

	}

	public void caseTNumber(TNumber node) {
		// do nothing and never call

	}

	public void caseTQualifier(TQualifier node) {
		// do nothing and never call
	}

	public void caseTAttributeEntry(TAttributeEntry node) {
		// do nothing and never call

	}

	public void caseAQuotedVersionMajorVersionEntry(
			AQuotedVersionMajorVersionEntry node) {
		node.getMajorVersion().apply(this);

	}

	public void caseAUnquotedVersionMajorVersionEntry(
			AUnquotedVersionMajorVersionEntry node) {
		node.getMajorVersion().apply(this);

	}

	public void caseTAllString(TAllString node) {
		// do nothing and never call

	}

	public void caseTSimpleStringValue(TSimpleStringValue node) {
		// do nothing and never call

	}

	public void caseANumberQualifierVersion(ANumberQualifierVersion node) {
		if (this.firstValue instanceof Version) {
			((Version) this.firstValue)
					.setQualifier(node.getNumber().getText());
		}

	}

	public void caseAQualifierQualifierVersion(AQualifierQualifierVersion node) {
		((Version) this.firstValue).setQualifier(node.getQualifier().getText());

	}

	public void caseAGoodPackageNamePackageName(AGoodPackageNamePackageName node) {
		node.getUniqueName().apply(this);

	}

	public void caseAMustNotAppearsPackageName(AMustNotAppearsPackageName node) {
		this.log
				.put(
						this.bundle,
						this.log.get(this.bundle)
								+ "It's better to not use \".\" as package name because it defines the default package."
								+ "\n"
								+ "In Java programming, it's recommended to not use the default package."
								+ "\n");

	}

	public void caseAPackageNameWildcard(APackageNameWildcard node) {
		node.getUniqueNameWildcard().apply(this);

	}

	public void caseAIdentifierUniqueNameWildcardSuffix(
			AIdentifierUniqueNameWildcardSuffix node) {
		this.firstValue = (String) this.firstValue + node.getDot().getText()
				+ node.getIdentifier().getText();

	}

	public void caseAOptionalUniqueNameWildcardSuffix(
			AOptionalUniqueNameWildcardSuffix node) {
		this.firstValue = (String) this.firstValue + node.getDot().getText()
				+ node.getOptional().getText();

	}

	public void caseAUniqueNameWildcard(AUniqueNameWildcard node) {
		node.getUniqueNameWildcardCommons().apply(this);

		for (PUniqueNameWildcardSuffix suffix : node
				.getUniqueNameWildcardSuffix()) {
			suffix.apply(this);
		}

	}

	public void caseAIdentifierUniqueNameWildcardCommons(
			AIdentifierUniqueNameWildcardCommons node) {
		this.firstValue = (String) this.firstValue
				+ node.getIdentifier().getText();

	}

	public void caseAOptionalUniqueNameWildcardCommons(
			AOptionalUniqueNameWildcardCommons node) {
		this.firstValue = (String) this.firstValue
				+ node.getOptional().getText();

	}

	public boolean isValidTranslation() {
		return validTranslation;
	}

	public void caseAExportPackageUseExcludeIncludeIdentifier(
			AExportPackageUseExcludeIncludeIdentifier node) {
		this.firstValue = "";
		node.getUniqueNameWildcard().apply(this);
		this.registerUnresolvedExportPackageDirective(
				(ExportPackageDirective) this.secondValue,
				(String) this.firstValue);

	}

	public void caseAUseExcludeIncludeManyElementsExportPackageUseExcludeIncludeValue(
			AUseExcludeIncludeManyElementsExportPackageUseExcludeIncludeValue node) {
		this.firstValue = "";
		node.getUniqueNameWildcard().apply(this);
		this.registerUnresolvedExportPackageDirective(
				(ExportPackageDirective) this.secondValue,
				(String) this.firstValue);

		for (PExportPackageUseExcludeIncludeIdentifier identifier : node
				.getExportPackageUseExcludeIncludeIdentifier()) {
			identifier.apply(this);
		}
		((ExportPackage) this.entry)
				.addDirective((ExportPackageDirective) this.secondValue);

	}

	public void caseAUseExcludeIncludeOneElementExportPackageUseExcludeIncludeValue(
			AUseExcludeIncludeOneElementExportPackageUseExcludeIncludeValue node) {
		this.firstValue = "";
		node.getUniqueNameWildcard().apply(this);
		this.registerUnresolvedExportPackageDirective(
				(ExportPackageDirective) this.secondValue,
				(String) this.firstValue);
		((ExportPackage) this.entry)
				.addDirective((ExportPackageDirective) this.secondValue);

	}

	private void registerUnresolvedExportPackageDirective(
			ExportPackageDirective directive, String value) {

		if (this.excludeIncludeOrUse == this.exclude) {
			if (directive == null) {
				directive = parameterFactory.createExcludeClasses();
			}
			List<String> list = this.unresolvedExportPackageExcludeValue
					.get(directive);
			if (list == null) {
				this.unresolvedExportPackageExcludeExportPackage.put(
						(ExcludeClasses) directive, (ExportPackage) this.entry);
				list = new ArrayList<String>();
			}
			list.add(value);
			this.unresolvedExportPackageExcludeValue.put(
					(ExcludeClasses) directive, list);
		} else if (this.excludeIncludeOrUse == this.include) {
			if (directive == null) {
				directive = parameterFactory.createIncludeClasses();
			}
			List<String> list = this.unresolvedExportPackageIncludeValue
					.get(directive);
			if (list == null) {
				this.unresolvedExportPackageIncludeExportPackage.put(
						(IncludeClasses) directive, (ExportPackage) this.entry);
				list = new ArrayList<String>();
			}
			list.add(value);
			this.unresolvedExportPackageIncludeValue.put(
					(IncludeClasses) directive, list);
		} else if (this.excludeIncludeOrUse == this.use) {
			if (directive == null) {
				directive = parameterFactory.createUses();
			}
			List<String> list = this.unresolvedExportPackageUsesValue
					.get(directive);
			if (list == null) {
				this.unresolvedExportPackageUsesBundle.put((Uses) directive,
						this.bundle);
				list = new ArrayList<String>();
			}
			list.add(value);
			this.unresolvedExportPackageUsesValue.put((Uses) directive, list);
		}
	}

	private void registerUnresolvedActivationPolicyDirective(
			ActivationPolicyDirective directive, String value) {
		if (this.excludeIncludeOrUse == this.exclude) {
			if (directive == null) {
				directive = parameterFactory.createExcludePackages();
			}
			List<String> list = this.unresolvedActivationPolicyExcludeValue
					.get(directive);
			if (list == null) {
				this.unresolvedActivationPolicyExcludeBundle.put(
						(ExcludePackages) directive, this.bundle);
				list = new ArrayList<String>();
			}
			list.add(value);
			this.unresolvedActivationPolicyExcludeValue.put(
					(ExcludePackages) directive, list);
		} else if (this.excludeIncludeOrUse == this.include) {
			if (directive == null) {
				directive = parameterFactory.createIncludePackages();
			}
			List<String> list = this.unresolvedActivationPolicyIncludeValue
					.get(directive);
			if (list == null) {
				this.unresolvedActivationPolicyIncludeBundle.put(
						(IncludePackages) directive, this.bundle);
				list = new ArrayList<String>();
			}
			list.add(value);
			this.unresolvedActivationPolicyIncludeValue.put(
					(IncludePackages) directive, list);
		}
	}

	private void setAttributes(List<PParameter> parameters) {
		for (PParameter parameter : parameters) {
			parameter.apply(this);
		}
	}

	private void setTargetToClassPath(PTarget target) {
		this.firstValue = "";
		target.apply(this);
		if (this.firstValue != ".") {
			SystemEntry systemEntry = this.bundle.getFolder().getEntry(
					(String) this.firstValue);
			if (systemEntry != null) {
				if (systemEntry instanceof Folder) {
					Package _package = this
							.convertToJavaElement((Folder) entry);
					if (_package != null) {
						this.bundle.getPackage().addPackage(_package);
					}
					((BundleClassPath) this.entry)
							.addEntry((Folder) systemEntry);
				} else if (systemEntry instanceof File) {
					if (systemEntry.getName().endsWith(".jar")) {
						try {
							OSGiIntrospectorUtil.addEntriesFromJar(this.bundle,
									(File) systemEntry);
							((BundleClassPath) this.entry)
									.addEntry((File) systemEntry);
						} catch (IOException e) {
							this.log.put(this.bundle, this.log.get(this.bundle)
									+ "IOException with "
									+ systemEntry.getFullPath() + "\n");
							
						}
					} else {
						this.log.put(this.bundle, this.log.get(this.bundle)
								+ systemEntry.getFullPath()
								+ " is a file but is not a JAR file." + "\n");
						
					}
				} else {
					this.log
							.put(
									this.bundle,
									this.log.get(this.bundle)
											+ this.firstValue
											+ " must be a JAR file or a folder." + "\n");
					
				}
			} else {
				List<String> list = this.unresolvedBundleClassPathValue.get((BundleClassPath) this.entry);
				if (list == null) {
					this.unresolvedBundleClassPathBundle.put((BundleClassPath) this.entry, this.bundle);
					list = new ArrayList<String>();
				}
				list.add((String)this.firstValue);
				this.unresolvedBundleClassPathValue.put((BundleClassPath) this.entry, list);		
				
				this.log.put(this.bundle, this.log.get(this.bundle)
						+ this.firstValue
						+ " is not contained into this bundle." + "\n");
			}
		} else if (this.firstValue == ".") {
			for (SystemEntry entry : this.bundle.getFolder().getEntries()) {
				if (entry instanceof Folder) {
					Package _package = this
							.convertToJavaElement((Folder) entry);
					if (_package != null) {
						this.bundle.getPackage().addPackage(_package);
					}
				} else if (entry.getName().endsWith(".class")) {
					Class clazz = jarFactory.createClass();
					clazz.setName(entry.getName().substring(0,
							entry.getName().indexOf(".class")));
					clazz
							.setFullPath(entry.getFullPath().replace(".class",
									""));
					this.bundle.getPackage().addClass(clazz);
				}
			}
			((BundleClassPath) this.entry).addEntry(this.bundle.getFolder());
		} else {
			this.log.put(this.bundle, this.log.get(this.bundle)
					+ this.firstValue + " is unresolved. (must not appears)"
					+ "\n");
		}
	}

	private void setTargetToNativeCode(PTarget target) {
		this.firstValue = "";
		target.apply(this);
		SystemEntry systemEntry = this.bundle.getFolder().getEntry(
				(String) this.firstValue);
		if (systemEntry != null && systemEntry instanceof File) {
			((BundleNativeCode) this.entry).addFile((File) systemEntry);
		} else {
			this.log.put(this.bundle, this.log.get(this.bundle)
					+ "the bundle native code value must be a file." + "\n"
					+ systemEntry + " is not a file." + "\n");
		}
	}

	public Map<BundleActivator, Bundle> getUnresolvedActivatorBundle() {
		return unresolvedActivatorBundle;
	}

	public Map<BundleActivator, String> getUnresolvedActivatorValue() {
		return unresolvedActivatorValue;
	}

	public Map<Service, Bundle> getUnresolvedExportServiceBundle() {
		return unresolvedExportServiceBundle;
	}

	public Map<Service, String> getUnresolvedExportServiceValue() {
		return unresolvedExportServiceValue;
	}

	public Map<ExportPackage, Bundle> getUnresolvedExportPackageBundle() {
		return unresolvedExportPackageBundle;
	}

	public Map<ExportPackage, List<String>> getUnresolvedExportPackageValue() {
		return unresolvedExportPackageValue;
	}

	public Map<Uses, Bundle> getUnresolvedExportPackageUsesBundle() {
		return unresolvedExportPackageUsesBundle;
	}

	public Map<Uses, List<String>> getUnresolvedExportPackageUsesValue() {
		return unresolvedExportPackageUsesValue;
	}

	public Map<ExcludeClasses, ExportPackage> getUnresolvedExportPackageExcludeExportPackage() {
		return unresolvedExportPackageExcludeExportPackage;
	}

	public Map<ExcludeClasses, List<String>> getUnresolvedExportPackageExcludeValue() {
		return unresolvedExportPackageExcludeValue;
	}

	public Map<IncludeClasses, ExportPackage> getUnresolvedExportPackageIncludeExportPackage() {
		return unresolvedExportPackageIncludeExportPackage;
	}

	public Map<IncludeClasses, List<String>> getUnresolvedExportPackageIncludeValue() {
		return unresolvedExportPackageIncludeValue;
	}

	public Map<ExcludePackages, Bundle> getUnresolvedActivationPolicyExcludeBundle() {
		return unresolvedActivationPolicyExcludeBundle;
	}

	public Map<ExcludePackages, List<String>> getUnresolvedActivationPolicyExcludeValue() {
		return unresolvedActivationPolicyExcludeValue;
	}

	public Map<IncludePackages, Bundle> getUnresolvedActivationPolicyIncludeBundle() {
		return unresolvedActivationPolicyIncludeBundle;
	}

	public Map<IncludePackages, List<String>> getUnresolvedActivationPolicyIncludeValue() {
		return unresolvedActivationPolicyIncludeValue;
	}

	public Map<Bundle, String> getLog() {
		return log;
	}

	public Map<RequireBundle, Bundle> getUnresolvedRequireBundleBundle() {
		return unresolvedRequireBundleBundle;
	}

	public Map<RequireBundle, String> getUnresolvedRequireBundleValue() {
		return unresolvedRequireBundleValue;
	}

	public Map<ImportPackage, Bundle> getUnresolvedImportPackageBundle() {
		return unresolvedImportPackageBundle;
	}

	public Map<ImportPackage, List<String>> getUnresolvedImportPackageValue() {
		return unresolvedImportPackageValue;
	}

	public Map<ImportService, Bundle> getUnresolvedImportServiceBundle() {
		return unresolvedImportServiceBundle;
	}

	public Map<ImportService, String> getUnresolvedImportServiceValue() {
		return unresolvedImportServiceValue;
	}

	public List<Service> getServicesAvailable() {
		return servicesAvailable;
	}

}
