package fr.irisa.triskell.osgi.introspector;

import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import org.apache.log4j.Level;

import fr.irisa.triskell.osgi.introspector.generator.Parser;
import fr.irisa.triskell.osgi.introspector.generator.resolver.Resolver;
import fr.irisa.triskell.osgi.introspector.util.OSGiIntrospectorUtil;
import framework.Bundle;
import framework.Framework;
import framework.FrameworkFactory;

/**
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * 
 * This class is used to generate an OSGi model with the location of a
 * framework.<br />
 * This generation is only static :<br />
 * There are not relation between {@link Bundle} except for Fragment Bundle.
 * 
 */
public class OSGiIntrospectorStatic {
	private OSGiIntrospectorUtil util;
	private Framework framework;
	private Parser parser;

	public OSGiIntrospectorStatic(OSGiIntrospectorUtil util) {
		this.util = util;
	}

	/**
	 * This function is used to generate a complete framework with a location.
	 * It checks only the static information.
	 */
	public void generateFramework(String DirectoryFilePath, String XMIFilePath,
			boolean systemRepresentation) {
		util.setLoggerProperties(XMIFilePath.substring(0, XMIFilePath
				.lastIndexOf(File.separator)));
		this.framework = FrameworkFactory.eINSTANCE.createFramework();
		this.parser = new Parser(util);
		File f = new File(DirectoryFilePath);
		if (f.isDirectory()) {
			String[] bundlePaths = f.list();
			for (String path : bundlePaths) {
				this.generateBundle(
						f.getAbsolutePath() + File.separator + path,
						systemRepresentation);
			}
			this.resolve(systemRepresentation);
			util.saveModel(XMIFilePath, this.framework);
		} else {
			util.log(Level.ERROR,
					"GenerateFramework take two parameters which are String."
							+ "\n" + "The first define a directory." + "\n"
							+ "The second define a file." + "\n", null);
		}

		util.shutdownLoggers();
	}

	/**
	 * This function is used to create the {@link Bundle} representation of an
	 * OSGi Bundle This Bundle is located with bundlePath and can be a directory
	 * or a Jar File.
	 * 
	 * @param bundlePath
	 *            the location path of the bundle
	 * @return true if the representation was done correctly, false else.
	 */
	private boolean generateBundle(String bundlePath,
			boolean systemRepresentation) {
		java.io.File f = new java.io.File(bundlePath);
		if (!f.exists()) {
			return false;
		}
		if (f.isDirectory()) {
			return this.generateWithDirectory(f, systemRepresentation);
		} else {
			return this.generateWithJar(f, systemRepresentation);
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
	 * This function is used to remove all "<CR> <LF> <SPACE>" into a MANIFEST
	 * entry.
	 * 
	 * @param manifestFileTmp
	 *            the file which represents the manifest
	 * @return a String which contains the content of the Manifest without "<CR>
	 *         <LF> <SPACE>"
	 * @throws IOException
	 *             when the manifestFileTmp is not valid or when there are
	 *             errors during reading
	 */
	private String removeEOLBlank(java.io.File manifestFileTmp)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(manifestFileTmp)));
		StringBuffer line = null;
		String read = reader.readLine();
		StringBuffer tmp;
		while (read != null) {
			tmp = new StringBuffer(read);
			if (line == null) {
				line = new StringBuffer(tmp);
			} else {
				if (tmp.length() > 0 && tmp.charAt(0) == ' ') {
					while (line.charAt(line.length() - 1) == ' '
							|| line.charAt(line.length() - 1) == '\t') {
						line.deleteCharAt(line.length() - 1);
					}
					while (tmp.charAt(0) == ' ' || tmp.charAt(0) == '\t') {
						tmp.deleteCharAt(0);
					}
					line.append(tmp);
				} else {
					line.append("\n" + tmp);
				}
			}
			read = reader.readLine();
		}
		reader.close();
		// line = line.replace("\n ", "");
		line.append("\n");

		// System.err.println(line);

