/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KpWhiteSpace extends org.kermeta.kp.editor.grammar.KpFormattingElement {
	
	private final int amount;
	
	public KpWhiteSpace(int amount, org.kermeta.kp.editor.grammar.KpCardinality cardinality) {
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
