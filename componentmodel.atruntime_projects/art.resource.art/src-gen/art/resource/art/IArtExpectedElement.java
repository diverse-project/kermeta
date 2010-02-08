/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art;

// An element that is expected at a given position in a resource
// stream.
public interface IArtExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(art.resource.art.IArtExpectedElement follower);
	public java.util.Collection<art.resource.art.IArtExpectedElement> getFollowers();
}
