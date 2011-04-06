/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.ui;

public class KpUIMetaInformation extends org.kermeta.kp.editor.mopp.KpMetaInformation {
	
	public org.kermeta.kp.editor.IKpHoverTextProvider getHoverTextProvider() {
		return new org.kermeta.kp.editor.ui.KpHoverTextProvider();
	}
	
	public org.kermeta.kp.editor.ui.KpImageProvider getImageProvider() {
		return org.kermeta.kp.editor.ui.KpImageProvider.INSTANCE;
	}
	
	public org.kermeta.kp.editor.ui.KpColorManager createColorManager() {
		return new org.kermeta.kp.editor.ui.KpColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.kermeta.kp.editor.IKpTextResource,
	 * org.kermeta.kp.editor.ui.KpColorManager) instead.
	 */
	public org.kermeta.kp.editor.ui.KpTokenScanner createTokenScanner(org.kermeta.kp.editor.ui.KpColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.kermeta.kp.editor.ui.KpTokenScanner createTokenScanner(org.kermeta.kp.editor.IKpTextResource resource, org.kermeta.kp.editor.ui.KpColorManager colorManager) {
		return new org.kermeta.kp.editor.ui.KpTokenScanner(resource, colorManager);
	}
	
	public org.kermeta.kp.editor.ui.KpCodeCompletionHelper createCodeCompletionHelper() {
		return new org.kermeta.kp.editor.ui.KpCodeCompletionHelper();
	}
	
}
