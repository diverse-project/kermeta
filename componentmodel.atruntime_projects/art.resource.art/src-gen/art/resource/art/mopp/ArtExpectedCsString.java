/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class ArtExpectedCsString extends art.resource.art.mopp.ArtAbstractExpectedElement {
	
	private String value;
	
	public ArtExpectedCsString(String value) {
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
		if (o instanceof ArtExpectedCsString) {
			return this.value.equals(((ArtExpectedCsString) o).value);
		}
		return false;
	}
	
}
