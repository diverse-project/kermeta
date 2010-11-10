/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.grammar;

public class SmARTextCompound extends smartadapters4ART.resource.smARText.grammar.SmARTextSyntaxElement {
	
	public SmARTextCompound(smartadapters4ART.resource.smARText.grammar.SmARTextChoice choice, smartadapters4ART.resource.smARText.grammar.SmARTextCardinality cardinality) {
		super(cardinality, new smartadapters4ART.resource.smARText.grammar.SmARTextSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
