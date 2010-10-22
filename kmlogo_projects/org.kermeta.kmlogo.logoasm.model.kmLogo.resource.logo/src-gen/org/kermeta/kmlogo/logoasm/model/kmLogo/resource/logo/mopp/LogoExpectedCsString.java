/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class LogoExpectedCsString extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoAbstractExpectedElement {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoKeyword keyword;
	
	public LogoExpectedCsString(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoKeyword keyword) {
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
		if (o instanceof LogoExpectedCsString) {
			return getValue().equals(((LogoExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
