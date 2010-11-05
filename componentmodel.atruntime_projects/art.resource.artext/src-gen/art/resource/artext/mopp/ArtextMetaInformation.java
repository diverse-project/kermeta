/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

public class ArtextMetaInformation implements art.resource.artext.IArtextMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "artext";
	}
	
	public java.lang.String getURI() {
		return "http://art";
	}
	
	public art.resource.artext.IArtextTextScanner createLexer() {
		return new art.resource.artext.mopp.ArtextAntlrScanner(new art.resource.artext.mopp.ArtextLexer());
	}
	
	public art.resource.artext.IArtextTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new art.resource.artext.mopp.ArtextParser().createInstance(inputStream, encoding);
	}
	
	public art.resource.artext.IArtextTextPrinter createPrinter(java.io.OutputStream outputStream, art.resource.artext.IArtextTextResource resource) {
		return new art.resource.artext.mopp.ArtextPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new art.resource.artext.mopp.ArtextSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new art.resource.artext.mopp.ArtextSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public art.resource.artext.IArtextReferenceResolverSwitch getReferenceResolverSwitch() {
		return new art.resource.artext.mopp.ArtextReferenceResolverSwitch();
	}
	
	public art.resource.artext.IArtextTokenResolverFactory getTokenResolverFactory() {
		return new art.resource.artext.mopp.ArtextTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "org.kermeta.art.model/model/metamodel@runtime.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new art.resource.artext.mopp.ArtextParser(null).getTokenNames();
	}
	
	public art.resource.artext.IArtextTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new art.resource.artext.mopp.ArtextTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<art.resource.artext.IArtextBracketPair> getBracketPairs() {
		return new art.resource.artext.mopp.ArtextBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new art.resource.artext.mopp.ArtextFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new art.resource.artext.mopp.ArtextResourceFactory();
	}
	
	public art.resource.artext.mopp.ArtextNewFileContentProvider getNewFileContentProvider() {
		return new art.resource.artext.mopp.ArtextNewFileContentProvider();
	}
	
}
