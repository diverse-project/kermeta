package fr.irisa.triskell.osgi.introspector.generator.resolver;

import jar.Class;
import jar.File;
import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import manifest.BundleActivator;
import manifest.ClassPath;
import manifest.ExportPackage;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.NativeCode;
import manifest.RequireBundle;
import manifest.Service;
import option.Uses;

import org.apache.log4j.Level;
import org.osgi.framework.Constants;

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
public class ResolverStaticWithSystemRepresentation implements Resolver {

	private OSGiIntrospectorUtil util;

	public ResolverStaticWithSystemRepresentation(OSGiIntrospectorUtil util) {
		this.util = util;
	}

	public void resolveRequireBundle(Map<RequireBundle, Bundle> requireBundles,
			Framework framework) {
		for (RequireBundle value : requireBundles.keySet()) {
			value.setResolved(false);

		}

	}

	/**
	 * This function is used to resolve all Fragment-Host entry into the
	 * framework.
	 */
	public void resolveFragmentHost(Framework framework,
			Map<Bundle, String> fragmentHosts) {
		for (Bundle fragment : fragmentHosts.keySet()) {
			fragment.getManifest().getFragmentHost().setReference(
					fragmentHosts.get(fragment));
			fragment.getManifest().getFragmentHost().setResolved(false);
		}
	}

	public void resolveBundleClassPath(Map<ClassPath, Bundle> classPaths) {
		for (ClassPath classPath : classPaths.keySet()) {
			String reference = classPath.getReference();
			Bundle bundle = classPaths.get(classPath);
			if (!reference.equals(".")) {
				SystemEntry systemEntry = bundle.getFolder()
						.getEntry(reference);
				if (systemEntry != null) {
					if (systemEntry instanceof Folder) {
						Package _package = util.convertToJavaElement(
								(Folder) systemEntry, false);
						if (_package == null) {
							_package = JarFactory.eINSTANCE.createPackage();
							_package.setName(systemEntry.getName());
							_package.setFullPath(systemEntry.getFullPath()
									.replace("/", "."));

						}
						bundle.getPackage().addPackage(_package);
						classPath.setEntry((Folder) systemEntry);
						classPath.setResolved(true);
					} else if (systemEntry instanceof File) {
						if (systemEntry.getName().endsWith(".jar")) {
							try {
								util.addEntriesFromJar(bundle,
										(File) systemEntry, bundle);
								util
										.updateClassPath(bundle.getFolder(),
												bundle);
								classPath.setEntry((File) systemEntry);
								classPath.setResolved(true);
							} catch (IOException e) {
								util.log(Level.WARN, "Unvalid "
										+ Constants.BUNDLE_CLASSPATH
										+ " entry :" + "\n"
										+ "IOException with "
										+ systemEntry.getFullPath() + ".",
										bundle);
								classPath.setResolved(false);

							}
						} else {
							util.log(Level.WARN, "Unvalid "
									+ Constants.BUNDLE_CLASSPATH + " entry :"
									+ "\n" + systemEntry.getFullPath()
									+ " is a file but is not a JAR file.",
									bundle);
							classPath.setResolved(false);

						}
					} else {
						util.log(Level.WARN, "Unvalid "
								+ Constants.BUNDLE_CLASSPATH + " entry :"
								+ "\n" + reference
								+ " must be a JAR file or a folder.", bundle);
						classPath.setResolved(false);
					}
				}
			} else if (reference.equals(".")) {
				for (SystemEntry entry : bundle.getFolder().getEntries()) {
					if (entry instanceof Folder) {
						Package _package = util.convertToJavaElement(
								(Folder) entry, false);
						if (_package != null) {
							bundle.getPackage().addPackage(_package);
						}
					} else if (entry.getName().endsWith(".class")) {
						Class clazz = JarFactory.eINSTANCE.createClass();
						clazz.setName(entry.getName().substring(0,
								entry.getName().indexOf(".class")));
						clazz.setFullPath(entry.getFullPath().replace(".class",
								""));
						bundle.getPackage().addClass(clazz);
					}
				}
				classPath.setEntry(bundle.getFolder());
				classPath.setResolved(true);
			} else {
				util.log(Level.WARN, "Unvalid " + Constants.BUNDLE_CLASSPATH
						+ " entry :" + "\n" + reference + " is unresolved.",
						bundle);
			}

		}
	}

	public void resolveBundleNativeCode(Map<NativeCode, Bundle> nativeCodes) {
		for (NativeCode nativeCode : nativeCodes.keySet()) {
			String reference = nativeCode.getReference();
			Bundle bundle = nativeCodes.get(nativeCode);
			SystemEntry systemEntry = bundle.getFolder().getEntry(reference);
			if (systemEntry != null && systemEntry instanceof File) {
				nativeCode.setFile((File) systemEntry);
				nativeCode.setResolved(true);
			} else if (systemEntry == null) {
				util.log(Level.WARN, "The " + Constants.BUNDLE_NATIVECODE
						+ " value doesn't exist." + "\n" + reference
						+ " is unvalid.", bundle);
			} else {
				util.log(Level.WARN, "The " + Constants.BUNDLE_NATIVECODE
						+ " value must be a file." + "\n" + reference
						+ " is not a file.", bundle);

			}
		}

	}

