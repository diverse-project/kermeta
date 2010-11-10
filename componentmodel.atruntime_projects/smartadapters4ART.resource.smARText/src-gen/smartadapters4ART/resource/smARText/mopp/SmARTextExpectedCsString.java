/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class SmARTextExpectedCsString extends smartadapters4ART.resource.smARText.mopp.SmARTextAbstractExpectedElement {
	
	private smartadapters4ART.resource.smARText.grammar.SmARTextKeyword keyword;
	
	public SmARTextExpectedCsString(smartadapters4ART.resource.smARText.grammar.SmARTextKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof SmARTextExpectedCsString) {
			return getValue().equals(((SmARTextExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
