/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

public class SmARTextSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private smartadapters4ART.resource.smARText.grammar.SmARTextSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private SmARTextSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public SmARTextSyntaxElementDecorator(smartadapters4ART.resource.smARText.grammar.SmARTextSyntaxElement decoratedElement, SmARTextSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public smartadapters4ART.resource.smARText.grammar.SmARTextSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public SmARTextSyntaxElementDecorator[] getChildDecorators() {
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
