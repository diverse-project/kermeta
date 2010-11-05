/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.grammar;

public class ArtextWhiteSpace extends art.resource.artext.grammar.ArtextFormattingElement {
	
	private final int amount;
	
	public ArtextWhiteSpace(int amount, art.resource.artext.grammar.ArtextCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
