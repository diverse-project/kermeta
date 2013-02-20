/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class KpExpectedEnumerationTerminal extends org.kermeta.kp.editor.mopp.KpAbstractExpectedElement {
	
	private org.kermeta.kp.editor.grammar.KpEnumerationTerminal enumerationTerminal;
	
	public KpExpectedEnumerationTerminal(org.kermeta.kp.editor.grammar.KpEnumerationTerminal enumerationTerminal) {
		super(enumerationTerminal.getMetaclass());
		this.enumerationTerminal = enumerationTerminal;
	}
	
	public java.util.Set<String> getTokenNames() {
		// EnumerationTerminals are associated with multiple tokens, one for each literal
		// that was mapped to a string
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>();
		java.util.Map<String, String> mapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : mapping.keySet()) {
			String text = mapping.get(literalName);
			if (text != null && !"".equals(text)) {
				tokenNames.add("'" + text + "'");
			}
		}
		return tokenNames;
	}
	
	public org.kermeta.kp.editor.grammar.KpEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
}
