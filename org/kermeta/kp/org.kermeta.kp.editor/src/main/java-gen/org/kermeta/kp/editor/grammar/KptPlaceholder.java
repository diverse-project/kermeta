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
	
	private final String tokenName;
	
	public KptPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.kermeta.kp.editor.grammar.KptCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
