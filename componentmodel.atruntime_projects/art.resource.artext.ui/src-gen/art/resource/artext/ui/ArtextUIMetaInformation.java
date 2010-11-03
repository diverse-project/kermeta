/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.ui;

public class ArtextUIMetaInformation extends art.resource.artext.mopp.ArtextMetaInformation {
	
	public art.resource.artext.IArtextHoverTextProvider getHoverTextProvider() {
		return new art.resource.artext.ui.ArtextHoverTextProvider();
	}
	
	public art.resource.artext.ui.ArtextColorManager createColorManager() {
		return new art.resource.artext.ui.ArtextColorManager();
	}
	
	public art.resource.artext.ui.ArtextTokenScanner createTokenScanner(art.resource.artext.ui.ArtextColorManager colorManager) {
		return new art.resource.artext.ui.ArtextTokenScanner(colorManager);
	}
	
	public art.resource.artext.ui.ArtextCodeCompletionHelper createCodeCompletionHelper() {
		return new art.resource.artext.ui.ArtextCodeCompletionHelper();
	}
	
}
