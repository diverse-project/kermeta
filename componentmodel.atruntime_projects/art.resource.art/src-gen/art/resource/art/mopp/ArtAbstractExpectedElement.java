/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class ArtAbstractExpectedElement implements art.resource.art.IArtExpectedElement {
	
	private java.util.Set<art.resource.art.IArtExpectedElement> followers = new java.util.LinkedHashSet<art.resource.art.IArtExpectedElement>();
	
	public ArtAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(art.resource.art.IArtExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<art.resource.art.IArtExpectedElement> getFollowers() {
		return followers;
	}
	
}
