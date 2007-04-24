/**
 * 
 */
package fr.irisa.triskell.kermeta.kpm.resources;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;

import fr.irisa.triskell.eclipse.ecore.XMIHelper;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMPlugin;
import fr.irisa.triskell.kermeta.kpm.preferences.KPMConstants;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

/**
 * @author ftanguy
 *
 */
public class KermetaProject {
	
	/**
	 * The corresponding eclipse resource.
	 */
	private IProject project;
	
	/**
	 * The KPM object used for the depencies.
	 */
	private KPM kpm;
	
	/**
	 * The unit corresponding to the project in the KPM file.
	 */
	private Unit projectUnit = null;
	
	/**
	 * Constant for the KPM file name.
	 */
	static private final String kpmFileName = ".project.kpm";
	
	public KermetaProject(IProject project) throws CoreException {
		this.project = project;
		initialize();
	}
	
	/**
	 * 
	 * @return The full path plus name of the KPM file.
	 */
	private String getKpmFilePathString() {
		return project.getLocation().toString() + "/" + kpmFileName;
	}

	/**
	 * 
	 * @return Returns an Eclipse resource on the KPM file.
	 */
	public IFile getKpmIFile() {
		Path path = new Path( project.getFullPath().toString() + "/" + kpmFileName );
		return ResourcesPlugin.getWorkspace().getRoot().getFile( path );
	}
	
	/**
	 * Initialize the Kermeta Project.
	 * Try to load the KPM file and restore the depdencies if the file exist.
	 * If the file does not exist, a default one is created and loaded.
	 * @throws CoreException 
	 * @throws CoreException
	 */
	private void initialize() throws CoreException {
		IFile file = getKpmIFile();
		if ( ! file.exists() ) {
			initializeConstants();
			kpm = KPMHelper.getDefaultKPM(project);
			//kpm = KpmFactory.eINSTANCE.createKPM();
			save();
		} else {
			load();
		}
	}
	
	private void initializeProjectUnit() {
		projectUnit = kpm.findUnit(project.getFullPath().toString());
	}
	
	private void initializeConstants() throws CoreException {
		QualifiedName key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "applyRequireDependencies");
		project.setPersistentProperty(key, KPMConstants.KERMETAPROJECT_PREF_APPLYREQUIREDEPENDENCIES_DEFAULTVALUE);
		key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "generateKM");
		project.setPersistentProperty(key, KPMConstants.KERMETAPROJECT_PREF_GENERATEKM_DEFAULTVALUE);
		key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "forceOpening");
		project.setPersistentProperty(key, "true");
	}
	
	public void open() throws CoreException {
		Iterator <Unit> iterator = kpm.getUnits().iterator();
		// There could be two unit for the same project. We process the first and ignore the others.
		boolean done = false;
		while ( !done && iterator.hasNext() ) {
			Unit currentUnit = iterator.next();
			if ( currentUnit.getValue().equals(project.getFullPath().toString()) ) {
				done = true;
				QualifiedName key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "forceOpening");
				String value = project.getPersistentProperty(key);
				if ( value.equals("true") ) {
					HashMap map = new HashMap();
					map.put("forceOpening", true);
					currentUnit.receiveAsynchroneEvent( "open", map );
					project.setPersistentProperty(key, "false");
				} else
					currentUnit.receiveAsynchroneEvent( "open", null );
			}
		}
	}
	
	/**
	 * Get the KPM object.
	 * @return
	 */
	public KPM getKpm() {
		return kpm;
	}
	
	/**
	 * 
	 * @return Returns the eclipse resource corresponding to the current Kermeta Project.
	 */
	public IProject getValue() {
		return project;
	}
	
	/**
	 * 
	 * @return Returns the unit associated to the project.
	 */
	public Unit getProjectUnit() {
		if (projectUnit == null)
			initializeProjectUnit();
		return projectUnit;
	}
	
	/**
	 * Load the kpm file for the current project.
	 * The file existency must have been checked before calling this method.
	 *
	 */
	private void load() throws CoreException {
		try {
			kpm = (KPM) XMIHelper.load( getKpmFilePathString() );
		} 
		catch (IOException exception) {
			rescueLoad();
		}
		catch (java.lang.IllegalArgumentException exception){
			rescueLoad();
		}
	}
	
	/**
	 * used to rescue a load that has failed
	 * @throws CoreException
	 */
	private void rescueLoad() throws CoreException {
		//	If loading fails, it means that the metamodel has changed.
		// The current KPM file is no longer supported.
		// A default one is created.
		kpm = KPMHelper.getDefaultKPM(project);
		initializeConstants();
		KPMPlugin.getDefault().getLog().log(new Status(Status.WARNING, "fr.irisa.triskell.kermeta.kpm",
                Status.OK, 
                "Not able to load the .project.kpm; of project " + project.getName() + " it has been reinitilized", 
                null));
		KPMPlugin.internalLog.warn("Not able to load the .project.kpm; of project " + project.getName() + " it has been reinitilized");
		save();
	}
	
	/*public void reload() {
		load();
		try {
			IResourceHelper.reattachKermetaBuilder(this);
		} catch (CoreException exception) {
			exception.printStackTrace();
		}
	}*/
	
	/**
	 * Save the KPM object into an xmi file.
	 * Create the file if it does not exist.
	 */
	public void save() {
		try {
			XMIHelper.save( getKpmFilePathString(), kpm);
			//project.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (IOException exception) {
			exception.printStackTrace();
		} /*catch (CoreException exception) {
			exception.printStackTrace();	
		}*/
	}
	
	public void reinitialize() throws CoreException {
		initialize();
	}
	
	
	public String getName() {
		return project.getName();
	}
	
	
	
	
	/**
	 * 
	 * @param fileName
	 * @param filePath
	 * @return
	 */
/*	public File getFile(String fileName, String filePath) {
		return kpm.findFile(fileName, filePath);
	}*/
	
	/**
	 * 
	 * @param file
	 * @return
	 */
/*	public File getFile(IFile file) {
		return kpm.findFile(file);
	}*/
	
	/**
	 * 
	 * @param absoluteFileName
	 * @return
	 */
	/*public File getFile(String relativeFileName) {
		return kpm.findFile(relativeFileName);
	}*/
	
	/**
	 * 
	 * @param directoryName
	 * @param directoryPath
	 * @return
	 */
/*	public Directory getDirectory(String directoryName, String directoryPath) {
		return kpm.findDirectory(directoryName, directoryPath);
	}*/
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
/*	public Directory getDirectory(IFolder folder) {
		return kpm.findDirectory(folder);
	}*/
	
	/**
	 * 
	 * @param absoluteDirectoryName
	 * @return
	 */
/*	public Directory getDirectory(String relativeDirectoryName) {
		return kpm.findDirectory(relativeDirectoryName);
	}*/
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
	/*public Project getProject(IProject project) {
		return kpm.findProject(project);
	}*/
	
	/**
	 * 
	 * @param absoluteDirectoryName
	 * @return
	 */
	/*public Project getProject(String projectName) {
		return kpm.findProject(projectName);
	}*/
}
