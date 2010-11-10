/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.grammar;

public class SmARTextLineBreak extends smartadapters4ART.resource.smARText.grammar.SmARTextFormattingElement {
	
	private final int tabs;
	
	public SmARTextLineBreak(smartadapters4ART.resource.smARText.grammar.SmARTextCardinality cardinality, int tabs) {
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
