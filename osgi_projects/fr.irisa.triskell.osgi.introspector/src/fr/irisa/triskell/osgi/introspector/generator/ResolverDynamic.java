package fr.irisa.triskell.osgi.introspector.generator;

import jar.Class;
import jar.File;
import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import manifest.BadVersionValue;
import manifest.BundleActivator;
import manifest.BundleClassPath;
import manifest.BundleNativeCode;
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
import option.RequireBundleDirective;
import option.Resolution;
import option.ResolutionEnum;
import option.Uses;

import org.apache.log4j.Level;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;
import org.osgi.service.packageadmin.ExportedPackage;
import org.osgi.service.packageadmin.PackageAdmin;
import org.osgi.service.packageadmin.RequiredBundle;

import fr.irisa.triskell.osgi.introspector.util.OSGiIntrospectorUtil;
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

	public void resolveRequireBundle(Map<RequireBundle, String> requireBundles,
			Map<RequireBundle, Bundle> bundles, Framework framework) {
		ServiceReference refs = context.getServiceReference(PackageAdmin.class.getName());
		if (refs != null) {
			PackageAdmin packageAdmin = (PackageAdmin)context.getService(refs);
			for (RequireBundle requirebundle : requireBundles.keySet()) {
				RequiredBundle[] requiredBundlesOSGi = packageAdmin.getRequiredBundles(requireBundles.get(requirebundle));
				if (requiredBundlesOSGi != null) {
					for (RequiredBundle requiredbundleOSGi : requiredBundlesOSGi) {
						org.osgi.framework.Bundle bundle = requiredbundleOSGi.getBundle();
						
						Version v = ManifestFactory.eINSTANCE.createVersion();
						try {
							v.setVersionValue((String)bundle.getHeaders().get(Constants.BUNDLE_VERSION));
						} catch (BadVersionValue e) {
							v.setMajor(0);
							v.setMinor(0);
							v.setMicro(0);
						}
						String versionRange = null;
						for (AttributEntry option : requirebundle.getOptions()) {
							if (option.getToken().equals(Constants.BUNDLE_VERSION_ATTRIBUTE)) {
								versionRange = option.getValue();
								break;
							}
						}
						if (v.containsInto(versionRange)) {
							Bundle requireBundle = framework.findBundle(bundle.getSymbolicName(), v);
							if (requireBundle != null) {
								requirebundle.setBundle(requireBundle);
								requirebundle.setResolved(true);
								break;
							}
						}
					}
					requirebundle.setBundleReference(requireBundles.get(requirebundle));
					if (requirebundle.getBundle() == null) {
						// TODO log pas de bundle trouvé dans mon framework
						// normalement ne doit pas apparaître
					}
				} else {
					boolean optional = false;
					for (RequireBundleDirective directive : requirebundle.getDirectives()) {
						if (directive instanceof Resolution && ((Resolution)directive).getResolution().equals(ResolutionEnum.OPTIONAL)) {
							// TODO log
							// unresolved Require bundle but it's only optional
							optional = true;
							break;
						}
					}
					if (!optional) {
						// TODO log
					}
					requirebundle.setBundleReference(requireBundles.get(requirebundle));
				}
			}
		} else {
			// TODO log pas de packageAdmin donc pas de résolution dynamique
			super.resolveRequireBundle(requireBundles, bundles, framework);
		}
		
	}

	public void resolveFragmentHost(Framework framework,
			Map<Bundle, String> fragmentHosts) {
		//super.resolveFragmentHost(framework, fragmentHosts);
		ServiceReference refs = context.getServiceReference(PackageAdmin.class.getName());
		if (refs != null) {
			for (Bundle fragment : fragmentHosts.keySet()) {
				
					PackageAdmin packageAdmin = (PackageAdmin)context.getService(refs);
					String versionRange = null;
					for (AttributEntry option : fragment.getManifest().getFragmentHost().getOptions()) {
						if (option.getToken().equals(Constants.BUNDLE_VERSION_ATTRIBUTE)) {
							versionRange = option.getValue();
							break;
						}
					}
					org.osgi.framework.Bundle[] hosts = packageAdmin.getBundles(fragmentHosts.get(fragment), 
									versionRange);
					if (hosts != null) {
						Version v = ManifestFactory.eINSTANCE.createVersion();
						try {
							v.setVersionValue((String)hosts[0].getHeaders().get(Constants.BUNDLE_VERSION));
						} catch (BadVersionValue e) {
							v.setMajor(0);
							v.setMinor(0);
							v.setMicro(0);
						}
						Bundle host = framework.findBundle(hosts[0].getSymbolicName(), v);
						host.addFragment(fragment);
						fragment.getManifest().getFragmentHost().setBundle(host);
					} else {
						// TODO log host not found
					}
					fragment.getManifest().getFragmentHost().setBundleReference(fragmentHosts.get(fragment));
			}
		} else {
			// TODO log pas de packageAdmin donc pas de résolution dynamique
			super.resolveFragmentHost(framework, fragmentHosts);
		}
	}

	private void updateClassPath(Folder folder, Bundle bundle) {
		for (SystemEntry entry : bundle.getFolder().getEntries()) {
			if (entry.isBundleClassPath()) {
				if (entry instanceof Folder) {
					Package _package = OSGiIntrospectorUtil.convertToJavaElement((Folder)entry, true);
					if (_package != null) {
						bundle.getPackage().addPackage(_package);
					}
				} else {
					Class clazz = JarFactory.eINSTANCE.createClass();
					clazz.setFullPath(entry.getFullPath().replace("/", "."));
					clazz.setName(entry.getName().substring(0, entry.getName().length() - (".class").length()));
				}
			}
		}
	}
	
	public void resolveBundleClassPath(
			Map<BundleClassPath, List<String>> bundleClassPaths,
			Map<BundleClassPath, Bundle> bundles) {
		for (BundleClassPath bundleClassPath : bundleClassPaths.keySet()) {
			for (String classPathReference : bundleClassPaths.get(bundleClassPath)) {
				Bundle bundle = bundles.get(bundleClassPath);
				bundleClassPath.setResolved(false);
				for (Bundle fragment : bundle.getFragments()) {
					SystemEntry systemEntry = fragment.getFolder().getEntry(classPathReference);
					if (systemEntry != null) {
						if (systemEntry instanceof Folder) {
							Package _package = OSGiIntrospectorUtil
									.convertToJavaElement((Folder) systemEntry, true);
							if (_package != null) {
								bundle.getPackage().addPackage(_package);
							} else {
								// TODO c'est seulement un dossier contenant des ressources
							}
							bundleClassPath.addEntry((Folder) systemEntry);
							bundleClassPath.setResolved(true);
						} else if (systemEntry instanceof File) {
							if (systemEntry.getName().endsWith(".jar")) {
								try {
									OSGiIntrospectorUtil.addEntriesFromJar(bundle,
											(File) systemEntry, fragment);
									bundleClassPath.addEntry((File) systemEntry);
									bundleClassPath.setResolved(true);
								} catch (IOException e) {
									OSGiIntrospectorUtil.log(Level.ERROR, "Unvalid " + Constants.BUNDLE_CLASSPATH + " entry :" + "\n"
											+ "IOException with "
											+ systemEntry.getFullPath() + ".", bundle);
									
								}
							} else {
								OSGiIntrospectorUtil.log(Level.ERROR, "Unvalid " + Constants.BUNDLE_CLASSPATH + " entry :" + "\n"
										+ systemEntry.getFullPath()
										+ " is a file but is not a JAR file.", bundle);
								
							}
						} else {
							OSGiIntrospectorUtil.log(Level.ERROR, "Unvalid " + Constants.BUNDLE_CLASSPATH + " entry :" + "\n"
										+ classPathReference
										+ " must be a JAR file or a folder.", bundle);
						}
						this.updateClassPath(bundle.getFolder(), bundle);
						break;
					} else {
						// TODO log
						// enlever le BundleClassPath du Manifest ????
					}
				}
				bundleClassPath.addEntryReference(classPathReference);
			}
		}
	}
	
	@Override
	public void resolveBundleNativeCode(
			Map<BundleNativeCode, List<String>> bundleNativeCodes,
			Map<BundleNativeCode, Bundle> bundles) {
		for (BundleNativeCode bundleNativeCode : bundleNativeCodes.keySet()) {
			for (String fileReference : bundleNativeCodes.get(bundleNativeCode)) {
				boolean find = false;
				for (Bundle fragment : bundles.get(bundleNativeCode).getFragments()) {
					SystemEntry systemEntry = fragment.getFolder().getEntry(fileReference);
					if (systemEntry != null && systemEntry instanceof File) {
						bundleNativeCode.addFile((File) systemEntry);
						find = true;
						break;
					}
				}
				bundleNativeCode.setResolved(bundleNativeCode.isResolved() && find);
				bundleNativeCode.addFileReference(fileReference);
			}
		}
	}

	public void resolveExportPackage(
			Map<ExportPackage, List<String>> exportPackages,
			Map<ExportPackage, Bundle> bundles) {
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
				exportPackage.addExportPackageReference(reference);
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
						OSGiIntrospectorUtil.log(Level.INFO, reference
								+ " is not a valid package." + "\n"
								+ "Maybe the folder "
								+ reference.replace(".", "/")
								+ " doesn't contain class file or doesn't exist.", bundle);
						exportPackageMaybeUnvalid.add(exportPackage);
					}
					exportPackage.addExportPackageReference(reference);
					exportPackage.setResolved(exportPackage.isResolved() && find);
				}
			}
		}
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
				// Second research into Fragment
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
						OSGiIntrospectorUtil.log(Level.WARN, reference
								+ " is not a valid package." + "\n"
								+ "Maybe the folder "
								+ reference.replace(".", "/")
								+ " don't contain class file or doesn't exist.", bundle);
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
				// Second research into Fragment
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
						OSGiIntrospectorUtil.log(Level.WARN, reference
								+ " is not a valid package." + "\n"
								+ "Maybe the folder "
								+ reference.replace(".", "/")
								+ " don't contain class file or doesn't exist.", bundle);
						includePackageMaybeUnvalid.add(includePackage);
					}
				}
			}
		}
		// maybe useless
		for (IncludePackages includePackage : includePackageMaybeUnvalid) {
			if (includePackage.getPackages().size() == 0) {
				bundles.get(includePackage).getManifest().getBundleActivationPolicy().removeDirective(
						includePackage);
			}
		}	
	}

	public void resolveImportPackage(Map<ImportPackage, List<String>> importPackages, Map<ImportPackage, Bundle> bundles, Framework framework) {
		ServiceReference refs = context.getServiceReference(PackageAdmin.class.getName());
		if (refs != null) {
			PackageAdmin packageAdmin = (PackageAdmin)context.getService(refs);
			for (ImportPackage value : importPackages.keySet()) {
				for (String _packageString : importPackages.get(value)) {
					ExportedPackage[] exportedPackages = packageAdmin.getExportedPackages(_packageString);
					boolean find = false;
					for (ExportedPackage exportedPackage : exportedPackages) {
						org.osgi.framework.Bundle bundleOSGiExportingPackage = exportedPackage.getExportingBundle();
						
						Version version = ManifestFactory.eINSTANCE.createVersion();
						try {
							version.setVersionValue((String)bundleOSGiExportingPackage.getHeaders().get(Constants.BUNDLE_VERSION));
						} catch (BadVersionValue e) {
							version.setMajor(0);
							version.setMinor(0);
							version.setMicro(0);
						}
						
						Bundle bundleExportingPackage = framework.findBundle(bundleOSGiExportingPackage.getSymbolicName(),version);
						Package _package = bundleExportingPackage.getPackage().getPackage(_packageString);
						if (_package != null) {
							org.osgi.framework.Bundle[] bundlesOSGiImportingPackage = exportedPackage.getImportingBundles();
							for (org.osgi.framework.Bundle bundleOSGiImportingPackage : bundlesOSGiImportingPackage) {
								version = ManifestFactory.eINSTANCE.createVersion();
								try {
									version.setVersionValue((String)bundleOSGiImportingPackage.getHeaders().get(Constants.BUNDLE_VERSION));
								} catch (BadVersionValue e) {
									version.setMajor(0);
									version.setMinor(0);
									version.setMicro(0);
								}
								
								Bundle bundleImportingPackage = framework.findBundle(bundleOSGiImportingPackage.getSymbolicName(),version);
								if (bundles.get(value).equals(bundleImportingPackage)) {
									value.addPackage(_package);
									find = true;
									break;
								}
							}
							if (find) {
								break;
							}
						}
					}
					if (!find) {
						// TODO log importPackage pas trouvé
					}
					value.addPackageReference(_packageString);
				}
			}
		} else {
			// TODO log pas de packageAdmin donc pas de résolution dynamique
			super.resolveImportPackage(importPackages, bundles, framework);
		}
	}

	public void resolveExportService(Map<Service, String> services, Map<Service, Bundle> bundles) {
		List<Service> tmp = new ArrayList<Service>();
		// First we look for service into our owner packages and classes
		for (Service service : services.keySet()) {
			String serviceReference = services.get(service);
			Class element = bundles.get(service).getPackage().getClass(
					serviceReference);
			if (element != null) {
				service.setInterface(element);
			} else {
				tmp.add(service);
			}
			service.setInterfaceReference(serviceReference);
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
					for (Package _package : importPackage.getPackages()) {
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
			// maybe it's useless to save the unresolved Service
			Map<Service, Bundle> bundlesTmp = bundles;
			bundles = new HashMap<Service, Bundle>();
			
			Map<Service, String> servicesTmp = services;
			services = new HashMap<Service, String>();
			for (Service service : tmp1) {
				Bundle b = bundlesTmp.get(service);
				String s = servicesTmp.get(service);
				OSGiIntrospectorUtil.log(Level.WARN, "The export service reference "
						+ s + " is not resolved.", b);
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
		/*for (ImportService importedService : importServices.keySet()) {
			for (Service service : servicesAvailable) {
				importedService.setResolved(false);
				if (service.getInterfaceReference().equals(importServices.get(importedService))) {
					importedService.setService(service);
					importedService.setResolved(true);
				}
				importedService.setServiceReference(service.getInterfaceReference());
			}
		}*/
		
		
	}
	
	
	
}
