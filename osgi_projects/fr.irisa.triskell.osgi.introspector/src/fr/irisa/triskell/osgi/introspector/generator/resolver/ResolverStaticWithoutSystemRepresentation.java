package fr.irisa.triskell.osgi.introspector.generator.resolver;

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
public class ResolverStaticWithoutSystemRepresentation implements Resolver {

	private OSGiIntrospectorUtil util;

	public ResolverStaticWithoutSystemRepresentation(OSGiIntrospectorUtil util) {
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
			if (!reference.toString().equals(".")) {
				int find = util.entryExist(reference, bundle);
				// is a file or a folder
				if ((find == 0 && reference.endsWith(".jar")) || find == 1) {
					classPath.setResolved(true);
					// is not found
				} else if (find == -1) {
					// Second research into Fragment class path
					// But in Static way, the Fragments are not resolved
					classPath.setResolved(false);
				}
			} else if (reference.equals(".")) {
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
			int find = util.entryExist(reference, bundle);
			// is a file
			if (find == 0) {
				nativeCode.setResolved(true);
				// is not found
			} else if (find == -1) {
				util
						.log(
								Level.INFO,
								reference
										+ " is unresolved.\n Maybe this "
										+ Constants.BUNDLE_NATIVECODE
										+ " comes from Fragment but with the Static Resolver, the Fragments are not resolved.",
								bundle);
				// is a folder
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

			if (util.javaElementExist(reference, bundle)) {
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
		for (BundleActivator value : activators.keySet()) {
			if (util.javaElementExist(value.getReference(), activators
					.get(value))) {
				value.setResolved(true);
			} else {
				util.log(Level.WARN, "The activator reference "
						+ value.getReference() + " is not valid.", activators
						.get(value));
				value.setResolved(false);
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
				excludePackage.setResolved(false);
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

				includePackage.setResolved(false);
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
