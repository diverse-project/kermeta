/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

/**
 * A basic implementation of the org.kermeta.kp.editor.IKpReferenceResolveResult
 * interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class KpReferenceResolveResult<ReferenceType> implements org.kermeta.kp.editor.IKpReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.kermeta.kp.editor.IKpReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<org.kermeta.kp.editor.IKpQuickFix> quickFixes;
	
	public KpReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.kermeta.kp.editor.IKpQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.kermeta.kp.editor.IKpQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.kermeta.kp.editor.IKpQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<org.kermeta.kp.editor.IKpReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.kermeta.kp.editor.IKpReferenceMapping<ReferenceType>>();
		}
		mappings.add(new org.kermeta.kp.editor.mopp.KpElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.kermeta.kp.editor.IKpReferenceMapping<ReferenceType>>();
		}
		mappings.add(new org.kermeta.kp.editor.mopp.KpURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
