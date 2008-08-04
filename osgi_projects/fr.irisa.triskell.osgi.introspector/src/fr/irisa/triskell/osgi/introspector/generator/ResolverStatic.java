package fr.irisa.triskell.osgi.introspector.generator;

import jar.Class;
import jar.Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

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
import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorUtil;
import framework.Bundle;
import framework.Framework;

public class ResolverStatic implements Resolver {

	private Map<Bundle, String> log;

	public Map<Bundle, String> getLog() {
		return log;
	}

	public void setLog(Map<Bundle, String> log) {
		this.log = log;
	}

	/**
	 * This function is used to resolve all Fragment-Host entry into the
	 * framework.
	 */
	public void resolveFragmentHost(Framework framework, Map<Bundle, String> fragmentHosts ) {
		Map<Bundle, String> fragmentHostsTmp = new HashMap<Bundle, String>();
		for (Bundle fragment : fragmentHosts.keySet()) {
			List<Bundle> hostBundles = framework.findBundle(fragmentHosts.get(fragment));
			if (hostBundles == null) {
				fragmentHostsTmp.put(fragment, fragmentHosts.get(fragment));
			} else {
				boolean versionDefined = false;
				boolean minNotInclude = false;
				boolean maxNotInclude = true;
				Version minVersion = null;
				Version maxVersion = null;
				List<AttributEntry> attributs = fragment.getManifest()
						.getFragmentHost().getOptions();
				for (AttributEntry attribut : attributs) {
					// TODO attention bundle-version (OSGi R4), specification-version (OSGi R3) ...
					if (attribut.getToken().equals(Constants.BUNDLE_VERSION_ATTRIBUTE)) {
						versionDefined = true;
						String value = attribut.getValue();
						if (value.startsWith("(")) {
							minNotInclude = true;
						}
						if (value.endsWith("]")) {
							maxNotInclude = false;
						}
						value = value.replace("(", "").replace("[", "")
								.replace(")", "").replace("]", "").replace(
										"\"", "").replace(" ", "");
						String[] versionsValue = value.split(",");
						if (versionsValue.length == 2) {
							try {
								maxVersion = ManifestFactory.eINSTANCE
										.createVersion();
								maxVersion.setVersionValue(versionsValue[1]);
							} catch (BadVersionValue e) {
								maxVersion = null;
								this.log
										.put(
												fragment,
												this.log.get(fragment)
														+ "An attribut for Fragment-Host entry is unvalid."
														+ "\n"
														+ attribut.getValue()
														+ " is unvalid" + "\n");
							}
						}
						try {
							minVersion = ManifestFactory.eINSTANCE
									.createVersion();
							minVersion.setVersionValue(versionsValue[0]);
						} catch (BadVersionValue e) {
							minVersion = null;
							this.log
									.put(
											fragment,
											this.log.get(fragment)
													+ "An attribut for Fragment-Host entry is unvalid."
													+ "\n"
													+ attribut.getValue()
													+ " is unvalid" + "\n");
						}

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
					if (versionDefined) {
						if (versionHost.greaterThan(minVersion, minNotInclude)
								&& versionHost.lesserThan(maxVersion,
										maxNotInclude)) {
							if (bundleVersionMax == null
									|| versionHost.greaterThan(bundleVersionMax
											.getManifest().getBundleVersion()
											.getVersion(), true)) {
								bundleVersionMax = host;
							}
						}
					} else if (bundleVersionMax == null
							|| versionHost.greaterThan(bundleVersionMax
									.getManifest().getBundleVersion()
									.getVersion(), true)) {
						bundleVersionMax = host;
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
		}
	}

	/**
	 * This function is used to resolve all Export-Package entry.
	 */
	public void resolveExportPackage(Map<ExportPackage, List<String>> exportPackages, Map<ExportPackage, Bundle> bundles) {
		List<ExportPackage> exportPackageMaybeUnvalid = new ArrayList<ExportPackage>();
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
			}
			if (exportPackageReferenceTmp.size() > 0) {
				exportPackageReference = new ArrayList<String>();
				// Second research into Fragment class path
				for (String reference : exportPackageReferenceTmp) {
					boolean find = false;
					for (Bundle fragment : bundle.getFragments()) {
						Package _package = fragment.getPackage().getPackage(
								reference);
						if (_package != null) {
							exportPackage.addExportPackage(_package);
							find = true;
							break;
						}
					}
					if (!find) {
						this.log.put(bundle, this.log.get(bundle) + reference
								+ " is not a valid package." + "\n"
								+ "Maybe the folder "
								+ reference.replace(".", "/")
								+ " doesn't contain class file or doesn't exist." + "\n");
						exportPackageMaybeUnvalid.add(exportPackage);
					}
				}
			}
		}
		for (ExportPackage exportPackage : exportPackageMaybeUnvalid) {
			if (exportPackage.getPackages().size() == 0) {
				bundles.get(
						exportPackage).getManifest().removeExportPackage(
						exportPackage);
			}
		}
	}

	public void resolveExportPackageExclude(Map<ExcludeClasses, List<String>> excludes, Map<ExcludeClasses, ExportPackage> exportPackages) {
		for (ExcludeClasses excludeClass : excludes.keySet()) {
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
					OSGiIntrospectorUtil.log(Level.WARNING, "Many classes into exclude directives of Export-Package were not found");
					// TODO être plus précis ?
				}
			}
		}

	}

