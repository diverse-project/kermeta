package org.eclipse.emf.emfatic.core.lang.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from Emfatic.ast on 06.02.2007 17:57:34
 */
public class ImportStmt extends EmfaticASTNode  {

	public static final String KW_IMPORT = "import";

	private EmfaticTokenNode _import_KW;
	private EmfaticTokenNode _alias;
	private EmfaticTokenNode _equals;
	private StringLiteralOrQualifiedID _uri;
	private EmfaticTokenNode _semi;

	public EmfaticTokenNode getImport_KW() {
		return _import_KW;
	}
	public EmfaticTokenNode getAlias() {
		return _alias;
	}
	public EmfaticTokenNode getEquals() {
		return _equals;
	}
	public StringLiteralOrQualifiedID getUri() {
		return _uri;
	}
	public EmfaticTokenNode getSemi() {
		return _semi;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_import_KW != null) count++;
		if (_alias != null) count++;
		if (_equals != null) count++;
		if (_uri != null) count++;
		if (_semi != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_import_KW != null) && (++count == index)) return _import_KW;
		if ((_alias != null) && (++count == index)) return _alias;
		if ((_equals != null) && (++count == index)) return _equals;
		if ((_uri != null) && (++count == index)) return _uri;
		if ((_semi != null) && (++count == index)) return _semi;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new ImportStmt.
	 */
	public ImportStmt(
		TokenInfo import_KW,
		TokenInfo alias,
		TokenInfo equals,
		StringLiteralOrQualifiedID uri,
		TokenInfo semi
	) {
		super();

		if (import_KW != null) {
			_import_KW = new EmfaticTokenNode(import_KW);
			if (_import_KW._parent != null) throw new RuntimeException();
			_import_KW._parent = this;
		}
		if (alias != null) {
			_alias = new EmfaticTokenNode(alias);
			if (_alias._parent != null) throw new RuntimeException();
			_alias._parent = this;
		}
		if (equals != null) {
			_equals = new EmfaticTokenNode(equals);
			if (_equals._parent != null) throw new RuntimeException();
			_equals._parent = this;
		}
		if (uri != null) {
			_uri = uri;
			if (_uri._parent != null) throw new RuntimeException();
			_uri._parent = this;
		}
		if (semi != null) {
			_semi = new EmfaticTokenNode(semi);
			if (_semi._parent != null) throw new RuntimeException();
			_semi._parent = this;
		}

	}

	/**
	 * This method overrides the superclass <code>acceptImpl</code> providing
	 * the same implementation.  Here <code>this</code> refers to this specific node
	 * class, so the <code>beginVisit</code> and <code>endVisit</code> methods
	 * specific to this type in the visitor will be invoked.
	 */
	public void acceptImpl(EmfaticASTNodeVisitor visitor) {
		boolean visitChildren = visitor.beginVisit(this);
		if (visitChildren) visitChildren(visitor);
		visitor.endVisit(this);
	}

}
