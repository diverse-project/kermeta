/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar;

public class LogoWhiteSpace extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement {
	
	private final int amount;
	
	public LogoWhiteSpace(int amount, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality cardinality) {
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
