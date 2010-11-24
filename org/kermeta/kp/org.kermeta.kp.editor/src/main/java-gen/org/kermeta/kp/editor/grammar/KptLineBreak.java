/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KptLineBreak extends org.kermeta.kp.editor.grammar.KptFormattingElement {
	
	private final int tabs;
	
	public KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality cardinality, int tabs) {
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
