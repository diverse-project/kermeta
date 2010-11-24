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
public class KptKeyword extends org.kermeta.kp.editor.grammar.KptSyntaxElement {
	
	private final String value;
	
	public KptKeyword(String value, org.kermeta.kp.editor.grammar.KptCardinality cardinality) {
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
