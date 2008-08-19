package fr.irisa.triskell.osgi.introspector.util;

import jar.Class;
import jar.File;
import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import manifest.BundleClassPath;
import manifest.ClassPath;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorDynamic;
import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorStatic;
import framework.Bundle;
import framework.Framework;

/**
 * 
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * 
 * This class contains function which are used into
 * {@link OSGiIntrospectorDynamic} and {@link OSGiIntrospectorStatic}
 * 
 */
public abstract class OSGiIntrospectorUtil {

	public Package convertToJavaElement(Folder folder, boolean bundleClassPath) {
		Package _package = null;
		for (SystemEntry entry : folder.getEntries()) {
			if (entry.isBundleClassPath() == bundleClassPath) {
				if (entry instanceof Folder) {
					Package tmp = convertToJavaElement((Folder) entry,
							bundleClassPath);
					if (tmp != null) {
						if (_package == null) {
							_package = JarFactory.eINSTANCE.createPackage();
							_package.setName(folder.getName());
							_package.setFullPath(folder.getFullPath().replace(
									"/", ".").substring(0,
									folder.getFullPath().length() - 1));
						}
						_package.addPackage(tmp);
					}
				} else {
					if (entry.getFullPath().endsWith(".class")) {
						if (_package == null) {
							_package = JarFactory.eINSTANCE.createPackage();
							_package.setName(folder.getName());
							_package.setFullPath(folder.getFullPath().replace(
									"/", ".").substring(0,
									folder.getFullPath().length() - 1));
						}
						Class clazz = JarFactory.eINSTANCE.createClass();
						clazz.setName(entry.getName().substring(0,
								entry.getName().indexOf(".class")));
						clazz.setFullPath(entry.getFullPath().replace(".class",
								"").replace("/", "."));
						_package.addClass(clazz);
					}
				}
			}
		}
		return _package;
	}

	/**
	 * This function is used to add into the classPath all package define into a
	 * JAR
	 * 
	 * @param bundle
	 *            the {@link Bundle} object where we want add entries
	 * @param file
	 *            the Jar file where there entries to add
	 * @throws IOException
	 *             when the file is not valid or when there are errors during
	 *             reading
	 */
	public void addEntriesFromJar(Bundle bundle, File file,
			Bundle bundleContainer) throws IOException {
		java.io.File ioFile = new java.io.File(bundleContainer.getLocation());
		java.io.File bundleFile = null;
		if (ioFile.isDirectory()) {
			bundleFile = new java.io.File(ioFile.getAbsoluteFile()
					+ java.io.File.separator + file.getFullPath());

		} else {
			ZipFile jar = new ZipFile(ioFile);
			bundleFile = java.io.File.createTempFile("jarTmp", ".jar");
			InputStream jarInputStream = jar.getInputStream(jar.getEntry(file
					.getFullPath()));
			DataOutputStream outputStream = new DataOutputStream(
					new FileOutputStream(bundleFile));
			byte[] bytes = new byte[512];
			int length = jarInputStream.read(bytes);
			while (length != -1) {
				outputStream.write(bytes, 0, length);
				outputStream.flush();
				length = jarInputStream.read(bytes);
			}
			outputStream.flush();
			outputStream.close();
			jarInputStream.close();
			bundleFile.deleteOnExit();
		}
		JarFile jar = new JarFile(bundleFile);
		listAllEntriesIntoJarFile(jar, bundle, true);
		jar.close();
	}

