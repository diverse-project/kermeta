/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KpLineBreak extends org.kermeta.kp.editor.grammar.KpFormattingElement {
	
	private final int tabs;
	
	public KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
