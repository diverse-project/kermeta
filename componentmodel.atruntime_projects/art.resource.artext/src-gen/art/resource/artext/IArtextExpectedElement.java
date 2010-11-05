/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IArtextExpectedElement {
	
	public java.lang.String getTokenName();
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	public void addFollower(art.resource.artext.IArtextExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path);
	public java.util.Collection<art.resource.artext.util.ArtextPair<art.resource.artext.IArtextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers();
}
