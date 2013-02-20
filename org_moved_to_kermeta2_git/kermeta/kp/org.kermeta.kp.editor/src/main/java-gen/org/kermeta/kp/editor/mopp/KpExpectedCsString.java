/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class KpExpectedCsString extends org.kermeta.kp.editor.mopp.KpAbstractExpectedElement {
	
	private org.kermeta.kp.editor.grammar.KpKeyword keyword;
	
	public KpExpectedCsString(org.kermeta.kp.editor.grammar.KpKeyword keyword) {
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
		if (o instanceof KpExpectedCsString) {
			return getValue().equals(((KpExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
