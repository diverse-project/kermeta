/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core;

public interface ICoreBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(org.smartadapters.core.resource.core.mopp.CoreResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
