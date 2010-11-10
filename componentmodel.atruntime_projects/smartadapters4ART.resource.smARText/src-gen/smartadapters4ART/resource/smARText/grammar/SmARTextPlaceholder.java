/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class SmARTextPlaceholder extends smartadapters4ART.resource.smARText.grammar.SmARTextTerminal {
	
	private final String tokenName;
	
	public SmARTextPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, smartadapters4ART.resource.smARText.grammar.SmARTextCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
