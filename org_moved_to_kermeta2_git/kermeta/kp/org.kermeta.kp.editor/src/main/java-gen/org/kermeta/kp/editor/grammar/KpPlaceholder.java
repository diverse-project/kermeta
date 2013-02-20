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
public class KpPlaceholder extends org.kermeta.kp.editor.grammar.KpTerminal {
	
	private final String tokenName;
	
	public KpPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.kermeta.kp.editor.grammar.KpCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
