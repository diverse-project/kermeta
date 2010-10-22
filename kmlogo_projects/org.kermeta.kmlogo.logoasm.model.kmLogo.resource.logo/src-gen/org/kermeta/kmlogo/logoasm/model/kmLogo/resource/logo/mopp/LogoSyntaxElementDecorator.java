/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private LogoSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public LogoSyntaxElementDecorator(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement decoratedElement, LogoSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public LogoSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
