/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.grammar;

public class SmARTextChoice extends smartadapters4ART.resource.smARText.grammar.SmARTextSyntaxElement {
	
	public SmARTextChoice(smartadapters4ART.resource.smARText.grammar.SmARTextCardinality cardinality, smartadapters4ART.resource.smARText.grammar.SmARTextSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return smartadapters4ART.resource.smARText.util.SmARTextStringUtil.explode(getChildren(), "|");
	}
	
}
