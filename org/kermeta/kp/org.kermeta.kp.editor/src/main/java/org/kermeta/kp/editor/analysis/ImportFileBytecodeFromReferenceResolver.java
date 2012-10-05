/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.analysis;

public class ImportFileBytecodeFromReferenceResolver implements org.kermeta.kp.editor.IKpReferenceResolver<org.kermeta.kp.ImportFile, org.kermeta.kp.ReusableResource> {
	
	private org.kermeta.kp.editor.analysis.KpDefaultResolverDelegate<org.kermeta.kp.ImportFile, org.kermeta.kp.ReusableResource> delegate = new org.kermeta.kp.editor.analysis.KpDefaultResolverDelegate<org.kermeta.kp.ImportFile, org.kermeta.kp.ReusableResource>();
	
	public void resolve(String identifier, org.kermeta.kp.ImportFile container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.kp.editor.IKpReferenceResolveResult<org.kermeta.kp.ReusableResource> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.kermeta.kp.ReusableResource element, org.kermeta.kp.ImportFile container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
