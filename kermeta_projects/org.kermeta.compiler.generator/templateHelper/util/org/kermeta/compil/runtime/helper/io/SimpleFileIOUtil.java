/* $Id: SimpleFileIOUtil.java,v 1.2 2008-08-18 08:49:06 cfaucher Exp $
 * Project: Kermeta (First iteration)
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

package org.kermeta.compil.runtime.helper.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;


public class SimpleFileIOUtil {
	
	public static java.lang.Boolean fileExists(java.lang.String filename) {
		java.lang.String fname = getOSFileLocation(filename);
		File file = new File(fname);
		return file.exists();
    }
	
	public static java.lang.Boolean fileIsDirectory(java.lang.String filename) {
		java.lang.String fname = getOSFileLocation(filename);
		File file = new File(fname);
		return file.isDirectory();
    }
	
	
	public static void writeTextFile(java.lang.String filename, java.lang.String text) {
		
        try {
        	/*
        	 * Getting the directory        	 
        	 */
        	java.lang.String filePath = getOSFileLocation(filename);
        	
        	int i = filePath.lastIndexOf("/");
        	java.lang.String folderPath = filePath.substring(0, i);
        	
        	if ( folderPath.startsWith("platform:/resource") ) {
        		java.lang.String platformFolderPath = folderPath.replace("platform:/resource", "");
        		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder( new Path(platformFolderPath) );
        		folderPath = folder.getLocation().toString();
        		filePath = folderPath + filePath.substring(i);
        	}
        	       	
        	/*
        	 * Checking for its existency
        	 */
        	File folder = new File( folderPath );
        	if ( ! folder.exists() )
        		folder.mkdirs();
        	
        	FileWriter fw = new FileWriter( filePath );
            fw.write(text);
            fw.close();
            
            // Refresh the content of the folder that contains the created file
        	try {
            	int i_folder = filename.lastIndexOf("/");
            	if(i_folder == -1){
            		// maybe this is a windows like path
            		i_folder = filename.lastIndexOf("\\");
            	}
				IFolder result_folder = ResourceHelper.getIFolder(filename.substring(0, i_folder));
				if(result_folder != null)
					result_folder.refreshLocal(1, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
    }

    public static java.lang.String readTextFile(java.lang.String filename) {
        BufferedReader br = null;
        StringBuilder builder = new StringBuilder();
        java.lang.String ligne;
       	try {
       		//convert windows delimiter into /    		
    		java.lang.String sfileName = getOSFileLocation(filename);
			br = new BufferedReader(new FileReader(sfileName));
			while((ligne = br.readLine()) != null) builder.append(ligne + "\n");
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return builder.toString();
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
    	
    	return filePath;
    }
    
    /**
     * Patch from the plugin fr.irisa.triskell.eclipse.util
     * 
     * @param resourcePath
     * @return
     */
	 private static java.lang.String cleanIfNecessaryPath(java.lang.String resourcePath) {
		// deal with windows \\ delimiter
		java.lang.String unifiedSepratorResourcePath = resourcePath.replaceAll("\\\\", "/");
		
		java.lang.String cleanPath = unifiedSepratorResourcePath;
		if ( unifiedSepratorResourcePath.matches("platform:/resource.*") ) {
			URI uri = URI.createURI(unifiedSepratorResourcePath);
			URIConverter converter = new ExtensibleURIConverterImpl();
			uri = converter.normalize(uri);
			cleanPath = uri.toString();
		}
		return cleanPath;
	}

}
