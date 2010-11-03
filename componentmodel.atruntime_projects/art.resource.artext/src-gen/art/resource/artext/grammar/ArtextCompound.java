/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.grammar;

public class ArtextCompound extends art.resource.artext.grammar.ArtextSyntaxElement {
	
	public ArtextCompound(art.resource.artext.grammar.ArtextChoice choice, art.resource.artext.grammar.ArtextCardinality cardinality) {
		super(cardinality, new art.resource.artext.grammar.ArtextSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
