/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext;

// An element that is expected at a given position in a resource
// stream.
public interface IArtextExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(art.resource.artext.IArtextExpectedElement follower);
	public java.util.Collection<art.resource.artext.IArtextExpectedElement> getFollowers();
}
