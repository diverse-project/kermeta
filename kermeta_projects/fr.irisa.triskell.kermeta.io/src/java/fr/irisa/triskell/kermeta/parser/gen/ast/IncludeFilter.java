package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 14 avr. 2008 10:29:17
 */
public class IncludeFilter extends KermetaASTNode  {

	public static final String KW_INCLUDEFILTER = "includeFilter";

	private KermetaTokenNode _includeFilter_KW;
	private KermetaTokenNode _lparen;
	private Filters _filters;
	private KermetaTokenNode _rparen;

	public KermetaTokenNode getIncludeFilter_KW() {
		return _includeFilter_KW;
	}
	public KermetaTokenNode getLparen() {
		return _lparen;
	}
	public Filters getFilters() {
		return _filters;
	}
	public KermetaTokenNode getRparen() {
		return _rparen;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_includeFilter_KW != null) count++;
		if (_lparen != null) count++;
		if (_filters != null) count++;
		if (_rparen != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_includeFilter_KW != null) && (++count == index)) return _includeFilter_KW;
		if ((_lparen != null) && (++count == index)) return _lparen;
		if ((_filters != null) && (++count == index)) return _filters;
		if ((_rparen != null) && (++count == index)) return _rparen;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new IncludeFilter.
	 */
	public IncludeFilter(
		TokenInfo includeFilter_KW,
		TokenInfo lparen,
		Filters filters,
		TokenInfo rparen
	) {
		super();

		if (includeFilter_KW != null) {
			_includeFilter_KW = new KermetaTokenNode(includeFilter_KW);
			if (_includeFilter_KW._parent != null) throw new RuntimeException();
			_includeFilter_KW._parent = this;
		}
		if (lparen != null) {
			_lparen = new KermetaTokenNode(lparen);
			if (_lparen._parent != null) throw new RuntimeException();
			_lparen._parent = this;
		}
		if (filters != null) {
			_filters = filters;
			if (_filters._parent != null) throw new RuntimeException();
			_filters._parent = this;
		}
		if (rparen != null) {
			_rparen = new KermetaTokenNode(rparen);
			if (_rparen._parent != null) throw new RuntimeException();
			_rparen._parent = this;
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
