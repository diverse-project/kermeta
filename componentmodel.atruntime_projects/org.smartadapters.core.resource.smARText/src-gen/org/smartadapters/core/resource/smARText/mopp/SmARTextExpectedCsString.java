/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class SmARTextExpectedCsString extends org.smartadapters.core.resource.smARText.mopp.SmARTextAbstractExpectedElement {
	
	private String value;
	
	public SmARTextExpectedCsString(String value) {
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
		if (o instanceof SmARTextExpectedCsString) {
			return this.value.equals(((SmARTextExpectedCsString) o).value);
		}
		return false;
	}
	
}
