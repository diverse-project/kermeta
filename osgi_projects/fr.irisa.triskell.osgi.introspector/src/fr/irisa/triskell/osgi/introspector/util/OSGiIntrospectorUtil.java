package fr.irisa.triskell.osgi.introspector.util;

import jar.Class;
import jar.File;
import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorDynamic;
import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorStatic;
import framework.Bundle;
import framework.Framework;
/**
 * 
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * 
 * This class contains function which are used into {@link OSGiIntrospectorDynamic} and {@link OSGiIntrospectorStatic}
 *
 */
// TODO sauvegarde le log dans un fichier (ou plusieurs)
public class OSGiIntrospectorUtil {

	// TODO singleton

	private static BundleContext context;
	private static Logger logger;
	private static String logLocation;

	/**
	 * This function is used to remove all "<CR> <LF> <SPACE>" into a MANIFEST
	 * entry.
	 * 
	 * @param manifestFileTmp the file which represents the manifest
	 * @return a String which contains the content of the Manifest without "<CR> <LF> <SPACE>"
	 * @throws IOException when the manifestFileTmp is not valid or when there are errors during reading
	 */
	public static String removeEOLBlank(java.io.File manifestFileTmp)
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

		//System.err.println(line);

		return line.toString();

	}

	public static Package convertToJavaElement(Folder folder, boolean bundleClassPath) {
		Package _package = null;
		for (SystemEntry entry : folder.getEntries()) {
			if (entry.isBundleClassPath() == bundleClassPath) {
				if (entry instanceof Folder) {
					Package tmp = convertToJavaElement((Folder) entry, bundleClassPath);
					if (tmp != null) {
						if (_package == null) {
							_package = JarFactory.eINSTANCE.createPackage();
							_package.setName(folder.getName());
							_package.setFullPath(folder.getFullPath().replace("/",
									".").substring(0, folder.getFullPath().length() - 1));
						}
						_package.addPackage(tmp);
					}
				} else {
					if (entry.getFullPath().endsWith(".class")) {
						if (_package == null) {
							_package = JarFactory.eINSTANCE.createPackage();
							_package.setName(folder.getName());
							_package.setFullPath(folder.getFullPath().replace("/",
									".").substring(0, folder.getFullPath().length() - 1));
						}
						Class clazz = JarFactory.eINSTANCE.createClass();
						clazz.setName(entry.getName().substring(0,
								entry.getName().indexOf(".class")));
						clazz.setFullPath(entry.getFullPath().replace(".class", "")
								.replace("/", "."));
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
	 * @param bundle the {@link Bundle} object where we want add entries
	 * @param file the Jar file where there entries to add
	 * @throws IOException when the file is not valid or when there are errors during reading
	 */
	public static void addEntriesFromJar(Bundle bundle, File file, Bundle bundleContainer)
			throws IOException {
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
	 * @param jar the {@link JarFile} which represent the Jar file
	 * @param bundle the bundle where we want add entries
	 * @param bundleClassPath boolean to define if this function is call for classPath element(true) or just for initialize the bundle(false)
	 */
	public static void listAllEntriesIntoJarFile(JarFile jar, Bundle bundle,
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
	
	/*public static void setLogListener(String location) {
		if (handler != null) {
			handler = new LogListener(location);
			ServiceReference refs = context.getServiceReference(LogReaderService.class.getName());
			if (refs != null) {
				((LogReaderService)context.getService(refs)).addLogListener(handler);
			} else {
				System.err.println("There is not logReaderService into this OSGi framework");
			}
		}
	}*/
	
	/*public static LogService getLogger() {
		if (logger == null) {
			//logger = Logger.getLogger(context.getBundle().getSymbolicName());
			ServiceReference refs = context.getServiceReference(LogService.class.getName());
			if (refs != null) {
				logger = (LogService)context.getService(refs);
			}
		}
		return logger;
	}*/
	
	public static void setLoggerProperties(String logLocation) {
		OSGiIntrospectorUtil.logLocation = logLocation;
	}
	
	private static void defineLoggerProperties(String loggerName) {
		try {
			Properties properties = new Properties();
			InputStream stream = context.getBundle().getEntry("config/log4j.properties").openStream();
			properties.load(stream);
			properties.put("log4j.logger." + loggerName, "ALL, HTML_DATA");
			properties.put("log4j.appender.HTML_DATA.File", logLocation + java.io.File.separator + "logs" + java.io.File.separator + loggerName + ".html");
			PropertyConfigurator.configure(properties);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * This function is used to log an event.
	 * It's used to log events with the same logger
	 * @param level the {@link Level} of log 
	 * @param message the message to logged
	 */
	public static void log(Level level, String message, Bundle bundle) {
		
		if (bundle == null) {
			defineLoggerProperties(context.getBundle().getSymbolicName());
			logger = Logger.getLogger(context.getBundle().getSymbolicName());
		} else {
			defineLoggerProperties(bundle.getLocation().substring(bundle.getLocation().lastIndexOf(java.io.File.separator) + 1));
			logger = Logger.getLogger(bundle.getLocation().substring(bundle.getLocation().lastIndexOf(java.io.File.separator) + 1));
		}
		if (logger != null) {
			logger.log(level, message);
			logger.trace(message);
		} else {
			if (bundle != null) {
				System.out.println("bundle : " + bundle.getLocation());
			}
			if (level == Level.DEBUG) {
				System.out.println("DEBUG :");
			} else if (level == Level.INFO) {
				System.out.println("INFO :");
			} else if (level == Level.WARN) {
				System.out.println("WARNING :");
			} else if (level == Level.ERROR) {
				System.out.println("ERROR :");
			}
			System.out.println(message);
			System.out.println();
		}
	}
	
	public static void shutdownLoggers() {
		LogManager.shutdown();
	}

	public static void setContext(BundleContext context) {
		OSGiIntrospectorUtil.context = context;
	}

	/**
	 * This function is used to generate the XMI file which represent an OSGi
	 * framework.
	 * 
	 * @param XMIFilePathToSave the path of the XMI file which will create
	 * @param framework the framework which define the model to save
	 * @return true if the save is OK, false else
	 */
	public static boolean saveModel(String XMIFilePathToSave,
			Framework framework) {
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
		//Object o = null;
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			/*getLogger().log(Level.SEVERE,
					"error during the save of the model", o);
			getLogger().log(Level.SEVERE, e.getMessage(), o);*/
			log(Level.ERROR, "error during the save of the model" + "\n" + e.getMessage(), null);
			return false;
		}
		/*getLogger().log(Level.INFO, "Introspection saved into "
				+ XMIFilePathToSave, o);*/
		log(Level.INFO, "Introspection saved into "
				+ XMIFilePathToSave, null);
		return true;
	}

	public static void displayLog(Map<Bundle, String> log) {
		// TODO sans doute à faire disparaître
		for (Bundle bundle : log.keySet()) {
			if (!log.get(bundle).equals("")) {
				/*getLogger().log(Level.INFO, bundle.getLocation()
						+ "\n" + log.get(bundle), o);*/
				log(Level.INFO, log.get(bundle), null);
			}
		}
	}
}
