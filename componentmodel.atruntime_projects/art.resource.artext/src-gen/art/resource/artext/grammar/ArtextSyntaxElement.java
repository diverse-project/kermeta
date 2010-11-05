/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class ArtextSyntaxElement {
	
	private ArtextSyntaxElement[] children;
	private ArtextSyntaxElement parent;
	private art.resource.artext.grammar.ArtextCardinality cardinality;
	
	public ArtextSyntaxElement(art.resource.artext.grammar.ArtextCardinality cardinality, ArtextSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (ArtextSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(ArtextSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public ArtextSyntaxElement[] getChildren() {
		if (children == null) {
			return new ArtextSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public art.resource.artext.grammar.ArtextCardinality getCardinality() {
		return cardinality;
	}
	
}
