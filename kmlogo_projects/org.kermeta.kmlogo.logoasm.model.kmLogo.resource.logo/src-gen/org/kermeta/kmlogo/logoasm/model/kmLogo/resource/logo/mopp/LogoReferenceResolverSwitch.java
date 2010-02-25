/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoReferenceResolverSwitch implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolverSwitch {
	
	protected org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.ProcCallDeclarationReferenceResolver procCallDeclarationReferenceResolver = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.ProcCallDeclarationReferenceResolver();
	protected org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.ParameterCallParameterReferenceResolver parameterCallParameterReferenceResolver = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.ParameterCallParameterReferenceResolver();
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.ProcCallDeclarationReferenceResolver getProcCallDeclarationReferenceResolver() {
		return procCallDeclarationReferenceResolver;
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.analysis.ParameterCallParameterReferenceResolver getParameterCallParameterReferenceResolver() {
		return parameterCallParameterReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		procCallDeclarationReferenceResolver.setOptions(options);
		parameterCallParameterReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(java.lang.String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.eINSTANCE.getProcCall().isInstance(container)) {
			LogoFuzzyResolveResult<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration> frr = new LogoFuzzyResolveResult<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(reference.getName());
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				procCallDeclarationReferenceResolver.resolve(identifier, (org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.eINSTANCE.getParameterCall().isInstance(container)) {
			LogoFuzzyResolveResult<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter> frr = new LogoFuzzyResolveResult<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(reference.getName());
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				parameterCallParameterReferenceResolver.resolve(identifier, (org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
}
