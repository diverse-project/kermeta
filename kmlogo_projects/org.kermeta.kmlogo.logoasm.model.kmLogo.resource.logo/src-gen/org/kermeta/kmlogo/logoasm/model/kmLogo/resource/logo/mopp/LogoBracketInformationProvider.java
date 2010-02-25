/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoBracketInformationProvider {
	
	public class BracketPair implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoBracketPair> getBracketPairs() {
		java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoBracketPair> result = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoBracketPair>();
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("[", "]", true));
		return result;
	}
	
}
