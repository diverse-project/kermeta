package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Mar 10, 2005 4:22:40 PM
 */
public class ImportStmt extends KermetaASTNode  {

	public static final String KW_REQUIRE = "require";

	private KermetaTokenNode _require_KW;
	private StringLiteralOrQualifiedID _uri;

	public KermetaTokenNode getRequire_KW() {
		return _require_KW;
	}
	public StringLiteralOrQualifiedID getUri() {
		return _uri;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_require_KW != null) count++;
		if (_uri != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_require_KW != null) && (++count == index)) return _require_KW;
		if ((_uri != null) && (++count == index)) return _uri;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new ImportStmt.
	 */
	public ImportStmt(
		Token require_KW,
		StringLiteralOrQualifiedID uri
	) {
		super();

		if (require_KW != null) {
			_require_KW = new KermetaTokenNode(require_KW);
			if (_require_KW._parent != null) throw new RuntimeException();
			_require_KW._parent = this;
		}
		if (uri != null) {
			_uri = uri;
			if (_uri._parent != null) throw new RuntimeException();
			_uri._parent = this;
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
