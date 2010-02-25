/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class LogoExpectedCsString extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoAbstractExpectedElement {
	
	private String value;
	
	public LogoExpectedCsString(String value) {
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
		if (o instanceof LogoExpectedCsString) {
			return this.value.equals(((LogoExpectedCsString) o).value);
		}
		return false;
	}
	
}
