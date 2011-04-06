/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpReferenceResolverSwitch implements org.kermeta.kp.editor.IKpReferenceResolverSwitch {
	
	protected org.kermeta.kp.editor.analysis.ImportedSourceFromReferenceResolver importedSourceFromReferenceResolver = new org.kermeta.kp.editor.analysis.ImportedSourceFromReferenceResolver();
	protected org.kermeta.kp.editor.analysis.DependencyDepRefReferenceResolver dependencyDepRefReferenceResolver = new org.kermeta.kp.editor.analysis.DependencyDepRefReferenceResolver();
	
	public org.kermeta.kp.editor.analysis.ImportedSourceFromReferenceResolver getImportedSourceFromReferenceResolver() {
		return importedSourceFromReferenceResolver;
	}
	
	public org.kermeta.kp.editor.analysis.DependencyDepRefReferenceResolver getDependencyDepRefReferenceResolver() {
		return dependencyDepRefReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		importedSourceFromReferenceResolver.setOptions(options);
		dependencyDepRefReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.kermeta.kp.editor.IKpReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.kermeta.kp.KpPackage.eINSTANCE.getImportedSource().isInstance(container)) {
			KpFuzzyResolveResult<org.kermeta.kp.Dependency> frr = new KpFuzzyResolveResult<org.kermeta.kp.Dependency>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("from")) {
				importedSourceFromReferenceResolver.resolve(identifier, (org.kermeta.kp.ImportedSource) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.kp.KpPackage.eINSTANCE.getDependency().isInstance(container)) {
			KpFuzzyResolveResult<org.kermeta.kp.KermetaProjectRef> frr = new KpFuzzyResolveResult<org.kermeta.kp.KermetaProjectRef>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("depRef")) {
				dependencyDepRefReferenceResolver.resolve(identifier, (org.kermeta.kp.Dependency) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.kermeta.kp.editor.IKpReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.kermeta.kp.KpPackage.eINSTANCE.getImportedSource_From()) {
			return importedSourceFromReferenceResolver;
		}
		if (reference == org.kermeta.kp.KpPackage.eINSTANCE.getDependency_DepRef()) {
			return dependencyDepRefReferenceResolver;
		}
		return null;
	}
	
}
