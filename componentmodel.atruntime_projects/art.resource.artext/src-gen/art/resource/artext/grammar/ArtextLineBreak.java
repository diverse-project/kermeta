/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.grammar;

public class ArtextLineBreak extends art.resource.artext.grammar.ArtextFormattingElement {
	
	private final int tabs;
	
	public ArtextLineBreak(art.resource.artext.grammar.ArtextCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
