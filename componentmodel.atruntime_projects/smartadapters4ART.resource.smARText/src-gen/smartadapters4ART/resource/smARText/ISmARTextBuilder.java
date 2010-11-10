/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText;

public interface ISmARTextBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(smartadapters4ART.resource.smARText.mopp.SmARTextResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
