/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class ArtextAbstractExpectedElement implements art.resource.artext.IArtextExpectedElement {
	
	private java.util.Set<art.resource.artext.IArtextExpectedElement> followers = new java.util.LinkedHashSet<art.resource.artext.IArtextExpectedElement>();
	
	public ArtextAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(art.resource.artext.IArtextExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<art.resource.artext.IArtextExpectedElement> getFollowers() {
		return followers;
	}
	
}
