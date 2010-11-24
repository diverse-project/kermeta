/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KptWhiteSpace extends org.kermeta.kp.editor.grammar.KptFormattingElement {
	
	private final int amount;
	
	public KptWhiteSpace(int amount, org.kermeta.kp.editor.grammar.KptCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
