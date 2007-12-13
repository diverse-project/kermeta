/* $Id: SimpleFileIO.java,v 1.7 2007-12-13 09:18:57 cfaucher Exp $
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

package fr.irisa.triskell.kermeta.runtime.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class SimpleFileIO {
	
	public static RuntimeObject fileExists(RuntimeObject filename)
    {
		java.lang.String fname = getOSFileLocation(String.getValue(filename));
		File file = new File(fname);
		if (file.exists()) return filename.getFactory().getMemory().trueINSTANCE;
		else return filename.getFactory().getMemory().falseINSTANCE;
    }
	
	public static RuntimeObject fileIsDirectory(RuntimeObject filename)
    {
		java.lang.String fname = getOSFileLocation(String.getValue(filename));
		File file = new File(fname);
		if (file.isDirectory()) return filename.getFactory().getMemory().trueINSTANCE;
		else return filename.getFactory().getMemory().falseINSTANCE;
    }
	
	
	public static RuntimeObject writeTextFile(RuntimeObject filename, RuntimeObject text)
    {
		
        try
        {
        	/*
        	 * Getting the directory        	 
        	 */
        	java.lang.String filePath = getOSFileLocation(String.getValue(filename));
        	
        	int i = filePath.lastIndexOf("/");
        	java.lang.String folderPath = filePath.substring(0, i);
        	
        	/*
        	 * Checking for its existency
        	 */
        	File folder = new File( folderPath );
        	if ( ! folder.exists() )
        		folder.mkdirs();
        	
        	FileWriter fw = new FileWriter( filePath );
            fw.write(String.getValue(text));
            fw.close();
            
            // Refresh the content of the folder that contains the created file
        	try {
            	int i_folder = String.getValue(filename).lastIndexOf("/");
				ResourceHelper.getIFolder(String.getValue(filename).substring(0, i_folder)).refreshLocal(1, new NullProgressMonitor());
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
    		java.lang.String sfileName = getOSFileLocation(String.getValue(filename));
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
    	java.lang.String filePath = ResourceHelper.cleanIfNecessaryPath(fileEclipsePath);

    	IPath wkspace_path = ResourcesPlugin.getWorkspace().getRoot().getLocation();
    	filePath = wkspace_path.toString() + filePath;
    	
    	//convert windows delimiter into /
    	filePath = filePath.replaceAll("\\\\", "/");
    	
    	return filePath;
    }
    
    /**
     * 
     * @param foldername
     * @return path of the current folder of the file calling this operation
     */
    public static RuntimeObject getAbsolutePathFolder(RuntimeObject foldername)
    {   	
    	IFile fileKermeta = ResourceHelper.getIFile(foldername.getFactory().getMemory().getUnit().getUri());
    	RuntimeObject result = null;

    	if (fileKermeta.exists()){
    		java.lang.String pathFile = fileKermeta.getLocation().toString();
        	java.lang.String pathFolder = pathFile.substring(0,pathFile.lastIndexOf("/")+1) + String.getValue(foldername);
   		 	
   		 	
   		 	File folder = new File(pathFolder);
   		 	if (folder.exists()){
   		 		result = String.create(pathFolder, foldername.getFactory());
   		 	}else{
   		 		result = String.create("Cannot find path.", foldername.getFactory());
   		 	}
    	}else{
    		result = String.create("Cannot find path.", foldername.getFactory());
    	}
    	
		return result;
    }
}
