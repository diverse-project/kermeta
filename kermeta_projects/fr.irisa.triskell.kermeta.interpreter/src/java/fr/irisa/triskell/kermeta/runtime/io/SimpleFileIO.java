/* $Id: SimpleFileIO.java,v 1.16 2008-11-19 16:45:26 cfaucher Exp $
 * Project: Kermeta 
 * File: SimpleFileIO.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: March 1, 2007
 * Authors:
 * 		ffleurey
 * 		jmottu
 * 		ftanguy
 * 		dvojtise
 * 		cfaucher
 */

package fr.irisa.triskell.kermeta.runtime.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Repository;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;


/**
 * Wrapper for FileIO
 *
 */
public class SimpleFileIO {
	
	public static RuntimeObject fileExists(RuntimeObject filename)
    {
		/* java.lang.String fname = getOSFileLocation(String.getValue(filename));
		
		java.lang.String filePath = fname;
		
		if ( fname.startsWith("platform:/resource") ) {
    		java.lang.String platformFname = fname.replace("platform:/resource", "");
    		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder( new Path(platformFname) );
    		filePath = folder.getLocation().toString();
    	}
		
		File file = new File(filePath.replace("file://", "").replace("file:/", ""));
		URL url;
		try {
			url = new URL(String.getValue(filename));
		
			file = new File(FileLocator.toFileURL(url).getFile());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		File file = getFileFromURI(filename);
		if ( file.exists() ) 
			return filename.getFactory().getMemory().trueINSTANCE;
		else 
			return filename.getFactory().getMemory().falseINSTANCE;
    }
	
	public static RuntimeObject fileIsDirectory(RuntimeObject filename)
    {
		/*
		java.lang.String fname = getOSFileLocation(String.getValue(filename));
		
		java.lang.String filePath = fname;
		
		if ( fname.startsWith("platform:/resource") ) {
    		java.lang.String platformFname = fname.replace("platform:/resource", "");
    		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder( new Path(platformFname) );
    		filePath = folder.getLocation().toString();
    	}
		
		File file = new File(filePath.replace("file://", "").replace("file:/", ""));
		*/
		File file = getFileFromURI(filename);
		if (file.isDirectory()) 
			return filename.getFactory().getMemory().trueINSTANCE;
		else 
			return filename.getFactory().getMemory().falseINSTANCE;
    }
	
	/**
	 * static operation as called by kermeta extern fr::irisa::triskell::kermeta:runtime::io::SimpleFileIO.writeTextFile
	 * @param filename
	 * @param text
	 * @return
	 */
	public static RuntimeObject writeTextFile(RuntimeObject filename, RuntimeObject text) {
		writeTextFileWithEncoding(filename, text, null);
        return filename.getFactory().getMemory().voidINSTANCE;
    }
	
