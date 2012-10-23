/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpReferenceResolverSwitch implements org.kermeta.kp.editor.IKpReferenceResolverSwitch {
	
	protected org.kermeta.kp.editor.analysis.ImportFileBytecodeFromReferenceResolver importFileBytecodeFromReferenceResolver = new org.kermeta.kp.editor.analysis.ImportFileBytecodeFromReferenceResolver();
	
	public org.kermeta.kp.editor.analysis.ImportFileBytecodeFromReferenceResolver getImportFileBytecodeFromReferenceResolver() {
		return importFileBytecodeFromReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		importFileBytecodeFromReferenceResolver.setOptions(options);
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
	}
	
	public org.kermeta.kp.editor.IKpReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.kermeta.kp.KpPackage.eINSTANCE.getImportFile_BytecodeFrom()) {
			return importFileBytecodeFromReferenceResolver;
		}
		return null;
	}
	
}
