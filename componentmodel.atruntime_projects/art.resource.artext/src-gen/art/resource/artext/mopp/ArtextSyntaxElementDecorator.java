/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

public class ArtextSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private art.resource.artext.grammar.ArtextSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private ArtextSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<java.lang.Integer> indicesToPrint = new java.util.ArrayList<java.lang.Integer>();
	
	public ArtextSyntaxElementDecorator(art.resource.artext.grammar.ArtextSyntaxElement decoratedElement, ArtextSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(java.lang.Integer index) {
		indicesToPrint.add(index);
	}
	
	public art.resource.artext.grammar.ArtextSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public ArtextSyntaxElementDecorator[] getChildDecorators() {
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
