/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor;

public interface IKpBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(org.kermeta.kp.editor.mopp.KpResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
