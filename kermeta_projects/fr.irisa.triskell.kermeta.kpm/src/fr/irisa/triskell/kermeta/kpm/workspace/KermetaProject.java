/**
 * 
 */
package fr.irisa.triskell.kermeta.kpm.workspace;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.KpmHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.XMIHelper;

/**
 * @author ftanguy
 *
 */
public class KermetaProject {

	private IProject project;
	
	private KPM kpm;
	
	static private final String kpmFileName = ".project.kpm";
	
	public KermetaProject(IProject project) throws CoreException {
		this.project = project;
		initialize();
	}
	
	private String getKpmFilePathString() {
		return project.getLocation().toString() + "/" + kpmFileName;
	}
	
	/*private Path getKpmFilePath() {
		return new Path(getKpmFilePathString());
	}*/
	
	public IFile getKpmIFile() {
		Path path = new Path( project.getFullPath().toString() + "/" + kpmFileName );
		return ResourcesPlugin.getWorkspace().getRoot().getFile( path );
	}
	
	private void initialize() throws CoreException {
		IFile file = getKpmIFile();
		if ( ! file.exists() ) {
			kpm = KpmHelper.createKpm();
			save();
		} else {
			load();
		}
	}
	
	public KPM getKpm() {
		return kpm;
	}
	
	public IProject getValue() {
		return project;
	}
	
	/**
	 * Load the kpm file for the current project.
	 * The file existency must have been checked before calling this method.
	 *
	 */
	private void load() {
		try {
			kpm = (KPM) XMIHelper.load( getKpmFilePathString() );
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	
	public void reload() {
		load();
		try {
			IResourceHelper.reattachKermetaBuilder(this);
		} catch (CoreException exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * Save the KPM object into an xmi file.
	 * Create the file if it does not exist.
	 */
	public void save() throws CoreException {
		try {
			if ( getKpmIFile().exists() )
				XMIHelper.save( getKpmFilePathString(), kpm);
			else {
				kpm = KpmHelper.createKpm();
				XMIHelper.save( getKpmFilePathString(), kpm);
			}
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param fileName
	 * @param filePath
	 * @return
	 */
	public File getFile(String fileName, String filePath) {
		return kpm.findFile(fileName, filePath);
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public File getFile(IFile file) {
		return kpm.findFile(file);
	}
	
	/**
	 * 
	 * @param absoluteFileName
	 * @return
	 */
	public File getFile(String relativeFileName) {
		return kpm.findFile(relativeFileName);
	}
	
	/**
	 * 
	 * @param directoryName
	 * @param directoryPath
	 * @return
	 */
	public Directory getDirectory(String directoryName, String directoryPath) {
		return kpm.findDirectory(directoryName, directoryPath);
	}
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
	public Directory getDirectory(IFolder folder) {
		return kpm.findDirectory(folder);
	}
	
	/**
	 * 
	 * @param absoluteDirectoryName
	 * @return
	 */
	public Directory getDirectory(String relativeDirectoryName) {
		return kpm.findDirectory(relativeDirectoryName);
	}
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
	public Project getProject(IProject project) {
		return kpm.findProject(project);
	}
	
	/**
	 * 
	 * @param absoluteDirectoryName
	 * @return
	 */
	public Project getProject(String projectName) {
		return kpm.findProject(projectName);
	}
}
