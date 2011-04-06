/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class KpKeyword extends org.kermeta.kp.editor.grammar.KpSyntaxElement {
	
	private final String value;
	
	public KpKeyword(String value, org.kermeta.kp.editor.grammar.KpCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
