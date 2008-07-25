

/*$Id: KpmManager.java,v 1.3 2008-07-25 14:35:58 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	KpmManager.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 mai 08
* Authors : paco
*/

package org.kermeta.kpm;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IConfigurationElement;
import org.kermeta.kpm.internal.InternalKpmManager;

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
}


