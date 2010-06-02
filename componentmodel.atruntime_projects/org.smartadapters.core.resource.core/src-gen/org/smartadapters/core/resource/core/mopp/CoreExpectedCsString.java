/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class CoreExpectedCsString extends org.smartadapters.core.resource.core.mopp.CoreAbstractExpectedElement {
	
	private String value;
	
	public CoreExpectedCsString(String value) {
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
		if (o instanceof CoreExpectedCsString) {
			return this.value.equals(((CoreExpectedCsString) o).value);
		}
		return false;
	}
	
}
