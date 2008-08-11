package fr.irisa.triskell.osgi.introspector.generator;

import jar.Class;
import jar.Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import manifest.BundleActivator;
import manifest.BundleClassPath;
import manifest.BundleNativeCode;
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

import org.apache.log4j.Level;

import fr.irisa.triskell.osgi.introspector.util.OSGiIntrospectorUtil;
import framework.Bundle;
import framework.Framework;
/**
 * 
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * 
 * This class is used to resolve all references without using OSGi dynamicity. 
 */
public class ResolverStatic implements Resolver {

	public void resolveRequireBundle(Map<RequireBundle, String> requireBundles,
			Map<RequireBundle, Bundle> bundles, Framework framework) {
		for (RequireBundle value : requireBundles.keySet()) {
				value.setBundleReference(requireBundles.get(value));
				value.setResolved(false);
	
		}
		
	}

	/**
	 * This function is used to resolve all Fragment-Host entry into the
	 * framework.
	 */
	public void resolveFragmentHost(Framework framework, Map<Bundle, String> fragmentHosts ) {
		/*Map<Bundle, String> fragmentHostsTmp = new HashMap<Bundle, String>();
		for (Bundle fragment : fragmentHosts.keySet()) {
			List<Bundle> hostBundles = framework.findBundles(fragmentHosts.get(fragment));
			if (hostBundles == null) {
				fragmentHostsTmp.put(fragment, fragmentHosts.get(fragment));
			} else {
				String versionRange = null;
				for (AttributEntry option : fragment.getManifest().getFragmentHost().getOptions()) {
					if (option.getToken().equals(Constants.BUNDLE_VERSION_ATTRIBUTE)) {
						versionRange = option.getValue();
						break;
					}
				}
				Bundle bundleVersionMax = null;
				for (Bundle host : hostBundles) {
					Version versionHost = null;
					if (host.getManifest().getBundleVersion() == null) {
						versionHost = ManifestFactory.eINSTANCE.createVersion();
						versionHost.setMajor(0);
						versionHost.setMinor(0);
						versionHost.setMicro(0);
					} else {
						versionHost = host.getManifest().getBundleVersion()
								.getVersion();
					}
					if (versionHost.containsInto(versionRange)) {
							if (bundleVersionMax == null
									|| versionHost.greaterThan(bundleVersionMax
											.getManifest().getBundleVersion()
											.getVersion(), true)) {
								bundleVersionMax = host;
							}
					}
				}
				if (bundleVersionMax != null) {
					bundleVersionMax.addFragment(fragment);
					fragment.getManifest().getFragmentHost().setBundle(
							bundleVersionMax);
				}
			}
		}
		if (fragmentHostsTmp.size() > 0) {
			for (Bundle bundle : fragmentHostsTmp.keySet()) {
				String log = this.log.get(bundle);
				if (log == null) {
					log = bundle.getLocation() + "\n";
				}
				log += "The Fragment-Host entry is not valid :" + "\n";
				log += "\t" + fragmentHostsTmp.get(bundle) + "\n";
				this.log.put(bundle, log);
			}
		}*/
		for (Bundle fragment : fragmentHosts.keySet()) {
			fragment.getManifest().getFragmentHost().setBundleReference(fragmentHosts.get(fragment));
			fragment.getManifest().getFragmentHost().setResolved(false);
		}
	}

	public void resolveBundleClassPath(
			Map<BundleClassPath, List<String>> bundleClassPaths,
			Map<BundleClassPath, Bundle> bundles) {
		for (BundleClassPath bundleClassPath : bundleClassPaths.keySet()) {
			for (String reference : bundleClassPaths.get(bundleClassPath)) {
				bundleClassPath.addEntryReference(reference);	
				bundleClassPath.setResolved(false);
			}
		}
	}

	public void resolveBundleNativeCode(
			Map<BundleNativeCode, List<String>> bundleNativeCodes,
			Map<BundleNativeCode, Bundle> bundles) {
			for (BundleNativeCode bundleNativeCode : bundleNativeCodes.keySet()) {
				for (String fileReference : bundleNativeCodes.get(bundleNativeCode)) {
					bundleNativeCode.setResolved(bundleNativeCode.isResolved() && false);
					bundleNativeCode.addFileReference(fileReference);
				}
			}
		
	}

