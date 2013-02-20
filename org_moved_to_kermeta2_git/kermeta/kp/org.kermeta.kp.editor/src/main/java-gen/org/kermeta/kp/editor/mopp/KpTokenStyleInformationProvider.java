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
		if ("project".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("extends".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("mainClass".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("mainOperation".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("javaBasePackage".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("requiredTypes".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("packageEquivalence".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("import".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("using".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EMFBytecode".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("importProject".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("resource".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("alternative".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("QUOTED_40_41".equals(tokenName)) {
			return new org.kermeta.kp.editor.mopp.KpTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		return null;
	}
	
}
