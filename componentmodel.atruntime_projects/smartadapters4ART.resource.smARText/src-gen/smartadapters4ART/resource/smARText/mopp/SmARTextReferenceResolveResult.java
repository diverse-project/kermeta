/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

/**
 * A basic implementation of the
 * smartadapters4ART.resource.smARText.ISmARTextReferenceResolveResult interface
 * that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class SmARTextReferenceResolveResult<ReferenceType> implements smartadapters4ART.resource.smARText.ISmARTextReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	
	public SmARTextReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<smartadapters4ART.resource.smARText.ISmARTextReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<smartadapters4ART.resource.smARText.ISmARTextReferenceMapping<ReferenceType>>();
		}
		mappings.add(new smartadapters4ART.resource.smARText.mopp.SmARTextElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<smartadapters4ART.resource.smARText.ISmARTextReferenceMapping<ReferenceType>>();
		}
		mappings.add(new smartadapters4ART.resource.smARText.mopp.SmARTextURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
