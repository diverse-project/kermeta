/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KptChoice extends org.kermeta.kp.editor.grammar.KptSyntaxElement {
	
	public KptChoice(org.kermeta.kp.editor.grammar.KptCardinality cardinality, org.kermeta.kp.editor.grammar.KptSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.kermeta.kp.editor.util.KptStringUtil.explode(getChildren(), "|");
	}
	
}
