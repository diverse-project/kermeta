/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class SmARTextExpectedStructuralFeature extends smartadapters4ART.resource.smARText.mopp.SmARTextAbstractExpectedElement {
	
	private smartadapters4ART.resource.smARText.grammar.SmARTextPlaceholder placeholder;
	
	public SmARTextExpectedStructuralFeature(smartadapters4ART.resource.smARText.grammar.SmARTextPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof SmARTextExpectedStructuralFeature) {
			return getFeature().equals(((SmARTextExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
