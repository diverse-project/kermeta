/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

public interface IArtextBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(art.resource.artext.mopp.ArtextResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
