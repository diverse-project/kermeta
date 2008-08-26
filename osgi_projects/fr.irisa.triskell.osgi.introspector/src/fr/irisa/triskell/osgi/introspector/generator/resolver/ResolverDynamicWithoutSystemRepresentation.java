package fr.irisa.triskell.osgi.introspector.generator.resolver;

import java.util.List;
import java.util.Map;

import manifest.BadVersionValueException;
import manifest.BundleActivator;
import manifest.ClassPath;
import manifest.ExportPackage;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.ManifestFactory;
import manifest.NativeCode;
import manifest.RequireBundle;
import manifest.Service;
import manifest.Version;
import option.AttributEntry;
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
public class ResolverDynamicWithoutSystemRepresentation implements Resolver {

	/**
	 * {@link BundleContext} is used to interact with the OSGi platform.
	 */
	private BundleContext context;
	private OSGiIntrospectorUtil util;
	private ResolverStaticWithoutSystemRepresentation resolverStatic;

	/**
	 * The constructor of this class
	 * 
	 * @param context
	 *            the {@link BundleContext} which is used to get access to all
	 *            {@link BundleContext} and {@link ServiceReference} into the
	 *            OSGi framework
	 */
	public ResolverDynamicWithoutSystemRepresentation(BundleContext context,
			OSGiIntrospectorUtil util) {
		this.resolverStatic = new ResolverStaticWithoutSystemRepresentation(
				util);
		this.context = context;
		this.util = util;
	}

	public void resolveRequireBundle(Map<RequireBundle, Bundle> requireBundles,
			Framework framework) {
		ServiceReference refs = context.getServiceReference(PackageAdmin.class
				.getName());
		if (refs != null) {
			PackageAdmin packageAdmin = (PackageAdmin) context.getService(refs);
			for (RequireBundle requirebundle : requireBundles.keySet()) {
				RequiredBundle[] requiredBundlesOSGi = packageAdmin
						.getRequiredBundles(requirebundle.getReference());
				if (requiredBundlesOSGi != null) {
					for (RequiredBundle requiredbundleOSGi : requiredBundlesOSGi) {
						org.osgi.framework.Bundle bundle = requiredbundleOSGi
								.getBundle();

						Version v = ManifestFactory.eINSTANCE.createVersion();
						try {
							v.setVersionValue((String) bundle.getHeaders().get(
									Constants.BUNDLE_VERSION));
						} catch (BadVersionValueException e) {
							v.setMajor(0);
							v.setMinor(0);
							v.setMicro(0);
						}
						String versionRange = null;
						for (AttributEntry option : requirebundle.getOptions()) {
							if (option.getToken().equals(
									Constants.BUNDLE_VERSION_ATTRIBUTE)) {
								versionRange = option.getValue();
								break;
							}
						}
						try {
							if (v.containsInto(versionRange)) {
								Bundle requireBundle = framework
										.getBundle(bundle.getBundleId());
								if (requireBundle != null) {
									requirebundle.setBundle(requireBundle);
									requirebundle.setResolved(true);
									break;
								}
							}
						} catch (BadVersionValueException e) {
							util.log(Level.WARN, e.getMessage(), requireBundles
									.get(requirebundle));
						}
					}
					if (requirebundle.getBundle() == null) {
						util
								.log(
										Level.ERROR,
										"There is a bundle ("
												+ requirebundle.getReference()
												+ ") define on the OSGi platform but not define into my representation",
										null);
					}
				} else {
					boolean optional = false;
					for (RequireBundleDirective directive : requirebundle
							.getDirectives()) {
						if (directive instanceof Resolution
								&& ((Resolution) directive).getResolution()
										.equals(ResolutionEnum.OPTIONAL)) {
							util.log(Level.INFO, requirebundle.getReference()
									+ " is not resolved but this "
									+ Constants.REQUIRE_BUNDLE
									+ " entry is optional.", requireBundles
									.get(requirebundle));
							optional = true;
							break;
						}
					}
					if (!optional) {
						util.log(Level.WARN, requirebundle.getReference()
								+ " is not resolved.", requireBundles
								.get(requirebundle));
					}
				}
			}
		} else {
			util
					.log(
							Level.INFO,
							"There are not PackageAdmin service registered now into the OSGi platform so the resolution of "
									+ Constants.REQUIRE_BUNDLE
									+ " is only static.", null);
			resolverStatic.resolveRequireBundle(requireBundles, framework);
		}

	}

