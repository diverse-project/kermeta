package fr.irisa.triskell.osgi.introspector;

import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.osgi.framework.BundleContext;

import fr.irisa.triskell.osgi.introspector.generator.Parser;
import fr.irisa.triskell.osgi.introspector.generator.Resolver;
import fr.irisa.triskell.osgi.introspector.generator.ResolverDynamic;
import framework.Bundle;
import framework.Framework;
import framework.FrameworkFactory;

public class OSGiIntrospectorDynamic {

	private BundleContext context;
	private Parser parser;
	private Map<Bundle, String> log;
	private Framework framework;

	private boolean introspectionWithoutError;

	public OSGiIntrospectorDynamic(BundleContext context) {
		this.context = context;
	}

	public void introspect(String XMIFilePath) {
		this.framework = FrameworkFactory.eINSTANCE.createFramework();
		this.log = new HashMap<Bundle, String>();
		this.parser = new Parser(log);
		OSGiIntrospectorUtil.log(Level.INFO, "Introspection launched");
		boolean validGeneration = true;
		for (org.osgi.framework.Bundle bundle : this.context.getBundles()) {
			// do not include this bundle in the processing
			if (!bundle.getSymbolicName().contains(context.getBundle().getSymbolicName())) {
					validGeneration = this.generateBundle(bundle) && validGeneration;
			}
		}
		// TODO vérification du log ainsi que dans Static
		//if (validGeneration) {
			this.introspectionWithoutError = this.resolve() && validGeneration;
			OSGiIntrospectorUtil.saveModel(XMIFilePath, this.framework);

		/*} else {
			OSGiIntrospectorUtil
					.log(Level.SEVERE,
							"The introspection failed because a bundle is unvalid with several error(s)");
			OSGiIntrospectorUtil.displayLog(this.log);
		}*/

	}
	

	private boolean generateBundle(org.osgi.framework.Bundle bundle) {
		Bundle bundleRepresentation = this.getSystemBundleRepresentation(bundle);
		bundleRepresentation.setLocation(bundle.getLocation());
		bundleRepresentation.setSymbolicName(bundle.getSymbolicName());

		String manifestStringRepresentation = "";
		Dictionary<String, String> dictionary = bundle.getHeaders();
		Enumeration<String> manifestEntries = dictionary.keys();

		while (manifestEntries.hasMoreElements()) {
			String key = manifestEntries.nextElement();
			String value = dictionary.get(key);
			manifestStringRepresentation += key + ": " + value + "\n";
		}
		try {
		java.io.File manifestFile;
		manifestFile = java.io.File.createTempFile("manifest", ".mf");
		manifestFile.deleteOnExit();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(manifestFile)));
		writer.write(manifestStringRepresentation);
		writer.flush();
		writer.close();

		boolean valid = this.parser.parse(manifestFile, bundleRepresentation);
		
		if (valid) {
			this.framework.addBundle(bundleRepresentation);
		}
		
		return valid;
		} catch (IOException e) {
			OSGiIntrospectorUtil.log(Level.SEVERE, e.getMessage());
			return false;
		}
	}
	
	public Bundle getSystemBundleRepresentation(
			org.osgi.framework.Bundle systemBundle) {
		Bundle systemBundleRepresentation = FrameworkFactory.eINSTANCE
				.createBundle();

		Folder rootFolder = generateSystemEntries(systemBundle, "/");
		systemBundleRepresentation.setFolder(rootFolder);

		Package rootPackage = JarFactory.eINSTANCE.createPackage();
		rootPackage.setName("");
		rootPackage.setFullPath("");
		systemBundleRepresentation.setPackage(rootPackage);

		return systemBundleRepresentation;
	}

	/**
	 * This function is used to generate all entry representation of a bundle
	 * This function is only used when the bundle is not a JAR file but a folder
	 * 
	 * @param directory
	 * @param folder
	 */
	private Folder generateSystemEntries(
			org.osgi.framework.Bundle systemBundle, String path) {
		Folder folder = JarFactory.eINSTANCE.createFolder();
		if (path.equals("/")) {
			folder.setFullPath("");
			folder.setName("");
		} else {
			folder.setFullPath(path);
			String[] tmp = path.split("/");
			folder.setName(tmp[tmp.length - 1]);
		}
		Enumeration<String> bundlePaths = systemBundle.getEntryPaths(path);
		if (bundlePaths != null) {
			while (bundlePaths.hasMoreElements()) {
				String pathTmp = bundlePaths.nextElement();
				SystemEntry f;
				if (pathTmp.endsWith("/")) {
					//f = JarFactory.eINSTANCE.createFolder();
					//f.setFullPath(pathTmp);
					//int i = folder.getFullPath().length();
					//f.setName(pathTmp.substring(i, pathTmp.length() - 1));
					f = generateSystemEntries(systemBundle, pathTmp);
					folder.addEntry(f);
				} else {
					f = JarFactory.eINSTANCE.createFile();
					f.setFullPath(pathTmp);
					int i = folder.getFullPath().length();
					f.setName(pathTmp.substring(i));
					folder.addEntry(f);
				}
			}
		}
		return folder;
	}
	

	public boolean resolve() {
		Resolver resolver = new ResolverDynamic();
		resolver.setLog(this.log);
		resolver.resolveFragmentHost(this.framework, this.parser.getFragmentHostReferences());
		resolver.resolveExportPackage(this.parser.getUnresolvedExportPackageValue(), this.parser.getUnresolvedExportPackageBundle());
		resolver.resolveExportPackageExclude(this.parser.getUnresolvedExportPackageExcludeValue(), this.parser.getUnresolvedExportPackageExcludeExportPackage());
		resolver.resolveExportPackageInclude(this.parser.getUnresolvedExportPackageIncludeValue(), this.parser.getUnresolvedExportPackageIncludeExportPackage());
		resolver.resolveActivationPolicyExclude(this.parser.getUnresolvedActivationPolicyExcludeValue(), this.parser.getUnresolvedActivationPolicyExcludeBundle());
		resolver.resolveActivationPolicyInclude(this.parser.getUnresolvedActivationPolicyIncludeValue(), this.parser.getUnresolvedActivationPolicyIncludeBundle());
		resolver.resolveActivator(this.parser.getUnresolvedActivatorBundle(), this.parser.getUnresolvedActivatorValue());
		resolver.resolveExportService(this.parser.getUnresolvedExportServiceBundle(), this.parser.getUnresolvedExportServiceValue());

		resolver.resolveExportPackageUses(this.parser.getUnresolvedExportPackageUsesValue(),this.parser.getUnresolvedExportPackageUsesBundle());
		resolver.resolveImportPackage(this.parser.getImportPackageReferences());
		resolver.resolveImportService(this.parser.getImportServiceReferences());
		// TODO return
		return true;
	}
}
