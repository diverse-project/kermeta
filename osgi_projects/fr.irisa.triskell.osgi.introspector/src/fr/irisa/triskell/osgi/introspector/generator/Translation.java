package fr.irisa.triskell.osgi.introspector.generator;

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
import manifest.ClassPath;
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
import manifest.NativeCode;
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

import org.apache.log4j.Level;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.Analysis;
import fr.irisa.triskell.osgi.introspector.manifest.node.*;
import fr.irisa.triskell.osgi.introspector.util.OSGiIntrospectorUtil;
import framework.Bundle;

/**
 * 
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * 
 * This class describe a Visitor define into the Design Pattern Visitor. It used
 * to visit the manifest and generate a representation.
 */
public class Translation implements Analysis {

	private boolean validTranslation;

	private OSGiIntrospectorUtil util;

	private MANIFEST manifest;
	private Bundle bundle;

	private List<Service> servicesAvailable;

	private Map<Bundle, String> fragmentHostReferences;

	private Map<NativeCode, Bundle> unresolvedBundleNativeCode;

	private Map<ClassPath, Bundle> unresolvedBundleClassPath;

	private Map<RequireBundle, Bundle> unresolvedRequireBundle;

	private Map<ImportPackage, Bundle> unresolvedImportPackage;

	private Map<ImportService, Bundle> unresolvedImportService;

	private Map<BundleActivator, Bundle> unresolvedActivator;

	private Map<Service, Bundle> unresolvedExportService;

	private Map<manifest.Package, Bundle> unresolvedExportPackage;

	private Map<Uses, Bundle> unresolvedExportPackageUsesBundle;
	private Map<Uses, List<String>> unresolvedExportPackageUsesValue;

	private Map<option.Class, ExportPackage> unresolvedExportPackageExclude;

	private Map<option.Class, ExportPackage> unresolvedExportPackageInclude;

	private Map<ExportPackage, Bundle> unresolvedExportPackageBundle;

	private Map<option.Package, Bundle> unresolvedActivationPolicyExclude;

	private Map<option.Package, Bundle> unresolvedActivationPolicyInclude;

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

	public Translation(OSGiIntrospectorUtil util) {
		this.util = util;

		this.validTranslation = true;

		this.servicesAvailable = new ArrayList<Service>();

		this.fragmentHostReferences = new Hashtable<Bundle, String>();

		this.fragmentHostReferences = new Hashtable<Bundle, String>();

		this.unresolvedBundleNativeCode = new HashMap<NativeCode, Bundle>();

		this.unresolvedBundleClassPath = new HashMap<ClassPath, Bundle>();

		this.unresolvedRequireBundle = new HashMap<RequireBundle, Bundle>();

		this.unresolvedImportPackage = new HashMap<ImportPackage, Bundle>();

		this.unresolvedImportService = new HashMap<ImportService, Bundle>();

		this.unresolvedActivator = new Hashtable<BundleActivator, Bundle>();

		this.unresolvedExportService = new Hashtable<Service, Bundle>();

		this.unresolvedExportPackage = new Hashtable<manifest.Package, Bundle>();

		this.unresolvedExportPackageUsesBundle = new Hashtable<Uses, Bundle>();
		this.unresolvedExportPackageUsesValue = new Hashtable<Uses, List<String>>();

		this.unresolvedExportPackageExclude = new Hashtable<option.Class, ExportPackage>();

		this.unresolvedExportPackageInclude = new Hashtable<option.Class, ExportPackage>();

		this.unresolvedExportPackageBundle = new Hashtable<ExportPackage, Bundle>();

		this.unresolvedActivationPolicyExclude = new Hashtable<option.Package, Bundle>();

		this.unresolvedActivationPolicyInclude = new Hashtable<option.Package, Bundle>();

	}

	public void caseAAttribute(AAttribute node) {
		AttributEntry attribute = OptionFactory.eINSTANCE.createAttributEntry();
		String token = node.getAttributeEntry().getText().split("=")[0];
		if (token.endsWith(":")) {
			token = token.substring(0, token.length() - 1);
		}
		attribute.setToken(token);
		this.firstValue = new StringBuffer("");
		node.getStringEntryValue().apply(this);
		attribute.setValue(((StringBuffer) this.firstValue).toString());
		this.entry.addOption(attribute);

	}

