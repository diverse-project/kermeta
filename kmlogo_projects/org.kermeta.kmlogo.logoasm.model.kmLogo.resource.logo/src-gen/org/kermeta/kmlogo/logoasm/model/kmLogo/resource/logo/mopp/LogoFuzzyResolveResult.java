/*$Id : LogoFuzzyResolveResult.java v 1.3 May 8, 2010 9:17:55 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo
* File : 	LogoFuzzyResolveResult.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

// A FuzzyResolveResult is an implementation of the IReferenceResolveResult
// interface that delegates all method calls to a given IReferenceResolveResult
// with ReferenceType EObject. It is used by reference resolver switches to
// collect results from different reference resolvers in a type safe manner.
//
// @param <ReferenceType> the type of the reference that is resolved
//
public class LogoFuzzyResolveResult<ReferenceType extends org.eclipse.emf.ecore.EObject> implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolveResult<ReferenceType> {
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate;
	
	public LogoFuzzyResolveResult(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceMapping<ReferenceType>> getMappings() {
		return null;
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target, warning);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
}
