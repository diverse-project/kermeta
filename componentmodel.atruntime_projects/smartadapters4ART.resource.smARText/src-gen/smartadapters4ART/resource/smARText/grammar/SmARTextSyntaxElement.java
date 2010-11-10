/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class SmARTextSyntaxElement {
	
	private SmARTextSyntaxElement[] children;
	private SmARTextSyntaxElement parent;
	private smartadapters4ART.resource.smARText.grammar.SmARTextCardinality cardinality;
	
	public SmARTextSyntaxElement(smartadapters4ART.resource.smARText.grammar.SmARTextCardinality cardinality, SmARTextSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (SmARTextSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(SmARTextSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public SmARTextSyntaxElement[] getChildren() {
		if (children == null) {
			return new SmARTextSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public smartadapters4ART.resource.smARText.grammar.SmARTextCardinality getCardinality() {
		return cardinality;
	}
	
}