	public void caseAActivationPolicyExcludeIncludeIdentifier(
			AActivationPolicyExcludeIncludeIdentifier node) {
		node.getPackageName().apply(this);
		this.registerUnresolvedActivationPolicyDirective(
				(ActivationPolicyDirective) this.secondValue,
				((StringBuffer) this.firstValue).toString());

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
		BundleActivationPolicy entry = ManifestFactory.eINSTANCE
				.createBundleActivationPolicy();
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
		BundleActivator entry = ManifestFactory.eINSTANCE
				.createBundleActivator();
		this.firstValue = new StringBuffer("");
		node.getUniqueName().apply(this);
		entry.setReference(((StringBuffer) this.firstValue).toString());
		entry.setResolved(false);
		this.unresolvedActivator.put(entry, this.bundle);
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
		BundleCategory entry = ManifestFactory.eINSTANCE.createBundleCategory();
		entry.addValue(node.getSimpleStringValue().getText());

		this.entry = entry;
		for (PParameter parameter : node.getParameter()) {
			parameter.apply(this);
		}

		for (PCategoryValue categoryValue : node.getCategoryValue()) {
			categoryValue.apply(this);
		}

		this.manifest.setBundleCategory(entry);

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
		BundleContactAddress entry = ManifestFactory.eINSTANCE
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
		BundleCopyright entry = ManifestFactory.eINSTANCE
				.createBundleCopyright();
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
		BundleDescription entry = ManifestFactory.eINSTANCE
				.createBundleDescription();
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
		BundleDocURL entry = ManifestFactory.eINSTANCE.createBundleDocURL();

		this.firstValue = new StringBuffer("");
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
		BundleLocalization entry = ManifestFactory.eINSTANCE
				.createBundleLocalization();
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
		BundleManifestVersion entry = ManifestFactory.eINSTANCE
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
		BundleName entry = ManifestFactory.eINSTANCE.createBundleName();
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
		BundleSymbolicName entry = ManifestFactory.eINSTANCE
				.createBundleSymbolicName();

		this.firstValue = new StringBuffer("");
		node.getUniqueName().apply(this);
		entry.setSymbolicName(((StringBuffer) this.firstValue).toString());
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
		BundleUpdateLocation entry = ManifestFactory.eINSTANCE
				.createBundleUpdateLocation();

		this.firstValue = new StringBuffer("");
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
		BundleVendor entry = ManifestFactory.eINSTANCE.createBundleVendor();
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
		BundleVersion entry = ManifestFactory.eINSTANCE.createBundleVersion();
		this.firstValue = ManifestFactory.eINSTANCE.createVersion();
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
		((BundleCategory) this.entry).addValue(node.getSimpleStringValue()
				.getText());

	}

	public void caseAClasspathEntry(AClasspathEntry node) {
		BundleClassPath entry = ManifestFactory.eINSTANCE
				.createBundleClassPath();

		this.entry = entry;
		this.setTargetToClassPath(node.getTarget());

		for (PClasspathEntryValue entryValue : node.getClasspathEntryValue()) {
			entryValue.apply(this);
		}

		for (PParameter parameter : node.getParameter()) {
			parameter.apply(this);
		}
		this.manifest.addBundleClassPath(entry);

	}

	public void caseAClasspathEntryValue(AClasspathEntryValue node) {
		this.setTargetToClassPath(node.getTarget());

	}

	public void caseAClasspathValue(AClasspathValue node) {
		node.getClasspathEntry().apply(this);

	}

	public void caseADigestEntry(ADigestEntry node) {
		SimpleManifestEntryManyValues entry = ManifestFactory.eINSTANCE
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
		this.firstValue = new StringBuffer(".");

	}

	public void caseADynamicDescription(ADynamicDescription node) {
		DynamicImportPackage entry = ManifestFactory.eINSTANCE
				.createDynamicImportPackage();

		this.firstValue = new StringBuffer("");
		node.getPackageNameWildcard().apply(this);
		entry.addPackageReference(((StringBuffer) this.firstValue).toString());

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
		this.firstValue = new StringBuffer("");
		node.getPackageNameWildcard().apply(this);
		((DynamicImportPackage) this.entry)
				.addPackageReference(((StringBuffer) this.firstValue)
						.toString());

	}

	public void caseADynamicimportPackageValue(ADynamicimportPackageValue node) {
		node.getDynamicDescription().apply(this);

	}

	public void caseAEqualsBooleanComparator(AEqualsBooleanComparator node) {
		((StringBuffer) this.firstValue).append(node.getEquals());

	}

	public void caseAExcludeActivationpolicyDirective(
			AExcludeActivationpolicyDirective node) {
		this.excludeIncludeOrUse = this.exclude;
		this.secondValue = OptionFactory.eINSTANCE.createExcludePackages();
		node.getActivationPolicyExcludeIncludeValue().apply(this);

	}

	public void caseAExcludeExportPackageDirective(
			AExcludeExportPackageDirective node) {
		this.excludeIncludeOrUse = this.exclude;
		this.secondValue = OptionFactory.eINSTANCE.createExcludeClasses();
		node.getExportPackageUseExcludeIncludeValue().apply(this);

	}

