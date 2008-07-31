package fr.irisa.triskell.osgi.introspector.generator;

import java.util.List;
import java.util.Map;

import manifest.BundleActivator;
import manifest.ExportPackage;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.Service;
import option.ExcludeClasses;
import option.IncludeClasses;
import option.Uses;
import framework.Bundle;

public interface Resolver {

	public void resolveFragmentHost(framework.Framework framework, Map<Bundle, String> fragmentHosts);
	
	public void resolveExportPackage(Map<ExportPackage, List<String>> exportPackages, Map<ExportPackage, Bundle> Bundles);

	public void resolveExportPackageExclude(Map<ExcludeClasses, List<String>> excludes, Map<ExcludeClasses, ExportPackage> exportPackages);

	public void resolveExportPackageInclude(Map<IncludeClasses, List<String>> includes, Map<IncludeClasses, ExportPackage> exportPackages);

	public void resolveExportPackageUses(Map<Uses, List<String>> uses, Map<Uses, Bundle> bundles);

	public void resolveImportPackage(Map<ImportPackage, List<String>> importPackages);

	public void resolveImportService(Map<ImportService, String> importServices);

	public void resolveActivator(Map<BundleActivator, Bundle> bundles, Map<BundleActivator, String> activators);

	public void resolveExportService(Map<Service, Bundle> bundles, Map<Service, String> services);
	
	public Map<Bundle, String> getLog();
	
	public void setLog(Map<Bundle, String> log);
}

