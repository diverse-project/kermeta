package fr.irisa.triskell.osgi.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleContext;


public abstract class FileUtilities {

	private static Logger logger = Logger.getLogger(FileUtilities.class.getName());
	
	/**
	 * Convert any strange path to an absolute one. Download files if needed. Works in the system temp directory.
	 * @param path The path to convert.
	 * @return An absolute path to the element.
	 */
	public static String anyStrangePathToAbsolute(BundleContext context, String path) {
		String pathTemp = path;
		logger.debug("PathToSolve: " + path);

		try {

			if(pathTemp.startsWith("initial@reference")) {

				//Case on Equinox or felix when file is installed manually from console.
				logger.debug("Starts with initial@reference");
				
				String installArea = context.getProperty("osgi.install.area").replace("file:", "");

				//on windows, the last ':' is after the root. On unix the last ':' is after 'file'
				if(pathTemp.lastIndexOf(':') != 22) {
					pathTemp = pathTemp.replace("initial@reference:file:", "");
				} else {
					pathTemp = pathTemp.replace("initial@reference:file:", unifyPath(installArea));
				}

				if(pathTemp.endsWith("/"))
					pathTemp = pathTemp.substring(0, pathTemp.length()-1);

			} else if(pathTemp.startsWith("file:")) {
				logger.debug("Starts with file:");
				return pathTemp.substring(5);

			} else if(pathTemp.startsWith("http:")) {
				logger.debug("Starts with http:");
				String fileName = pathTemp.substring(pathTemp.lastIndexOf("/")+1, pathTemp.length());
				File icon = FileUtilities.getTempFile(fileName);
				if(icon == null) {
					icon = createTempFile(fileName);
					URL url;
					try {
						url = new URL(pathTemp);
						url.openConnection();
						copyFile(url.openStream(), new FileOutputStream(icon));
						url = null;
					} catch( MalformedURLException e) {
						e.printStackTrace();
					}
				}

				return icon.getAbsolutePath();

			} else if(pathTemp.startsWith("obr:") || pathTemp.startsWith("mvn:")) {
				//OBR: 'obr://eu.ict_diva.tutorial.services/1250843674906'
				//MAVEN: 'mvn:eu.ict_diva/tutorial.services/1.2.3'

				logger.debug("Starts with obr: or mvn:");
				
				String defaultDataFileAbsLoc = context.getDataFile("").getAbsolutePath();
				
				//felix-cache/bundleX
				String bundleWorkingDir = defaultDataFileAbsLoc.substring(0,defaultDataFileAbsLoc.lastIndexOf(File.separator));
				
				File cache = new File(bundleWorkingDir + File.separator + ".." + File.separator);//felix-cache
				
				for(File f : cache.listFiles()) {
					if(f.isDirectory()) { //felix-cache/bundleY
						if(f.getName().startsWith("bundle")) {
							
							File bundleLocationFile = null;
							String version = "0.0";
							
							for(File f2 : f.listFiles()) {
								if(f2.getName().equals("bundle.location")) { //felix-cache/bundleY/bundle.location
									bundleLocationFile = f2;
								} else if(f2.getName().equals("refresh.counter")) {//felix-cache/bundleY/refresh.counter
									char vers = (char)new FileReader(f2).read();
									version = vers + ".0";
								}
							}
							
							if (bundleLocationFile != null) {
								String bundleLocation = new BufferedReader(new FileReader(bundleLocationFile)).readLine();
								if(bundleLocation.equals(pathTemp)) {
									bundleWorkingDir = f.getAbsolutePath() + File.separator + "version" + version + File.separator + "bundle.jar";
									logger.debug("jarFileLocation:" + bundleWorkingDir);
									return bundleWorkingDir;
								}
							}
								
						}
					}
				}
				
				logger.debug("bundleWorkingDir: " + bundleWorkingDir);

				return bundleWorkingDir;
			} else {
				logger.error("Path not solved (path: " + path + ")");
			}

			if(pathTemp.contains(":")&&pathTemp.startsWith("/"))
				pathTemp = pathTemp.substring(1);

		} catch (FileNotFoundException e) {
			logger.error("FileNotFound", e);
		} catch (IOException e) {
			logger.error("IOException", e);
		}

		return pathTemp;
	}


	/**
	 * Copy from in file to out file
	 * @param in the filte to copy
	 * @param out the destination
	 * @return true if done, false otherwise.
	 * @throws IOException
	 */
	public static boolean copyFile(File in, File out) throws IOException {
		FileInputStream fis = new FileInputStream(in);
		FileOutputStream fos = new FileOutputStream(out);
		return copyFile(fis, fos);
	}


