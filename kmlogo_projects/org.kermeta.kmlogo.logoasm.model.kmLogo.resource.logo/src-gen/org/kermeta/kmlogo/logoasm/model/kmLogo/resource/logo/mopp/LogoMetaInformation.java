/*$Id : LogoMetaInformation.java v 1.3 May 8, 2010 9:17:44 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoMetaInformation.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoMetaInformation implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "logo";
	}
	
	public java.lang.String getURI() {
		return "http://www.kermeta.org/kmLogo";
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextScanner createLexer() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoAntlrScanner(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLexer());
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoParser().createInstance(inputStream, encoding);
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextPrinter createPrinter(java.io.OutputStream outputStream, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoPrinter(outputStream, resource);
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
	
	public java.lang.String getPathToCSDefinition() {
		return "org.kermeta.kmlogo.logoasm.emftexteditor/concrete_syntax/ASMLogo.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoParser(null).getTokenNames();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoBracketPair> getBracketPairs() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoHoverTextProvider getHoverTextProvider() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoHoverTextProvider();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoColorManager createColorManager() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoColorManager();
	}
	
	public org.eclipse.jface.text.rules.ITokenScanner createTokenScanner(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoColorManager colorManager) {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ui.LogoTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoResourceFactory();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoNewFileContentProvider getNewFileContentProvider() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoNewFileContentProvider();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoCodeCompletionHelper createCodeCompletionHelper() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoCodeCompletionHelper();
	}
	
}
