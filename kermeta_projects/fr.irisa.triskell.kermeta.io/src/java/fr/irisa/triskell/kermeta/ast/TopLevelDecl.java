package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Jun 8, 2005 4:48:33 PM
 */
public class TopLevelDecl extends KermetaASTNode  {


	private Annotations _annotations;
	private AnnotableElement _annotableElement;

	public Annotations getAnnotations() {
		return _annotations;
	}
	public AnnotableElement getAnnotableElement() {
		return _annotableElement;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_annotations != null) count++;
		if (_annotableElement != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_annotations != null) && (++count == index)) return _annotations;
		if ((_annotableElement != null) && (++count == index)) return _annotableElement;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new TopLevelDecl.
	 */
	public TopLevelDecl(
		Annotations annotations,
		AnnotableElement annotableElement
	) {
		super();

		if (annotations != null) {
			_annotations = annotations;
			if (_annotations._parent != null) throw new RuntimeException();
			_annotations._parent = this;
		}
		if (annotableElement != null) {
			_annotableElement = annotableElement;
			if (_annotableElement._parent != null) throw new RuntimeException();
			_annotableElement._parent = this;
		}

	}

	/**
	 * This method overrides the superclass <code>acceptImpl</code> providing
	 * the same implementation.  Here <code>this</code> refers to this specific node
	 * class, so the <code>beginVisit</code> and <code>endVisit</code> methods
	 * specific to this type in the visitor will be invoked.
	 */
	public void acceptImpl(KermetaASTNodeVisitor visitor) {
		boolean visitChildren = visitor.beginVisit(this);
		if (visitChildren) visitChildren(visitor);
		visitor.endVisit(this);
	}

}