	/**
	 * Copy from in file to out file
	 * @param fis
	 * @param fos
	 * @return
	 * @throws IOException
	 */
	public static boolean copyFile(InputStream fis, OutputStream fos) throws IOException {
		try {
			byte[] buf = new byte[1024];
			int i = 0;
			while ((i = fis.read(buf)) != -1) {
				fos.write(buf, 0, i);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (fis != null)
				fis.close();
			if (fos != null)
				fos.close();
		}
		return true;
	}


	/**
	 * Returns a path containing only /
	 * @param path the path to unify
	 * @return unified path
	 */
	public static String unifyPath(String path) {
		return path.replace("\\", "/").replace("/./", "/");
	}

	private static URI getUriFromPath( final String path ) throws URISyntaxException {
		URI tmpDirUri = new URI(path);

		if(tmpDirUri.getScheme() == null || //no scheme if path is absolute on Unix systems
				tmpDirUri.toString().indexOf(":") == 1) //root of windows system (eg: C:\) is interptreted as scheme='C'
		{
			tmpDirUri = new URI("file:///" + path);
		} else {
			logger.error("Unknown scheme : " + tmpDirUri.getScheme());
		}

		tmpDirUri.normalize();

		return tmpDirUri;

	}

	/**
	 * Creates a temporary directory in the temporary directory given by the platform.
	 * @param dirName the name of the directory to create
	 * @return the directory File
	 */
	public static File createTempDir(String dirName) {

		File f = null;

		try {

			String tmpDir = unifyPath(System.getProperty("java.io.tmpdir"));
			if(!tmpDir.endsWith("/"))
				tmpDir += "/" + dirName;
			else
				tmpDir += dirName;

			f = new File(getUriFromPath(tmpDir));
			f.mkdirs();

		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return f;
	}

	/**
	 * Creates a temporary file at the root of the temporary directory given by the platform.<br/>
	 * If the file already exists, the old file is deleted, a new one is created.<br/>
	 * The resulting temporary file is supposed to be deleted when the virtual machine stops.
	 * @param fileName The name of the file to create.
	 * @return the temporary file.
	 */
	public static File createTempFile(String fileName) {
		File f = null;

		try {


			String tmpDir = unifyPath(System.getProperty("java.io.tmpdir"));
			if(!tmpDir.endsWith("/"))
				tmpDir += "/" + fileName;
			else
				tmpDir += fileName;

			f = new File(getUriFromPath(tmpDir));
			if(f.exists())
				f.delete();
			f.createNewFile();
			f.deleteOnExit();

		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return f;
	}

	/**
	 * Creates a temporary file at given relative location in the temporary directory given by the platform.<br/>
	 * If the file already exists, the old file is deleted, a new one is created.<br/>
	 * The resulting temporary file is supposed to be deleted when the virtual machine stops.
	 * @param dirName The relative name of the directory.
	 * @param fileName The name of the file to create.
	 * @return the temporary file.
	 */
	public static File createTempFile(String dirName, String fileName) {
		createTempDir(dirName);
		return createTempFile(dirName + "/" + fileName);
	}

	/**
	 * Retreives a temporary file of the given directory, from the temp directory given by the platform, if the file exists.
	 * @param directory The name of the directory to search into.
	 * @param fileName The name of the file to get
	 * @return The File if exists, null otherwise.
	 */
	public static File getTempFile(String directory, String fileName) {
		return getTempFile(directory + "/" + fileName);
	}

	/**
	 * Retreives a temporary file from the temp directory given by the platform, if the file exists.
	 * @param fileName The name of the file to get
	 * @return The File if exists, null otherwise.
	 */
	public static File getTempFile(String fileName) {

		File f = null;
		String tmpDir = null;
		URI uri = null;
		try {


			tmpDir = unifyPath(System.getProperty("java.io.tmpdir"));
			if(!tmpDir.endsWith("/"))
				tmpDir += "/" + fileName;
			else
				tmpDir += fileName;
			uri = getUriFromPath(tmpDir);
			f = new File(uri);
			if(f.exists())
				return f;
			else
				return null;

		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			logger.error("Not correct URI:" + uri.toString(), e);
		}
		return null;
	}

	/**
	 * Creates a persistent directory in an area given by the platform.
	 * @param dirName The relative name of the directory to create (eg: "tmp", "tmp/bin"). 
	 * @return The created directory.
	 */
	public static File createPersistentDir(BundleContext ctx, String dirName) {
		File f3 = null;

		f3 = ctx.getDataFile(dirName);
		if(!f3.exists())
			f3.mkdirs();

		return f3;
	}



	/**
	 * Creates a file at the root of the persistence directory given by the platform.<br />
	 * It do not creates the file if it already exists.
	 * @param ctx A BundleContext, needed to get the persistence.
	 * @param fileName The name of the file to create. 
	 * @return The persistent file created, or the already existing file.
	 */
	public static File createPersistentFile(BundleContext ctx, String fileName) {

		File f3 = null;

		try {	

			f3 = ctx.getDataFile(fileName);
			if(!f3.exists())
				f3.createNewFile();

		} catch (IOException e) {
			logger.error("IOException", e);
		}
		return f3;
	}

	/**
	 * Creates a file in the given relative directory, in the persistence directory given by the platform.<br />
	 * It do not creates the file if it already exists.
	 * It creates the directories if they do not exists.
	 * @param ctx A BundleContext, needed to get the persistence.
	 * @param directory The relative directory name in witch the file will be created.
	 * @param fileName The name of the file to create.
	 * @return The persistent file created, or the already existing file.
	 */
	public static File createPersistentFile(BundleContext ctx, String directory, String fileName) {

		createPersistentDir(ctx, directory);
		return createPersistentFile(ctx, directory + "/" + fileName);
	}


	/**
	 * Retreives a persistent file of the given directory, from the persistence directory given by the platform, if the file exists.
	 * @param fileName The name of the file to get
	 * @return The File if exists, null otherwise.
	 */
	public static File getPersistentFile(BundleContext ctx, String directory, String fileName) {
		return getPersistentFile(ctx, directory + "/" + fileName);
	}

	/**
	 * Retreives a persistent file from the persistence directory given by the platform, if the file exists.
	 * @param fileName The name of the file to get
	 * @return The File if exists, null otherwise.
	 */
	public static File getPersistentFile(BundleContext ctx, String fileName) {

		File f3 = null;
		f3 = ctx.getDataFile(fileName);
		if(!f3.exists())
			return null;
		return f3;
	}


}
