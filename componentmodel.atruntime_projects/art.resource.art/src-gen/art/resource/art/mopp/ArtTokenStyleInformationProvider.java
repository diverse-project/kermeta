package art.resource.art.mopp;

public class ArtTokenStyleInformationProvider {
	
	public class TokenStyleImpl implements art.resource.art.IArtTokenStyle {
		
		private int[] color;
		private boolean bold;
		private boolean italic;
		private boolean strikethrough;
		private boolean underline;
		
		public TokenStyleImpl(int[] color, boolean bold, boolean italic, boolean striketrough, boolean underline) {
			super();
			this.color = color;
			this.bold = bold;
			this.italic = italic;
			this.strikethrough = striketrough;
			this.underline = underline;
		}
		
		public int[] getColorAsRGB() {
			return color;
		}
		
		public boolean isBold() {
			return bold;
		}
		
		public boolean isItalic() {
			return italic;
		}
		
		public boolean isStrikethrough() {
			return strikethrough;
		}
		
		public boolean isUnderline() {
			return underline;
		}
	}
	
	public art.resource.art.IArtTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		if ("TEXT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x44, 0x44, 0x44}, false, false, false, false);
		}
		if ("SL_COMMENT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x66, 0x66, 0x66}, false, false, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x66, 0x66, 0x66}, false, false, false, false);
		}
		if ("STRING_LITERAL".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, false, false, false, false);
		}
		if ("system".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x44, 0x44, 0x44}, true, false, false, false);
		}
		if ("root".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("primitive".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("composite".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("instance".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("T_INSTANCE_STATE".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if (":".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x00, 0x00}, false, false, false, false);
		}
		if ("::".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x00, 0x00}, false, false, false, false);
		}
		if (":=".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x00, 0x00}, false, false, false, false);
		}
		if ("bind".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("delegate".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("to".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("id".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("functional".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, true, false, false, false);
		}
		if ("control".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, true, false, false, false);
		}
		if ("service".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, true, false, false, false);
		}
		if ("operation".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, true, false, false, false);
		}
		if ("in".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, true, false, false, false);
		}
		if ("out".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, true, false, false, false);
		}
		if ("implementation".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, true, false, false, false);
		}
		if ("OSGiComponent".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, false, false, false, false);
		}
		if ("implementingClass".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, false, true, false, false);
		}
		if ("OSGiType".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, false, false, false, false);
		}
		if ("generateInstanceBundle".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, false, true, false, false);
		}
		if ("OSGiPort".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, false, false, false, false);
		}
		if ("serviceId".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, false, true, false, false);
		}
		if ("groups".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x44, 0x44, 0x44}, true, false, false, false);
		}
		if ("instancegroup".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x44, 0x44, 0x44}, true, false, false, false);
		}
		if ("typegroup".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x44, 0x44, 0x44}, true, false, false, false);
		}
		if ("instances".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x44, 0x44, 0x44}, true, false, false, false);
		}
		if ("types".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x44, 0x44, 0x44}, true, false, false, false);
		}
		if ("type".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("compositetype".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("port".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("T_PORT_KIND".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("attribute".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("default".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("T_OPTIONAL".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("datatype".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, true, false, false, false);
		}
		if ("FractalComponent".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("controllerDesc".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("contentDesc".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		return null;
	}
	
}
