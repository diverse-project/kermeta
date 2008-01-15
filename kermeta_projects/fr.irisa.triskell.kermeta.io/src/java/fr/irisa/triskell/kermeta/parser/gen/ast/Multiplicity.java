package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 15 janv. 2008 09:12:26
 */
public class Multiplicity extends KermetaASTNode  {


	private KermetaTokenNode _lsquare;
	private MultiplicityExpr _multiplicityExpr;
	private KermetaTokenNode _rsquare;

	public KermetaTokenNode getLsquare() {
		return _lsquare;
	}
	public MultiplicityExpr getMultiplicityExpr() {
		return _multiplicityExpr;
	}
	public KermetaTokenNode getRsquare() {
		return _rsquare;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_lsquare != null) count++;
		if (_multiplicityExpr != null) count++;
		if (_rsquare != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_lsquare != null) && (++count == index)) return _lsquare;
		if ((_multiplicityExpr != null) && (++count == index)) return _multiplicityExpr;
		if ((_rsquare != null) && (++count == index)) return _rsquare;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Multiplicity.
	 */
	public Multiplicity(
		TokenInfo lsquare,
		MultiplicityExpr multiplicityExpr,
		TokenInfo rsquare
	) {
		super();

		if (lsquare != null) {
			_lsquare = new KermetaTokenNode(lsquare);
			if (_lsquare._parent != null) throw new RuntimeException();
			_lsquare._parent = this;
		}
		if (multiplicityExpr != null) {
			_multiplicityExpr = multiplicityExpr;
			if (_multiplicityExpr._parent != null) throw new RuntimeException();
			_multiplicityExpr._parent = this;
		}
		if (rsquare != null) {
			_rsquare = new KermetaTokenNode(rsquare);
			if (_rsquare._parent != null) throw new RuntimeException();
			_rsquare._parent = this;
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
