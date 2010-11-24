/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.ui;

public class KptUIMetaInformation extends org.kermeta.kp.editor.mopp.KptMetaInformation {
	
	public org.kermeta.kp.editor.IKptHoverTextProvider getHoverTextProvider() {
		return new org.kermeta.kp.editor.ui.KptHoverTextProvider();
	}
	
	public org.kermeta.kp.editor.ui.KptColorManager createColorManager() {
		return new org.kermeta.kp.editor.ui.KptColorManager();
	}
	
	public org.kermeta.kp.editor.ui.KptTokenScanner createTokenScanner(org.kermeta.kp.editor.ui.KptColorManager colorManager) {
		return new org.kermeta.kp.editor.ui.KptTokenScanner(colorManager);
	}
	
	public org.kermeta.kp.editor.ui.KptCodeCompletionHelper createCodeCompletionHelper() {
		return new org.kermeta.kp.editor.ui.KptCodeCompletionHelper();
	}
	
}
