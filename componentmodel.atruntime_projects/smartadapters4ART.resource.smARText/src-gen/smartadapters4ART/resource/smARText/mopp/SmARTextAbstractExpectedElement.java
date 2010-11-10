/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class SmARTextAbstractExpectedElement implements smartadapters4ART.resource.smARText.ISmARTextExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<smartadapters4ART.resource.smARText.util.SmARTextPair<smartadapters4ART.resource.smARText.ISmARTextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<smartadapters4ART.resource.smARText.util.SmARTextPair<smartadapters4ART.resource.smARText.ISmARTextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public SmARTextAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(smartadapters4ART.resource.smARText.ISmARTextExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new smartadapters4ART.resource.smARText.util.SmARTextPair<smartadapters4ART.resource.smARText.ISmARTextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<smartadapters4ART.resource.smARText.util.SmARTextPair<smartadapters4ART.resource.smARText.ISmARTextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
