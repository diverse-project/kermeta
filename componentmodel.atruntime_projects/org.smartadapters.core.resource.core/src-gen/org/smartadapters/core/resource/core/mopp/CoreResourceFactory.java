/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

public class CoreResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public CoreResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.smartadapters.core.resource.core.mopp.CoreResource(uri);
	}
}
