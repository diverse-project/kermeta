package art.resource.art.mopp;

// A representation for a range in a document where a CsString (e.g.,
// a keyword) is expected.
public class ArtExpectedCsString extends art.resource.art.mopp.ArtAbstractExpectedElement {
	private String value;
	
	public ArtExpectedCsString(String value) {
		this("0", value);
	}
	
	public ArtExpectedCsString(String scopeID, String value) {
		super(scopeID, false);
		this.value = value;
	}
	
	public ArtExpectedCsString(String scopeID, boolean discardFollowingExpectations, String value) {
		super(scopeID, discardFollowingExpectations);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return super.toString() + " CsString \"" + value + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof ArtExpectedCsString) {
			return this.value.equals(((ArtExpectedCsString) o).value);
		}
		return false;
	}
}
