package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 14 avr. 2008 10:29:17
 */
public class ImportStmt extends KermetaASTNode  {

	public static final String KW_REQUIRE = "require";

	private KermetaTokenNode _require_KW;
	private StringLiteralOrQualifiedID _uri;
	private ExcludeFilter _excludeFilter;
	private IncludeFilter _includeFilter;

	public KermetaTokenNode getRequire_KW() {
		return _require_KW;
	}
	public StringLiteralOrQualifiedID getUri() {
		return _uri;
	}
	public ExcludeFilter getExcludeFilter() {
		return _excludeFilter;
	}
	public IncludeFilter getIncludeFilter() {
		return _includeFilter;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_require_KW != null) count++;
		if (_uri != null) count++;
		if (_excludeFilter != null) count++;
		if (_includeFilter != null) count++;

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
		if ((_excludeFilter != null) && (++count == index)) return _excludeFilter;
		if ((_includeFilter != null) && (++count == index)) return _includeFilter;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new ImportStmt.
	 */
	public ImportStmt(
		TokenInfo require_KW,
		StringLiteralOrQualifiedID uri,
		ExcludeFilter excludeFilter,
		IncludeFilter includeFilter
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
		if (excludeFilter != null) {
			_excludeFilter = excludeFilter;
			if (_excludeFilter._parent != null) throw new RuntimeException();
			_excludeFilter._parent = this;
		}
		if (includeFilter != null) {
			_includeFilter = includeFilter;
			if (_includeFilter._parent != null) throw new RuntimeException();
			_includeFilter._parent = this;
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