	/**
	 * This function is used to resolve all Export-Package entry.
	 */
	public void resolveExportPackage(Map<ExportPackage, List<String>> exportPackages, Map<ExportPackage, Bundle> bundles) {
		//List<ExportPackage> exportPackageMaybeUnvalid = new ArrayList<ExportPackage>();
		for (ExportPackage exportPackage : exportPackages.keySet()) {
			List<String> exportPackageReference = exportPackages
					.get(exportPackage);
			List<String> exportPackageReferenceTmp = new ArrayList<String>();
			Bundle bundle = bundles
					.get(exportPackage);

			// First research into local class path
			for (String reference : exportPackageReference) {
				Package _package = bundle.getPackage().getPackage(reference);
				if (_package != null) {
					exportPackage.addExportPackage(_package);
				} else {
					exportPackageReferenceTmp.add(reference);
				}
				exportPackage.addExportPackageReference(reference);
			}
			if (exportPackageReferenceTmp.size() > 0) {
				exportPackageReference = new ArrayList<String>();
				// Second research into Fragment class path
				// But in Static way, the Fragments are not resolved
				for (String reference : exportPackageReferenceTmp) {
					exportPackage.addExportPackageReference(reference);
					exportPackage.setResolved(exportPackage.isResolved() && false);
				}
			}
		}
	}

	public void resolveExportPackageExclude(Map<ExcludeClasses, List<String>> excludes, Map<ExcludeClasses, ExportPackage> exportPackages) {
		for (ExcludeClasses excludeClass : excludes.keySet()) {
			// The Export-Package must be resolved
			if (exportPackages.get(excludeClass).isResolved()) {
				ExportPackage entry = exportPackages.get(
								excludeClass);
				for (String value : excludes.get(excludeClass)) {
					List<Class> classes = new ArrayList<Class>();
					for (Package _package : entry.getPackages()) {
						classes.addAll(_package.getClassWithRegex(value));
					}
					if (classes.size() > 0) {
						for (Class clazz : classes) {
							excludeClass.addExclude(clazz);
						}
					} else {
						// FIXME il faut le bundle contenant le Export-Package
						OSGiIntrospectorUtil.log(Level.WARN, value + " into include directives of Export-Package were not found", null);
						}
				}
			}
		}

	}

	public void resolveExportPackageInclude(Map<IncludeClasses, List<String>> includes, Map<IncludeClasses, ExportPackage> exportPackages) {
		for (IncludeClasses includeClass : includes.keySet()) {
			// The Export-Package must be resolved
			if (exportPackages.get(includeClass).isResolved()) {
				ExportPackage entry = exportPackages.get(
								includeClass);
				for (String value : includes.get(includeClass)) {
					List<Class> classes = new ArrayList<Class>();
					for (Package _package : entry.getPackages()) {
						classes.addAll(_package.getClassWithRegex(value));
					}
					if (classes.size() > 0) {
						for (Class clazz : classes) {
							includeClass.addInclude(clazz);
						}
					} else {
						// FIXME il faut le bundle contenant le Export-Package
						OSGiIntrospectorUtil.log(Level.WARN, value + " into include directives of Export-Package were not found", null);
					}
				}
			}
		}
	}

	public void resolveActivator(Map<BundleActivator, String> activators, Map<BundleActivator, Bundle> bundles) {
		for (BundleActivator value : activators.keySet()) {
			Class element = bundles.get(value).getPackage().getClass(
					activators.get(value));
			if (element != null) {
				value.setActivator(element);
			} else {
				OSGiIntrospectorUtil.log(Level.WARN, "The activator reference "
						+ activators.get(value)
						+ " is not valid.", bundles.get(value));
				bundles.get(value).getManifest().setBundleActivator(null);
			}
		}
	}

