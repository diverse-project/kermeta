package fr.irisa.triskell.osgi.introspector.generator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

import manifest.BadVersionValue;
import manifest.BundleActivator;
import manifest.ExportPackage;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.ManifestFactory;
import manifest.RequireBundle;
import manifest.Service;
import manifest.Version;
import option.AttributEntry;
import option.ExcludeClasses;
import option.ExcludePackages;
import option.IncludeClasses;
import option.IncludePackages;
import option.Uses;
import framework.Bundle;
import framework.Framework;

public class ResolverDynamic extends ResolverStatic implements Resolver {

	private BundleContext context;
	
	public ResolverDynamic(BundleContext context) {
		this.context = context;
	}
	
	public Map<Bundle, String> getLog() {
		return super.getLog();
	}

	public void setLog(Map<Bundle, String> log) {
		super.setLog(log);
		
	}

	public void resolveFragmentHost(Framework framework,
			Map<Bundle, String> fragmentHosts) {
		super.resolveFragmentHost(framework, fragmentHosts);
		
	}

	public void resolveExportPackage(
			Map<ExportPackage, List<String>> exportPackages,
			Map<ExportPackage, Bundle> bundles) {
		super.resolveExportPackage(exportPackages, bundles);
		
	}

	public void resolveExportPackageExclude(
			Map<ExcludeClasses, List<String>> excludes,
			Map<ExcludeClasses, ExportPackage> exportPackages) {
		super.resolveExportPackageExclude(excludes, exportPackages);
		
	}

	public void resolveExportPackageInclude(
			Map<IncludeClasses, List<String>> includes,
			Map<IncludeClasses, ExportPackage> exportPackages) {
		super.resolveExportPackageInclude(includes, exportPackages);
		
	}

	public void resolveExportService(Map<Service, Bundle> bundles,
			Map<Service, String> services) {
		super.resolveExportService(bundles, services);
		
	}

	public void resolveActivator(Map<BundleActivator, Bundle> bundles,
			Map<BundleActivator, String> activators) {
		super.resolveActivator(bundles, activators);
		
	}

	public void resolveActivationPolicyExclude(
			Map<ExcludePackages, List<String>> excludes,
			Map<ExcludePackages, Bundle> bundles) {
		super.resolveActivationPolicyExclude(excludes, bundles);
		
	}

	public void resolveActivationPolicyInclude(
			Map<IncludePackages, List<String>> includes,
			Map<IncludePackages, Bundle> bundles) {
		super.resolveActivationPolicyInclude(includes, bundles);
		
	}

	public void resolveRequireBundle(Framework framework,
			Map<RequireBundle, String> requireBundles,
			Map<RequireBundle, Bundle> bundles) {
		
	}

	public void resolveExportPackageUses(Map<Uses, List<String>> uses, Map<Uses, Bundle> bundles) {
		super.resolveExportPackageUses(uses, bundles);
	}

	public void resolveImportPackage(Map<ImportPackage, List<String>> importPackages, Map<ImportPackage, Bundle> bundles) {
		super.resolveImportPackage(importPackages, bundles);
	}

	public void resolveImportService(Map<ImportService, String> importServices,
			Map<ImportService, Bundle> bundles, List<Service> servicesAvailable) {
		super.resolveImportService(importServices, bundles, servicesAvailable);
		
	}
	
}
