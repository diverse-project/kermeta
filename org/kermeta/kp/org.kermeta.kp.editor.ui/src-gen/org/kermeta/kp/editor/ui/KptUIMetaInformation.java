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
	
	public org.kermeta.kp.editor.ui.KptImageProvider getImageProvider() {
		return org.kermeta.kp.editor.ui.KptImageProvider.INSTANCE;
	}
	
	public org.kermeta.kp.editor.ui.KptColorManager createColorManager() {
		return new org.kermeta.kp.editor.ui.KptColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.kermeta.kp.editor.IKptTextResource,
	 * org.kermeta.kp.editor.ui.KptColorManager) instead.
	 */
	public org.kermeta.kp.editor.ui.KptTokenScanner createTokenScanner(org.kermeta.kp.editor.ui.KptColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.kermeta.kp.editor.ui.KptTokenScanner createTokenScanner(org.kermeta.kp.editor.IKptTextResource resource, org.kermeta.kp.editor.ui.KptColorManager colorManager) {
		return new org.kermeta.kp.editor.ui.KptTokenScanner(resource, colorManager);
	}
	
	public org.kermeta.kp.editor.ui.KptCodeCompletionHelper createCodeCompletionHelper() {
		return new org.kermeta.kp.editor.ui.KptCodeCompletionHelper();
	}
	
}
