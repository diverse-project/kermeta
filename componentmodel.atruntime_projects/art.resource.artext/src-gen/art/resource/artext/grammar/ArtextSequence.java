/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.grammar;

public class ArtextSequence extends art.resource.artext.grammar.ArtextSyntaxElement {
	
	public ArtextSequence(art.resource.artext.grammar.ArtextCardinality cardinality, art.resource.artext.grammar.ArtextSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return art.resource.artext.util.ArtextStringUtil.explode(getChildren(), " ");
	}
	
}