	/**
	 * static operation as called by kermeta extern fr::irisa::triskell::kermeta:runtime::io::SimpleFileIO.writeTextFileWithEncoding
	 * @param filename
	 * @param text
	 * @param encoding
	 * @return
	 */
	public static RuntimeObject writeTextFileWithEncoding(RuntimeObject filename, RuntimeObject text, RuntimeObject encoding) {

		
        try {
        	/*
        	 * Getting the directory        	 
        	 */
        	java.lang.String filePath = getOSFileLocation(String.getValue(filename));
        	
        	filePath = Repository.normalizeUri(filePath, 
        			filename.getFactory().getMemory().getUnit(), 
        			filename.getFactory().getMemory().getInterpreter());
	
        	
        	int i = filePath.lastIndexOf("/");
        	java.lang.String folderPath = filePath.substring(0, i);
        	java.lang.String platformFolderPath = folderPath;
        	IFolder result_folder = null;
        	if ( folderPath.startsWith("platform:/resource") ) {
        		java.lang.String notPlatformFolderPath = folderPath.replace("platform:/resource", "");
        		// is this a project ?
        		if(notPlatformFolderPath.lastIndexOf("/")==0){
        			IProject project = ResourceHelper.getIProject(notPlatformFolderPath.replace("/", ""));
        			result_folder = project.getFolder(notPlatformFolderPath+"/");
        			folderPath = project.getLocation().toString();
	        		filePath = folderPath + filePath.substring(i);
        		}
        		else {
        			
        			result_folder = ResourcesPlugin.getWorkspace().getRoot().getFolder( new Path(notPlatformFolderPath) );
	        		IProject project = result_folder.getProject();
	        		if(!project.exists()){
	        			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::IOException",
	        	    			"Cannot write file because project '" + project.getName() + "' doesn't exist. (we can create intermediate folders but cannot create the project)",
	        	    			filename.getFactory().getMemory().getInterpreter().getBasicInterpreter(),
	        	    			filename.getFactory().getMemory(),
	        	    			null);
	        		}
	        		folderPath = result_folder.getLocation().toString();
	        		filePath = folderPath + filePath.substring(i);
        		}
        	}
        	       	
        	/*
        	 * Checking for its existence
        	 */
        	File folder = new File( folderPath.replace("file://", "").replace("file:/", "") );
        	if ( ! folder.exists() )
        		folder.mkdirs();
        	
        	BufferedWriter out = null;
        	if( encoding!=null ) { // Write with a specific encoding
        		out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(filePath.replace("file://", "").replace("file:/", "")), String.getValue(encoding)));
        	} else { // Write with the default encoding
        		out = new BufferedWriter(new OutputStreamWriter(
    					new FileOutputStream(filePath.replace("file://", "").replace("file:/", ""))));
        	}
        	
            out.write(String.getValue(text));
            out.close();
            
            // Refresh the content of the folder that contains the created file
        	try {
            	if(result_folder == null) result_folder = ResourceHelper.getIFolder(platformFolderPath);
				if(result_folder != null)
					result_folder.refreshLocal(1, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        return filename.getFactory().getMemory().voidINSTANCE;
    }

    public static RuntimeObject readTextFile(RuntimeObject filename)
    {
        BufferedReader br = null;
        StringBuilder builder = new StringBuilder();
        java.lang.String ligne;
       	try {
       		//convert windows delimiter into /    		
    	//	java.lang.String sfileName = getOSFileLocation(String.getValue(filename));
    	/*	
    		java.lang.String sfilePath = sfileName;
    		
    		if ( sfileName.startsWith("platform:/resource") ) {
        		java.lang.String platformFname = sfileName.replace("platform:/resource", "");
        		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder( new Path(platformFname) );
        		sfilePath = folder.getLocation().toString();
        	}
    	*/
    		/*
    		//URL url = new URL(String.getValue(filename));
    		java.net.URI uri = new java.net.URI(String.getValue(filename));  //URI.createURI(String.getValue(filename));
    		//File file = new File(FileLocator.toFileURL(url).getFile());
    		File file = new File(uri);
    		*/
    		File file = getFileFromURI(filename);
			br = new BufferedReader(new FileReader(file));
			while((ligne = br.readLine()) != null) builder.append(ligne + "\n");
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	/*	} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			*/
		}
        RuntimeObject result = String.create(builder.toString(), filename.getFactory());
        return result;
    }
    
    /**
     * 
     * @param fileEclipsePath
     * @return
     */
    private static java.lang.String getOSFileLocation(java.lang.String fileEclipsePath) {
    	// FIXME CF Here we did the assumption that the path is absolute (towards the Eclipse workspace) !
    	// We should here recalculate the path of the file if filePath is a relative path !
    	java.lang.String filePath = cleanIfNecessaryPath(fileEclipsePath);

    	//IPath wkspace_path = ResourcesPlugin.getWorkspace().getRoot().getLocation();
    	//filePath = wkspace_path.toString() + filePath;
    	
    	//convert windows delimiter into /
    	filePath = filePath.replaceAll("\\\\", "/");
    	
    	return filePath;
    }
    
    /**
     * Ugly patch
     * 
     * @param resourcePath
     * @return
     */
	static private java.lang.String cleanIfNecessaryPath(java.lang.String resourcePath) {
		// deal with windows \\ delimiter
		java.lang.String unifiedSepratorResourcePath = resourcePath.replaceAll("\\\\", "/");
		
		java.lang.String cleanPath = unifiedSepratorResourcePath;
		if ( unifiedSepratorResourcePath.matches("platform:/resource.*") ) {
			URI uri = URI.createURI(unifiedSepratorResourcePath);
			URIConverter converter = new ExtensibleURIConverterImpl();
			uri = converter.normalize(uri);
			cleanPath = uri.toString();
			//cleanPath = ResourceHelper.root.getLocation().toString() + URIHelper.getPathFromPlatformURI(resourcePath);
		}
		return cleanPath;
	}
	
	static public File getFileFromURI(RuntimeObject filename){
		java.net.URI uri;
		File file;
		try {
			uri = new java.net.URI(String.getValue(filename));
			file = new File(FileLocator.toFileURL(uri.toURL()).getFile());
		} catch (URISyntaxException e) {
			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::IOException",
	    			"Unsupported URI syntax '" + String.getValue(filename) + "' ",
	    			filename.getFactory().getMemory().getInterpreter().getBasicInterpreter(),
	    			filename.getFactory().getMemory(),
	    			e);
		} catch (MalformedURLException e) {
			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::IOException",
	    			"Unsupported URI syntax '" + String.getValue(filename) + "' ",
	    			filename.getFactory().getMemory().getInterpreter().getBasicInterpreter(),
	    			filename.getFactory().getMemory(),
	    			e);
		} catch (IOException e) {
			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::IOException",
	    			"Unsupported URI syntax '" + String.getValue(filename) + "' ",
	    			filename.getFactory().getMemory().getInterpreter().getBasicInterpreter(),
	    			filename.getFactory().getMemory(),
	    			e);
		} 
		//File file = new File(uri);
		return file;
	}

}
