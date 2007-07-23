/*$Id: KermetaProject.java,v 1.10 2007-07-23 14:00:58 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.resources;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;

import fr.irisa.triskell.eclipse.ecore.XMIHelper;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.builder.KPMResourceVisitor;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMPlugin;
import fr.irisa.triskell.kermeta.kpm.properties.KPMConstants;

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
	 * The KPM object used for the dependencies.
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
	
	/**
	 * Constructor
	 * @param project
	 * @throws CoreException
	 */
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
		return ResourceHelper.getIFile( project.getFullPath().toString() + "/" + kpmFileName );
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
		if ( file == null ) {
			initializeConstants();
			kpm = KPMHelper.getDefaultKPM(project);
	    	KPMResourceVisitor visitor = new KPMResourceVisitor(this);
	    	project.accept(visitor);
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
				if ( (value == null) || value.equals("true") ) {
					HashMap map = new HashMap();
					map.put("forceOpening", true);
					currentUnit.receiveAsynchroneEvent( "open", map, null );
					project.setPersistentProperty(key, "false");
				} else
					currentUnit.receiveAsynchroneEvent( "open", null, null );
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
	
	/**
	 * Save the KPM object into an xmi file.
	 * Create the file if it does not exist.
	 */
	public void save() {
		Runnable runnable = new Runnable() {

			public void run() {

			    IWorkspaceRunnable runnable= new IWorkspaceRunnable() {
			    	public void run(IProgressMonitor monitor) throws CoreException {
			    		try {
			    			XMIHelper.save( getKpmFilePathString(), kpm);
			    			IFile kpmFile = getKpmIFile();
			    			if ( kpmFile != null )
			    				kpmFile.refreshLocal(0, monitor);
			    		} catch (IOException exception) {
			    			exception.printStackTrace();
			    		} 
			    	}
			    };
			    try {
					ResourcesPlugin.getWorkspace().run(runnable, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
				
		};

		Thread t = new Thread(runnable);
		t.start();
			
	}
	
	public void reinitialize() throws CoreException {
		initialize();
	}
	
	
	public String getName() {
		return project.getName();
	}

}