	public void caseAExcludeIncludeManyPackagesActivationPolicyExcludeIncludeValue(
			AExcludeIncludeManyPackagesActivationPolicyExcludeIncludeValue node) {
		this.firstValue = new StringBuffer("");
		node.getPackageName().apply(this);
		this.registerUnresolvedActivationPolicyDirective(
				(ActivationPolicyDirective) this.secondValue,
				((StringBuffer) this.firstValue).toString());

		for (PActivationPolicyExcludeIncludeIdentifier identifier : node
				.getActivationPolicyExcludeIncludeIdentifier()) {
			identifier.apply(this);
		}
		((BundleActivationPolicy) this.entry)
				.addDirective((ActivationPolicyDirective) this.secondValue);

	}

	public void caseAExcludeIncludeOnePackageActivationPolicyExcludeIncludeValue(
			AExcludeIncludeOnePackageActivationPolicyExcludeIncludeValue node) {
		this.firstValue = new StringBuffer("");
		node.getPackageName().apply(this);
		this.registerUnresolvedActivationPolicyDirective(
				(ActivationPolicyDirective) this.secondValue,
				((StringBuffer) this.firstValue).toString());
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
		if (node.getExportPackageEntryValue1() != null) {
			node.getExportPackageEntryValue1().apply(this);
		}

	}

	public void caseAExportPackageEntryManifestentry(
			AExportPackageEntryManifestentry node) {
		node.getExportPackageEntry().apply(this);

	}

	public void caseAExportPackageEntryValue(AExportPackageEntryValue node) {
		ExportPackage entry = ManifestFactory.eINSTANCE.createExportPackage();
		this.firstValue = new StringBuffer("");
		node.getPackageName().apply(this);
		manifest.Package _package = ManifestFactory.eINSTANCE.createPackage();
		_package.setReference(((StringBuffer) this.firstValue).toString());
		_package.setResolved(false);
		entry.addPackage(_package);
		this.unresolvedExportPackage.put(_package, this.bundle);

		for (PPackageNames name : node.getPackageNames()) {
			this.firstValue = new StringBuffer("");
			name.apply(this);
			_package = ManifestFactory.eINSTANCE.createPackage();
			_package.setReference(((StringBuffer) this.firstValue).toString());
			_package.setResolved(false);
			entry.addPackage(_package);
			this.unresolvedExportPackage.put(_package, this.bundle);
		}

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
		ExportService entry = ManifestFactory.eINSTANCE.createExportService();
		this.firstValue = new StringBuffer("");
		node.getUniqueName().apply(this);
		Service service = ManifestFactory.eINSTANCE.createService();

		service.setReference(((StringBuffer) this.firstValue).toString());
		service.setResolved(false);
		this.unresolvedExportService.put(service, this.bundle);
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
		((StringBuffer) this.firstValue).append(node.getUrlFile().getText());
		node.getPathUnquoted().apply(this);
		try {
			URL url = new URL(((StringBuffer) this.firstValue).toString());
			this.firstValue = url;
		} catch (MalformedURLException e) {
			util.log(Level.WARN,
					"MalformedURLException :  an URL value into the MANIFEST is malformed : "
							+ this.firstValue + ".", bundle);
		}

	}

	public void caseAFragmentAttachmentSymbolicnameDirective(
			AFragmentAttachmentSymbolicnameDirective node) {
		node.getFragmentAttachmentValue().apply(this);
		FragmentAttachment directive = OptionFactory.eINSTANCE
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
		Extension directive = OptionFactory.eINSTANCE.createExtension();
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
		FragmentHost entry = ManifestFactory.eINSTANCE.createFragmentHost();
		this.firstValue = new StringBuffer("");
		node.getUniqueName().apply(this);
		this.fragmentHostReferences.put(this.bundle,
				((StringBuffer) this.firstValue).toString());

		this.entry = entry;
		for (PFragmentHostParameter parameter : node.getFragmentHostParameter()) {
			parameter.apply(this);
		}

		this.manifest.setFragmentHost(entry);
	}

	public void caseAFtpUnquotedUrl(AFtpUnquotedUrl node) {
		((StringBuffer) this.firstValue).append(node.getUrlFtp().getText());
		node.getPathUnquoted().apply(this);
		try {
			URL url = new URL(((StringBuffer) this.firstValue).toString());
			this.firstValue = url;
		} catch (MalformedURLException e) {
			util.log(Level.WARN,
					"MalformedURLException :  an URL value into the MANIFEST is malformed : "
							+ this.firstValue + ".", bundle);
		}

	}

	public void caseAGreaterBooleanComparator(AGreaterBooleanComparator node) {
		((StringBuffer) this.firstValue).append(node.getGreater().getText());

	}

	public void caseAGreaterEqualsBooleanComparator(
			AGreaterEqualsBooleanComparator node) {
		((StringBuffer) this.firstValue).append(node.getGreaterEquals()
				.getText());

	}

	public void caseAHttpUnquotedUrl(AHttpUnquotedUrl node) {
		this.firstValue = new StringBuffer(node.getUrlHttp().getText());
		node.getPathUnquoted().apply(this);
		try {
			URL url = new URL(((StringBuffer) this.firstValue).toString());
			this.firstValue = url;
		} catch (MalformedURLException e) {
			util.log(Level.WARN,
					"MalformedURLException :  an URL value into the MANIFEST is malformed : "
							+ this.firstValue + ".", bundle);
		}

	}

