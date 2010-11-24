/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptTokenStyleInformationProvider {
	
	public class TokenStyleImpl implements org.kermeta.kp.editor.IKptTokenStyle {
		
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
	
	public org.kermeta.kp.editor.IKptTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		if ("dependence".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xA2, 0x20, 0x00}, true, false, false, false);
		}
		if ("weaver-directive".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x00, 0x7F, 0x55}, true, false, false, false);
		}
		if ("in".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, false, true, false, false);
		}
		if ("merger-option".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0xCC, 0x80, 0x00}, true, false, false, false);
		}
		if ("SL_COMMENT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x34, 0x80, 0x17}, false, false, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x34, 0x80, 0x17}, false, false, false, false);
		}
		if ("MAVEN".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("NSURI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x25, 0x54, 0xC7}, true, false, false, false);
		}
		if ("KermetaProject".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("version".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("group".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("ref".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("source".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("from".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("dependency".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x2A, 0x00, 0xFF}, false, false, false, false);
		}
		return null;
	}
	
}
