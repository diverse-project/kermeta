

/*$Id: InternalKpmManager.java,v 1.4 2008-06-02 13:30:11 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	KpmManager.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.kpm.internal.builder.Initializor;
import org.kermeta.kpm.internal.builder.KPMRules;
import org.kermeta.kpm.internal.builder.ProjectVisitor;
import org.kermeta.kpm.internal.builder.ResourceChangeListener;

import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class InternalKpmManager {

	/**
	 * 
	 */
	static private InternalKpmManager _instance;
	
	/**
	 * 
	 */
	static private final String _relativePath = "/.metadata/.plugins/org.kermeta.kpm/main.kpm";
	
	/**
	 * 
	 * @return
	 */
	static public InternalKpmManager getDefault() {
		if ( _instance == null ) {
			_instance = new InternalKpmManager();
		}
		return _instance;
	}
	
	/**
	 * 
	 */
	private KPM _kpm;
	
	/**
	 * 
	 */
	private Map<String, IConfigurationElement> _extensionElements = new HashMap<String, IConfigurationElement>();
	
	/**
	 * 
	 */
	private InternalKpmManager() {
		initialize();
	}
	
	/**
	 * 
	 */
	private void initialize() {
		try {
			initializeKpm();
			initializeRules();
			initializeExtensionElements();
			initializeProjects();
			ResourcesPlugin.getWorkspace().addResourceChangeListener( new ResourceChangeListener() );
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	private void initializeRules() {
		for ( Rule r : _kpm.getRules() ) {
			if ( r.getName().equals( KPMRules.UPDATE_KMT_RULE_ID ) )
				KPMRules.UPDATE_KMT_RULE = r;
		}
	}
	
	/**
	 * @throws CoreException 
	 * 
	 */
	private void initializeKpm() throws CoreException {
		URI uri = URI.createFileURI( getKpmPath() );
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(uri);
		try {
			r.load(null);
			_kpm = (KPM) r.getContents().get(0);
		} catch (IOException e) {
			_kpm = KpmFactory.eINSTANCE.createKPM();
			r.getContents().add(_kpm);
			Initializor i = new Initializor(_kpm, true);
			ResourcesPlugin.getWorkspace().getRoot().accept(i);
			try {
				r.save(null);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	/**
	 * 
	 */
	private void initializeExtensionElements() {
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor( "fr.irisa.triskell.kermeta.kpm.javaAction" );
		for ( IConfigurationElement e : elements ) {
			String id = e.getAttribute("id");
			if ( id != null )
				_extensionElements.put(id, e);
		}
	}
	
	/**
	 * 
	 * @return
	 */
	private String getKpmPath() {
		return ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + _relativePath;
	}
	
	/**
	 * @throws CoreException 
	 * 
	 */
	private void initializeProjects() throws CoreException {
		ProjectVisitor v = new ProjectVisitor();
		ResourcesPlugin.getWorkspace().getRoot().accept(v);
	}
	
	/**
	 * 
	 * @return
	 */
	public KPM getKpm() {
		return _kpm;
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Unit getUnit(String name) {
		return _kpm.getUnit(name);
	}
	
	/**
	 * 
	 * @param resource
	 * @return
	 */
	public Unit getUnit(IResource resource) {
		return getUnit( "platform:/resource" + resource.getFullPath().toString() );
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Rule getRule(String name) {
		for ( Rule r : _kpm.getRules() )
			if ( r.getName().equals(name) )
				return r;
		return null;
	}
	
	/**
	 * 
	 * @param actionId
	 * @return
	 */
	public IConfigurationElement getConfigurationElement(String actionId) {
		return _extensionElements.get(actionId);
	}
	
	/**
	 * 
	 */
	private List<IProject> _projectsBeingBuilt = new ArrayList<IProject>();

	/**
	 * 
	 * @param p
	 */
	public void addProject(IProject p) {
		synchronized( _projectsBeingBuilt ) {
			_projectsBeingBuilt.add(p);
		}
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	public boolean isBeingBuilt(IProject p) {
		synchronized ( _projectsBeingBuilt ) {
			return _projectsBeingBuilt.contains(p);
		}
	}
	
	/**
	 * 
	 * @param p
	 */
	public void removeProject(IProject p) {
		synchronized ( _projectsBeingBuilt ) {
			_projectsBeingBuilt.remove(p);
		}
	}
}


