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
public class KptExpectedStructuralFeature extends org.kermeta.kp.editor.mopp.KptAbstractExpectedElement {
	
	private org.kermeta.kp.editor.grammar.KptPlaceholder placeholder;
	
	public KptExpectedStructuralFeature(org.kermeta.kp.editor.grammar.KptPlaceholder placeholder) {
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
		if (o instanceof KptExpectedStructuralFeature) {
			return getFeature().equals(((KptExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