	public void resolveFragmentHost(Framework framework,
			Map<Bundle, String> fragmentHosts) {
		// super.resolveFragmentHost(framework, fragmentHosts);
		ServiceReference refs = context.getServiceReference(PackageAdmin.class
				.getName());
		if (refs != null) {
			for (Bundle fragment : fragmentHosts.keySet()) {

				PackageAdmin packageAdmin = (PackageAdmin) context
						.getService(refs);
				String versionRange = null;
				for (AttributEntry option : fragment.getManifest()
						.getFragmentHost().getOptions()) {
					if (option.getToken().equals(
							Constants.BUNDLE_VERSION_ATTRIBUTE)) {
						versionRange = option.getValue();
						break;
					}
				}
				org.osgi.framework.Bundle[] hosts = packageAdmin.getBundles(
						fragmentHosts.get(fragment), versionRange);
				if (hosts != null) {
					Version v = ManifestFactory.eINSTANCE.createVersion();
					try {
						v.setVersionValue((String) hosts[0].getHeaders().get(
								Constants.BUNDLE_VERSION));
					} catch (BadVersionValueException e) {
						v.setMajor(0);
						v.setMinor(0);
						v.setMicro(0);
					}
					Bundle host = framework.getBundle(hosts[0].getBundleId());
					host.addFragment(fragment);
					fragment.getManifest().getFragmentHost().setBundle(host);
				} else {
					util
							.log(
									Level.ERROR,
									"There is a bundle define into the OSGi platform but not define in my representation.\n"
											+ fragmentHosts.get(fragment),
									fragment);
				}
				fragment.getManifest().getFragmentHost().setReference(
						fragmentHosts.get(fragment));
			}
		} else {
			util
					.log(
							Level.INFO,
							"There are not PackageAdmin service registered now into the OSGi platform so the resolution of "
									+ Constants.FRAGMENT_HOST
									+ " is only static.", null);
			resolverStatic.resolveFragmentHost(framework, fragmentHosts);
		}
	}

