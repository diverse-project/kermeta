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
public class KptExpectedCsString extends org.kermeta.kp.editor.mopp.KptAbstractExpectedElement {
	
	private org.kermeta.kp.editor.grammar.KptKeyword keyword;
	
	public KptExpectedCsString(org.kermeta.kp.editor.grammar.KptKeyword keyword) {
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
		if (o instanceof KptExpectedCsString) {
			return getValue().equals(((KptExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
