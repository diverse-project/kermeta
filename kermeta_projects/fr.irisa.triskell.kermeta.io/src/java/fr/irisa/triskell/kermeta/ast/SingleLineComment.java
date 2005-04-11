package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Apr 11, 2005 3:34:43 PM
 */
public class SingleLineComment extends Annotation  {


	private KermetaTokenNode _single_line_comment;

	public KermetaTokenNode getSingle_line_comment() {
		return _single_line_comment;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_single_line_comment != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_single_line_comment != null) && (++count == index)) return _single_line_comment;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new SingleLineComment.
	 */
	public SingleLineComment(
		Token single_line_comment
	) {
		super();

		if (single_line_comment != null) {
			_single_line_comment = new KermetaTokenNode(single_line_comment);
			if (_single_line_comment._parent != null) throw new RuntimeException();
			_single_line_comment._parent = this;
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
