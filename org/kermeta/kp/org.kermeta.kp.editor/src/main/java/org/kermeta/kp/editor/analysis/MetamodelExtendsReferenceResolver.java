/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.analysis;

import org.kermeta.kp.editor.analysis.helper.MetamodelResolver;

public class MetamodelExtendsReferenceResolver implements org.kermeta.kp.editor.IKpReferenceResolver<org.kermeta.kp.Metamodel, org.kermeta.kp.Metamodel> {
	
	//private org.kermeta.kp.editor.analysis.KpDefaultResolverDelegate<org.kermeta.kp.Metamodel, org.kermeta.kp.Metamodel> delegate = new org.kermeta.kp.editor.analysis.KpDefaultResolverDelegate<org.kermeta.kp.Metamodel, org.kermeta.kp.Metamodel>();
	private MetamodelResolver delegate = new MetamodelResolver();
	
	public void resolve(String identifier, org.kermeta.kp.Metamodel container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kermeta.kp.editor.IKpReferenceResolveResult<org.kermeta.kp.Metamodel> result) {
		delegate.doResolve(identifier, container, reference, position, resolveFuzzy, result);		
	}
	
	public String deResolve(org.kermeta.kp.Metamodel element, org.kermeta.kp.Metamodel container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.doDeResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