	/**
	 * This function is used to generate the entry representation of all entries
	 * into a JAR file.
	 * 
	 * 
	 * @param jar
	 *            the {@link JarFile} which represent the Jar file
	 * @param bundle
	 *            the bundle where we want add entries
	 * @param bundleClassPath
	 *            boolean to define if this function is call for classPath
	 *            element(true) or just for initialize the bundle(false)
	 */
	public void listAllEntriesIntoJarFile(JarFile jar, Bundle bundle,
			boolean bundleClassPath) {
		JarFactory jarFactory = JarFactory.eINSTANCE;
		Enumeration<JarEntry> jarEntries = jar.entries();
		Folder rootFolder = bundle.getFolder();
		while (jarEntries.hasMoreElements()) {
			JarEntry jarEntry = jarEntries.nextElement();
			if (jarEntry.getName().endsWith("/")) {
				Folder entry = jarFactory.createFolder();
				entry.setBundleClassPath(bundleClassPath);
				entry.setFullPath(jarEntry.getName());
				String[] folders = jarEntry.getName().split("/");
				entry.setName(folders[folders.length - 1]);
				rootFolder.addEntry(entry);
			} else {
				File entry = jarFactory.createFile();
				entry.setBundleClassPath(bundleClassPath);
				entry.setFullPath(jarEntry.getName());
				String[] folders = jarEntry.getName().split("/");
				entry.setName(folders[folders.length - 1]);
				rootFolder.addEntry(entry);
			}
		}
	}


	public void updateClassPath(Folder folder, Bundle bundle) {
		for (SystemEntry entry : folder.getEntries()) {
			if (entry.isBundleClassPath()) {
				if (entry instanceof Folder) {
					Package _package = convertToJavaElement(
							(Folder) entry, true);
					if (_package != null) {
						bundle.getPackage().addPackage(_package);
					}
				} else {
					Class clazz = JarFactory.eINSTANCE.createClass();
					clazz.setFullPath(entry.getFullPath().replace("/", "."));
					clazz.setName(entry.getName().substring(0,
							entry.getName().length() - (".class").length()));
				}
			}
		}
	}
	
	Logger logger;
	String logLocation;

