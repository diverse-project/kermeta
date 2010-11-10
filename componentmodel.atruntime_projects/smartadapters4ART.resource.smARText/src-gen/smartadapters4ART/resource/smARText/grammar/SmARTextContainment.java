/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.grammar;

public class SmARTextContainment extends smartadapters4ART.resource.smARText.grammar.SmARTextTerminal {
	
	public SmARTextContainment(org.eclipse.emf.ecore.EStructuralFeature feature, smartadapters4ART.resource.smARText.grammar.SmARTextCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