	public void resolveBundleClassPath(Map<ClassPath, Bundle> classPaths) {
		for (ClassPath classPath : classPaths.keySet()) {
			Bundle bundle = classPaths.get(classPath);
			String reference = classPath.getReference();

			boolean referenceFind = false;
			if (!reference.equals(".")) {
				int find = util.entryExist(reference, bundle);
				if ((find == 0 && reference.endsWith(".jar")) || find == 1) {
					referenceFind = true;
				} else {
					for (Bundle fragment : bundle.getFragments()) {
						find = util.entryExist(reference, fragment);
						if ((find == 0 && reference.endsWith(".jar"))
								|| find == 1) {
							referenceFind = true;
							break;
						}
					}
				}
			} else {
				referenceFind = true;
			}
			classPath.setResolved(referenceFind);

			/*
			 * if (systemRepresentation && classPath.isResolved()) { if
			 * (!reference.equals(".")) { SystemEntry systemEntry =
			 * bundle.getFolder().getEntry( reference); if (systemEntry != null) {
			 * if (systemEntry instanceof Folder) { Package _package =
			 * util.convertToJavaElement( (Folder) systemEntry, false); if
			 * (_package == null) { _package =
			 * JarFactory.eINSTANCE.createPackage();
			 * _package.setName(systemEntry.getName());
			 * _package.setFullPath(systemEntry.getFullPath().replace("/",
			 * "."));
			 *  } bundle.getPackage().addPackage(_package);
			 * classPath.setEntry((Folder) systemEntry);
			 * classPath.setResolved(true); } else if (systemEntry instanceof
			 * File) { if (systemEntry.getName().endsWith(".jar")) { try {
			 * util.addEntriesFromJar(bundle, (File) systemEntry, bundle);
			 * util.updateClassPath(bundle.getFolder(), bundle);
			 * classPath.setEntry((File) systemEntry);
			 * classPath.setResolved(true); } catch (IOException e) {
			 * util.log(Level.WARN, "Unvalid " + Constants.BUNDLE_CLASSPATH + "
			 * entry :" + "\n" + "IOException with " + systemEntry.getFullPath() +
			 * ".", bundle); classPath.setResolved(false);
			 *  } } else { // must not appear util.log(Level.WARN, "Unvalid " +
			 * Constants.BUNDLE_CLASSPATH + " entry :" + "\n" +
			 * systemEntry.getFullPath() + " is a file but is not a JAR file.",
			 * bundle); classPath.setResolved(false);
			 *  } } else { // must not appear util.log(Level.WARN, "Unvalid " +
			 * Constants.BUNDLE_CLASSPATH + " entry :" + "\n" + reference + "
			 * must be a JAR file or a folder.", bundle);
			 * classPath.setResolved(false); } } else { for (Bundle fragment :
			 * bundle.getFragments()) { systemEntry =
			 * fragment.getFolder().getEntry( classPath.getReference()); if
			 * (systemEntry != null) { if (systemEntry instanceof Folder) {
			 * Package _package = util .convertToJavaElement( (Folder)
			 * systemEntry, true); if (_package == null) { _package =
			 * JarFactory.eINSTANCE.createPackage();
			 * _package.setName(systemEntry.getName());
			 * _package.setFullPath(systemEntry.getFullPath().replace("/",
			 * "."));
			 *  } bundle.getPackage().addPackage(_package);
			 * classPath.setEntry((Folder) systemEntry);
			 * classPath.setResolved(true); } else if (systemEntry instanceof
			 * File) { if (systemEntry.getName().endsWith(".jar")) { try {
			 * util.addEntriesFromJar(bundle, (File) systemEntry, fragment);
			 * util.updateClassPath(bundle .getFolder(), bundle); classPath
			 * .setEntry((File) systemEntry); classPath.setResolved(true); }
			 * catch (IOException e) { util .log( Level.ERROR, "Unvalid " +
			 * Constants.BUNDLE_CLASSPATH + " entry :" + "\n" + "IOException
			 * with " + systemEntry .getFullPath() + ".", bundle);
			 *  } } else { util .log( Level.ERROR, "Unvalid " +
			 * Constants.BUNDLE_CLASSPATH + " entry :" + "\n" + systemEntry
			 * .getFullPath() + " is a file but is not a JAR file.", bundle);
			 *  } } else { util .log( Level.ERROR, "Unvalid " +
			 * Constants.BUNDLE_CLASSPATH + " entry :" + "\n" + classPath
			 * .getReference() + " must be a JAR file or a folder.", bundle); }
			 * util .updateClassPath(bundle.getFolder(), bundle); break; } } } }
			 * else if (reference.equals(".")) { for (SystemEntry entry :
			 * bundle.getFolder().getEntries()) { if (entry instanceof Folder) {
			 * Package _package = util.convertToJavaElement( (Folder) entry,
			 * false); if (_package != null) {
			 * bundle.getPackage().addPackage(_package); } } else if
			 * (entry.getName().endsWith(".class")) { Class clazz =
			 * JarFactory.eINSTANCE.createClass();
			 * clazz.setName(entry.getName().substring(0,
			 * entry.getName().indexOf(".class")));
			 * clazz.setFullPath(entry.getFullPath().replace( ".class", ""));
			 * bundle.getPackage().addClass(clazz); } }
			 * classPath.setEntry(bundle.getFolder());
			 * classPath.setResolved(true); } else { util.log(Level.WARN,
			 * "Unvalid " + Constants.BUNDLE_CLASSPATH + " entry :" + "\n" +
			 * reference + " is unresolved. (must not appears).", bundle);
			 * classPath.setResolved(false); } }
			 */
		}
	}

	public void resolveBundleNativeCode(Map<NativeCode, Bundle> nativeCodes) {
		for (NativeCode nativeCode : nativeCodes.keySet()) {
			String reference = nativeCode.getReference();
			Bundle bundle = nativeCodes.get(nativeCode);
			boolean referenceFind = false;
			int find = util.entryExist(reference, bundle);
			if (find == 0) {
				referenceFind = true;
			} else {
				for (Bundle fragment : nativeCodes.get(nativeCode)
						.getFragments()) {
					find = util.entryExist(nativeCode.getReference(), fragment);
					if (find == 0) {
						referenceFind = true;
						break;
					}
				}
				nativeCode.setResolved(referenceFind);
			}
			nativeCode.setResolved(referenceFind);
		}
	}

