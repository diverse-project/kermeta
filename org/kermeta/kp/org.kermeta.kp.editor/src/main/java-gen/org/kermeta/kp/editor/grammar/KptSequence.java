/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KptSequence extends org.kermeta.kp.editor.grammar.KptSyntaxElement {
	
	public KptSequence(org.kermeta.kp.editor.grammar.KptCardinality cardinality, org.kermeta.kp.editor.grammar.KptSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.kermeta.kp.editor.util.KptStringUtil.explode(getChildren(), " ");
	}
	
}
