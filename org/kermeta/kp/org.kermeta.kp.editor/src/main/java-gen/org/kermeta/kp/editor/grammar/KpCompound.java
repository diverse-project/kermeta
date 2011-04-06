/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KpCompound extends org.kermeta.kp.editor.grammar.KpSyntaxElement {
	
	public KpCompound(org.kermeta.kp.editor.grammar.KpChoice choice, org.kermeta.kp.editor.grammar.KpCardinality cardinality) {
		super(cardinality, new org.kermeta.kp.editor.grammar.KpSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
