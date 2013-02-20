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
public abstract class KpSyntaxElement {
	
	private KpSyntaxElement[] children;
	private KpSyntaxElement parent;
	private org.kermeta.kp.editor.grammar.KpCardinality cardinality;
	
	public KpSyntaxElement(org.kermeta.kp.editor.grammar.KpCardinality cardinality, KpSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (KpSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(KpSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public KpSyntaxElement[] getChildren() {
		if (children == null) {
			return new KpSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.kermeta.kp.editor.grammar.KpCardinality getCardinality() {
		return cardinality;
	}
	
}
