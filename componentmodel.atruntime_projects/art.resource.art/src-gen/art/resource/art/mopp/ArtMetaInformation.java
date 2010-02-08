/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;

public class ArtMetaInformation implements art.resource.art.IArtMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "art";
	}
	
	public java.lang.String getURI() {
		return "http://art";
	}
	
	public art.resource.art.IArtTextScanner createLexer() {
		return new art.resource.art.mopp.ArtAntlrScanner(new art.resource.art.mopp.ArtLexer());
	}
	
	public art.resource.art.IArtTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new art.resource.art.mopp.ArtParser().createInstance(inputStream, encoding);
	}
	
	public art.resource.art.IArtTextPrinter createPrinter(java.io.OutputStream outputStream, art.resource.art.IArtTextResource resource) {
		return new art.resource.art.mopp.ArtPrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new art.resource.art.mopp.ArtSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new art.resource.art.mopp.ArtSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public art.resource.art.IArtReferenceResolverSwitch getReferenceResolverSwitch() {
		return new art.resource.art.mopp.ArtReferenceResolverSwitch();
	}
	
	public art.resource.art.IArtTokenResolverFactory getTokenResolverFactory() {
		return new art.resource.art.mopp.ArtTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "org.kermeta.art.model/model/metamodel@runtime.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new art.resource.art.mopp.ArtParser(null).getTokenNames();
	}
	
	public art.resource.art.IArtTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new art.resource.art.mopp.ArtTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<art.resource.art.IArtBracketPair> getBracketPairs() {
		return new art.resource.art.mopp.ArtBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new art.resource.art.mopp.ArtFoldingInformationProvider().getFoldableClasses();
	}
	
	public art.resource.art.IArtHoverTextProvider getHoverTextProvider() {
		return new art.resource.art.mopp.ArtHoverTextProvider();
	}
	
	public art.resource.art.ui.ArtColorManager createColorManager() {
		return new art.resource.art.ui.ArtColorManager();
	}
	
	public org.eclipse.jface.text.rules.ITokenScanner createTokenScanner(art.resource.art.ui.ArtColorManager colorManager) {
		return new art.resource.art.ui.ArtTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new art.resource.art.mopp.ArtResourceFactory();
	}
	
	public art.resource.art.mopp.ArtNewFileContentProvider getNewFileContentProvider() {
		return new art.resource.art.mopp.ArtNewFileContentProvider();
	}
	
	public art.resource.art.mopp.ArtCodeCompletionHelper createCodeCompletionHelper() {
		return new art.resource.art.mopp.ArtCodeCompletionHelper();
	}
	
}
