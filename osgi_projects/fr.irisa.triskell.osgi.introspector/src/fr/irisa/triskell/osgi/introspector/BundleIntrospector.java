package fr.irisa.triskell.osgi.introspector;

import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.util.Enumeration;

import framework.Bundle;
import framework.FrameworkFactory;

public class BundleIntrospector {

	public static Bundle getSystemBundleRepresentation(
			org.osgi.framework.Bundle systemBundle) {
		Bundle systemBundleRepresentation = FrameworkFactory.eINSTANCE
				.createBundle();

		Folder rootFolder = JarFactory.eINSTANCE.createFolder();
		rootFolder.setName("");
		rootFolder.setFullPath("");
		systemBundleRepresentation.setFolder(rootFolder);

		Package rootPackage = JarFactory.eINSTANCE.createPackage();
		rootPackage.setName("");
		rootPackage.setFullPath("");
		systemBundleRepresentation.setPackage(rootPackage);

		generateSystemEntries(systemBundle, "/", rootFolder);

		return systemBundleRepresentation;
	}

	/**
	 * This function is used to generate all entry representation of a bundle
	 * This function is only used when the bundle is not a JAR file but a folder
	 * 
	 * @param directory
	 * @param folder
	 */
	private static void generateSystemEntries(
			org.osgi.framework.Bundle systemBundle, String path, Folder folder) {
		Enumeration<String> bundlePaths = systemBundle.getEntryPaths(path);
		if (bundlePaths != null) {
			while (bundlePaths.hasMoreElements()) {
				String pathTmp = bundlePaths.nextElement();
				SystemEntry f;
				if (pathTmp.endsWith("/")) {
					f = JarFactory.eINSTANCE.createFolder();
					f.setFullPath(folder.getFullPath() + pathTmp);
					f.setName(pathTmp.substring(0, pathTmp.length() - 1));
					generateSystemEntries(systemBundle, pathTmp, (Folder) f);
					folder.addEntry(f);
				} else {
					f = JarFactory.eINSTANCE.createFile();
					f.setFullPath(folder.getFullPath() + pathTmp);
					f.setName(pathTmp);
					folder.addEntry(f);
				}
			}
		}
	}
}
