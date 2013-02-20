/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KpChoice extends org.kermeta.kp.editor.grammar.KpSyntaxElement {
	
	public KpChoice(org.kermeta.kp.editor.grammar.KpCardinality cardinality, org.kermeta.kp.editor.grammar.KpSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.kermeta.kp.editor.util.KpStringUtil.explode(getChildren(), "|");
	}
	
}
