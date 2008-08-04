package fr.irisa.triskell.osgi.introspector.generator;

import java.util.List;
import java.util.Map;

import manifest.BundleActivator;
import manifest.ExportPackage;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.RequireBundle;
import manifest.Service;
import option.ExcludeClasses;
import option.ExcludePackages;
import option.IncludeClasses;
import option.IncludePackages;
import option.Uses;
import framework.Bundle;
import framework.Framework;

public interface Resolver {

	public void resolveFragmentHost(framework.Framework framework, Map<Bundle, String> fragmentHosts);
	
	public void resolveExportPackage(Map<ExportPackage, List<String>> exportPackages, Map<ExportPackage, Bundle> bundles);

	public void resolveExportPackageExclude(Map<ExcludeClasses, List<String>> excludes, Map<ExcludeClasses, ExportPackage> exportPackages);

	public void resolveExportPackageInclude(Map<IncludeClasses, List<String>> includes, Map<IncludeClasses, ExportPackage> exportPackages);

	public void resolveExportPackageUses(Map<Uses, List<String>> uses, Map<Uses, Bundle> bundles);

	public void resolveImportPackage(Map<ImportPackage, List<String>> importPackages, Map<ImportPackage, Bundle> bundles);

	public void resolveImportService(Map<ImportService, String> importServices, Map<ImportService, Bundle> bundles, List<Service> servicesAvailable);

	public void resolveActivator(Map<BundleActivator, Bundle> bundles, Map<BundleActivator, String> activators);

	public void resolveExportService(Map<Service, Bundle> bundles, Map<Service, String> services);
	
	public void resolveActivationPolicyExclude(Map<ExcludePackages, List<String>> excludes, Map<ExcludePackages, Bundle> bundles);
	
	public void resolveActivationPolicyInclude(Map<IncludePackages, List<String>> includes, Map<IncludePackages, Bundle> bundles);
	
	public void resolveRequireBundle(Framework framework, Map<RequireBundle, String> requireBundles, Map<RequireBundle, Bundle> bundles);
	
	public Map<Bundle, String> getLog();
	
	public void setLog(Map<Bundle, String> log);
}

