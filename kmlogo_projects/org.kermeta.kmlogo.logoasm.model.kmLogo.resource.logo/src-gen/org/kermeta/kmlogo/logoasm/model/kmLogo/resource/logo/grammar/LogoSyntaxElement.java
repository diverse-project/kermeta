/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class LogoSyntaxElement {
	
	private LogoSyntaxElement[] children;
	private LogoSyntaxElement parent;
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality cardinality;
	
	public LogoSyntaxElement(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality cardinality, LogoSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (LogoSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(LogoSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public LogoSyntaxElement[] getChildren() {
		if (children == null) {
			return new LogoSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality getCardinality() {
		return cardinality;
	}
	
}
