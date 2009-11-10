package art.resource.art.mopp;

public class ArtBracketInformationProvider {
	
	public class BracketPair implements art.resource.art.IArtBracketPair {
		
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
	
	public java.util.Collection<art.resource.art.IArtBracketPair> getBracketPairs() {
		java.util.Collection<art.resource.art.IArtBracketPair> result = new java.util.ArrayList<art.resource.art.IArtBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("[", "]", true));
		result.add(new BracketPair("<", ">", true));
		return result;
	}
	
}
