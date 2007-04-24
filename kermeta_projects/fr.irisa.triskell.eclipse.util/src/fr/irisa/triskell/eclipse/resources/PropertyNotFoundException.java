/*$Id: PropertyNotFoundException.java,v 1.1 2007-04-24 11:32:06 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.eclipse.resources;

import org.eclipse.core.resources.IResource;

public class PropertyNotFoundException extends Exception {

	private String qualifiedNameProperty = "";
	private IResource resource;
	
	public PropertyNotFoundException(IResource resource, String qualifiedNameProperty) {
		this.resource = resource;
		this.qualifiedNameProperty = qualifiedNameProperty;
	}
	
	@Override
	public String getMessage() {
		return "The property " + qualifiedNameProperty + " does not exist for the resource " + resource;
	}
	
}
