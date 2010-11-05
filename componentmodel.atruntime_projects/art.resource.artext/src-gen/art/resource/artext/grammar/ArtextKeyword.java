/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class ArtextKeyword extends art.resource.artext.grammar.ArtextSyntaxElement {
	
	private final String value;
	
	public ArtextKeyword(String value, art.resource.artext.grammar.ArtextCardinality cardinality) {
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
