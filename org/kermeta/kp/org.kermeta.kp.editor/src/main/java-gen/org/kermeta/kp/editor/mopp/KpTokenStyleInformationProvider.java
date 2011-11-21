/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpTokenStyleInformationProvider {
	
	public org.kermeta.kp.editor.IKpTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("byteCodeFromADependency".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, true, false, false, false);
		}
		if ("ignoreByteCode".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, true, false, false, false);
		}
		if ("sourceOnly".equals(tokenName)) {
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
		if ("groupId".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("defaultMainClass".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("defaultMainOperation".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("dependencies".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("sources".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("options".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("weaveDirectives".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("require".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("source".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("dependency".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("URLs".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("weaver-directive".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("option".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("value".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		return null;
	}
	
}
