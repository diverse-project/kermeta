package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 13 sept. 2006 18:24:48
 */
public class Prodtype extends Type  {


	private KermetaTokenNode _lsquare;
	private Typelst _typelst;
	private KermetaTokenNode _rsquare;

	public KermetaTokenNode getLsquare() {
		return _lsquare;
	}
	public Typelst getTypelst() {
		return _typelst;
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
		if (_typelst != null) count++;
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
		if ((_typelst != null) && (++count == index)) return _typelst;
		if ((_rsquare != null) && (++count == index)) return _rsquare;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Prodtype.
	 */
	public Prodtype(
		Token lsquare,
		Typelst typelst,
		Token rsquare
	) {
		super();

		if (lsquare != null) {
			_lsquare = new KermetaTokenNode(lsquare);
			if (_lsquare._parent != null) throw new RuntimeException();
			_lsquare._parent = this;
		}
		if (typelst != null) {
			_typelst = typelst;
			if (_typelst._parent != null) throw new RuntimeException();
			_typelst._parent = this;
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
