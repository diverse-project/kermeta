package fr.irisa.triskell.osgi.introspector;

import jar.File;
import jar.Folder;
import jar.JarFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipFile;

import org.osgi.framework.BundleContext;

import framework.Bundle;

public class OSGiIntrospectorUtil {

	// TODO singleton

	private static BundleContext context;
	private static Logger logger;

	/**
	 * This function is used to remove all "<CR> <LF> <SPACE>" into a MANIFEST
	 * entry.
	 * 
	 * @param manifestFileTmp
	 * @return
	 * @throws IOException
	 */
	static java.io.File removeEOLBlank(java.io.File manifestFileTmp)
			throws IOException {
		java.io.File manifestFile = java.io.File.createTempFile("manifest",
				".mf");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(manifestFileTmp)));
		String line = "";
		String tmp = reader.readLine();
		while (tmp != null) {
			if (line.equals("")) {
				line = tmp;
			} else {
				line += "\n" + tmp;
			}
			tmp = reader.readLine();
		}
		reader.close();
		line = line.replace("\n ", "");
		line += "\n";
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(manifestFile)));
		writer.write(line);
		writer.flush();
		writer.close();

		//System.err.println(line);

		return manifestFile;

	}

	/**
	 * This function is used to add into the classPath all package define into a
	 * JAR
	 * 
	 * @param bundle
	 * @param file
	 * @throws IOException
	 */
	static void addEntriesFromJar(Bundle bundle, File file) throws IOException {
		java.io.File ioFile = new java.io.File(bundle.getLocation()/*
																	 * +
																	 * java.io.File.separator +
																	 * file.getFullPath()
																	 */);
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
		listAllEntriesIntoJarFile(jar, bundle);
		jar.close();
	}

	/**
	 * This function is used to generate the entry representation of all entries
	 * into a JAR file.
	 * 
	 * @param jar
	 * @param getAll
	 *            when it's true, we generate all entry representation like
	 *            folders, files, packages and classes, but if it's false, we
	 *            generate only packages and classes.
	 * @param rootFolder
	 * @param bundle
	 * @param isBundleCLassPath
	 */
	static void listAllEntriesIntoJarFile(JarFile jar, Bundle bundle) {
		JarFactory jarFactory = JarFactory.eINSTANCE;
		Enumeration<JarEntry> jarEntries = jar.entries();
		Folder rootFolder = bundle.getFolder();
		while (jarEntries.hasMoreElements()) {
			JarEntry jarEntry = jarEntries.nextElement();
			// If the entry define the MANIFEST file, I do nothing
			if (!jarEntry.getName().equals("META-INF/MANIFEST.MF")) {
				if (jarEntry.getName().endsWith("/")) {
					Folder entry = jarFactory.createFolder();
					entry.setFullPath(jarEntry.getName());
					String[] folders = jarEntry.getName().split("/");
					entry.setName(folders[folders.length - 1]);
					rootFolder.addEntry(entry);
				} else {
					File entry = jarFactory.createFile();
					entry.setFullPath(jarEntry.getName());
					String[] folders = jarEntry.getName().split("/");
					entry.setName(folders[folders.length - 1]);
					rootFolder.addEntry(entry);
				}
			}
		}
	}

	static String getFileLocation(org.osgi.framework.Bundle b) {
		String location = b.getLocation();
		context.getProperty("");
		int index = location.indexOf("file:");
		// TODO vérifier si c'est possible que ce soit "http:" ou "ftp:"
		if (index < 0) {
			return null;
		} else {
			location = location.substring(index);
		}
		try {
			URL u = new URL(location);
			java.io.File f = new java.io.File(u.getFile());
			return f.getAbsolutePath();
			// URL u = new URL(location);
			// java.io.File f = new java.io.File(location);
			// return f.getAbsolutePath();
		} catch (MalformedURLException e) {
			return null;
		}
	}

	public static void log(Level level, String message) {
		if (logger == null) {
			logger = Logger.getLogger(context.getBundle().getSymbolicName());
		}
		logger.log(level, message);
		// TODO sauvegarde du log dans un fichier
	}

	public static BundleContext getContext() {
		return context;
	}

	public static void setContext(BundleContext context) {
		OSGiIntrospectorUtil.context = context;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		OSGiIntrospectorUtil.logger = logger;
	}
}
