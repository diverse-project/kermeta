package fr.irisa.triskell.kermeta.migrationv032_v040.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 13 sept. 2006 18:24:48
 */
public class ContextMultiLineComment extends Annotation  {


	private KermetaTokenNode _context_multi_line_comment;

	public KermetaTokenNode getContext_multi_line_comment() {
		return _context_multi_line_comment;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_context_multi_line_comment != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_context_multi_line_comment != null) && (++count == index)) return _context_multi_line_comment;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new ContextMultiLineComment.
	 */
	public ContextMultiLineComment(
		Token context_multi_line_comment
	) {
		super();

		if (context_multi_line_comment != null) {
			_context_multi_line_comment = new KermetaTokenNode(context_multi_line_comment);
			if (_context_multi_line_comment._parent != null) throw new RuntimeException();
			_context_multi_line_comment._parent = this;
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
