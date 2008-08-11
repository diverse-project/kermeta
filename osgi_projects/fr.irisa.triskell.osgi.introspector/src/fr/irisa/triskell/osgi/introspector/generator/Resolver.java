package fr.irisa.triskell.osgi.introspector.generator;

import java.util.List;
import java.util.Map;
import java.util.jar.Manifest;

import manifest.BundleActivator;
import manifest.BundleClassPath;
import manifest.BundleNativeCode;
import manifest.BundleSymbolicName;
import manifest.ExportPackage;
import manifest.ExportService;
import manifest.FragmentHost;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.MANIFEST;
import manifest.RequireBundle;
import manifest.Service;
import option.ExcludeClasses;
import option.ExcludePackages;
import option.IncludeClasses;
import option.IncludePackages;
import option.Uses;
import framework.Bundle;
import framework.Framework;
/**
 * 
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * 
 * This Interface contains functions to resolve references into OSGi {@link Framework} representation
 */
public interface Resolver {

	/**
	 * This function is used to resolve the {@link FragmentHost} entry into {@link Manifest}
	 * 
	 * @param framework the {@link Framework} which contains all {@link Bundle}
	 * @param fragmentHosts a {@link Map}<{@link Bundle}, {@link String}>. The {@link String} is the {@link BundleSymbolicName#getSymbolicName()} value of a {@link Bundle}. 
	 */
	public void resolveFragmentHost(framework.Framework framework, Map<Bundle, String> fragmentHosts);
	
	/**
	 * This function is used to resolve the Bundle-ClassPath entry which have not already resolved.
	 * It look for into Fragment Bundle to find the Bundle-ClassPath entry element.
	 * @param bundleClassPaths
	 * @param bundles
	 */
	public void resolveBundleClassPath(Map<BundleClassPath, List<String>> bundleClassPaths, Map<BundleClassPath, Bundle> bundles);
	
	public void resolveBundleNativeCode(Map<BundleNativeCode, List<String>> bundleNativeCodes, Map<BundleNativeCode, Bundle> bundles);
	
	/**
	 * This function is used to resolve the {@link ExportPackage} entry into {@link MANIFEST}
	 * 
	 * @param exportPackages
	 * @param bundles
	 */
	public void resolveExportPackage(Map<ExportPackage, List<String>> exportPackages, Map<ExportPackage, Bundle> bundles);

	/**
	 * This function is used to resolve the Export-Package exclude directive entry into {@link MANIFEST}
	 * 
	 * @param excludes
	 * @param exportPackages
	 */
	public void resolveExportPackageExclude(Map<ExcludeClasses, List<String>> excludes, Map<ExcludeClasses, ExportPackage> exportPackages);

	/**
	 * This function is used to resolve the Export-Package include directive entry into {@link MANIFEST}
	 * 
	 * @param includes
	 * @param exportPackages
	 */
	public void resolveExportPackageInclude(Map<IncludeClasses, List<String>> includes, Map<IncludeClasses, ExportPackage> exportPackages);

	/**
	 * This function is used to resolve the Export-Package uses directive entry into {@link MANIFEST}
	 * 
	 * @param uses
	 * @param bundles
	 */
	public void resolveExportPackageUses(Map<Uses, List<String>> uses, Map<Uses, Bundle> bundles);

	/**
	 * This function is used to resolve the {@link ImportPackage} entry into {@link MANIFEST}
	 * 
	 * @param importPackages
	 * @param bundles
	 * @param framework
	 */
	public void resolveImportPackage(Map<ImportPackage, List<String>> importPackages, Map<ImportPackage, Bundle> bundles, Framework framework);

	/**
	 * This function is used to resolve the {@link ImportService} entry into {@link MANIFEST}
	 * 
	 * @param importServices
	 * @param bundles
	 * @param servicesAvailable
	 */
	public void resolveImportService(Map<ImportService, String> importServices, Map<ImportService, Bundle> bundles, List<Service> servicesAvailable);

	/**
	 * This function is used to resolve the {@link BundleActivator} entry into {@link MANIFEST}
	 * 
	 * @param activators
	 * @param bundles
	 */
	public void resolveActivator(Map<BundleActivator, String> activators, Map<BundleActivator, Bundle> bundles);

	/**
	 * This function is used to resolve the {@link ExportService} exclude directive entry into {@link MANIFEST}
	 * 
	 * @param services
	 * @param bundles
	 */
	public void resolveExportService(Map<Service, String> services, Map<Service, Bundle> bundles);
	
	/**
	 * This function is used to resolve the Bundle-ActivationPolicy exclude directive entry into {@link MANIFEST}
	 * 
	 * @param excludes
	 * @param bundles
	 */
	public void resolveActivationPolicyExclude(Map<ExcludePackages, List<String>> excludes, Map<ExcludePackages, Bundle> bundles);
	
	/**
	 * This function is used to resolve the Bundle-ActivationPolicy include directive entry into {@link MANIFEST}
	 * 
	 * @param includes
	 * @param bundles
	 */
	public void resolveActivationPolicyInclude(Map<IncludePackages, List<String>> includes, Map<IncludePackages, Bundle> bundles);
	
	/**
	 * This function is used to resolve the {@link RequireBundle} entry into {@link MANIFEST}
	 * 
	 * @param requireBundles
	 * @param bundles
	 * @param framework
	 */
	public void resolveRequireBundle(Map<RequireBundle, String> requireBundles, Map<RequireBundle, Bundle> bundles, Framework framework);
}

