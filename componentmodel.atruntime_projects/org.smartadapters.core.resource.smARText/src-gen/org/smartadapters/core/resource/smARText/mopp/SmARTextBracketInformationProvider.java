/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

public class SmARTextBracketInformationProvider {
	
	public class BracketPair implements org.smartadapters.core.resource.smARText.ISmARTextBracketPair {
		
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
	
	public java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextBracketPair> getBracketPairs() {
		java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextBracketPair> result = new java.util.ArrayList<org.smartadapters.core.resource.smARText.ISmARTextBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("[", "]", true));
		result.add(new BracketPair("<", ">", true));
		return result;
	}
	
}