	public void caseAImportPackageAttributeImportPackageParameter(
			AImportPackageAttributeImportPackageParameter node) {
		node.getParameter().apply(this);

	}

	public void caseAImportPackageDirective(AImportPackageDirective node) {
		Resolution directive = OptionFactory.eINSTANCE.createResolution();
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
		ImportPackage entry = ManifestFactory.eINSTANCE.createImportPackage();

		this.firstValue = new StringBuffer("");
		node.getPackageName().apply(this);
		entry.addPackagesReference(((StringBuffer) this.firstValue).toString());

		for (PPackageNames name : node.getPackageNames()) {
			this.firstValue = new StringBuffer("");
			name.apply(this);
			entry.addPackagesReference(((StringBuffer) this.firstValue)
					.toString());
		}

		this.unresolvedImportPackage.put(entry, this.bundle);

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
		this.firstValue = new StringBuffer("");
		node.getUniqueName().apply(this);
		ImportService entry = ManifestFactory.eINSTANCE.createImportService();
		entry.setServiceReference(((StringBuffer) this.firstValue).toString());
		this.unresolvedImportService.put(entry, this.bundle);
		this.manifest.addImportService(entry);

		this._import = true;
		for (PServiceValue value : node.getServiceValue()) {
			value.apply(this);
		}

	}

	public void caseAIncludeActivationpolicyDirective(
			AIncludeActivationpolicyDirective node) {
		this.excludeIncludeOrUse = this.include;
		this.secondValue = OptionFactory.eINSTANCE.createIncludePackages();
		node.getActivationPolicyExcludeIncludeValue().apply(this);

	}

	public void caseAIncludeExportPackageDirective(
			AIncludeExportPackageDirective node) {
		this.excludeIncludeOrUse = this.include;
		this.secondValue = OptionFactory.eINSTANCE.createIncludeClasses();
		node.getExportPackageUseExcludeIncludeValue().apply(this);

	}

	public void caseALanguageDirective(ALanguageDirective node) {
		Language directive = OptionFactory.eINSTANCE.createLanguage();

		this.firstValue = new StringBuffer("");
		node.getLanguageValue().apply(this);
		for (ISOCodeLanguage language : ISOCodeLanguage.VALUES) {
			if (language.getLiteral().equals(
					((StringBuffer) this.firstValue).toString())) {
				directive.setIsoCode(language);
				((BundleNativeCode) this.entry).addDirective(directive);
				break;
			}
		}
	}

	public void caseALanguageDirectiveNativecodeDirective(
			ALanguageDirectiveNativecodeDirective node) {
		node.getLanguageDirective().apply(this);

	}

	public void caseALanguageValue(ALanguageValue node) {
		((StringBuffer) this.firstValue).append(node.getIdentifier().getText());

	}

	public void caseALessBooleanComparator(ALessBooleanComparator node) {
		((StringBuffer) this.firstValue).append(node.getLess().getText());

	}

	public void caseALesserEqualsBooleanComparator(
			ALesserEqualsBooleanComparator node) {
		((StringBuffer) this.firstValue).append(node.getLesserEquals()
				.getText());

	}

	public void caseAMajorVersion(AMajorVersion node) {
		int majorVersion = Integer.parseInt(node.getNumber().getText());
		((Version) this.firstValue).setMajor(majorVersion);

		if (node.getMinorVersion() != null) {
			node.getMinorVersion().apply(this);
		}

	}

