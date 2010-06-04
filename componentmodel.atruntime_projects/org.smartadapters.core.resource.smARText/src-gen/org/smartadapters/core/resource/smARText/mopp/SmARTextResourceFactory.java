/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

public class SmARTextResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public SmARTextResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextResource(uri);
	}
}
