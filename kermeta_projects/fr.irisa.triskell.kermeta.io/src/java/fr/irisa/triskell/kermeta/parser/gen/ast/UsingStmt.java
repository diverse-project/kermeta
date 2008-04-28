package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 14 avr. 2008 10:29:17
 */
public class UsingStmt extends KermetaASTNode  {

	public static final String KW_USING = "using";

	private KermetaTokenNode _using_KW;
	private QualifiedID _name;

	public KermetaTokenNode getUsing_KW() {
		return _using_KW;
	}
	public QualifiedID getName() {
		return _name;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_using_KW != null) count++;
		if (_name != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_using_KW != null) && (++count == index)) return _using_KW;
		if ((_name != null) && (++count == index)) return _name;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new UsingStmt.
	 */
	public UsingStmt(
		TokenInfo using_KW,
		QualifiedID name
	) {
		super();

		if (using_KW != null) {
			_using_KW = new KermetaTokenNode(using_KW);
			if (_using_KW._parent != null) throw new RuntimeException();
			_using_KW._parent = this;
		}
		if (name != null) {
			_name = name;
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
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
