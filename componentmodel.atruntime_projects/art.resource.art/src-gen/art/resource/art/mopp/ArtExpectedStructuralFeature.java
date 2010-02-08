/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;

// A representation for a range in a document where a structural feature (e.g.,
// a reference) is expected.
public class ArtExpectedStructuralFeature extends art.resource.art.mopp.ArtAbstractExpectedElement {
	private org.eclipse.emf.ecore.EStructuralFeature feature;
	private String tokenName;
	
	public ArtExpectedStructuralFeature(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName) {
		super();
		this.feature = feature;
		this.tokenName = tokenName;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return feature;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
	public java.lang.String toString() {
		return "EFeature " + feature.getEContainingClass().getName() + "." + feature.getName();
	}
	
	public boolean equals(java.lang.Object o) {
		if (o instanceof ArtExpectedStructuralFeature) {
			return this.feature.equals(((ArtExpectedStructuralFeature) o).feature);
		}
		return false;
	}
}
