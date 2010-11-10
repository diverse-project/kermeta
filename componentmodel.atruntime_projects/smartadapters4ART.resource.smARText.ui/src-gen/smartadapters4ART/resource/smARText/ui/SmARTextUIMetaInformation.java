/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.ui;

public class SmARTextUIMetaInformation extends smartadapters4ART.resource.smARText.mopp.SmARTextMetaInformation {
	
	public smartadapters4ART.resource.smARText.ISmARTextHoverTextProvider getHoverTextProvider() {
		return new smartadapters4ART.resource.smARText.ui.SmARTextHoverTextProvider();
	}
	
	public smartadapters4ART.resource.smARText.ui.SmARTextImageProvider getImageProvider() {
		return smartadapters4ART.resource.smARText.ui.SmARTextImageProvider.INSTANCE;
	}
	
	public smartadapters4ART.resource.smARText.ui.SmARTextColorManager createColorManager() {
		return new smartadapters4ART.resource.smARText.ui.SmARTextColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(smartadapters4ART.resource.smARText.ISmARTextTextResource,
	 * smartadapters4ART.resource.smARText.ui.SmARTextColorManager) instead.
	 */
	public smartadapters4ART.resource.smARText.ui.SmARTextTokenScanner createTokenScanner(smartadapters4ART.resource.smARText.ui.SmARTextColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public smartadapters4ART.resource.smARText.ui.SmARTextTokenScanner createTokenScanner(smartadapters4ART.resource.smARText.ISmARTextTextResource resource, smartadapters4ART.resource.smARText.ui.SmARTextColorManager colorManager) {
		return new smartadapters4ART.resource.smARText.ui.SmARTextTokenScanner(resource, colorManager);
	}
	
	public smartadapters4ART.resource.smARText.ui.SmARTextCodeCompletionHelper createCodeCompletionHelper() {
		return new smartadapters4ART.resource.smARText.ui.SmARTextCodeCompletionHelper();
	}
	
}
