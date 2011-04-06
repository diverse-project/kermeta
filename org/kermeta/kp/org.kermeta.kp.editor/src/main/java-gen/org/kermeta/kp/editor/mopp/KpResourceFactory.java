/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public KpResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.kermeta.kp.editor.mopp.KpResource(uri);
	}
	
}