	@SuppressWarnings("unchecked")
	public void caseAMandatoryExportPackageDirective(
			AMandatoryExportPackageDirective node) {
		Mandatory directive = OptionFactory.eINSTANCE.createMandatory();
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
			util.log(Level.WARN, "this mandatory value " + this.firstValue
					+ " is not valid.", bundle);
		}

	}

	public void caseAMandatoryManyAttributesMandatoryValue(
			AMandatoryManyAttributesMandatoryValue node) {
		List<String> attributToken = new ArrayList<String>();
		node.getUnquotedString().getText();
		attributToken.add(((StringBuffer) this.firstValue).toString());

		for (PMandatoryString mandatoryString : node.getMandatoryString()) {
			this.firstValue = new StringBuffer("");
			mandatoryString.apply(this);
			attributToken.add(((StringBuffer) this.firstValue).toString());
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
		this.firstValue = new StringBuffer(node.getUnquotedString().getText());

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
		BundleNativeCode entry = ManifestFactory.eINSTANCE
				.createBundleNativeCode();

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
		((StringBuffer) this.firstValue).append(node.getNotEquals().getText());

	}

	public void caseAOsnameAixOsnameValue(AOsnameAixOsnameValue node) {
		this.firstValue = OsNameEnum.AIX;

	}

	public void caseAOsnameDigitalunixOsnameValue(
			AOsnameDigitalunixOsnameValue node) {
		this.firstValue = OsNameEnum.DIGITAL_UNIX;

	}

	public void caseAOsnameDirective(AOsnameDirective node) {
		node.getOsnameValue().apply(this);
		OsName directive = OptionFactory.eINSTANCE.createOsName();
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
		OsVersion directive = OptionFactory.eINSTANCE.createOsVersion();
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
		((SimpleManifestEntryManyValues) this.entry).addValue(node
				.getSimpleStringValue().getText());
		for (POtherValue otherValue : node.getOtherValue()) {
			this.firstValue = new StringBuffer("");
			otherValue.apply(this);
			((SimpleManifestEntryManyValues) this.entry)
					.addValue(((StringBuffer) this.firstValue).toString());
		}

		for (PParameter parameter : node.getParameter()) {
			parameter.apply(this);
		}

	}

	public void caseAOtherEntryValueNext(AOtherEntryValueNext node) {
		node.getOtherEntryValue().apply(this);

	}

	public void caseAOtherValue(AOtherValue node) {
		this.firstValue = new StringBuffer(node.getSimpleStringValue()
				.getText());

	}

	public void caseAPackageNames(APackageNames node) {
		node.getPackageName().apply(this);

	}

	public void caseAParameter(AParameter node) {
		node.getAttribute().apply(this);

	}

	public void caseAPathElement(APathElement node) {
		((StringBuffer) this.firstValue).append(node.getUnquotedString()
				.getText());

	}

	public void caseAPathQuoted(APathQuoted node) {
		node.getPathUnquoted().apply(this);
	}

	public void caseAPathQuotedPath(APathQuotedPath node) {
		node.getPathQuoted().apply(this);

	}

	public void caseAPathSepOnlyPathUnquoted(APathSepOnlyPathUnquoted node) {
		((StringBuffer) this.firstValue).append(node.getPathSep());

	}

	public void caseAPathSeptelementPathUnquoted(
			APathSeptelementPathUnquoted node) {
		if (node.getFirst() != null) {
			((StringBuffer) this.firstValue).append(node.getFirst().getText());
		}
		if (node.getSecond() != null) {
			((StringBuffer) this.firstValue).append(node.getSecond().getText());
		}
		if (node.getPathSep() != null) {
			((StringBuffer) this.firstValue)
					.append(node.getPathSep().getText());
		}

		node.getPathElement().apply(this);

		for (PPathSuffix suffix : node.getPathSuffix()) {
			suffix.apply(this);
		}

		// this.firstValue = ((String) this.firstValue).replace(" ", "");
		for (int i = 0; i < ((StringBuffer) this.firstValue).length(); i++) {
			if (((StringBuffer) this.firstValue).charAt(i) == ' ') {
				((StringBuffer) this.firstValue).deleteCharAt(i);
			}
		}

	}

	public void caseAPathSuffix(APathSuffix node) {
		((StringBuffer) this.firstValue).append(node.getPathSep());
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
		Processor directive = OptionFactory.eINSTANCE.createProcessor();
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
		this.firstValue = new StringBuffer(node.getQuotedString().getText()
				.replace("\"", ""));

	}

	public void caseAQuotedUrl(AQuotedUrl node) {
		node.getUnquotedUrl().apply(this);

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

		this.firstValue = new StringBuffer("");
		node.getUniqueName().apply(this);
		entry.setReference(((StringBuffer) this.firstValue).toString());
		entry.setResolved(false);
		this.unresolvedRequireBundle.put(entry, this.bundle);

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
		BundleRequiredExecutionEnvironment entry = ManifestFactory.eINSTANCE
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
			node.getResolutionValue().apply(this);
			Resolution directive = OptionFactory.eINSTANCE.createResolution();
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
		SelectionFilter directive = OptionFactory.eINSTANCE
				.createSelectionFilter();
		this.firstValue = new StringBuffer("");
		node.getSelectionFilterValue().apply(this);
		directive.setExpression(((StringBuffer) this.firstValue).toString());
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
		this.firstValue = new StringBuffer("");
		node.getUniqueName().apply(this);
		if (this._import) {
			ImportService entry = ManifestFactory.eINSTANCE
					.createImportService();
			entry.setServiceReference(((StringBuffer) this.firstValue)
					.toString());
			this.unresolvedImportService.put(entry, this.bundle);
			this.manifest.addImportService(entry);

			this.entry = entry;
			for (PParameter parameter : node.getParameter()) {
				parameter.apply(this);
			}

		} else if (!this._import) {
			ExportService entry = ManifestFactory.eINSTANCE
					.createExportService();
			Service service = ManifestFactory.eINSTANCE.createService();

			service.setReference(((StringBuffer) this.firstValue).toString());
			this.unresolvedExportService.put(service, this.bundle);
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
		SimpleManifestEntryManyValues entry = ManifestFactory.eINSTANCE
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
		Singleton directive = OptionFactory.eINSTANCE.createSingleton();
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
		((StringBuffer) this.firstValue).append(node.getIdentifier().getText());
		for (PUniqueNameSuffix suffix : node.getUniqueNameSuffix()) {
			suffix.apply(this);
		}
	}

	public void caseAUniqueNameSuffix(AUniqueNameSuffix node) {
		((StringBuffer) this.firstValue).append(node.getDot().getText()
				+ node.getIdentifier().getText());

	}

	public void caseAUnquotedStringStringEntryValue(
			AUnquotedStringStringEntryValue node) {
		((StringBuffer) this.firstValue).append(node.getUnquotedString()
				.getText());

	}

	public void caseAUnquotedUrlValue(AUnquotedUrlValue node) {
		node.getUnquotedUrl().apply(this);

	}

	public void caseAUsesExportPackageDirective(AUsesExportPackageDirective node) {
		this.excludeIncludeOrUse = this.use;
		this.secondValue = OptionFactory.eINSTANCE.createUses();
		node.getExportPackageUseExcludeIncludeValue().apply(this);

	}

	public void caseAVersionAtleast(AVersionAtleast node) {
		this.minNotInclude = false;
		this.maxNotInclude = true;

		this.firstValue = ManifestFactory.eINSTANCE.createVersion();
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

		this.firstValue = ManifestFactory.eINSTANCE.createVersion();
		node.getMaxVersion().apply(this);

		this.secondValue = this.firstValue;

		this.firstValue = ManifestFactory.eINSTANCE.createVersion();
		node.getMinVersion().apply(this);

	}

	public void caseAVersionIntervalVersionRange(
			AVersionIntervalVersionRange node) {
		node.getVersionInterval().apply(this);

	}

	public void caseAVisibilityDirectiveRequireBundleDirective(
			AVisibilityDirectiveRequireBundleDirective node) {
		Visibility directive = OptionFactory.eINSTANCE.createVisibility();
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

	public void caseEOF(EOF node) {
		if (this.manifest.getBundleSymbolicName() == null) {
			util
					.log(
							Level.ERROR,
							"The manifest for this bundle is unvalid."
									+ "\n"
									+ "Maybe it respects the Eclipse Bundle definition with plugin.xml file."
									+ "\n"
									+ "With the Introspector, you need to use MANIFEST.MF file to describe our bundle.",
							bundle);
			this.validTranslation = false;
		}
		if (this.manifest.getBundleVersion() == null
				|| this.manifest.getBundleVersion().getVersion() == null) {
			Version version = ManifestFactory.eINSTANCE.createVersion();
			version.setMajor(0);
			version.setMinor(0);
			version.setMicro(0);
			BundleVersion bundleVersion = ManifestFactory.eINSTANCE
					.createBundleVersion();
			bundleVersion.setVersion(version);
		}
		if (this.manifest.getBundleClassPaths().size() == 0) {
			/*
			 * for (SystemEntry entry : this.bundle.getFolder().getEntries()) {
			 * if (entry instanceof Folder) { Package _package =
			 * OSGiIntrospectorUtil .convertToJavaElement((Folder) entry,
			 * false); if (_package != null) {
			 * this.bundle.getPackage().addPackage(_package); } } else if
			 * (entry.getName().endsWith(".class")) { Class clazz =
			 * jarFactory.createClass();
			 * clazz.setName(entry.getName().substring(0,
			 * entry.getName().indexOf(".class")));
			 * clazz.setName(entry.getFullPath().replace(".class", ""));
			 * this.bundle.getPackage().addClass(clazz); } }
			 */
			BundleClassPath entry = ManifestFactory.eINSTANCE
					.createBundleClassPath();
			ClassPath classPath = ManifestFactory.eINSTANCE.createClassPath();
			classPath.setReference(".");
			classPath.setEntry(this.bundle.getFolder());
			classPath.setResolved(false);
			this.unresolvedBundleClassPath.put(classPath, this.bundle);
			entry.addClassPath(classPath);
			this.manifest.addBundleClassPath(entry);
		}/*
			 * else { for (SystemEntry entry :
			 * this.bundle.getFolder().getEntries()) { if
			 * (entry.isBundleClassPath()) { if (entry instanceof Folder) {
			 * Package _package = OSGiIntrospectorUtil
			 * .convertToJavaElement((Folder) entry, true); if (_package !=
			 * null) { this.bundle.getPackage().addPackage(_package); } } else {
			 * Class clazz = JarFactory.eINSTANCE.createClass(); clazz
			 * .setFullPath(entry.getFullPath().replace("/", ".")); clazz
			 * .setName(entry.getName().substring( 0, entry.getName().length() -
			 * (".class").length())); } } } }
			 */
		if (this.manifest.getFragmentHost() != null) {
			if (this.manifest.getBundleActivator() != null) {
				util
						.log(
								Level.ERROR,
								"When there is a Fragment-Host entry, there should not have a Bundle-Activator entry.",
								bundle);
				this.validTranslation = false;
			}
			if (this.manifest.getFragmentHost().getDirectives() != null) {
				if (this.manifest.getImportPackages().size() > 0) {
					util
							.log(
									Level.ERROR,
									"When the extension directive is set to the Fragment-Host entry, there should not have Import-Package entry.",
									bundle);
					this.validTranslation = false;
				}
				if (this.manifest.getRequireBundles().size() > 0) {
					util
							.log(
									Level.ERROR,
									"When the extension directive is set to the Fragment-Host entry, there should not have Require-Bundle entry.",
									bundle);
					this.validTranslation = false;
				}
				if (this.manifest.getBundleNativeCodes().size() > 0) {
					util
							.log(
									Level.ERROR,
									"When the extension directive is set to the Fragment-Host entry, there should not have Bundle-NativeCode entry.",
									bundle);
					this.validTranslation = false;
				}
				if (this.manifest.getDynamicImportPackages().size() > 0) {
					util
							.log(
									Level.ERROR,
									"When the extension directive is set to the Fragment-Host entry, there should not have DynamicImport-Package entry.",
									bundle);
					this.validTranslation = false;
				}
			}
		}

	}

	public void caseStart(Start node) {
		this.validTranslation = true;
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
		((Version) this.firstValue).setQualifier(node.getNumber().getText());

	}

	public void caseAQualifierQualifierVersion(AQualifierQualifierVersion node) {
		((Version) this.firstValue).setQualifier(node.getQualifier().getText());

	}

	public void caseAGoodPackageNamePackageName(AGoodPackageNamePackageName node) {
		node.getUniqueName().apply(this);

	}

	public void caseAMustNotAppearsPackageName(AMustNotAppearsPackageName node) {
		util
				.log(
						Level.WARN,
						"It's better to not use \".\" as package name because it defines the default package."
								+ "\n"
								+ "In Java programming, it's recommended to not use the default package.",
						bundle);
		((StringBuffer) this.firstValue).append(".");
	}

	public void caseAPackageNameWildcard(APackageNameWildcard node) {
		node.getUniqueNameWildcard().apply(this);

	}

	public void caseAIdentifierUniqueNameWildcardSuffix(
			AIdentifierUniqueNameWildcardSuffix node) {
		((StringBuffer) this.firstValue).append(node.getDot().getText()
				+ node.getIdentifier().getText());

	}

	public void caseAOptionalUniqueNameWildcardSuffix(
			AOptionalUniqueNameWildcardSuffix node) {
		((StringBuffer) this.firstValue).append(node.getDot().getText()
				+ node.getOptional().getText());

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
		((StringBuffer) this.firstValue).append(node.getIdentifier().getText());

	}

	public void caseAOptionalUniqueNameWildcardCommons(
			AOptionalUniqueNameWildcardCommons node) {
		((StringBuffer) this.firstValue).append(node.getOptional().getText());

	}

	public boolean isValidTranslation() {
		return validTranslation;
	}

	public void caseAExportPackageUseExcludeIncludeIdentifier(
			AExportPackageUseExcludeIncludeIdentifier node) {
		this.firstValue = new StringBuffer("");
		node.getUniqueNameWildcard().apply(this);
		this.registerUnresolvedExportPackageDirective(
				(ExportPackageDirective) this.secondValue,
				((StringBuffer) this.firstValue).toString());

	}

	public void caseAUseExcludeIncludeManyElementsExportPackageUseExcludeIncludeValue(
			AUseExcludeIncludeManyElementsExportPackageUseExcludeIncludeValue node) {
		this.firstValue = new StringBuffer("");
		node.getUniqueNameWildcard().apply(this);
		this.registerUnresolvedExportPackageDirective(
				(ExportPackageDirective) this.secondValue,
				((StringBuffer) this.firstValue).toString());

		for (PExportPackageUseExcludeIncludeIdentifier identifier : node
				.getExportPackageUseExcludeIncludeIdentifier()) {
			identifier.apply(this);
		}
		((ExportPackage) this.entry)
				.addDirective((ExportPackageDirective) this.secondValue);

	}

	public void caseAUseExcludeIncludeOneElementExportPackageUseExcludeIncludeValue(
			AUseExcludeIncludeOneElementExportPackageUseExcludeIncludeValue node) {
		this.firstValue = new StringBuffer("");
		node.getUniqueNameWildcard().apply(this);
		this.registerUnresolvedExportPackageDirective(
				(ExportPackageDirective) this.secondValue,
				((StringBuffer) this.firstValue).toString());
		((ExportPackage) this.entry)
				.addDirective((ExportPackageDirective) this.secondValue);

	}

	private void registerUnresolvedExportPackageDirective(
			ExportPackageDirective directive, String value) {

		option.Class _class = OptionFactory.eINSTANCE.createClass();
		_class.setReference(value);
		_class.setResolved(false);
		this.unresolvedExportPackageBundle.put((ExportPackage) this.entry,
				this.bundle);
		if (this.excludeIncludeOrUse == this.exclude) {
			if (directive == null) {
				directive = OptionFactory.eINSTANCE.createExcludeClasses();
			}
			((ExcludeClasses) directive).addExclude(_class);
			this.unresolvedExportPackageExclude.put(_class,
					(ExportPackage) this.entry);
		} else if (this.excludeIncludeOrUse == this.include) {
			if (directive == null) {
				directive = OptionFactory.eINSTANCE.createIncludeClasses();
			}
			((IncludeClasses) directive).addInclude(_class);
			this.unresolvedExportPackageInclude.put(_class,
					(ExportPackage) this.entry);
		} else if (this.excludeIncludeOrUse == this.use) {
			if (directive == null) {
				directive = OptionFactory.eINSTANCE.createUses();
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
		option.Package _package = OptionFactory.eINSTANCE.createPackage();
		_package.setReference(value);
		_package.setResolved(false);
		if (this.excludeIncludeOrUse == this.exclude) {
			if (directive == null) {
				directive = OptionFactory.eINSTANCE.createExcludePackages();
			}
			((ExcludePackages) directive).addExcludePackage(_package);
			this.unresolvedActivationPolicyExclude.put(_package, this.bundle);
		} else if (this.excludeIncludeOrUse == this.include) {
			if (directive == null) {
				directive = OptionFactory.eINSTANCE.createIncludePackages();
			}
			((IncludePackages) directive).addIncludePackage(_package);
			this.unresolvedActivationPolicyInclude.put(_package, this.bundle);
		}
	}

	private void setAttributes(List<PParameter> parameters) {
		for (PParameter parameter : parameters) {
			parameter.apply(this);
		}
	}

	private void setTargetToClassPath(PTarget target) {
		this.firstValue = new StringBuffer("");
		target.apply(this);
		ClassPath classPath = ManifestFactory.eINSTANCE.createClassPath();
		classPath.setReference(((StringBuffer) this.firstValue).toString());
		((BundleClassPath) this.entry).addClassPath(classPath);
		classPath.setResolved(false);
		this.unresolvedBundleClassPath.put(classPath, this.bundle);
	}

	private void setTargetToNativeCode(PTarget target) {
		this.firstValue = new StringBuffer("");
		target.apply(this);
		NativeCode nativeCode = ManifestFactory.eINSTANCE.createNativeCode();
		nativeCode.setReference(((StringBuffer) this.firstValue).toString());
		((BundleNativeCode) this.entry).addNativeCode(nativeCode);
		nativeCode.setResolved(false);
		this.unresolvedBundleNativeCode.put(nativeCode, this.bundle);
	}

	public Map<BundleActivator, Bundle> getUnresolvedActivator() {
		return unresolvedActivator;
	}

	public Map<Service, Bundle> getUnresolvedExportService() {
		return unresolvedExportService;
	}

	public Map<manifest.Package, Bundle> getUnresolvedExportPackage() {
		return unresolvedExportPackage;
	}

	public Map<Uses, Bundle> getUnresolvedExportPackageUsesBundle() {
		return unresolvedExportPackageUsesBundle;
	}

	public Map<Uses, List<String>> getUnresolvedExportPackageUsesValue() {
		return unresolvedExportPackageUsesValue;
	}

	public Map<option.Class, ExportPackage> getUnresolvedExportPackageExclude() {
		return unresolvedExportPackageExclude;
	}

	public Map<ExportPackage, Bundle> getUnresolvedExportPackageBundles() {
		return unresolvedExportPackageBundle;
	}

	public Map<option.Class, ExportPackage> getUnresolvedExportPackageInclude() {
		return unresolvedExportPackageInclude;
	}

	public Map<option.Package, Bundle> getUnresolvedActivationPolicyExclude() {
		return unresolvedActivationPolicyExclude;
	}

	public Map<option.Package, Bundle> getUnresolvedActivationPolicyInclude() {
		return unresolvedActivationPolicyInclude;
	}

	public Map<RequireBundle, Bundle> getUnresolvedRequireBundle() {
		return unresolvedRequireBundle;
	}

	public Map<ImportPackage, Bundle> getUnresolvedImportPackage() {
		return unresolvedImportPackage;
	}

	public Map<ImportService, Bundle> getUnresolvedImportService() {
		return unresolvedImportService;
	}

	public List<Service> getServicesAvailable() {
		return servicesAvailable;
	}

	public Map<ClassPath, Bundle> getUnresolvedBundleClassPath() {
		return unresolvedBundleClassPath;
	}

	public Map<NativeCode, Bundle> getUnresolvedBundleNativeCode() {
		return unresolvedBundleNativeCode;
	}

}
