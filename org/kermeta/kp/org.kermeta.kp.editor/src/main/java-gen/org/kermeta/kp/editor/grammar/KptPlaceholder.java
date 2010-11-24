/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class KptPlaceholder extends org.kermeta.kp.editor.grammar.KptTerminal {
	
	private final java.lang.String tokenName;
	
	public KptPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, java.lang.String tokenName, org.kermeta.kp.editor.grammar.KptCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public java.lang.String getTokenName() {
		return tokenName;
	}
	
}
