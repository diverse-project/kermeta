package fr.irisa.triskell.osgi.introspector;

import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;

import fr.irisa.triskell.osgi.introspector.generator.Parser;
import fr.irisa.triskell.osgi.introspector.generator.Resolver;
import fr.irisa.triskell.osgi.introspector.generator.ResolverStatic;
import framework.Bundle;
import framework.Framework;
import framework.FrameworkFactory;

public class OSGiIntrospectorStatic {
	private Framework framework;
	private Map<Bundle, String> log;
	private Parser parser;

	private boolean introspectionWithoutError;

	/**
	 * This function is used to generate a complete framework with a location.
	 * It checks only the static information.
	 */
	public void generateFramework(String DirectoryFilePath, String XMIFilePath) {
		this.framework = FrameworkFactory.eINSTANCE.createFramework();
		this.log = new HashMap<Bundle, String>();
		this.parser = new Parser(log);
		File f = new File(DirectoryFilePath);
		if (f.isDirectory()) {
			boolean validGeneration = true;
			String[] bundlePaths = f.list();
			for (String path : bundlePaths) {
				validGeneration = this.generateBundle(f.getAbsolutePath()
								+ File.separator + path) && validGeneration;
			}
				this.introspectionWithoutError = this.resolve() && validGeneration;
				OSGiIntrospectorUtil.displayLog(log);
				OSGiIntrospectorUtil.saveModel(XMIFilePath, this.framework);
		} else {
			OSGiIntrospectorUtil.log(Level.SEVERE,
					"GenerateFramework take two parameters which are String."
							+ "\n" + "The first define a directory." + "\n"
							+ "The second define a file." + "\n");
		}
	}

	private boolean generateBundle(String bundlePath) {
		java.io.File f = new java.io.File(bundlePath);
		if (!f.exists()) {
			return false;
		}
		if (f.isDirectory()) {
			return this.generateWithDirectory(f);
		} else {
			try {
				return this.generateWithJar(f);
			} catch (IOException e) {
				OSGiIntrospectorUtil.log(Level.SEVERE, e.getMessage());
				return false;
			}
		}
	}

	/**
	 * This function is used to generate all entry representation of a bundle
	 * This function is only used when the bundle is not a JAR file but a folder
	 * 
	 * @param directory
	 * @param folder
	 */
	private void generateSystemEntries(java.io.File directory, Folder folder) {
		String[] bundlePaths = directory.list();
		for (String path : bundlePaths) {
			java.io.File tmp = new java.io.File(directory.getAbsolutePath()
					+ java.io.File.separator + path);
			SystemEntry f;
			if (tmp.isDirectory()) {
				f = JarFactory.eINSTANCE.createFolder();
				f.setFullPath(folder.getFullPath() + tmp.getName() + "/");
				f.setName(tmp.getName());
				this.generateSystemEntries(tmp, (Folder) f);
				folder.addEntry(f);
			} else if (tmp.isFile()) {
				f = JarFactory.eINSTANCE.createFile();
				f.setFullPath(folder.getFullPath() + tmp.getName());
				f.setName(tmp.getName());
				folder.addEntry(f);
			}
		}
	}

	/**
	 * This function is used to create a Bundle representation with a directory
	 * which contains all resources
	 * 
	 * @param directory
	 *            the directory which contains the resources of the bundle.
	 * @return true if the generation is OK, false else
	 */
	private boolean generateWithDirectory(java.io.File directory) {
		java.io.File manifestFileTmp = new java.io.File(directory
				.getAbsolutePath()
				+ java.io.File.separator
				+ "META-INF"
				+ java.io.File.separator
				+ "MANIFEST.MF");
		if (manifestFileTmp.isFile()) {
			Bundle bundle = FrameworkFactory.eINSTANCE.createBundle();
			bundle.setLocation(directory.getAbsolutePath());

			Folder rootFolder = JarFactory.eINSTANCE.createFolder();
			rootFolder.setName("");
			rootFolder.setFullPath("");
			bundle.setFolder(rootFolder);

			Package defaultPackage = JarFactory.eINSTANCE.createPackage();
			defaultPackage.setName("");
			defaultPackage.setFullPath("");
			bundle.setPackage(defaultPackage);

			this.generateSystemEntries(directory, rootFolder);
			try {
				String manifestContent = OSGiIntrospectorUtil
						.removeEOLBlank(manifestFileTmp);
				boolean valid = this.parser.parse(manifestContent, bundle);
				if (valid) {
					framework.addBundle(bundle);
				}
				return valid;
			} catch (IOException e) {
				OSGiIntrospectorUtil.log(Level.SEVERE, e.getMessage());
				return false;
			}
		}
		return true;
	}

