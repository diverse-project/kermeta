/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class KpExpectedStructuralFeature extends org.kermeta.kp.editor.mopp.KpAbstractExpectedElement {
	
	private org.kermeta.kp.editor.grammar.KpPlaceholder placeholder;
	
	public KpExpectedStructuralFeature(org.kermeta.kp.editor.grammar.KpPlaceholder placeholder) {
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
		if (o instanceof KpExpectedStructuralFeature) {
			return getFeature().equals(((KpExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