	public void resolveExportPackage(
			Map<manifest.Package, Bundle> exportPackages) {
		for (manifest.Package exportPackage : exportPackages.keySet()) {
			Bundle bundle = exportPackages.get(exportPackage);
			String reference = exportPackage.getReference();
			if (util.javaElementExist(reference, exportPackages
					.get(exportPackage))) {
				exportPackage.setResolved(true);
			} else {
				util.log(Level.INFO, exportPackage.getReference()
						+ " is not a valid package." + "\n"
						+ "Maybe the folder "
						+ exportPackage.getReference().replace(".", "/")
						+ " doesn't exist.", bundle);
			}

		}
	}

	public void resolveExportPackageExclude(
			Map<option.Class, ExportPackage> exportPackages,
			Map<ExportPackage, Bundle> bundles) {
		// TODO Que faut-il faire dans le cas ou il n'y a pas la représentation
		// des packages et des classes ainsi que des file et des folder

	}

	public void resolveExportPackageInclude(
			Map<option.Class, ExportPackage> exportPackages,
			Map<ExportPackage, Bundle> bundles) {
		// TODO Que faut-il faire dans le cas ou il n'y a pas la représentation
		// des packages et des classes ainsi que des file et des folder
	}

	public void resolveActivator(Map<BundleActivator, Bundle> activators) {
		resolverStatic.resolveActivator(activators);

	}

	public void resolveActivationPolicyExclude(
			Map<option.Package, Bundle> activationPolicies) {
		for (option.Package excludePackage : activationPolicies.keySet()) {
			Bundle bundle = activationPolicies.get(excludePackage);
			String reference = excludePackage.getReference();
			if (util.javaElementExist(reference, bundle)) {
				excludePackage.setResolved(true);
			} else {
				util
						.log(
								Level.WARN,
								reference
										+ " is not a valid package."
										+ "\n"
										+ "Maybe the folder "
										+ reference.replace(".", "/")
										+ " don't contain class file or doesn't exist.",
								bundle);
			}
		}

	}

	public void resolveActivationPolicyInclude(
			Map<option.Package, Bundle> activationPolicies) {
		for (option.Package includePackage : activationPolicies.keySet()) {
			Bundle bundle = activationPolicies.get(includePackage);
			String reference = includePackage.getReference();
			if (util.javaElementExist(reference, bundle)) {
				includePackage.setResolved(true);
			} else {
				util
						.log(
								Level.WARN,
								reference
										+ " is not a valid package."
										+ "\n"
										+ "Maybe the folder "
										+ reference.replace(".", "/")
										+ " don't contain class file or doesn't exist.",
								bundle);
			}
		}
	}

