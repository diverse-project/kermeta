/*$Id: ResourceHelper.java,v 1.7 2007-04-18 09:05:57 dvojtise Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	ResourceHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 7, 2007
* Authors : ftanguy
*/

/**
 * 
 */
package fr.irisa.triskell.eclipse.resources;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

/**
 * @author ftanguy
 *
 */
public class ResourceHelper {

	/**
	 * The eclipse workspace.
	 */
	static final public IWorkspace workspace = ResourcesPlugin.getWorkspace();
	
	/**
	 * The eclipse workspace's root
	 */
	static final public IWorkspaceRoot root = workspace.getRoot();
	
	
	/**
	 * The resource's path may contain annoying extras schemes like platform:/resource or file:/${workspacelocation}
	 * This method checks if the existency of such schemes and remove them.
	 * @param resourcePath
	 * @return It returns the clean path.
	 */
	static private String cleanIfNecessaryPath(String resourcePath) {
		String cleanPath = resourcePath;
		if ( resourcePath.matches("platform:/resource.*") )
			cleanPath = URIHelper.getPathFromPlatformURI(resourcePath);
		if ( resourcePath.matches("file:/.*") ){
			String rootPath = ""; // path of the workspace root that we will remove from the resource path			
			// deal with windows C:/ path
			if ( resourcePath.matches("file:/.:/.+") )
				rootPath = "file:/" + root.getLocation().toString().replaceAll(" ", "%20");
			else
				rootPath = "file:" + root.getLocation().toString();
				
			cleanPath = resourcePath.replace(rootPath, "");
		}
		return cleanPath;
	}
	
	
	/**
	 * This methods gives an IFile resource corresponding to the file path in the workspace.
	 * No control is done. It means that even if the file does not exist, you will be given a resource.
	 * Note: it cannot retreive IFile outside of the workspace
	 * @see org.eclipse.core.resources.IFile
	 * @param filePath The path of the file. It accepts several formats:
	 * 		- relative to the workspace root directory (ex: /myProject/myDir/myFile).
	 * 		- platform:/resource url (ex: platform:/resource/myProject/mydir/myFile).
	 * 		- file:/ url (ex: file:/C:/eclipse/workspace/myProject/mydir/myFile or file:/udd/userName/eclipse/workspace/myProject/mydir/myFile
	 * 			note that in this case it will work only if the file is really in the workspace 
	 * @return The method returns an IFile resource.
	 */
	static public IFile getIFile(String filePath) {
		String cleanPath = cleanIfNecessaryPath(filePath);
		Path path = new Path(cleanPath);
		try {
			return root.getFile(path);
		} catch (java.lang.IllegalArgumentException exception) {
			return null;
		}
	}
	
	/**
	 * This method is the same as calling getIFile with filePath + "/" + fileName as argument.
	 * @see ResourceHelper#getIFile(String filePath)
	 * @param filePath
	 * @param fileName
	 * @return The method returns an IFile resource
	 */
	static public IFile getIFile(String filePath, String fileName) {
		return getIFile( filePath + "/" + fileName );
	}	
	
	/**
	 * This methods gives an IFolder resource corresponding to the folder path.
	 * No control is done. It means that even if the folder does not exist, you will be given a resource.
	 * @see{org.eclipse.core.resources.IFolder}
	 * @param folderPath The path of the folder relative to the workspace root directory (ex: /myProject/myFolder). 
	 * @return The method returns an IFolder resource.
	 */
	static public IFolder getIFolder(String folderPath) {
		String cleanPath = cleanIfNecessaryPath(folderPath);
		Path path = new Path(cleanPath);
		try {
			return root.getFolder(path);	
		} catch (java.lang.IllegalArgumentException exception) {
			return null;
		}
	}
	
	/**
	 * This method is the same as calling getIFolder with folderPath + "/" + folderName as argument.
	 * @see ResourceHelper#getIFolder(String folderPath)
	 * @param folderPath
	 * @param folderName
	 * @return The method returns an IFolder resource.
	 */
	static public IFolder getIFolder(String folderPath, String folderName) {
		return getIFolder( folderPath + "/" + folderName );
	}
	
	
	
	
	/**
	 * This methods gives an IProject resource corresponding to the project name.
	 * No control is done. It means that even if the project does not exist, you will be given a resource.
	 * @see{org.eclipse.core.resources.IProject}
	 * @param projectName The name of the project relative to the workspace root directory. 
	 * @return The method returns an IProject resource.
	 */
	static public IProject getIProject(String projectName) {
		return root.getProject(projectName);
	}
	
	
	static public String getFileExtension(String filePath) {
		IFile file = getIFile(filePath);
		return file.getFileExtension();
	}

	/*static public IContainer getIContainer(String containerPath) {
		return root.getContainerForLocation( new Path(containerPath) );
	}*/
	
	/**
     * Calculate the linenumber for a given offset in a IFile
     * doesn't crashes, simply returns 1 if it cannot find the file (+ a stack trace on the console)
     * @param charnum	position in the file 
     * @param file
     * @return
     */
    public static int calculateLineNumber(int charnum, IFile file)
    {
    	int linenum = 1;int c; int charcount = 0;
        try
        {
            InputStream in = file.getContents();
            while ((c = in.read()) != -1 && charcount<=charnum) {
                charcount += 1;
                if (c=='\n') linenum += 1;
            }
            in.close();
        } 
        catch (IOException e) { e.printStackTrace(); return -1;}
        catch (CoreException e){ e.printStackTrace(); return -1;}
        return linenum;
    }
    /**
     * Calculate the linenumber for a given offset in a file
     * doesn't crashes, simply returns 1 if it cannot find the file (+ a stack trace on the console)
     * this version is a little bit more permissive than  calculateLineNumber(int charnum, IFile file) since it can open file outside of the workspace
     * @param charnum	position in the file 
     * @param fileuri	URI of the file
     * @return
     */
    public static int calculateLineNumber(int charnum, String fileuri)
    {
    	int linenum = 1;int c; int charcount = 0;
        try
        {
            InputStream in = new URIConverterImpl( ).createInputStream(URI.createURI(fileuri));
            while ((c = in.read()) != -1 && charcount<=charnum) {
                charcount += 1;
                if (c=='\n') linenum += 1;
            }
            in.close();
        } 
        catch (IOException e) { e.printStackTrace(); return -1;}
        return linenum;
    }
}


