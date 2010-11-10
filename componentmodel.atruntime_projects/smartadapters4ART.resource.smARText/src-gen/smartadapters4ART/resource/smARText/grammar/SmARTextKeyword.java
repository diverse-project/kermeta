/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class SmARTextKeyword extends smartadapters4ART.resource.smARText.grammar.SmARTextSyntaxElement {
	
	private final String value;
	
	public SmARTextKeyword(String value, smartadapters4ART.resource.smARText.grammar.SmARTextCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
