/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.grammar;

public class ArtextChoice extends art.resource.artext.grammar.ArtextSyntaxElement {
	
	public ArtextChoice(art.resource.artext.grammar.ArtextCardinality cardinality, art.resource.artext.grammar.ArtextSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return art.resource.artext.util.ArtextStringUtil.explode(getChildren(), "|");
	}
	
}
