/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.art.mopp;

// A basic implementation of the IURIMapping interface that can
// map identifiers to URIs.
//
// @param <ReferenceType> unused type parameter which is needed to implement IURIMapping.
//
public class ArtURIMapping<ReferenceType> implements art.resource.art.IArtURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public ArtURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
