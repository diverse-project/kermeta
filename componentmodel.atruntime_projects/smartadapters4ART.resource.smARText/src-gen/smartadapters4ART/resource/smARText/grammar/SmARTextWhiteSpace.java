/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.grammar;

public class SmARTextWhiteSpace extends smartadapters4ART.resource.smARText.grammar.SmARTextFormattingElement {
	
	private final int amount;
	
	public SmARTextWhiteSpace(int amount, smartadapters4ART.resource.smARText.grammar.SmARTextCardinality cardinality) {
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