		return line.toString();

	}

	/**
	 * This function is used to create a Bundle representation with a directory
	 * which contains all resources
	 * 
	 * @param directory
	 *            the directory which contains the resources of the bundle.
	 * @return true if the generation is OK, false else
	 */
	private boolean generateWithDirectory(java.io.File directory,
			boolean systemRepresentation) {
		java.io.File manifestFileTmp = new java.io.File(directory
				.getAbsolutePath()
				+ java.io.File.separator
				+ "META-INF"
				+ java.io.File.separator
				+ "MANIFEST.MF");
		if (manifestFileTmp.isFile()) {
			Bundle bundle = FrameworkFactory.eINSTANCE.createBundle();
			bundle.setLocation(directory.getAbsolutePath());

			if (systemRepresentation) {
				Folder rootFolder = JarFactory.eINSTANCE.createFolder();
				rootFolder.setName("");
				rootFolder.setFullPath("");
				bundle.setFolder(rootFolder);

				Package defaultPackage = JarFactory.eINSTANCE.createPackage();
				defaultPackage.setName("");
				defaultPackage.setFullPath("");
				bundle.setPackage(defaultPackage);

				this.generateSystemEntries(directory, rootFolder);
			}
			try {
				String manifestContent = this.removeEOLBlank(manifestFileTmp);
				boolean valid = this.parser.parse(manifestContent, bundle);
				if (valid) {
					framework.addBundle(bundle);
				}
				return valid;
			} catch (IOException e) {
				util.log(Level.ERROR, e.getMessage(), null);
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
	private boolean generateWithJar(java.io.File jarFile,
			boolean systemRepresentation) {
		try {
			JarFile jar = new JarFile(jarFile);

			Manifest manifest = jar.getManifest();
			if (manifest != null) {

				Bundle bundle = FrameworkFactory.eINSTANCE.createBundle();
				bundle.setLocation(jarFile.getAbsolutePath());

				if (systemRepresentation) {
					Folder rootFolder = JarFactory.eINSTANCE.createFolder();
					rootFolder.setName("");
					rootFolder.setFullPath("");
					bundle.setFolder(rootFolder);

					Package defaultPackage = JarFactory.eINSTANCE
							.createPackage();
					defaultPackage.setName("");
					defaultPackage.setFullPath("");
					bundle.setPackage(defaultPackage);

					util.listAllEntriesIntoJarFile(jar, bundle, false);
				}

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
				String manifestContent = this.removeEOLBlank(manifestFileTmp);
				if (!manifestFileTmp.delete()) {
					manifestFileTmp.deleteOnExit();
				}
				boolean valid = this.parser.parse(manifestContent, bundle);
				if (valid) {
					framework.addBundle(bundle);
				}
				return valid;
			}
		} catch (IOException e) {
			// System.out.println(jarFile.getAbsolutePath());
			// e.printStackTrace();
			util.log(Level.ERROR, jarFile.getAbsolutePath()
					+ " is not a valid Jar file.", null);
			return false;
		}
		return true;
	}

	/**
	 * This function is used to resolve all unresolved references like :<br/ >
	 * Require-Bundle<br/ > Fragment-Host<br/ > Export-Package<br/ >
	 * Export-Service<br/ > Import-Package<br/ > Import-Service<br/ > This
	 * function resolve many references statically. That's why many
	 * Export-Package, Export-Service, Import-Package, Import-Service are not
	 * resolve precisely.
	 * 
	 * @return true if the resolution is OK, false else.
	 */
	public void resolve(boolean systemRepresentation) {
		Resolver resolver = util.getResolver(systemRepresentation);
		resolver.resolveRequireBundle(this.parser.getUnresolvedRequireBundle(),
				this.framework);
		resolver.resolveFragmentHost(this.framework, this.parser
				.getFragmentHostReferences());
		resolver.resolveBundleClassPath(this.parser
				.getUnresolvedBundleClassPath());
		resolver.resolveBundleNativeCode(this.parser
				.getUnresolvedBundleNativeCode());
		resolver.resolveExportPackage(this.parser.getUnresolvedExportPackage());
		resolver.resolveExportPackageExclude(this.parser
				.getUnresolvedExportPackageExclude(), this.parser
				.getUnresolvedExportPackageBundles());
		resolver.resolveExportPackageInclude(this.parser
				.getUnresolvedExportPackageInclude(), this.parser
				.getUnresolvedExportPackageBundles());
		resolver.resolveActivationPolicyExclude(this.parser
				.getUnresolvedActivationPolicyExclude());
		resolver.resolveActivationPolicyInclude(this.parser
				.getUnresolvedActivationPolicyInclude());
		resolver.resolveActivator(this.parser.getUnresolvedActivator());
		resolver.resolveExportService(this.parser.getUnresolvedExportService());
		resolver.resolveExportPackageUses(this.parser
				.getUnresolvedExportPackageUsesValue(), this.parser
				.getUnresolvedExportPackageUsesBundle());
		resolver.resolveImportPackage(this.parser.getUnresolvedImportPackage(),
				this.framework);
		resolver.resolveImportService(this.parser.getUnresolvedImportService(),
				this.parser.getServicesAvailable());
	}
}