	public void resolveExportPackageInclude(Map<IncludeClasses, List<String>> includes, Map<IncludeClasses, ExportPackage> exportPackages) {
		for (IncludeClasses includeClass : includes.keySet()) {
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
					OSGiIntrospectorUtil.log(Level.WARNING, "Many classes into include directives of Export-Package were not found");
					// TODO être plus précis ?
				}
			}
		}
	}

	public void resolveExportService(Map<Service, Bundle> bundles, Map<Service, String> services) {
		List<Service> tmp = new ArrayList<Service>();
		for (Service service : services.keySet()) {
			String serviceReference = services.get(service);
			Class element = bundles.get(service).getPackage().getClass(
					serviceReference);
			if (element != null) {
				service.setInterface(element);
			} else {
				tmp.add(service);
			}
		}
		if (tmp.size() > 0) {
			for (Service service : tmp) {
				this.log.put(bundles.get(service), this.log.get(bundles
						.get(service))
						+ "The export service reference "
						+ services.get(service) + " is not valid." + "\n");
			}
		}
	}

	public void resolveActivator(Map<BundleActivator, Bundle> bundles, Map<BundleActivator, String> activators) {
		for (BundleActivator value : activators.keySet()) {
			Class element = bundles.get(value).getPackage().getClass(
					activators.get(value));
			if (element != null) {
				value.setActivator(element);
			} else {
				this.log.put(bundles.get(value), this.log.get(bundles
						.get(value))
						+ "The activator reference "
						+ activators.get(value)
						+ " is not valid." + "\n");
				bundles.get(value).getManifest().setBundleActivator(null);
			}
		}
	}

	public void resolveActivationPolicyExclude(
			Map<ExcludePackages, List<String>> excludes,
			Map<ExcludePackages, Bundle> bundles) {
		List<ExcludePackages> excludePackageMaybeUnvalid = new ArrayList<ExcludePackages>();
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
				for (String reference : exportPackageReferenceTmp) {
					boolean find = false;
					for (Bundle fragment : bundle.getFragments()) {
						Package _package = fragment.getPackage().getPackage(
								reference);
						if (_package != null) {
							excludePackage.addExcludePackage(_package);
							find = true;
							break;
						}
					}
					if (!find) {
						this.log.put(bundle, this.log.get(bundle) + reference
								+ " is not a valid package." + "\n"
								+ "Maybe the folder "
								+ reference.replace(".", "/")
								+ " don't contain class file or doesn't exist." + "\n");
						excludePackageMaybeUnvalid.add(excludePackage);
					}
				}
			}
		}
		for (ExcludePackages excludePackage : excludePackageMaybeUnvalid) {
			if (excludePackage.getPackages().size() == 0) {
				bundles.get(excludePackage).getManifest().getBundleActivationPolicy().removeDirective(
								excludePackage);
			}
		}
		
	}

	public void resolveActivationPolicyInclude(
			Map<IncludePackages, List<String>> includes,
			Map<IncludePackages, Bundle> bundles) {
		List<IncludePackages> includePackageMaybeUnvalid = new ArrayList<IncludePackages>();
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
				for (String reference : exportPackageReferenceTmp) {
					boolean find = false;
					for (Bundle fragment : bundle.getFragments()) {
						Package _package = fragment.getPackage().getPackage(
								reference);
						if (_package != null) {
							includePackage.addIncludePackage(_package);
							find = true;
							break;
						}
					}
					if (!find) {
						this.log.put(bundle, this.log.get(bundle) + reference
								+ " is not a valid package." + "\n"
								+ "Maybe the folder "
								+ reference.replace(".", "/")
								+ " don't contain class file or doesn't exist." + "\n");
						includePackageMaybeUnvalid.add(includePackage);
					}
				}
			}
		}
		for (IncludePackages includePackage : includePackageMaybeUnvalid) {
			if (includePackage.getPackages().size() == 0) {
				bundles.get(includePackage).getManifest().getBundleActivationPolicy().removeDirective(
						includePackage);
			}
		}	
	}

	public void resolveRequireBundle(Framework framework, 
			Map<RequireBundle, String> requireBundles,
			Map<RequireBundle, Bundle> bundles) {
		for (RequireBundle value : requireBundles.keySet()) {
				value.setBundle(requireBundles.get(value));
				value.setResolved(false);
	
		}
		
	}

	public void resolveExportPackageUses(Map<Uses, List<String>> uses, Map<Uses, Bundle> bundles) {
		for (Uses value : uses.keySet()) {
			for (String _package : uses.get(value)) {
				value.addPackage(_package);
			}

		}
	}

	public void resolveImportPackage(
			Map<ImportPackage, List<String>> importPackages,
			Map<ImportPackage, Bundle> bundles) {
		for (ImportPackage value : importPackages.keySet()) {
			for (String _package : importPackages.get(value)) {
				value.addPackage(_package);
				value.setResolved(false);
			}

		}
		
	}

	public void resolveImportService(Map<ImportService, String> importServices,
			Map<ImportService, Bundle> bundles, List<Service> servicesAvailable) {
		for (ImportService value : importServices.keySet()) {
			value.setService(importServices.get(value));
			value.setResolved(false);

		}
		
	}
}