	/**
	 * This function is used to check if a reference exist as a Java element
	 * (Package or Class). This function look for into the Bundle-ClassPath and
	 * then into the Fragment of the bundle
	 * 
	 * @param reference
	 * @param bundle
	 * @return true if this element exist, false else.
	 */
	public boolean javaElementExist(String reference, Bundle bundle) {
		reference = reference.replace(".", "/");
		for (BundleClassPath bundleClassPath : bundle.getManifest()
				.getBundleClassPaths()) {
			for (ClassPath classPath : bundleClassPath.getClassPaths()) {
				if (classPath.isResolved()) {
					String referenceTmp = classPath.getReference();
					if (referenceTmp.equals(".")) {
						if (entryExist(reference + "/", bundle) == 1) {
							return true;
						} else if (entryExist(reference + ".class", bundle) == 0) {
							return true;
						}
					} else {
						java.io.File tmp = getEntry(referenceTmp,
								new java.io.File(bundle.getLocation()));
						if (tmp == null) {
							for (Bundle bundleTmp : bundle.getFragments()) {
								tmp = getEntry(referenceTmp, new java.io.File(
										bundleTmp.getLocation()));
								if (tmp != null) {
									break;
								}
							}
						}
						if (tmp != null) {
							if (entryExist(reference + ".class", tmp) == 0
									|| entryExist(reference + "/", tmp) == 1) {
								return true;
							}
						} else {
							// TODO log problème de BundleClassPath peut-être
							// déjà découvert (normalement déjà découvert)
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * This function is used to find a file or a folder into a bundle. This
	 * function don't search into fragment of the bundle but only into the
	 * bundle.
	 * 
	 * @param reference
	 *            the path of the element that we are looking for
	 * @param bundle
	 *            the bundle which may be contains the element.
	 * @return 0 if the reference correspond to a file, 1 if it's a folder, -1
	 *         else.
	 */
	public abstract int entryExist(String reference, Bundle bundle);

	int entryExist(String reference, java.io.File ioFile) {
		// java.io.File ioFile = new java.io.File(file.getAbsolutePath());
		java.io.File bundleFile = null;
		if (ioFile.isDirectory()) {
			bundleFile = new java.io.File(ioFile.getAbsoluteFile()
					+ java.io.File.separator + reference);
			if (bundleFile.exists()) {
				if (bundleFile.isDirectory()) {
					return 1;
				} else if (bundleFile.isFile()) {
					return 0;
				}
			}

		} else {
			try {
				ZipFile jar = new ZipFile(ioFile);
				ZipEntry entry = jar.getEntry(reference);
				if (entry != null) {
					if (entry.isDirectory()) {
						jar.close();
						return 1;
					}
					jar.close();
					return 0;
				}
			} catch (ZipException e) {
				System.err.println("OSGi Introspector error :");
				System.err.println("Error during reading of a Jar file.");
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println("OSGi Introspector error :");
				System.err.println("Error during reading of a file.");
				e.printStackTrace();
			}
		}
		return -1;
	}

	/**
	 * This function is only used to get a JAR file into a folder or a JAR File.
	 * 
	 * @param reference
	 *            the path of the JAR file into the bundle
	 * @param ioFile
	 *            a {@link File} which represents the bundle (folder or JAR
	 *            file)
	 * @return a {@link File} if the file exist, null else.
	 */
	java.io.File getEntry(String reference, java.io.File ioFile) {
		// java.io.File ioFile = new java.io.File(file.getAbsolutePath());
		java.io.File bundleFile = null;
		if (ioFile.isDirectory()) {
			bundleFile = new java.io.File(ioFile.getAbsoluteFile()
					+ java.io.File.separator + reference);
			if (bundleFile.exists()) {
				return bundleFile;
			}
			return null;
		} else {
			try {
				ZipFile jar = new ZipFile(ioFile);
				bundleFile = java.io.File.createTempFile("EntryTmp", ".tmp");
				bundleFile.deleteOnExit();
				ZipEntry entry = jar.getEntry(reference);
				if (entry == null) {
					return null;
				}
				InputStream jarInputStream = jar.getInputStream(entry);
				DataOutputStream outputStream = new DataOutputStream(
						new FileOutputStream(bundleFile));
				byte[] bytes = new byte[512];
				int length = jarInputStream.read(bytes);
				while (length != -1) {
					outputStream.write(bytes, 0, length);
					outputStream.flush();
					length = jarInputStream.read(bytes);
				}
				outputStream.flush();
				outputStream.close();
				jarInputStream.close();
				return bundleFile;
			} catch (IOException e) {
				log(Level.ERROR, "Error during reading a file\n" + e.getMessage(), null);
				//e.printStackTrace();
				return null;
			}
		}
	}

	/**
	 * This function is used to log an event. It's used to log events with the
	 * same logger. All logs are saved into HTML files. If there are problems to
	 * use a {@link Logger}, the logs are just print into the standard output.
	 * 
	 * @param level
	 *            the {@link Level} of log
	 * @param message
	 *            the message to logged
	 */
	public abstract void log(Level level, String message, Bundle bundle);

	/**
	 * This function is used to locate where the folder which will contained
	 * logs will be created.
	 * 
	 * @param logLocation
	 *            the location where the logs will be saved.
	 */
	public void setLoggerProperties(String logLocation) {
		this.logLocation = logLocation;
	}

	/**
	 * This function is used to close all loggers. It's necessary to get access
	 * to the logs file without close the OSGi platform.
	 */
	public void shutdownLoggers() {
		LogManager.shutdown();
	}

	/**
	 * This function is used to set the {@link BundleContext}.
	 * 
	 * @param context
	 *            the {@link BundleContext}.
	 */
	/*
	 * public void setContext(BundleContext context) { this.context = context; }
	 */

	/**
	 * This function is used to generate the XMI file which represent an OSGi
	 * framework.
	 * 
	 * @param XMIFilePathToSave
	 *            the path of the XMI file which will create
	 * @param framework
	 *            the framework which define the model to save
	 * @return true if the save is OK, false else
	 */
	public boolean saveModel(String XMIFilePathToSave, Framework framework) {
		java.io.File XMIFile = new java.io.File(XMIFilePathToSave);

		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(XMIFile.getAbsolutePath());

		// Create a resource for this file.
		Resource resource = resourceSet.createResource(fileURI);

		// Add the book and writer objects to the contents.
		resource.getContents().add(framework);
		// resource.getContents().add(writer);

		// Save the contents of the resource to the file system.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			log(Level.ERROR, "error during the save of the model" + "\n"
					+ e.getMessage(), null);
			return false;
		}
		log(Level.INFO, "Introspection saved into " + XMIFilePathToSave, null);
		return true;
	}
}
