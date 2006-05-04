package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 4 mai 2006 16:17:25
 */
public class FTypeOrVarLiteral extends FLiteral  {


	private Type _literal;
	private KermetaTokenNode _atpre;

	public Type getLiteral() {
		return _literal;
	}
	public KermetaTokenNode getAtpre() {
		return _atpre;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_literal != null) count++;
		if (_atpre != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_literal != null) && (++count == index)) return _literal;
		if ((_atpre != null) && (++count == index)) return _atpre;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FTypeOrVarLiteral.
	 */
	public FTypeOrVarLiteral(
		Type literal,
		Token atpre
	) {
		super();

		if (literal != null) {
			_literal = literal;
			if (_literal._parent != null) throw new RuntimeException();
			_literal._parent = this;
		}
		if (atpre != null) {
			_atpre = new KermetaTokenNode(atpre);
			if (_atpre._parent != null) throw new RuntimeException();
			_atpre._parent = this;
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
