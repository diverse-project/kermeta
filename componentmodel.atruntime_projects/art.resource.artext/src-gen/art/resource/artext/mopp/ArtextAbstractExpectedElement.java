/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class ArtextAbstractExpectedElement implements art.resource.artext.IArtextExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<art.resource.artext.util.ArtextPair<art.resource.artext.IArtextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<art.resource.artext.util.ArtextPair<art.resource.artext.IArtextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public ArtextAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(art.resource.artext.IArtextExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new art.resource.artext.util.ArtextPair<art.resource.artext.IArtextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<art.resource.artext.util.ArtextPair<art.resource.artext.IArtextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
