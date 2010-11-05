/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class ArtextExpectedCsString extends art.resource.artext.mopp.ArtextAbstractExpectedElement {
	
	private art.resource.artext.grammar.ArtextKeyword keyword;
	
	public ArtextExpectedCsString(art.resource.artext.grammar.ArtextKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public String getTokenName() {
		return "'" + getValue() + "'";
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof ArtextExpectedCsString) {
			return getValue().equals(((ArtextExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
