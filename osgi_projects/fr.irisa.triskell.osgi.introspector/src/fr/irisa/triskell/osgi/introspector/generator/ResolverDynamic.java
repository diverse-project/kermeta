package fr.irisa.triskell.osgi.introspector.generator;

import jar.Class;
import jar.Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import manifest.BadVersionValue;
import manifest.BundleActivator;
import manifest.ExportPackage;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.ManifestFactory;
import manifest.RequireBundle;
import manifest.Service;
import manifest.Version;
import option.ExcludeClasses;
import option.ExcludePackages;
import option.IncludeClasses;
import option.IncludePackages;
import option.Uses;

import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;
import org.osgi.service.packageadmin.ExportedPackage;
import org.osgi.service.packageadmin.PackageAdmin;

import framework.Bundle;
import framework.Framework;
/**
 * 
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * @see Resolver
 * 
 * This class is used to resolve all references using OSGi dynamicity. 
 * 
 */
public class ResolverDynamic extends ResolverStatic implements Resolver {
	
	/**
	 * {@link BundleContext} is used to interact with the OSGi platform.
	 */
	private BundleContext context;
	
	/**
	 * The constructor of this class
	 * @param context the {@link BundleContext} which is used to get access to all {@link BundleContext} and {@link ServiceReference} into the OSGi framework
	 */
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

	public void resolveActivator(Map<BundleActivator, String> activators, Map<BundleActivator, Bundle> bundles) {
		super.resolveActivator(activators, bundles);
		
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

	public void resolveRequireBundle(Map<RequireBundle, String> requireBundles,
			Map<RequireBundle, Bundle> bundles, Framework framework) {
		
	}

	public void resolveImportPackage(Map<ImportPackage, List<String>> importPackages, Map<ImportPackage, Bundle> bundles, Framework framework) {
		ServiceReference refs = context.getServiceReference(PackageAdmin.class.getName());
		if (refs != null) {
			PackageAdmin packageAdmin = (PackageAdmin)context.getService(refs);
			
			
			for (ImportPackage value : importPackages.keySet()) {
				for (String _package : importPackages.get(value)) {
					value.addPackage(_package);
					ExportedPackage p = packageAdmin.getExportedPackage(_package);
					if (p != null) {
						Version version = ManifestFactory.eINSTANCE.createVersion(); 
						try {
						version.setVersionValue((String)p.getExportingBundle().getHeaders().get(Constants.BUNDLE_VERSION));
						} catch (BadVersionValue e) {
							version.setMajor(0);
							version.setMinor(0);
							version.setMicro(0);
						}
						Bundle bundle = framework.findBundle(p.getExportingBundle().getSymbolicName(), version);
						Package exportedPackage = bundle.getPackage().getPackage(p.getName());
						if (exportedPackage == null) {
							value.setResolved(false);
						} else {
							value.addPackageReference(exportedPackage);
						}
					} else {
						// TODO log
					}
				}
			}
		} else {
			// TODO log
		}
	}

	public void resolveExportService(Map<Service, String> services, Map<Service, Bundle> bundles) {
		List<Service> tmp = new ArrayList<Service>();
		// First we lokk for service into our owner packages and classes
		for (Service service : services.keySet()) {
			String serviceReference = services.get(service);
			Class element = bundles.get(service).getPackage().getClass(
					serviceReference);
			if (element != null) {
				service.setInterface(element);
			} else {
				tmp.add(service);
			}
			service.setInterfaceName(serviceReference);
		}
		if (tmp.size() > 0) {
			List<Service> tmp1 = new ArrayList<Service>();
			// Next we look for service into Import-Package
			for (Service service : tmp) {
				Bundle bundle = bundles.get(service);
				String serviceReference = services.get(service);
				boolean find = false;
				for (ImportPackage importPackage : bundle.getManifest().getImportPackages()) {
					Class _interface = null;
					for (Package _package : importPackage.getPackagesList()) {
						_interface = _package.getClass(serviceReference);
						if (_interface != null) {
							service.setInterface(_interface);
							find = true;
							break;
						}
					}
					if (_interface != null) {
						break;
					}
				}
				if (!find) {
					tmp1.add(service);
				}
			}
			// maybe it's not usefull to save the unresolved Service
			Map<Service, Bundle> bundlesTmp = bundles;
			bundles = new HashMap<Service, Bundle>();
			
			Map<Service, String> servicesTmp = services;
			services = new HashMap<Service, String>();
			for (Service service : tmp1) {
				Bundle b = bundlesTmp.get(service);
				String s = servicesTmp.get(service);
				this.getLog().put(b, this.getLog().get(b)
						+ "The export service reference "
						+ s + " is not resolved." + "\n");
				bundles.put(service, b);
				services.put(service, s);
			}
		}
	}

	public void resolveExportPackageUses(Map<Uses, List<String>> uses, Map<Uses, Bundle> bundles) {
		super.resolveExportPackageUses(uses, bundles);
	}

	public void resolveImportService(Map<ImportService, String> importServices,
			Map<ImportService, Bundle> bundles, List<Service> servicesAvailable) {
		super.resolveImportService(importServices, bundles, servicesAvailable);
		
		/*ServiceReference refs = context.getServiceReference(PackageAdmin.class.getName());
		if (refs != null) {
			PackageAdmin packageAdmin = (PackageAdmin)context.getService(refs);
			
		} else {
			// TODO log
		}*/
	}
	
}
