/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpTokenStyleInformationProvider {
	
	public org.kermeta.kp.editor.IKpTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("dependency".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("weaver-directive".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("merger-option".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, true, false, false, false);
		}
		if ("SL_COMMENT".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x34, 0x80, 0x17}, null, false, false, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x34, 0x80, 0x17}, null, false, false, false, false);
		}
		if ("KermetaProject".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("version".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("group".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("defaultMainClass".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("defaultMainOperation".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ref".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("source".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("srcDir".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("srcFile".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("srcNSURI".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("from".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("srcQuery".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("URL".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		return null;
	}
	
}