	/**
	 * This function is used to generate a bundle with a JAR
	 * 
	 * @param jarFile
	 *            the file which represents the JAR file
	 * @return true if the generation is valid, false else
	 * @throws IOException
	 */
	private boolean generateWithJar(java.io.File jarFile) throws IOException {
		JarFile jar = new JarFile(jarFile);
		Manifest manifest = jar.getManifest();
		if (manifest != null) {

			Bundle bundle = FrameworkFactory.eINSTANCE.createBundle();
			bundle.setLocation(jarFile.getAbsolutePath());

			Folder rootFolder = JarFactory.eINSTANCE.createFolder();
			rootFolder.setName("");
			rootFolder.setFullPath("");
			bundle.setFolder(rootFolder);

			Package defaultPackage = JarFactory.eINSTANCE.createPackage();
			defaultPackage.setName("");
			defaultPackage.setFullPath("");
			bundle.setPackage(defaultPackage);

			OSGiIntrospectorUtil.listAllEntriesIntoJarFile(jar, bundle, false);

			// This test is used because the Manifest function
			// write(OutputStream) can return a valid value except if
			// Manifest-Version entry is not define into the Manifest file.
			if (manifest.getMainAttributes().get(
					Attributes.Name.MANIFEST_VERSION) == null) {
				manifest.getMainAttributes().put(
						Attributes.Name.MANIFEST_VERSION, "1.0");
			}

			java.io.File manifestFileTmp = java.io.File.createTempFile(
					"manifesttmp", ".mf");
			manifest.write(new FileOutputStream(manifestFileTmp));
			String manifestContent = OSGiIntrospectorUtil
					.removeEOLBlank(manifestFileTmp);
			manifestFileTmp.delete();

				boolean valid = this.parser.parse(manifestContent, bundle);
				if (valid) {
					framework.addBundle(bundle);
				}
				return valid;
		}
		return true;
	}

	public boolean resolve() {
		Resolver resolver = new ResolverStatic();
		resolver.setLog(this.log);
		resolver.resolveRequireBundle(this.framework, this.parser.getUnresolvedRequireBundleValue(), this.parser.getUnresolvedRequireBundleBundle());
		resolver.resolveFragmentHost(this.framework, this.parser.getFragmentHostReferences());
		resolver.resolveExportPackage(this.parser.getUnresolvedExportPackageValue(), this.parser.getUnresolvedExportPackageBundle());
		resolver.resolveExportPackageExclude(this.parser.getUnresolvedExportPackageExcludeValue(), this.parser.getUnresolvedExportPackageExcludeExportPackage());
		resolver.resolveExportPackageInclude(this.parser.getUnresolvedExportPackageIncludeValue(), this.parser.getUnresolvedExportPackageIncludeExportPackage());
		resolver.resolveActivationPolicyExclude(this.parser.getUnresolvedActivationPolicyExcludeValue(), this.parser.getUnresolvedActivationPolicyExcludeBundle());
		resolver.resolveActivationPolicyInclude(this.parser.getUnresolvedActivationPolicyIncludeValue(), this.parser.getUnresolvedActivationPolicyIncludeBundle());
		resolver.resolveActivator(this.parser.getUnresolvedActivatorBundle(), this.parser.getUnresolvedActivatorValue());
		resolver.resolveExportService(this.parser.getUnresolvedExportServiceBundle(), this.parser.getUnresolvedExportServiceValue());
		resolver.resolveExportPackageUses(this.parser.getUnresolvedExportPackageUsesValue(),this.parser.getUnresolvedExportPackageUsesBundle());
		resolver.resolveImportPackage(this.parser.getUnresolvedImportPackageValue(), this.parser.getUnresolvedImportPackageBundle());
		resolver.resolveImportService(this.parser.getUnresolvedImportServiceValue(), this.parser.getUnresolvedImportServiceBundle(), this.parser.getServicesAvailable());
		// TODO return
		return true;
	}
}