	public void resolveActivationPolicyExclude(
			Map<ExcludePackages, List<String>> excludes,
			Map<ExcludePackages, Bundle> bundles) {
		for (ExcludePackages excludePackage : excludes.keySet()) {
			List<String> exportPackageReference = excludes
					.get(excludePackage);
			List<String> exportPackageReferenceTmp = new ArrayList<String>();
			Bundle bundle = bundles
					.get(excludePackage);
	
			// First research into local class path
			for (String reference : exportPackageReference) {
				Package _package = bundle.getPackage().getPackage(reference);
				if (_package != null) {
					excludePackage.addExcludePackage(_package);
				} else {
					exportPackageReferenceTmp.add(reference);
				}
			}
			if (exportPackageReferenceTmp.size() > 0) {
				exportPackageReference = new ArrayList<String>();
				// Second research into Fragment class path
				// But fragments are not resolved
				for (String reference : exportPackageReferenceTmp) {
					excludePackage.addExcludePackageReference(reference);
				}
			}
		}
		
	}

	public void resolveActivationPolicyInclude(
			Map<IncludePackages, List<String>> includes,
			Map<IncludePackages, Bundle> bundles) {
		for (IncludePackages includePackage : includes.keySet()) {
			List<String> exportPackageReference = includes
					.get(includePackage);
			List<String> exportPackageReferenceTmp = new ArrayList<String>();
			Bundle bundle = bundles
					.get(includePackage);
	
			// First research into local class path
			for (String reference : exportPackageReference) {
				Package _package = bundle.getPackage().getPackage(reference);
				if (_package != null) {
					includePackage.addIncludePackage(_package);
				} else {
					exportPackageReferenceTmp.add(reference);
				}
			}
			if (exportPackageReferenceTmp.size() > 0) {
				exportPackageReference = new ArrayList<String>();
				// Second research into Fragment class path
				// but fragments are not resolved
				for (String reference : exportPackageReferenceTmp) {
					includePackage.addIncludePackageReference(reference);
				}
			}
		}
	}

	public void resolveImportPackage(
			Map<ImportPackage, List<String>> importPackages,
			Map<ImportPackage, Bundle> bundles, Framework framework) {
		for (ImportPackage value : importPackages.keySet()) {
			for (String _package : importPackages.get(value)) {
				value.addPackageReference(_package);
				value.setResolved(false);
			}
	
		}
		
	}

	public void resolveExportService(Map<Service, String> services, Map<Service, Bundle> bundles) {
		List<Service> tmp = new ArrayList<Service>();
		for (Service service : services.keySet()) {
			String serviceReference = services.get(service);
			Class element = bundles.get(service).getPackage().getClass(
					serviceReference);
			if (element != null) {
				service.setInterface(element);
				service.setResolved(true);
			} else {
				tmp.add(service);
			}
			service.setInterfaceReference(serviceReference);
		}
		if (tmp.size() > 0) {
			Map<Service, Bundle> bundlesTmp = bundles;
			bundles = new HashMap<Service, Bundle>();
			
			Map<Service, String> servicesTmp = services;
			services = new HashMap<Service, String>();
			for (Service service : tmp) {
				Bundle b = bundlesTmp.get(service);
				String s = servicesTmp.get(service);
				OSGiIntrospectorUtil.log(Level.WARN, "The export service reference "
						+ s + " is not resolved.", b);
				bundles.put(service, b);
				services.put(service, s);
				service.setResolved(false);
			}
		}
	}

	public void resolveExportPackageUses(Map<Uses, List<String>> uses, Map<Uses, Bundle> bundles) {
		for (Uses value : uses.keySet()) {
			for (String _package : uses.get(value)) {
				value.addPackage(_package);
			}
		}
	}

	public void resolveImportService(Map<ImportService, String> importServices,
			Map<ImportService, Bundle> bundles, List<Service> servicesAvailable) {
		for (ImportService importedService : importServices.keySet()) {
			for (Service service : servicesAvailable) {
				importedService.setResolved(false);
				if (service.getInterfaceReference().equals(importServices.get(importedService))) {
					importedService.setService(service);
					importedService.setResolved(true);
				}
				importedService.setServiceReference(service.getInterfaceReference());
			}
		}
	}
}
