/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KpSequence extends org.kermeta.kp.editor.grammar.KpSyntaxElement {
	
	public KpSequence(org.kermeta.kp.editor.grammar.KpCardinality cardinality, org.kermeta.kp.editor.grammar.KpSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.kermeta.kp.editor.util.KpStringUtil.explode(getChildren(), " ");
	}
	
}
