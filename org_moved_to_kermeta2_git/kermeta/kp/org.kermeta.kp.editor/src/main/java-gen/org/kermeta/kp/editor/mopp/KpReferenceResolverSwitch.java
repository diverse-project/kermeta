/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpReferenceResolverSwitch implements org.kermeta.kp.editor.IKpReferenceResolverSwitch {
	
	protected org.kermeta.kp.editor.analysis.ImportFileBytecodeFromReferenceResolver importFileBytecodeFromReferenceResolver = new org.kermeta.kp.editor.analysis.ImportFileBytecodeFromReferenceResolver();
	protected org.kermeta.kp.editor.analysis.ImportProjectProjectResourceReferenceResolver importProjectProjectResourceReferenceResolver = new org.kermeta.kp.editor.analysis.ImportProjectProjectResourceReferenceResolver();
	protected org.kermeta.kp.editor.analysis.ImportProjectSourcesProjectResourceReferenceResolver importProjectSourcesProjectResourceReferenceResolver = new org.kermeta.kp.editor.analysis.ImportProjectSourcesProjectResourceReferenceResolver();
	
	public org.kermeta.kp.editor.analysis.ImportFileBytecodeFromReferenceResolver getImportFileBytecodeFromReferenceResolver() {
		return importFileBytecodeFromReferenceResolver;
	}
	
	public org.kermeta.kp.editor.analysis.ImportProjectProjectResourceReferenceResolver getImportProjectProjectResourceReferenceResolver() {
		return importProjectProjectResourceReferenceResolver;
	}
	
	public org.kermeta.kp.editor.analysis.ImportProjectSourcesProjectResourceReferenceResolver getImportProjectSourcesProjectResourceReferenceResolver() {
		return importProjectSourcesProjectResourceReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		importFileBytecodeFromReferenceResolver.setOptions(options);
		importProjectProjectResourceReferenceResolver.setOptions(options);
		importProjectSourcesProjectResourceReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.kermeta.kp.editor.IKpReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.kermeta.kp.KpPackage.eINSTANCE.getImportFile().isInstance(container)) {
			KpFuzzyResolveResult<org.kermeta.kp.ReusableResource> frr = new KpFuzzyResolveResult<org.kermeta.kp.ReusableResource>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("bytecodeFrom")) {
				importFileBytecodeFromReferenceResolver.resolve(identifier, (org.kermeta.kp.ImportFile) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.kp.KpPackage.eINSTANCE.getImportProject().isInstance(container)) {
			KpFuzzyResolveResult<org.kermeta.kp.ReusableResource> frr = new KpFuzzyResolveResult<org.kermeta.kp.ReusableResource>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("projectResource")) {
				importProjectProjectResourceReferenceResolver.resolve(identifier, (org.kermeta.kp.ImportProject) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kermeta.kp.KpPackage.eINSTANCE.getImportProjectSources().isInstance(container)) {
			KpFuzzyResolveResult<org.kermeta.kp.ReusableResource> frr = new KpFuzzyResolveResult<org.kermeta.kp.ReusableResource>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("projectResource")) {
				importProjectSourcesProjectResourceReferenceResolver.resolve(identifier, (org.kermeta.kp.ImportProjectSources) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.kermeta.kp.editor.IKpReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.kermeta.kp.KpPackage.eINSTANCE.getImportFile_BytecodeFrom()) {
			return importFileBytecodeFromReferenceResolver;
		}
		if (reference == org.kermeta.kp.KpPackage.eINSTANCE.getImportProject_ProjectResource()) {
			return importProjectProjectResourceReferenceResolver;
		}
		if (reference == org.kermeta.kp.KpPackage.eINSTANCE.getImportProjectSources_ProjectResource()) {
			return importProjectSourcesProjectResourceReferenceResolver;
		}
		return null;
	}
	
}
