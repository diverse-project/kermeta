/*$Id : ILogoTokenResolver.java v 1.3 May 8, 2010 9:17:05 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	ILogoTokenResolver.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo;

// Basic Interface to directly manipulate parsed tokens and convert them into the attribute type in the meta model.
// All generated TokenResolvers per default delegate requests to an instance of JavaBasedTokenResolver which performs
// a standard conversion to Java Types based on the type of the attribute.
//
// @see org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.LogoDefaultTokenResolver
// @see org.emftext.sdk.codegen.TokenResolverGenerator
//
public interface ILogoTokenResolver extends org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoConfigurable {
	
	// Converts a token into an java.lang.Object (the value of the attribute).
	//
	// @param lexem the parsed String
	// @param feature the corresponding feature in the meta model
	// @param result the result of resolving the lexem, can be used to add processing errors
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolveResult result);
	
	// Does the inverse mapping from an java.lang.Object (attribute value) to a lexem which can be printed.
	//
	// @param value the java.lang.Object to be printed as String
	// @param feature the corresponding feature (attribute)
	// @param container the container of the object
	//
	// @return the String representation or null if a problem occurred
	public String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container);
}
