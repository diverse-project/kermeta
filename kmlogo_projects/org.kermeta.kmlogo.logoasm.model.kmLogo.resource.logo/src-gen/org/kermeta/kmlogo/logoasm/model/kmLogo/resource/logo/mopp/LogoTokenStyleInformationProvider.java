/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoTokenStyleInformationProvider {
	
	public class TokenStyleImpl implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenStyle {
		
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
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		if ("FLOAT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("INTEGER".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("TEXT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x66, 0x66, 0x66}, true, false, false, false);
		}
		if ("Forward".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, false, true, false, false);
		}
		if ("Right".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, false, true, false, false);
		}
		if ("Left".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, false, true, false, false);
		}
		if ("Back".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, false, true, false, false);
		}
		if ("PenDown".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("PenUp".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("Clear".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, false, true, false, false);
		}
		if ("fd".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, false, true, false, false);
		}
		if ("rt".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, false, true, false, false);
		}
		if ("FORWARD".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, false, true, false, false);
		}
		if ("RIGHT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, false, true, false, false);
		}
		if ("LEFT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, false, true, false, false);
		}
		if ("BACK".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, false, true, false, false);
		}
		if ("PENDOWN".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("PENUP".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("CLEAR".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x55, 0xbb}, false, true, false, false);
		}
		if ("to".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("TO".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("end".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("END".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("If".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("IF".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("then".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("THEN".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("else".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("ELSE".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("ifelse".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("IFELSE".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Repeat".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("REPEAT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("While".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("WHILE".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if (":".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("-".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		return null;
	}
	
}
