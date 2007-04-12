

/*$Id: ResourceHelper.java,v 1.5 2007-04-12 13:03:17 ftanguy Exp $
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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;

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
	 * The resource's path may contain annoying extras schemes like platform:/resource
	 * This method checks if the existency of such schemes and remove them.
	 * @param resourcePath
	 * @return It returns the clean path.
	 */
	static private String cleanIfNecessaryPath(String resourcePath) {
		String cleanPath = resourcePath;
		if ( resourcePath.matches("platform:/resource.*") )
			cleanPath = URIHelper.getPathFromPlatformURI(resourcePath);
		return cleanPath;
	}
	
	
	/**
	 * This methods gives an IFile resource corresponding to the file path.
	 * No control is done. It means that even if the file does not exist, you will be given a resource.
	 * @see org.eclipse.core.resources.IFile
	 * @param filePath The path of the file relative to the workspace root directory (ex: /myProject/myDir/myFile). 
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
	
	
	static public IFile getIFileFromAbsoluteName(String absoluteName) {
		String relativeName = "";
		// Windows compatibility... grrrrrrr
		String rootPath = "";
		if ( absoluteName.matches("file:/.:/.+") )
			rootPath = "file:/" + root.getLocation().toString().replaceAll(" ", "%20");
		else
			rootPath = "file:" + root.getLocation().toString();
		relativeName = absoluteName.replace(rootPath, "");
		return getIFile(relativeName);
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
	
}


