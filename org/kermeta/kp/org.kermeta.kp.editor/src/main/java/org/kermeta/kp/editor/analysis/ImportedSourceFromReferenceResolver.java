/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.analysis;

public class ImportedSourceFromReferenceResolver implements org.kermeta.kp.editor.IKptReferenceResolver<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency> {
	
	private org.kermeta.kp.editor.analysis.KptDefaultResolverDelegate<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency> delegate = new org.kermeta.kp.editor.analysis.KptDefaultResolverDelegate<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>();
	
	public void resolve(java.lang.String identifier, org.kermeta.kp.ImportedSource container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.kp.editor.IKptReferenceResolveResult<org.kermeta.kp.Dependency> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(org.kermeta.kp.Dependency element, org.kermeta.kp.ImportedSource container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
