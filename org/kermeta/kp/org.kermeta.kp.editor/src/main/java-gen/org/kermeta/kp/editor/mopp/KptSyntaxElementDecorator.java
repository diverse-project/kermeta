/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.kermeta.kp.editor.grammar.KptSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private KptSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<java.lang.Integer> indicesToPrint = new java.util.ArrayList<java.lang.Integer>();
	
	public KptSyntaxElementDecorator(org.kermeta.kp.editor.grammar.KptSyntaxElement decoratedElement, KptSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(java.lang.Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.kermeta.kp.editor.grammar.KptSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public KptSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public java.lang.Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
