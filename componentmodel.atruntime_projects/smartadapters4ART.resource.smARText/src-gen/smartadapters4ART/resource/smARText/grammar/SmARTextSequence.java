/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.grammar;

public class SmARTextSequence extends smartadapters4ART.resource.smARText.grammar.SmARTextSyntaxElement {
	
	public SmARTextSequence(smartadapters4ART.resource.smARText.grammar.SmARTextCardinality cardinality, smartadapters4ART.resource.smARText.grammar.SmARTextSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return smartadapters4ART.resource.smARText.util.SmARTextStringUtil.explode(getChildren(), " ");
	}
	
}
