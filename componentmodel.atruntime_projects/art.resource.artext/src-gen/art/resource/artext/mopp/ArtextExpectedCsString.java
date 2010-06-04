/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class ArtextExpectedCsString extends art.resource.artext.mopp.ArtextAbstractExpectedElement {
	
	private String value;
	
	public ArtextExpectedCsString(String value) {
		super();
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getTokenName() {
		return "'" + value + "'";
	}
	
	public String toString() {
		return "CsString \"" + value + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof ArtextExpectedCsString) {
			return this.value.equals(((ArtextExpectedCsString) o).value);
		}
		return false;
	}
	
}
