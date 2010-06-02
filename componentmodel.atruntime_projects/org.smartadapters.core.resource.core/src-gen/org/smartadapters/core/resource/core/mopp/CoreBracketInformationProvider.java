/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

public class CoreBracketInformationProvider {
	
	public class BracketPair implements org.smartadapters.core.resource.core.ICoreBracketPair {
		
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
	
	public java.util.Collection<org.smartadapters.core.resource.core.ICoreBracketPair> getBracketPairs() {
		java.util.Collection<org.smartadapters.core.resource.core.ICoreBracketPair> result = new java.util.ArrayList<org.smartadapters.core.resource.core.ICoreBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("<", ">", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("[", "]", true));
		return result;
	}
	
}