	public void resolveImportPackage(Map<ImportPackage, Bundle> importPackages,
			Framework framework) {
		ServiceReference refs = context.getServiceReference(PackageAdmin.class
				.getName());
		if (refs != null) {
			PackageAdmin packageAdmin = (PackageAdmin) context.getService(refs);
			for (ImportPackage value : importPackages.keySet()) {
				value.setResolved(true);
				for (String _packageString : value.getPackageReferences()) {
					ExportedPackage[] exportedPackages = packageAdmin
							.getExportedPackages(_packageString);
					if (exportedPackages != null) {
						boolean find = false;
						for (ExportedPackage exportedPackage : exportedPackages) {
							org.osgi.framework.Bundle bundleOSGiExportingPackage = exportedPackage
									.getExportingBundle();
							if (bundleOSGiExportingPackage.getState() == org.osgi.framework.Bundle.RESOLVED
									|| bundleOSGiExportingPackage.getState() == org.osgi.framework.Bundle.ACTIVE) {
								Version version = ManifestFactory.eINSTANCE
										.createVersion();
								try {
									version
											.setVersionValue((String) bundleOSGiExportingPackage
													.getHeaders()
													.get(
															Constants.BUNDLE_VERSION));
								} catch (BadVersionValueException e) {
									version.setMajor(0);
									version.setMinor(0);
									version.setMicro(0);
								}

								Bundle bundleExportingPackage = framework
										.getBundle(bundleOSGiExportingPackage
												.getBundleId());
								if (value.getBundle() == null
										|| bundleOSGiExportingPackage
												.getSymbolicName()
												.equals(
														value
																.getBundle()
																.getManifest()
																.getBundleSymbolicName()
																.getSymbolicName())) {
									manifest.Package _package = null;
									for (ExportPackage exportPackage : bundleExportingPackage
											.getManifest().getExportPackages()) {
										for (manifest.Package tmp : exportPackage
												.getPackages()) {
											if (tmp.getReference().equals(
													_packageString)) {
												_package = tmp;
												break;
											}
										}
										if (_package != null) {
											break;
										}
									}
									if (_package != null) {
										org.osgi.framework.Bundle[] bundlesOSGiImportingPackage = exportedPackage
												.getImportingBundles();
										for (org.osgi.framework.Bundle bundleOSGiImportingPackage : bundlesOSGiImportingPackage) {
											version = ManifestFactory.eINSTANCE
													.createVersion();
											try {
												version
														.setVersionValue((String) bundleOSGiImportingPackage
																.getHeaders()
																.get(
																		Constants.BUNDLE_VERSION));
											} catch (BadVersionValueException e) {
												version.setMajor(0);
												version.setMinor(0);
												version.setMicro(0);
											}

											Bundle bundleImportingPackage = framework
													.getBundle(bundleOSGiImportingPackage
															.getBundleId());
											if (importPackages
													.get(value)
													.equals(
															bundleImportingPackage)) {
												// We did not check the attribute
												// version
												// because we use the OSGi
												// framework
												// to
												// find the bundle so this check
												// is
												// already done
												value.addPackage(_package);
												value.setBundle(bundleExportingPackage);
												find = true;
												break;
											}
										}
										if (find) {
											value.setResolved(value
													.isResolved() && true);
											break;
										} else {
											value.setResolved(false);
										}
									}
								}
							}
						}
						if (!find) {
							util.log(Level.WARN,
									"There are no valid package exported on the OSGi platform for "
											+ _packageString, importPackages
											.get(importPackages));
							value.setResolved(false);
						}
					} else {
						util.log(Level.WARN,
								"There are no package exported on the OSGi platform for "
										+ _packageString, importPackages
										.get(importPackages));

						value.setResolved(false);
					}
				}
			}
		} else {
			util
					.log(
							Level.INFO,
							"There are not PackageAdmin service registered now into the OSGi platform so the resolution of "
									+ Constants.IMPORT_PACKAGE
									+ " is only static.", null);
			resolverStatic.resolveImportPackage(importPackages, framework);
		}
	}

	public void resolveExportService(Map<Service, Bundle> services) {
		// First we look for service into our owner packages and classes
		for (Service service : services.keySet()) {
			Bundle bundle = services.get(service);
			String serviceReference = service.getReference();

			if (util.javaElementExist(serviceReference, bundle)) {
				service.setResolved(true);
			} else {
				// Then we look for into Require-Bundle
				for (RequireBundle requireBundle : bundle.getManifest()
						.getRequireBundles()) {
					if (requireBundle.isResolved()
							&& util.javaElementExist(serviceReference,
									requireBundle.getBundle())) {
						service.setResolved(true);
						break;
					}
				}
				if (!service.isResolved()) {
					// Finally we look for service into Import-Package
					for (ImportPackage importPackage : bundle.getManifest()
							.getImportPackages()) {
						if (importPackage.isResolved()) {
							for (manifest.Package _package : importPackage
									.getPackages()) {
								String reference = _package.getReference();
								if (serviceReference.contains(reference)) {
									if (util.javaElementExist(serviceReference,
											importPackage.getBundle())) {
										service.setResolved(true);
									}
								}
								if (service.isResolved()) {
									break;
								}
							}
						}
						if (service.isResolved()) {
							break;
						}
					}
					if (!service.isResolved()) {
						util.log(Level.WARN, "The export service reference "
								+ serviceReference + " is not resolved.",
								bundle);
					}
				}
			}
		}
	}

	public void resolveExportPackageUses(Map<Uses, List<String>> uses,
			Map<Uses, Bundle> bundles) {
		resolverStatic.resolveExportPackageUses(uses, bundles);
	}

	public void resolveImportService(Map<ImportService, Bundle> importServices,
			List<Service> servicesAvailable) {
		resolverStatic.resolveImportService(importServices, servicesAvailable);

	}

}