	/**
	 * This function is used to resolve all Export-Package entry.
	 */
	public void resolveExportPackage(
			Map<manifest.Package, Bundle> exportPackages) {
		for (manifest.Package exportPackage : exportPackages.keySet()) {
			String reference = exportPackage.getReference();
			Bundle bundle = exportPackages.get(exportPackage);

			Package _package = bundle.getPackage().getPackage(reference);
			if (_package != null) {
				exportPackage.setPackage(_package);
				exportPackage.setResolved(true);
			} else {
				// Second research into Fragment class path
				// But in Static way, the Fragments are not resolved
				exportPackage.setResolved(false);
			}
		}
	}

	public void resolveExportPackageExclude(
			Map<option.Class, ExportPackage> exportPackages,
			Map<ExportPackage, Bundle> bundles) {
		for (option.Class _class : exportPackages.keySet()) {
			List<Class> classes = new ArrayList<Class>();
			for (manifest.Package _package : exportPackages.get(_class)
					.getPackages()) {
				if (_package.isResolved()) {
					classes.addAll(_package.getPackage().getClassWithRegex(
							_class.getReference(), false));
				}
			}
			if (classes.size() > 0) {
				for (Class clazz : classes) {
					_class.addClass(clazz);
				}
				_class.setResolved(true);
			} else {
				util
						.log(
								Level.WARN,
								_class.getReference()
										+ " into exclude directives of Export-Package were not found",
								bundles.get(exportPackages.get(_class)));
			}
		}
	}

	public void resolveExportPackageInclude(
			Map<option.Class, ExportPackage> exportPackages,
			Map<ExportPackage, Bundle> bundles) {
		for (option.Class _class : exportPackages.keySet()) {
			List<Class> classes = new ArrayList<Class>();
			for (manifest.Package _package : exportPackages.get(_class)
					.getPackages()) {
				if (_package.isResolved()) {
					classes.addAll(_package.getPackage().getClassWithRegex(
							_class.getReference(), false));
				}
			}
			if (classes.size() > 0) {
				for (Class clazz : classes) {
					_class.addClass(clazz);
				}
				_class.setResolved(true);
			} else {
				util
						.log(
								Level.WARN,
								_class.getReference()
										+ " into include directives of Export-Package were not found",
								bundles.get(exportPackages.get(_class)));
			}
		}
	}

	public void resolveActivator(Map<BundleActivator, Bundle> activators) {
		for (BundleActivator value : activators.keySet()) {
			Class element = activators.get(value).getPackage().getClass(
					value.getReference());
			if (element != null) {
				value.setActivator(element);
			} else {
				util.log(Level.WARN, "The activator reference "
						+ value.getReference() + " is not valid.", activators
						.get(value));
				activators.get(value).getManifest().setBundleActivator(null);
			}
		}
	}

	public void resolveActivationPolicyExclude(
			Map<option.Package, Bundle> activationPolicies) {
		for (option.Package excludePackage : activationPolicies.keySet()) {
			String reference = excludePackage.getReference();
			Bundle bundle = activationPolicies.get(excludePackage);
			// First research into local class path
			Package _package = bundle.getPackage().getPackage(reference);
			if (_package != null) {
				excludePackage.setPackage(_package);
			} else {
				// Second research into Fragment class path
				// But fragments are not resolved
			}
		}

	}

	public void resolveActivationPolicyInclude(
			Map<option.Package, Bundle> activationPolicies) {
		for (option.Package includePackage : activationPolicies.keySet()) {
			String reference = includePackage.getReference();
			Bundle bundle = activationPolicies.get(includePackage);
			// First research into local class path
			Package _package = bundle.getPackage().getPackage(reference);
			if (_package != null) {
				includePackage.setPackage(_package);
			} else {
				// Second research into Fragment class path
				// But fragments are not resolved
			}
		}
	}

	public void resolveImportPackage(Map<ImportPackage, Bundle> importPackages,
			Framework framework) {
		for (ImportPackage value : importPackages.keySet()) {
			value.setResolved(false);

		}

	}

	public void resolveExportService(Map<Service, Bundle> services) {
		for (Service service : services.keySet()) {
			Bundle bundle = services.get(service);
			String reference = service.getReference();
			Class element = bundle.getPackage().getClass(reference);
			if (element != null) {
				service.setInterface(element);
				service.setResolved(true);
			} else {
				util.log(Level.WARN, "The export service reference "
						+ reference + " is not resolved.", bundle);
			}
			// }
		}
	}

	public void resolveExportPackageUses(Map<Uses, List<String>> uses,
			Map<Uses, Bundle> bundles) {
		for (Uses value : uses.keySet()) {
			for (String _package : uses.get(value)) {
				value.addPackage(_package);
			}
		}
	}

	public void resolveImportService(Map<ImportService, Bundle> services,
			List<Service> servicesAvailable) {
		for (ImportService importedService : services.keySet()) {
			for (Service service : servicesAvailable) {
				importedService.setResolved(false);
				if (service.isResolved()
						&& service.getReference()
								.equals(service.getReference())) {
					importedService.setService(service);
					importedService.setResolved(true);
				}
			}
		}
	}
}
