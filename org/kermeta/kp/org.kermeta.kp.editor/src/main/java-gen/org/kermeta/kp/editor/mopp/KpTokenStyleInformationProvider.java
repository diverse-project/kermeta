/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpTokenStyleInformationProvider {
	
	public org.kermeta.kp.editor.IKpTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("SL_COMMENT".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x34, 0x80, 0x17}, null, false, false, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x34, 0x80, 0x17}, null, false, false, false, false);
		}
		if ("KermetaProject".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("defaultMainClass".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("defaultMainOperation".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("javaBasePackage".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("packageEquivalence".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("extends".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("importFile".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("withBytecodeFrom".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("importProjectJar".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("importProjectSource".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("importBytecodeJar".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("alternative".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		return null;
	}
	
}
