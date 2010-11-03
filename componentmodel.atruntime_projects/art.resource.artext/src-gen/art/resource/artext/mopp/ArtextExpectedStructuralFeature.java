/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class ArtextExpectedStructuralFeature extends art.resource.artext.mopp.ArtextAbstractExpectedElement {
	
	private art.resource.artext.grammar.ArtextPlaceholder placeholder;
	
	public ArtextExpectedStructuralFeature(art.resource.artext.grammar.ArtextPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.lang.String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(java.lang.Object o) {
		if (o instanceof ArtextExpectedStructuralFeature) {
			return getFeature().equals(((ArtextExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
