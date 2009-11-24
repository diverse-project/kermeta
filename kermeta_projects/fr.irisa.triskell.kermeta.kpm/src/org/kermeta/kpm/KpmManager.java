

/*$Id: KpmManager.java,v 1.4 2008-09-23 14:24:49 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	KpmManager.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 mai 08
* Authors : paco
*/

package org.kermeta.kpm;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.jobs.ILock;
import org.eclipse.core.runtime.jobs.Job;
import org.kermeta.kpm.internal.InternalKpmManager;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * A proxy to InternalKpmManager
 * 
 * @author paco
 *
 */
public class KpmManager {

	/**
	 * 
	 */
	private InternalKpmManager _manager;
	
	/**
	 * 
	 */
	static private KpmManager _instance;
	
	/**
	 * 
	 * @return
	 */
	static public KpmManager getDefault() {
		if ( _instance == null )
			_instance = new KpmManager();
		return _instance;
	}

	/**
	 * 
	 */
	public KpmManager() {
		initialize();
	}
	
	/**
	 * 
	 */
	private void initialize() {
		// make sure the internal manager is initialized
		_manager = InternalKpmManager.getDefault();
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Unit getUnit(String name) {
		return _manager.getUnit(name);
	}
	
	/**
	 * 
	 * @param resource
	 * @return
	 */
	public Unit conditionalAddUnit(IResource resource) {
		return _manager.conditionalAddUnit(resource);
	}
	
	/**
	 * 
	 * @param resource
	 * @return
	 */
	public Unit conditionalAddUnit(String resourceName) {
		IResource resource;
		resource = ResourceHelper.getIFile(resourceName);
		return _manager.conditionalAddUnit(resource);
	}
	
	/**
	 * 
	 * @param resource
	 * @return
	 */
	public Unit getUnit(IResource resource) {
		return _manager.getUnit(resource);
	}
	
	/**
	 * 
	 * @param actionId
	 * @return
	 */
	public IConfigurationElement getConfigurationElement(String actionId) {
		return _manager.getConfigurationElement(actionId);
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	public boolean isBeingBuilt(IProject p) {
		return _manager.isBeingBuilt(p);
	}
	
	/**
	 * 
	 * @param p
	 */
	public void addProject(IProject p) {
		_manager.addProject(p);
	}
	/**
	 * 
	 * @param p
	 */
	public void removeProject(IProject p) {
		_manager.removeProject(p);
	}
	
	/**
	 * Re initialize KPM
	 */
	public void resetKPM(){
		_manager.reset();
		// get the new version of the manger
		initialize();
	}
	
	/**
	 * 
	 * @return the currently used KPM configuration
	 */
	public KPM getKpm(){
		
		return _manager.getKpm();
	}
	
	synchronized public void save(){
		try {
			_manager.getKpm().eResource().save(null);
		} catch (IOException e) {
			KPMPlugin.logErrorMessage("Failed to save kpm file " + _manager.getKpm().eResource().getURI().toFileString(), e);
		}
	}
	
	private static ILock kpmlock = Job.getJobManager().newLock();
	public ILock getKPMLock(){
		return kpmlock;
	}
	
}


