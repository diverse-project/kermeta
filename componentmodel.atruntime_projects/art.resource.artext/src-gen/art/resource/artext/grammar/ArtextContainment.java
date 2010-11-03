/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.grammar;

public class ArtextContainment extends art.resource.artext.grammar.ArtextTerminal {
	
	public ArtextContainment(org.eclipse.emf.ecore.EStructuralFeature feature, art.resource.artext.grammar.ArtextCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
