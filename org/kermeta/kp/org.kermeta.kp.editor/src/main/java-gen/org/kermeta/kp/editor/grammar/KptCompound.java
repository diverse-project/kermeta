/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KptCompound extends org.kermeta.kp.editor.grammar.KptSyntaxElement {
	
	public KptCompound(org.kermeta.kp.editor.grammar.KptChoice choice, org.kermeta.kp.editor.grammar.KptCardinality cardinality) {
		super(cardinality, new org.kermeta.kp.editor.grammar.KptSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
