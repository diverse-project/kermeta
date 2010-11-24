/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class KptSyntaxElement {
	
	private KptSyntaxElement[] children;
	private KptSyntaxElement parent;
	private org.kermeta.kp.editor.grammar.KptCardinality cardinality;
	
	public KptSyntaxElement(org.kermeta.kp.editor.grammar.KptCardinality cardinality, KptSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (KptSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(KptSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public KptSyntaxElement[] getChildren() {
		if (children == null) {
			return new KptSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.kermeta.kp.editor.grammar.KptCardinality getCardinality() {
		return cardinality;
	}
	
}
