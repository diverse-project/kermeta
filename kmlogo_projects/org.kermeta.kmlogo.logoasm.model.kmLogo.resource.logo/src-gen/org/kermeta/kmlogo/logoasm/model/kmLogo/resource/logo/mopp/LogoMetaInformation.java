/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoMetaInformation implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoMetaInformation {
	
	public String getSyntaxName() {
		return "logo";
	}
	
	public String getURI() {
		return "http://www.kermeta.org/kmLogo";
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextScanner createLexer() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoAntlrScanner(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLexer());
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoParser().createInstance(inputStream, encoding);
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextPrinter createPrinter(java.io.OutputStream outputStream, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoReferenceResolverSwitch();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolverFactory getTokenResolverFactory() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.kermeta.kmlogo.logoasm.emftexteditor/concrete_syntax/ASMLogo.cs";
	}
	
	public String[] getTokenNames() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoParser(null).getTokenNames();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoBracketPair> getBracketPairs() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoResourceFactory();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoNewFileContentProvider getNewFileContentProvider() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoNewFileContentProvider();
	}
	
}
