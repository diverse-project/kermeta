package fr.irisa.triskell.osgi.introspector.generator;

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
public class ResolverStatic implements Resolver {

	private OSGiIntrospectorUtil util;
	private boolean systemRepresentation;

	public ResolverStatic(OSGiIntrospectorUtil util,
			boolean systemRepresentation) {
		this.util = util;
		this.systemRepresentation = systemRepresentation;
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
			if (!reference.toString().equals(".")) {
				int find = util.entryExist(reference, bundle);
				// is a file or a folder
				if ((find == 0 && reference.endsWith(".jar")) || find == 1) {
					classPath.setResolved(true);
					// is not found
				} else if (find == -1) {
					// TODO log dire que c'est peut-être dans fragment mais
					// que static
				}
			} else if (reference.equals(".")) {
				classPath.setResolved(true);
			} else {
				util.log(Level.WARN,
					"Unvalid " + Constants.BUNDLE_CLASSPATH
					+ " entry :" + "\n" + reference
					+ " is unresolved. (must not appears).",
					bundle);
			}
			
			
			
			if (this.systemRepresentation && classPath.isResolved()) {
				if (!reference.equals(".")) {
					SystemEntry systemEntry = bundle.getFolder().getEntry(
							reference);
					if (systemEntry != null) {
						if (systemEntry instanceof Folder) {
							Package _package = util.convertToJavaElement(
									(Folder) systemEntry, false);
							if (_package != null) {
								bundle.getPackage().addPackage(_package);
							} else {
								// TODO c'est seulement un dossier contenant des
								// ressources
							}
							classPath.setEntry((Folder) systemEntry);
							classPath.setResolved(true);
						} else if (systemEntry instanceof File) {
							if (systemEntry.getName().endsWith(".jar")) {
								try {
									util.addEntriesFromJar(bundle,
											(File) systemEntry, bundle);
									util.updateClassPath(bundle.getFolder(), bundle);
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
								// TODO ne doit pas apparaitre
								util.log(Level.WARN, "Unvalid "
										+ Constants.BUNDLE_CLASSPATH
										+ " entry :" + "\n"
										+ systemEntry.getFullPath()
										+ " is a file but is not a JAR file.",
										bundle);
								classPath.setResolved(false);

							}
						} else {
							// TODO ne doit pas apparaitre 
							util.log(Level.WARN, "Unvalid "
									+ Constants.BUNDLE_CLASSPATH + " entry :"
									+ "\n" + reference
									+ " must be a JAR file or a folder.",
									bundle);
							classPath.setResolved(false);
						}
					} else {
						// TODO ne doit pas apparaitre
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
							clazz.setFullPath(entry.getFullPath().replace(
									".class", ""));
							bundle.getPackage().addClass(clazz);
						}
					}
					classPath.setEntry(bundle.getFolder());
					classPath.setResolved(true);
				} else {
					// TODO ne doit pas apparaitre
					util.log(Level.WARN,
							"Unvalid " + Constants.BUNDLE_CLASSPATH
									+ " entry :" + "\n" + reference
									+ " is unresolved. (must not appears).",
							bundle);
				}
			}
			
			
		}
	}

	public void resolveBundleNativeCode(Map<NativeCode, Bundle> nativeCodes) {
		for (NativeCode nativeCode : nativeCodes.keySet()) {
			String reference = nativeCode.getReference();
			Bundle bundle = nativeCodes.get(nativeCode);
				int find = util.entryExist(reference, bundle);
				// is a file
				if (find == 0) {
					nativeCode.setResolved(true);
					// is not found
				} else if (find == -1) {
					// TODO log bundle nativecode pas trouvé, peut-être dans
					// fragment mais static
					// is a folder
				} else {
					util.log(Level.WARN, "The " + Constants.BUNDLE_NATIVECODE
							+ " value must be a file." + "\n" + reference
							+ " is not a file.", bundle);
				}
				if (this.systemRepresentation && nativeCode.isResolved()) {
					SystemEntry systemEntry = bundle.getFolder()
							.getEntry(reference);
					if (systemEntry != null && systemEntry instanceof File) {
						nativeCode.setFile((File) systemEntry);
						nativeCode.setResolved(true);
					} else if (systemEntry == null) {
						// TODO ne doit pas apparaitre
					} else {
						// TODO ne doit pas apparaitre
						util.log(Level.WARN, "The " + Constants.BUNDLE_NATIVECODE
								+ " value must be a file." + "\n" + reference
								+ " is not a file.", bundle);

					}
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
		
				if (util.javaElementExist(reference, bundle)) {
					exportPackage.setResolved(true);
				} else {
					// Second research into Fragment class path
					// But in Static way, the Fragments are not resolved
					// TODO log
					exportPackage.setResolved(false);
				}
				if (systemRepresentation && exportPackage.isResolved()) {
					// First research into local class path
					Package _package = bundle.getPackage().getPackage(reference);
					if (_package != null) {
						exportPackage.setPackage(_package);
						exportPackage.setResolved(true);
					} else {
						// Second research into Fragment class path
						// But in Static way, the Fragments are not resolved
						// TODO ne doit pas apparaitre
						exportPackage.setResolved(false);
					}
				}
		}
	}

	public void resolveExportPackageExclude(
			Map<option.Class, ExportPackage> exportPackages) {
		for (option.Class _class : exportPackages.keySet()) {
			if (systemRepresentation) {
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
					// FIXME il faut le bundle contenant le Export-Package
					util
							.log(
									Level.WARN,
									_class.getReference()
											+ " into exclude directives of Export-Package were not found",
									null);
				}

			} else {
				// TODO
			}
		}
	}

	public void resolveExportPackageInclude(
			Map<option.Class, ExportPackage> exportPackages) {
		for (option.Class _class : exportPackages.keySet()) {
			if (systemRepresentation) {
				List<Class> classes = new ArrayList<Class>();
				for (manifest.Package _package : exportPackages.get(_class)
						.getPackages()) {
					if (_package.isResolved()) {
						classes.addAll(_package.getPackage().getClassWithRegex(
								_class.getReference(), false));
						/*
						 * for (Package _package : _p.getPackages()) {
						 * classes.addAll(_package.getClassWithRegex(value)); }
						 */
					}
				}
				if (classes.size() > 0) {
					for (Class clazz : classes) {
						_class.addClass(clazz);
					}
					_class.setResolved(true);
				} else {
					// FIXME il faut le bundle contenant le Export-Package
					util
							.log(
									Level.WARN,
									_class.getReference()
											+ " into include directives of Export-Package were not found",
									null);
				}
			} else {
				// TODO
			}
		}
	}

	public void resolveActivator(Map<BundleActivator, Bundle> activators) {
		for (BundleActivator value : activators.keySet()) {
				if (util.javaElementExist(value.getReference(), activators
						.get(value))) {
					value.setResolved(true);
				} else {
					util.log(Level.WARN, "The activator reference "
							+ value.getReference() + " is not valid.",
							activators.get(value));
					value.setResolved(false);
				}
				if (systemRepresentation && value.isResolved()) {
					Class element = activators.get(value).getPackage().getClass(
							value.getReference());
					if (element != null) {
						value.setActivator(element);
					} else {
						// TODO ne doit pas apparaitre
						util.log(Level.WARN, "The activator reference "
								+ value.getReference() + " is not valid.",
								activators.get(value));
						activators.get(value).getManifest()
								.setBundleActivator(null);
					}
				}
		}
	}

	public void resolveActivationPolicyExclude(
			Map<option.Package, Bundle> activationPolicies) {
		for (option.Package excludePackage : activationPolicies.keySet()) {
			String reference = excludePackage.getReference();
			Bundle bundle = activationPolicies.get(excludePackage);
				if (util.javaElementExist(reference, bundle)) {
					excludePackage.setResolved(true);
				} else {
					// Second research into Fragment class path
					// But fragments are not resolved
					// TODO log
				}
				if (systemRepresentation && excludePackage.isResolved()) {
					// First research into local class path
					Package _package = bundle.getPackage().getPackage(reference);
					if (_package != null) {
						excludePackage.setPackage(_package);
					} else {
						// Second research into Fragment class path
						// But fragments are not resolved
						// TODO ne doit pas apparaitre
					}
				}
		}

	}

	public void resolveActivationPolicyInclude(
			Map<option.Package, Bundle> activationPolicies) {
		for (option.Package includePackage : activationPolicies.keySet()) {
			String reference = includePackage.getReference();
			Bundle bundle = activationPolicies.get(includePackage);
				if (util.javaElementExist(reference, bundle)) {
					includePackage.setResolved(true);
				} else {
					// Second research into Fragment class path
					// But fragments are not resolved
					// TODO log
				}
				if (systemRepresentation && includePackage.isResolved()) {
					// First research into local class path
					Package _package = bundle.getPackage().getPackage(reference);
					if (_package != null) {
						includePackage.setPackage(_package);
					} else {
						// Second research into Fragment class path
						// But fragments are not resolved
						// TODO ne doit pas apparaitre
					}
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
				if (util.javaElementExist(reference, bundle)) {
					service.setResolved(true);
				} else {
					service.setResolved(false);
					util.log(Level.WARN, "The export service reference "
							+ reference + " is not resolved.", bundle);
				}
				if (systemRepresentation && service.isResolved()) {
					Class element = bundle.getPackage().getClass(reference);
					if (element != null) {
						service.setInterface(element);
						service.setResolved(true);
					} else {
						// TODO ne doit pas apparaitre
						util.log(Level.WARN, "The export service reference "
								+ reference + " is not resolved.", bundle);
					}
				}
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
